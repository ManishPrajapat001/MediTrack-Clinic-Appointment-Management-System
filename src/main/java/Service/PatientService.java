package Service;

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

    }

    public static void generateBill(String appointment_id){

    }

    public static void payBill(String bill_id){

    }




}
