
/**
 * Dropout class is a subclass of the Student class and contains five attributes and at last displays the required information.
 *
 * @author (Anjan Giri)
 * @version (3)
 */


public class Dropout extends Student
{
    //Declaring the variables
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;
    
    public Dropout (String dateOfBirth, String studentName, int courseDuration, int tuitionFee, int numOfRemainingModules, int numOfMonthsAttended, String dateOfDropout)
    {
        
        super(dateOfBirth,studentName,courseDuration,tuitionFee);
        
        super.setNewEnrollmentId(0);
        super.setNewCourseName("");
        super.setNewDateOfEnrollment("");
        
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        this.remainingAmount = 0;
        this.hasPaid = false;
    }
    
    public int getNumOfRemainingModules()
    {
        return numOfRemainingModules;
    }
    
    public int getNumOfMonthsAttended()
    {
        return numOfMonthsAttended;
    }
    
    public String getDateOfDropout()
    {
        return dateOfDropout;
    }
    
    public int getRemainingAmount()
    {
        return remainingAmount;
    }
    
    public boolean getHasPaid()
    {
        return hasPaid;
    }
    
    public int billsPayable()
    {
        remainingAmount = ((getCourseDuration() - numOfMonthsAttended) * getTuitionFee()); //way of calculating the remaining amount.
        hasPaid = true;
        
        return remainingAmount;
    }
    
    
    public void removeStudent()
    {
        if (hasPaid = true) {
            super.setNewDateOfBirth("");
            super.setNewCourseName("");
            super.setNewStudentName("");
            super.setNewDateOfEnrollment("");
            super.setNewCourseDuration(0);
            super.setNewTuitionFee(0);
            this.dateOfDropout = "";
            
            super.setNewEnrollmentId(0);
            this.numOfRemainingModules = 0;
            this.numOfMonthsAttended = 0;
            this.remainingAmount = 0;
        }
        else {
            System.out.println ("All bills not cleared");
        }   
    }    
        
    
    public void printInfo()
    {
        super.printInfo();
        System.out.println (" Number Of Remaining Modules = " + numOfRemainingModules);
        System.out.println (" Number Of Months Attended = " + numOfMonthsAttended);
        System.out.println (" Date Of Dropout = " + dateOfDropout);
        System.out.println (" Remaining Amount = " + remainingAmount);
    }
}

