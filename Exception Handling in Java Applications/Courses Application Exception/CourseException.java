package Courses;
public class CourseException extends Exception
{
 public CourseException(String dept,int course,double cred)
 {
 System.out.println("Not created successfully"+"\nDepartment name: 
"+dept+"\nCourse number: "+course+"\nCredits: "+cred+"\n");
 }
}
