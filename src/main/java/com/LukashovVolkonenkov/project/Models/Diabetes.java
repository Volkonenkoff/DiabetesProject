package com.LukashovVolkonenkov.project.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Diabetes {

    private int patientID;
    private int age;
    private String currentDiabetesType;
    private String initialDiabetesType;
    private char gender;
    private boolean heredity;
    private boolean insulinTherapy;
    private boolean disability;
    private String complications;
    private String yearOfDiagnosis;
    private double weight;
    private double height;
    private double BMI;

}
