package UI;

import javax.swing.*;
import java.awt.*;

public class HomeUI {
    final static String ADD_PATIENT= "Add Patient";
    final static String GO_TO_TRIAGE = "Go to Triage";
    final static String GO_TO_BILLING = "Go to Billing";

    public HomeUI(Container pane) {
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add(ADD_PATIENT, new AddPatientUI());
        tabbedPane.add( GO_TO_TRIAGE, new AddTriageUI());
        tabbedPane.add( GO_TO_BILLING, new BillingUI());
        pane.add(tabbedPane, BorderLayout.CENTER);
    }
}
