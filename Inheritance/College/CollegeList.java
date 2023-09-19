package College;
import java.util.Scanner;
public class CollegeList {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 CollegeEmployee[] emp = new CollegeEmployee[4];
 Faculty[] fac = new Faculty[3];
 Student[] stu = new Student[7];
 int countemp = 0, countfac = 0, countstudent = 0;
 char letter;
 String input;
 int x;
 System.out.println("Enter C, F or S to enter data for \n 1.College employee \n 2.Faculty \n 3.Student \n Enter Q to quit");
 input = in.next();
 letter = input.charAt(0);
 while (letter != 'Q')
 {
 if(letter == 'C' || letter == 'c')
 {
 if(countemp < 4)
 {
 CollegeEmployee c = new CollegeEmployee();
 c.set();
 emp[countemp] = c;
 ++countemp;
 }
 else
 System.out.println("More than 4 employee records entered");
 }
 else if(letter == 'F'|| letter == 'f')
 {
 if(countfac < 3)
 {
 Faculty f = new Faculty();
 f.set();
 fac[countfac] = f;
 ++countfac;
 }
 else
 System.out.println("More than 3 faculty records entered");
 }
 else if(letter == 'S'|| letter == 's')
 {
 if(countstudent < 7)
 {
 Student s = new Student();
 s.set();
 stu[countstudent] = s;
 ++countstudent;
 }
 else
 System.out.println("More than 7 student records entered");
 }
 System.out.println("Enter C, F or S to enter data for \n 1.College employee \n 2.Faculty \n 3.Student \n Enter Q to quit");
 input = in.next();
 letter = input.charAt(0);
 }
 System.out.println("\nCollege Employees:");
 if(countemp == 0)
 System.out.println("No employees entered");
 else
 for(x = 0; x < countemp; ++x)
 emp[x].display();
 System.out.println("\nFaculty:");
 if(countfac == 0)
 System.out.println("No faculty entered");
 else
 for(x = 0; x < countfac; ++x)
 fac[x].display();
 System.out.println("\nStudents:");
 if(countstudent == 0)
 System.out.println("No students entered");
 else
 for(x = 0; x < countstudent; ++x)
 stu[x].display();
 }
}


