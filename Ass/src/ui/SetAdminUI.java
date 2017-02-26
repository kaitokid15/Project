package ui;

import java.awt.*;

import javax.swing.*;

public class SetAdminUI extends JFrame
{
	private JLabel searchL, userNameL, fullNameL;
	private JLabel viewReportsL, maintainProductL, setAdminL;
	private JLabel stampL;
	
	private JTextField searchTF, userNameTF, fullNameTF, stampTF;
	
	private JButton addB, editB, deleteB, setB, resetB, recoverB;
	private JButton firstRecB, prevRecB, nextRecB, lastRecB;
	private JButton subModuleB;
	
	private JCheckBox reportsViewCB;
	private JCheckBox maintainProdViewCB, maintainProdAddCB, maintainProdEditCB, maintainProdDeleteCB;
	private JCheckBox setAdminViewCB, setAdminAddCB, setAdminEditCB, setAdminDeleteCB;
	
	private JPanel topPanel, midPanel, bottomPanel;
	private JPanel topPanelTop, topPanelMid, topPanelBot;
	private JPanel midFirstRowLeftPanel, midFirstRowRightPanel;
	private JPanel mid2ndRowLeftPanel, mid2ndRowRightPanel;
	private JPanel mid3rdRowLeftPanel, mid3rdRowRightPanel;
	private JPanel bottomTopPanel,bottomMidPanel, bottomMid2Panel, bottomBotPanel;
	
	public SetAdminUI()
	{
		setTitle("Set administrative rights");
		setSize(400, 300);
		
		Container mainP = getContentPane();
		mainP.setLayout(new BorderLayout());
		
		topPanel = new JPanel();
		topPanel.setLayout(new GridLayout(3,1));
				
		topPanelTop = new JPanel();
		searchL = new JLabel("Search");
		searchTF = new JTextField(10);
			
		topPanelMid = new JPanel();
		userNameL = new JLabel("User name");
		userNameTF = new JTextField(15);
				
		topPanelBot = new JPanel();
		fullNameL = new JLabel("Full    name");
		fullNameTF = new JTextField(15);
		
		topPanelTop.add(searchL);
		topPanelTop.add(searchTF);
		topPanel.add(topPanelTop);
		
		topPanelMid.add(userNameL);
		topPanelMid.add(userNameTF);
		topPanel.add(topPanelMid);
		
		topPanelBot.add(fullNameL);
		topPanelBot.add(fullNameTF);
		topPanel.add(topPanelBot);
		
		midPanel = new JPanel();
		midPanel.setLayout(new GridLayout(4,2));
		
		midFirstRowLeftPanel = new JPanel();
		midFirstRowLeftPanel.setLayout(new BorderLayout());
		
		viewReportsL = new JLabel("View Reports");
		midFirstRowLeftPanel.add(viewReportsL, BorderLayout.WEST);
		
		midFirstRowRightPanel = new JPanel();
		midFirstRowRightPanel.setLayout(new BorderLayout());
		
		reportsViewCB = new JCheckBox("View");
		subModuleB = new JButton("Enable/Disable subreports");
		subModuleB.setEnabled(false);
				
		midFirstRowRightPanel.add(reportsViewCB, BorderLayout.WEST);
		midFirstRowRightPanel.add(subModuleB, BorderLayout.CENTER);
				
		midFirstRowLeftPanel.add(midFirstRowRightPanel);
		
		mid2ndRowLeftPanel = new JPanel();
		mid2ndRowLeftPanel.setLayout(new BorderLayout());
		
		maintainProductL = new JLabel("Maintain Product");
		mid2ndRowLeftPanel.add(maintainProductL, BorderLayout.WEST);
		
		mid2ndRowRightPanel = new JPanel();
		mid2ndRowRightPanel.setLayout(new GridLayout(1,4));
		
		maintainProdViewCB = new JCheckBox("View");
		maintainProdAddCB = new JCheckBox("Add");
		maintainProdAddCB.setEnabled(false);
		
		maintainProdEditCB = new JCheckBox("Edit");
		maintainProdEditCB.setEnabled(false);
		
		maintainProdDeleteCB = new JCheckBox("Delete");
		maintainProdDeleteCB.setEnabled(false);
		
		mid2ndRowRightPanel.add(maintainProdViewCB);
		mid2ndRowRightPanel.add(maintainProdAddCB);
		mid2ndRowRightPanel.add(maintainProdEditCB);
		mid2ndRowRightPanel.add(maintainProdDeleteCB);
		
		mid2ndRowLeftPanel.add(mid2ndRowRightPanel, BorderLayout.EAST);
		
		mid3rdRowLeftPanel = new JPanel();
		mid3rdRowLeftPanel.setLayout(new BorderLayout());
		
		setAdminL = new JLabel("Set Admin Rights");
		mid3rdRowLeftPanel.add(setAdminL, BorderLayout.WEST);
		
		mid3rdRowRightPanel = new JPanel();
		mid3rdRowRightPanel.setLayout(new GridLayout(1,4));
		
		setAdminViewCB = new JCheckBox("View");
		setAdminAddCB = new JCheckBox("Add");
		setAdminAddCB.setEnabled(false);
		
		setAdminEditCB = new JCheckBox("Edit");
		setAdminEditCB.setEnabled(false);
		
		setAdminDeleteCB = new JCheckBox("Delete");
		setAdminDeleteCB.setEnabled(false);
		
		mid3rdRowRightPanel.add(setAdminViewCB);
		mid3rdRowRightPanel.add(setAdminAddCB);
		mid3rdRowRightPanel.add(setAdminEditCB);
		mid3rdRowRightPanel.add(setAdminDeleteCB);
		
		mid3rdRowLeftPanel.add(mid3rdRowRightPanel, BorderLayout.EAST);
		
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(4,1));
		
		bottomTopPanel = new JPanel();
		bottomTopPanel.setLayout(new BorderLayout());
			
		stampL = new JLabel("Stamp");
		stampTF = new JTextField(27);
		
		bottomTopPanel.add(stampL, BorderLayout.WEST);
		bottomTopPanel.add(stampTF, BorderLayout.EAST);
		bottomPanel.add(bottomTopPanel);
		
		bottomMidPanel= new JPanel();
		bottomMidPanel.setLayout(new GridLayout(1,3));
		
		addB = new JButton("Add");
		editB = new JButton("Edit");
		deleteB = new JButton("Delete");
		
		
		bottomMidPanel.add(addB);
		bottomMidPanel.add(editB);
		bottomMidPanel.add(deleteB);
		
		bottomPanel.add(bottomMidPanel);
		
		bottomMid2Panel = new JPanel();
		bottomMid2Panel.setLayout(new GridLayout(1,3));
		
		setB = new JButton("Set Password");
		resetB = new JButton("Reset Password");
		recoverB = new JButton("Recover");
		
		bottomMid2Panel.add(setB);
		bottomMid2Panel.add(resetB);
		bottomMid2Panel.add(recoverB);
		bottomPanel.add(bottomMid2Panel);
		
				
		bottomBotPanel = new JPanel();
		bottomBotPanel.setLayout(new GridLayout(1,4));
		
		firstRecB = new JButton("<<");
		prevRecB = new JButton("<");
		nextRecB = new JButton(">");
		lastRecB = new JButton(">>");
		
		
		bottomBotPanel.add(firstRecB);
		bottomBotPanel.add(prevRecB);
		bottomBotPanel.add(nextRecB);
		bottomBotPanel.add(lastRecB);
		
		bottomPanel.add(bottomBotPanel);
		
		midPanel.add(midFirstRowLeftPanel);
		midPanel.add(mid2ndRowLeftPanel);
		midPanel.add(mid3rdRowLeftPanel);
		
		mainP.add(topPanel, BorderLayout.NORTH);
		mainP.add(midPanel, BorderLayout.CENTER);
		mainP.add(bottomPanel, BorderLayout.SOUTH);
		
		setLocationRelativeTo(null); //center frame
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		new SetAdminUI();
	}

}