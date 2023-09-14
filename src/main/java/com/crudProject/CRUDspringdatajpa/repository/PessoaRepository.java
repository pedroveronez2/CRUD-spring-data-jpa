package com.crudProject.CRUDspringdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudProject.CRUDspringdatajpa.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
