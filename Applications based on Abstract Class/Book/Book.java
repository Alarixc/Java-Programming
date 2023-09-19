package Book;
import java.util.Scanner;
public abstract class Book {
 public double price;
 public String title;
 Book(){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter book title:");
 title = sc.nextLine();
 }
 public String getTitle(){
 return title;
 }
 public double getPrice(){
 return price;
 }
 public abstract double setPrice();
}
