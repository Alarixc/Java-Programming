package Threading;

public class random extends Thread {
    int num;
    String result = "";
    random(int n) {
        num = n;
    }
    public void run() {
        if(num%2==0)
        {
            result+="It is an even number";
        }
        else
        {
            result+="It is an odd number";
        }
    }
    public String isOddeven() {
        return result;
    }
}
