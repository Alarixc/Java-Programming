package College;
import java.util.Scanner;
public class CollegeEmployee extends Person{
 int ssn,salary;
 String department;
 void set() {
 Scanner in = new Scanner(System.in);
 System.out.println("Enter social security number:");
 ssn = in.nextInt();
 System.out.println("Enter salary:");
 salary = in.nextInt();
 System.out.println("Enter department:");
 department = in.nextLine();
 in.nextLine();
 }
 void display()
 {
 System.out.println(ssn + "\t" + salary + "\t" + department);
 }
}
