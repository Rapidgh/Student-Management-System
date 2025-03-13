import java.io.*;
import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {
        
        String studentID = "101";
        String studentName = "Derrick Agyei Kyeremeh";
        int studentAge = 20;
        List<String> coursesEnrolled = new ArrayList<>();
        double GPA;

        String courseID = "CSE101";
        String courseName = "Computer Science";
        int courseCredits = 3;

       
        coursesEnrolled.add(courseName);
        System.out.println(studentName + " enrolled in " + courseName);

       
        Random rand = new Random();
        GPA = 2.0 + (rand.nextDouble() * 2.0); 
        System.out.println("GPA calculated: " + GPA);

       
        System.out.println("Student ID: " + studentID + ", Name: " + studentName + ", Age: " + studentAge + ", GPA: " + GPA);
        System.out.println("Courses Enrolled: " + coursesEnrolled);

       
    }
}
