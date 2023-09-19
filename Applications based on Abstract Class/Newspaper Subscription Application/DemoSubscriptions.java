package Newspaper;
public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription p = new PhysicalNewspaperSubscription();
        p.getSubname();
        p.getAddress();
        p.getSubrate();
        System.out.println("Subscription rate:$" + p.setAddress());
        OnlineNewspaperSubscription o = new OnlineNewspaperSubscription();
        o.getSubname();
        o.getAddress();
        o.getSubrate();
        System.out.println("Subscription rate:$" + o.setAddress());

    }
}

