import java.util.ArrayList;

class random extends Thread{
    String result;
    random(String n){
        this.result = n;
    }
    public void run(){
        ArrayList<String> a = new ArrayList<>();
        String[] array = new String[]{result};
        for(int i=0 ; i<array.length;i++) {
            a.add(array[i]);
        }
        display(a);
    }
    public void display(ArrayList<String> a){
        for(String i : a){
            System.out.println(i);
        }

    }

}
class random1 extends Thread{
    public void run(){
        for(int i=0 ; i<10 ; i++){
            System.out.println(i);
        }
    }
}
public class Something {
    public static void main(String args[]) throws InterruptedException{
        String x  = "What in the world is going on here?";
        random r = new random(x);
        r.start();
        r.join();
        random1 r1 = new random1();
        r1.start();
        r1.join();
    }
}
