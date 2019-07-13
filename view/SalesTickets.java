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
	
	private int lineSpacing = 7;

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
		lblTotalAttendance.setVerticalAlignment(SwingConstants.TOP);
		lblTotalAttendance.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalAttendance.setFont(UI_Elements.font_bodyLabel);
		lblTotalAttendance.setBorder(null);
		lblTotalAttendance.setBounds(30, 103, 180, 15);
		panelTickets.add(lblTotalAttendance);
		
		tf_TotalAttendance = new JTextField("20,000/60,000");
		tf_TotalAttendance.setAlignmentY(Component.TOP_ALIGNMENT);
		tf_TotalAttendance.setBorder(null);
		tf_TotalAttendance.setOpaque(false);
		tf_TotalAttendance.setBackground(Color.WHITE);
		tf_TotalAttendance.setBounds(275, 103, 150, 17);
		tf_TotalAttendance.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalAttendance.setEnabled(true);
		tf_TotalAttendance.setEditable(false);
		tf_TotalAttendance.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalAttendance.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalAttendance);
		
		lblTotalRevenue = new JLabel("Total Ticket Revenue:");
		lblTotalRevenue.setAlignmentY(Component.TOP_ALIGNMENT);
		lblTotalRevenue.setVerticalAlignment(SwingConstants.TOP);
		lblTotalRevenue.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalRevenue.setFont(UI_Elements.font_bodyLabel);
		lblTotalRevenue.setBorder(null);
		lblTotalRevenue.setBounds(lblTotalAttendance.getBounds().x, lblTotalAttendance.getBounds().y+lblTotalAttendance.getBounds().height+lineSpacing, 180, lblTotalAttendance.getBounds().height);
		panelTickets.add(lblTotalRevenue);
		
		tf_TotalRevenue = new JTextField("$500,000.0");
		tf_TotalRevenue.setAlignmentY(Component.TOP_ALIGNMENT);
		tf_TotalRevenue.setBorder(null);
		tf_TotalRevenue.setOpaque(false);
		tf_TotalRevenue.setBackground(Color.WHITE);
		tf_TotalRevenue.setBounds(tf_TotalAttendance.getBounds().x, lblTotalRevenue.getBounds().y, 150, tf_TotalAttendance.getBounds().height);
		tf_TotalRevenue.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalRevenue.setEnabled(true);
		tf_TotalRevenue.setEditable(false);
		tf_TotalRevenue.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalRevenue.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalRevenue);
		
		sprtrTickets1 = new JSeparator();
		sprtrTickets1.setForeground(UI_Elements.color_mainBackgroundColor);
		sprtrTickets1.setBounds(lblTotalRevenue.getBounds().x, lblTotalRevenue.getBounds().y+lblTotalRevenue.getBounds().height+lineSpacing*2, 533, 10);
		panelTickets.add(sprtrTickets1);
		
		lblTotalNumOfGameTickets = new JLabel("Total Num. of Single Tickets:");
		lblTotalNumOfGameTickets.setAlignmentY(Component.TOP_ALIGNMENT);
		lblTotalNumOfGameTickets.setVerticalAlignment(SwingConstants.TOP);
		lblTotalNumOfGameTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalNumOfGameTickets.setFont(UI_Elements.font_bodyLabel);
		lblTotalNumOfGameTickets.setBorder(null);
		lblTotalNumOfGameTickets.setBounds(sprtrTickets1.getBounds().x, sprtrTickets1.getBounds().y+sprtrTickets1.getBounds().height+lineSpacing*2, 250, lblTotalAttendance.getBounds().height);
		panelTickets.add(lblTotalNumOfGameTickets);
		
		tf_TotalNumOfGameTickets = new JTextField("12,000/13,000");
		tf_TotalNumOfGameTickets.setAlignmentY(Component.TOP_ALIGNMENT);
		tf_TotalNumOfGameTickets.setBorder(null);
		tf_TotalNumOfGameTickets.setOpaque(false);
		tf_TotalNumOfGameTickets.setBackground(Color.WHITE);
		tf_TotalNumOfGameTickets.setBounds(tf_TotalAttendance.getBounds().x, lblTotalNumOfGameTickets.getBounds().y, 150, tf_TotalRevenue.getBounds().height);
		tf_TotalNumOfGameTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalNumOfGameTickets.setEnabled(true);
		tf_TotalNumOfGameTickets.setEditable(false);
		tf_TotalNumOfGameTickets.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalNumOfGameTickets.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalNumOfGameTickets);
		
		lblTotalGameTicketRevenue = new JLabel("Total Single Ticket Revenue:");
		lblTotalGameTicketRevenue.setAlignmentY(Component.TOP_ALIGNMENT);
		lblTotalGameTicketRevenue.setVerticalAlignment(SwingConstants.TOP);
		lblTotalGameTicketRevenue.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalGameTicketRevenue.setFont(UI_Elements.font_bodyLabel);
		lblTotalGameTicketRevenue.setBorder(null);
		lblTotalGameTicketRevenue.setBounds(lblTotalNumOfGameTickets.getBounds().x, lblTotalNumOfGameTickets.getBounds().y+lblTotalNumOfGameTickets.getBounds().height+lineSpacing*2, 250, lblTotalNumOfGameTickets.getBounds().height);
		panelTickets.add(lblTotalGameTicketRevenue);
		
		tf_TotalRevenueGameTickets = new JTextField("$100,000.0");
		tf_TotalRevenueGameTickets.setAlignmentY(Component.TOP_ALIGNMENT);
		tf_TotalRevenueGameTickets.setBorder(null);
		tf_TotalRevenueGameTickets.setOpaque(false);
		tf_TotalRevenueGameTickets.setBackground(Color.WHITE);
		tf_TotalRevenueGameTickets.setBounds(tf_TotalAttendance.getBounds().x, lblTotalGameTicketRevenue.getBounds().y, 150, 20);
		tf_TotalRevenueGameTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalRevenueGameTickets.setEnabled(true);
		tf_TotalRevenueGameTickets.setEditable(false);
		tf_TotalRevenueGameTickets.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalRevenueGameTickets.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalRevenueGameTickets);
		
		lblTotalSingleVIP = new JLabel("Total VIP:");
		lblTotalSingleVIP.setAlignmentY(Component.TOP_ALIGNMENT);
		lblTotalSingleVIP.setVerticalAlignment(SwingConstants.TOP);
		lblTotalSingleVIP.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalSingleVIP.setFont(UI_Elements.font_bodyLabel);
		lblTotalSingleVIP.setBorder(null);
		lblTotalSingleVIP.setBounds(lblTotalGameTicketRevenue.getBounds().x+20, lblTotalGameTicketRevenue.getBounds().y+lblTotalGameTicketRevenue.getBounds().height+lineSpacing, 250, lblTotalGameTicketRevenue.getBounds().height);
		panelTickets.add(lblTotalSingleVIP);
		
		tf_TotalSingleVIP = new JTextField("$10,000.0");
		tf_TotalSingleVIP.setAlignmentY(Component.TOP_ALIGNMENT);
		tf_TotalSingleVIP.setBorder(null);
		tf_TotalSingleVIP.setOpaque(false);
		tf_TotalSingleVIP.setBackground(Color.WHITE);
		tf_TotalSingleVIP.setBounds(tf_TotalRevenueGameTickets.getBounds().x, lblTotalSingleVIP.getBounds().y, 150, tf_TotalRevenueGameTickets.getBounds().height);
		tf_TotalSingleVIP.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalSingleVIP.setEnabled(true);
		tf_TotalSingleVIP.setEditable(false);
		tf_TotalSingleVIP.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalSingleVIP.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalSingleVIP);
		
		lblTotalSingleClubLevel = new JLabel("Total Club Level:");
		lblTotalSingleClubLevel.setAlignmentY(Component.TOP_ALIGNMENT);
		lblTotalSingleClubLevel.setVerticalAlignment(SwingConstants.TOP);
		lblTotalSingleClubLevel.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalSingleClubLevel.setFont(UI_Elements.font_bodyLabel);
		lblTotalSingleClubLevel.setBorder(null);
		lblTotalSingleClubLevel.setBounds(lblTotalSingleVIP.getBounds().x, lblTotalSingleVIP.getBounds().y+lblTotalSingleVIP.getBounds().height+lineSpacing, 180, lblTotalSingleVIP.getBounds().height);
		panelTickets.add(lblTotalSingleClubLevel);
		
		tf_TotalSingleClubLevel = new JTextField("$10,000.0");
		tf_TotalSingleClubLevel.setAlignmentY(Component.TOP_ALIGNMENT);
		tf_TotalSingleClubLevel.setBorder(null);
		tf_TotalSingleClubLevel.setOpaque(false);
		tf_TotalSingleClubLevel.setBackground(Color.WHITE);
		tf_TotalSingleClubLevel.setBounds(tf_TotalSingleVIP.getBounds().x, lblTotalSingleClubLevel.getBounds().y, 150, tf_TotalSingleVIP.getBounds().height);
		tf_TotalSingleClubLevel.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalSingleClubLevel.setEnabled(true);
		tf_TotalSingleClubLevel.setEditable(false);
		tf_TotalSingleClubLevel.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalSingleClubLevel.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalSingleClubLevel);
		
		
		lblTotalSingleBleachers = new JLabel("Total Bleachers:");
		lblTotalSingleBleachers.setAlignmentY(Component.TOP_ALIGNMENT);
		lblTotalSingleBleachers.setVerticalAlignment(SwingConstants.TOP);
		lblTotalSingleBleachers.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalSingleBleachers.setFont(UI_Elements.font_bodyLabel);
		lblTotalSingleBleachers.setBorder(null);
		lblTotalSingleBleachers.setBounds(lblTotalSingleClubLevel.getBounds().x, lblTotalSingleClubLevel.getBounds().y+lblTotalSingleClubLevel.getBounds().height+lineSpacing, 180, lblTotalSingleClubLevel.getBounds().height);
		panelTickets.add(lblTotalSingleBleachers);
		
		tf_TotalSingleBleachers = new JTextField("$10,000.0");
		tf_TotalSingleBleachers.setAlignmentY(Component.TOP_ALIGNMENT);
		tf_TotalSingleBleachers.setBorder(null);
		tf_TotalSingleBleachers.setOpaque(false);
		tf_TotalSingleBleachers.setBackground(Color.WHITE);
		tf_TotalSingleBleachers.setBounds(tf_TotalSingleClubLevel.getBounds().x, lblTotalSingleBleachers.getBounds().y, 150, tf_TotalSingleClubLevel.getBounds().height);
		tf_TotalSingleBleachers.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalSingleBleachers.setEnabled(true);
		tf_TotalSingleBleachers.setEditable(false);
		tf_TotalSingleBleachers.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalSingleBleachers.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalSingleBleachers);
		
		sprtrTickets2 = new JSeparator();
		sprtrTickets2.setForeground(UI_Elements.color_mainBackgroundColor);
		sprtrTickets2.setBounds(lblTotalRevenue.getBounds().x, lblTotalSingleBleachers.getBounds().y+lblTotalSingleBleachers.getBounds().height+lineSpacing*2, 533, 10);
		panelTickets.add(sprtrTickets2);
		
		lblTotalNumOfSeasonTickets = new JLabel("Total Num. of Season Tickets:");
		lblTotalNumOfSeasonTickets.setAlignmentY(Component.TOP_ALIGNMENT);
		lblTotalNumOfSeasonTickets.setVerticalAlignment(SwingConstants.TOP);
		lblTotalNumOfSeasonTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalNumOfSeasonTickets.setFont(UI_Elements.font_bodyLabel);
		lblTotalNumOfSeasonTickets.setBorder(null);
		lblTotalNumOfSeasonTickets.setBounds(sprtrTickets2.getBounds().x, sprtrTickets2.getBounds().y+sprtrTickets2.getBounds().height+lineSpacing*2, 250, lblTotalAttendance.getBounds().height);
		panelTickets.add(lblTotalNumOfSeasonTickets);
		
		tf_TotalNumOfSeasonTickets = new JTextField("8,000");
		tf_TotalNumOfSeasonTickets.setAlignmentY(Component.TOP_ALIGNMENT);
		tf_TotalNumOfSeasonTickets.setBorder(null);
		tf_TotalNumOfSeasonTickets.setOpaque(false);
		tf_TotalNumOfSeasonTickets.setBackground(Color.WHITE);
		tf_TotalNumOfSeasonTickets.setBounds(tf_TotalSingleBleachers.getBounds().x, lblTotalNumOfSeasonTickets.getBounds().y, 150, tf_TotalSingleBleachers.getBounds().height);
		tf_TotalNumOfSeasonTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalNumOfSeasonTickets.setEnabled(true);
		tf_TotalNumOfSeasonTickets.setEditable(false);
		tf_TotalNumOfSeasonTickets.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalNumOfSeasonTickets.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalNumOfSeasonTickets);
		
		lblTotalSeasonTicketRevenue = new JLabel("Total Season Ticket Revenue:");
		lblTotalSeasonTicketRevenue.setAlignmentY(Component.TOP_ALIGNMENT);
		lblTotalSeasonTicketRevenue.setVerticalAlignment(SwingConstants.TOP);
		lblTotalSeasonTicketRevenue.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalSeasonTicketRevenue.setFont(UI_Elements.font_bodyLabel);
		lblTotalSeasonTicketRevenue.setBorder(null);
		lblTotalSeasonTicketRevenue.setBounds(lblTotalNumOfSeasonTickets.getBounds().x, lblTotalNumOfSeasonTickets.getBounds().y+lblTotalNumOfSeasonTickets.getBounds().height+lineSpacing, 250, lblTotalNumOfSeasonTickets.getBounds().height);
		panelTickets.add(lblTotalSeasonTicketRevenue);
		
		tf_TotalSeasonTicketRevenue = new JTextField("$28,000");
		tf_TotalSeasonTicketRevenue.setAlignmentY(Component.TOP_ALIGNMENT);
		tf_TotalSeasonTicketRevenue.setBorder(null);
		tf_TotalSeasonTicketRevenue.setOpaque(false);
		tf_TotalSeasonTicketRevenue.setBackground(Color.WHITE);
		tf_TotalSeasonTicketRevenue.setBounds(tf_TotalNumOfSeasonTickets.getBounds().x, lblTotalSeasonTicketRevenue.getBounds().y, 150, tf_TotalNumOfSeasonTickets.getBounds().height);
		tf_TotalSeasonTicketRevenue.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalSeasonTicketRevenue.setEnabled(true);
		tf_TotalSeasonTicketRevenue.setEditable(false);
		tf_TotalSeasonTicketRevenue.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalSeasonTicketRevenue.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalSeasonTicketRevenue);
		
	}
	
}
