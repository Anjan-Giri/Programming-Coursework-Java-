
/**
 * Regular class is a sub class of Student class and contains four attributes and at last displays required information.
 *
 * @author (Anjan Giri)
 * @version (2)
 */
public class Regular extends Student
{
    //Declaring the variables
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;
    
    public Regular (int enrollmentId, String dateOfBirth, String courseName, String studentName, String dateOfEnrollment, int courseDuration, int tuitionFee, int numOfModules, int numOfCreditHours, double daysPresent)
    {
        
        super(dateOfBirth,studentName,courseDuration,tuitionFee); // calling the constructor from superclass.
        
        super.setNewCourseName(courseName); // calling the mutator method from superclass.
        super.setNewEnrollmentId(enrollmentId);
        super.setNewDateOfEnrollment(dateOfEnrollment);
        
        this.numOfModules = numOfModules;
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent = daysPresent;
        this.isGrantedScholarship = false;
    }
    
    public int getNumOfModules()
    {
        return numOfModules;
    }
    
    public int getNumOfCreditHours()
    {
        return numOfCreditHours;
    }
    
    public double getDaysPresent()
    {
        return daysPresent;
    }
    
    public boolean getIsGrantedScholarship()
    {
        return isGrantedScholarship;
    } 
    
    
    public double presentPercentage (double daysPresent)
    {
        double presentPercentage = ((daysPresent * 100) / (getCourseDuration() * 30)); // calculating present percentage
        
        if(presentPercentage >= 80) {
            isGrantedScholarship = true;
        }
        else {
            isGrantedScholarship = false;
        }
        return presentPercentage;
    }
    
    public char getAttendance (double presentPercentage)
        {
        
        char grade = 'N'; //initializing the char value
            
        if((getCourseDuration() * 30) < daysPresent) {
            System.out.println ("Error");
        }
        else if(presentPercentage >= 80) {
            grade = 'A';
        }
        else if(presentPercentage >= 60) {
            grade = 'B';
        }
        else if(presentPercentage >= 40) {
            grade = 'C';
        }
        else if(presentPercentage >= 20) {
            grade = 'D';
        }
        else if(presentPercentage < 20) {
            grade = 'E';
        }

        return grade;
    }
    
    public void  grantCertificate (String courseName, int enrollmentId, String dateOfEnrollment)
    {
        System.out.println (" Course Name = " + courseName );
        System.out.println (" Enrollment ID = " + enrollmentId );
        System.out.println (" Date Of Enrollment = " + dateOfEnrollment);
        System.out.println (" The student has graduated!!!");
        
        if (isGrantedScholarship = true) {
            System.out.println ("The scholarship has been granted!!");
        }
    }
    
    public void printInfo()
    {
         super.printInfo();
         System.out.println (" Number Of Modules = " + numOfModules);
         System.out.println (" Number Of Credit Hours = " + numOfCreditHours);
         System.out.println (" Days Present = " + daysPresent);
          
    }
}
       
    

