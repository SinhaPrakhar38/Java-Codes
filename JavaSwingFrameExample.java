import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

public class JavaSwingFrameExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("A Swing Frame");
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
