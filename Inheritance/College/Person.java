package College;
import java.util.Scanner;
public class Person {
 String first, last;
 String add, zip;
 int phone;
 void set()
 {
 Scanner in = new Scanner(System.in);
 System.out.println("Enter first name:");
 first = in.nextLine();
 System.out.println("Enter last name:");
 last = in.nextLine();
 System.out.println("Enter address:");
 add = in.nextLine();
 System.out.println("Enter zipcode:");
 zip = in.nextLine();
 System.out.println("Enter phone number:");
 phone = in.nextInt();
 }
 void display()
 {
 System.out.println(first + "\t" + last + "\t" + add + "\t" + zip + "\t" + phone);
 }
 }
