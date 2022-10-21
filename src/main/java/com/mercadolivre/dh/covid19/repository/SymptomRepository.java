package com.mercadolivre.dh.covid19.repository;

import com.mercadolivre.dh.covid19.model.Symptom;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Data
@AllArgsConstructor
public class SymptomRepository {
    private List<Symptom> symptomList;

    public void symptomSave(Symptom symptom){

        this.symptomList.add(symptom);
    }
}
