package Threading;
public class armstrong extends Thread {
 int num;
 String result="";
 armstrong(int n)
 {
 num = n;
 }
 public void run()
 {
 int a,r,ans=0;
 a=num;
 while(a!=0)
 {
 r=a%10;
 ans+=Math.pow(r, 3);
 a/=10;
 }
 if(ans==num)
 {
 result += "It is an Armstrong number";
 }
 else
 {
 result += "Not an Armstrong number";
 }
 }
 public String isArmstrong()
 {
 return result;
 }
}
