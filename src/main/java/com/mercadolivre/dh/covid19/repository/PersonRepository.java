package com.mercadolivre.dh.covid19.repository;

import com.mercadolivre.dh.covid19.model.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Data
@AllArgsConstructor
public class PersonRepository {
    private List<Person> personList;

    public void personSave(Person person) {
        this.personList.add(person);
    }
}
