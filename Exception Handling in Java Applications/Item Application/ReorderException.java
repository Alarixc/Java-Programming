package Item;

public class ReorderException extends Exception {
    public ReorderException(int reorder_level) {
        super("Place a new order!");
    }

}
