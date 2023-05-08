import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;


public class AddGUI {
    public static void main(String[] args) {
        Addition obj = new Addition();
    }
}

class Addition extends JFrame implements ActionListener{
    
    JTextField t1;
    JTextField t2;  
    JButton b;
    JLabel l;
    public Addition(){
        setLayout(new FlowLayout());
        t1 = new JTextField(5);
        t2 = new JTextField(5); 
        b = new JButton("OK");
        l = new JLabel("Result");

        add(t1);
        add(t2);
        add(b);
        add(l);

        b.addActionListener(this);

        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae)
    {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int value = num1+num2;
        l.setText(value + " ");

    }
}
