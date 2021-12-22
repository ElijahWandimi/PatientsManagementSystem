package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BillingUI extends JPanel implements ActionListener {
    GridBagConstraints gbc = new GridBagConstraints();

    JButton btnEnd = new JButton("End");
    JButton btnCancel = new JButton("Cancel");
    JLabel lblPrice = new JLabel("Total Price: ");
    JTextField txtPrice = new JTextField(10);
    JLabel lblMedicines = new JLabel("Medicines: ");
    JTextArea txtMedicines = new JTextArea(5, 10);

    public BillingUI() {
        // layout configuration
        setLayout(new GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);

        // add labels
        add(lblPrice, gbc);
        gbc.gridx++;
        add(lblMedicines, gbc);

        // add test fields
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(txtPrice, gbc);
        gbc.gridx++;
        add(txtMedicines, gbc);

        // add buttons
        gbc.gridx = 0;
        gbc.gridy++;
        add(btnEnd, gbc);
        gbc.gridx++;
        add(btnCancel, gbc);

        // add action listeners
        btnEnd.addActionListener(this);
        btnCancel.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEnd) {
            int price = Integer.parseInt(txtPrice.getText());
            String medicines = txtMedicines.getText();
            // TODO: send to database

            clearFields();
        } else if (e.getSource() == btnCancel) {
            clearFields();
        }
    }

    private void clearFields() {
        txtPrice.setText("");
        txtMedicines.setText("");
    }
}
