package view;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class SalesTickets extends JPanel {

	
	public JPanel panelTickets;
	
	private JLabel titleTickets;
	private JLabel lblTotalAttendance;
	
	public JTextField tf_TotalAttendance;
	private JLabel lblTotalRevenue;
	public JTextField tf_TotalRevenue;
	private JSeparator sprtrTickets1;
	private JLabel lblTotalNumOfGameTickets;
	public JTextField tf_TotalNumOfGameTickets;
	private JLabel lblTotalGameTicketRevenue;
	public JTextField tf_TotalRevenueGameTickets;
	private JLabel lblTotalSingleVIP;
	public JTextField tf_TotalSingleVIP;
	private JLabel lblTotalSingleClubLevel;
	public JTextField tf_TotalSingleClubLevel;
	private JLabel lblTotalSingleBleachers;
	public JTextField tf_TotalSingleBleachers;
	private JSeparator sprtrTickets2;
	private JLabel lblTotalNumOfSeasonTickets;
	public JTextField tf_TotalNumOfSeasonTickets;
	private JLabel lblTotalSeasonTicketRevenue;
	public JTextField tf_TotalSeasonTicketRevenue;

	SalesTickets(){
		panelTickets = new JPanel();
		panelTickets.setBorder(null);
		panelTickets.setBackground(SystemColor.control);
		panelTickets.setBounds(0, 0, 600, 617);
		panelTickets.setLayout(null);
		
		titleTickets = new JLabel("TICKETS");
		titleTickets.setAlignmentY(Component.TOP_ALIGNMENT);
		titleTickets.setVerticalAlignment(SwingConstants.TOP);
		titleTickets.setBounds(30, 22, 346, 76);
		titleTickets.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		titleTickets.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, UI_Elements.textSubPanelTitleSize));
		panelTickets.add(titleTickets);
		
		lblTotalAttendance = new JLabel("Total Attendance:");
		lblTotalAttendance.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalAttendance.setFont(new Font("Calibri", Font.BOLD, 15));
		lblTotalAttendance.setBorder(null);
		lblTotalAttendance.setBounds(30, 103, 180, 20);
		panelTickets.add(lblTotalAttendance);
		
		tf_TotalAttendance = new JTextField("20,000/60,000");
		tf_TotalAttendance.setBorder(null);
		tf_TotalAttendance.setOpaque(false);
		tf_TotalAttendance.setBackground(Color.WHITE);
		tf_TotalAttendance.setBounds(275, 103, 150, 20);
		tf_TotalAttendance.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalAttendance.setEnabled(true);
		tf_TotalAttendance.setEditable(false);
		tf_TotalAttendance.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalAttendance.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalAttendance);
		
		lblTotalRevenue = new JLabel("Total Ticket Revenue:");
		lblTotalRevenue.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalRevenue.setFont(new Font("Calibri", Font.BOLD, 15));
		lblTotalRevenue.setBorder(null);
		lblTotalRevenue.setBounds(30, (lblTotalAttendance.getBounds().y)+30, 180, 20);
		panelTickets.add(lblTotalRevenue);
		
		tf_TotalRevenue = new JTextField("$500,000.0");
		tf_TotalRevenue.setBorder(null);
		tf_TotalRevenue.setOpaque(false);
		tf_TotalRevenue.setBackground(Color.WHITE);
		tf_TotalRevenue.setBounds(tf_TotalAttendance.getBounds().x, (lblTotalAttendance.getBounds().y)+30, 150, 20);
		tf_TotalRevenue.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalRevenue.setEnabled(true);
		tf_TotalRevenue.setEditable(false);
		tf_TotalRevenue.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalRevenue.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalRevenue);
		
		sprtrTickets1 = new JSeparator();
		sprtrTickets1.setForeground(UI_Elements.color_mainBackgroundColor);
		sprtrTickets1.setBounds(30, (lblTotalAttendance.getBounds().y)+30*2, 533, 2);
		panelTickets.add(sprtrTickets1);
		
		lblTotalNumOfGameTickets = new JLabel("Total Num. of Single Tickets:");
		lblTotalNumOfGameTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalNumOfGameTickets.setFont(new Font("Calibri", Font.BOLD, 15));
		lblTotalNumOfGameTickets.setBorder(null);
		lblTotalNumOfGameTickets.setBounds(30, (sprtrTickets1.getBounds().y)+15, 250, 20);
		panelTickets.add(lblTotalNumOfGameTickets);
		
		tf_TotalNumOfGameTickets = new JTextField("12,000/13,000");
		tf_TotalNumOfGameTickets.setBorder(null);
		tf_TotalNumOfGameTickets.setOpaque(false);
		tf_TotalNumOfGameTickets.setBackground(Color.WHITE);
		tf_TotalNumOfGameTickets.setBounds(tf_TotalAttendance.getBounds().x, (sprtrTickets1.getBounds().y)+15, 150, 20);
		tf_TotalNumOfGameTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalNumOfGameTickets.setEnabled(true);
		tf_TotalNumOfGameTickets.setEditable(false);
		tf_TotalNumOfGameTickets.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalNumOfGameTickets.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalNumOfGameTickets);
		
		lblTotalGameTicketRevenue = new JLabel("Total Single Ticket Revenue:");
		lblTotalGameTicketRevenue.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalGameTicketRevenue.setFont(new Font("Calibri", Font.BOLD, 15));
		lblTotalGameTicketRevenue.setBorder(null);
		lblTotalGameTicketRevenue.setBounds(30, (lblTotalNumOfGameTickets.getBounds().y)+30, 250, 20);
		panelTickets.add(lblTotalGameTicketRevenue);
		
		tf_TotalRevenueGameTickets = new JTextField("$100,000.0");
		tf_TotalRevenueGameTickets.setBorder(null);
		tf_TotalRevenueGameTickets.setOpaque(false);
		tf_TotalRevenueGameTickets.setBackground(Color.WHITE);
		tf_TotalRevenueGameTickets.setBounds(tf_TotalAttendance.getBounds().x, 208, 150, 20);
		tf_TotalRevenueGameTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalRevenueGameTickets.setEnabled(true);
		tf_TotalRevenueGameTickets.setEditable(false);
		tf_TotalRevenueGameTickets.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalRevenueGameTickets.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalRevenueGameTickets);
		
		lblTotalSingleVIP = new JLabel("Total VIP:");
		lblTotalSingleVIP.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalSingleVIP.setFont(new Font("Calibri", Font.BOLD, 15));
		lblTotalSingleVIP.setBorder(null);
		lblTotalSingleVIP.setBounds(lblTotalGameTicketRevenue.getBounds().x+20, (lblTotalGameTicketRevenue.getBounds().y)+20, 250, 20);
		panelTickets.add(lblTotalSingleVIP);
		
		tf_TotalSingleVIP = new JTextField("$10,000.0");
		tf_TotalSingleVIP.setBorder(null);
		tf_TotalSingleVIP.setOpaque(false);
		tf_TotalSingleVIP.setBackground(Color.WHITE);
		tf_TotalSingleVIP.setBounds(tf_TotalAttendance.getBounds().x, lblTotalSingleVIP.getBounds().y, 150, 20);
		tf_TotalSingleVIP.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalSingleVIP.setEnabled(true);
		tf_TotalSingleVIP.setEditable(false);
		tf_TotalSingleVIP.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalSingleVIP.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalSingleVIP);
		
		lblTotalSingleClubLevel = new JLabel("Total Club Level:");
		lblTotalSingleClubLevel.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalSingleClubLevel.setFont(new Font("Calibri", Font.BOLD, 15));
		lblTotalSingleClubLevel.setBorder(null);
		lblTotalSingleClubLevel.setBounds(lblTotalSingleVIP.getBounds().x, (lblTotalSingleVIP.getBounds().y)+20, 180, 20);
		panelTickets.add(lblTotalSingleClubLevel);
		
		tf_TotalSingleClubLevel = new JTextField("$10,000.0");
		tf_TotalSingleClubLevel.setBorder(null);
		tf_TotalSingleClubLevel.setOpaque(false);
		tf_TotalSingleClubLevel.setBackground(Color.WHITE);
		tf_TotalSingleClubLevel.setBounds(tf_TotalAttendance.getBounds().x, lblTotalSingleClubLevel.getBounds().y, 150, 20);
		tf_TotalSingleClubLevel.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalSingleClubLevel.setEnabled(true);
		tf_TotalSingleClubLevel.setEditable(false);
		tf_TotalSingleClubLevel.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalSingleClubLevel.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalSingleClubLevel);
		
		
		lblTotalSingleBleachers = new JLabel("Total Bleachers:");
		lblTotalSingleBleachers.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalSingleBleachers.setFont(new Font("Calibri", Font.BOLD, 15));
		lblTotalSingleBleachers.setBorder(null);
		lblTotalSingleBleachers.setBounds(lblTotalSingleClubLevel.getBounds().x, (lblTotalSingleClubLevel.getBounds().y)+20, 180, 20);
		panelTickets.add(lblTotalSingleBleachers);
		
		tf_TotalSingleBleachers = new JTextField("$10,000.0");
		tf_TotalSingleBleachers.setBorder(null);
		tf_TotalSingleBleachers.setOpaque(false);
		tf_TotalSingleBleachers.setBackground(Color.WHITE);
		tf_TotalSingleBleachers.setBounds(tf_TotalAttendance.getBounds().x, lblTotalSingleBleachers.getBounds().y, 150, 20);
		tf_TotalSingleBleachers.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalSingleBleachers.setEnabled(true);
		tf_TotalSingleBleachers.setEditable(false);
		tf_TotalSingleBleachers.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalSingleBleachers.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalSingleBleachers);
		
		
		sprtrTickets2 = new JSeparator();
		sprtrTickets2.setForeground(UI_Elements.color_mainBackgroundColor);
		sprtrTickets2.setBounds(30, (lblTotalSingleBleachers.getBounds().y)+30*2, 533, 2);
		panelTickets.add(sprtrTickets2);
		
		lblTotalNumOfSeasonTickets = new JLabel("Total Num. of Season Tickets:");
		lblTotalNumOfSeasonTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalNumOfSeasonTickets.setFont(new Font("Calibri", Font.BOLD, 15));
		lblTotalNumOfSeasonTickets.setBorder(null);
		lblTotalNumOfSeasonTickets.setBounds(30, (sprtrTickets2.getBounds().y)+15, 250, 20);
		panelTickets.add(lblTotalNumOfSeasonTickets);
		
		tf_TotalNumOfSeasonTickets = new JTextField("8,000");
		tf_TotalNumOfSeasonTickets.setBorder(null);
		tf_TotalNumOfSeasonTickets.setOpaque(false);
		tf_TotalNumOfSeasonTickets.setBackground(Color.WHITE);
		tf_TotalNumOfSeasonTickets.setBounds(tf_TotalAttendance.getBounds().x, (sprtrTickets2.getBounds().y)+15, 150, 20);
		tf_TotalNumOfSeasonTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalNumOfSeasonTickets.setEnabled(true);
		tf_TotalNumOfSeasonTickets.setEditable(false);
		tf_TotalNumOfSeasonTickets.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalNumOfSeasonTickets.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalNumOfSeasonTickets);
		
		lblTotalSeasonTicketRevenue = new JLabel("Total Season Ticket Revenue:");
		lblTotalSeasonTicketRevenue.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalSeasonTicketRevenue.setFont(new Font("Calibri", Font.BOLD, 15));
		lblTotalSeasonTicketRevenue.setBorder(null);
		lblTotalSeasonTicketRevenue.setBounds(30, (lblTotalNumOfSeasonTickets.getBounds().y)+20, 250, 20);
		panelTickets.add(lblTotalSeasonTicketRevenue);
		
		tf_TotalSeasonTicketRevenue = new JTextField("$28,000");
		tf_TotalSeasonTicketRevenue.setBorder(null);
		tf_TotalSeasonTicketRevenue.setOpaque(false);
		tf_TotalSeasonTicketRevenue.setBackground(Color.WHITE);
		tf_TotalSeasonTicketRevenue.setBounds(tf_TotalAttendance.getBounds().x, (lblTotalSeasonTicketRevenue.getBounds().y), 150, 20);
		tf_TotalSeasonTicketRevenue.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalSeasonTicketRevenue.setEnabled(true);
		tf_TotalSeasonTicketRevenue.setEditable(false);
		tf_TotalSeasonTicketRevenue.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalSeasonTicketRevenue.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalSeasonTicketRevenue);
		
	}
	
}
