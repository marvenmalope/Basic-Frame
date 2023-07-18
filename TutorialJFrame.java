package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class TutorialJFrame extends JFrame {
    
    public TutorialJFrame() {
        setTitle("My First GUI");
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(true);
        setForeground(Color.BLUE);
        setSize(500, 500);
        setVisible(true);
    }
}
