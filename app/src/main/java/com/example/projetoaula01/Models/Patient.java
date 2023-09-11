package com.example.projetoaula01.Models;

import com.example.projetoaula01.Enums.EGender;

import java.io.Serializable;

public class Patient implements Serializable {

    private String name, adress, obs;
    private boolean isSmoker, isDiabetic, isHypertensive;
    private EGender gender;
}
