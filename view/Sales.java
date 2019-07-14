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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class Sales extends JPanel {

	public JPanel panelSales;
	public SalesTickets ticketsPanel;
	public SalesSponsorships sponsorshipsPanel;

	public JButton btnTickets;
	public JButton btnSponsorships;
	
	private JTextField tf_TotalAttendance;
	private JTextField tf_TotalRevenue;
	private JTextField tf_TotalNumOfGameTickets;
	private JTextField tf_TotalRevenueGameTickets;
	private JTextField tf_TotalNumOfSeasonTickets;
	
	private JLabel titleSales;
	private JLabel lblSeason;
	private JLabel lblGame;
	private JLabel titleTickets;
	private JLabel lblTotalAttendance;
	private JLabel lblTotalRevenue;
	private JLabel lblTotalNumOfGameTickets;
	private JLabel lblTotalGameTicketRevenue;
	private JLabel lblTotalNumOfSeasonTickets;
	private JLabel titleSponsorships;
	
	public JComboBox<String> cb_SalesSeason;
	public JComboBox<String> cb_SalesGame;
	
	private JSeparator sprtrTickets1;
	private JSeparator sprtrTickets2;
	private JLabel lblTotalSingleVIP;
	private JTextField tf_TotalSingleVIP;
	private JLabel lblTotalSingleClubLevel;
	private JTextField tf_TotalSingleClubLevel;
	private JLabel lblTotalSingleBleachers;
	private JTextField tf_TotalSingleBleachers;
	private JLabel lblTotalSeasonTicketRevenue;
	private JTextField tf_TotalSeasonTicketRevenue;
	
	
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
		ticketsPanel = new SalesTickets();
		ticketsPanel.setBounds(330, 0, ticketsPanel.panelTickets.getBounds().width, ticketsPanel.panelTickets.getBounds().height);
		panelSales.add(ticketsPanel);
		ticketsPanel.add(ticketsPanel.panelTickets);
		ticketsPanel.setLayout(null);
		ticketsPanel.setVisible(false);
		
		
		//Sponsorship sub-panel
		
		sponsorshipsPanel = new SalesSponsorships();
		sponsorshipsPanel.setBounds(330, 0, sponsorshipsPanel.panelSponsorships.getBounds().width, sponsorshipsPanel.panelSponsorships.getBounds().height);
		panelSales.add(sponsorshipsPanel);
		sponsorshipsPanel.add(sponsorshipsPanel.panelSponsorships);
		sponsorshipsPanel.setLayout(null);
		sponsorshipsPanel.setVisible(false);
	

		
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
		    	if(ticketsPanel.isVisible() == true)
		    	{
		    		btnTickets.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnTickets.setBackground(UI_Elements.color_panelBodyButtonDefault);
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
		btnSponsorships.setBounds(35, (btnTickets.getBounds().y)+55, 265, 40);
		panelSales.add(btnSponsorships);
		btnSponsorships.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnSponsorships.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(sponsorshipsPanel.isVisible() == true)
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
				ticketsPanel.setVisible(true);
				ticketsPanel.panelTickets.setVisible(true);
				btnTickets.setBackground(UI_Elements.color_panelBodyButtonSelected);
				
				sponsorshipsPanel.setVisible(false);
				sponsorshipsPanel.panelSponsorships.setVisible(false);
				btnSponsorships.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				ticketsPanel.revalidate();
			}
		});
		
		
		btnSponsorships.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ticketsPanel.setVisible(false);
				ticketsPanel.panelTickets.setVisible(false);
				btnTickets.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				sponsorshipsPanel.setVisible(true);
				sponsorshipsPanel.panelSponsorships.setVisible(true);
				btnSponsorships.setBackground(UI_Elements.color_panelBodyButtonSelected);
				
				sponsorshipsPanel.revalidate();
			}
		});
		panelSales.setVisible(false);
	}
}
