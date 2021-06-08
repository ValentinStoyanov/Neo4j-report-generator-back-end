package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@ComponentScan("com.controller")
@EnableNeo4jRepositories("com.repository")
public class Neo4jReportGeneratorBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(Neo4jReportGeneratorBackEndApplication.class, args);
	}

}
