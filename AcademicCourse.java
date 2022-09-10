public class Academic_Course extends Course /** This class is the child class of course */
{
    private String Lecturer_name; 
    private String Level;
    private String Credit;
    private String Starting_Date;
    private String Completion_Date;
    private int Number_of_Assessments;
    private boolean IsRegistered;
    
    public Academic_Course (String Course_ID, String Course_Name, int Duration, String level, String credit, String Lecturer_name, int Number_of_Assessments)/** Initializes constructor academic course */
    { super ( Course_ID, Course_Name, Duration); /** Calls value from super class to academic course */

        this.Lecturer_name = Lecturer_name;
        this.Level= level;
        this.Credit= credit;
        this.Number_of_Assessments= Number_of_Assessments;
        this.Completion_Date = "";
        this.Starting_Date="";
        this.IsRegistered = false;

    }
    
    public String getLevel() //Calling getter method from class to get value of level
    {
        return this.Level;
    }
    
    public String getCredit() //Calling getter method from class to get value of credit
    {
        return this.Credit;
    }
    
    public int getNumber_of_Assessments() //Calling getter method from class to get value of number of assessment
    {
        return this.Number_of_Assessments;
    }
    
    public String getLecturer_name() //Calling getter method from class to get value of lecturer name
    {
        return this.Lecturer_name;
    }
    
    public String getStarting_Date() //Calling getter method from class to get value of starting date
    {
        return this.Starting_Date;
    }
    
    public String getCompletion_Date() //Calling getter method from class to get value of completion date
    {
        return this.Completion_Date;
    }
    
    public boolean getIsRegistered() //Calling getter method from class to get value of IsRegistered
    {
        return this.IsRegistered;
    }
    
    public String getCourse_ID() //Calling getter method from super class to get value of COurse ID
    {
        return super.getCourse_ID();
    }
    
    public String getCourse_Name() // Calling getter method from super class to get value of course name
    {
        return super.getCourse_Name();
    }

    public String getCourse_Leader() // Calling getter method from super class to get value of course leader
    {
        return super.getCourse_Leader();
    }
    
    public int getDuration()  // Calling getter method from super class to get value of course duration
    {
        return super.getDuration();
    }
    
    public void setCourse_Leader(String Course_Leader)  // Calling setter method from class to set value of course leader
    {
        setCourse_Leader(Course_Leader);
        System.out.println("Lecturer is assigned");
    }
    
    public void setNumber_of_Assessments( int Number_of_Assessments) // Calling setter method from class to set value of number of assessment
    {
        this.Number_of_Assessments = Number_of_Assessments;
        System.out.println("Number of assessments has been chnaged");
    }
    
    public void Register(String Course_Leader, String Lecturer_name, String Starting_Date, String Completion_Date ) /** method used to Register variables **/
    {
        if( IsRegistered == true)
        {
            System.out.println(" The course is already registered");
        }
        else 
        {
            super.setCourse_Leader(Course_Leader); /** Calling the setter method from super class to set the value of course leader **/
            
            this.Lecturer_name = Lecturer_name;
            this.Starting_Date = Starting_Date;
            this.Completion_Date = Completion_Date;
            this.IsRegistered = true;
        }
    }
    public void display() /** Method used to display the value of the variables **/ 
    {
        super.Display();
        if(IsRegistered == false)
        {
            System.out.println("The Course details are not registered");
        }
        else
        {
            System.out.println("The lecturer name = " + this.Lecturer_name);
            System.out.println("The level is = " + this.Level);
            System.out.println("The Credits = " + this.Credit);
            System.out.println("Start of lecture = " + this.Starting_Date);
            System.out.println("End of the lecture = " + this.Completion_Date);
            System.out.println("Number of assessments = " + this.Number_of_Assessments);
        }
    }
}   
