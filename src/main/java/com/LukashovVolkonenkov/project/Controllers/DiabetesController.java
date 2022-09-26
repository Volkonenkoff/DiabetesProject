package com.LukashovVolkonenkov.project.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RequestMapping(value = "diabetes/r")
public class DiabetesController {

    //@GetMapping(value = "/patient/{patientID}")
    @GetMapping(value = "/test")
    public ResponseEntity<String> getDiabetes(){
        return new ResponseEntity<>("tyytyty", HttpStatus.OK);
    }
}
