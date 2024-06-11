package com.tpInstrumentos.Tp_Instrumentos.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tpInstrumentos.Tp_Instrumentos.modelo.Categoria;
import com.tpInstrumentos.Tp_Instrumentos.repository.ICategoriaRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.tpInstrumentos.Tp_Instrumentos.repository.IInstumentoRepository;

import java.io.IOException;
import java.util.List;


@Component
public class DataInitializer {

    @Autowired
    private ICategoriaRepository categoriaRepos;
    @Autowired
    private IInstumentoRepository instrumentoRepos;

    @PostConstruct
    public void init() {

        if (categoriaRepos.count() == 0) {

            Categoria cat1 = new Categoria();
            cat1.setId(1);
            cat1.setCodigo(100);
            cat1.setDenominacion("Cuerdas");

            Categoria cat2 = new Categoria();
            cat2.setId(2);
            cat2.setCodigo(200);
            cat2.setDenominacion("Vientos");

            Categoria cat3 = new Categoria();
            cat3.setId(3);
            cat3.setCodigo(300);
            cat3.setDenominacion("Percusion");

            Categoria cat4 = new Categoria();
            cat4.setId(4);
            cat4.setCodigo(400);
            cat4.setDenominacion("Teclado");

            Categoria cat5 = new Categoria();
            cat5.setId(5);
            cat5.setCodigo(500);
            cat5.setDenominacion("Electronico");

            categoriaRepos.save(cat1);
            categoriaRepos.save(cat2);
            categoriaRepos.save(cat3);
            categoriaRepos.save(cat4);
            categoriaRepos.save(cat5);

        }

    }
}