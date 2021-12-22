import UI.HomeUI;
import UI.ParentUIFrame;

import javax.swing.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        /*
        *   This is the main method that runs the program.
        *   It creates a new instance of the HomeUI class and runs it.
        *   This is the first frame that the user sees.
        */

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        UIManager.put("swing.boldMetal", Boolean.FALSE);

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ParentUIFrame();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
