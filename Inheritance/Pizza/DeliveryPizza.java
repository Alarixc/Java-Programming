package Pizza;
public class DeliveryPizza extends Pizzza{
 float dfee;
 String daddress;
 void DeliveryPizza(String d, double p)
 {
 if(price>15) {
 dfee = 3;
 System.out.println("Delivery fee = " + dfee);
 }
 else
 {
 dfee = 5;
 System.out.println("Delivery fee = " + dfee);
 }
 }
}

