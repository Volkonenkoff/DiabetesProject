package Services;

import Models.Diabetes;
import org.springframework.stereotype.Service;

@Service
public class DiabetesService {

    public void createDiabetes(int patientId, int age, String currentDiabetesType, String initialDiabetesType,
                                   char gender, boolean heredity, boolean insulinTherapy, boolean disability,
                                   String complications, String yearOfDiagnosis, double weight, double height, double BMI)
    {
    }
}
