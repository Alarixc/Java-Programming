package Newspaper;
public class OnlineNewspaperSubscription extends NewspaperSubscription {
    double setAddress() {
        int i;
        if (add.contains("@"))
            subrate = 9.0;
        else
            subrate = 0.0;
        if (subrate == 0.0)
            System.out.println("Invalid address");
        return subrate;
    }
}
