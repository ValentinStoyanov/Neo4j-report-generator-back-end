package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.driver.Driver;
import org.neo4j.driver.Record;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.MedidaEscalar;
import com.model.Report2Result;
import com.repository.MedidaEscalarRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
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
	
	
	@GetMapping(path = "report1") 
	public List<Report2Result> report1() {
		
		//Distancia media recorrida por vehiculo cada mes
		Result res;
		
		try (Session session = driver.session()) { 
			
			res = session.run("MATCH(m:MedidaEscalar) \r\n"
					+ "WHERE m.distanciaRecorridaSesion IS NOT NULL AND m.distanciaRecorridaSesion>1 AND m.distanciaInicial>1 \r\n"
					+ "RETURN m.ecu AS ecu, AVG(m.distanciaRecorridaSesion+m.distanciaInicial) AS average, apoc.date.format(m.fechaECU, 'ms', 'yyyy/MM') AS fechaconv\r\n"
					+ "ORDER BY m.ecu, fechaconv");
			
			String ecu = "";
			String average = "";
			String fechaconv = "";
			
			List<Record> myRecords = res.list();
			List<Report2Result> finalList = new ArrayList<Report2Result>();
			
			

			for( Record record: myRecords){
			   ecu = record.get("ecu").toString();
			   average = record.get("average").toString();
			   fechaconv = record.get("fechaconv").toString();
			   finalList.add(new Report2Result(ecu,average,fechaconv));
			}
			
			return  finalList;
		}
	}
	
	@GetMapping(path = "report2") 
	public List<Report2Result> report2() {
		
	//	Consumo medio mensual a los 100 
	Result res;
		
		try (Session session = driver.session()) { 
			res = session.run("MATCH(m:MedidaEscalar)\r\n"
					+ "WHERE m.consumoCombustibleSesion>1 AND m.consumoCombustibleInicial>1\r\n"
					+ "RETURN m.ecu AS ecu,AVG(m.consumoCombustibleSesion + m.consumoCombustibleInicial) AS average, apoc.date.format(m.fechaECU, 'ms', 'yyyy/MM') AS fechaconv\r\n"
					+ "ORDER BY m.ecu, fechaconv");
			
			String ecu = "";
			String average = "";
			String fechaconv = "";
			
			List<Record> myRecords = res.list();
			List<Report2Result> finalList = new ArrayList<Report2Result>();		
	
			for( Record record: myRecords){
				ecu = record.get("ecu").toString();
				average = record.get("average").toString();
				fechaconv = record.get("fechaconv").toString();
				 finalList.add(new Report2Result(ecu,average,fechaconv));
			 
			}
			return finalList;
		}
	}
	
}


