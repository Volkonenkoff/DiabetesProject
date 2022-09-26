package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("diabetes")
public class DiabetesController {

    @GetMapping("/patient/{patientID}")
    public Diabetes getDiabetes(){

    }
}
