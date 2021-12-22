package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddTriageUI extends JPanel implements ActionListener {
    GridBagConstraints gbc = new GridBagConstraints();
    JButton btnSaveTriage = new JButton("SUBMIT");
    JButton btnCancel = new JButton("Cancel");
    JLabel lblBloodPressure = new JLabel("Blood Pressure");
    JTextField txtBloodPressure = new JTextField(10);
    JLabel lblHeartRate = new JLabel("Heart Rate");
    JTextField txtHeartRate = new JTextField(10);
    JLabel lblTemperature = new JLabel("Temperature");
    JTextField txtTemperature = new JTextField(10);

    public AddTriageUI() {
        // set layout
        setLayout(new GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);

        // add components
        add(lblBloodPressure, gbc);
        gbc.gridx++;
        add(lblTemperature, gbc);
        gbc.gridx++;
        add(lblHeartRate, gbc);

        // add text fields
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(txtBloodPressure, gbc);
        gbc.gridx++;
        add(txtTemperature, gbc);
        gbc.gridx++;
        add(txtHeartRate, gbc);

        // add buttons
        gbc.gridx = 0;
        gbc.gridy++;
        add(btnSaveTriage, gbc);
        gbc.gridx++;
        add(btnCancel, gbc);

        // add action listeners
        btnSaveTriage.addActionListener(this);
        btnCancel.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSaveTriage) {
            String bloodPressure = txtBloodPressure.getText();
            String heartRate = txtHeartRate.getText();
            int temperature = Integer.parseInt(txtTemperature.getText());
            // TODO: save triage to database

            clearFields();
        } else if (e.getSource() == btnCancel) {
            clearFields();
        }
    }

    public void clearFields() {
        txtBloodPressure.setText("");
        txtHeartRate.setText("");
        txtTemperature.setText("");
    }
}
