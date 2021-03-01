package com.lucas.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.backend.entidade.Pessoa;

@Repository
public interface PessoaDao extends JpaRepository<Pessoa, Long> {

}