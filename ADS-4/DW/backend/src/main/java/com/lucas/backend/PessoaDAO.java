package com.lucas.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // faz a classe se comportar como DAO
public interface PessoaDAO extends JpaRepository<Pessoa, Long>{

}
