import java.io.*;
import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {

        String studentID = "001";
        String studentName = "Derrick Agyei Kyeremeh";
        int studentAge = 21;
        List<String> coursesEnrolled = new ArrayList<>();
        double GPA;

    
        String courseName = "(DBIT101) - Principles of Programming(Java)  , (PLC107) - African Studies";
        int courseCredits = 3;
        
        coursesEnrolled.add(courseName);
        System.out.println(studentName + "  " + courseName);

        Random rand = new Random();
        GPA = 3.0 + (rand.nextDouble() * 1.5); 
        System.out.println("GPA calculated: " + GPA);
        
        System.out.println("Student ID: " + studentID);  
        System.out.println("Name: " + studentName);  
        System.out.println("Age: " + studentAge);  
        System.out.println("GPA: " + GPA);  
        System.out.println("Courses Enrolled: " + courseName); 

       
    }
}
