package com.victorhugo.secao2.repositories;

import com.victorhugo.secao2.domain.Endereco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository <Endereco, Integer > {
    
}
