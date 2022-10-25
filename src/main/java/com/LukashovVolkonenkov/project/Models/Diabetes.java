package com.LukashovVolkonenkov.project.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.hateoas.RepresentationModel;

@Getter
@Setter
@ToString
public class Diabetes extends RepresentationModel<Diabetes> {

    private int patientID; //ID пациента
    private int age; //возраст пациента
    private String currentDiabetesType; // тип диабета на данным момент времени
    private String initialDiabetesType; // тип диабета на начальной стадии
    private char gender; // пол
    private boolean heredity; // наследственность болезни
    private boolean insulinTherapy; // наличие инсулинотерапии
    private boolean disability; // наличие инвалидности
    private String complications; // осложнения
    private String yearOfDiagnosis; //год установления диагноза
    private double weight; // вес
    private double height; // рост
    private double BMI; // ИМТ

}
