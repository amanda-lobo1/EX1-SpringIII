package com.mercadolivre.dh.covid19.controller;

import com.mercadolivre.dh.covid19.dto.PersonDTO;
import com.mercadolivre.dh.covid19.model.Person;
import com.mercadolivre.dh.covid19.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity<Person> savePerson (@RequestBody Person person){
        personService.save(person);
        return new ResponseEntity(person, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Person> getAll(){
        return new ResponseEntity(personService.findAllPerson(), HttpStatus.OK);
    }

    @GetMapping("/findRiskPerson")
    public ResponseEntity<List<PersonDTO>> getPersonsRisk(){
        return new ResponseEntity(PersonDTO.convertListToDTO(personService.getPersonsRisk()), HttpStatus.OK);
    }
}
