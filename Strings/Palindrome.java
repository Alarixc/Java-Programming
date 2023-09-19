import java.util.Scanner;

public class Palindrome {
        static boolean stringPalindrome(String str)
        {
            int l = 0;
            int h = str.length()-1;
            str = str.toLowerCase();
            while(l <= h)
            {
                char getAtl = str.charAt(l);
                char getAth = str.charAt(h);
                if (!(getAtl >= 'a' && getAtl <= 'z'))
                    l++;
                else if(!(getAth >= 'a' && getAth <= 'z'))
                    h--;
                else if( getAtl == getAth)
                {
                    l++;
                    h--;
                }
                else
                    return false;
            }
            return true;
        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if( stringPalindrome(str))
                System.out.println("String is palindrome");
            else
                System.out.println("String is not" + " " + "palindrome");
        }
}

