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

import model.Season;

import javax.swing.JScrollPane;

public class SalesSponsorships extends JPanel {
	
	public JPanel panelSponsorships;
	public JLabel titleSponsorships;
	
	public JScrollPane sponsorTableScrollPane;
	public JTable sponsorTable;
	public String[] colum_headers= {"Name","Contract start date","Contract end date","Contract value"};
	public String[][] sponsorsToDisplay=new String[100][4];
	
	public JButton btnAddSponsor;
	public JButton btnRemoveSponsor;
	
	private JLabel lblAddSponsorSponsorName;
	public JTextField tf_AddSponsorSponsorName;
	private JLabel lblAddSponsorContractStart;
	public JTextField tf_AddSponsorContractStart;
	private JLabel lblAddSponsorContractEnd;
	public JTextField tf_AddSponsorContractEnd;
	private JLabel lblAddSponsorContractValue;
	public JTextField tf_AddSponsorContractValue;
	public JButton btnAddSponsorFinish;
	public JButton btnAddSponsorCancel;
	
	private List<JComponent> addSponsorComponents = new ArrayList<JComponent>();
	private List<JComponent> removeSponsorComponents = new ArrayList<JComponent>();
	private JLabel lblRemoveSponsorSponsorName;
	public JComboBox<String> cb_RemoveSponsorSponsorName;
	public JButton btnRemoveSponsorFinish;
	private JButton btnRemoveSponsorCancel;


	
	public SalesSponsorships(){
		
		
		
		panelSponsorships = new JPanel();
		panelSponsorships.setBorder(null);
		panelSponsorships.setBackground(SystemColor.control);
		panelSponsorships.setBounds(0, 0, 600, 617);
		panelSponsorships.setLayout(null);
		panelSponsorships.setVisible(true);
		
		titleSponsorships = new JLabel("SPONSORSHIPS");
		titleSponsorships.setAlignmentY(Component.TOP_ALIGNMENT);
		titleSponsorships.setVerticalAlignment(SwingConstants.TOP);
		titleSponsorships.setBounds(30, 22, 346, 76);
		titleSponsorships.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleSponsorships.setForeground(UI_Elements.color_mainBackgroundColor);
		titleSponsorships.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, UI_Elements.textSubPanelTitleSize));
		panelSponsorships.add(titleSponsorships);
		
	
		//Sponsor table from DB
		sponsorTableScrollPane = new JScrollPane();
		sponsorTableScrollPane.setBounds(titleSponsorships.getBounds().x, titleSponsorships.getBounds().y+titleSponsorships.getBounds().height-20, panelSponsorships.getBounds().width-titleSponsorships.getBounds().x-40, 275);
		panelSponsorships.add(sponsorTableScrollPane);
		
		sponsorTable = new JTable(sponsorsToDisplay,colum_headers);
		sponsorTableScrollPane.setViewportView(sponsorTable);
		sponsorTable.setEnabled(false);
		
		
		
		btnAddSponsor = new JButton("ADD SPONSOR");
		btnAddSponsor.setFocusPainted(false);
		btnAddSponsor.setRequestFocusEnabled(false);
		btnAddSponsor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddSponsor.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddSponsor.setForeground(Color.WHITE);
		btnAddSponsor.setToolTipText("Tickets");
		btnAddSponsor.setOpaque(true);
		btnAddSponsor.setBorder(null);
		btnAddSponsor.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 20));
		btnAddSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
		btnAddSponsor.setBounds(sponsorTableScrollPane.getBounds().x, sponsorTableScrollPane.getBounds().y+sponsorTableScrollPane.getBounds().height+20, sponsorTableScrollPane.getBounds().width/2 - 5, 30);
		btnAddSponsor.setSelected(false);
		panelSponsorships.add(btnAddSponsor);
		btnAddSponsor.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddSponsor.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(btnAddSponsor.isSelected() == true)
		    	{
		    		btnAddSponsor.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnAddSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
		    	}
		    }
		} );
		
		btnRemoveSponsor = new JButton("REMOVE SPONSOR");
		btnRemoveSponsor.setFocusPainted(false);
		btnRemoveSponsor.setRequestFocusEnabled(false);
		btnRemoveSponsor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemoveSponsor.setHorizontalAlignment(SwingConstants.CENTER);
		btnRemoveSponsor.setForeground(Color.WHITE);
		btnRemoveSponsor.setToolTipText("Tickets");
		btnRemoveSponsor.setOpaque(true);
		btnRemoveSponsor.setBorder(null);
		btnRemoveSponsor.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 20));
		btnRemoveSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
		btnRemoveSponsor.setBounds(sponsorTableScrollPane.getBounds().x + sponsorTableScrollPane.getBounds().width - btnAddSponsor.getBounds().width, btnAddSponsor.getBounds().y, sponsorTableScrollPane.getBounds().width/2 - 5, btnAddSponsor.getBounds().height);
		btnRemoveSponsor.setSelected(false);
		panelSponsorships.add(btnRemoveSponsor);
		btnRemoveSponsor.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnRemoveSponsor.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(btnRemoveSponsor.isSelected() == true)
		    	{
		    		btnRemoveSponsor.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnRemoveSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
		    	}
		    }
		} );
		
		lblAddSponsorSponsorName = new JLabel("Sponsor Name:");
		lblAddSponsorSponsorName.setBorder(null);
		lblAddSponsorSponsorName.setForeground(UI_Elements.color_mainBackgroundColor);
		lblAddSponsorSponsorName.setFont(UI_Elements.font_bodyLabel);
		lblAddSponsorSponsorName.setBounds(btnAddSponsor.getBounds().x, btnAddSponsor.getBounds().y+btnAddSponsor.getBounds().height+20, 109, 26);
		panelSponsorships.add(lblAddSponsorSponsorName);

		tf_AddSponsorSponsorName = new JTextField();
		tf_AddSponsorSponsorName.setDisabledTextColor(Color.BLACK);
		tf_AddSponsorSponsorName.setEnabled(true);
		tf_AddSponsorSponsorName.setEditable(false);
		tf_AddSponsorSponsorName.setHorizontalAlignment(SwingConstants.LEFT);
		tf_AddSponsorSponsorName.setFont(UI_Elements.font_bodyFillText);
		tf_AddSponsorSponsorName.setBounds(lblAddSponsorSponsorName.getBounds().x + lblAddSponsorSponsorName.getBounds().width + 12, lblAddSponsorSponsorName.getBounds().y, sponsorTableScrollPane.getBounds().width-12-lblAddSponsorSponsorName.getBounds().width, 20);
		panelSponsorships.add(tf_AddSponsorSponsorName);
		tf_AddSponsorSponsorName.setColumns(10);
		
		lblAddSponsorContractValue = new JLabel("Contract Value:");
		lblAddSponsorContractValue.setBorder(null);
		lblAddSponsorContractValue.setForeground(UI_Elements.color_mainBackgroundColor);
		lblAddSponsorContractValue.setFont(UI_Elements.font_bodyLabel);
		lblAddSponsorContractValue.setBounds(lblAddSponsorSponsorName.getBounds().x, lblAddSponsorSponsorName.getBounds().y+lblAddSponsorSponsorName.getBounds().height+7, 109, 26);
		panelSponsorships.add(lblAddSponsorContractValue);

		tf_AddSponsorContractValue = new JTextField();
		tf_AddSponsorContractValue.setDisabledTextColor(Color.BLACK);
		tf_AddSponsorContractValue.setEnabled(true);
		tf_AddSponsorContractValue.setEditable(false);
		tf_AddSponsorContractValue.setHorizontalAlignment(SwingConstants.LEFT);
		tf_AddSponsorContractValue.setFont(UI_Elements.font_bodyFillText);
		tf_AddSponsorContractValue.setBounds(tf_AddSponsorSponsorName.getBounds().x, lblAddSponsorContractValue.getBounds().y , tf_AddSponsorSponsorName.getBounds().width, tf_AddSponsorSponsorName.getBounds().height);
		panelSponsorships.add(tf_AddSponsorContractValue);
		tf_AddSponsorContractValue.setColumns(10);
		
		lblAddSponsorContractStart = new JLabel("Contract Start Date:");
		lblAddSponsorContractStart.setBorder(null);
		lblAddSponsorContractStart.setForeground(UI_Elements.color_mainBackgroundColor);
		lblAddSponsorContractStart.setFont(UI_Elements.font_bodyLabel);
		lblAddSponsorContractStart.setBounds(lblAddSponsorContractValue.getBounds().x, lblAddSponsorContractValue.getBounds().y+lblAddSponsorContractValue.getBounds().height+7, 135, 26);
		panelSponsorships.add(lblAddSponsorContractStart);
	
		tf_AddSponsorContractStart = new JTextField();
		tf_AddSponsorContractStart.setDisabledTextColor(Color.BLACK);
		tf_AddSponsorContractStart.setEnabled(true);
		tf_AddSponsorContractStart.setEditable(false);
		tf_AddSponsorContractStart.setHorizontalAlignment(SwingConstants.LEFT);
		tf_AddSponsorContractStart.setFont(UI_Elements.font_bodyFillText);
		tf_AddSponsorContractStart.setBounds(tf_AddSponsorSponsorName.getBounds().x, lblAddSponsorContractStart.getBounds().y , 141, 20);
		panelSponsorships.add(tf_AddSponsorContractStart);
		tf_AddSponsorContractStart.setColumns(10);
		
		lblAddSponsorContractEnd = new JLabel("Contract End Date:");
		lblAddSponsorContractEnd.setBorder(null);
		lblAddSponsorContractEnd.setForeground(UI_Elements.color_mainBackgroundColor);
		lblAddSponsorContractEnd.setFont(UI_Elements.font_bodyLabel);
		lblAddSponsorContractEnd.setBounds(btnRemoveSponsor.getBounds().x, tf_AddSponsorContractStart.getBounds().y, 119, 26);
		panelSponsorships.add(lblAddSponsorContractEnd);

		tf_AddSponsorContractEnd = new JTextField();
		tf_AddSponsorContractEnd.setDisabledTextColor(Color.BLACK);
		tf_AddSponsorContractEnd.setEnabled(true);
		tf_AddSponsorContractEnd.setEditable(false);
		tf_AddSponsorContractEnd.setHorizontalAlignment(SwingConstants.LEFT);
		tf_AddSponsorContractEnd.setFont(UI_Elements.font_bodyFillText);
		tf_AddSponsorContractEnd.setBounds(lblAddSponsorContractEnd.getBounds().x+lblAddSponsorContractEnd.getBounds().width, lblAddSponsorContractEnd.getBounds().y , 141, 20);
		panelSponsorships.add(tf_AddSponsorContractEnd);
		tf_AddSponsorContractEnd.setColumns(10);
		
		btnAddSponsorFinish = new JButton("FINISH");
		btnAddSponsorFinish.setFocusPainted(false);
		btnAddSponsorFinish.setRequestFocusEnabled(false);
		btnAddSponsorFinish.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddSponsorFinish.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddSponsorFinish.setForeground(Color.WHITE);
		btnAddSponsorFinish.setOpaque(true);
		btnAddSponsorFinish.setBorder(null);
		btnAddSponsorFinish.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 18));
		btnAddSponsorFinish.setBackground(UI_Elements.color_mainBackgroundColor);
		btnAddSponsorFinish.setBounds(221, lblAddSponsorContractStart.getBounds().y+lblAddSponsorContractStart.getBounds().height+12, 75, 25);
		btnAddSponsorFinish.setSelected(false);
		panelSponsorships.add(btnAddSponsorFinish);
		btnAddSponsorFinish.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddSponsorFinish.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnAddSponsorFinish.setBackground(UI_Elements.color_mainBackgroundColor);
		    }
		} );
		
		btnAddSponsorCancel = new JButton("CANCEL");
		btnAddSponsorCancel.setFocusPainted(false);
		btnAddSponsorCancel.setRequestFocusEnabled(false);
		btnAddSponsorCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddSponsorCancel.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddSponsorCancel.setForeground(Color.WHITE);
		btnAddSponsorCancel.setOpaque(true);
		btnAddSponsorCancel.setBorder(null);
		btnAddSponsorCancel.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 18));
		btnAddSponsorCancel.setBackground(UI_Elements.color_mainBackgroundColor);
		btnAddSponsorCancel.setBounds(btnAddSponsorFinish.getBounds().x + btnAddSponsorFinish.getBounds().width + 7, btnAddSponsorFinish.getBounds().y, 75, 25);
		btnAddSponsorCancel.setSelected(false);
		panelSponsorships.add(btnAddSponsorCancel);
		btnAddSponsorCancel.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddSponsorCancel.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnAddSponsorCancel.setBackground(UI_Elements.color_mainBackgroundColor);
		    }
		} );
		
		addSponsorComponents.add(lblAddSponsorSponsorName);
		addSponsorComponents.add(tf_AddSponsorSponsorName);
		addSponsorComponents.add(lblAddSponsorContractStart);
		addSponsorComponents.add(tf_AddSponsorContractStart);
		addSponsorComponents.add(lblAddSponsorContractEnd);
		addSponsorComponents.add(tf_AddSponsorContractEnd);
		addSponsorComponents.add(lblAddSponsorContractValue);
		addSponsorComponents.add(tf_AddSponsorContractValue);
		addSponsorComponents.add(btnAddSponsorFinish);
		addSponsorComponents.add(btnAddSponsorCancel);
		for(JComponent component : addSponsorComponents)
		{
			component.setVisible(false);
		}
		
		//Remove Sponsor
		lblRemoveSponsorSponsorName = new JLabel("Sponsor Name:");
		lblRemoveSponsorSponsorName.setBorder(null);
		lblRemoveSponsorSponsorName.setForeground(UI_Elements.color_mainBackgroundColor);
		lblRemoveSponsorSponsorName.setFont(UI_Elements.font_bodyLabel);
		lblRemoveSponsorSponsorName.setBounds(btnAddSponsor.getBounds().x, btnAddSponsor.getBounds().y+btnAddSponsor.getBounds().height+20, 109, 26);
		panelSponsorships.add(lblRemoveSponsorSponsorName);

		cb_RemoveSponsorSponsorName = new JComboBox<String>();
		cb_RemoveSponsorSponsorName.setEnabled(true);
		cb_RemoveSponsorSponsorName.setEditable(false);
		cb_RemoveSponsorSponsorName.setFont(UI_Elements.font_bodyFillText);
		cb_RemoveSponsorSponsorName.setBounds(lblAddSponsorSponsorName.getBounds().x + lblAddSponsorSponsorName.getBounds().width + 12, lblAddSponsorSponsorName.getBounds().y, sponsorTableScrollPane.getBounds().width-12-lblAddSponsorSponsorName.getBounds().width, 25);
		panelSponsorships.add(cb_RemoveSponsorSponsorName);

		btnRemoveSponsorFinish = new JButton("FINISH");
		btnRemoveSponsorFinish.setFocusPainted(false);
		btnRemoveSponsorFinish.setRequestFocusEnabled(false);
		btnRemoveSponsorFinish.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemoveSponsorFinish.setHorizontalAlignment(SwingConstants.CENTER);
		btnRemoveSponsorFinish.setForeground(Color.WHITE);
		btnRemoveSponsorFinish.setOpaque(true);
		btnRemoveSponsorFinish.setBorder(null);
		btnRemoveSponsorFinish.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 18));
		btnRemoveSponsorFinish.setBackground(UI_Elements.color_mainBackgroundColor);
		btnRemoveSponsorFinish.setBounds(221, lblRemoveSponsorSponsorName.getBounds().y+lblRemoveSponsorSponsorName.getBounds().height+12, 75, 25);
		btnRemoveSponsorFinish.setSelected(false);
		panelSponsorships.add(btnRemoveSponsorFinish);
		btnRemoveSponsorFinish.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnRemoveSponsorFinish.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnRemoveSponsorFinish.setBackground(UI_Elements.color_mainBackgroundColor);
		    }
		} );
		
		btnRemoveSponsorCancel = new JButton("CANCEL");
		btnRemoveSponsorCancel.setFocusPainted(false);
		btnRemoveSponsorCancel.setRequestFocusEnabled(false);
		btnRemoveSponsorCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemoveSponsorCancel.setHorizontalAlignment(SwingConstants.CENTER);
		btnRemoveSponsorCancel.setForeground(Color.WHITE);
		btnRemoveSponsorCancel.setOpaque(true);
		btnRemoveSponsorCancel.setBorder(null);
		btnRemoveSponsorCancel.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 18));
		btnRemoveSponsorCancel.setBackground(UI_Elements.color_mainBackgroundColor);
		btnRemoveSponsorCancel.setBounds(btnAddSponsorFinish.getBounds().x + btnAddSponsorFinish.getBounds().width + 7, btnRemoveSponsorFinish.getBounds().y, 75, 25);
		btnRemoveSponsorCancel.setSelected(false);
		panelSponsorships.add(btnRemoveSponsorCancel);
		btnRemoveSponsorCancel.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnRemoveSponsorCancel.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnRemoveSponsorCancel.setBackground(UI_Elements.color_mainBackgroundColor);
		    }
		} );

		removeSponsorComponents.add(lblRemoveSponsorSponsorName);
		removeSponsorComponents.add(cb_RemoveSponsorSponsorName);
		removeSponsorComponents.add(btnRemoveSponsorFinish);
		removeSponsorComponents.add(btnRemoveSponsorCancel);
		for(JComponent component : removeSponsorComponents)
		{
			component.setVisible(false);
		}
		

		
		//Action Listeners
		btnAddSponsor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf_AddSponsorSponsorName.setEditable(true);
				tf_AddSponsorContractValue.setEditable(true);
				tf_AddSponsorContractStart.setEditable(true);
				tf_AddSponsorContractEnd.setEditable(true);
				
				if(btnAddSponsor.isSelected() == false)
				{
					btnAddSponsor.setSelected(true);
					btnRemoveSponsor.setSelected(false);
					for(JComponent component : addSponsorComponents)
					{
						component.setVisible(true);
					}
					for(JComponent component : removeSponsorComponents)
					{
						component.setVisible(false);
					}
					btnAddSponsor.setBackground(UI_Elements.color_panelBodyButtonSelected);
					
					btnRemoveSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
				}
				else
				{
					btnAddSponsor.setSelected(false);
					for(JComponent component : addSponsorComponents)
					{
						component.setVisible(false);
					}
					btnAddSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
					btnRemoveSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
				}
			}
		});
		
		btnRemoveSponsor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnRemoveSponsor.isSelected() == false)
				{
					btnAddSponsor.setSelected(false);
					btnRemoveSponsor.setSelected(true);
					for(JComponent component : addSponsorComponents)
					{
						component.setVisible(false);
					}
					for(JComponent component : removeSponsorComponents)
					{
						component.setVisible(true);
					}
					btnAddSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
					btnRemoveSponsor.setBackground(UI_Elements.color_panelBodyButtonSelected);
				}
				else
				{
					for(JComponent component : removeSponsorComponents)
					{
						component.setVisible(false);
					}
					btnRemoveSponsor.setSelected(false);
					btnAddSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
					btnRemoveSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
				}
			}
		});
		
		btnAddSponsorFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(JComponent component : addSponsorComponents)
				{
					component.setVisible(false);
				}
				btnAddSponsor.setSelected(false);
				btnRemoveSponsor.setSelected(false);
				btnAddSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
				btnRemoveSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
			}
		});
		
		btnAddSponsorCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(JComponent component : addSponsorComponents)
				{
					component.setVisible(false);
				}
				btnAddSponsor.setSelected(false);
				btnRemoveSponsor.setSelected(false);
				btnAddSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
				btnRemoveSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
				tf_AddSponsorSponsorName.setText("");
				tf_AddSponsorContractValue.setText("");
				tf_AddSponsorContractStart.setText("");
				tf_AddSponsorContractEnd.setText("");
			}
		});
		
		btnRemoveSponsorFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(JComponent component : removeSponsorComponents)
				{
					component.setVisible(false);
				}
				btnAddSponsor.setSelected(false);
				btnRemoveSponsor.setSelected(false);
				btnAddSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
				btnRemoveSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
			}
		});
		
		btnRemoveSponsorCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(JComponent component : removeSponsorComponents)
				{
					component.setVisible(false);
				}
				btnAddSponsor.setSelected(false);
				btnRemoveSponsor.setSelected(false);
				btnAddSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
				btnRemoveSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
				
			}
		});
		
		
	}
}
