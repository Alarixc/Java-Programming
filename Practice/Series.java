import java.util.*;

public class Series {
    private static boolean CheckRow(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i] > 1){
                return true;
            }
        }
        return false;
    }
    private static int SumRow(int arr[]){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        int sum = 0;
        boolean flag1 = false, flag0 = false;
        int[] arr1 = new int[arr.length];

        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr1[j] = arr[i][j];
            }
            if(CheckRow(arr1)){
                sum+= SumRow(arr1);
            }
        }
        System.out.println(sum);
    }
}

