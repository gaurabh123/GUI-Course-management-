import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.*;
import java.util.ArrayList;

public class ING_College implements ActionListener{
    //Jframe used
    private JFrame Mainframe, nonAcademicFrame, academicFrame;
    
    //Jpanel used
    private JPanel mainPanel, nonAcademicCreatePanel, academicRegisterPanel, 
    academicCreatePanel,nonAcademicRegisterPanel, academicPanel, nonAcademicPanel;
    
    //Jlabel used
    private JLabel mainHeaderLabel, mainGreetingLabel, mainInfoLabel, MainDescriptionLabel;
    
    private JLabel academicCourseHeaderLabel, academicCourseIDLabel, academicCourseNameLabel, 
    academicDurationLabel, academicLevelLabel, academicCreditLabel, academicNoOfAssessmentLabel,
    academicCreateLabel, academicCourseLeaderLabel, academicLecturerLabel, academicStartingDateLabel,
    academicCompletionDateLabel;
    
    private JLabel nonAcademicCourseHeaderLabel, nonAcademicCreateLabel, nonAcademicCourseIDLabel,
    nonAcademicCourseNameLabel, nonAcademicDurationLabel, nonAcademicPrerequisiteLabel, nonAcademicCourseLeaderLabel,
    nonAcademicInstructorLabel, nonAcademicStartingDateLabel, nonAcademicCompletionDateLabel,
    nonAcademicExamDateLabel;
    
    private JLabel academicImportantMessage, nonAcademicImportantMessage;

    //JTextField used
    private JTextField academicCourseIDBox, academicCourseNameBox, academicDurationBox, academicLevelBox, 
    academicCreditBox, academicNoOfAssessmentBox, academicCourseLeaderBox, academicLecturerBox;
    
    private JTextField nonAcademicCourseIDBox, nonAcademicCourseNameBox,
    nonAcademicDurationBox, nonAcademicPrerequisiteBox, nonAcademicCourseLeaderBox, nonAcademicInstructorBox;

    //JButton used
    private JButton mainAcademicButton, mainNonAcademicButton;
    
    private JButton createAcademicButton, academicRegisterButton, academicMenuButton,
    nonAcademicMenuButton, academicClearButton, nonAcademicClearButton, academicDisplayButton, 
    nonAcademicDisplayButton, createNonAcademicButton, registerNonAcademicButton, removeNonAcademicButton;

    //JComboBox Used
    private JComboBox academicStartingDateYear, academicStartingDateMonth, academicStartingDateDay,
    academicCompletionDateYear, academicCompletionDateMonth, academicCompletionDateDay;
    
    private JComboBox nonAcademicStartingDateYear, nonAcademicStartingDateMonth, nonAcademicStartingDateDay,
    nonAcademicCompletionDateYear, nonAcademicCompletionDateMonth, nonAcademicCompletionDateDay, 
    nonAcademicExamDateYear, nonAcademicExamDateMonth, nonAcademicExamDateDay;
    
    //Custom Colors used
    private Color colorSilver = new Color(192,192,192);
    private Color colorGrey = new Color(210,210,210);
    private Color colorBlue = new Color(113, 218, 235);
    private Color colorYellow = new Color(235, 235, 115);
    private Color colorWhite = new Color(220,220,220);
    private Color colorRed = new Color(255,100,100);
    private Color colorGreen = new Color(104, 222, 69); 

    //Custom Fonts used
    private Font fontAlgerianHeader = new Font("Algerian", Font.BOLD, 40);
    private Font fontArialPlain = new Font("Arial", Font.PLAIN, 20);
    private Font fontArialHeader = new Font("Arial", Font.BOLD, 20);
    
    //Static Arrays Used for dates
  
    String year[] = {"2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010"};
    
    String month[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
    
    String day[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18", "19","20","21","22","23","24",
        "25","26","27","28","29","30","31","32"};
        
    //Dynamic Arrays Used
    private ArrayList<Course> Courses = new ArrayList();
    
    //Variables used
    private String academicCourse_ID, academicCourse_Name, academicLevel, academicCredit,
    academicDurationSTR, academicNo_of_AssessmentSTR;
    private String nonAcademicCourse_ID, nonAcademicCourse_Name, nonAcademicDurationSTR,
    nonAcademicPrerequisite;
    
    private String academicCourse_Leader, academicLecturer_name, academicStarting_Date,academicCompletion_Date;
    private String academicCourse_ID2;
    private int academicNumber_of_assessment;
    private String nonAcademicCourse_Leader, nonAcademicInstructor, nonAcademicStarting_Date,
    nonAcademicCompletion_Date, nonAcademicExam_Date;
    
    private String nonacademicCourse_ID2, nonAcademicCourse_ID3;
    
    private int academicDuration, academicNo_of_Assessment;
    private int nonAcademicDuration;

    //Creating objects
    private static Academic_Course objectac1, objectac2, objectac3;
    private static NonAcademic_Course objectNonac1, objectNonac2, objectNonac3;
    private static ING_College object = new ING_College();
    
    public void mainGUI() {
        /** Main GUI Frame and Panel */
        //Main GUI Frame
        Mainframe = new JFrame("ING College");
        Mainframe.setBounds(10,10,530,350);
        
        //Main GUI Panel
        mainPanel = new JPanel();
        mainPanel.setBounds(10,10,530,350);
        mainPanel.setBackground(colorSilver);
        mainPanel.setLayout(null);
        
        /** Main GUI displayed components */
        //Main GUI HeadingLabel
        mainHeaderLabel = new JLabel("ING College");
        mainHeaderLabel.setFont(fontAlgerianHeader);
        mainHeaderLabel.setBounds(120,70,290,60);
        mainPanel.add(mainHeaderLabel);
        
        //Academic course redirecting button
        mainAcademicButton = new JButton("Academic Course");
        mainAcademicButton.setFont(fontArialPlain);
        mainAcademicButton.setBounds(30,180,200,40);
        mainAcademicButton.addActionListener(this);
        mainPanel.add(mainAcademicButton);
        
        //Non Academic Course redirecting button
        mainNonAcademicButton = new JButton("Non-Academic Course");
        mainNonAcademicButton.setFont(fontArialPlain);
        mainNonAcademicButton.setBounds(250,180,240,40);
        mainNonAcademicButton.addActionListener(this);
        mainPanel.add(mainNonAcademicButton);
        
        /**Exit on close Confirmation*/
        Mainframe.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent we) {
            int result = JOptionPane.showConfirmDialog(Mainframe,"Would you like to exit ?", "Exit : ",
            JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
              Mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            
            else {
              Mainframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
            }
          }
        });
        
        /** Main GUI loading formalities */
        Mainframe.setResizable(false);
        Mainframe.setVisible(true);
        Mainframe.add(mainPanel); //Adding Panel main to frame
    }
    
    public void academicGUI() {
        /**Academic GUI frame and panel*/
        //Academic GUI Frame
        academicFrame = new JFrame("Academic Course");
        academicFrame.setBounds(10,10,950,600);
        
        //Academic Course Panel
        academicPanel = new JPanel();
        academicPanel.setBounds(10,10,950,600);
        academicPanel.setBackground(colorGrey);
        academicPanel.setLayout(null);
        
        //Academic Create Course Panel
        academicCreatePanel = new JPanel();
        academicCreatePanel.setBounds(50,150,360,370);
        academicCreatePanel.setBackground(colorBlue);
        academicCreatePanel.setLayout(null);
        
        //Academic Register Course Panel
        academicRegisterPanel = new JPanel();
        academicRegisterPanel.setBounds(470,150,420,370);
        academicRegisterPanel.setBackground(colorWhite);
        academicRegisterPanel.setLayout(null); 
        
        /**Academic Course Panel*/
        // Academic Course Heading
        academicCourseHeaderLabel = new JLabel("Academic Course:");
        academicCourseHeaderLabel.setBounds(140,50,500,50);
        academicCourseHeaderLabel.setFont(fontAlgerianHeader);
        academicPanel.add(academicCourseHeaderLabel); //Adding AcademicCourseHeaderLabel to panel 
        
        //Back to menu button
        academicMenuButton = new JButton("Main Menu");
        academicMenuButton.setBounds(690,390,150,30);
        academicMenuButton.setFont(fontArialPlain);
        academicMenuButton.addActionListener(this);
        academicPanel.add(academicMenuButton); //Adding AcademicMenuButon to panel


        /**Academic Course Creation Panel*/
        
        // Course ID
        academicCourseIDLabel = new JLabel("Course ID:");
        academicCourseIDLabel.setBounds(20,50,255,20);
        academicCourseIDLabel.setFont(fontArialHeader);
        academicCreatePanel.add(academicCourseIDLabel); //Adding AcademicCourseIdLabel
        
        academicCourseIDBox = new JTextField();
        academicCourseIDBox.setBounds(160,50,180,20);
        academicCourseIDBox.setFont(fontArialPlain);
        academicCreatePanel.add(academicCourseIDBox); //Adding AcademicCourseIdBox to panel
        
        //Course Name
        academicCourseNameLabel = new JLabel("Course Name:");
        academicCourseNameLabel.setBounds(20,80,255,20);
        academicCourseNameLabel.setFont(fontArialPlain);
        academicCreatePanel.add(academicCourseNameLabel); //Adding AcademicCourseName label to panel
        
        academicCourseNameBox = new JTextField();
        academicCourseNameBox.setBounds(160,80,180,20);
        academicCourseNameBox.setFont(fontArialPlain);
        academicCreatePanel.add(academicCourseNameBox); //Adding AcademicCourseNameBox to panel
        
        //Level
        academicLevelLabel = new JLabel("Level:");
        academicLevelLabel.setBounds(20,140,255,20);
        academicLevelLabel.setFont(fontArialPlain);
        academicCreatePanel.add(academicLevelLabel); //Adding AcademicLevelLabel to panel
        
        academicLevelBox = new JTextField();
        academicLevelBox.setBounds(160,140,180,20);
        academicLevelBox.setFont(fontArialPlain);
        academicCreatePanel.add(academicLevelBox); //Adding AcademicLevelLabel to panel
         
        //Credit
        academicCreditLabel = new JLabel("Credit:");
        academicCreditLabel.setBounds(20,170,255,20);
        academicCreditLabel.setFont(fontArialPlain);
        academicCreatePanel.add(academicCreditLabel); //Adding AcademicCredit to panel
        
        academicCreditBox = new JTextField();
        academicCreditBox.setBounds(160,170,180,20);
        academicCreditBox.setFont(fontArialPlain);
        academicCreatePanel.add(academicCreditBox); //Adding AcademicCreditBox to panelpanel 
        
        //Duration 
        academicDurationLabel = new JLabel("Duration:");
        academicDurationLabel.setBounds(20,110,255,20);
        academicDurationLabel.setFont(fontArialPlain);
        academicCreatePanel.add(academicDurationLabel); //Adding AcademicDurationLabel to panel
        
        academicDurationBox = new JTextField();
        academicDurationBox.setBounds(160,110,180,20);
        academicDurationBox.setFont(fontArialPlain);
        academicCreatePanel.add(academicDurationBox); //Adding AcademicDurationBox to panel
         
        //Number of Assessments
        academicNoOfAssessmentLabel = new JLabel("No of Assessment:");
        academicNoOfAssessmentLabel.setBounds(20,210,255,20);
        academicNoOfAssessmentLabel.setFont(fontArialPlain);
        academicCreatePanel.add(academicNoOfAssessmentLabel); //Addding AcademicNoofAssessmentLabel panel
        
        academicNoOfAssessmentBox = new JTextField();
        academicNoOfAssessmentBox.setBounds(200,210,120,20);
        academicNoOfAssessmentBox.setFont(fontArialPlain);
        academicCreatePanel.add(academicNoOfAssessmentBox); //Addding AcademicNoofAssessmentLabelBox panel
        
        //Create Academic CourseButton
        createAcademicButton = new JButton("Create Academic Course");
        createAcademicButton.setBounds(20,250,320,30);
        createAcademicButton.setFont(fontArialPlain);
        createAcademicButton.addActionListener(this);
        academicCreatePanel.add(createAcademicButton); //Adding CreateAcademicButton to panel
       
        /**Academic Course Register Panel*/
        //Course Leader of Academic Course
        academicCourseLeaderLabel = new JLabel("Course Leader:");
        academicCourseLeaderLabel.setBounds(20,20,400,20);
        academicCourseLeaderLabel.setFont(fontArialPlain);
        academicRegisterPanel.add(academicCourseLeaderLabel); //Adding CourseLeaderLabel to panel
        
        academicCourseLeaderBox = new JTextField();
        academicCourseLeaderBox.setBounds(180,20,180,20);
        academicCourseLeaderBox.setFont(fontArialPlain);
        academicRegisterPanel.add(academicCourseLeaderBox);  //Adding CourseLeaderBox to panel
        
        //Lecturer Name of Academic Course
        academicLecturerLabel = new JLabel("Lecturer Name:");
        academicLecturerLabel.setBounds(20,50,255,20);
        academicLecturerLabel.setFont(fontArialPlain);
        academicRegisterPanel.add(academicLecturerLabel); //Adding LecturerLabel to panel
        
        academicLecturerBox = new JTextField();
        academicLecturerBox.setBounds(180,50,180,20);
        academicLecturerBox.setFont(fontArialPlain);
        academicRegisterPanel.add(academicLecturerBox); //Adding LecturerBox to panel
        
        //Starting Date of Academic Course
        academicStartingDateLabel = new JLabel("Starting Date:");
        academicStartingDateLabel.setBounds(20,80,255,25);
        academicStartingDateLabel.setFont(fontArialPlain);
        academicRegisterPanel.add(academicStartingDateLabel); //AddingStartingDateLabel to panel
        
        academicStartingDateDay = new JComboBox(day);
        academicStartingDateDay.setBounds(180,80,50,25);
        academicStartingDateDay.setFont(fontArialPlain);
        academicRegisterPanel.add(academicStartingDateDay); //AddingStartingDateDay to panel
        
        academicStartingDateMonth = new JComboBox(month);
        academicStartingDateMonth.setBounds(240,80,70,25);
        academicStartingDateMonth.setFont(fontArialPlain);
        academicRegisterPanel.add(academicStartingDateMonth); //Adding StartingDatemonth to panel

        
        academicStartingDateYear = new JComboBox(year);
        academicStartingDateYear.setBounds(320,80,80,25);
        academicStartingDateYear.setFont(fontArialPlain);
        academicRegisterPanel.add(academicStartingDateYear); //Adding StartingDateYear to panel
      
        //Completion Date 
        academicCompletionDateLabel = new JLabel("Completion Date:");
        academicCompletionDateLabel.setBounds(20,110,255,25);
        academicCompletionDateLabel.setFont(fontArialPlain);
        academicRegisterPanel.add(academicCompletionDateLabel);//Adding CompletionDateLabel to panel
        
        academicCompletionDateDay = new JComboBox(day);
        academicCompletionDateDay.setBounds(180,110,50,25);
        academicCompletionDateDay.setFont(fontArialPlain);
        academicRegisterPanel.add(academicCompletionDateDay); //Adding CompletionDateDay to panel
        
        academicCompletionDateMonth = new JComboBox(month);
        academicCompletionDateMonth.setBounds(240,110,70,25);
        academicCompletionDateMonth.setFont(fontArialPlain);
        academicRegisterPanel.add(academicCompletionDateMonth); //Adding CompletionDateYear to panel
        
        academicCompletionDateYear = new JComboBox(year);
        academicCompletionDateYear.setBounds(320,110,80,25);
        academicCompletionDateYear.setFont(fontArialPlain);
        academicRegisterPanel.add(academicCompletionDateYear); //Adding CompletionDateYear to panel
        
        //Register Academic Course Button
        academicRegisterButton = new JButton("Register Course");
        academicRegisterButton.setBounds(40,200,340,30);
        academicRegisterButton.setFont(fontArialPlain);
        academicRegisterButton.addActionListener(this);
        academicRegisterPanel.add(academicRegisterButton); //Adding Academic Button to panel
        
        //Display Button for Academic Course 
        academicDisplayButton = new JButton("Display");
        academicDisplayButton.setBounds(40,160,160,30);
        academicDisplayButton.setFont(fontArialPlain);
        academicDisplayButton.setBackground(colorGreen);
        academicDisplayButton.addActionListener(this);
        academicRegisterPanel.add(academicDisplayButton); //Adding Academic Display button to panel
        
        //Clear Button for Academic Course 
        academicClearButton = new JButton("Clear");
        academicClearButton.setBounds(220,160,160,30);
        academicClearButton.setFont(fontArialPlain);
        academicClearButton.setBackground(colorRed);
        academicClearButton.addActionListener(this);
        academicRegisterPanel.add(academicClearButton); //AddingDisplayButton to panel
        
        
        //Information of Academic Course
        mainInfoLabel = new JLabel("Academic Course Creation, Modification and Registration");
        mainInfoLabel.setBounds(290,520,400,50);
        academicPanel.add(mainInfoLabel); //Adding MainDescriptionLabel to panel
        
        mainInfoLabel = new JLabel("Please always fill the courseID");
        mainInfoLabel.setBounds(55,150,400,20);
        academicPanel.add(mainInfoLabel); //Adding information in the panel
        
        /**Exit on close Confirmation*/
        academicFrame.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent we) {
            int result = JOptionPane.showConfirmDialog(Mainframe,"Would you like to exit ?", "Exit: ",
            JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
              academicFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            
            else {
              academicFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
            }
          }
        });
    
        /** Main GUI loading formalities */
        academicFrame.setResizable(false);
        academicFrame.setVisible(true);
        academicFrame.add(academicPanel); //Adding academicPanel to frame
        academicPanel.add(academicCreatePanel); //Adding panel Academic create to panel 
        academicPanel.add(academicRegisterPanel); //Adding academicRegisterPanel to panel
        
    }
    
    public void nonAcademicGUI() {
        /**Non-Academic GUI frame and panel*/
        //Non-Academic GUI Frame
        nonAcademicFrame = new JFrame("Non-Academic Course");
        nonAcademicFrame.setBounds(10,10,950,600);
        
        //Non-Academic Course Panel
        nonAcademicPanel = new JPanel();
        nonAcademicPanel.setBounds(10,10,950,650);
        nonAcademicPanel.setBackground(colorGrey);
        nonAcademicPanel.setLayout(null);
        
        //Non-Academic Create Course Panel
        nonAcademicCreatePanel = new JPanel();
        nonAcademicCreatePanel.setBounds(50,150,360,360);
        nonAcademicCreatePanel.setBackground(colorYellow);
        nonAcademicCreatePanel.setLayout(null);
        
        //Non-Academic Register Course Panel
        nonAcademicRegisterPanel = new JPanel();
        nonAcademicRegisterPanel.setBounds(460,150,430,360);
        nonAcademicRegisterPanel.setBackground(colorWhite);
        nonAcademicRegisterPanel.setLayout(null); 
        
        /**Non-Academic Course Panel*/
        // Non-Academic Course Heading
        nonAcademicCourseHeaderLabel = new JLabel("Non-Academic Course:");
        nonAcademicCourseHeaderLabel.setBounds(140,50,500,50);
        nonAcademicCourseHeaderLabel.setFont(fontAlgerianHeader); 
        nonAcademicPanel.add(nonAcademicCourseHeaderLabel); //Adding NonAcademicCourseHeaderlabel
        
        //Back to menu button
        nonAcademicMenuButton = new JButton("Main Menu");
        nonAcademicMenuButton.setBounds(690,435,150,30);
        nonAcademicMenuButton.setFont(fontArialPlain);
        nonAcademicMenuButton.addActionListener(this);
        nonAcademicPanel.add(nonAcademicMenuButton); //Adding NonAcademicMenuButton to panel
        
        /**Non-Academic Course Creation Panel*/
    
        // Course ID of NonAcademic course
        nonAcademicCourseIDLabel = new JLabel("Course ID:");
        nonAcademicCourseIDLabel.setBounds(20,50,255,20);
        nonAcademicCourseIDLabel.setFont(fontArialHeader);
        nonAcademicCreatePanel.add(nonAcademicCourseIDLabel); //Adding NonAcademicCourseIDLabel to panel
        
        nonAcademicCourseIDBox = new JTextField();
        nonAcademicCourseIDBox.setBounds(160,50,180,20);
        nonAcademicCourseIDBox.setFont(fontArialPlain);
        nonAcademicCreatePanel.add(nonAcademicCourseIDBox); //Adding NonAcademicCourseIDBox to panel
        
        //Course Name of NonAcademic course
        nonAcademicCourseNameLabel = new JLabel("Course Name:");
        nonAcademicCourseNameLabel.setBounds(20,80,255,20);
        nonAcademicCourseNameLabel.setFont(fontArialPlain);
        nonAcademicCreatePanel.add(nonAcademicCourseNameLabel); //Adding NonAcademicCourseNameLabel to panel
        
        nonAcademicCourseNameBox = new JTextField();
        nonAcademicCourseNameBox.setBounds(160,80,180,20);
        nonAcademicCourseNameBox.setFont(fontArialPlain);
        nonAcademicCreatePanel.add(nonAcademicCourseNameBox); //Adding NonAcademicCourseNameBox to panel
        
        //Duration of NonAcademic course 
        nonAcademicDurationLabel = new JLabel("Duration:");
        nonAcademicDurationLabel.setBounds(20,110,255,20);
        nonAcademicDurationLabel.setFont(fontArialPlain);
        nonAcademicCreatePanel.add(nonAcademicDurationLabel); //Adding NonAcademicDurationLabel to panel
        
        nonAcademicDurationBox = new JTextField();
        nonAcademicDurationBox.setBounds(160,110,180,20);
        nonAcademicDurationBox.setFont(fontArialPlain);
        nonAcademicCreatePanel.add(nonAcademicDurationBox);
        
        //Prerequisite of NonAcademic course
        nonAcademicPrerequisiteLabel = new JLabel("Prerequisite:");
        nonAcademicPrerequisiteLabel.setBounds(20,140,255,20);
        nonAcademicPrerequisiteLabel.setFont(fontArialPlain);
        nonAcademicCreatePanel.add(nonAcademicPrerequisiteLabel); //Adding nonAcademicPrerquisteLabel to panel
        
        nonAcademicPrerequisiteBox = new JTextField();
        nonAcademicPrerequisiteBox.setBounds(200,140,120,20);
        nonAcademicPrerequisiteBox.setFont(fontArialPlain);
        nonAcademicCreatePanel.add(nonAcademicPrerequisiteBox); //Adding NonAcademicPrerequisiteBox to panel
        
        //Create Non-Academic CourseButton
        createNonAcademicButton = new JButton("Create Non-Academic Course");
        createNonAcademicButton.setBounds(20,180,320,30);
        createNonAcademicButton.setFont(fontArialPlain);
        createNonAcademicButton.addActionListener(this);
        nonAcademicCreatePanel.add(createNonAcademicButton); //Adding CreateNonAcademicButton to panel
        
        //Remove Non-Academic Course Button
        removeNonAcademicButton = new JButton("Remove Non-Academic Course");
        removeNonAcademicButton.setBounds(20,230,320,30);
        removeNonAcademicButton.setFont(fontArialPlain);
        removeNonAcademicButton.setBackground(colorRed);
        removeNonAcademicButton.addActionListener(this);
        nonAcademicCreatePanel.add(removeNonAcademicButton); //Adding RemoveNonAcademicButton to panel
    
        /**Non-Academic Course Register Panel*/
        //Course Leader of NonAcademic course
        nonAcademicCourseLeaderLabel = new JLabel("Course Leader:");
        nonAcademicCourseLeaderLabel.setBounds(20,20,400,20);
        nonAcademicCourseLeaderLabel.setFont(fontArialPlain);
        nonAcademicRegisterPanel.add(nonAcademicCourseLeaderLabel); //Adding NonAcademicCourseLeaderLabel to panel
        
        nonAcademicCourseLeaderBox = new JTextField();
        nonAcademicCourseLeaderBox.setBounds(190,20,200,20);
        nonAcademicCourseLeaderBox.setFont(fontArialPlain);
        nonAcademicRegisterPanel.add(nonAcademicCourseLeaderBox); //Adding NonAcadmeicCourseLeaderBox to panel
        
        //Instructor Name of NonAcademic course
        nonAcademicInstructorLabel = new JLabel("Instructor Name:");
        nonAcademicInstructorLabel.setBounds(20,50,255,20);
        nonAcademicInstructorLabel.setFont(fontArialPlain);
        nonAcademicRegisterPanel.add(nonAcademicInstructorLabel); //Adding NonAcademicInstructorLabel to panel
        
        nonAcademicInstructorBox = new JTextField();
        nonAcademicInstructorBox.setBounds(190,50,200,20);
        nonAcademicInstructorBox.setFont(fontArialPlain);
        nonAcademicRegisterPanel.add(nonAcademicInstructorBox); //Adding NonAcademicInstructorBox to panel
        
        //Starting Date of NonAcademic course
        nonAcademicStartingDateLabel = new JLabel("Starting Date:");
        nonAcademicStartingDateLabel.setBounds(20,80,255,25);
        nonAcademicStartingDateLabel.setFont(fontArialPlain);
        nonAcademicRegisterPanel.add(nonAcademicStartingDateLabel); //Adding NonAcademicStartingDateLabel to panel
        
        nonAcademicStartingDateDay = new JComboBox(day);
        nonAcademicStartingDateDay.setBounds(190,80,50,25);
        nonAcademicStartingDateDay.setFont(fontArialPlain);
        nonAcademicRegisterPanel.add(nonAcademicStartingDateDay); //Adding NonAcademicStartingDateDay to panel
        
        nonAcademicStartingDateMonth = new JComboBox(month);
        nonAcademicStartingDateMonth.setBounds(250,80,70,25);
        nonAcademicStartingDateMonth.setFont(fontArialPlain);
        nonAcademicRegisterPanel.add(nonAcademicStartingDateMonth); //AddingNonAcademicStartingDateMonth to panel
        
        nonAcademicStartingDateYear = new JComboBox(year);
        nonAcademicStartingDateYear.setBounds(330,80,80,25);
        nonAcademicStartingDateYear.setFont(fontArialPlain);
        nonAcademicRegisterPanel.add(nonAcademicStartingDateYear); //Adding NonAcademicStartingDateYear to panel
      
        //Completion Date of NonAcademic course
        nonAcademicCompletionDateLabel = new JLabel("Completion Date:");
        nonAcademicCompletionDateLabel.setBounds(20,110,255,25);
        nonAcademicCompletionDateLabel.setFont(fontArialPlain);
        nonAcademicRegisterPanel.add(nonAcademicCompletionDateLabel); //Adding NonAcademicCompletionDateLabel to panel
        
        nonAcademicCompletionDateDay = new JComboBox(day);
        nonAcademicCompletionDateDay.setBounds(190,110,50,25);
        nonAcademicCompletionDateDay.setFont(fontArialPlain);
        nonAcademicRegisterPanel.add(nonAcademicCompletionDateDay); //Adding NonAcademicCompletionDateday to panel
        
        nonAcademicCompletionDateMonth = new JComboBox(month);
        nonAcademicCompletionDateMonth.setBounds(250,110,70,25);
        nonAcademicCompletionDateMonth.setFont(fontArialPlain);
        nonAcademicRegisterPanel.add(nonAcademicCompletionDateMonth); //Adding NonAcademicCompletionDateMonth to panel
        
        nonAcademicCompletionDateYear = new JComboBox(year);
        nonAcademicCompletionDateYear.setBounds(330,110,80,25);
        nonAcademicCompletionDateYear.setFont(fontArialPlain);
        nonAcademicRegisterPanel.add(nonAcademicCompletionDateYear); //Adding NonAcademicCompletionDateyear to panel
        
        //Examn Date of NonAcademic course
        nonAcademicExamDateLabel = new JLabel("Examination Date:");
        nonAcademicExamDateLabel.setBounds(20,140,255,25);
        nonAcademicExamDateLabel.setFont(fontArialPlain);
        nonAcademicRegisterPanel.add(nonAcademicExamDateLabel); //Adding NonAcademic exam date label to panel
        
        nonAcademicExamDateDay = new JComboBox(day);
        nonAcademicExamDateDay.setBounds(190,140,50,25);
        nonAcademicExamDateDay.setFont(fontArialPlain);
        nonAcademicRegisterPanel.add(nonAcademicExamDateDay); //Adding NonAcademicExamDateDay to panel
        
        nonAcademicExamDateMonth = new JComboBox(month);
        nonAcademicExamDateMonth.setBounds(250,140,70,25);
        nonAcademicExamDateMonth.setFont(fontArialPlain);
        nonAcademicRegisterPanel.add(nonAcademicExamDateMonth); //Adding NonAcademicExamDatemonth to panel
        
        nonAcademicExamDateYear = new JComboBox(year);
        nonAcademicExamDateYear.setBounds(330,140,80,25);
        nonAcademicExamDateYear.setFont(fontArialPlain);
        nonAcademicRegisterPanel.add(nonAcademicExamDateYear); //Adding NonAcademicExamDateYear to panel

        //Register Non-Academic Course Button
        registerNonAcademicButton = new JButton("Register Course");
        registerNonAcademicButton.setBounds(40,250,350,30);
        registerNonAcademicButton.setFont(fontArialPlain);
        registerNonAcademicButton.addActionListener(this);
        nonAcademicRegisterPanel.add(registerNonAcademicButton); //Adding RegisterNonAcademic Button to panel
        
        //Display Button of NonAcademic course
        nonAcademicDisplayButton = new JButton("Display");
        nonAcademicDisplayButton.setBounds(40,200,170,30);
        nonAcademicDisplayButton.setFont(fontArialPlain);
        nonAcademicDisplayButton.setBackground(colorGreen);
        nonAcademicDisplayButton.addActionListener(this);
        nonAcademicRegisterPanel.add(nonAcademicDisplayButton); //Adding NonAcademicDisplayButton to panel
        
        //Clear Button of NonAcademic course
        nonAcademicClearButton = new JButton("Clear");
        nonAcademicClearButton.setBounds(220,200,170,30);
        nonAcademicClearButton.setFont(fontArialPlain);
        nonAcademicClearButton.setBackground(colorRed);
        nonAcademicClearButton.addActionListener(this);
        nonAcademicRegisterPanel.add(nonAcademicClearButton); //Adding NonAcademicClearButton to panel
        
         //Descrpition of Non Academic Course
        MainDescriptionLabel = new JLabel("Non Academic Course Creation, Modification, Registration and Deletion");
        MainDescriptionLabel.setBounds(290,520,450,55);
        nonAcademicPanel.add(MainDescriptionLabel); //Adding MainDescriptionLabel to panel
        
        MainDescriptionLabel = new JLabel("Please always fill the courseID");
        MainDescriptionLabel.setBounds(55,150,400,20);
        nonAcademicPanel.add(MainDescriptionLabel); //Adding information in the panel
        
        /**Exit on close Confirmation*/
        Mainframe.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent we) {
            int result = JOptionPane.showConfirmDialog(Mainframe,"Would you like to Exit ?", "Exit: ",
            JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
              Mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            
            else {
              Mainframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
            }
          }
        });
    
        
        /** Main GUI loading formalities */
        nonAcademicFrame.setResizable(false);
        nonAcademicFrame.setVisible(true);
        nonAcademicFrame.add(nonAcademicPanel); //Adding nonAcademicPanel to Frame
        nonAcademicPanel.add(nonAcademicCreatePanel); //Adding nonAcademicCreatePanel to panel
        nonAcademicPanel.add(nonAcademicRegisterPanel); //Adding nonAcademicRegisterPanel to panel

    }
    
    public static void main (String [] args) {
        object.mainGUI();
        
    }
    
    /**Event Handeling*/
    public void actionPerformed(ActionEvent e) {
        //Frame Manipulation Buttons
        if (e.getSource() == mainAcademicButton) {
            object.academicGUI();
            Mainframe.dispose();
        }
        
        if (e.getSource() == mainNonAcademicButton) {
            object.nonAcademicGUI();
            Mainframe.dispose();
        }
        
        if (e.getSource() == academicMenuButton) {
            object.mainGUI();
            academicFrame.dispose();
        }
        
        if (e.getSource() == nonAcademicMenuButton) {
            object.mainGUI();
            nonAcademicFrame.dispose();
        }
        
        //Clear Buttons
        if (e.getSource() == academicClearButton) {
            //resetting Academic Course Text Fields
            academicCourseIDBox.setText("");
            academicCourseNameBox.setText("");
            academicDurationBox.setText("");
            academicLevelBox.setText("");
            academicCreditBox.setText("");
            academicNoOfAssessmentBox.setText("");
            academicCourseLeaderBox.setText("");
            academicLecturerBox.setText("");
            
            //ressetting Academic Course Combo Boxes
            academicStartingDateDay.setSelectedIndex(0);
            academicStartingDateMonth.setSelectedIndex(0);
            academicStartingDateYear.setSelectedIndex(0);
            academicCompletionDateDay.setSelectedIndex(0);
            academicCompletionDateMonth.setSelectedIndex(0);
            academicCompletionDateYear.setSelectedIndex(0);
            
        }
        
        if (e.getSource() == nonAcademicClearButton) {
            //resetting Non-Academic Course Text Fields
            nonAcademicCourseIDBox.setText("");
            nonAcademicCourseNameBox.setText("");
            nonAcademicDurationBox.setText("");
            nonAcademicPrerequisiteBox.setText("");
            nonAcademicCourseLeaderBox.setText("");
            nonAcademicInstructorBox.setText("");
            
            //resetting Academic Course Combo Boxes
            nonAcademicStartingDateDay.setSelectedIndex(0);
            nonAcademicStartingDateMonth.setSelectedIndex(0);
            nonAcademicStartingDateYear.setSelectedIndex(0);
            nonAcademicCompletionDateDay.setSelectedIndex(0);
            nonAcademicCompletionDateMonth.setSelectedIndex(0);
            nonAcademicCompletionDateYear.setSelectedIndex(0);
            nonAcademicExamDateDay.setSelectedIndex(0);
            nonAcademicExamDateMonth.setSelectedIndex(0);
            nonAcademicExamDateYear.setSelectedIndex(0);
        
        }
        
        //Create Academic Course Buttons
        if (e.getSource() == createAcademicButton) {
            try{
                academicCourse_ID = academicCourseIDBox.getText();
                academicCourse_Name = academicCourseNameBox.getText();
                academicLevel = academicLevelBox.getText();
                academicCredit = academicCreditBox.getText();
                
                //String to int
                academicDurationSTR = academicDurationBox.getText();
                academicDuration = Integer.parseInt(academicDurationSTR);
                
                academicNo_of_AssessmentSTR = academicNoOfAssessmentBox.getText();
                academicNo_of_Assessment = Integer.parseInt(academicNo_of_AssessmentSTR);
                
                boolean isDuplicate = false;
                
                //Duplicate course Check
                for (Course each : Courses)
                {
                    if(each.getCourse_ID().equals(academicCourse_ID)){
                       isDuplicate = true;
                       break;
                    }
                }
                
                if(isDuplicate == false)
                {
                    //calling Constructor of Academic Course
                    objectac1 = new Academic_Course(academicCourse_ID,academicCourse_Name, academicDuration,academicLevel,academicCredit,academicLecturer_name,
                    academicNumber_of_assessment);
                    
                    //adding to Array list
                    Courses.add(objectac1);
                    
                    //Message for successful Creation
                    String message = "The academic Course with Course ID: " + academicCourse_ID + " was Sucessfully registered";
                    JOptionPane.showMessageDialog(academicFrame, message);
                }
                
                if(isDuplicate == true) {
                   //Duplication message
                   String message = "The Academic Course with CourseID: " + academicCourse_ID + " already exists";
                   JOptionPane.showMessageDialog(academicFrame, message, "Alert", JOptionPane.WARNING_MESSAGE);
                }
            }
            //error handeling Popups
            catch(NumberFormatException exception1)
            {
                try
                {
                    if (academicCourse_ID.equals("") && academicCourse_Name.equals("") && academicDurationSTR.equals("") &&
                        academicLevel.equals("") && academicCredit.equals("") && academicNo_of_AssessmentSTR.equals("")) {
                        //All Fields Empty message
                        String message = "Text fields Empty!, please fill all the necessary Fields";
                        JOptionPane.showMessageDialog(academicFrame, message,"Alert!", JOptionPane.WARNING_MESSAGE);
                    }

                    else if (academicCourse_ID.equals("") || academicCourse_Name.equals("") || academicDurationSTR.equals("") ||
                        academicLevel.equals("") || academicCredit.equals("") || academicNo_of_AssessmentSTR.equals("")) {
                        //Some Fields Empty message
                        String message = "Text fields Empty!, please fill all the necessary Fields";
                        JOptionPane.showMessageDialog(academicFrame, message,"Alert!", JOptionPane.WARNING_MESSAGE);
                    }
                    else {
                        //Inappropriate Data types in Fields message
                        String message = "Please fill appropriate data into the Text Fields Else";
                        JOptionPane.showMessageDialog(academicFrame, message,"Alert!", JOptionPane.WARNING_MESSAGE);
                    }
                }
                catch (NullPointerException excecption2) {
                   //Inappropriate Data types in Fields message
                   String message = "Please fill appropriate data into the Text Fields ";
                   JOptionPane.showMessageDialog(academicFrame, message,"Alert!", JOptionPane.WARNING_MESSAGE); 
                }
            }
        }
        
        //Create Non-Academic Course Button
        
        if (e.getSource() == createNonAcademicButton)
        {
            
            try{
                nonAcademicCourse_ID = nonAcademicCourseIDBox.getText();
                nonAcademicCourse_Name = nonAcademicCourseNameBox.getText();
                nonAcademicPrerequisite = nonAcademicPrerequisiteBox.getText();
                
                //String to int
                nonAcademicDurationSTR = nonAcademicDurationBox.getText();
                nonAcademicDuration = Integer.parseInt(nonAcademicDurationSTR);
                
                boolean isDuplicate = false;
                
                //Duplicate course Check
                for (Course each : Courses) {
                    if(each.getCourse_ID().equals(nonAcademicCourse_ID)){
                       isDuplicate = true;
                       break;
                    }
                }
                
                if(isDuplicate == false) {
                    //calling Constructor of Non-Academic Course
                    objectNonac1 = new NonAcademic_Course(nonAcademicCourse_ID, nonAcademicCourse_Name,
                    nonAcademicDuration, nonAcademicPrerequisite);
                    
                    //adding to Array list
                    Courses.add(objectNonac1);
                    
                    //Message of successful Creation
                    String message = "The academic Course with Course ID: " + nonAcademicCourse_ID + " was Sucessfully registered";
                    JOptionPane.showMessageDialog(nonAcademicFrame, message);
                }
                
                if(isDuplicate == true) {
                   //Duplication message
                   String message = "The Academic Course with CourseID: " + nonAcademicCourse_ID + " already exists";
                   JOptionPane.showMessageDialog(nonAcademicFrame, message,"Alert!", JOptionPane.WARNING_MESSAGE);
                }
            }
            //error handeling Popups
            catch(NumberFormatException exception) {
                
                if (nonAcademicCourse_ID.equals("") && nonAcademicCourse_Name.equals("") && nonAcademicDurationSTR.equals("") &&
                    nonAcademicPrerequisite.equals("")) {
                    //All Fields Empty message
                    String message = "Text fields Empty!, please fill all the necessary Fields";
                    JOptionPane.showMessageDialog(nonAcademicFrame, message,"Alert!", JOptionPane.WARNING_MESSAGE);
                }

                else if (nonAcademicCourse_ID.equals("") || nonAcademicCourse_Name.equals("") || nonAcademicDurationSTR.equals("") ||
                    nonAcademicPrerequisite.equals("")) {
                    //Some Fields Empty message
                    String message = "Text fields Empty!, please fill all the necessary Fields";
                    JOptionPane.showMessageDialog(nonAcademicFrame, message,"Alert!", JOptionPane.WARNING_MESSAGE);
                }
                else {
                   //Inappropriate Data types in Fields message
                   String message = "Please fill propper data into the Text Fields";
                   JOptionPane.showMessageDialog(nonAcademicFrame, message,"Alert!", JOptionPane.WARNING_MESSAGE); 
                }
            }
        }

        //Register Academic Course Button
        if (e.getSource() == academicRegisterButton) {
        
            academicCourse_ID2 = academicCourseIDBox.getText();
            academicCourse_Leader = academicCourseLeaderBox.getText();
            academicLecturer_name = academicLecturerBox.getText();
            
            //Starting Date to String
            String Year1 = (academicStartingDateYear.getSelectedItem()).toString();
            String Month1 = (academicStartingDateMonth.getSelectedItem()).toString();
            String Day1 = (academicStartingDateDay.getSelectedItem()).toString();
            academicStarting_Date = Year1 +" "+ Month1 +" "+ Day1;
            
            //Completion Date to String
            String Year2 = (academicCompletionDateYear.getSelectedItem()).toString();
            String Month2 = (academicCompletionDateMonth.getSelectedItem()).toString();
            String Day2 = (academicCompletionDateDay.getSelectedItem()).toString();
            academicCompletion_Date = Year2 +" "+ Month2 +" "+ Day2;
        
            if (academicCourse_ID2.equals("") ||academicCourse_Leader.equals("") || academicLecturer_name.equals("")){
                //Text field not empty check
                String message = "Text fields Empty!, please fill all the necessary Fields";
                JOptionPane.showMessageDialog(academicFrame, message,"Alert!", JOptionPane.WARNING_MESSAGE);
            }
            else {
                boolean foundCourse = false;
                //Checking the Created Course of same CourseID
                for (Course course : Courses) {
                    if (course.getCourse_ID().equals(academicCourse_ID2)) {
                        if (course instanceof Academic_Course) {
                            //Downcasting
                            objectac2 = (Academic_Course) course;
                            if (objectac2.getIsRegistered() == true) {
                                //Course already registered message
                                String message = "The Course with CourseID:"+ academicCourse_ID2 +" has already been Registered";
                                JOptionPane.showMessageDialog(academicFrame, message, "Alert", JOptionPane.WARNING_MESSAGE);
                                foundCourse = true;
                            }
                            else if (objectac2.getIsRegistered() == false) {
                                //Course Registering
                                objectac2.Register(academicCourse_Leader, academicLecturer_name,
                                                         academicStarting_Date, academicCompletion_Date);
                                //Course Registered sucessfully message
                                String message = "The Course has been Registered Successfully";
                                JOptionPane.showMessageDialog(academicFrame, message);
                                foundCourse = true;
                            }
                        }
                    } 
                }
                //Course With Same Course ID Not Found
                if (foundCourse == false) {
                    String message = "The Course hasn't been Created yet";
                    JOptionPane.showMessageDialog(academicFrame, message, "Alert", JOptionPane.WARNING_MESSAGE);
                }
            }
        }

        if (e.getSource() == registerNonAcademicButton) {
            nonacademicCourse_ID2 = nonAcademicCourseIDBox.getText();
            nonAcademicCourse_Leader = nonAcademicCourseLeaderBox.getText();
            nonAcademicInstructor = nonAcademicInstructorBox.getText();
            
            //Starting Date to String
            String Year1 = (nonAcademicStartingDateYear.getSelectedItem()).toString();
            String Month1 = (nonAcademicStartingDateMonth.getSelectedItem()).toString();
            String Day1 = (nonAcademicStartingDateDay.getSelectedItem()).toString();
            nonAcademicStarting_Date = Year1 +" "+ Month1 +" "+ Day1;
            
            //Completion Date to String
            String Year2 = (nonAcademicCompletionDateYear.getSelectedItem()).toString();
            String Month2 = (nonAcademicCompletionDateMonth.getSelectedItem()).toString();
            String Day2 = (nonAcademicCompletionDateDay.getSelectedItem()).toString();
            nonAcademicCompletion_Date = Year2 +" "+ Month2 +" "+ Day2;
            
            //Examination Dateto String
            String Year3 = (nonAcademicExamDateYear.getSelectedItem()).toString();
            String Month3 = (nonAcademicExamDateMonth.getSelectedItem()).toString();
            String Day3 = (nonAcademicExamDateDay.getSelectedItem()).toString();
            nonAcademicExam_Date = Year3 +" "+ Month3 +" "+ Day3;
            
            if (nonacademicCourse_ID2.equals("") || nonAcademicCourse_Leader.equals("") || nonAcademicInstructor.equals("")){
                String message = "Text fields Empty!, please fill all the necessary Fields";
                JOptionPane.showMessageDialog(nonAcademicFrame, message,"Alert!", JOptionPane.WARNING_MESSAGE);
            }
            else{
                boolean courseFound = false;
                //Checking Courses list for course same CourseID
                for (Course course : Courses) {
                    if (course.getCourse_ID().equals(nonacademicCourse_ID2)) {
                        if (course instanceof NonAcademic_Course) {
                            //Downcasting
                            objectNonac2 = (NonAcademic_Course) course;
                            if (objectNonac2.getisRegistered() == true) {
                                //Course Already Registered Message
                                String message = "The course with CourseID:"+ nonacademicCourse_ID2 +" has already been Registered";
                                JOptionPane.showMessageDialog(nonAcademicFrame, message,"Alert!", JOptionPane.WARNING_MESSAGE);
                                courseFound = true;
                            }
                            else if (objectNonac2.getisRegistered() == false) {
                                objectNonac2.Register(nonAcademicCourse_Leader, nonAcademicInstructor, nonAcademicStarting_Date,
                                nonAcademicCompletion_Date, nonAcademicExam_Date);
                                
                                //Sucessfully registered Message
                                String message = "The Course registered Sucessfully";
                                JOptionPane.showMessageDialog(nonAcademicFrame, message);
                                courseFound = true;
                            }
                        }
                    }
                }
                if (courseFound = false) {
                    //Course not found Message
                    String message = "The course has not been Registered Yet";
                    JOptionPane.showMessageDialog(nonAcademicFrame, message,"Alert!", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        

        //Display Academic CourseButton 
        if (e.getSource() == academicDisplayButton) {
            if(Courses.isEmpty()) {
                JOptionPane.showMessageDialog(academicFrame, "Course hasnt been Registered Yet");
            }
            else {
                for(Course each : Courses) {
                    if (each instanceof Academic_Course){
                        System.out.println("");
                        System.out.println("___________________");
                        System.out.println("");
                        objectac3 = (Academic_Course) each;
                        
                        //Calling the Display method from Academic_Course
                        objectac3.display();
                        
                        //Pop up message
                        JOptionPane.showMessageDialog(academicFrame, "Check terminal for Academic Course Details");
                    }
                }
            }
        }
        
        //Display Non Academic Course Button 
        if (e.getSource() == nonAcademicDisplayButton) {
            if(Courses.isEmpty()) {
                String message = "Nothing to show, No Academic Course Registered Yet";
                JOptionPane.showMessageDialog(nonAcademicFrame, message, "Alert!", JOptionPane.WARNING_MESSAGE);
            }
            else {
                for(Course each : Courses) {
                    if (each instanceof NonAcademic_Course){
                        System.out.println("");
                        System.out.println("**************************");
                        System.out.println("");
                        objectNonac3 = (NonAcademic_Course) each;
                        
                        //Calling the Display method from Non_Academic_Course
                        objectNonac3.display();
                        
                        //Pop up message
                        JOptionPane.showMessageDialog(nonAcademicFrame, "Check terminal for Non Academic Course Details");
                    }
                }
            }
        }
        
        //Remove Non Academic Course Button
        if (e.getSource() == removeNonAcademicButton) {
            nonAcademicCourse_ID3 = nonAcademicCourseIDBox.getText();
            
            boolean courseFound = false;
            for(Course each : Courses) {
                
                if (each.getCourse_ID().equals(nonAcademicCourse_ID3)) {
                    
                    if (each instanceof NonAcademic_Course) {
                        //Down casting
                        objectNonac3 = (NonAcademic_Course) each;
                        if (objectNonac3.getisRemoved() == false) {
                           objectNonac3.Remove(); 
                           
                           //Successfully removed message
                           String message = "The Course has been successfully removed";
                           JOptionPane.showMessageDialog(nonAcademicFrame, message);
                           courseFound = true;
                        }
                        else {
                            //Already removed message
                            String message = "The Course has already been removed";
                            JOptionPane.showMessageDialog(nonAcademicFrame, message, "Alert!", JOptionPane.WARNING_MESSAGE);
                            courseFound = true;
                        }
                    }
                }
            }
            
            if (courseFound == false) {
                //Course Not Found message
                String message = "The course has not been Registered Yet to Remove";
                JOptionPane.showMessageDialog(nonAcademicFrame, message,"Alert!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
