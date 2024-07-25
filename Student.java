
/**
 * The Student Class contains seven attributes which at last displays it's informstion.
 *
 * @author (Anjan Giri)
 * @version (1)
 */
public class Student
{
    //Declaring the variables
    private int enrollmentId;
    private String dateOfBirth;
    private String courseName;
    private String studentName;
    private String dateOfEnrollment;
    private int courseDuration;
    private int tuitionFee;
    
    //creating a constructor Student with "dateOfBirth,studentName,courseDuration,tuitionFee" as its parameters.
    public Student (String dateOfBirth, String studentName, int courseDuration,int tuitionFee)
    {
        this.dateOfBirth = dateOfBirth;
        this.studentName = studentName;
        this.courseDuration = courseDuration;
        this.tuitionFee = tuitionFee;
        this.courseName = ""; //setting the value to empty string
        this.dateOfEnrollment = ""; //setting the value to empty string
        this.enrollmentId = 0; //setting the value to 0
    }
    
    // creating accessor methods of every variables
    public int getEnrollmentId()
    {
        return enrollmentId;
    }
    
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
    
    public String getCourseName()
    {
        return courseName;
    }
    
    public String getStudentName()
    {
        return studentName;
    }  
    
    public String getDateOfEnrollment()
    {
        return dateOfEnrollment;
    }
      
    public int getCourseDuration()
    {
        return courseDuration;
    }
    
    public int getTuitionFee()
    {
        return tuitionFee;
    }

    
    //creating mutator methods
    public void setNewCourseName(String newCourseName) 
    {
        this.courseName = newCourseName;
    }

    public void setNewEnrollmentId(int newEnrollmentId) 
    {
        this.enrollmentId = newEnrollmentId;
    }

    public void setNewDateOfEnrollment(String newDateOfEnrollment) 
    {
        this.dateOfEnrollment = newDateOfEnrollment;
    }
    
    
    public void setNewDateOfBirth(String newDateOfBirth) 
    {
        this.dateOfBirth = newDateOfBirth;
    }
    
    public void setNewStudentName(String newStudentName) 
    {
        this.studentName = newStudentName;
    }
    
    public void setNewCourseDuration(int newCourseDuration) 
    {
        this.courseDuration = newCourseDuration;
    }
    
    public void setNewTuitionFee(int newTuitionFee) 
    {
        this.tuitionFee = newTuitionFee;
    }
    
    // creating a method for displaying data and infotmation provided.
    public void printInfo()
    {
        
        if ( dateOfBirth == "" || studentName == "" || courseDuration == 0 || tuitionFee == 0 || enrollmentId == 0 || courseName == "" || dateOfEnrollment == "" ) {
            System.out.println ("All parameters have not been set.");
        }
        else {
        System.out.println (" Enrollment Id = " + enrollmentId);
        System.out.println (" Date Of Birth  = " + dateOfBirth);
        System.out.println (" Course Name = " + courseName);
        System.out.println (" Student Name = " + studentName);
        System.out.println (" Years Enrolled = " + dateOfEnrollment);
        System.out.println (" Course Duration = " + courseDuration);
        System.out.println (" Tuition Fee = " + tuitionFee);
        }
    }
    
}
