public class Course
{
    //declaring instance variables
    private String CourseID;
    private String CourseName;
    private String CourseLeader; // 'private' is an access modifier which tells that this varaible can only be accessed from  within the class
    private int duration;
    
    //creating constructor(with 3 parameters) of the class Course
    public Course(String CourseID, String CourseName, int duration)
    {
        this.CourseID=CourseID; //using this as the name of instance and local variables are same
        this.CourseName=CourseName; //using this as the name of instance and local variables are same
        this.duration=duration;  //using this as the name of instance and local variables are same
        CourseLeader="";  
    }
    //getter(accessor) methods for the corresponding attributes/variables
    public String getCourseID()
    {
        return CourseID; //return statement helps in returning the value from the method
    }
    public String getCourseName()
    {
        return CourseName; //return statement helps in returning the value from the method
    }
    public String getCourseLeader()
    {
        return CourseLeader;     //return statement helps in returning the value from the method
    }
    public int getduration()
    {
        return duration;    //return statement helps in returning the value from the method
    }
    //setter(mutator) methods for the corresponding attributes/variables
    public void setCourseLeader(String courseleader)
    {
        this.CourseLeader=courseleader;
    }
    public void setCourseID(String courseid)
    {
        this.CourseID = courseid;
    }
    public void setCourseName(String coursename)
    {
        this.CourseName = coursename;
    }
    public void setduration(int time)
    {
        this.duration = time;
    }
    //method to display all the details of the class Course
    public void display() 
    {
        System.out.println("The id of the course is: " + this.getCourseID()); //use to display the data to the user
        System.out.println("The name of the course is: " + this.getCourseName());
        System.out.println("The duration of the course is: " + this.getduration() + "years");
        if(CourseLeader!="") //use of conditional statement to check whether courseleader is empty or not
        {
            System.out.println("The name of the course leader is: " + this.getCourseLeader()); // prints the message inside the bracket to user
            
        }
    }
    
    
}