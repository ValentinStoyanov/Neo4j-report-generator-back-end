package com.controller;

import java.util.List;

import org.neo4j.driver.Driver;
import org.neo4j.driver.Record;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.MedidaEscalar;
import com.repository.MedidaEscalarRepository;

@RestController
@RequestMapping("MedidaEscalar")
public class MedidaEscalarController {
	
	@Autowired
	private MedidaEscalarRepository repo;
	
	
	private final Driver driver ; 

	
	public MedidaEscalarController(Driver driver) { 
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
			
			res = session.run("MATCH(m:MedidaEscalar) \r\n"
					+ "WHERE m.distanciaRecorridaSesion IS NOT NULL AND m.distanciaRecorridaSesion>1 AND m.distanciaInicial>1 \r\n"
					+ "RETURN m.ecu AS ecu, AVG(m.distanciaRecorridaSesion+m.distanciaInicial) AS average, apoc.date.format(m.fechaECU, 'ms', 'yyyy/MM') AS fechaconv\r\n"
					+ "ORDER BY m.ecu, fechaconv");
			
			
			List<Record> myRecords = res.list();
			
			int iter = 0;
			String [][] myArray = new String[myRecords.size()][3];
			for( Record record: myRecords){
			   myArray[iter][0] = record.get("ecu").toString();
			   myArray[iter][1] = record.get("average").toString();
			   myArray[iter][2] = record.get("fechaconv").toString();
			   iter++;
			}
			
			return  myArray;
		}
	}
	
	@PostMapping(path = "report2") 
	public String[][] report2() {
		
	Result res;
		
		try (Session session = driver.session()) { 
			res = session.run("MATCH(m:MedidaEscalar)\r\n"
					+ "WHERE m.consumoCombustibleSesion>1 AND m.consumoCombustibleInicial>1\r\n"
					+ "RETURN m.ecu AS ecu,AVG(m.consumoCombustibleSesion + m.consumoCombustibleInicial) AS average, apoc.date.format(m.fechaECU, 'ms', 'yyyy/MM') AS fechaconv\r\n"
					+ "ORDER BY m.ecu, fechaconv");
			
			
			List<Record> myRecords = res.list();
			
			int iter = 0;
			String [][] myArray = new String[myRecords.size()][3];
			for( Record record: myRecords){
			   myArray[iter][0] = record.get("ecu").toString();
			   myArray[iter][1] = record.get("average").toString();
			   myArray[iter][2] = record.get("fechaconv").toString();
			   iter++;
			}
			return myArray;
		}
	}
	
}


