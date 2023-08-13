package employee.management.system;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RemoveEmployee extends JFrame implements ActionListener{
    Choice cempid;
    JButton delete,back;
    RemoveEmployee(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lempid=new JLabel("Employee ID");
        lempid.setBounds(50,50,100,30);
        add(lempid);
        
        cempid=new Choice();
        cempid.setBounds(200,50,150,30);
        add(cempid);
        
        try{
            Connect c=new Connect();
            String query="select * from employee";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                cempid.add(rs.getString("Employee_ID"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        JLabel lname=new JLabel("Name :");
        lname.setBounds(50,100,100,30);
        add(lname);
        
        JLabel name=new JLabel();
        name.setBounds(200,100,100,30);
        add(name);
        
        JLabel lfname=new JLabel("Father's Name :");
        lname.setBounds(50,150,100,30);
        add(lname);
        
        JLabel fname=new JLabel();
        name.setBounds(200,150,100,30);
        add(name);
        
        JLabel lphone=new JLabel("Contact Number :");
        lphone.setBounds(50,200,100,30);
        add(lphone);
        
        JLabel phone=new JLabel();
        phone.setBounds(200,200,100,30);
        add(phone);
        
        JLabel lemail=new JLabel("Email :");
        lemail.setBounds(50,250,100,30);
        add(lemail);
        
        JLabel email=new JLabel();
        email.setBounds(200,250,100,30);
        add(email);
        
        try{
            Connect c=new Connect();
            String query="select * from employee where Employee_ID='"+cempid.getSelectedItem()+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                name.setText(rs.getString("Name"));
                fname.setText(rs.getString("Father_Name"));
                email.setText(rs.getString("Email"));
                phone.setText(rs.getString("Phone_Number"));
            }  
        }catch(Exception e){
            e.printStackTrace();
        }           
        
        cempid.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
                    try{
                    Connect c=new Connect();
                    String query="select * from employee where Employee_ID='"+cempid.getSelectedItem()+"'";
                    ResultSet rs=c.s.executeQuery(query);
                    while(rs.next()){
                        name.setText(rs.getString("Name"));
                        fname.setText(rs.getString("Father_Name"));
                        email.setText(rs.getString("Email"));
                        phone.setText(rs.getString("Phone_Number"));
                    }  
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        
        delete=new JButton("Delete");
        delete.setBounds(80,300,100,30);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        delete.addActionListener(this);
        add(delete);
        
        back=new JButton("Back");
        back.setBounds(220,300,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
        Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 600, 400);
        add(image);
        
        ImageIcon img = new ImageIcon("C:\\Users\\AKASH NAUTIYAL\\Documents\\NetBeansProjects\\Employee Management System\\src\\icons\\expander.png");
        setIconImage(img.getImage());
        setSize(1000,450);
        setLocation(100,100);
        setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==delete){
                    try{
                          Connect c=new Connect();
                          String query=("delete from employee where Employee_ID='"+cempid.getSelectedItem()+"' ");
                          c.s.executeUpdate(query);
                          JOptionPane.showMessageDialog(null,"Employee Information deleted Successfully");
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
        new RemoveEmployee();
    }
}
