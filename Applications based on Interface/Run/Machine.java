package Run;
import java.util.Scanner;

public class Machine implements Runner{
        public void run(){
            System.out.println("Your machine " + machine() + " is running!");
        }
        public String machine(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the machine you're working with:");
            String mac = sc.nextLine();
            return mac;
        }
}

