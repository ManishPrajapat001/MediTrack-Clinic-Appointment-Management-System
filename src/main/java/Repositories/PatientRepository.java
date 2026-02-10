package Repositories;

import Entity.Patient;
import util.DataStore;
import util.IdGenerator;

import java.time.LocalDate;
import java.util.List;

public class PatientRepository {
    private final DataStore<Patient> patientDataStore = new DataStore<>();

    public void addPatient(String name,
                              String email,
                              String phoneNumber,
                              LocalDate dob){
        Integer person_id = IdGenerator.getCurrentPersonId();
        Patient patient = new Patient(person_id,name,email,phoneNumber,dob);
        patientDataStore.add(patient);
    }

    public List<Patient> getAll(){
        return patientDataStore.getAll();
    }

    public Patient findById(Integer id){
        for (Patient d : patientDataStore.getAll()) {
            if (d.getPersonId().equals(id)) {
                return d;
            }
        }
        return null;
    }

//    public boolean updateName(Integer id,String name){
//
//    }
}
