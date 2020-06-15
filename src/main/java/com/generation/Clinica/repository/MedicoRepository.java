package com.generation.Clinica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.Clinica.model.EspecialidadeModel;
import com.generation.Clinica.model.MedicoModel;

@Repository
public interface MedicoRepository extends JpaRepository<MedicoModel, String>{

	public List<MedicoModel> findAllByNomeContainingIgnoreCase(String nome);
}
