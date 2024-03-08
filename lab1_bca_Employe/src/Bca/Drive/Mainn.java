package Bca.Drive;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import Bca.Model.Employee;
public class Mainn {
public static void main(String[] args) throws ClassNotFoundException,
SQLException {
// TODO Auto-generated method stub
//1. load and register
Class.forName("com.mysql.cj.jdbc.Driver");
//2
String url = "jdbc:mysql://localhost:3306/empdetails";
String username = "root";
String pwd = "Root@123";
Connection con = DriverManager.getConnection(url, username,
pwd);
Scanner sc = new Scanner(System.in);
Employee e = new Employee();
//insert
//s.addStudent(con, sc);
while(true) {
menu();
int choice = sc.nextInt();
switch(choice) {
case 1: e.addEmploye(con,sc);
break;
case 2: e.displayEmploye(con);
break;
case 3: e.updateEmployeName(con, sc);
break;
case 4: e.deleteEmploye(con, sc);
break;
case 5:
System.out.println("Bye Bye ...");
System.exit(0);
default:
System.out.println("Wrong Choice...");
}
}
}
public static void menu() {
System.out.println("------------Operation Perform-----------");
System.out.println("1. Add New Employe");
System.out.println("2. Display All Employe");
System.out.println("3. Update Name of Employe");
System.out.println("4. Delete a Employe");
System.out.println("5. Exit");
System.out.println("Enter any above number of Your Choice...");
}
}