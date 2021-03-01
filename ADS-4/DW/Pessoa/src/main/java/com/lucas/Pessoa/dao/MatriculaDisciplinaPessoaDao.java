package com.lucas.Pessoa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.Pessoa.entidade.MatriculaDisciplinaPessoa;

public interface MatriculaDisciplinaPessoaDao extends JpaRepository<MatriculaDisciplinaPessoa, Long> {

}