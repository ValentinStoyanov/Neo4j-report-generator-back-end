package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.driver.Driver;
import org.neo4j.driver.Record;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Report1Result;
import com.repository.HistoricoPosicionesRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
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
	
	
	@GetMapping(path = "report1") 
	public List<Report1Result> report1() {

		//Porcentaje de posiciones incorrectas por ecu en el ultimo trimestre longitud 1000
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
			
			List<Report1Result> finalList = new ArrayList<Report1Result>();
			
			String ecu = "";
			String percentage = "";
			
			for( Record record: myRecords){
				
			   ecu = record.get("ecu").toString();
			   percentage = record.get("percetage").toString();
			   finalList.add(new Report1Result(ecu,percentage));
			}
			
			return  finalList;
		}
	}
	
	@GetMapping(path = "report2") 
	public List<Report1Result> report2() {
	
	//Porcentaje medio de combustible cada vehiculo
	Result res;
		
		try (Session session = driver.session()) { 
			res = session.run("MATCH(x:HistoricoPosiciones) WHERE x.nivelFuel1 IS NOT NULL \r\n"
					+ "RETURN x.ecu AS ecu, AVG(x.nivelFuel1) AS percentage\r\n"
					+ "ORDER BY x.ecu");
			
			String ecu = "";
			String percentage = "";
			
			List<Record> myRecords = res.list();
			
			List<Report1Result> finalList = new ArrayList<Report1Result>();
			
			int iter = 0;
			String [][] myArray = new String[myRecords.size()][2];
			for( Record record: myRecords){
			   ecu = record.get("ecu").toString();
			   percentage = record.get("percentage").toString();
			   finalList.add(new Report1Result(ecu,percentage));
			   
			}
			return finalList;
		}
	}
	
}
