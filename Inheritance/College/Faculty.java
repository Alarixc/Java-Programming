package College;
import java.util.Scanner;
public class Faculty extends CollegeEmployee{
 boolean tenured;
 void set()
 {
 Scanner in = new Scanner(System.in);
 System.out.println("Enter if the faculty is tenured:");
 tenured = in.nextBoolean();
 }
 void display()
 {
 System.out.println("The faculty is tenured: "+tenured);
 }
}
