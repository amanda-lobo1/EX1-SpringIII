package com.mercadolivre.dh.covid19.dto;

import com.mercadolivre.dh.covid19.model.Symptom;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SymptomDTO {
    private String symptomName;
    private String severityLevel;

    public static SymptomDTO convertToDTO (Symptom symptom){
        return new SymptomDTO(symptom.getSymptomName(), symptom.getSeverityLevel());
    }
}
