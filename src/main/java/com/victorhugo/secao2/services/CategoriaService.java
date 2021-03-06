package com.victorhugo.secao2.services;

import java.util.Optional;

import com.victorhugo.secao2.domain.Categoria;
import com.victorhugo.secao2.repositories.CategoriaRepository;
import com.victorhugo.secao2.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id) {

        // Forma Utilizada para Spring Boot versão 2.x.x
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
            "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName())
        );

        // Forma utilizada para Spring Boot versões anteriores
        // Categoria obj = repo.findOne(id);
        // return
    }
}
