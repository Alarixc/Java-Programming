import java.util.Scanner;

public class Password {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true) {
            int u = 0, l = 0, d = 0;
            System.out.println("Enter password:");
            String password = sc.nextLine();
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (Character.isUpperCase(ch)) {
                    u++;
                }
                if (Character.isLowerCase(ch)) {
                    l++;
                }
                if (Character.isDigit(ch)) {
                    d++;
                }
            }

            if (u >= 2 && l >= 3 && d >= 1) {
                System.out.println("Your password is valid.");
                break;
            } else {
                System.out.println("Your password is invalid. Please try again.");
            }
        }


    }
}
