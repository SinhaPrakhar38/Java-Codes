import java.awt.*;
import java.beans.*;
 
import java.beans.*;
import java.beans.*;
import javax.swing.*;
public class ShapeBean extends Canvas {
private Shape shape;
private Color bgColor = Color.WHITE;
private Color fgColor = Color.BLACK;
private Dimension size = new Dimension(100, 100);
public ShapeBean() {
// Initialize shape
shape = new java.awt.geom.Rectangle2D.Double(0, 0, size.width, size.height);
}
public void paint(Graphics g) {
// Paint background
g.setColor(bgColor);
g.fillRect(0, 0, size.width, size.height);
// Paint shape
g.setColor(fgColor);
((Graphics2D) g).draw(shape);
}
public void setBgColor(Color bgColor) {
this.bgColor = bgColor;
}
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
shape = new java.awt.geom.Rectangle2D.Double(0, 0, size.width, size.height);
}
public Dimension getSize() {
return size;
}
}
class ShapeBeanInfo extends SimpleBeanInfo {
@Override
public PropertyDescriptor[] getPropertyDescriptors() {
try {
PropertyDescriptor bgColor = new PropertyDescriptor("bgColor", ShapeBean.class);
PropertyDescriptor fgColor = new PropertyDescriptor("fgColor", ShapeBean.class);
PropertyDescriptor size = new PropertyDescriptor("size", ShapeBean.class);
PropertyDescriptor[] descriptors = { bgColor, fgColor, size };
return descriptors;
} catch (IntrospectionException e) {
return null;
}
}
}
class ShapeBeanDemo {
public static void main(String[] args) {
JFrame frame = new JFrame("ShapeBean Demo");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
ShapeBean ShapeBean = new ShapeBean();
ShapeBean.setBgColor(Color.CYAN);
// ShapeBean.setBgColor(Color.YELLOW);
ShapeBean.setFgColor(Color.BLUE);
// ShapeBean.setFont(new Font("Arial", Font.BOLD, 24));
ShapeBean.setSize(new Dimension(100 , 150));
JPanel panel = new JPanel() {
@Override
protected void paintComponent(Graphics g) {
super.paintComponent(g);
 
super.paintComponent(g);
ShapeBean.paint(g);
}
};
panel.setPreferredSize(new Dimension(400, 300));
frame.add(panel);
frame.pack();
frame.setVisible(true);
}
}