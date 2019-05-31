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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Sales extends JPanel {

	public JPanel panelSales;
	private JPanel panelConcessions;
	private JPanel panelMerchandise;
	private JPanel panelTickets;
	private JPanel panelSponsorships;

	
	private JButton btnTickets;
	private JButton btnConcessions;
	private JButton btnMerchandise;
	private JButton btnSponsorships;
	
	
	private JTextField tf_TotalAttendance;
	private JTextField tf_TotalRevenue;
	private JTextField tf_TotalNumOfGameTickets;
	private JTextField tf_TotalRevenueGameTickets;
	private JTextField tf_TotalNumOfSeasonTickets;
	
	
	private JLabel titleMerchandise;
	private JLabel titleSales;
	private JLabel lblSeason;
	private JLabel lblGame;
	private JLabel titleTickets;
	private JLabel lblTotalAttendance;
	private JLabel lblTotalRevenue;
	private JLabel lblTotalNumOfGameTickets;
	private JLabel lblTotalGameTicketRevenue;
	private JLabel lblTotalNumOfSeasonTickets;
	private JLabel titleConcessions;
	private JLabel titleSponsorships;
	
	
	private JComboBox cb_SalesSeason;
	private JComboBox cb_SalesGame;

	
	private JSeparator sprtrTickets1;
	private JSeparator sprtrTickets2;
	
	
	public Sales() {
		//Sales Panel Settings
		panelSales = new JPanel();
		panelSales.setBorder(null);
		panelSales.setBackground(UI_Elements.color_mainBackgroundColor);
		panelSales.setBounds(189, 0, 925, 617);
		panelSales.setLayout(null);
		//STARTUP STATE
		panelSales.setVisible(false);
		
		
		//Sales Page Title
		titleSales = new JLabel("SALES");
		titleSales.setVerticalAlignment(SwingConstants.TOP);
		titleSales.setBounds(25, 22, 246, 76);
		titleSales.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleSales.setForeground(Color.WHITE);
		titleSales.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, UI_Elements.textPanelTitleSize));
		panelSales.add(titleSales);
		
		lblSeason = new JLabel("Season:");
		lblSeason.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblSeason.setForeground(Color.WHITE);
		lblSeason.setFont(UI_Elements.font_bodyLabel);
		lblSeason.setBorder(null);
		lblSeason.setBounds(35, 103, 65, 20);
		panelSales.add(lblSeason);
		
		cb_SalesSeason = new JComboBox();
		cb_SalesSeason.setFont(UI_Elements.font_bodyFillText);
		cb_SalesSeason.setModel(new DefaultComboBoxModel(new String[] {"2019/2020"}));
		cb_SalesSeason.setBounds(100, 103, 200, 20);
		panelSales.add(cb_SalesSeason);
		
		lblGame = new JLabel("Game:");
		lblGame.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblGame.setForeground(Color.WHITE);
		lblGame.setFont(UI_Elements.font_bodyLabel);
		lblGame.setBorder(null);
		lblGame.setBounds(35, (lblSeason.getBounds().y)+30, 65, 20);
		panelSales.add(lblGame);
		
		cb_SalesGame = new JComboBox();
		cb_SalesGame.setFont(UI_Elements.font_bodyFillText);
		cb_SalesGame.setModel(new DefaultComboBoxModel(new String[] {"Tamir vs. Yoni - 01/09/2019"}));
		cb_SalesGame.setBounds(100, (cb_SalesSeason.getBounds().y)+30, 200, 20);
		panelSales.add(cb_SalesGame);
		
		
		//Tickets sub-panel
		panelTickets = new JPanel();
		panelTickets.setBorder(null);
		panelTickets.setBackground(SystemColor.control);
		panelTickets.setBounds(320, 0, 600, 617);
		panelSales.add(panelTickets);
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
		
		tf_TotalAttendance = new JTextField("20,000");
		tf_TotalAttendance.setBorder(null);
		tf_TotalAttendance.setOpaque(false);
		tf_TotalAttendance.setBackground(Color.WHITE);
		tf_TotalAttendance.setBounds(180, 103, 150, 20);
		tf_TotalAttendance.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalAttendance.setEnabled(true);
		tf_TotalAttendance.setEditable(false);
		tf_TotalAttendance.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalAttendance.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalAttendance);
		
		lblTotalRevenue = new JLabel("Total Revenue:");
		lblTotalRevenue.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalRevenue.setFont(new Font("Calibri", Font.BOLD, 15));
		lblTotalRevenue.setBorder(null);
		lblTotalRevenue.setBounds(30, (lblTotalAttendance.getBounds().y)+30, 180, 20);
		panelTickets.add(lblTotalRevenue);
		
		tf_TotalRevenue = new JTextField("500,000.0");
		tf_TotalRevenue.setBorder(null);
		tf_TotalRevenue.setOpaque(false);
		tf_TotalRevenue.setBackground(Color.WHITE);
		tf_TotalRevenue.setBounds(180, (lblTotalAttendance.getBounds().y)+30, 150, 20);
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
		
		lblTotalNumOfGameTickets = new JLabel("Total Num. of Game Tickets:");
		lblTotalNumOfGameTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalNumOfGameTickets.setFont(new Font("Calibri", Font.BOLD, 15));
		lblTotalNumOfGameTickets.setBorder(null);
		lblTotalNumOfGameTickets.setBounds(30, (sprtrTickets1.getBounds().y)+15, 210, 20);
		panelTickets.add(lblTotalNumOfGameTickets);
		
		tf_TotalNumOfGameTickets = new JTextField("12,000");
		tf_TotalNumOfGameTickets.setBorder(null);
		tf_TotalNumOfGameTickets.setOpaque(false);
		tf_TotalNumOfGameTickets.setBackground(Color.WHITE);
		tf_TotalNumOfGameTickets.setBounds(240, (sprtrTickets1.getBounds().y)+15, 150, 20);
		tf_TotalNumOfGameTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalNumOfGameTickets.setEnabled(true);
		tf_TotalNumOfGameTickets.setEditable(false);
		tf_TotalNumOfGameTickets.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalNumOfGameTickets.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalNumOfGameTickets);
		
		lblTotalGameTicketRevenue = new JLabel("Total Revenue:");
		lblTotalGameTicketRevenue.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalGameTicketRevenue.setFont(new Font("Calibri", Font.BOLD, 15));
		lblTotalGameTicketRevenue.setBorder(null);
		lblTotalGameTicketRevenue.setBounds(30, (lblTotalNumOfGameTickets.getBounds().y)+30, 180, 20);
		panelTickets.add(lblTotalGameTicketRevenue);
		
		tf_TotalRevenueGameTickets = new JTextField("100,000.0");
		tf_TotalRevenueGameTickets.setBorder(null);
		tf_TotalRevenueGameTickets.setOpaque(false);
		tf_TotalRevenueGameTickets.setBackground(Color.WHITE);
		tf_TotalRevenueGameTickets.setBounds(240, 208, 150, 20);
		tf_TotalRevenueGameTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalRevenueGameTickets.setEnabled(true);
		tf_TotalRevenueGameTickets.setEditable(false);
		tf_TotalRevenueGameTickets.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalRevenueGameTickets.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalRevenueGameTickets);
		
		sprtrTickets2 = new JSeparator();
		sprtrTickets2.setForeground(UI_Elements.color_mainBackgroundColor);
		sprtrTickets2.setBounds(30, (lblTotalNumOfGameTickets.getBounds().y)+30*2, 533, 2);
		panelTickets.add(sprtrTickets2);
		
		lblTotalNumOfSeasonTickets = new JLabel("Total Num. of Season Tickets:");
		lblTotalNumOfSeasonTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTotalNumOfSeasonTickets.setFont(new Font("Calibri", Font.BOLD, 15));
		lblTotalNumOfSeasonTickets.setBorder(null);
		lblTotalNumOfSeasonTickets.setBounds(30, (sprtrTickets2.getBounds().y)+15, 210, 20);
		panelTickets.add(lblTotalNumOfSeasonTickets);
		
		tf_TotalNumOfSeasonTickets = new JTextField("8,000");
		tf_TotalNumOfSeasonTickets.setBorder(null);
		tf_TotalNumOfSeasonTickets.setOpaque(false);
		tf_TotalNumOfSeasonTickets.setBackground(Color.WHITE);
		tf_TotalNumOfSeasonTickets.setBounds(240, (sprtrTickets2.getBounds().y)+15, 150, 20);
		tf_TotalNumOfSeasonTickets.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TotalNumOfSeasonTickets.setEnabled(true);
		tf_TotalNumOfSeasonTickets.setEditable(false);
		tf_TotalNumOfSeasonTickets.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TotalNumOfSeasonTickets.setFont(UI_Elements.font_bodySalesData);
		panelTickets.add(tf_TotalNumOfSeasonTickets);
		
		//Concessions sub-panel
		panelConcessions = new JPanel();
		panelConcessions.setBorder(null);
		panelConcessions.setBackground(SystemColor.control);
		panelConcessions.setBounds(320, 0, 600, 617);
		panelSales.add(panelConcessions);
		panelConcessions.setLayout(null);
		
		titleConcessions = new JLabel("CONCESSIONS");
		titleConcessions.setAlignmentY(Component.TOP_ALIGNMENT);
		titleConcessions.setVerticalAlignment(SwingConstants.TOP);
		titleConcessions.setBounds(30, 22, 346, 76);
		titleConcessions.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleConcessions.setForeground(UI_Elements.color_mainBackgroundColor);
		titleConcessions.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, UI_Elements.textSubPanelTitleSize));
		panelConcessions.add(titleConcessions);
		
		//Merchandise sub-panel
		panelMerchandise = new JPanel();
		panelMerchandise.setBorder(null);
		panelMerchandise.setBackground(SystemColor.control);
		panelMerchandise.setBounds(320, 0, 600, 617);
		panelSales.add(panelMerchandise);
		panelMerchandise.setLayout(null);
		
		titleMerchandise = new JLabel("MERCHANDISE");
		titleMerchandise.setAlignmentY(Component.TOP_ALIGNMENT);
		titleMerchandise.setVerticalAlignment(SwingConstants.TOP);
		titleMerchandise.setBounds(30, 22, 346, 76);
		titleMerchandise.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleMerchandise.setForeground(UI_Elements.color_mainBackgroundColor);
		titleMerchandise.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, UI_Elements.textSubPanelTitleSize));
		panelMerchandise.add(titleMerchandise);
		
		//Sponsorship sub-panel
		panelSponsorships = new JPanel();
		panelSponsorships.setBorder(null);
		panelSponsorships.setBackground(SystemColor.control);
		panelSponsorships.setBounds(320, 0, 600, 617);
		panelSales.add(panelSponsorships);
		panelSponsorships.setLayout(null);
		
		titleSponsorships = new JLabel("SPONSORSHIPS");
		titleSponsorships.setAlignmentY(Component.TOP_ALIGNMENT);
		titleSponsorships.setVerticalAlignment(SwingConstants.TOP);
		titleSponsorships.setBounds(30, 22, 346, 76);
		titleSponsorships.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleSponsorships.setForeground(UI_Elements.color_mainBackgroundColor);
		titleSponsorships.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, UI_Elements.textSubPanelTitleSize));
		panelSponsorships.add(titleSponsorships);
		
		//Panel startup state
		panelTickets.setVisible(false);
		panelConcessions.setVisible(false);	
		panelMerchandise.setVisible(false);
		panelSponsorships.setVisible(false);
		
		//Buttons
		btnTickets = new JButton("   TICKETS");
		btnTickets.setFocusPainted(false);
		btnTickets.setRequestFocusEnabled(false);
		btnTickets.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTickets.setHorizontalAlignment(SwingConstants.LEFT);
		btnTickets.setForeground(Color.WHITE);
		btnTickets.setToolTipText("Tickets");
		btnTickets.setOpaque(true);
		btnTickets.setBorder(null);
		btnTickets.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 20));
		btnTickets.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnTickets.setBounds(35, 175, 265, 40);
		panelSales.add(btnTickets);
		btnTickets.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnTickets.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(panelTickets.isVisible() == true)
		    	{
		    		btnTickets.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnTickets.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    	}
		    }
		} );
		
		btnConcessions = new JButton("   CONCESSIONS");
		btnConcessions.setFocusPainted(false);
		btnConcessions.setRequestFocusEnabled(false);
		btnConcessions.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConcessions.setHorizontalAlignment(SwingConstants.LEFT);
		btnConcessions.setForeground(Color.WHITE);
		btnConcessions.setToolTipText("Concessions");
		btnConcessions.setOpaque(true);
		btnConcessions.setBorder(null);
		btnConcessions.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 20));
		btnConcessions.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnConcessions.setBounds(35, (btnTickets.getBounds().y)+55, 265, 40);
		panelSales.add(btnConcessions);
		btnConcessions.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnConcessions.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(panelConcessions.isVisible() == true)
		    	{
		    		btnConcessions.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnConcessions.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    	}
		    }
		} );
		
		btnMerchandise = new JButton("   MERCHANDISE");
		btnMerchandise.setFocusPainted(false);
		btnMerchandise.setRequestFocusEnabled(false);
		btnMerchandise.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMerchandise.setHorizontalAlignment(SwingConstants.LEFT);
		btnMerchandise.setForeground(Color.WHITE);
		btnMerchandise.setToolTipText("Merchandise");
		btnMerchandise.setOpaque(true);
		btnMerchandise.setBorder(null);
		btnMerchandise.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 20));
		btnMerchandise.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnMerchandise.setBounds(35, (btnTickets.getBounds().y)+55*2, 265, 40);
		panelSales.add(btnMerchandise);
		btnMerchandise.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnMerchandise.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(panelMerchandise.isVisible() == true)
		    	{
		    		btnMerchandise.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnMerchandise.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    	}
		    }
		} );
		
		btnSponsorships = new JButton("   SPONSORSHIPS");
		btnSponsorships.setFocusPainted(false);
		btnSponsorships.setRequestFocusEnabled(false);
		btnSponsorships.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSponsorships.setHorizontalAlignment(SwingConstants.LEFT);
		btnSponsorships.setForeground(Color.WHITE);
		btnSponsorships.setToolTipText("Sponsorships");
		btnSponsorships.setOpaque(true);
		btnSponsorships.setBorder(null);
		btnSponsorships.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 20));
		btnSponsorships.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnSponsorships.setBounds(35, (btnTickets.getBounds().y)+55*3, 265, 40);
		panelSales.add(btnSponsorships);
		btnSponsorships.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnSponsorships.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(panelSponsorships.isVisible() == true)
		    	{
		    		btnSponsorships.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnSponsorships.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    	}
		    }
		} );
		

		
		
		//Action listeners
		btnTickets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelTickets.setVisible(true);
				btnTickets.setBackground(UI_Elements.color_panelBodyButtonSelected);
				
				panelConcessions.setVisible(false);
				btnConcessions.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				panelMerchandise.setVisible(false);
				btnMerchandise.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				panelSponsorships.setVisible(false);
				btnSponsorships.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				
				panelTickets.revalidate();
			}
		});
		
		btnConcessions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelTickets.setVisible(false);
				btnTickets.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				panelConcessions.setVisible(true);
				btnConcessions.setBackground(UI_Elements.color_panelBodyButtonSelected);
				
				panelMerchandise.setVisible(false);
				btnMerchandise.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				panelSponsorships.setVisible(false);
				btnSponsorships.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				
				panelConcessions.revalidate();
			}
		});
		
		btnMerchandise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelTickets.setVisible(false);
				btnTickets.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				panelConcessions.setVisible(false);
				btnConcessions.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				panelMerchandise.setVisible(true);
				btnMerchandise.setBackground(UI_Elements.color_panelBodyButtonSelected);
				
				panelSponsorships.setVisible(false);
				btnSponsorships.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				
				panelMerchandise.revalidate();
			}
		});
		
		btnSponsorships.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelTickets.setVisible(false);
				btnTickets.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				panelConcessions.setVisible(false);
				btnConcessions.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				panelMerchandise.setVisible(false);
				btnMerchandise.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				panelSponsorships.setVisible(true);
				btnSponsorships.setBackground(UI_Elements.color_panelBodyButtonSelected);
				
				panelSponsorships.revalidate();
			}
		});
		panelSales.setVisible(false);
	}

}
