package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginSystem
{

	private JFrame frame;
	private JTextField textUserID;
	int attempt = 3;
	private JPasswordField passwordField;
	private JTextField textAttempts;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					LoginSystem window = new LoginSystem();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginSystem()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 327);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Login Page");

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Sitka Text", Font.BOLD, 18));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(81, 23, 200, 30);
		frame.getContentPane().add(lblLogin);

		JLabel lblUserID = new JLabel("Username");
		lblUserID.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUserID.setBounds(40, 80, 120, 30);
		frame.getContentPane().add(lblUserID);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(40, 144, 120, 30);
		frame.getContentPane().add(lblPassword);

		textUserID = new JTextField();
		textUserID.setBounds(191, 88, 173, 20);
		frame.getContentPane().add(textUserID);
		textUserID.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(191, 144, 173, 20);
		frame.getContentPane().add(passwordField);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				String username = textUserID.getText();
				@SuppressWarnings("deprecation")
				String password = passwordField.getText();
				if (username.contains("buland") && password.contains("123456"))
				{
					textUserID.setText(null);
					passwordField.setText(null);
					frame.setVisible(false);
					JOptionPane.showMessageDialog(null, "Login Success" , "Info" , JOptionPane.INFORMATION_MESSAGE);
				} else
				{
					attempt--;
					textAttempts.setText(attempt + "");
					JOptionPane.showMessageDialog(null, "Invalid Credidential",
							"Login Error", JOptionPane.ERROR_MESSAGE);
					if (attempt == 0)
					{
						JOptionPane.showMessageDialog(null,
								"Too Many Attempts", "Login Failed",
								JOptionPane.ERROR_MESSAGE);
						System.exit(0);
					}
				}
			}
		});
		btnLogin.setBounds(40, 209, 89, 23);
		frame.getContentPane().add(btnLogin);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				textUserID.setText("");
				passwordField.setText("");
			}
		});
		btnReset.setBounds(156, 209, 89, 23);
		frame.getContentPane().add(btnReset);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm Exit",
						"Login", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(275, 209, 89, 23);
		frame.getContentPane().add(btnExit);

		JLabel lblAttempts = new JLabel("Attempts Remaining:");
		lblAttempts.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAttempts.setBounds(40, 252, 200, 25);
		frame.getContentPane().add(lblAttempts);

		textAttempts = new JTextField("3");
		textAttempts.setEditable(false);
		textAttempts.setBounds(250, 257, 20, 20);
		frame.getContentPane().add(textAttempts);
		textAttempts.setColumns(10);
	}
}
