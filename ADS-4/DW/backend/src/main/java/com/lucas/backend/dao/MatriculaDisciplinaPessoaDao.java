package com.lucas.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.backend.entidade.MatriculaDisciplinaPessoa;

public interface MatriculaDisciplinaPessoaDao extends JpaRepository<MatriculaDisciplinaPessoa, Long> {

}