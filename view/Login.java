package view;
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

import sqlite.SqliteDB;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JPanel {
	
	public JPanel panelLogin;

	public JButton btnLogin;
	public JButton btnSignUp;
	
	public JTextField tf_loginUsername;
	public JTextField tf_loginPassword;
	public JPasswordField passwordField_Login;
	
	public JLabel lblLoginFailed;
	public JLabel lblLoginLogo;
	public ImageIcon loginLogo = new ImageIcon(View.class.getResource("/Images/Logo_HighRes.png"));




	public Login() {

		panelLogin = new JPanel();
		panelLogin.setBounds(0, 0, 1114, 600);
		panelLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelLogin.setBackground(UI_Elements.color_menuBar);
		panelLogin.setLayout(null);

		// ---login logo---//
		lblLoginLogo = new JLabel("");
		lblLoginLogo.setBounds(385, 120, 344, 104);
		lblLoginLogo.setIcon(View.scaleImageTolabel(loginLogo, lblLoginLogo));
		lblLoginLogo.setBorder(null);
		panelLogin.add(lblLoginLogo);

		// ---username---//
		tf_loginUsername = new JTextField();
		tf_loginUsername.setHorizontalAlignment(SwingConstants.CENTER);
		tf_loginUsername.setText("USERNAME");
		tf_loginUsername.setFont(UI_Elements.font_bodyFillText);
		tf_loginUsername.setBounds(432, 270, 250, 30);
		panelLogin.add(tf_loginUsername);

		// ---password---//
		passwordField_Login = new JPasswordField();
		passwordField_Login.setBounds(432, (tf_loginUsername.getBounds().y) + 40, 250, 30);
		passwordField_Login.setText("PASSWORD");
		passwordField_Login.setFont(UI_Elements.font_bodyFillText);
		passwordField_Login.setHorizontalAlignment(SwingConstants.CENTER);
		panelLogin.add(passwordField_Login);
		
		//---login failed label---//
		lblLoginFailed = new JLabel("Failed to login - username or password is incorrect");
		lblLoginFailed.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginFailed.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblLoginFailed.setBounds(378, 440, 357, 62);
		lblLoginFailed.setForeground(Color.RED);
		lblLoginFailed.setVisible(false);
		panelLogin.add(lblLoginFailed);

		//---login button---//

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
		panelLogin.add(btnLogin);
		
		//---Register---//
		
		btnSignUp = new JButton("SIGN UP");
		btnSignUp.setVisible(true);
		btnSignUp.setBounds(497, 403, 120, 35);
		btnSignUp.setFocusPainted(false);
		btnSignUp.setRequestFocusEnabled(false);
		btnSignUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setOpaque(true);
		btnSignUp.setBorder(null);
		btnSignUp.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, 20));
		btnSignUp.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnSignUp.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnSignUp.setBackground(UI_Elements.color_panelBodyButtonRollover);
			}

			public void mouseExited(MouseEvent e) {
				btnSignUp.setBackground(UI_Elements.color_panelBodyButtonDefault);

			}
		});
		panelLogin.add(btnSignUp);
		
		// first state:
		panelLogin.setVisible(true);

	} //end of constructor


}
