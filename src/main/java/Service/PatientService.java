package Service;

import Entity.Patient;
import Repositories.PatientRepository;

import java.time.LocalDate;

public class PatientService {

    public static void createNewPatient(String name,
                                        String email,
                                        String phone,
                                        LocalDate dob) {

        PatientRepository.addPatient(name, email, phone, dob);

        System.out.println("Patient created successfully.");
    }

    public static void searchPatientById(String patient_id){
        Patient patient = PatientRepository.findById(patient_id);
        if (patient == null){
            System.out.println("Invalid Patient ID!");
            return;
        }

        patient.toString();
    }






}
