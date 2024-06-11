package com.tpInstrumentos.Tp_Instrumentos.repository;

import com.tpInstrumentos.Tp_Instrumentos.modelo.PedidoDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPedidoDetalleRepository extends JpaRepository<PedidoDetalle, Long> {
}
