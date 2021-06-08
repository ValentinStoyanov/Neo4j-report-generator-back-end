package com.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.model.HistoricoPosiciones;

public interface HistoricoPosicionesRepository extends Neo4jRepository<HistoricoPosiciones,Long>{

}
