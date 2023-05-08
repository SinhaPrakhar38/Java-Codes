package bean;
//Create a bean || for displaying student details like name, regno, branch, CGPA, etc… 
/*
* ser
* attr private 
* 
* 
*/
import java.io.Serializable;
public class StudentBeanClass implements Serializable {
private String studentName;
private int regNo;
private String branch;
public StudentBeanClass() {
}
public void setName(String name) {
this.studentName = name;
}
public void setRegno(int id) {
this.regNo = id;
}
public void setBranch(String branch) {
this.branch = branch;
}
public int getRegno() {
return regNo;
}
public String getName() {
return studentName;
}
public String getBranch() {
return branch;
}
@Override
public String toString() {
return studentName + " " + regNo + " " + branch;
}
public static void main(String[] args) {
StudentBeanClass obj = new StudentBeanClass();
obj.setBranch("Computer Science Core");
obj.setName("Prakhar Sinha");
obj.setRegno(056);
obj.getBranch();
obj.getName();
obj.getRegno();
System.out.println(obj.toString());
}
}