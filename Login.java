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

import arenaClasses.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JPanel {
	
	public JPanel panelLogin;

	private JButton btnLogin;

	private JTextField tf_loginUsername;
	private JTextField tf_loginPassword;
	private JPasswordField passwordField_Login;
	
	private JLabel lblLoginFailed;
	private JLabel lblLoginLogo;




	public Login() {

		panelLogin = new JPanel();
		panelLogin.setBounds(0, 0, 1114, 600);
		panelLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelLogin.setBackground(UI_Elements.color_menuBar);
		panelLogin.setLayout(null);

		// ---login logo---//
		lblLoginLogo = new JLabel("");
		lblLoginLogo.setBounds(385, 120, 344, 104);
		lblLoginLogo.setIcon(new ImageIcon(AMSFrame.class.getResource("/Images/loginLogo.png")));
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
		lblLoginFailed.setFont(UI_Elements.font_bodyFillText);
		lblLoginFailed.setBounds(lblLoginLogo.getBounds().x+2, 400, 470, 76);
		lblLoginFailed.setForeground(Color.RED);
		lblLoginFailed.setVisible(false);
		panelLogin.add(lblLoginFailed);

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
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				if (AMSFrame.isUserExist(tf_loginUsername.getText(),passwordField_Login.getPassword())) {
					AMSFrame.btnLoginPressed();
				}
				else
					lblLoginFailed.setVisible(true);

			}
		});
		panelLogin.add(btnLogin);
		
		panelLogin.setVisible(true);


	} //end of constructor


}
