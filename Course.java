 class Course 
{
    private String Course_ID;
    private String Course_Name;
    private String Course_Leader;
    private int Duration;
    public Course(String Course_ID, String Course_Name, int Duration) /** Constructor for the course class */
    {
        this.Course_ID = Course_ID;
        this.Course_Name = Course_Name;
        this.Duration = Duration;
        this.Course_Leader = "";
    }
    public String getCourse_ID() //Calling getter method from class to get value of course ID
    {
        return this.Course_ID;
    }
    public String getCourse_Name() //Calling getter method from class to get value of course name
    {
        return this.Course_Name;
    }
    public String getCourse_Leader() //Calling getter method from class to get value of course leader
    {
        return this.Course_Leader;
    }
    public int getDuration() //Calling getter method from class to get value of Duration
    {
        return this.Duration;
    }
    public void setCourse_Leader(String Course_Leader) //Calling setter method from class to set value of Course leader
    {
        this.Course_Leader = Course_Leader;
    }
    public void Display() /** Method used to display the variables */
    {
        System.out.println("The Course ID is = " + this.Course_ID);
        
        System.out.println("The Course Name is = " + this.Course_Name);
        
        System.out.println("The Duration is = " + this.Duration);
        
        if(Course_Leader==(""))
        
        {
            System.out.println("There is no Course leader ");
        }
        else 
        {
            System.out.println("The Course leader is = " + this.Course_Leader);
        }
    }   
}
