package Loan;
import java.util.Scanner;

public class Business implements GetDetails{
    Scanner sc = new Scanner(System.in);
    private int inc;
    private int amc;

    public void setIncome(){
        System.out.println("Enter your annual income:");
        this.inc = sc.nextInt();

    }
    public void setAmount(){
        System.out.println("Enter your loan amount:");
        this.amc = sc.nextInt();
    }

    public int income(){
        return this.inc;
    }
    public int amount(){
        return this.amc;
    }
    public void display(){
        setIncome();
        setAmount();
        if(income() < 2000000){
            System.out.println("Your income is too low, you are not eligible for this business loan!");
        }
        else if(amount() > 100000000){
            System.out.println("Thats too much, we cannot loan you that much. Gooodbye.");

        }else{
            System.out.println("Congrats! You are eligible for this Business loan. Your loan amount assigned to you is: " + amount());
        }

    }
}


