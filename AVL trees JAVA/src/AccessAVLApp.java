import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
/**
 * the class represent an AVL tree for student information provided in the oklist.txt to check 
 *is a student is allowed to access campus. 
 * @author MOTAUNG KARABELO
 * 17 April 2021
 */

public class AccessAVLApp {
    /**
    *creates an object for AVL tree
    */
    public static AVLTree tree = new AVLTree();
    
    /**
    *the main method used to create and retrieve the information from the tree and give user output to check if the student qualifies to enter campus
    *@param args is a list of student being checked against the system 
    */
    public static void main(String[] args){
        create();
        if (args.length == 1){
            String key = args[0];
            StudentInformation e = tree.printStudent(key);
            if (e != null) {
                System.out.println(tree.printStudent(key).getStudentName());
                image();
                //System.out.println(tree.findCount);
                //tree.findcount = 0;
            }else{
                System.out.println("Access denied!");
            }
        }else if(args.length == 0){
            tree.printAllStudents();
            //System.out.println(tree.insertCount)
        }
    }
    
    /**
    *This method creates an AVL tree using the data for the oklist.txt
    */
    public static void create(){
        Scanner input = null;

        try {
            input = new Scanner(new FileInputStream("/home/biggie/Desktop/Assignment 2/data/oklist.txt"));

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);
        }

        String line = null;
        int i = 0;
        while (input.hasNextLine()) {
            line = input.nextLine();
            tree.insert(new StudentInformation(line.substring(0,9), line.substring(10,line.length())));
        }
    }
    /**
    *method displays an image used as a part of creativity
    */
    public static void image(){
    	File f = new File("/home/biggie/Desktop/Assignment 2/data/UCT.jpeg");
    	Desktop d = Desktop.getDesktop();
    	try {
           d.open(f);

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
    
    
    
    
    
    
    
    
    
    
}
