package Phone;
import java.util.Scanner;

public class IncomingPhoneCall extends PhoneCall {

    IncomingPhoneCall(String number) {
        super(number);
        price = 0.2;
    }

    public String getNumber(){
                return number;
            }
            public double getPrice(){
                return price;
            }
            public void display(){
                System.out.println("Your phone number is:" + getNumber());
                System.out.println("The rate of the call is 0.2");
                System.out.println("The price of Incoming Call is:" + getPrice());

            }

}
