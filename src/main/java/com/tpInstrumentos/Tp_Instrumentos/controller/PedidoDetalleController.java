package com.tpInstrumentos.Tp_Instrumentos.controller;

import com.tpInstrumentos.Tp_Instrumentos.modelo.PedidoDetalle;
import com.tpInstrumentos.Tp_Instrumentos.services.PedidoDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/PedidoDetalle")
public class PedidoDetalleController {

    @Autowired
    private PedidoDetalleService pedidoDetalleServ;

    @GetMapping("/traer-lista")
    public List<PedidoDetalle> getPedidoDetalle(){
        return pedidoDetalleServ.traerListaPedidoDetalle();
    }

    @GetMapping("/traer/{id}")
    public PedidoDetalle getPedidoDetalle(@PathVariable long id){
        return pedidoDetalleServ.traerPedidoDetalle(id);
    }

    @PostMapping("/cargar")
    public PedidoDetalle cargarPedidoDetalle(@RequestBody PedidoDetalle pedidoDetalle){
        return pedidoDetalleServ.CargarPedidoDetalle(pedidoDetalle);
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarPedidoDetalle(@PathVariable long id){
        pedidoDetalleServ.borrarPedidoDetalle(id);
    }
    @PutMapping("/modificar")
    public PedidoDetalle modificarPedidoDetalle(@RequestBody PedidoDetalle pedidoDetalle){
        return pedidoDetalleServ.modificarPedidoDetalle(pedidoDetalle);
    }



}
