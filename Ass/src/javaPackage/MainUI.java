package javaPackage;
import java.awt.*;


import javax.swing.*;

public class MainUI extends JFrame
{
	private JButton customerB, reportsB, adminB, exitB;
	
	public MainUI(String user)
	{
		setTitle("Main");
		setSize(200,150);
		
		Container mainP=getContentPane();
		mainP.setLayout(new GridLayout(4,1));
		
		customerB = new JButton("Maintain Customer");
		reportsB= new JButton("View Reports");
		adminB = new JButton("Set admin rights");
		exitB = new JButton("Exit");
		
		mainP.add(customerB);
		mainP.add(reportsB);
		
		if(user.equals("admin"))
			mainP.add(adminB);
		
		mainP.add(exitB);
		
		setLocationRelativeTo(null); //center frame
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}