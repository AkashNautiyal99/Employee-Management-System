package employee.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JTextField Tusername;
    JPasswordField Tpassword;
    Login(){
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel username=new JLabel("USERNAME");
        username.setBounds(40,20,100,30);
        add(username);
        
        Tusername=new JTextField();
        Tusername.setBounds(150,20,150,30);
        add(Tusername);
        
        JLabel password=new JLabel("PASSWORD");
        password.setBounds(40,70,100,30);
        add(password);
        
        Tpassword=new JPasswordField();
        Tpassword.setBounds(150,70,150,30);
        add(Tpassword);
        
        JButton login = new JButton("LOGIN");
        login.setBounds(150, 140, 150, 30);
        login.setBackground(Color.WHITE);
        login.setForeground(Color.RED);
        login.addActionListener(this);
        add(login);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/profile_login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);
        
        ImageIcon img = new ImageIcon("C:\\Users\\AKASH NAUTIYAL\\Documents\\NetBeansProjects\\Employee Management System\\src\\icons\\expander.png");
        setIconImage(img.getImage());
        setSize(600,300);
        setVisible(true);
        setLocation(450,200);

    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            String username=Tusername.getText();
            String password= new String(Tpassword.getPassword());
            Connect c=new Connect();
            String query="select * from login where username='"+username+"' and password ='"+password+"'";
            ResultSet rs=c.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                new Home();
            }else{
                JOptionPane.showMessageDialog(null,"INVALID USERNAME OR PASSWORD");
                setVisible(false);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args []){
        new Login();
    }
}
