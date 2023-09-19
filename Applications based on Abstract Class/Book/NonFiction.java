package Book;
import java.util.Scanner;

public class NonFiction extends Book {
    public double getNum() {
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Enter how many Non-Fiction books you want:");
        num = sc.nextDouble();
        return num;
    }
    public double setPrice(){
        price = getNum() * 37.99;
        return price;
    }
}
