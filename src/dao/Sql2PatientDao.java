package dao;

import model.PatientDetails;
import java.sql.*;

public class Sql2PatientDao {
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?useSSL=false", "root", "root");

    public Sql2PatientDao() throws SQLException {
        this.getConnection();
    }
    public Connection getConnection() throws SQLException {
       return connection;
    }

    public void addPatient(PatientDetails patient) throws SQLException {
        String sql = "INSERT INTO patient_details (firstName, lastName, middleName, age, IDNumber, address, phoneNumber, gender) VALUES (:firstName, :lastName, :middleName, :age, :IDNumber, :address, :phoneNumber, :gender)";
        Statement statement = connection.createStatement();
        ResultSet res = statement.executeQuery(sql);
    }
}
