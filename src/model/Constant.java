package model;

import dao.Sql2PatientDao;

import java.sql.SQLException;

public class Constant {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/hospital";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "root";
    public static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    public static Sql2PatientDao PATIENT_DAO = null;

    static {
        try {
            PATIENT_DAO = new Sql2PatientDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
