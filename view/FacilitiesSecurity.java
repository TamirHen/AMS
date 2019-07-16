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

public class FacilitiesSecurity extends JPanel {

	public JPanel panelSecurity;
	private JLabel titleSecurity;
	
	public JScrollPane securityEmployeeTableScrollPane;
	public JTable securityTable;
	public JButton btnAddSecurity;
	public JButton btnRemoveSecurity;
	
	public FacilitiesSecurity(){
		
		panelSecurity = new JPanel();
		panelSecurity.setBorder(null);
		panelSecurity.setBackground(SystemColor.control);
		panelSecurity.setBounds(0, 0, 600, 617);
		panelSecurity.setLayout(null);
		panelSecurity.setVisible(true);
		
		titleSecurity = new JLabel("SECURITY");
		titleSecurity.setAlignmentY(Component.TOP_ALIGNMENT);
		titleSecurity.setVerticalAlignment(SwingConstants.TOP);
		titleSecurity.setBounds(30, 22, 346, 76);
		titleSecurity.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleSecurity.setForeground(UI_Elements.color_mainBackgroundColor);
		titleSecurity.setFont(UI_Elements.font_AgencySubPanelTitle);
		panelSecurity.add(titleSecurity);
		
	
		//Sponsor table from DB
		securityEmployeeTableScrollPane = new JScrollPane();
		securityEmployeeTableScrollPane.setBounds(titleSecurity.getBounds().x, titleSecurity.getBounds().y+titleSecurity.getBounds().height-20, panelSecurity.getBounds().width-titleSecurity.getBounds().x-40, 275);
		panelSecurity.add(securityEmployeeTableScrollPane);
		
		securityTable = new JTable();
		securityEmployeeTableScrollPane.setViewportView(securityTable);
		//
		
		btnAddSecurity = new JButton("ADD SECURITY");
		btnAddSecurity.setFocusPainted(false);
		btnAddSecurity.setRequestFocusEnabled(false);
		btnAddSecurity.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddSecurity.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddSecurity.setForeground(Color.WHITE);
		btnAddSecurity.setOpaque(true);
		btnAddSecurity.setBorder(null);
		btnAddSecurity.setFont(UI_Elements.font_AgencyBodyButton);
		btnAddSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
		btnAddSecurity.setBounds(securityEmployeeTableScrollPane.getBounds().x, securityEmployeeTableScrollPane.getBounds().y+securityEmployeeTableScrollPane.getBounds().height+20, securityEmployeeTableScrollPane.getBounds().width/2 - 5, 30);
		btnAddSecurity.setSelected(false);
		panelSecurity.add(btnAddSecurity);
		btnAddSecurity.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddSecurity.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(btnAddSecurity.isSelected() == true)
		    	{
		    		btnAddSecurity.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnAddSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
		    	}
		    }
		} );
		
		btnRemoveSecurity = new JButton("REMOVE SECURITY");
		btnRemoveSecurity.setFocusPainted(false);
		btnRemoveSecurity.setRequestFocusEnabled(false);
		btnRemoveSecurity.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemoveSecurity.setHorizontalAlignment(SwingConstants.CENTER);
		btnRemoveSecurity.setForeground(Color.WHITE);
		btnRemoveSecurity.setOpaque(true);
		btnRemoveSecurity.setBorder(null);
		btnRemoveSecurity.setFont(UI_Elements.font_AgencyBodyButton);
		btnRemoveSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
		btnRemoveSecurity.setBounds(securityEmployeeTableScrollPane.getBounds().x + securityEmployeeTableScrollPane.getBounds().width - btnAddSecurity.getBounds().width, btnAddSecurity.getBounds().y, securityEmployeeTableScrollPane.getBounds().width/2 - 5, btnAddSecurity.getBounds().height);
		btnRemoveSecurity.setSelected(false);
		panelSecurity.add(btnRemoveSecurity);
		btnRemoveSecurity.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnRemoveSecurity.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(btnRemoveSecurity.isSelected() == true)
		    	{
		    		btnRemoveSecurity.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnRemoveSecurity.setBackground(UI_Elements.color_mainBackgroundColor);
		    	}
		    }
		} );
	}
}
