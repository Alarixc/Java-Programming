package Courses;

public class Course
{
    String newLine = System.getProperty("line.separator");
    String department;
    int courseNumber;
    double credits;
    public Course(String department,int courseNumber,double credits)throws CourseException

    {
        if(department.length()!=3||(courseNumber<100||
                courseNumber>499)||(credits<0.5|| credits>6))
        {
            try
            {
                throw new CourseException(department,courseNumber,credits);
            }
            catch(CourseException ex)
            {
            }
        }
        else
        {
            System.out.println("Created successfully" + newLine + "Department name:" +
                    "+department+" +  newLine + "Course number:" +  +courseNumber+  newLine + "credits:" + credits + newLine);

        }
        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
    }
}

