import java.util.*;
public class MyQueue {
    public static void main(String args[]){
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        for(int i =0;i<s.size();i++){
            s.pop();
            System.out.println(s.get(i));
        }

        //Queue<Integer> q = new Queue<Integer>();


    }
}
