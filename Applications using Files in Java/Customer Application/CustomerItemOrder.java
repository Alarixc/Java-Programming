package Customers;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
public class CustomerItemOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            RandomAccessFile itemFile = new RandomAccessFile("CompanyItems.txt", "rw");
            RandomAccessFile customerFile = new RandomAccessFile("CustomerDetail.txt",
                    "rw");
            System.out.println("Enter 3 digit customer ID : ");
            String customerId = input.nextLine();
            System.out.println("Enter 3 digit item id : ");
            String itemId = input.nextLine();
            itemFile.seek(Integer.parseInt(itemId) * 100);
            customerFile.seek(Integer.parseInt(customerId) * 100);
            if (!itemId.equalsIgnoreCase(itemFile.readUTF())) {
                System.out.println("Invalid Item ID ");
            } else if (!customerId.equalsIgnoreCase(customerFile.readUTF())) {
                System.out.println("Invalid Customer ID ");
            } else {
                System.out.println("Customer details :\n\tID : " + customerId + "\n\tLast name : "
                        + customerFile.readUTF() + "\n\tZip : " + customerFile.readUTF());
                System.out.println("Item details :" + "\n\tID : " + itemId + "\n\tDescription: "
                        + itemFile.readUTF());
            }
            customerFile.close();
            itemFile.close();
        } catch (IOException e) {
            System.out.println("Error while accessing file");
        }
    }
}
