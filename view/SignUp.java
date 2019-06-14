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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class SignUp extends JFrame {

	private JPanel panelSignUp;

	public JTextField tf_enterUserName;
	public JPasswordField pf_enterPassword;
	public JPasswordField pf_enterPasswordAgain;
	public JTextField tf_enterFirstName;
	public JTextField tf_enterLastName;
	public JTextField tf_enterEmail;
	public JLabel lblUserNameAlreadyExist;
	public JLabel lblPasswordNotMatch;
	
	public JButton btnFinishSignUp;
	public JButton btnCancelSignUp;

	
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

		pf_enterPassword = new JPasswordField("Password");
		pf_enterPassword.setHorizontalAlignment(SwingConstants.CENTER);
		pf_enterPassword.setFont(UI_Elements.font_bodyFillText);
		pf_enterPassword.setBounds(90, 190, 220, 30);
		panelSignUp.add(pf_enterPassword);
		
		pf_enterPasswordAgain = new JPasswordField("Password");
		pf_enterPasswordAgain.setHorizontalAlignment(SwingConstants.CENTER);
		pf_enterPasswordAgain.setFont(UI_Elements.font_bodyFillText);
		pf_enterPasswordAgain.setBounds(90, 230, 220, 30);
		panelSignUp.add(pf_enterPasswordAgain);
		
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
		
		lblUserNameAlreadyExist = new JLabel("UserName is already exist");
		lblUserNameAlreadyExist.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserNameAlreadyExist.setFont(UI_Elements.font_bodyFillText);
		lblUserNameAlreadyExist.setForeground(Color.RED);
		lblUserNameAlreadyExist.setBounds(0, 480, 450, 30);
		lblUserNameAlreadyExist.setVisible(false);
		panelSignUp.add(lblUserNameAlreadyExist);

		lblPasswordNotMatch = new JLabel("Passwords not match");
		lblPasswordNotMatch.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasswordNotMatch.setFont(UI_Elements.font_bodyFillText);
		lblPasswordNotMatch.setForeground(Color.RED);
		lblPasswordNotMatch.setBounds(0, 480, 450, 30);
		lblPasswordNotMatch.setVisible(false);
		panelSignUp.add(lblPasswordNotMatch);

		//set buttons:
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
		
		btnCancelSignUp = new JButton("CANCEL");
		btnCancelSignUp.setBounds(140, 445, 120, 35);
		btnCancelSignUp.setFocusPainted(false);
		btnCancelSignUp.setRequestFocusEnabled(false);
		btnCancelSignUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		btnCancelSignUp.setForeground(Color.WHITE);
		btnCancelSignUp.setOpaque(true);
		btnCancelSignUp.setBorder(null);
		btnCancelSignUp.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, 20));
		btnCancelSignUp.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnCancelSignUp.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnCancelSignUp.setBackground(UI_Elements.color_panelBodyButtonRollover);
			}

			public void mouseExited(MouseEvent e) {
				btnCancelSignUp.setBackground(UI_Elements.color_panelBodyButtonDefault);

			}
		});
		panelSignUp.add(btnCancelSignUp);
		
	}

}
