package com.victorhugo.secao2.repositories;

import com.victorhugo.secao2.domain.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Integer > {
    
}
