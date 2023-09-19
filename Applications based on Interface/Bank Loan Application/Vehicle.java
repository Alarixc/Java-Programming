package Loan;
import java.util.Scanner;

public class Vehicle implements GetDetails{
    Scanner sc = new Scanner(System.in);
    private int inc;
    private int amc;
    private String carr;
    public void setIncome(){
        System.out.println("Enter your annual income:");
        this.inc = sc.nextInt();
    }
    public void setAmount(){
        System.out.println("Enter your loan amount:");
        this.amc = sc.nextInt();
    }
    public void setCar(){
        sc.nextLine();
        System.out.println("Enter the car you wanna buy:");
        this.carr = sc.nextLine();
    }

    public int income(){
        return this.inc;
    }
    public int amount(){
        return this.amc;
    }
    public String car(){
        return this.carr;
    }


    public void display(){
        setIncome();
        setAmount();
        setCar();
        if(income() < 500000){
            System.out.println("Your income is too low, you are not eligible for this business loan!");
        }
        else if(amount() > 700000){
            System.out.println("Thats too much for a Vehicle loan, we cannot loan you that much. Gooodbye.");

        }else{
            System.out.println("Congrats! You are eligible for this Vehicle loan. Your loan amount assigned to you is: " + amount());
            System.out.println("Enjoy driving your " + car());
        }
    }
}
