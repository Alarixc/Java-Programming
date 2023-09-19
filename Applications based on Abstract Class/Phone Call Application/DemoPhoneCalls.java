package Phone;
import java.util.Scanner;

public class DemoPhoneCalls {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num, ques;
        System.out.println("Enter your phone number:");
        num = sc.nextLine();

        System.out.println("Incoming or Outgoing call?");
        ques = sc.nextLine();
        if (ques.equals("Incoming")) {
            PhoneCall Obj = new IncomingPhoneCall(num);
            Obj.display();
        } else if (ques.equals("Outgoing")) {
            System.out.println("Enter the time you're gonna be on this outgoing call in minutes:");
            int time = sc.nextInt();
            PhoneCall Obj = new OutgoingPhoneCall(num,time);
            Obj.display();
        }

        }
    }