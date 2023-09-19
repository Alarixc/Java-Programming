import java.util.Arrays;


public class ReverseString {
    public static void main(String args[]){
        String s = "Hello I AM hARRY";
        Character[] arr = new Character[s.length()];
        for(int i = 0;i< s.length();i++){
            arr[i] = s.charAt(i);
        }


        Character[] arr1 = new Character[s.length()];
        int x = 0;
        for(int i = arr.length - 1;i>=0;i--){
            arr1[x] = arr[i];
            x++;
        }
//        for(int i = 0;i< s.length();i++){
//            System.out.println(arr1[i]);
//        }
        String[] string = new String[arr1.length];
        for(int i = 0;i<arr1.length;i++){
            string[i] = arr1[i].toString();
        }
        for(int i = 0;i<arr1.length;i++) {
            string[i] = arr1[i].toString();
            System.out.println(string[i]);
        }
        //String str = String.join("", string);
        StringBuilder sb = new StringBuilder();
        for(Character z : arr1){
            sb.append(z);
        }
        System.out.println(sb.toString());
        String[] str1 = s.split(" ");
        for(String k : str1){
            System.out.println(k);
        }







    }
}
