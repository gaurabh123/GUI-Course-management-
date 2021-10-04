/*this class is the subclass of the class Course
this class inherits some property of the class Course*/

public class NonAcademicCourse extends Course// 'extends' keyword helps in inheritance
{
    private String InstructorName;
    private String StartDate;
    private String CompletionDate;// 'private' is an access modifier which tells that this varaible can only be accessed from  within the class 
    private String ExamDate;
    private String Prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    
    //creating constructor for class NonAcademicCourse, this constructor has 4 parameters
    public NonAcademicCourse(String CourseID, String CourseName, int duration, String Prerequisite)
    {
        super(CourseID,CourseName,duration); //calling the constructor from parent class Course
        StartDate = "";
        CompletionDate = "";
        ExamDate = "";
        this.Prerequisite = Prerequisite; //using 'this' as the name of instance and local variables are same
        isRegistered = false;
        isRemoved = false;    
    }
    //getter(accessor) methods for the corresponding attributes/variables
    public String getInstructorName()
    {
        return InstructorName; //return statement helps in returning the value from the method
    }
    public String getStartDate()
    {
        return StartDate;    
    }
    public String getCompletionDate()
    {
        return CompletionDate;   
    }
    public String getExamDate()
    {
        return ExamDate;   
    }
    public String getPrerequisite()
    {
        return Prerequisite;   
    }
    public boolean getisRegistered()
    {
        return isRegistered;    
    }
    public boolean getisRemoved()
    {
        return isRemoved;   
    }
    //setter(mutator) methods for the corresponding attributes/variables
    public void setInstructorName(String newinstructorname)
    {
        if(getisRegistered() == false) //use of conditional statements
        {
            this.InstructorName = newinstructorname;  
        }
        else
        {
            System.out.println("It is already registered so it is not possible to change the instructor name");   
        }
    }
    public void setStartDate(String startdate)
    {
        this.StartDate = startdate;   
    }
    public void setCompletionDate(String completiondate)
    {
        this.CompletionDate = completiondate;   
    }
    public void setExamDate(String examdate)
    {
        this.ExamDate = examdate;
    }
    public void setPrerequisite(String prerequisite)
    {
        this.Prerequisite = prerequisite;
    }
    public void setisRegistered(boolean isregistered)
    {
        this.isRegistered = isregistered;    
    }
    public void setisRemoved(boolean isremoved)
    {
        this.isRemoved = isremoved;   
    }
    //creating method register for registering NonAcademicCourse
    public void register(String CourseLeader, String InstructorName, String StartDate,String CompletionDate,String ExamDate)
    {
        if(getisRegistered() == false) //use of conditional statements
        {
            super.setCourseLeader(CourseLeader);
            this.setInstructorName(InstructorName);
            this.setStartDate(StartDate);
            this.setCompletionDate(CompletionDate);
            this.setExamDate(ExamDate);
            setisRegistered(true);
                  
        }
        else
        {
            System.out.println("The course is already registered");
            
        }
    }
    //creating method remove for removing NonAcademicCourse
    public void remove()
    {
        if(getisRemoved() == true) //use of conditional statements
        {
            System.out.println("The course is already removed");
            
        }
        else
        {
            super.setCourseLeader("");
            this.setStartDate("");
            this.setCompletionDate("");
            this.setExamDate("");
            this.setisRegistered(false);
            this.setInstructorName("");
            this.setisRemoved(true);   
        }
    }
    //method to display the details of NonAcademicCourse
    public void display()//method overriding(the concept in which the method name and signature of both parent and child class are same)
    {
        super.display(); //calling the display method from parent class Course
        if(getisRegistered() == true) //use of conditional statements
        {
            System.out.println("The name of the instructor is: " + this.getInstructorName());
            System.out.println("The starting date is: " + this.getStartDate());
            System.out.println("The completion date is: " + this.getCompletionDate());
            System.out.println("The exam date is: " + this.getExamDate());
            
        }
        
        
    }
    
    
}
