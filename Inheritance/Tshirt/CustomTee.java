package Tshirt;
import java.util.Scanner;
public class CustomTee extends TeeShirt{
String slogan;
void get()
{
Scanner in = new Scanner(System.in);
System.out.println("Enter slogan:");
slogan = in.nextLine();
}
}
