package Run;
import java.util.Scanner;
import java.util.Date;



public class PoliticalCandidate implements Runner {
    public void run(){
        Date d = new Date();
        System.out.println("Your election is " + politics() + " which is now running at " + d.toString());
    }
    public String politics(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your election details:");
        String elec = sc.nextLine();
        return elec;




    }
}
