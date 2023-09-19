import java.util.*;
class AnException extends Exception{
    public AnException(int n){
        System.out.println("Number "+ n + " is not valid!");
    }
}

public class MyException{
    public static void main(String args[]) throws AnException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<5){
            try{
                throw new AnException(n);
            }catch(AnException e){

            }
        }
    }
}

