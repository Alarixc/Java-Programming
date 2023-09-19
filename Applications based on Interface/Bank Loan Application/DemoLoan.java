package Loan;
import java.util.Scanner;

public class DemoLoan {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you taking a Business, Personal or a Vehicle loan?");
        String ans = sc.nextLine();
        if(ans.equals("Business")){
            GetDetails b = new Business();
            b.income();
            b.amount();
            b.display();
        }
        if(ans.equals("Personal")){
            GetDetails p = new Personal();
            p.income();
            p.amount();
            p.display();
        }
        if(ans.equals("Vehicle")){
            GetDetails v = new Vehicle();
            v.income();
            v.amount();
            v.display();
        }
    }
}


