package Pizza;
import java.util.Scanner;
public class Pizza {
String description;
double price;
Pizzza()
{
Scanner in = new Scanner(System.in);
System.out.println("Enter description:");
description = in.nextLine();
this.description = description;
System.out.println("Enter price:");
price = in.nextDouble();
this.price = price;
}
}
