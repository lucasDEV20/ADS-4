package com.lucas.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD:ADS-4/DW/projetos/backend/src/main/java/com/lucas/backend/dao/PessoaDao.java
import com.lucas.backend.entidade.Pessoa;

@Repository
public interface PessoaDao extends JpaRepository<Pessoa, Long> {
=======
@Repository // faz a classe se comportar como DAO
public interface PessoaDAO extends JpaRepository<Pessoa, Long>{
>>>>>>> parent of 900b5a2 (aprimorando exercicio Pessoa):ADS-4/DW/backend/src/main/java/com/lucas/backend/PessoaDAO.java

}