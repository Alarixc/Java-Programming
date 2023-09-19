package Phone;
import java.util.Scanner;

public abstract class PhoneCall {
        public String number;
        public double price;
        PhoneCall(String num){
                 number = num;
                 setprice();
        }
        public void setprice(){
                price = 0.0;
        }
        public abstract String getNumber();
        public abstract double getPrice();
        public abstract void display();
}
