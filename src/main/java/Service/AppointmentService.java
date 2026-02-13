package Service;

import Entity.Appointment;
import Entity.Doctor;
import Entity.Patient;
import Repositories.AppointmentRepository;
import Repositories.DoctorRepository;
import Repositories.PatientRepository;
import util.Validator;

import java.time.LocalDate;

public class AppointmentService {

    public static void bookAppointment(String patient_id, String doctor_id, LocalDate dateOfAppointment){
        Patient patient = PatientRepository.findById(patient_id);
        if (patient == null){
            System.out.println("Invalid Patient ID!");
            return;
        }
        Doctor doctor = DoctorRepository.findById(doctor_id);
        if(doctor == null){
            System.out.println(("Invalid Doctor ID!"));
            return;
        }

        if(Validator.isValidDate(dateOfAppointment)){
            System.out.println("Invalid Appointment Date");
            return;
        }

        String appointment_id = AppointmentRepository.addAppointment(doctor,patient,dateOfAppointment);
        System.out.println("Appointment is Booked \n appointmentId :"+appointment_id);
    }

    public static void cancelAppointment(String appointment_id){
        Appointment appointment = AppointmentRepository.findById(appointment_id);

        if (appointment == null){
            System.out.println("Invalid Appointment ID!");
            return;
        }


        System.out.println(AppointmentRepository.cancelAppointment(appointment_id));
    }

    public static void upcomingAppointmentsForPatient(String patient_id){
        Patient patient = PatientRepository.findById(patient_id);
        if (patient == null){
            System.out.println("Invalid Patient ID!");
            return;
        }

//        repo function is yet to be written
    }

    public static void upcomingAppointmentsForDoctor(String doctor_id){

    }


}
