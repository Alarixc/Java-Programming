package Newspaper;
import java.util.Scanner;
public abstract class NewspaperSubscription {
    String subname;
    String add;
    double subrate;
    void getSubname()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter subscriber name:");
        subname = in.nextLine();
    }
    void getAddress()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter address:");
        add = in.nextLine();
    }
    void getSubrate()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter subscription rate:");
        subrate = in.nextDouble();
    }
    abstract double setAddress();
}
