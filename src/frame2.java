import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Label;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class frame2 extends JFrame {
	public boolean withdrawOrDeposit;
	private JPanel contentPane;
	//int i=0;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 frame = new frame2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frame2() {
		
		Account user=new Account("555","000",1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 388);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(10, 10, 414, 329);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setVisible(false);
		
		Label label = new Label("");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setAlignment(Label.CENTER);
		label.setBackground(Color.WHITE);
		label.setBounds(10, 48, 414, 53);
		contentPane.add(label);
		
		
		JButton btnNewButton_1 = new JButton("50");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(withdrawOrDeposit) {
					
				user.withdraw(50);
					JOptionPane.showMessageDialog(null, "successfully withdrawn 50");
					panel.setVisible(false);
				
				}
				else 
				{
					user.deposit(50);
					JOptionPane.showMessageDialog(null, "successfully deposited 50");
					panel.setVisible(false);
					
				}
				label.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(10, 108, 114, 47);
		panel.add(btnNewButton_1);
		
		JButton button = new JButton("200");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(withdrawOrDeposit) {
					user.withdraw(200);
					JOptionPane.showMessageDialog(null, "successfully withdrawn 200");
					panel.setVisible(false);
				    }
					else 
					{
						user.deposit(200);
						JOptionPane.showMessageDialog(null, "successfully deposited 200");
						panel.setVisible(false);
						
					}
				label.setText("");
				}
			
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.setBounds(10, 166, 114, 47);
		panel.add(button);
		
		JButton button_1 = new JButton("1000");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(withdrawOrDeposit) {
					user.withdraw(1000);
						JOptionPane.showMessageDialog(null, "successfully withdrawn 1000");
						panel.setVisible(false);
					}
					
				else 
					{
						user.deposit(1000);
						JOptionPane.showMessageDialog(null, "successfully deposited 1000");
						panel.setVisible(false);
						
					}
				label.setText("");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_1.setBounds(10, 224, 114, 47);
		panel.add(button_1);
		
		JButton button_2 = new JButton("3000\r\n");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(withdrawOrDeposit) {
					user.withdraw(3000);
					JOptionPane.showMessageDialog(null, "successfully withdrawn 3000");
					panel.setVisible(false);
					}
					else 
					{
						user.deposit(3000);
						JOptionPane.showMessageDialog(null, "successfully deposited 3000");
						panel.setVisible(false);
						
					}
				label.setText("");
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_2.setBounds(10, 282, 114, 47);
		panel.add(button_2);
		
		JButton button_3 = new JButton("100");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(withdrawOrDeposit) {
					user.withdraw(100);
					JOptionPane.showMessageDialog(null, "successfully withdrawn 100");
					panel.setVisible(false);
					}
					else 
					{
						user.deposit(100);
						JOptionPane.showMessageDialog(null, "successfully deposited 100");
						panel.setVisible(false);
						
					}
				label.setText("");
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_3.setBounds(300, 108, 114, 47);
		panel.add(button_3);
		
		JButton button_4 = new JButton("500\r\n");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(withdrawOrDeposit) {
					user.withdraw(500.0);
					JOptionPane.showMessageDialog(null, "successfully withdrawn 500");
					panel.setVisible(false);
					
					}
					else 
					{
						user.deposit(500.0);
						JOptionPane.showMessageDialog(null, "successfully deposited 500");
						panel.setVisible(false);
						
					}
				label.setText("");
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_4.setBounds(300, 166, 114, 47);
		panel.add(button_4);
		
		JButton button_5 = new JButton("2000");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(withdrawOrDeposit) {
					user.withdraw(2000);
					JOptionPane.showMessageDialog(null, "successfully withdrawn 2000");
					panel.setVisible(false);
					}
					else 
					{
						user.deposit(2000);
						JOptionPane.showMessageDialog(null, "successfully deposited 2000");
						panel.setVisible(false);
						
					}
				label.setText("");
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_5.setBounds(300, 224, 114, 47);
		panel.add(button_5);
		
		JButton button_6 = new JButton("4000");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(withdrawOrDeposit) {
					user.withdraw(4000);
					JOptionPane.showMessageDialog(null, "successfully withdrawn 4000");
					panel.setVisible(false);
					}
					else 
					{
						user.deposit(4000);
						JOptionPane.showMessageDialog(null, "successfully deposited 4000");
						panel.setVisible(false);
						
					}
				label.setText("");
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_6.setBounds(300, 282, 114, 47);
		panel.add(button_6);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBack.setBounds(10, 11, 89, 23);
		panel.add(btnBack);
		
		Label label_1 = new Label("Select Amount");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.PLAIN, 22));
		label_1.setAlignment(Label.CENTER);
		label_1.setBackground(Color.DARK_GRAY);
		label_1.setBounds(97, 39, 218, 45);
		panel.add(label_1);
		
		
	/*	Label label = new Label("");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setAlignment(Label.CENTER);
		label.setBackground(Color.WHITE);
		label.setBounds(10, 48, 414, 53);
		contentPane.add(label); */
		
		JButton btnNewButton = new JButton("Withdraw");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdrawOrDeposit=true;
				panel.setVisible(true);
				if(user.balance<50)btnNewButton_1.setVisible(false);
				if(user.balance<200)button.setVisible(false);
				if(user.balance<1000)button_1.setVisible(false);
				if(user.balance<3000)button_2.setVisible(false);
				if(user.balance<100)button_3.setVisible(false);
				if(user.balance<500)button_4.setVisible(false);
				if(user.balance<2000)button_5.setVisible(false);
				if(user.balance<4000)button_6.setVisible(false);
				
			}
		});
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(10, 107, 161, 107);
		contentPane.add(btnNewButton);
		
		JButton btnDeposit = new JButton("Deposit\r\n");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdrawOrDeposit=false;
				panel.setVisible(true);
				btnNewButton_1.setVisible(true);
				button.setVisible(true);
				button_1.setVisible(true);
				button_2.setVisible(true);
				button_3.setVisible(true);
				button_4.setVisible(true);
				button_5.setVisible(true);
				button_6.setVisible(true);
				
				
			}
		});
		btnDeposit.setBackground(UIManager.getColor("Button.background"));
		btnDeposit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDeposit.setBounds(263, 107, 161, 107);
		contentPane.add(btnDeposit);
		
		
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(user.prev());
			}
		});
		btnPrevious.setBackground(UIManager.getColor("Button.background"));
		btnPrevious.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPrevious.setBounds(10, 243, 117, 59);
		contentPane.add(btnPrevious);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(user.next());
			}
		});
		btnNext.setBackground(UIManager.getColor("Button.background"));
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNext.setBounds(308, 243, 116, 59);
		contentPane.add(btnNext);
		
		JButton btnViewBalance = new JButton("View Balance");
		btnViewBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Balance = "+user.displayBalance());
				
			}
		});
		btnViewBalance.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnViewBalance.setBounds(143, 243, 145, 59);
		contentPane.add(btnViewBalance);
	}
}
