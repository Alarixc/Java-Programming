package Threading;

public class fibonacci extends Thread{
    int num;
    fibonacci(int n)
    {
        num = n;
    }
    public void run()
    {
        int a=0;
        int b=1;
        int c=0;
        for(int i=0; i<num; i++){
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}
