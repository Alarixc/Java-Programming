package Phone;
import java.util.Scanner;

public class OutgoingPhoneCall extends PhoneCall {
    OutgoingPhoneCall(String number, int time){
        super(number);
        price = time * 0.04;
    }
    public String getNumber(){
        return number;

    }
    public double getPrice(){

        return price;
    }
    public void display(){
        System.out.println("Your phone number is: "+ getNumber());
        System.out.println("The rate of the call is 0.04 per minute");
        System.out.println("Your price is: " + getPrice());

    }
}
