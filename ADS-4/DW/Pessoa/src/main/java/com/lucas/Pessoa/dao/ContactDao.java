package com.lucas.Pessoa.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.Pessoa.entidade.Contact;

@Repository
public interface ContactDao extends JpaRepository<Contact, Integer>{

}

