package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateEmployee extends JFrame implements ActionListener{
    JButton add,back;
    JTextField tfedu,tfname,tsalary,taddress,tphone,tpan,taadhar,temail,tdesignation;
    JLabel empid;
    String Employee_ID;
    UpdateEmployee(String Employee_ID){
        this.Employee_ID=Employee_ID;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("UPDATE EMPLOYEE INFORMATION");
        heading.setBounds(280,30,500,50);
        heading.setFont(new Font("SAN_SERIF",Font.BOLD,25));
        add(heading);
        
        JLabel name=new JLabel("Name");
        name.setBounds(50,150,150,30);
        name.setFont(new Font("Serif",Font.PLAIN,20));
        add(name);
        
        JLabel lname=new JLabel();
        lname.setBounds(200,150,150,30);
        add(lname);
        
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
        
        JLabel ldob=new JLabel();
        ldob.setBounds(200,200,150,30);
        add(ldob);
        
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
        
        tfedu=new JTextField();
        tfedu.setBounds(600,300,150,30);
        add(tfedu);
        
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
        
        JLabel laadhar=new JLabel();
        laadhar.setBounds(600,350,150,30);
        add(laadhar);
        
        JLabel pan=new JLabel("PAN Number");
        pan.setBounds(50,400,150,30);
        pan.setFont(new Font("Serif",Font.PLAIN,20));
        add(pan);
        
        JLabel lpan=new JLabel();
        lpan.setBounds(200,400,150,30);
        add(lpan);
        
        JLabel doj=new JLabel("Date Of Joining");
        doj.setBounds(400,400,150,30);
        doj.setFont(new Font("Serif",Font.PLAIN,20));
        add(doj);
        
        JLabel ldoj=new JLabel();
        ldoj.setBounds(600,400,150,30);
        add(ldoj);
        
        JLabel gender=new JLabel("Gender");
        gender.setBounds(50,450,150,30);
        gender.setFont(new Font("Serif",Font.PLAIN,20));
        add(gender);
        
        
        JLabel lgender=new JLabel();
        lgender.setBounds(200,450,150,30);
        add(lgender);
        
        JLabel emp=new JLabel("Employee ID");
        emp.setBounds(400,450,150,30);
        emp.setFont(new Font("Serif",Font.PLAIN,20));
        add(emp);
        
        empid=new JLabel();
        empid.setBounds(600,450,150,30);
        empid.setFont(new Font("serif",Font.PLAIN,20));
        add(empid);
        
        try{
            Connect c=new Connect();
            String query=("select * from employee where Employee_ID='"+Employee_ID+"' ");
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                lname.setText(rs.getString("Name"));
                tfname.setText(rs.getString("Father_Name"));
                ldob.setText(rs.getString("Date_of_Birth"));
                tsalary.setText(rs.getString("Salary"));
                tphone.setText(rs.getString("Phone_Number"));
                taddress.setText(rs.getString("Address"));
                tfedu.setText(rs.getString("Education"));
                laadhar.setText(rs.getString("Aadhar_Number"));
                tdesignation.setText(rs.getString("Designation"));
                temail.setText(rs.getString("Email"));
                lpan.setText(rs.getString("PAN_Number"));
                ldoj.setText(rs.getString("Date_Of_Joining"));
                lgender.setText(rs.getString("Gender"));
                empid.setText(rs.getString("Employee_ID"));
                        
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        add=new JButton("Update  Information ");
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
            
            String Father_Name=tfname.getText();
            String Salary=tsalary.getText();
            String Address=taddress.getText();
            String Phone_Number=tphone.getText();
            String Email=temail.getText();
            String Designation=tdesignation.getText();
            String Education=(String)tfedu.getText();
            
            try{
                Connect c=new Connect();
                String query =("update employee set Father_Name= '"+Father_Name+"',Salary = '"+Salary+"',Address='"+Address+"',Phone_Number = '"+Phone_Number+"',Email='"+Email+"',Education='"+Education+"',Designation='"+Designation+"' where Employee_ID='"+Employee_ID+"' ");
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Details Updated Successfully");
                setVisible(false);
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
        new UpdateEmployee("");
    }  
}
