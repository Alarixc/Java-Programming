package Book;
import java.util.Scanner;

public class Fiction extends Book{
    public double getNum() {
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Enter how many Fiction books you want:");
        num = sc.nextDouble();
        return num;
    }
    public double setPrice(){
        price = getNum() * 24.99;
        return price;
    }
}
