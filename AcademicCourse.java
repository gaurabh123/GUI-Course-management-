/*this class is the subclass of the class Course
this class inherits some property of the class Course*/

public class AcademicCourse extends Course // 'extends' keyword helps in inheritance
{
    private String LecturerName;  // 'private' is an access modifier which tells that this varaible can only be accessed from  within the class 
    private String Level;
    private String Credit;  // 'private' is an access modifier which tells that this varaible can only be accessed from  within the class 
    private String StartingDate; // 'private' is an access modifier which tells that this varaible can only be accessed from  within the class 
    private String CompletionDate;
    private int NumberofAssesments;
    private boolean isRegistered;  // 'private' is an access modifier which tells that this varaible can only be accessed from  within the class 
    
    //creating constructor for the class AcademicCourse, this constructor has 6 parameters
    public AcademicCourse(String CourseID,String CourseName, int duration, String Level, String Credit, int NumberofAssesments )
    {
        super(CourseID, CourseName, duration); //use of 'super' keyword to call the constructor of parent class(Course)
        this.Level = Level; //using 'this' as the name of instance and local variables are same
        this.NumberofAssesments=NumberofAssesments;
        this.Credit = Credit; //using 'this' as the name of instance and local variables are same
        LecturerName = "";
        StartingDate = "";
        CompletionDate = "";
        isRegistered = false;  
    }
    //getter(accessor) methods for the corresponding attributes/variables
    public String getLevel()
    {
        return Level;     //return          statement helps in returning the value from the method
    }
    public int getNumberofAssesments()
    {
        return NumberofAssesments; //return statement helps in returning the value from the method
    }
    public String getCredit()
    {
        return Credit;    //return statement helps in returning the value from the method
    }
    public String getLecturerName()
    {
        return LecturerName;    //return statement helps in returning the value from the method
    }
    public String getStartingDate()
    {
        return StartingDate;    //return statement helps in returning the value from the method
    }
    public String getCompletionDate()
    {
        return CompletionDate;   //return statement helps in returning the value from the method
    }
    public boolean getisRegistered()
    {
        return isRegistered;    //return statement helps in returning the value from the method
    }
    //setter(mutators) methods for the corresponding attributes/variables
    public void setLecturerName(String newlecturer)
    {
        this.LecturerName = newlecturer;    
    }
    public void setNumberofAssesments(int newnumberofassesments)
    {
        this.NumberofAssesments = newnumberofassesments;   
    }
    public void setStartingDate(String startdate)
    {
        this.StartingDate = startdate;   
    }
    public void setCompletionDate(String completiondate)
    {
        this.CompletionDate = completiondate;    
    }
    public void setLevel(String level)
    {
        this.Level = level;
    }
    public void setCredit(String credit)
    {
        this.Credit = credit;
    }
    public void setisRegistered(boolean isregistered)
    {
        this.isRegistered = isregistered;    
    }
    //creating method called register for registering particular academic course
    public void register(String CourseLeader,String LecturerName, String StartingDate, String CompletionDate )
    {
        if(getisRegistered() == true)//using conditional statements to check whether isRegistered is true or not
        {
            System.out.println("The course is already registered"); //used for displaying the data to user
            System.out.println("The name of the Lecturer is: " + this.getLecturerName()); 
            System.out.println("The starting date of the course is: " + this.getStartingDate()); //used for displaying the data to user
            System.out.println("The completion date of the course is: " + this.getCompletionDate()); //used for displaying the data to user
        }
        else // if the above if statement doesnot execute else executes
        {
            super.setCourseLeader(CourseLeader); //calling the instance variable from parent class
            this.setLecturerName(LecturerName); //calling the instance variable from parent class
            this.setStartingDate(StartingDate);
            this.setCompletionDate(CompletionDate);  //calling the instance variable from parent class
            this.setisRegistered(true);   
        }
      
    } 
    //method to display the details of the class AcademicCourse
    public void display() //method overriding(the concept in which the method name and signature of both parent and child class are same)
    {
        super.display(); //calling the display method from parent class Course
        
        if(getisRegistered() == true) //using conditional statements to check whether isRegistered is true or not
        {
            System.out.println("The name of the lecturer is: " + this.getLecturerName());
            System.out.println("The level of study is: " + this.getLevel());  //used for displaying the data to user
            System.out.println("The credit obtained is: " + this.getCredit()); //used for displaying the data to user
            System.out.println("The starting date is: " + this.getStartingDate());
            System.out.println("The completion date is: " + this.getCompletionDate()); //used for displaying the data to user
            System.out.println("The number of assesments are: " + this.getNumberofAssesments()); //used for displaying the data to user
            
            
        }
    
        
        
    }
    
}
