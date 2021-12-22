package UI;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class HomeUI {
    final static String ADD_PATIENT= "Add Patient";
    final static String GO_TO_TRIAGE = "Go to Triage";
    final static String GO_TO_BILLING = "Go to Billing";
//    final static String GO_TO_PATIENTS= "Go to patients";

    public HomeUI(Container pane) throws SQLException {
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add(ADD_PATIENT, new AddPatientUI());
        tabbedPane.add( GO_TO_TRIAGE, new AddTriageUI());
        tabbedPane.add( GO_TO_BILLING, new BillingUI());
//        tabbedPane.add(GO_TO_PATIENTS, new ShowDetailsUI());
        pane.add(tabbedPane, BorderLayout.CENTER);
    }
}
