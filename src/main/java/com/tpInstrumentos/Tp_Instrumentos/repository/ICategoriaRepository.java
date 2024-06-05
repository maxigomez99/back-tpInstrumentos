package com.tpInstrumentos.Tp_Instrumentos.repository;

import com.tpInstrumentos.Tp_Instrumentos.modelo.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria, Long> {
    Categoria findByCodigo(long codigo);
}
