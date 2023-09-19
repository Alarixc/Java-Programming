import java.util.Scanner;
public class CountSpaces2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your quote:");
        String quote = sc.nextLine();
        int n = 0;
        for (int i = 0; i < quote.length(); i++) {
            char ch = quote.charAt(i);
            if (ch == ' ') {
                n++;
            }
        }
        System.out.println("The number of spaces in the quote is " + n);
    }
}

