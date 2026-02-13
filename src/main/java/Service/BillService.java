package Service;

import Entity.Appointment;
import Entity.Bill;
import Entity.BillSummary;
import Repositories.AppointmentRepository;
import Repositories.BillRepository;
import Repositories.BillSummaryRepo;

public class BillService {

    public static void generateBill(String appointment_id){
        Appointment appointment = AppointmentRepository.findById(appointment_id);
        if(appointment == null){
            System.out.println("Invalid appointment id");
            return;
        }
        BillRepository.addBill(appointment);

    }

    public static void payBill(String bill_id){
        Bill bill = BillRepository.getById(bill_id);
        if(bill == null){
            System.out.println("Invalid Bill Id");
            return;
        }
        BillSummary billSummary = bill.generateBillSummary();
        BillSummaryRepo.addSummary(billSummary);

    }
}
