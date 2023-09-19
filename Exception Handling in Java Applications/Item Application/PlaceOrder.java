package Item;
import java.util.ArrayList;
import java.util.Scanner;
public class PlaceOrder {
    public static void main(String args[]) throws ReorderException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter reorder level: ");
        int reorder_level = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter ItemId:");
        int ItemId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Item name:");
        String item_name = sc.nextLine();
        System.out.println("Enter brand:");
        String brand = sc.nextLine();

        Items item = new Items(reorder_level, ItemId, quantity, item_name, brand);
        System.out.println("Here are your items:");
        for (String i : item.items) {
            System.out.println(i);
        }
        System.out.println("Do you want to delete the selected item?");
        String response = sc.nextLine();
        if(response.equals("Yes")){
            item.DeleteItem(item_name);
            System.out.println("Item successfully deleted!");
        }

    }
}
