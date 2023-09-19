import java.util.Scanner;

public class Mobile {
    public static String toString(char[] str)
    {
        String string = new String(str);
        return string;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter your phone number:");
            String ph = sc.nextLine();
            if(ph.equals("999")){
                System.out.println("Thank you!");
                break;
            }
            if(ph.length()!=10){
                System.out.println("Error! Try again.");
                continue;
            }


            char phone[] = new char[ph.length()];
            char phone1[] = new char[ph.length()+4];
            int u=0;
            for(int i=0;i<ph.length();i++){
                phone[i]=ph.charAt(i);
            }
            for(int i=0;i<ph.length()+4;i++){
                if(i==0){
                    phone1[i] = '(';
                    continue;
                }
                if(i==4){
                    phone1[i]= ')';
                    continue;
                }
                if(i==5){
                    phone1[i]=' ';
                    continue;
                }
                if(i==9){
                    phone1[i]='-';
                    continue;
                }
                phone1[i]=phone[u];
                u++;

            }

            System.out.println("The phone number format of entered phone is: " + toString(phone1));
        }



    }
}
