import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/world", "root", "root");
            // here world is database name, root is username and password
            Statement s = con.createStatement();

            // ResultSet res = stmt.executeQuery("SELECT Doctor_Name FROM jdbc.Doctor INNER
            // JOIN jdbc.Hospital ON Doctor.Hospital_Id=Hospital.Hospital_Id WHERE
            // Hospital_Name = 'Mayo Clinic'");
            // ResultSet r = stmt.executeQuery("SELECT Doctor_Name FROM jdbc.Doctor WHERE
            // Speciality = 'Pediatric' AND Salary > 0");
            // while (r.next()){
            // System.out.println(r.getString("Doctor_Name"));
            // }
            ResultSet r = s.executeQuery(
                    "SELECT * FROM jdbc.Doctor INNER JOIN jdbc.Hospital ON Doctor.Hospital_Id=Hospital.Hospital_Id");
            while (r.next()) {
                System.out.println(r.getInt("Doctor_Id") + " ----> " + r.getString("Doctor_Name") + " ----> "
                        + r.getInt("Hospital_Id") + " ----> " + r.getString("Joining_Date") + " ----> "
                        + r.getString("Speciality") + " ----> " + r.getInt("Salary") + " ----> "
                        + r.getString("Experience") + " ----> " + r.getString("Hospital_Name") + " ----> "
                        + r.getInt("Bed_Count"));
            }

            // int rs = stmt.executeUpdate("""
            // int res = stmt.executeUpdate("UPDATE `jdbc`.`doctor` SET `Experience` = '1'
            // WHERE (`Doctor_id` = '101');");
            // System.out.println(res);
            // res = stmt.executeUpdate("UPDATE `jdbc`.`doctor` SET `Experience` = '2' WHERE
            // (`Doctor_id` = '102');");
            // System.out.println(res);
            // res = stmt.executeUpdate("UPDATE `jdbc`.`doctor` SET `Experience` = '3' WHERE
            // (`Doctor_id` = '103');");
            // System.out.println(res);
            // res = stmt.executeUpdate("UPDATE `jdbc`.`doctor` SET `Experience` = '4' WHERE
            // (`Doctor_id` = '104');");
            // System.out.println(res);
            // res = stmt.executeUpdate("UPDATE `jdbc`.`doctor` SET `Experience` = '5' WHERE
            // (`Doctor_id` = '105');");
            // System.out.println(res); 
            // res = stmt.executeUpdate("UPDATE `jdbc`.`doctor` SET `Experience` = '6' WHERE
            // (`Doctor_id` = '106');");
            // System.out.println(res);
            // res = stmt.executeUpdate("UPDATE `jdbc`.`doctor` SET `Experience` = '7' WHERE
            // (`Doctor_id` = '107');");
            // System.out.println(res);
            // res = stmt.executeUpdate("UPDATE `jdbc`.`doctor` SET `Experience` = '8' WHERE
            // (`Doctor_id` = '108');");
            // System.out.println(res);
            // CREATE TABLE `jdbc`.`Doctor` (
            // `Doctor_id` INT NOT NULL,
            // `Doctor_Name` VARCHAR(45) NULL,
            // `Hospital_ID` INT NULL,
            // `Joining_Date` DATETIME NULL,
            // `Speciality` VARCHAR(45) NULL,
            // `Salary` INT NULL,
            // `Experience` VARCHAR(45) NULL,
            // PRIMARY KEY (`Doctor_id`));
            // """);
            // int res = stmt.executeUpdate(
            // "INSERT INTO `jdbc`.`doctor` (`Doctor_id`, `Doctor_Name`, `Hospital_ID`,
            // `Joining_Date`, `Speciality`, `Salary`) VALUES ('102', 'Michael', '2',
            // '2018-07-23', 'Oncologist', '20000');");
            // System.out.println(res);
            // res = stmt.executeUpdate(
            // "INSERT INTO `jdbc`.`doctor` (`Doctor_id`, `Doctor_Name`, `Hospital_ID`,
            // `Joining_Date`, `Speciality`, `Salary`) VALUES ('103', 'Susan', '2',
            // '2016-05-19', 'Garnacologist', '25000');");
            // System.out.println(res);
            // res = stmt.executeUpdate(
            // "INSERT INTO `jdbc`.`doctor` (`Doctor_id`, `Doctor_Name`, `Hospital_ID`,
            // `Joining_Date`, `Speciality`, `Salary`) VALUES ('104', 'Robert', '3',
            // '2017-12-28', 'Pediatric', '18000');");
            // System.out.println(res);
            // res = stmt.executeUpdate(
            // "INSERT INTO `jdbc`.`doctor` (`Doctor_id`, `Doctor_Name`, `Hospital_ID`,
            // `Joining_Date`, `Speciality`, `Salary`) VALUES ('105', 'Linda', '3',
            // '2004-06-04', 'Garnacologist', '42000');");
            // System.out.println(res);
            // res = stmt.executeUpdate(
            // "INSERT INTO `jdbc`.`doctor` (`Doctor_id`, `Doctor_Name`, `Hospital_ID`,
            // `Joining_Date`, `Speciality`, `Salary`) VALUES ('106', 'Willam', '4',
            // '2012-09-11', 'Dermatologist', '30000');");
            // System.out.println(res);
            // res = stmt.executeUpdate(
            // "INSERT INTO `jdbc`.`doctor` (`Doctor_id`, `Doctor_Name`, `Hospital_ID`,
            // `Joining_Date`, `Speciality`, `Salary`) VALUES ('107', 'Richard', '4',
            // '2014-08-21', 'Garnacologist', '32000');");
            // System.out.println(res);
            // res = stmt.executeUpdate("INSERT INTO `jdbc`.`doctor` (`Doctor_id`,
            // `Doctor_Name`, `Hospital_ID`, `Joining_Date`, `Speciality`, `Salary`) VALUES
            // ('108', 'Karen', '4', '2011-10-17', 'Radiologist', '30000');");
            // System.out.println(res);
            // int res = stmt.executeUpdate("INSERT INTO `jdbc`.`hospital` (`Hospital_id`,
            // `Hospital_name`, `Bed_count`) VALUES ('2', 'Cleveland Clinic', '400');");
            // System.out.println(res);
            // res = stmt.executeUpdate("INSERT INTO `jdbc`.`hospital` (`Hospital_id`,
            // `Hospital_name`, `Bed_count`) VALUES ('3', 'John Hopkins', '1000');");
            // System.out.println(res);
            // res = stmt.executeUpdate("INSERT INTO `jdbc`.`hospital` (`Hospital_id`,
            // `Hospital_name`, `Bed_count`) VALUES ('4', 'UCLA Medical', '1500');");
            // System.out.println(res);
            // while (rs.next())
            // System.out.println(res);
            // // System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +
            // rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

