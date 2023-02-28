import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * this claas creates a traditional array to store and retrieve student information data.
 *
 * @author MOTAUNG KARABELO.
 */
public class AccessArrayApp{
    public static StudentInformation[] students = new StudentInformation[5000];
   public static void main(String[] args){
       read();
       if (args.length == 1){
           String key = args[0];
           String e = printStudent(key);
           if (e != null) {
               System.out.println(printStudent(key));
           }else{
               System.out.println("Access denied!");
           }
       }else if(args.length == 0){
           printAllStudents();
       }
    }

    /**
     * The method performs an action in the Studentinformation Array to extract a student with a matching studentID
     * @param studentID is the ID we are searching in the Array.
     * @return returns the name of the student if studentID matches or 'Access denied!' if not.
     */
    public static String printStudent(String studentID){
        for(int i = 0; i < students.length;i++){
            if (students[i].getKey().equals(studentID)){
                return students[i].getStudentName();
             }
        }
        return "Access denied!";
    }

    /**
     * The method prints all the sudent infor stored in the StudentInformation Array.
     */
    public static void printAllStudents(){
      for (int i =0; i < students.length;i++){
          System.out.println(students[i].toString());
      }

    }

    /**
     * the method reads the data from oklist.txt and add the data in StudentIformation Array.
     */
    public static void read() {
        Scanner input = null;

        try {
            input = new Scanner(new FileInputStream("/home/biggie/Desktop/Assignment/Data/oklist.txt"));

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);
        }

        String line = null;
        int i = 0;
        while (input.hasNextLine()) {
            line = input.nextLine();
            students[i] = new StudentInformation(line.substring(0,9), line.substring(10,line.length()));
            i++;
        }
    }


}