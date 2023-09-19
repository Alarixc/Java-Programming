public class Sum {
    private static int sum(int n) {
        if (n >= 1) {
            return (sum(n-1) + n) *n;
        }
        return 5;
    }
    public static void main(String args[]){
        System.out.println(sum(5));
    }
}

