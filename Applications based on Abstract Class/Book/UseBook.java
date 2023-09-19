package Book;

public class UseBook {
    public static void main(String args[]){
        Book obj = new Fiction();
        System.out.println("The title of the book is:" + obj.getTitle());
        obj.setPrice();
        System.out.println("The price is:" + obj.getPrice());
        Book obj1 = new NonFiction();
        System.out.println("The title of the non fiction book is:" + obj1.getTitle());
        obj1.setPrice();
        System.out.println("The price is:" + obj1.getPrice());

    }
}
