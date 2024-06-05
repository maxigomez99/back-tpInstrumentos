package com.tpInstrumentos.Tp_Instrumentos.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Categoria extends EntityId {
    private String denominacion;
    @Column(unique = true)
    private long codigo;
}

