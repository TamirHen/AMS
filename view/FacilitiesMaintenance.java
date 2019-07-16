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
	public String[] colum_headers= {"Name","Maintenance start date","Maintenance reason","Priority"};
	public String[][] maintenanceToDisplay=new String[100][4];
	
	public JButton btnAddMaintenance;
	public JButton btnRemoveMaintenance;
	
	private JLabel lblAddmAddMaintenanceMaintenanceName;
	public JTextField tf_AddMaintenanceMaintenanceName;
	private JLabel lblAddMaintenanceMaintenanceStartDate;
	public JTextField tf_AddMaintenanceMaintenanceStartDate;
	private JLabel lblAddMaintenancePriority;
	public JTextField tf_AddMaintenancePriority;
	private JLabel lblAddMaintenanceMaintenanceReason;
	public JTextField tf_AddMaintenanceMaintenanceReason;
	public JButton btnAddMaintenanceFinish;
	public JButton btnAddMaintenanceCancel;
	
	private List<JComponent> addMaintenancerComponents = new ArrayList<JComponent>();
	private List<JComponent> removeMaintenanceComponents = new ArrayList<JComponent>();
	private JLabel lblRemoveMaintenanceMaintenanceName;
	public JComboBox<String> cb_RemoveMaintenanceMaintenanceName;
	public JButton btnRemoveMaintenanceFinish;
	private JButton btnRemoveMaintenanceCancel;
	
	private int lineSpacing = 7;
	private int boxSpacing = 12;
	
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
		titleMaintenance.setFont(UI_Elements.font_AgencySubPanelTitle);
		panelMaintenance.add(titleMaintenance);
		
	
		//Sponsor table from DB
		maintenanceEmployeeTableScrollPane = new JScrollPane();
		maintenanceEmployeeTableScrollPane.setBounds(titleMaintenance.getBounds().x, titleMaintenance.getBounds().y+titleMaintenance.getBounds().height-20, panelMaintenance.getBounds().width-titleMaintenance.getBounds().x-40, 275);
		panelMaintenance.add(maintenanceEmployeeTableScrollPane);
		
		maintenanceTable = new JTable(maintenanceToDisplay,colum_headers);
		maintenanceEmployeeTableScrollPane.setViewportView(maintenanceTable);
		maintenanceTable.setEnabled(false);
		//
		
		btnAddMaintenance = new JButton("ADD MAINTENANCE");
		btnAddMaintenance.setFocusPainted(false);
		btnAddMaintenance.setRequestFocusEnabled(false);
		btnAddMaintenance.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddMaintenance.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddMaintenance.setForeground(Color.WHITE);
		btnAddMaintenance.setOpaque(true);
		btnAddMaintenance.setBorder(null);
		btnAddMaintenance.setFont(UI_Elements.font_AgencyBodyButton);
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
		
		btnRemoveMaintenance = new JButton("REMOVE MAINTENANCE");
		btnRemoveMaintenance.setFocusPainted(false);
		btnRemoveMaintenance.setRequestFocusEnabled(false);
		btnRemoveMaintenance.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemoveMaintenance.setHorizontalAlignment(SwingConstants.CENTER);
		btnRemoveMaintenance.setForeground(Color.WHITE);
		btnRemoveMaintenance.setOpaque(true);
		btnRemoveMaintenance.setBorder(null);
		btnRemoveMaintenance.setFont(UI_Elements.font_AgencyBodyButton);
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
		
		lblAddmAddMaintenanceMaintenanceName = new JLabel("Maintenance Name:");
		lblAddmAddMaintenanceMaintenanceName.setBorder(null);
		lblAddmAddMaintenanceMaintenanceName.setForeground(UI_Elements.color_mainBackgroundColor);
		lblAddmAddMaintenanceMaintenanceName.setFont(UI_Elements.font_bodyLabel);
		lblAddmAddMaintenanceMaintenanceName.setBounds(btnAddMaintenance.getBounds().x, btnAddMaintenance.getBounds().y+btnAddMaintenance.getBounds().height+20, 140, 26);
		panelMaintenance.add(lblAddmAddMaintenanceMaintenanceName);

		tf_AddMaintenanceMaintenanceName = new JTextField();
		tf_AddMaintenanceMaintenanceName.setDisabledTextColor(Color.BLACK);
		tf_AddMaintenanceMaintenanceName.setEnabled(true);
		tf_AddMaintenanceMaintenanceName.setEditable(false);
		tf_AddMaintenanceMaintenanceName.setHorizontalAlignment(SwingConstants.LEFT);
		tf_AddMaintenanceMaintenanceName.setFont(UI_Elements.font_bodyFillText);
		tf_AddMaintenanceMaintenanceName.setBounds(lblAddmAddMaintenanceMaintenanceName.getBounds().x + lblAddmAddMaintenanceMaintenanceName.getBounds().width + boxSpacing, lblAddmAddMaintenanceMaintenanceName.getBounds().y, maintenanceEmployeeTableScrollPane.getBounds().width-12-lblAddmAddMaintenanceMaintenanceName.getBounds().width, 20);
		panelMaintenance.add(tf_AddMaintenanceMaintenanceName);
		tf_AddMaintenanceMaintenanceName.setColumns(10);
		
		lblAddMaintenanceMaintenanceReason = new JLabel("Maintenance Reason:");
		lblAddMaintenanceMaintenanceReason.setBorder(null);
		lblAddMaintenanceMaintenanceReason.setForeground(UI_Elements.color_mainBackgroundColor);
		lblAddMaintenanceMaintenanceReason.setFont(UI_Elements.font_bodyLabel);
		lblAddMaintenanceMaintenanceReason.setBounds(lblAddmAddMaintenanceMaintenanceName.getBounds().x, lblAddmAddMaintenanceMaintenanceName.getBounds().y+lblAddmAddMaintenanceMaintenanceName.getBounds().height+lineSpacing, lblAddmAddMaintenanceMaintenanceName.getBounds().width, 26);
		panelMaintenance.add(lblAddMaintenanceMaintenanceReason);

		tf_AddMaintenanceMaintenanceReason = new JTextField();
		tf_AddMaintenanceMaintenanceReason.setDisabledTextColor(Color.BLACK);
		tf_AddMaintenanceMaintenanceReason.setEnabled(true);
		tf_AddMaintenanceMaintenanceReason.setEditable(false);
		tf_AddMaintenanceMaintenanceReason.setHorizontalAlignment(SwingConstants.LEFT);
		tf_AddMaintenanceMaintenanceReason.setFont(UI_Elements.font_bodyFillText);
		tf_AddMaintenanceMaintenanceReason.setBounds(tf_AddMaintenanceMaintenanceName.getBounds().x, lblAddMaintenanceMaintenanceReason.getBounds().y , tf_AddMaintenanceMaintenanceName.getBounds().width, tf_AddMaintenanceMaintenanceName.getBounds().height);
		panelMaintenance.add(tf_AddMaintenanceMaintenanceReason);
		tf_AddMaintenanceMaintenanceReason.setColumns(10);
		
		lblAddMaintenanceMaintenanceStartDate = new JLabel("Start Date:");
		lblAddMaintenanceMaintenanceStartDate.setBorder(null);
		lblAddMaintenanceMaintenanceStartDate.setForeground(UI_Elements.color_mainBackgroundColor);
		lblAddMaintenanceMaintenanceStartDate.setFont(UI_Elements.font_bodyLabel);
		lblAddMaintenanceMaintenanceStartDate.setBounds(lblAddMaintenanceMaintenanceReason.getBounds().x, lblAddMaintenanceMaintenanceReason.getBounds().y+lblAddMaintenanceMaintenanceReason.getBounds().height+lineSpacing, 70, 26);
		panelMaintenance.add(lblAddMaintenanceMaintenanceStartDate);
	
		tf_AddMaintenanceMaintenanceStartDate = new JTextField();
		tf_AddMaintenanceMaintenanceStartDate.setDisabledTextColor(Color.BLACK);
		tf_AddMaintenanceMaintenanceStartDate.setEnabled(true);
		tf_AddMaintenanceMaintenanceStartDate.setEditable(false);
		tf_AddMaintenanceMaintenanceStartDate.setHorizontalAlignment(SwingConstants.LEFT);
		tf_AddMaintenanceMaintenanceStartDate.setFont(UI_Elements.font_bodyFillText);
		tf_AddMaintenanceMaintenanceStartDate.setBounds(lblAddMaintenanceMaintenanceStartDate.getBounds().x + lblAddMaintenanceMaintenanceStartDate.getBounds().width + boxSpacing, lblAddMaintenanceMaintenanceStartDate.getBounds().y , 180, 20);
		panelMaintenance.add(tf_AddMaintenanceMaintenanceStartDate);
		tf_AddMaintenanceMaintenanceStartDate.setColumns(10);
		
		tf_AddMaintenancePriority = new JTextField();
		tf_AddMaintenancePriority.setDisabledTextColor(Color.BLACK);
		tf_AddMaintenancePriority.setEnabled(true);
		tf_AddMaintenancePriority.setEditable(false);
		tf_AddMaintenancePriority.setHorizontalAlignment(SwingConstants.LEFT);
		tf_AddMaintenancePriority.setFont(UI_Elements.font_bodyFillText);
		tf_AddMaintenancePriority.setBounds(maintenanceEmployeeTableScrollPane.getBounds().x + maintenanceEmployeeTableScrollPane.getBounds().width - tf_AddMaintenanceMaintenanceStartDate.getBounds().width, lblAddMaintenanceMaintenanceStartDate.getBounds().y , tf_AddMaintenanceMaintenanceStartDate.getBounds().width, 20);
		panelMaintenance.add(tf_AddMaintenancePriority);
		tf_AddMaintenancePriority.setColumns(10);
		
		lblAddMaintenancePriority = new JLabel("Priority:");
		lblAddMaintenancePriority.setBorder(null);
		lblAddMaintenancePriority.setForeground(UI_Elements.color_mainBackgroundColor);
		lblAddMaintenancePriority.setFont(UI_Elements.font_bodyLabel);
		lblAddMaintenancePriority.setBounds(tf_AddMaintenancePriority.getBounds().x - lblAddMaintenanceMaintenanceStartDate.getBounds().width + boxSpacing, tf_AddMaintenanceMaintenanceStartDate.getBounds().y, lblAddMaintenanceMaintenanceStartDate.getBounds().width-20, 26);
		panelMaintenance.add(lblAddMaintenancePriority);
		
		btnAddMaintenanceFinish = new JButton("FINISH");
		btnAddMaintenanceFinish.setFocusPainted(false);
		btnAddMaintenanceFinish.setRequestFocusEnabled(false);
		btnAddMaintenanceFinish.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddMaintenanceFinish.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddMaintenanceFinish.setForeground(Color.WHITE);
		btnAddMaintenanceFinish.setOpaque(true);
		btnAddMaintenanceFinish.setBorder(null);
		btnAddMaintenanceFinish.setFont(UI_Elements.font_AgencyActionButton);
		btnAddMaintenanceFinish.setBackground(UI_Elements.color_mainBackgroundColor);
		btnAddMaintenanceFinish.setBounds(221, lblAddMaintenanceMaintenanceStartDate.getBounds().y+lblAddMaintenanceMaintenanceStartDate.getBounds().height+12, 75, 25);
		btnAddMaintenanceFinish.setSelected(false);
		panelMaintenance.add(btnAddMaintenanceFinish);
		btnAddMaintenanceFinish.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddMaintenanceFinish.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnAddMaintenanceFinish.setBackground(UI_Elements.color_mainBackgroundColor);
		    }
		} );
		
		btnAddMaintenanceCancel = new JButton("CANCEL");
		btnAddMaintenanceCancel.setFocusPainted(false);
		btnAddMaintenanceCancel.setRequestFocusEnabled(false);
		btnAddMaintenanceCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddMaintenanceCancel.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddMaintenanceCancel.setForeground(Color.WHITE);
		btnAddMaintenanceCancel.setOpaque(true);
		btnAddMaintenanceCancel.setBorder(null);
		btnAddMaintenanceCancel.setFont(UI_Elements.font_AgencyActionButton);
		btnAddMaintenanceCancel.setBackground(UI_Elements.color_mainBackgroundColor);
		btnAddMaintenanceCancel.setBounds(btnAddMaintenanceFinish.getBounds().x + btnAddMaintenanceFinish.getBounds().width + 7, btnAddMaintenanceFinish.getBounds().y, 75, 25);
		btnAddMaintenanceCancel.setSelected(false);
		panelMaintenance.add(btnAddMaintenanceCancel);
		btnAddMaintenanceCancel.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddMaintenanceCancel.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnAddMaintenanceCancel.setBackground(UI_Elements.color_mainBackgroundColor);
		    }
		} );
		
		addMaintenancerComponents.add(lblAddmAddMaintenanceMaintenanceName);
		addMaintenancerComponents.add(tf_AddMaintenanceMaintenanceName);
		addMaintenancerComponents.add(lblAddMaintenanceMaintenanceStartDate);
		addMaintenancerComponents.add(tf_AddMaintenanceMaintenanceStartDate);
		addMaintenancerComponents.add(lblAddMaintenancePriority);
		addMaintenancerComponents.add(tf_AddMaintenancePriority);
		addMaintenancerComponents.add(lblAddMaintenanceMaintenanceReason);
		addMaintenancerComponents.add(tf_AddMaintenanceMaintenanceReason);
		addMaintenancerComponents.add(btnAddMaintenanceFinish);
		addMaintenancerComponents.add(btnAddMaintenanceCancel);
		for(JComponent component : addMaintenancerComponents)
		{
			component.setVisible(false);
		}
		
		//Remove Sponsor
		lblRemoveMaintenanceMaintenanceName = new JLabel("Maintenance Name:");
		lblRemoveMaintenanceMaintenanceName.setBorder(null);
		lblRemoveMaintenanceMaintenanceName.setForeground(UI_Elements.color_mainBackgroundColor);
		lblRemoveMaintenanceMaintenanceName.setFont(UI_Elements.font_bodyLabel);
		lblRemoveMaintenanceMaintenanceName.setBounds(btnAddMaintenance.getBounds().x, btnAddMaintenance.getBounds().y+btnAddMaintenance.getBounds().height+20, lblAddmAddMaintenanceMaintenanceName.getBounds().width, 26);
		panelMaintenance.add(lblRemoveMaintenanceMaintenanceName);

		cb_RemoveMaintenanceMaintenanceName = new JComboBox<String>();
		cb_RemoveMaintenanceMaintenanceName.setEnabled(true);
		cb_RemoveMaintenanceMaintenanceName.setEditable(false);
		cb_RemoveMaintenanceMaintenanceName.setFont(UI_Elements.font_bodyFillText);
		cb_RemoveMaintenanceMaintenanceName.setBounds(lblAddmAddMaintenanceMaintenanceName.getBounds().x + lblAddmAddMaintenanceMaintenanceName.getBounds().width + lineSpacing, lblAddmAddMaintenanceMaintenanceName.getBounds().y, maintenanceEmployeeTableScrollPane.getBounds().width-12-lblAddmAddMaintenanceMaintenanceName.getBounds().width, 25);
		panelMaintenance.add(cb_RemoveMaintenanceMaintenanceName);

		btnRemoveMaintenanceFinish = new JButton("FINISH");
		btnRemoveMaintenanceFinish.setFocusPainted(false);
		btnRemoveMaintenanceFinish.setRequestFocusEnabled(false);
		btnRemoveMaintenanceFinish.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemoveMaintenanceFinish.setHorizontalAlignment(SwingConstants.CENTER);
		btnRemoveMaintenanceFinish.setForeground(Color.WHITE);
		btnRemoveMaintenanceFinish.setOpaque(true);
		btnRemoveMaintenanceFinish.setBorder(null);
		btnRemoveMaintenanceFinish.setFont(UI_Elements.font_AgencyActionButton);
		btnRemoveMaintenanceFinish.setBackground(UI_Elements.color_mainBackgroundColor);
		btnRemoveMaintenanceFinish.setBounds(221, lblRemoveMaintenanceMaintenanceName.getBounds().y+lblRemoveMaintenanceMaintenanceName.getBounds().height+lineSpacing, 75, 25);
		btnRemoveMaintenanceFinish.setSelected(false);
		panelMaintenance.add(btnRemoveMaintenanceFinish);
		btnRemoveMaintenanceFinish.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnRemoveMaintenanceFinish.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnRemoveMaintenanceFinish.setBackground(UI_Elements.color_mainBackgroundColor);
		    }
		} );
		
		btnRemoveMaintenanceCancel = new JButton("CANCEL");
		btnRemoveMaintenanceCancel.setFocusPainted(false);
		btnRemoveMaintenanceCancel.setRequestFocusEnabled(false);
		btnRemoveMaintenanceCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemoveMaintenanceCancel.setHorizontalAlignment(SwingConstants.CENTER);
		btnRemoveMaintenanceCancel.setForeground(Color.WHITE);
		btnRemoveMaintenanceCancel.setOpaque(true);
		btnRemoveMaintenanceCancel.setBorder(null);
		btnRemoveMaintenanceCancel.setFont(UI_Elements.font_AgencyActionButton);
		btnRemoveMaintenanceCancel.setBackground(UI_Elements.color_mainBackgroundColor);
		btnRemoveMaintenanceCancel.setBounds(btnAddMaintenanceFinish.getBounds().x + btnAddMaintenanceFinish.getBounds().width + 7, btnRemoveMaintenanceFinish.getBounds().y, 75, 25);
		btnRemoveMaintenanceCancel.setSelected(false);
		panelMaintenance.add(btnRemoveMaintenanceCancel);
		btnRemoveMaintenanceCancel.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnRemoveMaintenanceCancel.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnRemoveMaintenanceCancel.setBackground(UI_Elements.color_mainBackgroundColor);
		    }
		} );

		removeMaintenanceComponents.add(lblRemoveMaintenanceMaintenanceName);
		removeMaintenanceComponents.add(cb_RemoveMaintenanceMaintenanceName);
		removeMaintenanceComponents.add(btnRemoveMaintenanceFinish);
		removeMaintenanceComponents.add(btnRemoveMaintenanceCancel);
		for(JComponent component : removeMaintenanceComponents)
		{
			component.setVisible(false);
		}
		

		
		//Action Listeners
		btnAddMaintenance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf_AddMaintenanceMaintenanceName.setEditable(true);
				tf_AddMaintenanceMaintenanceReason.setEditable(true);
				tf_AddMaintenanceMaintenanceStartDate.setEditable(true);
				tf_AddMaintenancePriority.setEditable(true);
				
				if(btnAddMaintenance.isSelected() == false)
				{
					btnAddMaintenance.setSelected(true);
					btnRemoveMaintenance.setSelected(false);
					for(JComponent component : addMaintenancerComponents)
					{
						component.setVisible(true);
					}
					for(JComponent component : removeMaintenanceComponents)
					{
						component.setVisible(false);
					}
					btnAddMaintenance.setBackground(UI_Elements.color_panelBodyButtonSelected);
					
					btnRemoveMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
				}
				else
				{
					btnAddMaintenance.setSelected(false);
					for(JComponent component : addMaintenancerComponents)
					{
						component.setVisible(false);
					}
					btnAddMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
					btnRemoveMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
				}
			}
		});
		
		btnRemoveMaintenance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnRemoveMaintenance.isSelected() == false)
				{
					btnAddMaintenance.setSelected(false);
					btnRemoveMaintenance.setSelected(true);
					for(JComponent component : addMaintenancerComponents)
					{
						component.setVisible(false);
					}
					for(JComponent component : removeMaintenanceComponents)
					{
						component.setVisible(true);
					}
					btnAddMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
					btnRemoveMaintenance.setBackground(UI_Elements.color_panelBodyButtonSelected);
				}
				else
				{
					for(JComponent component : removeMaintenanceComponents)
					{
						component.setVisible(false);
					}
					btnRemoveMaintenance.setSelected(false);
					btnAddMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
					btnRemoveMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
				}
			}
		});
		
		btnAddMaintenanceFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(JComponent component : addMaintenancerComponents)
				{
					component.setVisible(false);
				}
				btnAddMaintenance.setSelected(false);
				btnRemoveMaintenance.setSelected(false);
				btnAddMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
				btnRemoveMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
			}
		});
		
		btnAddMaintenanceCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(JComponent component : addMaintenancerComponents)
				{
					component.setVisible(false);
				}
				btnAddMaintenance.setSelected(false);
				btnRemoveMaintenance.setSelected(false);
				btnAddMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
				btnRemoveMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
				tf_AddMaintenanceMaintenanceName.setText("");
				tf_AddMaintenanceMaintenanceReason.setText("");
				tf_AddMaintenanceMaintenanceStartDate.setText("");
				tf_AddMaintenancePriority.setText("");
			}
		});
		
		btnRemoveMaintenanceFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(JComponent component : removeMaintenanceComponents)
				{
					component.setVisible(false);
				}
				btnAddMaintenance.setSelected(false);
				btnRemoveMaintenance.setSelected(false);
				btnAddMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
				btnRemoveMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
			}
		});
		
		btnRemoveMaintenanceCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(JComponent component : removeMaintenanceComponents)
				{
					component.setVisible(false);
				}
				btnAddMaintenance.setSelected(false);
				btnRemoveMaintenance.setSelected(false);
				btnAddMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
				btnRemoveMaintenance.setBackground(UI_Elements.color_mainBackgroundColor);
				
			}
		});
		
	}
}
