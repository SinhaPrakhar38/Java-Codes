import java.sql.*;
public class LibrarySystem {
public static void main(String[] args) throws Exception {
try {
// Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/jdbc", "root", "root");
// here sonoo is database name, root is username and password
Statement s = con.createStatement();
// String createBookTable = "create table book (id int primary key,book_name varchar(25),category 
varchar(15),author varchar(25),publisher varchar(25));";
String insRow = 
// "INSERT INTO `jdbc`.`book` (`id`, `book_name`, `category`, `author`, `publisher`) VALUES ('2', 
'Rashmirathi', 'Story', 'Dinkar', 'VIT');";
"INSERT INTO `jdbc`.`book` (`id`, `book_name`, `category`, `author`,`publisher`) VALUES ('1', 
'Chitralekha', 'Story', 'Bhagwati Charan Verma','VIT');";
String selectBook = "SELECT * FROM book";
// boolean res = s.execute(
// createBookTable
// insRow
// );
ResultSet resSet = s.executeQuery(selectBook);
while (resSet.next()) {
System.out.println(resSet.getString(1) + ' ' + resSet.getString(2) + ' ' + resSet.getString(3) + ' 
'
+ resSet.getString(4) + ' ' + resSet.getString(5));
// resSet.next();
}
con.close();
} catch (Exception e) {
System.out.println(e);
}
}
}