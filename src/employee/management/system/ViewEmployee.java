package employee.management.system;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class ViewEmployee extends JFrame implements ActionListener{
    JTable table;
    Choice cempid;
    JButton find,print,update,back;
    ViewEmployee(){
        
      getContentPane().setBackground(Color.WHITE);
      setLayout(null);
      
      JLabel search=new JLabel("Search By Employee ID");
      search.setBounds(20,20,150,20);
      add(search);
      cempid=new Choice();
      cempid.setBounds(180,20,150,20);
      add(cempid);
      
      try{
          Connect c=new Connect();
          ResultSet rs=c.s.executeQuery("select * from employee");
          while(rs.next()){
          cempid.add((rs.getString("Employee_ID")));
          }
          
      }catch(Exception e){
          e.printStackTrace();
      }
      
      table=new JTable();
      
      try{
          Connect c=new Connect();
          ResultSet rs=c.s.executeQuery("select * from employee");
          table.setModel(DbUtils.resultSetToTableModel(rs));
          
      }catch(Exception e){
          e.printStackTrace();
      }
      
      JScrollPane jsp=new JScrollPane(table);
      jsp.setBounds(10,100,1150,600);
      add(jsp);
      
      find=new JButton("Search");
      find.setBounds(20,70,80,20);
      find.addActionListener(this);
      add(find);
      
      print=new JButton("Print");
      print.setBounds(120,70,80,20);
      print.addActionListener(this);
      add(print);
      
      update=new JButton("Update");
      update.setBounds(220,70,80,20);
      update.addActionListener(this);
      add(update);
      
      back=new JButton("Back");
      back.setBounds(320,70,80,20);
      back.addActionListener(this);
      add(back);
      
      ImageIcon img = new ImageIcon("C:\\Users\\AKASH NAUTIYAL\\Documents\\NetBeansProjects\\Employee Management System\\src\\icons\\expander.png");
      setIconImage(img.getImage());
      setSize(1200,800);
      setLocation(25,25);
      setVisible(true);
  }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==find){
                String query=("select * from employee where Employee_ID='"+cempid.getSelectedItem()+"'");
                try{
                    Connect c=new Connect();
                    ResultSet rs=c.s.executeQuery(query);
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                }catch(Exception e){
                    e.printStackTrace();
                }
        }else if(ae.getSource()==print){
                try{
                table.print();
                }catch(Exception e){
                    e.printStackTrace();
                  }
        }else if(ae.getSource()==update){
                setVisible(false);
                new UpdateEmployee(cempid.getSelectedItem());
        }else{
            setVisible(false);
            new Home();
        }
        
    }
    public static void main(String args[]){
      new ViewEmployee();
  }  
}
