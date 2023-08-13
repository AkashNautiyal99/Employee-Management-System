package employee.management.system;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener{
    JButton add,back;
    JTextField tname,tfname,tsalary,taddress,tphone,tpan,taadhar,temail,tdesignation;
    JDateChooser ddob,ddoj;
    JComboBox cedu,cgender;
    JLabel empid;
    Random ran=new Random();
    int number=ran.nextInt(999999);
    
    AddEmployee(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("ADD EMPLOYEE INFORMATION");
        heading.setBounds(280,30,500,50);
        heading.setFont(new Font("SAN_SERIF",Font.BOLD,25));
        add(heading);
        
        JLabel name=new JLabel("Name");
        name.setBounds(50,150,150,30);
        name.setFont(new Font("Serif",Font.PLAIN,20));
        add(name);
        
        tname=new JTextField();
        tname.setBounds(200,150,150,30);
        add(tname);
        
        JLabel fname=new JLabel("Father's Name");
        fname.setBounds(400,150,150,30);
        fname.setFont(new Font("Serif",Font.PLAIN,20));
        add(fname);
        
        tfname=new JTextField();
        tfname.setBounds(600,150,150,30);
        add(tfname);
        
        JLabel dob=new JLabel("Date Of Birth");
        dob.setBounds(50,200,150,30);
        dob.setFont(new Font("Serif",Font.PLAIN,20));
        add(dob);
        
        ddob=new JDateChooser();
        ddob.setBounds(200,200,150,30);
        add(ddob);
        
        JLabel salary=new JLabel("Salary");
        salary.setBounds(400,200,150,30);
        salary.setFont(new Font("Serif",Font.PLAIN,20));
        add(salary);
        
        tsalary=new JTextField();
        tsalary.setBounds(600,200,150,30);
        add(tsalary);
        
        JLabel address=new JLabel("Address");
        address.setBounds(50,250,150,30);
        address.setFont(new Font("Serif",Font.PLAIN,20));
        add(address);
        
        taddress=new JTextField();
        taddress.setBounds(200,250,150,30);
        add(taddress);
        
        JLabel phone=new JLabel("Contact Number");
        phone.setBounds(400,250,150,30);
        phone.setFont(new Font("Serif",Font.PLAIN,20));
        add(phone);
        
        tphone=new JTextField();
        tphone.setBounds(600,250,150,30);
        add(tphone);
        
        JLabel email=new JLabel("E-Mail");
        email.setBounds(50,300,150,30);
        email.setFont(new Font("Serif",Font.PLAIN,20));
        add(email);
        
        temail=new JTextField();
        temail.setBounds(200,300,150,30);
        add(temail);
        
        JLabel edu=new JLabel("Highest Qualification");
        edu.setBounds(400,300,350,30);
        edu.setFont(new Font("Serif",Font.PLAIN,20));
        add(edu);
        
        String courses[]={"BBA","BCA","B.Sc IT","B.Tech","MCA","M.Sc IT","MBA","M.Sc Data Science","M.Tech"};
        cedu=new JComboBox(courses);
        cedu.setBackground(Color.WHITE);
        cedu.setBounds(600,300,150,30);
        add(cedu);
        
        JLabel designation=new JLabel("Designation");
        designation.setBounds(50,350,150,30);
        designation.setFont(new Font("Serif",Font.PLAIN,20));
        add(designation);
        
        tdesignation=new JTextField();
        tdesignation.setBounds(200,350,150,30);
        add(tdesignation);
        
        JLabel aadhar=new JLabel("Aadhar Number");
        aadhar.setBounds(400,350,150,30);
        aadhar.setFont(new Font("Serif",Font.PLAIN,20));
        add(aadhar);
        
        taadhar=new JTextField();
        taadhar.setBounds(600,350,150,30);
        add(taadhar);
        
        JLabel pan=new JLabel("PAN Number");
        pan.setBounds(50,400,150,30);
        pan.setFont(new Font("Serif",Font.PLAIN,20));
        add(pan);
        
        tpan=new JTextField();
        tpan.setBounds(200,400,150,30);
        add(tpan);
        
        JLabel doj=new JLabel("Date Of Joining");
        doj.setBounds(400,400,150,30);
        doj.setFont(new Font("Serif",Font.PLAIN,20));
        add(doj);
        
        ddoj=new JDateChooser();
        ddoj.setBounds(600,400,150,30);
        add(ddoj);
        
        JLabel gender=new JLabel("Gender");
        gender.setBounds(50,450,150,30);
        gender.setFont(new Font("Serif",Font.PLAIN,20));
        add(gender);
        
        String gend[]={"Male","Female","Others"};
        cgender=new JComboBox(gend);
        cgender.setBackground(Color.WHITE);
        cgender.setBounds(200,450,150,30);
        add(cgender);
        
        JLabel emp=new JLabel("Employee ID");
        emp.setBounds(400,450,150,30);
        emp.setFont(new Font("Serif",Font.PLAIN,20));
        add(emp);
        
        empid=new JLabel(""+number);// convert Number into string.
        empid.setBounds(600,450,150,30);
        empid.setFont(new Font("serif",Font.PLAIN,20));
        add(empid);
        
        add=new JButton("Add  Information ");
        add.setBounds(250,550,200,40);
        add.setFont(new Font("serit",Font.BOLD,16));
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);
        
        back=new JButton("Back ");
        back.setBounds(500,550,150,40);
        back.setFont(new Font("serit",Font.BOLD,16));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        ImageIcon img = new ImageIcon("C:\\Users\\AKASH NAUTIYAL\\Documents\\NetBeansProjects\\Employee Management System\\src\\icons\\expander.png");
        setIconImage(img.getImage());
        setSize(900,650);
        setLocation(200,25);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==add){
            String Name=tname.getText();
            String Father_Name=tfname.getText();
            String Date_Of_Birth=((JTextField)ddob.getDateEditor().getUiComponent()).getText();
            String Salary=tsalary.getText();
            String Address=taddress.getText();
            String Phone_Number=tphone.getText();
            String Email=temail.getText();
            String Aadhar_Number=taadhar.getText();
            String PAN_Number=tpan.getText();
            String Designation=tdesignation.getText();
            String Education=(String)cedu.getSelectedItem();
            String Employee_ID=empid.getText();
            String Date_Of_Joining=((JTextField)ddoj.getDateEditor().getUiComponent()).getText();
            String Gender=(String)cgender.getSelectedItem();
            
            try{
                Connect c=new Connect();
                String query="insert into employee values('"+Name+"','"+Father_Name+"','"
                        +Date_Of_Birth+"','"+Salary+"','"+Address+"','"+Phone_Number+"','"
                        +Email+"','"+Education+"','"+Designation+"','"+Aadhar_Number+"','"
                        +PAN_Number+"','"+Date_Of_Joining+"','"+Gender+"','"+Employee_ID+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Details Added Successfully");
                dispose();
//setVisible(false);
                new Home();
            }catch(Exception e){
                e.printStackTrace();
            }
        
        }else{
            setVisible(false);
            new Home();
        }
    }
    public static void main(String args[]){
        new AddEmployee();
    }  
}
