package com.generation.Clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.Clinica.model.FichaModel;

@Repository
public interface FichaRepository extends JpaRepository<FichaModel, Long>{

}
