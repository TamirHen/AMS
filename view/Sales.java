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
	public JButton btnSponsorship;
	
	private JLabel titleSales;
	private JLabel lblSeason;
	private JLabel lblGame;
	
	public JComboBox<String> cb_SalesSeason;
	public JComboBox<String> cb_SalesGame;
	
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
		titleSales.setFont(UI_Elements.font_AgencyPanelTitle);
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
		cb_SalesSeason.setModel(new DefaultComboBoxModel(new String[] {}));
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
		cb_SalesGame.setModel(new DefaultComboBoxModel(new String[] {}));
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
		btnTickets.setOpaque(true);
		btnTickets.setBorder(null);
		btnTickets.setFont(UI_Elements.font_AgencyBodyButton);
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
		
		
		btnSponsorship = new JButton("   SPONSORSHIP");
		btnSponsorship.setFocusPainted(false);
		btnSponsorship.setRequestFocusEnabled(false);
		btnSponsorship.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSponsorship.setHorizontalAlignment(SwingConstants.LEFT);
		btnSponsorship.setForeground(Color.WHITE);
		btnSponsorship.setOpaque(true);
		btnSponsorship.setBorder(null);
		//btnSponsorship.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 20));
		btnSponsorship.setFont(UI_Elements.font_AgencyBodyButton);
		btnSponsorship.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnSponsorship.setBounds(35, (btnTickets.getBounds().y)+55, 265, 40);
		panelSales.add(btnSponsorship);
		btnSponsorship.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnSponsorship.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(sponsorshipsPanel.isVisible() == true)
		    	{
		    		btnSponsorship.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnSponsorship.setBackground(UI_Elements.color_panelBodyButtonDefault);
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
				btnSponsorship.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				ticketsPanel.revalidate();
			}
		});
		
		
		btnSponsorship.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ticketsPanel.setVisible(false);
				ticketsPanel.panelTickets.setVisible(false);
				btnTickets.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				sponsorshipsPanel.setVisible(true);
				sponsorshipsPanel.panelSponsorships.setVisible(true);
				btnSponsorship.setBackground(UI_Elements.color_panelBodyButtonSelected);
				
				sponsorshipsPanel.revalidate();
			}
		});
		panelSales.setVisible(false);
	}
}
