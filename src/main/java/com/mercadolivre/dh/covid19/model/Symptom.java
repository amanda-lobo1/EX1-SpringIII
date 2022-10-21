package com.mercadolivre.dh.covid19.model;

import lombok.Data;

@Data
public class Symptom {
    private String symptomCode;
    private String symptomName;
    private String severityLevel;

}
