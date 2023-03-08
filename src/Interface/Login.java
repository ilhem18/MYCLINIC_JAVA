package Interface;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JFrame{

	/*
	 * initialize une image setIcon(new ImageIcon(Login.class.getResource("/icons8-user-25.png")));
	 */

	JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JPasswordField passwordField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(150, 50, 1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 1200, 700);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(1155, 0, 45, 32);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(699, 239, 364, 50);
		panel.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("C O N N E X I O N");
		lblNewLabel_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 42));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(329, 51, 515, 50);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Se connecter");
		btnNewButton_1.setBackground(SystemColor.window);
		btnNewButton_1.setForeground(new Color(25, 25, 112));
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnNewButton_1.setBounds(728, 481, 124, 38);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Annuler");
		btnNewButton_2.setBackground(SystemColor.window);
		btnNewButton_2.setForeground(new Color(25, 25, 112));
		btnNewButton_2.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnNewButton_2.setBounds(922, 481, 118, 38);
		panel.add(btnNewButton_2);
		
		
		lblNewLabel_2 = new JLabel("Mot de passe");
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(516, 367, 124, 32);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Nom d'utilisateur");
		lblNewLabel_3.setForeground(SystemColor.text);
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(514, 244, 141, 32);
		panel.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(699, 362, 364, 50);
		panel.add(passwordField);
		
		JLabel lblNewLabel_4 = new JLabel("MyClinic");
		lblNewLabel_4.setFont(new Font("Blackadder ITC", Font.BOLD | Font.ITALIC, 70));
		lblNewLabel_4.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(36, 246, 345, 115);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Vous n'avez pas de compte ?");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_5.setBounds(132, 395, 170, 32);
		panel.add(lblNewLabel_5);
		
		btnNewButton = new JButton("Inscrivez-vous");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				Register register = new Register();
				register.frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setForeground(new Color(25, 25, 112));
		btnNewButton.setBounds(155, 444, 118, 32);
		panel.add(btnNewButton);
		
	}
	}


