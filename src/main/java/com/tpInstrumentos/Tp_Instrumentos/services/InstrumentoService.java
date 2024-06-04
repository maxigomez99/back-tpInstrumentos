package com.tpInstrumentos.Tp_Instrumentos.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tpInstrumentos.Tp_Instrumentos.repository.IInstumentoRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tpInstrumentos.Tp_Instrumentos.modelo.Instrumento;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class InstrumentoService {

    @Autowired
    private IInstumentoRepository instruRepos;
    public List<Instrumento> getInstrumento(){
        List<Instrumento> listaInstrumento = instruRepos.findAll();
        return listaInstrumento;
    }

    public Instrumento obtenerInstrumento(long id){
        return instruRepos.findById(id);
    }

    @PostConstruct
    public void cargarInstrumentosDesdeJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Lee el archivo JSON y convierte sus datos en una lista de objetos Instrumento
            Instrumento[] instrumentos = objectMapper.readValue(new File("instrumentos.json"), Instrumento[].class);
            // Guarda los instrumentos en la base de datos
            instruRepos.saveAll(Arrays.asList(instrumentos));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
