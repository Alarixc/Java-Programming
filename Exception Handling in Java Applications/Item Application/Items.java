package Item;

import java.util.ArrayList;

public class Items {
    int ItemId, quantity;
    String item_name;
    String brand;
    int reorder_level;
    ArrayList<String> items;
    public Items(int reorder_level, int ItemId, int quantity, String item_name, String brand) throws ReorderException{

        if (quantity > reorder_level || quantity == reorder_level ) {
            throw new ReorderException(reorder_level);
        }else{
            System.out.println("Item created successfully!");
            AddItem(item_name);
        }
        this.reorder_level = reorder_level;
        this.item_name = item_name;
        this.quantity = quantity;
        this.brand = brand;
        this.ItemId = ItemId;
        }
        public void AddItem(String item_name){
            items = new ArrayList<>();
            items.add(item_name);
        }
        public void DeleteItem(String item_name){
            items.remove(item_name);
        }
    }
