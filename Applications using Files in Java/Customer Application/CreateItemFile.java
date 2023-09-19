package Customers;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
public class CreateItemFile
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        boolean hasMoreItems = false;
        String item = "";
        String description = "";
        try
        {
            RandomAccessFile file = new RandomAccessFile("CompanyItems.txt", "rw");
            for(int i=0;i<1000;i++)
            {
                file.seek(i*100);
                file.writeUTF(item);
                file.writeUTF(description);
            }
            file.close();
            do{
                file = new RandomAccessFile("CompanyItems.txt", "rw");
                System.out.println("Enter three digits item number: ");
                item= input.nextLine();
                System.out.println("Enter description: ");
                description= input.nextLine();
                file.seek(Integer.parseInt(item)*100);
                try{
                    if(!file.readUTF().equalsIgnoreCase(item))
                    {
                        throw new IOException();
                    }
                    System.out.println("Item already present");
                }
                catch(IOException e)
                {
                    file.seek(Integer.parseInt(item)*100);
                    file.writeUTF(item);
                    file.writeUTF(description);
                    file.close();
                }
                System.out.println("Do you want to enter more item details (Yes/No):");
                hasMoreItems = input.nextLine().equalsIgnoreCase("Yes")?true:false;
            }while(hasMoreItems);
            file.close();
        }
        catch(IOException e)
        {
            System.out.println("Error while accessing file");
        }
    }
}
