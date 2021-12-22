package model;

import java.util.HashMap;
import java.util.Map;

public class PatientDetails extends Person implements DetailOps {
    protected String middleName;
    protected String gender;
    protected String fullName;
    public static Map<String, PatientDetails> patients = new HashMap<>();

    public PatientDetails(String firstName, String lastName, String IDNumber, String address, int phoneNumber, int age, String middleName, String gender) {
        super(firstName, lastName, IDNumber, address, phoneNumber, age);
        this.middleName = middleName;
        this.gender = gender;
        this.fullName = firstName + " " + middleName + " " + lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }


    @Override
    public  void addDetails() {patients.put(fullName, this);}
}
