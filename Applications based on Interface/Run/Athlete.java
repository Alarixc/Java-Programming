package Run;

import java.util.Scanner;

public class Athlete implements Runner{
    public void run(){
        System.out.println(athlete() + " is running!");
    }
    public String athlete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        return name;
    }
}
