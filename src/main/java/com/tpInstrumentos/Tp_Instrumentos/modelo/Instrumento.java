package com.tpInstrumentos.Tp_Instrumentos.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Instrumento extends EntityId {
    @Column(length = 2000)
    private String instrumento;
    private String marca;
    private String modelo;
    @Column (length = 10000)
    private String imagen;
    private double precio;
    private String costoEnvio;
    private long cantidadVendida;
    @Column (length = 2000)
    private String descripcion;

}
