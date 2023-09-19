public class Recursion {
    static int Recursive(int a, int b){
        int sum;
            if (a > 3 && b > 3) {
                int x = Recursive(a-1, b) + a + b;
                return x;
            }
        sum = a + b;
        return sum;
    }
    public static void main(String args[]){

        try {
            System.out.println(Recursive(4, 9));
        }catch (Exception e){
            System.out.println("Stack over flow error" + e);
        }
    }
}
