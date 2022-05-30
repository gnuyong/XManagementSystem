package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MemberAdder extends JFrame{
	
	public MemberAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelPhone = new JLabel("Phone: ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelPhone.setLabelFor(fieldPhone);
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		JLabel labelPT = new JLabel("PT: ", JLabel.TRAILING);
		JTextField fieldPT = new JTextField(10);
		labelPT.setLabelFor(fieldPT);
		panel.add(labelPT);
		panel.add(fieldPT);
		
		JLabel labelRegistration = new JLabel("Registration: ", JLabel.TRAILING);
		JTextField fieldRegistration = new JTextField(10);
		labelRegistration.setLabelFor(fieldRegistration);
		panel.add(labelRegistration);
		panel.add(fieldRegistration);
		
		JLabel labelLocker = new JLabel("Locker: ", JLabel.TRAILING);
		JTextField fieldLocker = new JTextField(10);
		labelLocker.setLabelFor(fieldLocker);
		panel.add(labelLocker);
		panel.add(fieldLocker);
		
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		
		SpringUtilities.makeCompactGrid(panel, 7, 2, 6, 6, 6, 6);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
	}

}