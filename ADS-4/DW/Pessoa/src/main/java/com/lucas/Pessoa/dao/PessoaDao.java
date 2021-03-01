package com.lucas.Pessoa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.Pessoa.entidade.Pessoa;



@Repository
public interface PessoaDao extends JpaRepository<Pessoa, Long> {

}
