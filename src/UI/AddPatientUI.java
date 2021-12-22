package UI;

import model.Constant;
import model.PatientDetails;

import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

public class AddPatientUI extends JPanel implements ActionListener {
    GridBagConstraints gbc = new GridBagConstraints();
    JButton btnAddPatient = new JButton("Add Patient");
    JButton btnCancel = new JButton("Cancel");
    JLabel lblFirstName = new JLabel("First Name");
    JTextField txtFirstName = new JTextField(20);
    JLabel lblLastName = new JLabel("Last Name");
    JTextField txtLastName = new JTextField(20);
    JLabel lblAddress = new JLabel("Address");
    JTextField txtAddress = new JTextField(20);
    JLabel lblPhoneNumber = new JLabel("Phone NUmber");
    JTextField txtPhoneNumber = new JTextField(20);
    JLabel lblIDNumber = new JLabel("ID Number");
    JTextField txtIDNumber = new JTextField(20);
    JLabel lblMiddleName = new JLabel("Middle Name");
    JTextField txtMiddleName = new JTextField(20);
    JLabel lblGender = new JLabel("Gender");
    JTextField txtGender = new JTextField(20);
    JLabel lblAge = new JLabel("Age");
    JTextField txtAge = new JTextField(20);

    public AddPatientUI() {
        // layout configuration
        setLayout(new GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);

        // add name  components
        add(lblFirstName, gbc);
        gbc.gridx ++;
        add(lblMiddleName, gbc);
        gbc.gridx ++;
        add(lblLastName, gbc);

        // add name text fields
        gbc.gridx = 0;
        gbc.gridy ++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(txtFirstName, gbc);
        gbc.gridx ++;
        add(txtMiddleName, gbc);
        gbc.gridx ++;
        add(txtLastName, gbc);

        // add general info components
        gbc.gridx = 0;
        gbc.gridy ++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(lblGender, gbc);
        gbc.gridx ++;
        add(lblAge, gbc);
        gbc.gridx ++;
        add(lblIDNumber, gbc);

        // add general info text fields
        gbc.gridx = 0;
        gbc.gridy ++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(txtGender, gbc);
        gbc.gridx ++;
        add(txtAge, gbc);
        gbc.gridx ++;
        add(txtIDNumber, gbc);

        // add address components
        gbc.gridx = 0;
        gbc.gridy ++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(lblAddress, gbc);
        gbc.gridx ++;
        add(lblPhoneNumber, gbc);

        // add address text fields
        gbc.gridx = 0;
        gbc.gridy ++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(txtAddress, gbc);
        gbc.gridx ++;
        add(txtPhoneNumber, gbc);

        // add buttons
        gbc.gridx = 0;
        gbc.gridy ++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(btnAddPatient, gbc);
        gbc.gridx ++;
        add(btnCancel, gbc);

        // add action listeners
        btnAddPatient.addActionListener(this);
        btnCancel.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAddPatient) {
            String firstName = txtFirstName.getText();
            String middleName = txtMiddleName.getText();
            String lastName = txtLastName.getText();
            String  gender = txtGender.getText();
            int age = Integer.parseInt(txtAge.getText());
            String IDNumber = txtIDNumber.getText();
            String address = txtAddress.getText();
            int phoneNumber = Integer.parseInt(txtPhoneNumber.getText());
            PatientDetails patient = new PatientDetails(firstName, lastName, IDNumber, address, phoneNumber, age, middleName, gender);
            // TODO: add patient to database
            try {
                Constant.PATIENT_DAO.addPatient(patient);
                clearFields();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        else if (e.getSource() == btnCancel) {
            clearFields();
        }
    }

    public void clearFields() {
        txtFirstName.setText("");
        txtMiddleName.setText("");
        txtLastName.setText("");
        txtGender.setText("");
        txtAge.setText("");
        txtIDNumber.setText("");
        txtAddress.setText("");
        txtPhoneNumber.setText("");
    }
}
