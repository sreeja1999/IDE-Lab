import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class MainFrame {

	private JFrame frame;
	private String displayString;
	private JTextPane textPane;
	private double firstNumber,secondNumber;
	private char operator;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainFrame() {
		initialize();
	}

	private void initialize() {
		firstNumber = 0;
		secondNumber = 0;
		displayString = "0";
		operator = '\0';
		frame = new JFrame();
		frame.setBounds(100, 100, 324, 283);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setText(displayString);
		textPane.setBounds(10, 10, 280, 36);
		frame.getContentPane().add(textPane);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString+="1";
				textPane.setText(displayString);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(10, 56, 56, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString+="2";
				textPane.setText(displayString);
			}
		});
		btnNewButton_1.setBounds(76, 56, 56, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString+="3";
				textPane.setText(displayString);
			}
		});
		btnNewButton_2.setBounds(142, 56, 56, 40);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString+="4";
				textPane.setText(displayString);
			}
		});
		btnNewButton_3.setBounds(10, 107, 56, 36);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString+="5";
				textPane.setText(displayString);
			}
		});
		btnNewButton_4.setBounds(76, 106, 56, 37);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString+="6";
				textPane.setText(displayString);
			}
		});
		btnNewButton_5.setBounds(142, 106, 56, 37);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString+="7";
				textPane.setText(displayString);
			}
		});
		btnNewButton_6.setBounds(10, 153, 56, 36);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString+="8";
				textPane.setText(displayString);
			}
		});
		btnNewButton_7.setBounds(76, 153, 56, 36);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString+="9";
				textPane.setText(displayString);
			}
		});
		btnNewButton_8.setBounds(142, 153, 56, 36);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(displayString.equals("") || displayString.equals("0"))) {
					displayString+="0";
					textPane.setText(displayString);	
				}else {
					textPane.setText("0");
					displayString="";
				}
			}
		});
		btnNewButton_9.setBounds(76, 199, 56, 36);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("+");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operator == '\0') {
					operator = '+';
					if(!displayString.equals("")) {
						firstNumber = Double.parseDouble(displayString);	
					}else {
						firstNumber = 0;
					}
					displayString = "";
				}else {
					operator = '+';
				}
			}
		});
		btnNewButton_10.setBounds(205, 56, 45, 40);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operator == '\0') {
					if(!displayString.equals("")) {
						firstNumber = Double.parseDouble(displayString);	
					}else {
						firstNumber = 0;
					}
					displayString = "";
				}
				operator = '-';
			}
		});
		btnNewButton_11.setBounds(205, 106, 95, 36);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("X");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operator == '\0') {
					if(!displayString.equals("")) {
						firstNumber = Double.parseDouble(displayString);	
					}else {
						firstNumber = 0;
					}
					displayString = "";
				}
				operator = '*';
			}
		});
		btnNewButton_12.setBounds(255, 153, 45, 36);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("/");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operator == '\0') {
					if(!displayString.equals("")) {
						firstNumber = Double.parseDouble(displayString);	
					}else {
						firstNumber = 0;
					}
					displayString = "";
				}
				operator = '/';
			}
		});
		btnNewButton_13.setBounds(255, 199, 45, 36);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operator != '\0' && !displayString.equals("")) {
					secondNumber = Double.parseDouble(displayString);
					switch(operator) {
					    case '+':firstNumber = (firstNumber+secondNumber);break;
					    case '-':firstNumber = (firstNumber-secondNumber);break;
					    case '/':firstNumber = (firstNumber/secondNumber);break;
					    case '*':firstNumber = (firstNumber*secondNumber);break;
					}
					displayString = String.valueOf(firstNumber);
					textPane.setText(displayString);
					operator = '\0';
				}
			}
		});
		btnNewButton_14.setBounds(142, 199, 56, 36);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton(".");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!displayString.contains(".")) {
					displayString+=".";
					textPane.setText(displayString);		
				}
			}
		});
		btnNewButton_15.setBounds(10, 199, 56, 36);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("<");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!displayString.contentEquals(""))
					displayString = displayString.substring(0, displayString.length()-1);
				textPane.setText(displayString);
			}
		});
		btnNewButton_16.setBounds(252, 56, 48, 40);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("C");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString = "0";
				firstNumber = 0;
				secondNumber = 0;
				operator = '\0';
				textPane.setText(displayString);
			}
		});
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_17.setBounds(208, 153, 42, 82);
		frame.getContentPane().add(btnNewButton_17);
		
	}
}