package sunw.demo.GreetingBean;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.beans.*;
import javax.swing.*;
import java.awt.*;
public class GreetingBean {
private String message = "Hello, World!";
private Color bgColor = Color.WHITE;
private Color fgColor = Color.BLACK;
private Dimension size = new Dimension(200, 100);
private Font font = new Font("Arial", Font.PLAIN, 12);
public GreetingBean() {
}
public void paint(Graphics g) {
// Paint background
g.setColor(bgColor);
g.fillRect(0, 0, size.width, size.height);
// Paint message
g.setColor(fgColor);
g.setFont(font);
g.drawString(message, 10, size.height / 2 + 5);
}
public void setMessage(String message) {
this.message = message;
}
public String getMessage() {
return message;
}
public void setBgColor(Color bgColor) {
this.bgColor = bgColor;
}
public Color getBgColor() {
 JAVA Page 4 
public Color getBgColor() {
return bgColor;
}
public void setFgColor(Color fgColor) {
this.fgColor = fgColor;
}
public Color getFgColor() {
return fgColor;
}
public void setSize(Dimension size) {
this.size = size;
}
public Dimension getSize() {
return size;
}
public void setFont(Font font) {
this.font = font;
}
public Font getFont() {
return font;
}
}
class GreetingBeanInfo extends SimpleBeanInfo {
@Override
public PropertyDescriptor[] getPropertyDescriptors() {
try {
PropertyDescriptor message = new PropertyDescriptor("message", GreetingBean.class);
PropertyDescriptor bgColor = new PropertyDescriptor("bgColor", GreetingBean.class);
PropertyDescriptor fgColor = new PropertyDescriptor("fgColor", GreetingBean.class);
PropertyDescriptor size = new PropertyDescriptor("size", GreetingBean.class);
PropertyDescriptor font = new PropertyDescriptor("font", GreetingBean.class);
PropertyDescriptor[] descriptors = { message, bgColor, fgColor, size, font };
return descriptors;
} catch (IntrospectionException e) {
return null;
}
}
}
class GreetingBeanDemo {
public static void main(String[] args) {
JFrame frame = new JFrame("GreetingBean Demo");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
GreetingBean greetingBean = new GreetingBean();
greetingBean.setMessage("Welcome to my program!");
greetingBean.setBgColor(Color.YELLOW);
greetingBean.setFgColor(Color.BLUE);
greetingBean.setFont(new Font("Arial", Font.BOLD, 24));
JPanel panel = new JPanel() {
@Override
protected void paintComponent(Graphics g) {
super.paintComponent(g);
greetingBean.paint(g);
}
};
panel.setPreferredSize(new Dimension(400, 300));
frame.add(panel);
frame.pack();
frame.setVisible(true);
}
}