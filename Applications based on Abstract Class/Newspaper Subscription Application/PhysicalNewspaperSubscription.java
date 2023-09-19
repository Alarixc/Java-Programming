package Newspaper;
public class PhysicalNewspaperSubscription extends NewspaperSubscription{
    double setAddress() {
        int i;
        char[] add1 = add.toCharArray();
        for (char c : add1) {
            if (Character.isDigit(c)) {
                subrate = 15.0;
                //System.out.println(c);
            }
            else
                subrate = 0.0;
        }
        if (subrate==0.0)
            System.out.println("Invalid address");
        return subrate;
    }
}