package com.LukashovVolkonenkov.project.Services;

import com.LukashovVolkonenkov.project.Models.Diabetes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Random;

@Service
public class DiabetesService {

    @Autowired
    MessageSource messages;

    public String createDiabetes(Diabetes diabetes, Locale locale)
    {
        String responseMessage = null;
        if (diabetes != null) {
            responseMessage = String.format(messages.getMessage("diabetes.create.message", null, locale),
                    diabetes.toString());
        }
        return responseMessage;
    }

    public Diabetes getDiabetes(int patientID){
        Diabetes diabetes = new Diabetes();
        diabetes.setPatientID(patientID);
        diabetes.setAge(new Random().nextInt(65));
        diabetes.setInitialDiabetesType("I type");
        diabetes.setCurrentDiabetesType("II type");
        diabetes.setGender('-');
        diabetes.setHeredity(false);
        diabetes.setDisability(false);
        diabetes.setInsulinTherapy(false);
        diabetes.setComplications("");
        diabetes.setYearOfDiagnosis("2022");
        diabetes.setWeight(60.5);
        diabetes.setHeight(177.2);
        diabetes.setBMI(177.2 / 60.5);

        return diabetes;
    }

    public String updateDiabetes(Diabetes diabetes, Locale locale){
        diabetes.setGender('M');
        diabetes.setInsulinTherapy(true);
        String responseMessage = null;
        if (diabetes != null)
            responseMessage = String.format(messages.getMessage("diabetes.update.message",null, locale),
                    diabetes.toString());
        return responseMessage;
    }

    public String deleteDiabetes(int patientID, Locale locale){
        String responseMessage = String.format(messages.getMessage("diabetes.delete.message",null, locale),
                patientID);
        return responseMessage;
    }

}

