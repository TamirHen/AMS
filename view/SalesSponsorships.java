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

public class SalesSponsorships extends JPanel {
	
	public JPanel panelSponsorships;
	private JLabel titleSponsorships;
	
	private JScrollPane sponsorTableScrollPane;
	private JTable sponsorTable;
	private JButton btnAddSponsor;
	private JButton btnRemoveSponsor;
	private JLabel lblSponsorName;
	private JTextField tf_SponsorName;
	private JLabel lblContractLength;
	private JTextField tf_ContractLength;
	private JLabel lblContractValue;
	private JTextField tf_ContractValue;
	private JButton btnAddSponsorFinish;
	private JButton btnAddSponsorCancel;
	
	private List<JComponent> addSponsorComponents = new ArrayList<JComponent>();

	
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
		
		sponsorTable = new JTable();
		sponsorTableScrollPane.setViewportView(sponsorTable);
		//
		
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
		
		lblSponsorName = new JLabel("Sponsor Name:");
		lblSponsorName.setBorder(null);
		lblSponsorName.setForeground(UI_Elements.color_mainBackgroundColor);
		lblSponsorName.setFont(UI_Elements.font_bodyLabel);
		lblSponsorName.setBounds(btnAddSponsor.getBounds().x, btnAddSponsor.getBounds().y+btnAddSponsor.getBounds().height+20, 109, 26);
		panelSponsorships.add(lblSponsorName);

		tf_SponsorName = new JTextField();
		tf_SponsorName.setDisabledTextColor(Color.BLACK);
		tf_SponsorName.setEnabled(true);
		tf_SponsorName.setEditable(false);
		tf_SponsorName.setHorizontalAlignment(SwingConstants.LEFT);
		tf_SponsorName.setFont(UI_Elements.font_bodyFillText);
		tf_SponsorName.setBounds(lblSponsorName.getBounds().x + lblSponsorName.getBounds().width + 10, lblSponsorName.getBounds().y, sponsorTableScrollPane.getBounds().width-10-lblSponsorName.getBounds().width, 20);
		panelSponsorships.add(tf_SponsorName);
		tf_SponsorName.setColumns(10);
		
		lblContractLength = new JLabel("Contract Length:");
		lblContractLength.setBorder(null);
		lblContractLength.setForeground(UI_Elements.color_mainBackgroundColor);
		lblContractLength.setFont(UI_Elements.font_bodyLabel);
		lblContractLength.setBounds(lblSponsorName.getBounds().x, lblSponsorName.getBounds().y+lblSponsorName.getBounds().height+7, 109, 26);
		panelSponsorships.add(lblContractLength);

		tf_ContractLength = new JTextField();
		tf_ContractLength.setDisabledTextColor(Color.BLACK);
		tf_ContractLength.setEnabled(true);
		tf_ContractLength.setEditable(false);
		tf_ContractLength.setHorizontalAlignment(SwingConstants.LEFT);
		tf_ContractLength.setFont(UI_Elements.font_bodyFillText);
		tf_ContractLength.setBounds(tf_SponsorName.getBounds().x, lblContractLength.getBounds().y , tf_SponsorName.getBounds().width, tf_SponsorName.getBounds().height);
		panelSponsorships.add(tf_ContractLength);
		tf_ContractLength.setColumns(10);
		
		lblContractValue = new JLabel("Contract Value:");
		lblContractValue.setBorder(null);
		lblContractValue.setForeground(UI_Elements.color_mainBackgroundColor);
		lblContractValue.setFont(UI_Elements.font_bodyLabel);
		lblContractValue.setBounds(lblContractLength.getBounds().x, lblContractLength.getBounds().y+lblContractLength.getBounds().height+7, 109, 26);
		panelSponsorships.add(lblContractValue);

		tf_ContractValue = new JTextField();
		tf_ContractValue.setDisabledTextColor(Color.BLACK);
		tf_ContractValue.setEnabled(true);
		tf_ContractValue.setEditable(false);
		tf_ContractValue.setHorizontalAlignment(SwingConstants.LEFT);
		tf_ContractValue.setFont(UI_Elements.font_bodyFillText);
		tf_ContractValue.setBounds(tf_ContractLength.getBounds().x, lblContractValue.getBounds().y , tf_ContractLength.getBounds().width, tf_ContractLength.getBounds().height);
		panelSponsorships.add(tf_ContractValue);
		tf_ContractValue.setColumns(10);
		
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
		btnAddSponsorFinish.setBounds(221, lblContractValue.getBounds().y+lblContractValue.getBounds().height+7, 75, 25);
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

		
		addSponsorComponents.add(lblSponsorName);
		addSponsorComponents.add(tf_SponsorName);
		addSponsorComponents.add(lblContractLength);
		addSponsorComponents.add(tf_ContractLength);
		addSponsorComponents.add(lblContractValue);
		addSponsorComponents.add(tf_ContractValue);
		addSponsorComponents.add(btnAddSponsorFinish);
		addSponsorComponents.add(btnAddSponsorCancel);
		for(JComponent component : addSponsorComponents)
		{
			component.setVisible(false);
		}

		
		//Action Listeners
		btnAddSponsor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnAddSponsor.isSelected() == false)
				{
					btnAddSponsor.setSelected(true);
					btnRemoveSponsor.setSelected(false);
					for(JComponent component : addSponsorComponents)
					{
						component.setVisible(true);
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
					btnAddSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
					btnRemoveSponsor.setBackground(UI_Elements.color_panelBodyButtonSelected);
				}
				else
				{
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
				btnAddSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
				btnRemoveSponsor.setBackground(UI_Elements.color_mainBackgroundColor);
			}
		});
		
		

		
	}
}
