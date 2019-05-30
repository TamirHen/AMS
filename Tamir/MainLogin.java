import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import arenaClasses.Stadium;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainLogin extends JFrame {

	private JPanel loginPanel;
	private JButton btnLogin;

	private JTextField tf_loginUsername;
	private JTextField tf_loginPassword;
	private JPasswordField passwordField_Login;

	public Stadium stadium;

	// ---panels declarations---//
	Overview overviewPanel;
	Menu mainPanel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainLogin frame = new MainLogin();
					frame.setVisible(true);
					frame.setMaximumSize(new Dimension(1114, 600));
					frame.setMinimumSize(new Dimension(1114, 600));
					frame.setResizable(false);
					frame.setTitle("AMS - Arena Management System");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainLogin() {

		// set JFrame:

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1114, 600);

		// set stadium:
		stadium = new Stadium("Bloomfield", "Maccabi Tel Aviv", 29522, "She'erit Israel, Tel Aviv");

		// set first panel:

		loginPanel = new JPanel();

		// set all panels:
		overviewPanel = new Overview();
		mainPanel = new Menu();
		// -------------//

		loginPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		loginPanel.setLayout(new BorderLayout(0, 0));
		loginPanel.setBorder(null);
		loginPanel.setBackground(UI_Elements.color_menuBar);
		loginPanel.setBounds(0, 0, 1114, 617);
		loginPanel.setLayout(null);

		// ---login logo---//
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(385, 120, 344, 104);
		lblNewLabel.setIcon(new ImageIcon(MainLogin.class.getResource("/Images/loginLogo.png")));
		lblNewLabel.setBorder(null);
		loginPanel.add(lblNewLabel);

		// ---username---//
		tf_loginUsername = new JTextField();
		tf_loginUsername.setHorizontalAlignment(SwingConstants.CENTER);
		tf_loginUsername.setText("USERNAME");
		tf_loginUsername.setFont(UI_Elements.font_bodyFillText);
		tf_loginUsername.setBounds(432, 270, 250, 30);
		loginPanel.add(tf_loginUsername);

		// ---password---//
		passwordField_Login = new JPasswordField();
		passwordField_Login.setBounds(432, (tf_loginUsername.getBounds().y) + 40, 250, 30);
		passwordField_Login.setText("PASSWORD");
		passwordField_Login.setFont(UI_Elements.font_bodyFillText);
		passwordField_Login.setHorizontalAlignment(SwingConstants.CENTER);
		loginPanel.add(passwordField_Login);

		// ---login button---//

		btnLogin = new JButton("LOGIN");
		btnLogin.setVisible(true);
		btnLogin.setBounds(497, 360, 120, 35);
		btnLogin.setFocusPainted(false);
		btnLogin.setRequestFocusEnabled(false);
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setHorizontalAlignment(SwingConstants.CENTER);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setOpaque(true);
		btnLogin.setBorder(null);
		btnLogin.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, 20));
		btnLogin.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnLogin.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnLogin.setBackground(UI_Elements.color_panelBodyButtonRollover);
			}

			public void mouseExited(MouseEvent e) {
				btnLogin.setBackground(UI_Elements.color_panelBodyButtonDefault);

			}
		});
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setContentPane(mainPanel.menuPanel);
				getContentPane().add(overviewPanel.panelOverview);
				overviewPanel.panelOverview.setVisible(true);

			}
		});
		loginPanel.add(btnLogin);

		// ---set main ContentPane---//
		setContentPane(loginPanel);

	}

}
