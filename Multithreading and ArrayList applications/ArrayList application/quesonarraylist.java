import java.util.*;
public class quesonarraylist {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 ArrayList<String> l1=new ArrayList<>();
 ArrayList<String> l2=new ArrayList<>();
 ArrayList<String> l3=new ArrayList<>();
 int n1,n2;
 System.out.print("Enter number of elements in list 1: ");
 n1=in.nextInt();
 System.out.print("Enter number of elements in list 2: ");
 n2=in.nextInt();
 in.nextLine();
 System.out.println("Enter elements of list 1: ");
 for(int i=0;i<n1;i++) {
 String temp;
 System.out.print("Element " +(i+1)+ ": ");
 temp=in.nextLine();
 l1.add(temp); }
 System.out.println("Enter elements of list 2: ");
 for(int i=0;i<n2;i++) {
 String temp;
 System.out.print("Element " +(i+1)+ ": ");
 temp=in.nextLine();
 l2.add(temp); }
 if(l1.size() == l2.size()) {
 for(int i=0;i<l1.size();i++) {
 String temp;
 temp=l1.get(i);
l3.add(temp);
 temp=l2.get(i);
l3.add(temp); }
 System.out.println(l3);
 }
 else if(l1.size() > l2.size()) {
 for(int i=0;i<l1.size();i++) {
 String temp;
for(int j=0;j<l2.size();j++) {
 temp=l1.get(i);
l3.add(temp);
temp=l2.get(j);
l3.add(temp); }
 }
 Set<String> l4 = new LinkedHashSet<String>(l3);
 System.out.println(l4);
 }
 in.close();
 }
}
