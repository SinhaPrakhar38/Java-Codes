import java.sql.Date;
import java.time.Year;
import java.io.Serializable;

public class EmployeeBean implements Serializable{
    private String firstName;
    private String lastName;
    private Year startYear;
    private double salary;

    public EmployeeBean(){
        System.out.println("This is a no-arg constructor");
    }

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public String getfirstName(){
        return firstName;
    }

    public void setlastName(String lastName){
        this.lastName= lastName;
    }
    public String getlastName(){
        return lastName;
    }
    public void setstartYear(Year startYear){
        this.startYear= startYear;
    }
    public Year getstartYear(){
        return startYear;
    }
}