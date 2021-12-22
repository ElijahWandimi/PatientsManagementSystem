package UI;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class ParentUIFrame  extends JFrame {
    public ParentUIFrame() throws SQLException {
        super("Patient Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width , screenSize.height);
        ImageIcon img = new ImageIcon("src/healthLogo.jpg");
        setIconImage(img.getImage());
//        setBackground(new Color(0,0,0,0));

        new HomeUI(getContentPane());
        setVisible(true);
    }
}
