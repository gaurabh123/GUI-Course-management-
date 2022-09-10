public class NonAcademic_Course extends Course /** This class is the child class of course */
  {
    private String Instructor_Name;
    private String Start_Date;
    private String Completion_Date;
    private String Exam_Date;
    private String Prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
  
     NonAcademic_Course(String Course_ID, String Course_Name, int Duration, String Prerequisite)//Initalizes value in the constructor
     { 
      super (Course_ID, Course_Name, Duration);// Calls value from super class
      
      this.Instructor_Name = Instructor_Name; //Returns the value to the assigned variable
      
      this.Prerequisite = Prerequisite;
      
      this.Start_Date = "";
      
      this.Completion_Date = "";
      
      this.Exam_Date = "";
      
      this.isRegistered = false;
      
      this.isRemoved = false;
      
    }
    
    public String getInstructor_Name() //Calling getter method from class to get value of Instructor name
    {
        return this.Instructor_Name;
    }
    
    public int getDuration()  //Calling getter method from class to get value of duration
    {
        return super.getDuration();
    }
    
    public String getStart_Date()  //Calling getter method from class to get valaue of starting date
    {
        return this.Start_Date;
    }
    
    public String getCompletion_Date() //Calling gettter method from class to get value of completion date
    {
        return this.Completion_Date;
    }
    
    public String getExam_Date()  //Calling getter method from class to get value of examination date
    {
        return this.Exam_Date;
    }
    
    public String getPrerequisite()  // Calling getter method from class to get value of prerequiste
    {
        return this.Prerequisite;
    }
    
    public boolean getisRegistered() //Calling getter method from class to get valule of registered
    {
        return this.isRegistered;
    }
    
    public boolean getisRemoved() //Calling getter method from class to get value of removed
    {
        return this.isRemoved;
    }
    
    public String getCourse_ID()  //Calling getter method from super class to get value of course ID
    {
        return super.getCourse_ID();
    }
    
    public String getCourse_Name() // Calling getter method from super class to get value of course name
    {
        return super.getCourse_Name();
    }
    
    public void setInstructor_Name(String Instructor_Name) /** Setter method to set value of Instructor name */
    {
       if(isRegistered == false) {
           this.Instructor_Name = Instructor_Name;  
       }
       
       else {
           System.out.println("The Instructor and the course has already been registered");
       }   
    }
    
    public void Register(String Course_Leader, String Instructor_Name, String Start_Date, String Completion_Date, String Exam_Date) /** Method used to register variables*/
    {
        if (isRegistered == false)
        {
            setInstructor_Name(Instructor_Name); // Calling the setter method from class to set instructor name
            super.setCourse_Leader(Course_Leader); // Calling the setter method from class to set value of course leader
            this.Start_Date = Start_Date;
            this.Completion_Date =  Completion_Date;
            this.Exam_Date = Exam_Date;
            this.isRegistered = true;
            this.isRemoved = false;
            System.out.println("Course has been registered sucessfully");
        }
        else
        {
             System.out.println("The course is already registered");
        }
    }
    
    public void Remove() /**method used to remove the variables */
    {
        if(isRemoved == false)
        {
            super.setCourse_Leader(""); /**Calling the setter method from super class to course leader **/ 
            this.Instructor_Name = "";
            this.Start_Date = "";
            this.Completion_Date="";
            this.Exam_Date = "";
            isRegistered = false;
            isRemoved = true;
            System.out.println("Course removed");            
        }
        else
        {
            System.out.println("The course is already removed");
        }
    }
    
    public void display() /** Method used to display the variable */
    {
        super.Display(); /** calling the display from superclass */
        if(isRegistered == false)
        {
            System.out.print("Course is not registered");
        }
        else
        {
            System.out.println();
            System.out.println("Instructor name = " + this.Instructor_Name);
            System.out.println("Starting date = " + this.Start_Date);
            System.out.println("Date of completion = " + this.Completion_Date);
            System.out.println("Date of examination = " + this.Exam_Date);
        }
    }
}


 
       
