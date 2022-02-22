package com._2ibi.desafio.service.Impl;

import java.util.List;

import com._2ibi.desafio.exception.ResourceNotFoundException;
import com._2ibi.desafio.model.Pais;
import com._2ibi.desafio.repository.PaisRepository;
import com._2ibi.desafio.service.PaisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PaisServiceImpl implements PaisService{

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public Pais savePais(Pais pais){
        return paisRepository.save(pais);
    }

    @Override
    public List<Pais> getAllPaises(String property, String direction){
        if(property != null && !property.isEmpty() && direction != null && !direction.isEmpty()){
            Sort.Direction sort = direction.equalsIgnoreCase("desc")? Sort.Direction.DESC:Sort.Direction.ASC; 
            return paisRepository.findAll(Sort.by(sort, property));
        }
        return paisRepository.findAll();
    }

    @Override
    public Pais getPaisById(long id){
        return paisRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Pais", "Id", id));
    }

    @Override
    public Pais updatePais(Pais newPais, long id){
        return paisRepository.findById(id)
                            .map(pais -> {
                                pais.setNome(newPais.getNome());
                                pais.setCapital(newPais.getCapital());
                                pais.setRegiao(newPais.getRegiao());
                                pais.setSubRegiao(newPais.getSubRegiao());
                                pais.setArea(newPais.getArea());

                                return paisRepository.save(pais);
                            }).orElseThrow(() -> new ResourceNotFoundException("Pais", "Id", id));
    }

    @Override
    public void deletePais(long id) {
        paisRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Pais", "Id", id));
        paisRepository.deleteById(id);
    }
}
