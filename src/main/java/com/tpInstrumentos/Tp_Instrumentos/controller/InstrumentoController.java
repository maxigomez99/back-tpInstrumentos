package com.tpInstrumentos.Tp_Instrumentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.tpInstrumentos.Tp_Instrumentos.services.InstrumentoService;
@RestController
@RequestMapping("/Instrumento")
public class InstrumentoController {
    @Autowired
    private InstrumentoService instruServ;

}
