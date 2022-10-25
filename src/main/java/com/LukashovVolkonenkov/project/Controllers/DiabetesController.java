package com.LukashovVolkonenkov.project.Controllers;

import com.LukashovVolkonenkov.project.Models.Diabetes;
import com.LukashovVolkonenkov.project.Services.DiabetesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("diabetes/patient")
public class DiabetesController {

    @Autowired
    private DiabetesService diabetesService;

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/{patientID}")
    public ResponseEntity<Diabetes> getDiabetes(
        @PathVariable("patientID") int patientID,
        @RequestHeader(value="Accept-Language", required = false) Locale locale) {
        Diabetes diabetes = diabetesService.getDiabetes(patientID);
        diabetes.add(linkTo(methodOn(DiabetesController.class)
                        .getDiabetes(patientID, locale))
                        .withSelfRel(),
                linkTo(methodOn(DiabetesController.class)
                        .createDiabetes(diabetes, locale))
                        .withRel(messageSource.getMessage("diabetes.create.link",null,locale)),
                linkTo(methodOn(DiabetesController.class)
                        .updateDiabetes(diabetes, locale))
                        .withRel(messageSource.getMessage("diabetes.update.link",null,locale)),
                linkTo(methodOn(DiabetesController.class)
                        .deleteDiabetes(diabetes.getPatientID(),locale))
                        .withRel(messageSource.getMessage("diabetes.delete.link",null,locale)));
        return ResponseEntity.ok(diabetes);
    }

    @PostMapping
    public ResponseEntity<String> createDiabetes(
            @RequestBody Diabetes request,
            @RequestHeader(value="Accept-Language", required = false) Locale locale) {
        return ResponseEntity.ok(diabetesService.createDiabetes(request, locale));
    }

    @PutMapping
    public ResponseEntity<String> updateDiabetes(
            @RequestBody Diabetes request,
            @RequestHeader(value="Accept-Language", required = false) Locale locale) {
        return ResponseEntity.ok(diabetesService.updateDiabetes(request, locale));
    }

    @DeleteMapping("/{patientID}")
    public ResponseEntity<String> deleteDiabetes(
            @PathVariable("patientID") int patientID,
            @RequestHeader(value="Accept-Language", required = false) Locale locale) {
        return ResponseEntity.ok(diabetesService.deleteDiabetes(patientID, locale));
    }

}
