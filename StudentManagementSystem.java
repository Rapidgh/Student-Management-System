import java.io.*;
import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {
        // Case Study 1: Student Management System
        String studentID = "101";
        String studentName = "Derrick Agyei Kyeremeh";
        int studentAge = 20;
        List<String> coursesEnrolled = new ArrayList<>();
        double GPA;

        String courseID = "CSE101";
        String courseName = "Computer Science";
        int courseCredits = 3;

        // Adding Course
        coursesEnrolled.add(courseName);
        System.out.println(studentName + " enrolled in " + courseName);

        // Calculating GPA (Randomized for demonstration)
        Random rand = new Random();
        GPA = 2.0 + (rand.nextDouble() * 2.0); // Generates GPA between 2.0 and 4.0
        System.out.println("GPA calculated: " + GPA);

        // Display Student Info
        System.out.println("Student ID: " + studentID + ", Name: " + studentName + ", Age: " + studentAge + ", GPA: " + GPA);
        System.out.println("Courses Enrolled: " + coursesEnrolled);

       
    }
}
