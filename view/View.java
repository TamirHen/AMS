package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
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

import org.sqlite.core.DB;

import model.Stadium;
import model.User;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import sqlite.*;
public class View extends JFrame {
	
	public JPanel mainPanel;

	//sign up frame declaration:
	public SignUp signUpFrame;
	//---panels declarations---//
	public Login loginPanel;
	public Menu menuPanel;
	public Overview  overviewPanel;
	public Properties propertiesPanel;
	public Sales salesPanel;
	public Facilities facilitiesPanel;
	//-------------------------//

	public View() {

		// set main JFrame:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1114, 600);
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		
		// set sign up frame:
		signUpFrame = new SignUp();
		// set all panels:
		loginPanel = new Login();
		overviewPanel = new Overview();
		propertiesPanel = new Properties();
		salesPanel = new Sales();
		facilitiesPanel= new Facilities();
		menuPanel = new Menu();
		// -------------//
		setContentPane(mainPanel);
		getContentPane().add(loginPanel.panelLogin);
		getContentPane().add(overviewPanel.panelOverview);
		getContentPane().add(propertiesPanel.panelProperties);
		getContentPane().add(salesPanel.panelSales);
		getContentPane().add(facilitiesPanel.panelFacilities);
		getContentPane().add(menuPanel.menuPanel);
		
		displayLoginPage();

	} //end of constructor
	
	public void displayLoginPage() {
		loginPanel.panelLogin.setVisible(true);
		menuPanel.menuPanel.setVisible(false);
		overviewPanel.panelOverview.setVisible(false);
		propertiesPanel.panelProperties.setVisible(false);
		salesPanel.panelSales.setVisible(false);
		facilitiesPanel.panelFacilities.setVisible(false);
	}
	
	public static ImageIcon scaleImageTolabel(ImageIcon i_Img, JLabel i_label)
	{
		ImageIcon scaledImage;
		
		scaledImage = new ImageIcon(i_Img.getImage().getScaledInstance(i_label.getWidth(), i_label.getHeight(), Image.SCALE_SMOOTH));
		
		return scaledImage;
	}
	
	public static ImageIcon scaleImageToButton(ImageIcon i_Img, JButton i_button)
	{
		ImageIcon scaledImage;
		
		scaledImage = new ImageIcon(i_Img.getImage().getScaledInstance(i_button.getWidth(), i_button.getHeight(), Image.SCALE_SMOOTH));
		
		return scaledImage;
	}


}
