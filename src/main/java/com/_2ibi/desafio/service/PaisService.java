package com._2ibi.desafio.service;

import java.util.List;

import com._2ibi.desafio.model.Pais;

public interface PaisService {
    Pais savePais(Pais pais);
    List<Pais> getAllPaises(String property, String direction);
    Pais getPaisById(long id);
    Pais updatePais(Pais pais, long id);
    void deletePais(long id);
}
