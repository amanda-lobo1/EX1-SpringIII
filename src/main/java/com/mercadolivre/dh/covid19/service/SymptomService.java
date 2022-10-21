package com.mercadolivre.dh.covid19.service;

import com.mercadolivre.dh.covid19.model.Symptom;
import com.mercadolivre.dh.covid19.repository.SymptomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SymptomService {
    @Autowired
    private SymptomRepository symptomRepository;

    public void save(Symptom symptom){
        symptomRepository.symptomSave(symptom);
    }

    public List<Symptom> findAllSymptom() {

        return symptomRepository.getSymptomList();
    }

    public Optional<Symptom> findBySymptomName(String symptomName){
        return symptomRepository.getSymptomList().stream().filter(
                symptom -> symptom.getSymptomName().equals(symptomName)).findFirst();
    }
}
