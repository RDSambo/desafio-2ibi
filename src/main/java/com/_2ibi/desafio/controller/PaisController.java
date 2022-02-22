package com._2ibi.desafio.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import com._2ibi.desafio.model.Pais;
import com._2ibi.desafio.service.PaisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/paises")
public class PaisController {

    @Autowired
    private PaisService paisService;

    // criar novo pais
    @PostMapping()
    public ResponseEntity<Pais> savePais(@RequestBody Pais pais){
        return new ResponseEntity<Pais>(paisService.savePais(pais), HttpStatus.CREATED);
    }

    // devolve listar todos paises
    @GetMapping()
    public List<Pais> getAllPaises(@PathParam("property") String property, @PathParam("direction") String direction){
        return paisService.getAllPaises(property, direction);
    }

    // devolve um pais pelo identificador (para auxiliar modificacao)
    @GetMapping("/{id}")
    public ResponseEntity<Pais> getPaisById(@PathVariable("id") long paisId){
        return new ResponseEntity<Pais>(paisService.getPaisById(paisId), HttpStatus.OK);
    }

    // modifica pais
    @PutMapping("/{id}")
    public ResponseEntity<Pais> updatePais(@RequestBody Pais pais, @PathVariable("id") long paisId) {
        return new ResponseEntity<Pais>(paisService.updatePais(pais, paisId), HttpStatus.OK);
    }

    // eleminar pais
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePais(@PathVariable("id") long paisId) {
        paisService.deletePais(paisId);
        return new ResponseEntity<String>("Pais eliminado com sucesso!.", HttpStatus.OK);
    }
}
