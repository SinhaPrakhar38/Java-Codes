import java.util.*;

public class Shape {
  int length;
  int breadth;
  
  Shape(){

  }

  Shape(int l, int b){
    length = l;
    breadth = b;
  }
  
  public int area(){
    return length*breadth;
  }

  public int volume(){
    return length*breadth;
  }

  public static void main(String[] args) {
    Shape s1 = new Shape(4,6);
    Shape s2 = new Shape(8,9);
    System.out.println("area is : "+ s1.area());
    System.out.println("Volume is : "+ s2.volume());
  }
}
