package gUI;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Account.Account;
import Account.Cheque;
import Account.Fixed;
import Account.NetSaving;
import Account.Saving;
import User.User;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserId ;
	private JPasswordField txtPassword;
	




	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	//Trying to crate switch Panel method
//	public void switchPanel(JPanel panel) {
//		getLayeredPane().removeAll();
//		getLayeredPane().add(panel);
//		getLayeredPane().repaint();
//		getLayeredPane().revalidate();
//	
//		
//		
//	}
	
	Saving sav = new Saving();
	NetSaving net = new NetSaving();
	Cheque che = new Cheque();
	Fixed fix = new Fixed();
	JTextArea txtAreaSaving = new JTextArea();
	private JTextField txtDeposit;
	public int focus = 1;
	
	
	
	
	
	
	public Menu() {
		
		
		
		setResizable(false);
		setTitle("AITBANK ATM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
	
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(focus ==1) {
					txtUserId.setText(txtUserId.getText()+"1");
				}
				if(focus ==2) {
					txtPassword.setText(txtPassword.getText()+"1");
				}
				if(focus ==3) {
					txtDeposit.setText(txtDeposit.getText()+"1");
				}
				
			
				
			}
		});
		btn1.setBounds(10, 208, 71, 23);
		contentPane.add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(focus ==1) {
					txtUserId.setText(txtUserId.getText()+"4");
				}
				if(focus ==2) {
					txtPassword.setText(txtPassword.getText()+"4");
				}
				if(focus ==3) {
					txtDeposit.setText(txtDeposit.getText()+"4");
				}
			}
		});
		btn4.setBounds(10, 242, 71, 23);
		contentPane.add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(focus ==1) {
					txtUserId.setText(txtUserId.getText()+"7");
				}
				if(focus ==2) {
					txtPassword.setText(txtPassword.getText()+"7");
				}
			}
		});
		btn7.setBounds(10, 276, 71, 23);
		contentPane.add(btn7);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(focus ==1) {
					txtUserId.setText(txtUserId.getText()+"2");
				}
				if(focus ==2) {
					txtPassword.setText(txtPassword.getText()+"2");
				}
			}
		});
		btn2.setBounds(91, 208, 71, 23);
		contentPane.add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(focus ==1) {
					txtUserId.setText(txtUserId.getText()+"5");
				}
				if(focus ==2) {
					txtPassword.setText(txtPassword.getText()+"5");
				}
			}
		});
		btn5.setBounds(91, 242, 71, 23);
		contentPane.add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(focus ==1) {
					txtUserId.setText(txtUserId.getText()+"8");
				}
				if(focus ==2) {
					txtPassword.setText(txtPassword.getText()+"8");
				}
			}
		});
		btn8.setBounds(91, 276, 71, 23);
		contentPane.add(btn8);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(focus ==1) {
					txtUserId.setText(txtUserId.getText()+"3");
				}
				if(focus ==2) {
					txtPassword.setText(txtPassword.getText()+"3");
				}
			}
		});
		btn3.setBounds(172, 208, 71, 23);
		contentPane.add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(focus ==1) {
					txtUserId.setText(txtUserId.getText()+"6");
				}
				if(focus ==2) {
					txtPassword.setText(txtPassword.getText()+"6");
				}
			}
		});
		btn6.setBounds(172, 242, 71, 23);
		contentPane.add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(focus ==1) {
					txtUserId.setText(txtUserId.getText()+"9");
				}
				if(focus ==2) {
					txtPassword.setText(txtPassword.getText()+"9");
				}
			}
		});
		btn9.setBounds(172, 276, 71, 23);
		contentPane.add(btn9);
		
		
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUserId.setText("");
				txtPassword.setText("");
				txtDeposit.setText("");
			}
		});
		btnClear.setBounds(299, 242, 135, 23);
		contentPane.add(btnClear);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(focus ==1) {
					txtUserId.setText(txtUserId.getText()+"0");
				}
				if(focus ==2) {
					txtPassword.setText(txtPassword.getText()+"0");
				}
			}
		});
		btn0.setBounds(10, 310, 71, 23);
		contentPane.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(focus ==1) {
					txtUserId.setText(txtUserId.getText()+".");
				}
				if(focus ==2) {
					txtPassword.setText(txtPassword.getText()+".");
				}
			}
		});
		btnDot.setBounds(91, 310, 71, 23);
		contentPane.add(btnDot);
		
//		// Dua dam nay xuong duoi, sau khi  khoi tao textField
//		
//		// 2 cai nay nhet vao 1 ham, tao 1 su kien, gan ham nay vao
//		String text = txtUserId.getText();
//		int id = Integer.parseInt(text);	
//			
//		public  int getTxtUserId() {		
//			return id;
//		}
//		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(focus ==1) {
					txtUserId.setText(txtUserId.getText()+"00");
				}
				if(focus ==2) {
					txtPassword.setText(txtPassword.getText()+"00");
				}
				String text = txtUserId.getText();
				int id = Integer.parseInt(text);
				
			}
		});
		btn00.setBounds(172, 310, 71, 23);
		contentPane.add(btn00);
		
	
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 11, 424, 181);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panelLogin = new JPanel();
		panelLogin.setBackground(new Color(204, 255, 255));
		layeredPane.add(panelLogin, "name_823237540618700");
		panelLogin.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to AITBANK ATM");
		lblNewLabel.setFont(new Font("DialogInput", Font.BOLD, 18));
		lblNewLabel.setBounds(89, 11, 252, 32);
		panelLogin.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(89, 75, 72, 14);
		panelLogin.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(89, 100, 72, 14);
		panelLogin.add(lblNewLabel_2);
		
		txtUserId = new JTextField();
		txtUserId.setBounds(171, 73, 159, 20);
		panelLogin.add(txtUserId);
		txtUserId.setColumns(10);
		
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(171, 98, 159, 20);
		panelLogin.add(txtPassword);
		txtPassword.setEnabled(false);
		
		txtDeposit = new JTextField();
		txtDeposit.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDeposit.setBounds(130, 77, 195, 45);
		txtDeposit.setColumns(10);
		
		//--------- Set focus on TextField -------------------------------
		 
		txtUserId.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            		focus = 1;
            		txtUserId.setEnabled(true);
            		txtPassword.setEnabled(false);
            		
            		}
        });
		txtPassword.addMouseListener(new MouseAdapter() {
			@Override
            public void mouseClicked(MouseEvent e){
				focus = 2;
				txtUserId.setEnabled(false);
				txtPassword.setEnabled(true);
				
    			
			}

		});
		txtDeposit.addMouseListener(new MouseAdapter() {
			@Override
            public void mouseClicked(MouseEvent e){
				focus = 3;
				txtDeposit.setEnabled(true);
				
			}
		});
		
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(204, 255, 255));
		layeredPane.add(panelMenu, "name_823237553269200");
		panelMenu.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("What would you like to do?");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(83, 37, 250, 23);
		panelMenu.add(lblNewLabel_3);
		
	
		
		
	
		
		JButton btnWithdraw_1 = new JButton("Withdraw");
		btnWithdraw_1.setBounds(126, 139, 155, 23);
		panelMenu.add(btnWithdraw_1);
		
		JPanel panelAccount = new JPanel();
		panelAccount.setBackground(new Color(204, 255, 255));
		layeredPane.add(panelAccount, "name_952797978049800");
		panelAccount.setLayout(null);
		
		JButton btnNewButton = new JButton("Account Balance");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panelAccount);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		btnNewButton.setBounds(126, 71, 155, 23);
		panelMenu.add(btnNewButton);
		
		JLabel labWelcome = new JLabel();
		labWelcome.setFont(new Font("Tahoma", Font.BOLD, 18));
		labWelcome.setBounds(83, 11, 238, 23);
		panelMenu.add(labWelcome);
		labWelcome.setText("Hello "+txtUserId.getText());		//Hello to user !!
		
		
		JLabel lblNewLabel_4 = new JLabel("Account");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(171, 11, 83, 27);
		panelAccount.add(lblNewLabel_4);
		

		JPanel panelDisplayInfo = new JPanel();
		panelDisplayInfo.setBackground(new Color(204, 255, 255));
		layeredPane.add(panelDisplayInfo, "name_955237127672900");
		panelDisplayInfo.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Saving");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panelDisplayInfo);
				layeredPane.repaint();
				layeredPane.revalidate();
				txtAreaSaving.setText("======================_Account Saving_======================\n"+
						"Daily Rate: "+ sav.getRate()+"%\n"+
						"Limit Witdraw: $"+sav.getLimit()+
						"\nBalance: $"+sav.getBalance()
						);
			}
		});
		btnNewButton_1.setBounds(66, 49, 139, 39);
		panelAccount.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Net Saving");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panelDisplayInfo);
				layeredPane.repaint();
				layeredPane.revalidate();
				txtAreaSaving.setText("======================_Account Net Saving_======================\n"+
						"Monthy Rate: "+ net.getRate()+"%\n"+
						"Limit Witdraw: $"+net.getLimit()+
						"\nBalance: $"+net.getBalance()
						);
			}
		});
		btnNewButton_1_1.setBounds(66, 99, 139, 39);
		panelAccount.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Cheque");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panelDisplayInfo);
				layeredPane.repaint();
				layeredPane.revalidate();
				txtAreaSaving.setText("======================_Account Cheque_======================\n"+
						
						
						"\nBalance: $"+che.getBalance()
						);
				
			}
		});
		btnNewButton_1_2.setBounds(215, 49, 139, 39);
		panelAccount.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Fixed");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panelDisplayInfo);
				layeredPane.repaint();
				layeredPane.revalidate();
				txtAreaSaving.setText("======================_Account Fixed_======================\n"+
						"Interest: "+ fix.getRate()+"%\n"+
						
						"\nBalance: $"+fix.getBalance()
						);
			}
		});
		btnNewButton_1_3.setBounds(215, 99, 139, 39);
		panelAccount.add(btnNewButton_1_3);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panelMenu);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnNewButton_2.setBounds(165, 147, 89, 23);
		panelAccount.add(btnNewButton_2);
		
		
		//text
		txtAreaSaving.setBounds(10, 11, 404, 111);
		panelDisplayInfo.add(txtAreaSaving);
		
		
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panelAccount);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		btnNewButton_3.setBounds(170, 147, 89, 23);
		panelDisplayInfo.add(btnNewButton_3);
		
		JPanel panelDeposit = new JPanel();
		panelDeposit.setBackground(new Color(204, 255, 255));
		layeredPane.add(panelDeposit, "name_431809381031100");
		panelDeposit.setLayout(null);
		// enable deposit text field
		panelDeposit.add(txtDeposit);
		txtDeposit.setEnabled(true);
		
		JLabel lblNewLabel_5 = new JLabel("Which account do you want to deposit?");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(44, 11, 336, 22);
		panelDeposit.add(lblNewLabel_5);
		
		JComboBox cbBoxSelectAccount = new JComboBox();
		cbBoxSelectAccount.setModel(new DefaultComboBoxModel(new String[] {"Saving", "Net Saving", "Cheque", "Fixed"}));
		cbBoxSelectAccount.setBounds(93, 44, 232, 22);
		panelDeposit.add(cbBoxSelectAccount);
		
		
		
		
		JButton btnAccDeposit = new JButton("Deposit");
		btnAccDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectAccount = String.valueOf(cbBoxSelectAccount.getSelectedItem());
				if(selectAccount.equals("Saving")) {
					User user = new User();
					Saving acc = new Saving();
					if(user.checkId(Integer.parseInt(txtUserId.getText()))) {
						if(txtDeposit.getText().length() !=0) {
							acc.deposit(Double.parseDouble(txtDeposit.getText()));
						}
						
					}

				}
				if(selectAccount.equals("Net Saving")) {
					
				}
				if(selectAccount.equals("Cheque")) {
					
				}
				if(selectAccount.equals("Fixed")) {
					
				}
			}
		});
		btnAccDeposit.setBounds(93, 147, 89, 23);
		panelDeposit.add(btnAccDeposit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panelMenu);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
			
		});
		btnBack.setBounds(236, 147, 89, 23);
		panelDeposit.add(btnBack);
		
		JLabel lblNewLabel_6 = new JLabel("$");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_6.setBounds(100, 77, 20, 45);
		panelDeposit.add(lblNewLabel_6);
	
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String UserIdLogin = String.valueOf(txtUserId);
				
				
				
									
				//switchPanel(panelMenu);
				boolean isLogIn = false;
				
				String userId = txtUserId.getText();
				String password = new String(txtPassword.getPassword());
				
				StringBuilder notice = new StringBuilder();
				if(userId.equals("")) {
					notice.append("User Id name is empty!\n");
				}
				if(password.equals("")) {
					notice.append("Password can not empty!");
				}
				if(notice.length() > 0) {
					JOptionPane.showMessageDialog(null, notice.toString(),"Invalidation",JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(userId.equals("1111") && password.equals("2222")) {
					isLogIn = true;
				}else {
					JOptionPane.showMessageDialog(null, "Invalid User Id or Password!");
				}
				
				
				
				if(isLogIn==true) {
					layeredPane.removeAll();
					layeredPane.add(panelMenu);
					layeredPane.repaint();
					layeredPane.revalidate();			
				}
				//JOptionPane.showMessageDialog(null, "User Id"+id);
			}
		});
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane.removeAll();
				layeredPane.add(panelLogin);
				layeredPane.repaint();
				layeredPane.revalidate();
				txtUserId.setText("");
				txtPassword.setText("");
				txtDeposit.setText("");
				
			}
		});
		btnCancel.setBounds(299, 208, 135, 23);
		contentPane.add(btnCancel);
		
		btnEnter.setBounds(299, 276, 135, 57);
		contentPane.add(btnEnter);
		JButton btnDeposit_1 = new JButton("Deposit");
		btnDeposit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panelDeposit);
				layeredPane.repaint();
				layeredPane.revalidate();	
				focus =3;
				
			}
		});
		btnDeposit_1.setBounds(126, 105, 155, 23);
		panelMenu.add(btnDeposit_1);
		
		
	}
}
