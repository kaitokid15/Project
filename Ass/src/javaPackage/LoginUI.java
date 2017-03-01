package javaPackage;
import java.awt.*;



import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

public class LoginUI extends JFrame implements ActionListener
{
	Connection myConn;
	Statement myStat;
	ResultSet myRs;
	private JLabel usernameL, passwordL;
	private JTextField usernameTF,passwordTF;
	private JButton loginB;
	
	private JPanel topP, bottomP;

     
	public LoginUI()
	{
		
	     Connect();
		setTitle("Login");
		setSize(200,120);
		Container mainP = getContentPane();
		
		topP = new JPanel();
		topP.setLayout(new GridLayout(2,2));
		
		usernameL=new JLabel("Username:");
		usernameTF = new JTextField(5);
		
		passwordL = new JLabel("Password: ");
		passwordTF = new JTextField(10);
		
		topP.add(usernameL);
		topP.add(usernameTF);
		topP.add(passwordL);
		topP.add(passwordTF);
		
		bottomP= new JPanel();
		bottomP.setLayout(new FlowLayout());
		
		loginB = new JButton("Login");
		loginB.addActionListener(this);
		
		bottomP.add(loginB);
		
		
		mainP.add(topP, BorderLayout.NORTH);
		mainP.add(bottomP, BorderLayout.SOUTH);
		
		setLocationRelativeTo(null); //center frame
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	public void Connect(){
		try{
			 String jdbcClassName="com.ibm.db2.jcc.DB2Driver";
			    
			    Class.forName(jdbcClassName);
			    
			    myConn =  DriverManager.getConnection("jdbc:db2:login");
			
		}catch(Exception exc){
			exc.printStackTrace();
		}
		    	
	}
	public static void main(String[] args) 
	{
	
		new LoginUI();
	}


		
public void actionPerformed(ActionEvent e) 
{ 
	String action=e.getActionCommand();
	try{
	
	Statement myStat= myConn.createStatement();
	
	ResultSet myRs = myStat.executeQuery("select * from  main");
	  while (myRs.next()){
		 
		 String user = usernameTF.getText();
		 String pass = passwordTF.getText();
			 
		 if(user.equals(myRs.getString("username")) && pass.equals(myRs.getString("password"))){
			 new MainUI(usernameTF.getText());
					
			dispose();
		 }
		 else if (usernameTF.getText().trim().length() == 0
					|| passwordTF.getText().length() == 0) {
				JOptionPane.showMessageDialog(null,
						"Please Fill out both of the textBoxes");
			}

			else {

				JOptionPane.showMessageDialog(null,
						"Wrong Password / Username");
				usernameTF.setText("");
				passwordTF.setText("");
				usernameTF.requestFocus();
			}

		}
    
} catch (Exception exc) {
    exc.printStackTrace();
}
System.out.print();
}
}
