package com.victorhugo.secao2.services;

import java.util.Optional;

import com.victorhugo.secao2.domain.Categoria;
import com.victorhugo.secao2.repositories.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id) {

        Optional<Categoria> obj = repo.findById(id);
        return obj.orElse(null);
        
    }
}
