package Repositories;

import Entity.Doctor;
import Entity.Speciality;
import util.DataStore;
import util.IdGenerator;

import java.util.List;

public class DoctorRepository {
    DataStore<Doctor> doctorDataStore = new DataStore<>();

    public void addDoctor(String name,
                             String email,
                             String phoneNumber,
                             Speciality speciality,
                             double consultationFee){
        Integer person_id = IdGenerator.getCurrentPersonId();
        Doctor doctor = new Doctor(person_id,name,email,phoneNumber,speciality,consultationFee);
        doctorDataStore.add(doctor);
//        return true;
    }

    public List<Doctor> getAll(){
        return doctorDataStore.getAll();
    }

    public Doctor findById(Integer id){
        for (Doctor d : doctorDataStore.getAll()) {
            if (d.getPersonId().equals(id)) {
                return d;
            }
        }
        return null;
    }
}
