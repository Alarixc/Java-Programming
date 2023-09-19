import java.util.Scanner;
public class BabyNameComparison {
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 String[] name = new String[3];
 for(int i=0;i<3;i++){
 name[i] = sc.nextLine();
 }
 for(int i=0;i<3;i++){
 for(int j=0;j<3;j++){
 System.out.println(name[i] +" "+ name[j]);
 }
 }
 }
}
