package com.mercadolivre.dh.covid19.dto;

import com.mercadolivre.dh.covid19.model.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
    private String personName;
    private String personLastname;

    public static PersonDTO convertToDTO (Person person){
        return new PersonDTO(person.getPersonName(), person.getPersonLastname());
    }

    public static List<PersonDTO> convertListToDTO (List<Person> personList){
        return personList.stream()
                .map(person -> new PersonDTO(person.getPersonName(), person.getPersonLastname()))
                .collect(Collectors.toList());
    }
}
