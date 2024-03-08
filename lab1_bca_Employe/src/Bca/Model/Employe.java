package Bca.Model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Employe {
public Employe() {
super();
// TODO Auto-generated constructor stub
}
public void addEmploye(Connection con, Scanner sc) throws
SQLException {
//create statement
Statement st = con.createStatement();
//read student details
System.out.println("Enter Employe Id: ");
int id = sc.nextInt();
System.out.println("Enter Employe Name: ");
String name = sc.next();
System.out.println("Enter Employe Age: ");
int age = sc.nextInt();
System.out.println("Enter Employe salary : ");
double salary = sc.nextDouble();
System.out.println("Enter Employe Gender: ");
String gender = sc.next();
//create sql squery string
String query = String.format("Insert Into Employee values(%d,
'%s', %d, %f, '%s') ", id, name, age, salary, gender);
//execute sql query
int rows = st.executeUpdate(query);
System.out.println(rows + " record inserted!!!");
}
public void displayEmploye(Connection con) throws SQLException {
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from Employee");
while(rs.next()) {
System.out.println(rs.getInt(1)+ "\t"+rs.getString(2)+
"\t"+ rs.getInt(3)+"\t"+rs.getDouble(4)+"\t"+rs.getString(5));
}
}
public void updateEmployeName(Connection con, Scanner sc) throws
SQLException {
Statement st = con.createStatement();
System.out.println("Enter Employe ID: ");
int id = sc.nextInt();
System.out.println("Enter Employe New Name: ");
String name = sc.next();
String query = String.format("update Employee set name='%s'
where id = %d", name, id);
int rowsAffected = st.executeUpdate(query);
System.out.println(rowsAffected+" recored updated!!!");
}
public void deleteEmploye(Connection con, Scanner sc) throws
SQLException {
Statement st = con.createStatement();
System.out.println("Enter Employee ID: ");
int id = sc.nextInt();
int rowAffected = st.executeUpdate("delete from Employee where
id = "+id);
System.out.println(rowAffected + " recored deleted!!!");
System.out.println("Row deleted");
}
}