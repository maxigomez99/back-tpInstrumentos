package com.tpInstrumentos.Tp_Instrumentos.controller;

import com.tpInstrumentos.Tp_Instrumentos.modelo.Pedido;
import com.tpInstrumentos.Tp_Instrumentos.modelo.PreferenceMP;
import com.tpInstrumentos.Tp_Instrumentos.services.MercadoPagoService;
import com.tpInstrumentos.Tp_Instrumentos.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/MercadoPago")
public class MercadoPagoController {
    @Autowired
    private MercadoPagoService mercadoPagoService;
    @Autowired
    private PedidoService pedidoService;

    @PostMapping("/crear_preference_mp")
    public PreferenceMP crearPreferenceMP(@RequestBody Pedido pedido) {
        try {
            PreferenceMP preferenceMP = mercadoPagoService.getPreferenciaIdMercadoPago(pedido);

            return preferenceMP;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
