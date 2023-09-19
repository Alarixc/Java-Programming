import java.util.Scanner;
public class BadSubscriptCaught {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n1;
 System.out.println("Enter the number of Strings you wanna enter:");
 n1 = sc.nextInt();
 sc.nextLine();
 String[] names = new String[n1];
 System.out.println("Enter the " + n1 + " number of strings:");
 for(int i = 0;i<n1;i++){
 names[i] = sc.nextLine();
 }
 try {
 System.out.println("Enter number: ");
 int n = sc.nextInt();
 n=n-1;
 System.out.println(names[n]);
 }
 catch (ArrayIndexOutOfBoundsException q)
 {
 System.out.println("Please enter number between 1 to " + n1);
 }
 }
}

