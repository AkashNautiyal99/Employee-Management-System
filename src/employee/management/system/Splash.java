package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {
    
    Splash() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(100, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 55));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front_page.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image);
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400, 400, 300, 70);
        clickhere.setBackground(Color.WHITE);
        clickhere.setForeground(Color.RED);
        clickhere.addActionListener(this);
        image.add(clickhere);
        
        ImageIcon img = new ImageIcon("C:\\Users\\AKASH NAUTIYAL\\Documents\\NetBeansProjects\\Employee Management System\\src\\icons\\expander.png");
        setIconImage(img.getImage());
        setSize(1170, 650);
        setLocation(50, 25);
        setVisible(true);
        
//        while(true) {
//            heading.setVisible(false);
//            try {
//                Thread.sleep(500);
//            } catch (Exception e){
//                
//            }
//            
//            heading.setVisible(true);
//            try {
//                Thread.sleep(500);
//            } catch (Exception e){
//                
//            }
//        }
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    
    public static void main(String args[]) {
        new Splash();
    }
}