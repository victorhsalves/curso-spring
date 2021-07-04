package com.victorhugo.secao2.repositories;

import com.victorhugo.secao2.domain.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Integer > {
    
}
