import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class ATMGUI {

	
	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		frame2 frame_2=new frame2();
		frame_2.setVisible(false);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATMGUI window = new ATMGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATMGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Account user=new Account("555","000",1000);
		
		Panel panel = new Panel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("Log In");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblLogin.setBounds(181, 0, 166, 66);
		panel.add(lblLogin);
		
		JLabel lblCardId = new JLabel("card id");
		lblCardId.setForeground(Color.WHITE);
		lblCardId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCardId.setBounds(22, 68, 138, 53);
		panel.add(lblCardId);
		
		textField = new JTextField();
		textField.setBounds(32, 114, 128, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(22, 145, 110, 44);
		panel.add(lblPassword);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(user.LogIn(textField.getText(), passwordField.getText()))
				{
					JOptionPane.showMessageDialog(null, "logged in");
					frame.setVisible(false);
					frame2.main();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "invalid");
				}
				
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNext.setBounds(248, 145, 138, 72);
		panel.add(btnNext);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(32, 200, 128, 20);
		panel.add(passwordField);
	}
}
