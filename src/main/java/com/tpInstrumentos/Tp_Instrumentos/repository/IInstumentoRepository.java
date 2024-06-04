package com.tpInstrumentos.Tp_Instrumentos.repository;

import com.tpInstrumentos.Tp_Instrumentos.modelo.Instrumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInstumentoRepository extends JpaRepository<Instrumento,Long> {
    Instrumento findById(long id);
}
