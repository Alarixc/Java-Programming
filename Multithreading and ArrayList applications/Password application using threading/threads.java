package Threading;
import java.util.Scanner;

public class threads {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int num;
        String pwd = "whatsupppp@2221";
        System.out.print("Enter number : ");
        num = sc.nextInt();
        sc.nextLine();
        armstrong a = new armstrong(num);
        a.start();
        a.join();
        String a2 = a.isArmstrong();
        random o = new random(num);
        o.start();
        o.join();
        String a3 = o.isOddeven();
        String p;
        System.out.print("Enter password: ");
        p = sc.nextLine();
        if (pwd.equals(p)) {
            System.out.println("The entered number is: " + num);
            fibonacci f = new fibonacci(num);
            f.start();
            f.join();
            System.out.println();
            System.out.println(a2);
            System.out.println(a3);
        } else {
            System.out.println("Incorrect password");
        }
        sc.close();
    }
}




