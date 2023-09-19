package Customers;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
public class CreateCustomerFile
{
 public static void main(String[] args)
 {
 Scanner input= new Scanner(System.in);
 boolean hasMoreCustomers = false;
 String id="";
 String lastname="";
 String zip="";
 try
 {
 RandomAccessFile file=new 
RandomAccessFile("CustomerDetail.txt","rw");
 for(int i=0;i<1000;i++)
 {
 file.seek(i*100);
 file.writeUTF(id);
 file.writeUTF(lastname);
 file.writeUTF(zip);
 }
 do
 {
 System.out.println("Enter 3 digit ID number: ");
 id = input.nextLine();
 boolean isCorrectName = false;
 do
 {
 System.out.println("Enter 6 character last name: ");
 lastname= input.nextLine();
if(lastname.length()==6)
 {
 isCorrectName=true;
 }
else if(lastname.length()<6)
 {
 System.out.println("Too short");
 }
else
{
 System.out.println("Too long");
 }
 }while(!isCorrectName);
 System.out.println("Enter 5 digit zip code: ");
 zip= input.nextLine();
 file.seek(Integer.parseInt(id)*100);
 try
 {
 if(!file.readUTF().equalsIgnoreCase(id))
{
 throw new IOException();
 }
System.out.println("User already present");
 }
 catch(IOException e)
 {
 file.seek(Integer.parseInt(id)*100);
 file.writeUTF(id);
file.writeUTF(lastname);
file.writeUTF(zip);
 }
 System.out.println("Do you want to enter more customer 
details? (Yes/No):");
 hasMoreCustomers = 
input.nextLine().equalsIgnoreCase("Yes")?true:false;
 }while(hasMoreCustomers);
 file.close();
 }
 catch(IOException e)
 {
 System.out.println("Error while accessing file");
 }
 }
}
