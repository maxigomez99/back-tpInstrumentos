package com.tpInstrumentos.Tp_Instrumentos.services;

import com.tpInstrumentos.Tp_Instrumentos.modelo.Categoria;
import com.tpInstrumentos.Tp_Instrumentos.repository.ICategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private ICategoriaRepository categoriaRepository;

    public List<Categoria> getListaCategoria(){
        List<Categoria> listaCategoria = categoriaRepository.findAll();
        return listaCategoria;
    }

    public Categoria obtenerCategoria(long id){
        return categoriaRepository.findById(id).orElse(null);
    }

    public Categoria cargarCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }
    public Categoria obtenerCategoriaCodigo(long codigo){
        return categoriaRepository.findByCodigo(codigo);
    }

}
