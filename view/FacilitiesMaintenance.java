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
import java.util.ArrayList;
import java.util.List;

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

public class FacilitiesMaintenance extends JPanel {

	public JPanel panelMaintenance;
	private JLabel titleMaintenance;
	
	public JScrollPane maintenanceEmployeeTableScrollPane;
	public JTable maintenanceTable;
	public JButton btnAddMaintenance;
	public JButton btnRemoveMaintenance;
	
	public FacilitiesMaintenance(){
		
		panelMaintenance = new JPanel();
		panelMaintenance.setBorder(null);
		panelMaintenance.setBackground(SystemColor.control);
		panelMaintenance.setBounds(0, 0, 600, 617);
		panelMaintenance.setLayout(null);
		panelMaintenance.setVisible(true);
		
		titleMaintenance = new JLabel("MAINTENANCE");
		titleMaintenance.setAlignmentY(Component.TOP_ALIGNMENT);
		titleMaintenance.setVerticalAlignment(SwingConstants.TOP);
		titleMaintenance.setBounds(30, 22, 346, 76);
		titleMaintenance.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleMaintenance.setForeground(UI_Elements.color_mainBackgroundColor);
		titleMaintenance.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, UI_Elements.textSubPanelTitleSize));
		panelMaintenance.add(titleMaintenance);
		
	
		//Sponsor table from DB
		maintenanceEmployeeTableScrollPane = new JScrollPane();
		maintenanceEmployeeTableScrollPane.setBounds(titleMaintenance.getBounds().x, titleMaintenance.getBounds().y+titleMaintenance.getBounds().height-20, panelMaintenance.getBounds().width-titleMaintenance.getBounds().x-40, 275);
		panelMaintenance.add(maintenanceEmployeeTableScrollPane);
		
		maintenanceTable = new JTable();
		maintenanceEmployeeTableScrollPane.setViewportView(maintenanceTable);
		//
		
		btnAddMaintenance = new JButton("ADD SECURITY");
		btnAddMaintenance.setFocusPainted(false);
		btnAddMaintenance.setRequestFocusEnabled(false);
		btnAddMaintenance.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddMaintenance.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddMaintenance.setForeground(Color.WHITE);
		btnAddMaintenance.setOpaque(true);
		btnAddMaintenance.setBorder(null);
		btnAddMaintenance.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 20));
		btnAddMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
		btnAddMaintenance.setBounds(maintenanceEmployeeTableScrollPane.getBounds().x, maintenanceEmployeeTableScrollPane.getBounds().y+maintenanceEmployeeTableScrollPane.getBounds().height+20, maintenanceEmployeeTableScrollPane.getBounds().width/2 - 5, 30);
		btnAddMaintenance.setSelected(false);
		panelMaintenance.add(btnAddMaintenance);
		btnAddMaintenance.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddMaintenance.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(btnAddMaintenance.isSelected() == true)
		    	{
		    		btnAddMaintenance.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnAddMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
		    	}
		    }
		} );
		
		btnRemoveMaintenance = new JButton("REMOVE SECURITY");
		btnRemoveMaintenance.setFocusPainted(false);
		btnRemoveMaintenance.setRequestFocusEnabled(false);
		btnRemoveMaintenance.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemoveMaintenance.setHorizontalAlignment(SwingConstants.CENTER);
		btnRemoveMaintenance.setForeground(Color.WHITE);
		btnRemoveMaintenance.setOpaque(true);
		btnRemoveMaintenance.setBorder(null);
		btnRemoveMaintenance.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 20));
		btnRemoveMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
		btnRemoveMaintenance.setBounds(maintenanceEmployeeTableScrollPane.getBounds().x + maintenanceEmployeeTableScrollPane.getBounds().width - btnAddMaintenance.getBounds().width, btnAddMaintenance.getBounds().y, maintenanceEmployeeTableScrollPane.getBounds().width/2 - 5, btnAddMaintenance.getBounds().height);
		btnRemoveMaintenance.setSelected(false);
		panelMaintenance.add(btnRemoveMaintenance);
		btnRemoveMaintenance.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnRemoveMaintenance.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(btnRemoveMaintenance.isSelected() == true)
		    	{
		    		btnRemoveMaintenance.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnRemoveMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
		    	}
		    }
		} );
	}
}
