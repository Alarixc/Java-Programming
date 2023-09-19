import java.util.Scanner;
public class Alphabetize2{

    public static void main(String []args){
        String temp;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st string");
        String s1=sc.next();
        System.out.println("Enter 2nd string");
        String s2=sc.next();
        System.out.println("Enter 3rd string");
        String s3=sc.next();

        if (s1.compareTo(s2)>0)
        {
            temp =s1;
            s1 = s2;
            s2 = temp;
        }
        if (s2.compareTo(s3)>0)
        {
            temp =s2;
            s2 = s3;
            s3 = temp;
        }
        if (s1.compareTo(s3)>0)
        {
            temp =s1;
            s1 = s3;
            s3 = temp;
        }
        System.out.print("strings in Sorted Order:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
