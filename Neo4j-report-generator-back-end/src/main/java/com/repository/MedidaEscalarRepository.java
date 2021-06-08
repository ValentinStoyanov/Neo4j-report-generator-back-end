package com.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.model.MedidaEscalar;

public interface MedidaEscalarRepository extends Neo4jRepository<MedidaEscalar,Long>{

}
