/**
 * This class contains all the GUI components and contents that are required to operate the program of Student, Regular and Dropout classes
 *
 * @author (Anjan Giri)
 * @version (2023/08/01)
 */

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class StudentGUI implements ActionListener // creating a StudentGUI class that implements ActionListener
{
    //declaribg variables for frames
    JFrame frame1, frame2, frame3;
    //declaribg variables for labels
    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11, lb22, lb33, lb44, lb55, lb66, lb77, lb88, lb99, lb100, lb111, top1, top2;
    //declaribg variables for text fields
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf11, tf22, tf33, tf44, tf55, tf66, tf77, tf88;
    //declaribg variables for buttons
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb10, jb11, jb12;
    //declaribg variables for comboboxes
    JComboBox<String> cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11, cb12, cb13, cb14, cb15;
    // creating an array list of Student class
    ArrayList <Student> studentsList = new ArrayList<Student>();
    
    // Creating a constructor to write all GUI related codes
    public StudentGUI()
    {
        frame1 = new JFrame("Students"); // creating an object for frame (main frame)
        frame2 = new JFrame("Regular Student"); // regular student frame
        frame3 = new JFrame("Dropout Student"); // dropout student frame
        
        //Labels and Text Fields for Regular Student GUI
        
        top1 = new JLabel("REGULAR STUDENT");
        top1.setBounds(483,20,134,50);
        frame2.add(top1);
        
        lb1 = new JLabel("Enrollment ID: "); // creating an object for label
        tf1 = new JTextField(); // creating an object for text field
        lb1.setBounds(550,77,130,30); //setting the position of the label
        tf1.setBounds(693,77,275,30); // setting the position of the text field
        frame2.add(lb1); // adding the label into the frame so that it is displayed
        frame2.add(tf1); // adding the text field into the frame so that it is displayed
        
        lb2 = new JLabel("Course Name: ");
        tf2 = new JTextField();
        lb2.setBounds(58,77,130,30);
        tf2.setBounds(201,77,275,30);
        frame2.add(lb2);
        frame2.add(tf2);
        
        lb3 = new JLabel("Student Name: ");
        tf3 = new JTextField();
        lb3.setBounds(58,278,130,30);
        tf3.setBounds(201,278,275,30);
        frame2.add(lb3);
        frame2.add(tf3);
        
        lb4 = new JLabel("Course Duration: ");
        tf4 = new JTextField();
        lb4.setBounds(550,278,130,30);
        tf4.setBounds(693,278,275,30);
        frame2.add(lb4);
        frame2.add(tf4);
        
        lb5 = new JLabel("Tuition Fee: ");
        tf5 = new JTextField();
        lb5.setBounds(58,345,130,30);
        tf5.setBounds(201,345,275,30);
        frame2.add(lb5);
        frame2.add(tf5);
        
        lb6 = new JLabel("Num Of Modules: ");
        tf6 = new JTextField();
        lb6.setBounds(550,345,130,30);
        tf6.setBounds(693,345,275,30);
        frame2.add(lb6);
        frame2.add(tf6);
        
        lb7 = new JLabel("Num Of Credit Hours: ");
        tf7 = new JTextField();
        lb7.setBounds(550,412,130,30);
        tf7.setBounds(693,412,275,30);
        frame2.add(lb7);
        frame2.add(tf7);
        
        lb8 = new JLabel("Num Of Days Present: ");
        tf8 = new JTextField();
        lb8.setBounds(550,144,130,30);
        tf8.setBounds(693,144,275,30);
        frame2.add(lb8);
        frame2.add(tf8);
        
        
        //Combobox used in Regular GUI
        
        lb9 = new JLabel("Date Of Enrollment: ");
        lb9.setBounds(58,144,130,30);
        frame2.add(lb9);
        
        String a[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"}; // giving values in array that are to be displayed in the combo box
        cb1 = new JComboBox<String>(a); // creating an object for combo box
        cb1.setBounds(201,144,83,32); // setting the position of the combo box
        frame2.add(cb1); // adding the combo box into the frame so that it is displayed
        
        String b[] = {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
        cb2 = new JComboBox<String>(b);
        cb2.setBounds(297,144,83,32);
        frame2.add(cb2);
        
        String c[] = {"2020","2021","2022","2023"};
        cb3 = new JComboBox<String>(c);
        cb3.setBounds(393,144,83,32);
        frame2.add(cb3);
        
        
        lb10 = new JLabel("Date Of Birth: ");
        lb10.setBounds(58,412,130,30);
        frame2.add(lb10);
        
        String d[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"}; 
        cb4 = new JComboBox<String>(d);
        cb4.setBounds(201,412,83,32);
        frame2.add(cb4);
        
        String e[] = {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
        cb5 = new JComboBox<String>(e);
        cb5.setBounds(297,412,83,32);
        frame2.add(cb5);
        
        String f[] = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004"};
        cb6 = new JComboBox<String>(f);
        cb6.setBounds(393,412,83,32);
        frame2.add(cb6);
        
        
        // Buttons Used in Regular GUI
        
        jb1 = new JButton("Add a Regular Student"); // creating an object for button
        jb1.setBounds(469,507,165,39); // setting the position of the button
        frame2.add(jb1); // adding the button into the frame so that it is displayed
        
        jb2 = new JButton("Present Percentage");
        jb2.setBounds(819,206,149,32);
        frame2.add(jb2);
        
        jb3 = new JButton("Grant Certificate");
        jb3.setBounds(58,211,149,32);
        frame2.add(jb3);
        
        jb4 = new JButton("Display");
        jb4.setBounds(239,507,165,39);
        frame2.add(jb4);
        
        jb5 = new JButton("Clear");
        jb5.setBounds(703,507,165,39);
        frame2.add(jb5);
        
        //adding action listener to the buttons
        jb1.addActionListener(this); 
        jb2.addActionListener(this);
        jb3.addActionListener(this); 
        jb4.addActionListener(this);
        jb5.addActionListener(this);
        
        
        //Labels and Text Fields for Dropout Student GUI
        
        top2 = new JLabel("DROPOUT STUDENT");
        top2.setBounds(483,20,134,50);
        frame3.add(top2);
        
        lb11 = new JLabel("Enrollment ID: ");
        tf11 = new JTextField();
        lb11.setBounds(560,82,179,30);
        tf11.setBounds(764,82,275,30);
        frame3.add(lb11);
        frame3.add(tf11);
        
        lb22 = new JLabel("Course Name: ");
        tf22 = new JTextField();
        lb22.setBounds(68,87,130,30);
        tf22.setBounds(211,87,275,30);
        frame3.add(lb22);
        frame3.add(tf22);
        
        lb33 = new JLabel("Student Name: ");
        tf33 = new JTextField();
        lb33.setBounds(68,288,130,30);
        tf33.setBounds(211,288,275,30);
        frame3.add(lb33);
        frame3.add(tf33);
        
        lb44 = new JLabel("Course Duration: ");
        tf44 = new JTextField();
        lb44.setBounds(560,288,179,30);
        tf44.setBounds(763,290,275,30);
        frame3.add(lb44);
        frame3.add(tf44);
        
        lb55 = new JLabel("Tuition Fee: ");
        tf55 = new JTextField();
        lb55.setBounds(68,355,130,30);
        tf55.setBounds(211,355,275,30);
        frame3.add(lb55);
        frame3.add(tf55);
        
        lb66 = new JLabel("Num Of Remaining Modules: ");
        tf66 = new JTextField();
        lb66.setBounds(560,355,179,30);
        tf66.setBounds(764,357,275,30);
        frame3.add(lb66);
        frame3.add(tf66);
        
        lb77 = new JLabel("Remaining Amount: ");
        tf77 = new JTextField();
        lb77.setBounds(560,422,179,30);
        tf77.setBounds(764,424,275,30);
        frame3.add(lb77);
        frame3.add(tf77);
        
        lb88 = new JLabel("Num Of Months Attended: ");
        tf88 = new JTextField();
        lb88.setBounds(560,489,179,30);
        tf88.setBounds(764,491,275,30);
        frame3.add(lb88);
        frame3.add(tf88);
        
        //Combobox use in Dropout GUI
        
        lb99 = new JLabel("Date Of Enrollment: ");
        lb99.setBounds(68,154,130,30);
        frame3.add(lb99);
        
        String g[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"}; 
        cb7 = new JComboBox<String>(g);
        cb7.setBounds(211,154,83,32);
        frame3.add(cb7);
        
        String h[] = {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
        cb8 = new JComboBox<String>(h);
        cb8.setBounds(307,154,83,32);
        frame3.add(cb8);
        
        String i[] = {"2020","2021","2022","2023"};
        cb9 = new JComboBox<String>(i);
        cb9.setBounds(403,154,83,32);
        frame3.add(cb9);
        
        
        lb100 = new JLabel("Date Of Birth: ");
        lb100.setBounds(68,422,130,30);
        frame3.add(lb100);
        
        String j[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"}; 
        cb10 = new JComboBox<String>(j);
        cb10.setBounds(211,422,83,32);
        frame3.add(cb10);
        
        String k[] = {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
        cb11 = new JComboBox<String>(k);
        cb11.setBounds(307,422,83,32);
        frame3.add(cb11);
        
        String l[] = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004"};
        cb12 = new JComboBox<String>(l);
        cb12.setBounds(403,422,83,32);
        frame3.add(cb12);
        
        
        lb111 = new JLabel("Date Of Dropout: ");
        lb111.setBounds(68,489,130,30);
        frame3.add(lb111);
        
        String m[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"}; 
        cb13 = new JComboBox<String>(m);
        cb13.setBounds(211,491,83,32);
        frame3.add(cb13);
        
        String n[] = {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
        cb14 = new JComboBox<String>(n);
        cb14.setBounds(307,491,83,32);
        frame3.add(cb14);
        
        String o[] = {"2021","2022","2023"};
        cb15 = new JComboBox<String>(o);
        cb15.setBounds(403,491,83,32);
        frame3.add(cb15);
        
        
        //Buttons used in Dropout GUI
        
        jb6 = new JButton("Add a Dropout Student");
        jb6.setBounds(467,582,165,39);
        frame3.add(jb6);
        
        jb7 = new JButton("Pay Bills");
        jb7.setBounds(912,152,128,32);
        frame3.add(jb7);
        
        jb8 = new JButton("Remove Student");
        jb8.setBounds(764,152,128,32);
        frame3.add(jb8);
        
        jb9 = new JButton("Display");
        jb9.setBounds(231,582,165,39);
        frame3.add(jb9);
        
        jb10 = new JButton("Clear");
        jb10.setBounds(703,582,165,39);
        frame3.add(jb10);
        
        //adding action listener to the buttons
        jb6.addActionListener(this); 
        jb7.addActionListener(this);
        jb8.addActionListener(this); 
        jb9.addActionListener(this);
        jb10.addActionListener(this); 
        
        
        //Buttons used on Frame1
        
        jb11 = new JButton("Regular Student");
        jb11.setBounds(47,37,131,32);
        frame1.add(jb11);
        
        jb12 = new JButton("Dropout Student");
        jb12.setBounds(222,37,131,32);
        frame1.add(jb12);
        
        //adding action listener to the buttons
        jb11.addActionListener(this); 
        jb12.addActionListener(this);
        
        
        frame1.setLayout(null); // assigning null layout to the frame so that its components can be positioned manually
        frame1.setSize(400,150); // setting the size of the frame
        frame1.setVisible(true); // visibility of the frame to true to display it
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame2.setLayout(null);
        frame2.setSize(1100,800);
        frame2.setVisible(false);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame3.setLayout(null);
        frame3.setSize(1100,800);
        frame3.setVisible(false);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    // creating a main method to call the GUI constructor
    public static void main(String[]args)
    {
        new StudentGUI(); // calling the constructor through main method
    }
    
    // overriding the actionPerformed method to make the buttons functional
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == jb11) // giving condition to check if given button is pressed
        {
            frame2.setVisible(true); // setting the visibility of frame2 to true
        }
        else if (e.getSource() == jb12)// giving condition to check if given button is pressed
        {
            frame3.setVisible(true); // setting the visibility of frame3 to true
        }
        
        
        try
        {
            if (e.getSource() == jb1) // giving condition to check if given button is pressed
            {
                // checking if the text fields are empty
                if(tf1.getText().isEmpty() && tf2.getText().isEmpty() && tf3.getText().isEmpty() && tf4.getText().isEmpty() && tf5.getText().isEmpty() && tf6.getText().isEmpty() && tf7.getText().isEmpty() && tf8.getText().isEmpty())
                {
                    // displaying message in a dialog box
                    JOptionPane.showMessageDialog(frame2,"Please fill all the details","Details not filled",JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    // checking if the values entered are of suitable type or not
                    Integer.parseInt(tf1.getText());
                    Integer.parseInt(tf4.getText());
                    Integer.parseInt(tf5.getText());
                    Integer.parseInt(tf6.getText());
                    Integer.parseInt(tf7.getText());
                    Integer.parseInt(tf8.getText());
                    
                    // reading the text entered in the text fields
                    int enrollmentId = Integer.parseInt(tf1.getText());
                    String courseName = tf2.getText();
                    String studentName = tf3.getText();
                    int courseDuration = Integer.parseInt(tf4.getText());
                    int tuitionFee = Integer.parseInt(tf5.getText());
                    int numOfModules = Integer.parseInt(tf6.getText());
                    int numOfCreditHours = Integer.parseInt(tf7.getText());
                    int daysPresent = Integer.parseInt(tf8.getText());
                    
                    // reading the data selected in the combo box
                    String cb1v = (String) cb1.getSelectedItem();
                    String cb2v = (String) cb2.getSelectedItem();
                    String cb3v = (String) cb3.getSelectedItem();
                    String cb4v = (String) cb4.getSelectedItem();
                    String cb5v = (String) cb5.getSelectedItem();
                    String cb6v = (String) cb6.getSelectedItem();
                    
                    String dateOfEnrollment = cb1v + " / " + cb2v + " / "  + cb3v; 
                    String dateOfBirth = cb4v + " / " + cb5v + " / "  + cb6v;
                    
                    // making a students object of Regular class
                    Regular students = new Regular(enrollmentId, dateOfBirth, courseName, studentName, dateOfEnrollment, courseDuration, tuitionFee, numOfModules, numOfCreditHours, daysPresent);
                    studentsList.add(students); // adding object to the array list 
                    JOptionPane.showMessageDialog(frame1,"Student added!!","Success",JOptionPane.INFORMATION_MESSAGE); // showing message in a dialog box
                    
                }
            }
        }
        catch(NumberFormatException ex) // catching the exception of number format
        {
            JOptionPane.showMessageDialog(frame2,"Please enter valid datatype","Invalid Datatype",JOptionPane.WARNING_MESSAGE); // showing message in a dialog box
        }
        
        try
        {
            if (e.getSource() == jb2)
            {
                if(tf1.getText().isEmpty() && tf8.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(frame2,"Please give 'Enrollment ID' and 'Present Days'","Details not filled",JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    Integer.parseInt(tf1.getText());
                    Integer.parseInt(tf8.getText());
                    
                    int enrollmentId = Integer.parseInt(tf1.getText());
                    int daysPresent = Integer.parseInt(tf8.getText());
                    
                    // initializing regularStudent to null
                    Regular regularStudent = null;
                    // checking if the student is present in the list
                    for (Student student : studentsList)
                    {
                        if (student instanceof Regular && student.getEnrollmentId() == enrollmentId)
                        {
                            regularStudent = (Regular) student;
                            break;
                        }
                    }
                    // condition when regular student is not null
                    if (regularStudent != null)
                    {
                        double presentPercentage = regularStudent.presentPercentage(daysPresent); // calling the method from Regular class

                        // Display the present percentage in a dialog box
                        JOptionPane.showMessageDialog(frame2, "Present Percentage: " + String.format("%.2f",presentPercentage) + "%", "Regular Student's Present Percentage", JOptionPane.INFORMATION_MESSAGE);
                    }
                    // if the student is not found
                    else
                    {
                        JOptionPane.showMessageDialog(frame2, "No Regular student found with the provided Enrollment ID", "Student not found", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        }
        catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(frame2, "Please enter valid datatype for Enrollment ID and Present Days", "Invalid Datatype", JOptionPane.WARNING_MESSAGE);
        }

        try
        {
            if (e.getSource() == jb3)
            {
                if(tf1.getText().isEmpty() && tf2.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(frame2,"Please give 'Enrollment ID' and 'Course Name'","Details not filled",JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    int enrollmentId = Integer.parseInt(tf1.getText());
                    String courseName = tf2.getText();
                    
                    String cb1v = (String) cb1.getSelectedItem();
                    String cb2v = (String) cb2.getSelectedItem();
                    String cb3v = (String) cb3.getSelectedItem();
                    
                    String dateOfEnrollment = cb1v + " / " + cb2v + " / "  + cb3v;
                    

                    // Searching Regular student with the provided Enrollment ID
                    Regular regularStudent = null;
                    for (Student student : studentsList)
                    {
                        if (student instanceof Regular && student.getEnrollmentId() == enrollmentId)
                        {
                            regularStudent = (Regular) student;
                            break;
                        }
                    }
                    // condition when regularStudent is not null
                    if (regularStudent != null)
                    {
                        // Calling the grantCertificate method 
                        regularStudent.grantCertificate(courseName, enrollmentId, dateOfEnrollment);

                        // Display a confirmation dialog for the certificate granted
                        JOptionPane.showMessageDialog(frame2, "Certificate for: " + courseName + "\n Enrollment ID: " + enrollmentId + 
                            "\n Date Of Enrollment: " + dateOfEnrollment, "Certificate Granted", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(frame2, "No Regular student found with the provided Enrollment ID", "Student not found", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        }
        catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(frame2, "Please enter valid datatype for Enrollment ID", "Invalid Datatype", JOptionPane.WARNING_MESSAGE);
        }

        
        try
        {
            if (e.getSource() == jb4)
            {   
                Integer.parseInt(tf1.getText());
                Integer.parseInt(tf4.getText());
                Integer.parseInt(tf5.getText());
                Integer.parseInt(tf6.getText());
                Integer.parseInt(tf7.getText());
                Integer.parseInt(tf8.getText());
                
                int enrollmentId = Integer.parseInt(tf1.getText());
                String courseName = tf2.getText();
                String studentName = tf3.getText();
                int courseDuration = Integer.parseInt(tf4.getText());
                int tuitionFee = Integer.parseInt(tf5.getText());
                int numOfModules = Integer.parseInt(tf6.getText());
                int numOfCreditHours = Integer.parseInt(tf7.getText());
                int daysPresent = Integer.parseInt(tf8.getText());
                
                String cb1v = (String) cb1.getSelectedItem();
                String cb2v = (String) cb2.getSelectedItem();
                String cb3v = (String) cb3.getSelectedItem();
                String cb4v = (String) cb4.getSelectedItem();
                String cb5v = (String) cb5.getSelectedItem();
                String cb6v = (String) cb6.getSelectedItem();
                
                String dateOfEnrollment = cb1v + " / " + cb2v + " / " + " / " + cb3v; 
                String dateOfBirth = cb4v + " / " + cb5v + " / " + " / " + cb6v;
                
                // displaying all information in a dialog box                
                JOptionPane.showMessageDialog(frame2, " Enrollment ID: " + enrollmentId + "\n Course Name: " + courseName + "\n Student Name: " + studentName + 
                    "\n Course Duration: " + courseDuration + "\n Tuition Fees: " + tuitionFee + "\n Number of Modules: " + numOfModules + "\n Number of Credit Hours: "
                    + numOfCreditHours + "\n Present Days: " + daysPresent + "\n Date Of Enrollment: " + dateOfEnrollment + "\n Date Of Birth: " + dateOfBirth,
                    "Student Details", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(frame2,"Please enter valid datatype","Invalid Datatype",JOptionPane.WARNING_MESSAGE);
        }
        
        if (e.getSource() == jb5)
        {
            // clearing each and every text fields
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            tf6.setText("");
            tf7.setText("");
            tf8.setText("");
        }
        
        
        try
        {
            if (e.getSource() == jb6)
            {
                if(tf11.getText().isEmpty() && tf22.getText().isEmpty() && tf33.getText().isEmpty() && tf44.getText().isEmpty() && tf55.getText().isEmpty() && tf66.getText().isEmpty() && tf77.getText().isEmpty() && tf88.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(frame3,"Please fill all the details","Details not filled",JOptionPane.WARNING_MESSAGE);
                }
                else
                    {
                        Integer.parseInt(tf11.getText());
                        Integer.parseInt(tf44.getText());
                        Integer.parseInt(tf55.getText());
                        Integer.parseInt(tf66.getText());
                        Integer.parseInt(tf77.getText());
                        Integer.parseInt(tf88.getText());
                        
                        int enrollmentId = Integer.parseInt(tf11.getText());
                        String courseName = tf22.getText();
                        String studentName = tf33.getText();
                        int courseDuration = Integer.parseInt(tf44.getText());
                        int tuitionFee = Integer.parseInt(tf55.getText());
                        int numOfRemainingModules = Integer.parseInt(tf66.getText());
                        int numOfMonthsAttended = Integer.parseInt(tf77.getText());
                        int remainingAmount = Integer.parseInt(tf88.getText());
                        
                        
                        String cb7v = (String) cb7.getSelectedItem();
                        String cb8v = (String) cb8.getSelectedItem();
                        String cb9v = (String) cb9.getSelectedItem();
                        String cb10v = (String) cb10.getSelectedItem();
                        String cb11v = (String) cb11.getSelectedItem();
                        String cb12v = (String) cb12.getSelectedItem();
                        String cb13v = (String) cb13.getSelectedItem();
                        String cb14v = (String) cb14.getSelectedItem();
                        String cb15v = (String) cb15.getSelectedItem();
                        
                        String dateOfEnrollment = cb7v + " / " + cb8v + " / " + " / " + cb9v; 
                        String dateOfBirth = cb10v + " / " + cb11v + " / " + " / " + cb12v;
                        String dateOfDropout = cb13v + " / " + cb14v + " / " + " / " + cb15v;
                        
                        // creating object of Dropout class
                        Dropout students = new Dropout (dateOfBirth, studentName, courseDuration, tuitionFee, numOfRemainingModules, numOfMonthsAttended, dateOfDropout);
                        studentsList.add(students); // adding students in the array list
                        students.setNewEnrollmentId(enrollmentId); // calling the setter method from Dropout class
                        students.setNewCourseName(courseName);
                        students.setNewDateOfEnrollment(dateOfEnrollment);
                        studentsList.add(students);
                        JOptionPane.showMessageDialog(frame1,"Student added!!","Success",JOptionPane.INFORMATION_MESSAGE);
                    }
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(frame3,"Please enter valid datatype","Invalid Datatype",JOptionPane.WARNING_MESSAGE);
        }
        
        try
        {
            if (e.getSource() == jb7)
            {
                if(tf11.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(frame3,"Please give Enrollment ID","Details not filled",JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    
                    Integer.parseInt(tf11.getText());
                    int enrollmentId = Integer.parseInt(tf11.getText());
                    boolean f = false; // initializing f to false
                        // Searching Dropout student with the provided Enrollment ID
                        for (Student student : studentsList)
                        {
                            if (student instanceof Dropout && student.getEnrollmentId() == enrollmentId )
                            {
                                Dropout dropoutStudent = (Dropout) student;
                                dropoutStudent.billsPayable(); // calling billsPayable method from Dropout class
                                    
                
                                f = true; // setting value of f to true
                                // chechking the haspaid condition from dropout class
                                if (dropoutStudent.getHasPaid())
                                {
                                    studentsList.remove(student);
                                    JOptionPane.showMessageDialog(frame3, "Bills paid for Dropout Student", "Success", JOptionPane.INFORMATION_MESSAGE);
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(frame3,"Failed","Error",JOptionPane.ERROR_MESSAGE);
                                }
                                break;
                            }    
                        }
                        // if the student is not found
                        if(!f)
                        {
                            JOptionPane.showMessageDialog(frame3, "Student with provided ID is not a Dropout Student", "Invalid Student Type", JOptionPane.WARNING_MESSAGE);
                        }
                }        
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(frame2,"Please enter valid datatype","Invalid Datatype",JOptionPane.WARNING_MESSAGE);
        }
    
        try
        {
            if (e.getSource() == jb8)
            {
                if(tf11.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(frame3,"Please give Enrollment ID","Details not filled",JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    Integer.parseInt(tf11.getText());
                    int enrollmentId = Integer.parseInt(tf11.getText());
                    boolean f_ = false;
                    // Searching Dropout student with the provided Enrollment ID
                    for (Student students : studentsList)
                    {
                        if (students instanceof Dropout && students.getEnrollmentId() == enrollmentId)
                        {
                            // If a DropoutStudent with the given enrollment ID is found, remove it from the list
                            Dropout studentsList = (Dropout) students;                            
                            studentsList.removeStudent();
                            f_ = true;
                            break;
                        }
                    }
    
                    if (f_)
                    {
                        // Display success message if the student was found and removed
                        JOptionPane.showMessageDialog(frame3, "Dropout Student with Enrollment ID " + enrollmentId + " removed", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        // Display error message if the student with the given enrollment ID was not found
                        JOptionPane.showMessageDialog(frame3, "Dropout Student with Enrollment ID " + enrollmentId + " not found", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(frame2,"Please enter valid datatype","Invalid Datatype",JOptionPane.WARNING_MESSAGE);
        }
            
        try
        {
            if (e.getSource() == jb9)
            {
                Integer.parseInt(tf11.getText());
                Integer.parseInt(tf44.getText());
                Integer.parseInt(tf55.getText());
                Integer.parseInt(tf66.getText());
                Integer.parseInt(tf77.getText());
                Integer.parseInt(tf88.getText());
                
                int enrollmentId = Integer.parseInt(tf11.getText());
                String courseName = tf22.getText();
                String studentName = tf33.getText();
                int courseDuration = Integer.parseInt(tf44.getText());
                int tuitionFee = Integer.parseInt(tf55.getText());
                int numOfRemainingModules = Integer.parseInt(tf66.getText());
                int numOfMonthsAttended = Integer.parseInt(tf77.getText());
                int remainingAmount = Integer.parseInt(tf88.getText());
                
                
                String cb7v = (String) cb7.getSelectedItem();
                String cb8v = (String) cb8.getSelectedItem();
                String cb9v = (String) cb9.getSelectedItem();
                String cb10v = (String) cb10.getSelectedItem();
                String cb11v = (String) cb11.getSelectedItem();
                String cb12v = (String) cb12.getSelectedItem();
                String cb13v = (String) cb13.getSelectedItem();
                String cb14v = (String) cb14.getSelectedItem();
                String cb15v = (String) cb15.getSelectedItem();
                
                String dateOfEnrollment = cb7v + " / " + cb8v + " / " + " / " + cb9v; 
                String dateOfBirth = cb10v + " / " + cb11v + " / " + " / " + cb12v;
                String dateOfDropout = cb13v + " / " + cb14v + " / " + " / " + cb15v;
                
                
                JOptionPane.showMessageDialog(frame2, " Enrollment ID: " + enrollmentId + "\n Course Name: " + courseName + "\n Student Name: " + studentName + 
                    "\n Course Duration: " + courseDuration + "\n Tuition Fees: " + tuitionFee + "\n Number of Remaining Modules: " + numOfRemainingModules + 
                    "\n Number of Months Attended: " + numOfMonthsAttended + "\n Remaining Amount: " + remainingAmount + "\n Date Of Enrollment: " + dateOfEnrollment +
                    "\n Date Of Birth: " + dateOfBirth + "\n Date Of Dropout: " + dateOfDropout, "Student Details", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(frame2,"Please enter valid datatype","Invalid Datatype",JOptionPane.WARNING_MESSAGE);
        }
        
        if (e.getSource() == jb10)
        {
            // clearing all the text fields
            tf11.setText("");
            tf22.setText("");
            tf33.setText("");
            tf44.setText("");
            tf55.setText("");
            tf66.setText("");
            tf77.setText("");
            tf88.setText("");
        }   
    }
}
