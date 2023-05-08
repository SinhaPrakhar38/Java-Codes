import java.beans.BeanDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import java.util.*;
 
import java.util.*;
class CricketScoreBeanInfo {
  private String team1 = "";
  private String team2 = "";
  private int overs = 0;
  private int wickets = 0;
  private int score = 0;
  public void setTeam1(String team1) {
   this.team1 = team1;
  }
  public String getTeam1() {
   return team1;
  }
  public void setTeam2(String team2) {
   this.team2 = team2;
  }
  public String getTeam2() {
   return team2;
  }
  public void setOvers(int overs) {
   this.overs = overs;
  }
public int getOvers() {
return overs;
}
public void setWickets(int wickets) {
this.wickets = wickets;
}
public int getWickets() {
return wickets;
}
public void setScore(int score) {
this.score = score;
}
public int getScore() {
return score;
}
public String getScoreDetails() {
return team1 + ": " + score + "/" + wickets + " (" + overs + " overs)" + "\n" +
team2 + ": " + "yet to bat";
}
}
class CricketScoreBeanBeanInfo extends SimpleBeanInfo {
private final Class<?> beanClass = CricketScoreBeanInfo.class;
public BeanDescriptor getBeanDescriptor() {
return new BeanDescriptor(beanClass);
}
public PropertyDescriptor[] getPropertyDescriptors() {
try {
PropertyDescriptor team1 = new PropertyDescriptor("team1", beanClass);
PropertyDescriptor team2 = new PropertyDescriptor("team2", beanClass);
PropertyDescriptor overs = new PropertyDescriptor("overs", beanClass);
PropertyDescriptor wickets = new PropertyDescriptor("wickets", beanClass);
PropertyDescriptor score = new PropertyDescriptor("score", beanClass);
PropertyDescriptor[] descriptors = {team1, team2, overs, wickets, score};
return descriptors;
} catch (Exception e) {
return null;
 }
 }
}