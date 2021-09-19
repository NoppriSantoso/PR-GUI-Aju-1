import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Register extends JFrame
{
	//deklarasi global
	JPanel northPanel, centerPanel, southPanel;
	JLabel lblTitle,lblName,lblEmail,lblPassword,lblAge,lblGender,lblAddress;
	JButton btnRegister,btnReset;
	JTextField txtEmail,txtName,txtAge,txtAddress,txtGender;
	JPasswordField txtPassword;
	
	void components()
	{
		northPanel = new JPanel();
		centerPanel = new JPanel();
		southPanel = new JPanel();
		
		northPanel.setBackground(Color.CYAN);
		centerPanel.setBackground(Color.LIGHT_GRAY);
		southPanel.setBackground(Color.YELLOW);
		
		add(northPanel, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		
		North();
		Center();
		South();
	}
	
	void North()
	{
		lblTitle = new JLabel("Register");
		northPanel.add(lblTitle);
		lblTitle.setFont(new Font("Arial",Font.BOLD,24));
	}
	
	void Center()
	{
		lblName = new JLabel("Full Name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setVerticalAlignment(SwingConstants.CENTER);
		
		lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setVerticalAlignment(SwingConstants.CENTER);
		
		lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setVerticalAlignment(SwingConstants.CENTER);
		
		lblAge = new JLabel("Age");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setVerticalAlignment(SwingConstants.CENTER);
		
		lblGender = new JLabel("Gender");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setVerticalAlignment(SwingConstants.CENTER);
		
		lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setVerticalAlignment(SwingConstants.CENTER);
		
		txtName = new JTextField();
		txtEmail = new JTextField();
		txtPassword = new JPasswordField();
		txtAge = new JTextField();
		txtGender = new JTextField();
		txtAddress = new JTextField();
		
		centerPanel.setLayout(new GridLayout(6,2,50,50));
		centerPanel.add(lblName);
		centerPanel.add(txtName);
		centerPanel.add(lblEmail);
		centerPanel.add(txtEmail);
		centerPanel.add(lblPassword);
		centerPanel.add(txtPassword);
		centerPanel.add(lblAge);
		centerPanel.add(txtAge);
		centerPanel.add(lblGender);
		centerPanel.add(txtGender);
		centerPanel.add(lblAddress);
		centerPanel.add(txtAddress);
	}
	
	void South()
	{
		southPanel.setLayout(new FlowLayout());
		btnRegister = new JButton("Register");
		btnReset = new JButton("Reset");
		southPanel.add(btnRegister);
		southPanel.add(btnReset);
	}
	public Register()
	{
		setVisible(true);
		setLayout(new BorderLayout());
		components();
		setSize(450, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		new Register();

	}

}
