package model;

import java.util.Map;

public class Billing extends PatientDetails implements DetailOps {
    protected String medication;
    protected int price;

    public Billing(String firstName, String lastName, String IDNumber, String address, int phoneNumber, int age, String middleName, String gender, String medication, int price, Map<String, PatientDetails> patients) {
        super(firstName, lastName, IDNumber, address, phoneNumber, age, middleName, gender);
        this.medication = medication;
        this.price = price;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public  void addDetails() {
        PatientDetails.patients.put(getMedication(), this);}

}
