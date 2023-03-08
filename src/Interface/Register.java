package Interface;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Register extends JFrame{

	JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JPasswordField passwordField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
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
	public Register() {
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
		textField.setBounds(699, 191, 364, 50);
		panel.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("I N S C R I P T I O N");
		lblNewLabel_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 42));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(323, 48, 515, 50);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Mot de passe");
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(513, 453, 154, 32);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Nom d'utilisateur");
		lblNewLabel_3.setForeground(SystemColor.text);
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(514, 329, 153, 32);
		panel.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(699, 446, 364, 50);
		panel.add(passwordField);
		
		JLabel lblNewLabel_4 = new JLabel("MyClinic");
		lblNewLabel_4.setFont(new Font("Vladimir Script", Font.BOLD | Font.ITALIC, 70));
		lblNewLabel_4.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(36, 246, 345, 115);
		panel.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(699, 324, 364, 50);
		panel.add(textField_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Nom & prénom");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_1.setBounds(513, 196, 124, 32);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_5 = new JLabel("Vous avez déjà un compte ?");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_5.setBounds(135, 436, 170, 32);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Connectez-vous");
		btnNewButton.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				dispose();
				Login login = new Login();
				login.frame.setVisible(true);
			}
		});
		btnNewButton.setBackground(SystemColor.window);
		btnNewButton.setForeground(new Color(25, 25, 112));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBounds(158, 478, 124, 32);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("S'inscrire");
		btnNewButton_1.setBackground(SystemColor.window);
		btnNewButton_1.setForeground(new Color(25, 25, 112));
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnNewButton_1.setBounds(726, 570, 124, 38);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Annuler");
		btnNewButton_2.setBackground(SystemColor.window);
		btnNewButton_2.setForeground(new Color(25, 25, 112));
		btnNewButton_2.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnNewButton_2.setBounds(923, 570, 118, 38);
		panel.add(btnNewButton_2);
	}

	}



