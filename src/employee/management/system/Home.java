package employee.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Home extends JFrame implements ActionListener{
    JButton add,view,update,delete,logout;
    Home(){
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630);
        add(image);
        
        JLabel heading=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(535,20,600,40);
        heading.setFont(new Font("serit",Font.BOLD,30));
        image.add(heading);
               
        add=new JButton("Add  Employee ");
        add.setBounds(550,100,200,40);
        add.setFont(new Font("serit",Font.BOLD,16));
        add.addActionListener(this);
        image.add(add);
        
        
        view=new JButton("View  Employees");
        view.setBounds(785,100,200,40);
        view.setFont(new Font("serit",Font.BOLD,16));
        view.addActionListener(this);
        image.add(view);
        
        update=new JButton("Update  Employee");
        update.setBounds(550,160,200,40);
        update.setFont(new Font("serit",Font.BOLD,16));
        update.addActionListener(this);
        image.add(update);
        
        delete=new JButton("Remove  Employee");
        delete.setBounds(785,160,200,40);
        delete.setFont(new Font("serit",Font.BOLD,16));
        delete.addActionListener(this);
        image.add(delete);
        
        logout=new JButton("Logout");
        logout.setBounds(785,220,200,40);
        logout.setFont(new Font("serit",Font.BOLD,16));
        logout.addActionListener(this);
        image.add(logout);
        
        ImageIcon img = new ImageIcon("C:\\Users\\AKASH NAUTIYAL\\Documents\\NetBeansProjects\\Employee Management System\\src\\icons\\expander.png");
        setIconImage(img.getImage());
        setSize(1120,630);
        setVisible(true);
        setLocation(75,50); // make changes in it
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
            setVisible(false);
            new AddEmployee();
        }else if(ae.getSource()==view){
            setVisible(false);
            new ViewEmployee();
        }else if(ae.getSource() ==update){
            setVisible(false);
            new ViewEmployee();
        }else if(ae.getSource()==delete){
                setVisible(false);
                new RemoveEmployee();
        }else{
            setVisible(false);
            new Login();
        }
    }
    public static void main(String args []){
        new Home();
        
    }
}
