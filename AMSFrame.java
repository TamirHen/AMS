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

import org.sqlite.core.DB;

import arenaClasses.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AMSFrame extends JFrame {
	
	public JPanel mainPanel;
	//---set stadium---//
	private static Stadium stadium;
	//-----------------//
	SqliteDB db;

	//---set users---//
	private static User myUser;
	//---------------//

	//---panels declarations---//
	public static Login loginPanel;
	public static Menu menuPanel;
	public static Overview  overviewPanel;
	public static Properties propertiesPanel;
	public static Sales salesPanel;
	public static Facilities facilitiesPanel;
	//-------------------------//

	public static void main(String[] args) {
		//---set DB---//
//		SqliteDB db = new SqliteDB();
		//------------//
		EventQueue.invokeLater(new Runnable() {
			public void run() {				
				try {
					AMSFrame frame = new AMSFrame();
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

	public AMSFrame() {

		// set JFrame:

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1114, 600);
		
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		
		// set stadium:
		setStadium(new Stadium(1, "Bloomfield", "Maccabi Tel Aviv", 29522, "She'erit Israel, Tel Aviv"));
//		db.getStadiumDetailsDB(stadium);
		
		//set users:
		myUser = new User("USERNAME", "AMS", "USER", "PASSWORD", "ams@hit.com");
		
		// set all panels:
		loginPanel = new Login();
		menuPanel = new Menu();
		overviewPanel = new Overview();
		propertiesPanel = new Properties();
		salesPanel = new Sales();
		facilitiesPanel= new Facilities();
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
	
	public static void btnLoginPressed() {
		loginPanel.panelLogin.setVisible(false);
		menuPanel.menuPanel.setVisible(true);
		overviewPanel.panelOverview.setVisible(true);
		AMSFrame.overviewPanel.panelOverview.setVisible(true);
		menuPanel.getBtnOverview().setBackground(UI_Elements.color_menuButtonSelected);
		AMSFrame.propertiesPanel.panelProperties.setVisible(false);
		menuPanel.getBtnProperties().setBackground(UI_Elements.color_menuBar);
		AMSFrame.salesPanel.panelSales.setVisible(false);
		menuPanel.getBtnSales().setBackground(UI_Elements.color_menuBar);
		AMSFrame.facilitiesPanel.panelFacilities.setVisible(false);
		menuPanel.getBtnFacilities().setBackground(UI_Elements.color_menuBar);
	
		}
	public static void displayLoginPage() {
		loginPanel.panelLogin.setVisible(true);
		menuPanel.menuPanel.setVisible(false);
		overviewPanel.panelOverview.setVisible(false);
		propertiesPanel.panelProperties.setVisible(false);
		salesPanel.panelSales.setVisible(false);
		facilitiesPanel.panelFacilities.setVisible(false);
	}
	
	public static Stadium getStadium() {
		return stadium;
	}

	public static void setStadium(Stadium stdm) {
		stadium = stdm;
	}
	public static boolean isUserExist(String userName, char[] password) {
		String temp = new String(password);
		if (userName.equals(myUser.getUserName())&&temp.equals(myUser.getPassword())) {
			return true;
		}
		else {
			return false;
		}
	}
	public static User getUser() {
		return myUser;
	}

}
