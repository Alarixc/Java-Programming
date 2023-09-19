package Tshirt;
import java.util.Scanner;
public class TeeShirt {
 int orderno;
 String size;
 String colour;
 double price;
 void get()
 {
 Scanner in = new Scanner(System.in);
 System.out.println("Enter order no: ");
 orderno = in.nextInt();
 System.out.println("Enter colour: ");
 colour = in.nextLine();
 in.nextLine();
 System.out.println("Enter size: ");
 size = in.nextLine();
 }
 void set()
 {
 if (size.equals("XXL") || size.equals("XXXL")) {
 price = 22.99;
 System.out.println("Price = " + price);
 }
 else
 {
 price = 19.99;
 System.out.println("Price = " + price);
 }
 }
}