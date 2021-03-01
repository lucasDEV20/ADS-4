package com.lucas.Pessoa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.Pessoa.entidade.Turma;


public interface TurmaDao extends JpaRepository<Turma, Long> {

}