package com.mercadolivre.dh.covid19.model;

import lombok.Data;

@Data
public class Person {
    private int personId;
    private String personName;
    private String personLastname;
    private int years;
}
