package com.lucas.Pessoa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.Pessoa.entidade.Disciplina;

public interface DisciplinaDao extends JpaRepository<Disciplina, Long> {

}