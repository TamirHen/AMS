package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class SignUp extends JFrame {

	private JPanel panelSignUp;

	private JTextField tf_enterUserName;
	private JTextField tf_enterPassword;
	private JTextField tf_enterPasswordAgain;
	private JTextField tf_enterFirstName;
	private JTextField tf_enterLastName;
	private JTextField tf_enterEmail;
	private JTextField tf_userNameAlreadyExist;
	private JTextField tf_passwordNotMatch;
	
	private JButton btnFinishSignUp;

	
	public SignUp() {
		//set Frame:
		setBounds(280, 120, 400, 550);
		this.setResizable(false);
		panelSignUp = new JPanel();
		panelSignUp.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelSignUp.setBackground(SystemColor.control);
		setContentPane(panelSignUp);
		panelSignUp.setLayout(null);
		
		//set text fields:
		tf_enterUserName = new JTextField("UserName");
		tf_enterUserName.setHorizontalAlignment(SwingConstants.CENTER);
		tf_enterUserName.setFont(UI_Elements.font_bodyFillText);
		tf_enterUserName.setBounds(90, 150, 220, 30);
		panelSignUp.add(tf_enterUserName);

		tf_enterPassword = new JTextField("Password");
		tf_enterPassword.setHorizontalAlignment(SwingConstants.CENTER);
		tf_enterPassword.setFont(UI_Elements.font_bodyFillText);
		tf_enterPassword.setBounds(90, 190, 220, 30);
		panelSignUp.add(tf_enterPassword);
		
		tf_enterPasswordAgain = new JTextField("Verify Password");
		tf_enterPasswordAgain.setHorizontalAlignment(SwingConstants.CENTER);
		tf_enterPasswordAgain.setFont(UI_Elements.font_bodyFillText);
		tf_enterPasswordAgain.setBounds(90, 230, 220, 30);
		panelSignUp.add(tf_enterPasswordAgain);
		
		tf_enterFirstName = new JTextField("First Name");
		tf_enterFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		tf_enterFirstName.setFont(UI_Elements.font_bodyFillText);
		tf_enterFirstName.setBounds(90, 270, 220, 30);
		panelSignUp.add(tf_enterFirstName);
		
		tf_enterLastName = new JTextField("Last Name");
		tf_enterLastName.setHorizontalAlignment(SwingConstants.CENTER);
		tf_enterLastName.setFont(UI_Elements.font_bodyFillText);
		tf_enterLastName.setBounds(90, 310, 220, 30);
		panelSignUp.add(tf_enterLastName);
		
		tf_enterEmail = new JTextField("Email Address");
		tf_enterEmail.setHorizontalAlignment(SwingConstants.CENTER);
		tf_enterEmail.setFont(UI_Elements.font_bodyFillText);
		tf_enterEmail.setBounds(90, 350, 220, 30);
		panelSignUp.add(tf_enterEmail);
		
		tf_userNameAlreadyExist = new JTextField("UserName is already exist");tf_userNameAlreadyExist.setHorizontalAlignment(SwingConstants.CENTER);
		tf_userNameAlreadyExist.setHorizontalAlignment(SwingConstants.CENTER);
		tf_userNameAlreadyExist.setFont(UI_Elements.font_bodyFillText);

		tf_passwordNotMatch = new JTextField("Passwords not match");
		tf_passwordNotMatch.setHorizontalAlignment(SwingConstants.CENTER);
		tf_passwordNotMatch.setFont(UI_Elements.font_bodyFillText);
		
		//set button:
		btnFinishSignUp = new JButton("FINISH");
		btnFinishSignUp.setBounds(140, 400, 120, 35);
		btnFinishSignUp.setFocusPainted(false);
		btnFinishSignUp.setRequestFocusEnabled(false);
		btnFinishSignUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFinishSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		btnFinishSignUp.setForeground(Color.WHITE);
		btnFinishSignUp.setOpaque(true);
		btnFinishSignUp.setBorder(null);
		btnFinishSignUp.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, 20));
		btnFinishSignUp.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnFinishSignUp.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnFinishSignUp.setBackground(UI_Elements.color_panelBodyButtonRollover);
			}

			public void mouseExited(MouseEvent e) {
				btnFinishSignUp.setBackground(UI_Elements.color_panelBodyButtonDefault);

			}
		});
		panelSignUp.add(btnFinishSignUp);

		
	}

}

