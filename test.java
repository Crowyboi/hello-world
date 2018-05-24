package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class test {

	private JFrame frame;
	private JTable table;
	private JTextField textFieldnum1;
	private JTextField textFieldnum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
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
	public test() {
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
		
		table = new JTable();
		table.setBounds(0, 0, 440, 0);
		frame.getContentPane().add(table);
		
		textFieldnum1 = new JTextField();
		textFieldnum1.setBounds(56, 89, 124, 19);
		frame.getContentPane().add(textFieldnum1);
		textFieldnum1.setColumns(10);
		
		textFieldnum2 = new JTextField();
		textFieldnum2.setBounds(220, 89, 124, 19);
		frame.getContentPane().add(textFieldnum2);
		textFieldnum2.setColumns(10);
		
		JButton btnNewButton = new JButton("Plus");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			int num1,num2,ans;
				try {
					num1=Integer.parseInt(textFieldnum1.getText () );
					num2=Integer.parseInt(textFieldnum2.getText () );
					ans=num1+num2;
					textFieldAns.setText(Integer.toString(ans)) ;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Fehler") ;
		    }
				
				
				
			}
		});
		btnNewButton.setBounds(12, 158, 114, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Minus");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textFieldnum1.getText () );
					num2=Integer.parseInt(textFieldnum2.getText () );
					ans=num1-num2;
					textFieldAns.setText(Integer.toString(ans)) ;
			}catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Fehler") ;
		    }
		
				
				
				
			}
		});
		btnNewButton_1.setBounds(161, 158, 114, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(180, 212, 124, 19);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblAntwort = new JLabel("Antwort");
		lblAntwort.setFont(new Font("Dialog", Font.BOLD, 14));
		lblAntwort.setBounds(68, 214, 66, 15);
		frame.getContentPane().add(lblAntwort);
		
		JLabel lblMadeBySilas = new JLabel("Made by Furry Fuchs");
		lblMadeBySilas.setBounds(296, 243, 144, 15);
		frame.getContentPane().add(lblMadeBySilas);
		
		JLabel lblNummer = new JLabel("Nummer1");
		lblNummer.setBounds(84, 106, 83, 15);
		frame.getContentPane().add(lblNummer);
		
		JLabel lblNummer_1 = new JLabel("Nummer2");
		lblNummer_1.setBounds(242, 106, 102, 15);
		frame.getContentPane().add(lblNummer_1);
		
		JLabel lblTaschenrechner = new JLabel("Taschenrechner");
		lblTaschenrechner.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTaschenrechner.setBounds(134, 12, 194, 15);
		frame.getContentPane().add(lblTaschenrechner);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(301, 158, 114, 25);
		frame.getContentPane().add(btnExit);
	}
}
