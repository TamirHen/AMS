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

public class MainLogin extends JFrame {

	private JButton btnLogin;

	private JTextField tf_loginUsername;
	private JTextField tf_loginPassword;
	private JPasswordField passwordField_Login;
	
	
	private JLabel lblLoginFailed;
	private JLabel lblLoginLogo;

	private static Stadium stadium;

	//---set users---//
	private User myUser;
	//---------------//
	
	//---panels declarations---//
	private JPanel loginPanel;
	public static Menu mainPanel;
	public static Overview  overviewPanel;
	public static Properties propertiesPanel;
	public static Sales salesPanel;
	public static Facilities facilitiesPanel;
	//-------------------------//

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
		setStadium(new Stadium("Bloomfield", "Maccabi Tel Aviv", 29522, "She'erit Israel, Tel Aviv"));

		//set users:
		myUser = new User("TamirHen", "Tamir", "Hen", "Tamir1491993", "tamirhen6@gmail.com");

		// set first panel:

		loginPanel = new JPanel();

		// set all panels:
		mainPanel = new Menu();
		overviewPanel = new Overview();
		propertiesPanel = new Properties();
		salesPanel = new Sales();
		facilitiesPanel= new Facilities();
		// -------------//

		loginPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		loginPanel.setLayout(new BorderLayout(0, 0));
		loginPanel.setBorder(null);
		loginPanel.setBackground(UI_Elements.color_menuBar);
		loginPanel.setBounds(0, 0, 1114, 617);
		loginPanel.setLayout(null);

		// ---login logo---//
		lblLoginLogo = new JLabel("");
		lblLoginLogo.setBounds(385, 120, 344, 104);
		lblLoginLogo.setIcon(new ImageIcon(MainLogin.class.getResource("/Images/loginLogo.png")));
		lblLoginLogo.setBorder(null);
		loginPanel.add(lblLoginLogo);

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
		
		//---login failed label---//
		lblLoginFailed = new JLabel("Failed to login - username or password is incorrect");
		lblLoginFailed.setFont(UI_Elements.font_bodyFillText);
		lblLoginFailed.setBounds(397, 400, 470, 76);
		lblLoginFailed.setForeground(Color.RED);
		lblLoginFailed.setVisible(false);
		loginPanel.add(lblLoginFailed);

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
				if (isUserExist(tf_loginUsername.getText(),passwordField_Login.getPassword())) {
					setContentPane(mainPanel.menuPanel);
					getContentPane().add(overviewPanel.panelOverview);
					getContentPane().add(propertiesPanel.panelProperties);
					getContentPane().add(salesPanel.panelSales);
					getContentPane().add(facilitiesPanel.panelFacilities);
					overviewPanel.panelOverview.setVisible(true);
				}
				else
					lblLoginFailed.setVisible(true);

			}
		});
		loginPanel.add(btnLogin);

		// ---set main ContentPane---//
		setContentPane(loginPanel);

	} //end of constructor

	public static Stadium getStadium() {
		return stadium;
	}

	public static void setStadium(Stadium stdm) {
		stadium = stdm;
	}
	public boolean isUserExist(String userName, char[] password) {
		String temp = new String(password);
		if (userName.equals(myUser.getUserName())&&temp.equals(myUser.getPassword())) {
//			if (myUser.getUserName()==userName&&temp==myUser.getPassword())
			return true;
		}
		else {
			return false;
		}
	}

}
