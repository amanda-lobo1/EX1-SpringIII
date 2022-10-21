package com.mercadolivre.dh.covid19.service;

import com.mercadolivre.dh.covid19.model.Person;
import com.mercadolivre.dh.covid19.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public void save (Person person){
        personRepository.personSave(person);
    }

    public List<Person> findAllPerson(){
        return personRepository.getPersonList();
    }

    public List<Person> getPersonsRisk (){
       return personRepository.getPersonList().stream()
                .filter(person -> person.getYears() >= 60)
                .collect(Collectors.toList());
    }
}
