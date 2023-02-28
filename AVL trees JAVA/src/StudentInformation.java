import java.util.Scanner;
import java.io.*;

/**
*The class represents a Student class,
*where a student has a name and a student number or key.
*Student number or key is unique to one student.
*@author Karabelo Motaung
*/
public class StudentInformation {
   
    private String key;
    private String studentName;
    
    /**
    *constructs and initialises student key and student name 
    *@param key is the student number and it is unique to one student
    *@param studentName is the name of the student
    */
    public StudentInformation(String key, String studentName){
	this.key = key;
	this.studentName = studentName;
    }
   
    /**
    *A getter method to get student key or student number
    *@return returns student key
    */
    public String getKey(){return this.key;}
    
    /**
    *A getter method to get student name
    *@return returns student name
    */
    public String getStudentName(){return this.studentName;}

    /**
    *the toString method combines the student key and student name to return 
    *a better name-key relationship to the user
    *@return returns student key and student name in the format "Student key, studentName."
    */
    public String toString(){
      return  getKey() + ", " + getStudentName() + ".";

    }
    
    /**
    *the compare to method compares the data of a student with other student
    *it uses student key to compare student data, since student key is unique.
    *@param info is the data of other student being compared to
    *@return returns 0 if the students matches or, 
    *-1 if the student lexicographically comes first, or 
    *1 if comes after. 
    */
    public int compareTo(StudentInformation info){
        return this.key.compareTo(info.getKey());

    }
}