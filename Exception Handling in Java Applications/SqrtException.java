import java.util.*;
import java.lang.Math;
public class SqrtException {
 public static void main(String[] args) {
 try{
 System.out.println("Enter number: ");
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 if(n>0)
 {
 double sqrt1 = Math.sqrt(n);
 System.out.println("Square root is: " + sqrt1);
 }
 else
 throw new ArithmeticException();
 }
 catch (ArithmeticException e)
 {
 System.out.println("Please enter a valid number");
 }
 }
}
