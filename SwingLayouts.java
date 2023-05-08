import javax.swing.*;
import java.awt.*;

public class SwingLayouts {
    public static void main(String[] args) {
        Abc obj = new Abc();  
    } 
}

class Abc extends JFrame{
    public Abc()
    {
        setLayout(new GridBagLayout());
        JLabel l1 = new JLabel("Hello World");
        JLabel l2 = new JLabel("Welcome Aryan Chutiye");// We can't see Hello world bcz by default JFrame uses CardLayout 
        add(l1);
        add(l2);
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
