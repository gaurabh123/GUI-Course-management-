import javax.swing.*;
import java.awt.Font;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class INGCOLLEGE 
{
    JFrame frame;
    JPanel panel;
    JLabel title,title1,id1,name1;
    JTextField field1,field2;
    
    JButton b1;
    JComboBox cb1;
    
    ArrayList<Course> course = new ArrayList<Course>();
    
    void ingcollege()
    {
        //creating frame
        frame = new JFrame("ING College");
        frame.setSize(750,900);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        
        //creating panel and adding panel to frame
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,750,900);
        frame.add(panel);
        
        //code to add Academic Course
        title = new JLabel("AcademicCourse");
        title.setBounds(250,30,300,50);
        title.setFont(new Font("Arial",Font.BOLD,25));
        panel.add(title);
        
        //add course for academic course
        title1 = new JLabel("Add Academic Course");
        title1.setBounds(20,70,500,50);
        title1.setFont(new Font("Arial",Font.BOLD,20));
        panel.add(title1);
        
        //contents to add for academic course
        //courseid
        id1 = new JLabel("CourseID");
        id1.setBounds(20,120,200,30);
        panel.add(id1);
        
        //textfield for id1
        field1 = new JTextField();
        field1.setBounds(90,123,130,30);
        panel.add(field1);
        
        //coursename
        name1 = new JLabel("CourseName");
        name1.setBounds(230,200,200,30);
        panel.add(name1);
        
        
        
    }
    public static void main(String[] args)
    {
        INGCOLLEGE obj = new INGCOLLEGE();
        obj.ingcollege();
        
    }
    
    
}


