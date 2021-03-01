package com.lucas.Pessoa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.Pessoa.entidade.Curso;


public interface CursoDao extends JpaRepository<Curso, Long> {

}