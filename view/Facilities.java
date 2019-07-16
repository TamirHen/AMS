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

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Facilities extends JPanel {
	
	public JPanel panelFacilities;
	private  JLabel titleFacilities;

	private JButton btnSecurity;
	private JButton btnMaintenance;
	private FacilitiesSecurity securityPanel;
	private FacilitiesMaintenance maintenancePanel;
	
	
	public Facilities() {
		//Facilities Panel Settings
		panelFacilities = new JPanel();
		panelFacilities.setBorder(null);
		panelFacilities.setBackground(UI_Elements.color_mainBackgroundColor);
		panelFacilities.setBounds(189, 0, 925, 617);
		panelFacilities.setLayout(null);
		
		//Facilities Page Title
		titleFacilities = new JLabel("FACILITIES");
		titleFacilities.setVerticalAlignment(SwingConstants.TOP);
		titleFacilities.setBounds(25, 22, 470, 76);
		titleFacilities.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleFacilities.setForeground(Color.WHITE);
		titleFacilities.setFont(UI_Elements.font_AgencyPanelTitle);
		panelFacilities.add(titleFacilities);
		
		
		//Security sub-panel
		securityPanel = new FacilitiesSecurity();
		securityPanel.setBounds(330, 0, securityPanel.panelSecurity.getBounds().width, securityPanel.panelSecurity.getBounds().height);
		panelFacilities.add(securityPanel);
		securityPanel.add(securityPanel.panelSecurity);
		securityPanel.setLayout(null);
		securityPanel.setVisible(false);
		
		//Maintenance sub-panel
		maintenancePanel = new FacilitiesMaintenance();
		maintenancePanel.setBounds(330, 0, maintenancePanel.panelMaintenance.getBounds().width, maintenancePanel.panelMaintenance.getBounds().height);
		panelFacilities.add(maintenancePanel);
		maintenancePanel.add(maintenancePanel.panelMaintenance);
		maintenancePanel.setLayout(null);
		maintenancePanel.setVisible(false);
		
		
		/*
		panelSecurity = new JPanel();
		panelSecurity.setBorder(null);
		panelSecurity.setBackground(SystemColor.control);
		panelSecurity.setBounds(330, 0, 600, 617);
		panelFacilities.add(panelSecurity);
		panelSecurity.setLayout(null);
		
		titleSecurity = new JLabel("SECURITY");
		titleSecurity.setAlignmentY(Component.TOP_ALIGNMENT);
		titleSecurity.setVerticalAlignment(SwingConstants.TOP);
		titleSecurity.setBounds(30, 22, 346, 76);
		titleSecurity.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleSecurity.setForeground(UI_Elements.color_mainBackgroundColor);
		titleSecurity.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, UI_Elements.textSubPanelTitleSize));
		panelSecurity.add(titleSecurity);
		
		panelMaintenance = new JPanel();
		panelMaintenance.setBorder(null);
		panelMaintenance.setBackground(SystemColor.control);
		panelMaintenance.setBounds(330, 0, 600, 617);
		panelFacilities.add(panelMaintenance);
		panelMaintenance.setLayout(null);
		
		titleMaintenance = new JLabel("MAINTENANCE");
		titleMaintenance.setAlignmentY(Component.TOP_ALIGNMENT);
		titleMaintenance.setVerticalAlignment(SwingConstants.TOP);
		titleMaintenance.setBounds(30, 22, 346, 76);
		titleMaintenance.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleMaintenance.setForeground(UI_Elements.color_mainBackgroundColor);
		titleMaintenance.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, UI_Elements.textSubPanelTitleSize));
		panelMaintenance.add(titleMaintenance);*/
		
		
		//Buttons
		btnSecurity = new JButton("   SECURITY");
		btnSecurity.setFocusPainted(false);
		btnSecurity.setRequestFocusEnabled(false);
		btnSecurity.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSecurity.setHorizontalAlignment(SwingConstants.LEFT);
		btnSecurity.setForeground(Color.WHITE);
		btnSecurity.setOpaque(true);
		btnSecurity.setBorder(null);
		btnSecurity.setFont(UI_Elements.font_AgencyBodyButton);
		btnSecurity.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnSecurity.setBounds(35, 103, 265, 40);
		panelFacilities.add(btnSecurity);
		btnSecurity.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnSecurity.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(securityPanel.isVisible() == true)
		    	{
		    		btnSecurity.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnSecurity.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    	}
		    }
		} );
		
		btnMaintenance = new JButton("   MAINTENANCE");
		btnMaintenance.setFocusPainted(false);
		btnMaintenance.setRequestFocusEnabled(false);
		btnMaintenance.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMaintenance.setHorizontalAlignment(SwingConstants.LEFT);
		btnMaintenance.setForeground(Color.WHITE);
		btnMaintenance.setOpaque(true);
		btnMaintenance.setBorder(null);
		btnMaintenance.setFont(UI_Elements.font_AgencyBodyButton);
		btnMaintenance.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnMaintenance.setBounds(35, (btnSecurity.getBounds().y)+55, 265, 40);
		panelFacilities.add(btnMaintenance);
		btnMaintenance.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnMaintenance.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(maintenancePanel.isVisible() == true)
		    	{
		    		btnMaintenance.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnMaintenance.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    	}
		    }
		} );
		
		//Action listeners
		btnSecurity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				securityPanel.setVisible(true);
				btnSecurity.setBackground(UI_Elements.color_panelBodyButtonSelected);
				
				maintenancePanel.setVisible(false);
				btnMaintenance.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				
				securityPanel.revalidate();
			}
		});
		
		btnMaintenance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				securityPanel.setVisible(false);
				btnSecurity.setBackground(UI_Elements.color_panelBodyButtonDefault);
				
				maintenancePanel.setVisible(true);
				btnMaintenance.setBackground(UI_Elements.color_panelBodyButtonSelected);
				
				
				maintenancePanel.revalidate();
			}
		});
		
		//STARTUP STATE
		panelFacilities.setVisible(false);
		securityPanel.setVisible(false);
		maintenancePanel.setVisible(false);
						
	}

}
