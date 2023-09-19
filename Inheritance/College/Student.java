package College;
import java.util.Scanner;
public class Student extends Person{
 String study;
 double gpa;
 void set() {
 Scanner in = new Scanner(System.in);
 System.out.println("Enter major field of study:");
 study = in.nextLine();
 System.out.println("Enter gpa:");
 gpa = in.nextDouble();
 }
 void display()
 {
 System.out.println(study + "\t" + gpa);
 }
}

