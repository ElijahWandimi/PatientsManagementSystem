package model;

import model.PatientDetails;

public class TriageDetails extends PatientDetails {
    protected String bloodPressure, heartRate;
    protected int temperature;

    public TriageDetails(String firstName, String lastName, String IDNumber, String address, int phoneNumber, int age, String middleName, String gender, String fullName, String bloodPressure, String heartRate, int temperature) {
        super(firstName, lastName, IDNumber, address, phoneNumber, age, middleName, gender);
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
        this.temperature = temperature;
        this.fullName = fullName;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
