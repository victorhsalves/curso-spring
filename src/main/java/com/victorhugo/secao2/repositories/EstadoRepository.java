package com.victorhugo.secao2.repositories;

import com.victorhugo.secao2.domain.Estado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository <Estado, Integer > {
    
}
