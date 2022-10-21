package com.mercadolivre.dh.covid19.controller;

import com.mercadolivre.dh.covid19.dto.SymptomDTO;
import com.mercadolivre.dh.covid19.exception.BadRequestException;
import com.mercadolivre.dh.covid19.model.Symptom;
import com.mercadolivre.dh.covid19.service.SymptomService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/findSymptom")
public class SymptomController {

    @Autowired
    SymptomService symptomService;

    @PostMapping
    public ResponseEntity<Symptom> saveSymptom (@RequestBody Symptom symptom){
        symptomService.save(symptom);
        return new ResponseEntity<>(symptom, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Symptom> getAll (){
        return new ResponseEntity(symptomService.findAllSymptom(), HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<SymptomDTO> findBySymptomName (@PathVariable String name) throws BadRequestException {
       Optional<Symptom> symptom = symptomService.findBySymptomName(name);

       if (symptom.isPresent()) {
           return new ResponseEntity(SymptomDTO.convertToDTO(symptom.get()), HttpStatus.ACCEPTED);
       } else {
           return new ResponseEntity("Sintoma não encontrado!", HttpStatus.BAD_REQUEST);
       }
    }
}
