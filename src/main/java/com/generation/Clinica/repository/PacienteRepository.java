package com.generation.Clinica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.Clinica.model.EspecialidadeModel;
import com.generation.Clinica.model.PacienteModel;

@Repository
public interface PacienteRepository extends JpaRepository<PacienteModel, Long> {

	public List<PacienteModel> findAllByNomeContainingIgnoreCase(String nome);
	
}
