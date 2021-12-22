package UI;

import dao.Sql2PatientDao;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class ShowDetailsUI extends JPanel {
    GridBagConstraints gbc = new GridBagConstraints();
    private String[] columnNames = {"firstName","lastName", "IDNumber", "address", "phoneNumber", "age", "middleName", "gender"};
    private String[][] data = {Sql2PatientDao.getPatientDetails()};
    JTable table = new JTable(data, columnNames);

    public ShowDetailsUI() throws SQLException {
        setLayout(new GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);

        add(table);
        gbc.gridx++;
    }
}
