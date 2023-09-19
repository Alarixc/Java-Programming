package Courses;

public class ThrowCourseException
{
    public static void main(String[] args) throws CourseException
    {
        Course course1 = new Course("CSE", 101, 3.1);
        Course course2 = new Course("CSE", 2002, 4.0);
        Course course3 = new Course("ECE", 111, 4.0);
        Course course4 = new Course("ECE", 2005, 3.3);
        Course course5 = new Course("CSE", 404, 4.0);
        Course course6 = new Course("CSE",405,13.4);
    }
}

