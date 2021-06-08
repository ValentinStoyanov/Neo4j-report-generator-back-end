package com.controller;

import java.util.List;

import org.neo4j.driver.Driver;
import org.neo4j.driver.Record;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repository.HistoricoPosicionesRepository;

@RestController
@RequestMapping("HistoricoPosiciones")
public class HistoricoPosicionesController {

	@Autowired
	private HistoricoPosicionesRepository repo;
	
	
private final Driver driver ; 

	
	public HistoricoPosicionesController(Driver driver) { 
		this.driver = driver;
	}
	
	
	@GetMapping(value="countAll")
    public long countall(){
        
        return this.repo.count();
    }
	
	
	@PostMapping(path = "report1") 
	public String[][] report1() {

		Result res;
		
		try (Session session = driver.session()) { 
			
			res = session.run("MATCH(s:HistoricoPosiciones) \r\n"
					+ "WHERE s.longitud=1000 \r\n"
					+ "WITH COUNT(s.longitud) AS s  \r\n"
					+ "MATCH(p:HistoricoPosiciones)\r\n"
					+ "WHERE p.longitud=1000\r\n"
					+ "RETURN p.ecu AS ecu,(((COUNT(p.longitud))*1.0)/s)*100.0 AS percetage\r\n"
					+ "ORDER BY p.ecu ");
			
			
			List<Record> myRecords = res.list();
			
			int iter = 0;
			String [][] myArray = new String[myRecords.size()][2];
			for( Record record: myRecords){
			   myArray[iter][0] = record.get("ecu").toString();
			   myArray[iter][1] = record.get("percetage").toString();
			   iter++;
			}
			
			return  myArray;
		}
	}
	
	@PostMapping(path = "report2") 
	public String[][] report2() {
		
	Result res;
		
		try (Session session = driver.session()) { 
			res = session.run("MATCH(x:HistoricoPosiciones) WHERE x.nivelFuel1 IS NOT NULL \r\n"
					+ "RETURN x.ecu AS ecu, AVG(x.nivelFuel1) AS percentage\r\n"
					+ "ORDER BY x.ecu");
			
			
			List<Record> myRecords = res.list();
			
			int iter = 0;
			String [][] myArray = new String[myRecords.size()][2];
			for( Record record: myRecords){
			   myArray[iter][0] = record.get("ecu").toString();
			   myArray[iter][1] = record.get("percentage").toString();
			   iter++;
			}
			return myArray;
		}
	}
	
}
