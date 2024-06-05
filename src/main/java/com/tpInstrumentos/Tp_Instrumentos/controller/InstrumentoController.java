package com.tpInstrumentos.Tp_Instrumentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.tpInstrumentos.Tp_Instrumentos.services.InstrumentoService;
import com.tpInstrumentos.Tp_Instrumentos.modelo.Instrumento;
import java.util.List;

@RestController
@RequestMapping("/Instrumento")
public class InstrumentoController {
    @Autowired
    private InstrumentoService instruServ;

    @GetMapping("/traer-lista")
    public List<Instrumento> getInstrumento(){
        return  instruServ.getInstrumento();
    }
    @GetMapping("/traer/{id}")
    public Instrumento getInstrumento(@PathVariable long id){
        return instruServ.obtenerInstrumento(id);
    }

}
