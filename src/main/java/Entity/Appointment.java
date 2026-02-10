package Entity;

import java.time.LocalDate;

public class Appointment {
    private String appointmentId;
    private Patient patient;
    private Doctor doctor;
    private AppointmentStatus appointmentStatus;
    private LocalDate dateOfAppointment;



    public Appointment(String appointmentId, Doctor doctor, Patient patient, LocalDate dateOfAppointment) {
        this.appointmentId = appointmentId;
        this.doctor = doctor;
        this.patient = patient;
        this.dateOfAppointment = dateOfAppointment;
        this.appointmentStatus = AppointmentStatus.SCHEDULED;
    }


    public void cancel() {
        this.appointmentStatus = AppointmentStatus.CANCELLED;
    }

    public void markCompleted() {
        this.appointmentStatus = AppointmentStatus.COMPLETED;
    }
}
