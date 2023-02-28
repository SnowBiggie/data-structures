/**
 * the class represent a Student class,
 * where a Student has a name and Student number.
 * Student Number/key is unique to one Student.
 *
 * @author MOTAUNG KARABELO uthor
 */
public class StudentInformation {
   
    private String key;
    private String studentName;

    /**
     * Construct and initializes Student number and Student name.
     * @param key is a Student number.
     * @param studentName is a placeholder for the name of the Student.
     */

    public StudentInformation(String key, String studentName){
	this.key = key;
	this.studentName = studentName;
    }

    /**
     * @return returns current key.
     */
    public String getKey(){return this.key;}

    /**
     *
     * @return returns current student name.
     */
    public String getStudentName(){return this.studentName;}

    /**
     * Overrides the toString methods
     * @return prints out student information (MTNKAR007, Karabelo Motaung).
     */
    public String toString(){
      return  getKey() + ", " + getStudentName() + ".";

    }

    /**
     * The mothod compare a Student with other student,
     * using the Student number as a dterminer
     * @param other is other Student you're comparing to.
     * @return return 0 if info is actually the student in mind,
     * or negative number if other student comes first,
     * or apositive number if other student comes last.
     */
   public int compareTo(StudentInformation other){
        return this.key.compareTo(other.getKey());

    }


	public void setKey(String key) {
		this.key = key;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}