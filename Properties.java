
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import arenaClasses.*;

public class Properties extends JPanel {


	public JPanel panelProperties;

	private JTextField tf_address;
	private JTextField tf_arenaName;
	private JTextField tf_sectionTicketPrice;
	private JTextField tf_sectionNumOfSeats;
	private JTextField tf_arenaNumOfSeats;
	private JTextField tf_TotalAttendance;
	private JTextField tf_TotalRevenue;
	private JTextField tf_TotalNumOfGameTickets;
	private JTextField tf_TotalNumOfSeasonTickets;
	private JTextField tf_TotalRevenueGameTickets;
	
	private int sectionInedex;
	private JComboBox<?> cb_sectionType;
	private JComboBox<?> cb_sectionRanking;
	private JComboBox<?> cb_sectionSelection;
	private JComboBox<?> cb_arenaType;

	private JRadioButton rdbtnIsRoofedYes;
	private JRadioButton rdbtnIsRoofedNO;

	private JButton editProperties;
	private JButton finishEditPropertiesButton;
	private JButton btnCancelEdit;
	
	private  JLabel titleProperties;
	private JLabel lblArenaName;
	private  JLabel lblArenaType;
	private  JLabel lblAddress;
	private  JLabel lblArenaNumOfSeats;
	private  JLabel lblSectionManagement;
	private  JLabel lblSectionType;
	private  JLabel lblSectionTicketPrice;
	private  JLabel lblSectionNumOfSeats;
	private  JLabel lblIsRoofed;
	private  JLabel lblSectionRanking;
	
	private  JSeparator separatorProperties;

	
	
	public Properties() {
		panelProperties = new JPanel();
		panelProperties.setBorder(null);
		panelProperties.setBackground(UI_Elements.color_mainBackgroundColor);
		panelProperties.setBounds(189, 0, 925, 617);
		panelProperties.setLayout(null);
		// STARTUP STATE
		panelProperties.setVisible(false);

		// Properties Page Title
		titleProperties = new JLabel("PROPERTIES");
		titleProperties.setVerticalAlignment(SwingConstants.TOP);
		titleProperties.setBounds(25, 22, 470, 76);
		titleProperties.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleProperties.setForeground(Color.WHITE);
		titleProperties.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, UI_Elements.textPanelTitleSize));
		panelProperties.add(titleProperties);

		lblArenaName = new JLabel("Arena Name:");
		lblArenaName.setBorder(null);
		lblArenaName.setForeground(Color.WHITE);
		lblArenaName.setFont(UI_Elements.font_bodyLabel);
		lblArenaName.setBounds(35, 103, 109, 26);
		panelProperties.add(lblArenaName);

		tf_arenaName = new JTextField(AMSFrame.getStadium().getStadiumName());
		tf_arenaName.setDisabledTextColor(Color.BLACK);
		tf_arenaName.setEnabled(false);
		tf_arenaName.setEditable(false);
		tf_arenaName.setHorizontalAlignment(SwingConstants.LEFT);
		tf_arenaName.setFont(UI_Elements.font_bodyFillText);
		tf_arenaName.setBounds(156, 103, 265, 20);
		panelProperties.add(tf_arenaName);
		tf_arenaName.setColumns(10);

		lblArenaType = new JLabel("Arena Type:");
		lblArenaType.setBorder(null);
		lblArenaType.setForeground(Color.WHITE);
		lblArenaType.setFont(UI_Elements.font_bodyLabel);
		lblArenaType.setBounds(35, 133, 109, 26);
		panelProperties.add(lblArenaType);

		cb_arenaType = new JComboBox();
		cb_arenaType.setModel(new DefaultComboBoxModel(new String[] { "Stadium" }));
		cb_arenaType.setBounds(156, 133, 265, 20);
		cb_arenaType.setFont(UI_Elements.font_bodyFillText);
		panelProperties.add(cb_arenaType);

		lblAddress = new JLabel("Address:");
		lblAddress.setBorder(null);
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(UI_Elements.font_bodyLabel);
		lblAddress.setBounds(35, 163, 109, 26);
		panelProperties.add(lblAddress);

		tf_address = new JTextField(AMSFrame.getStadium().getAddress());
		tf_address.setDisabledTextColor(Color.BLACK);
		tf_address.setEnabled(false);
		tf_address.setEditable(false);
		tf_address.setHorizontalAlignment(SwingConstants.LEFT);
		tf_address.setFont(UI_Elements.font_bodyFillText);
		tf_address.setBounds(156, 163, 265, 20);
		panelProperties.add(tf_address);
		tf_address.setColumns(10);

		lblArenaNumOfSeats = new JLabel("Num. of Seats:");
		lblArenaNumOfSeats.setBorder(null);
		lblArenaNumOfSeats.setForeground(Color.WHITE);
		lblArenaNumOfSeats.setFont(UI_Elements.font_bodyLabel);
		lblArenaNumOfSeats.setBounds(35, 193, 109, 26);
		panelProperties.add(lblArenaNumOfSeats);

		tf_arenaNumOfSeats = new JTextField(String.valueOf(AMSFrame.getStadium().getCapacity()));
		tf_arenaNumOfSeats.setDisabledTextColor(Color.BLACK);
		tf_arenaNumOfSeats.setEnabled(false);
		tf_arenaNumOfSeats.setEditable(false);
		tf_arenaNumOfSeats.setHorizontalAlignment(SwingConstants.LEFT);
		tf_arenaNumOfSeats.setFont(UI_Elements.font_bodyFillText);
		tf_arenaNumOfSeats.setBounds(156, 193, 265, 20);
		panelProperties.add(tf_arenaNumOfSeats);
		tf_arenaNumOfSeats.setColumns(10);

		separatorProperties = new JSeparator();
		separatorProperties.setBounds(35, 230, 384, 10);
		panelProperties.add(separatorProperties);

		lblSectionManagement = new JLabel("SECTION MANAGEMENT");
		lblSectionManagement.setForeground(Color.WHITE);
		lblSectionManagement.setFont(UI_Elements.font_bodyLabel);
		lblSectionManagement.setBorder(null);
		lblSectionManagement.setBounds(35, 250, 167, 26);
		panelProperties.add(lblSectionManagement);

		cb_sectionSelection = new JComboBox();
		cb_sectionSelection
				.setModel(new DefaultComboBoxModel(new String[] { AMSFrame.getStadium().getArenaSection(0).getSectionName(),
						AMSFrame.getStadium().getArenaSection(1).getSectionName(), AMSFrame.getStadium().getArenaSection(2).getSectionName(),
						AMSFrame.getStadium().getArenaSection(3).getSectionName(), AMSFrame.getStadium().getArenaSection(4).getSectionName(),
						AMSFrame.getStadium().getArenaSection(5).getSectionName(), AMSFrame.getStadium().getArenaSection(6).getSectionName(),
						AMSFrame.getStadium().getArenaSection(7).getSectionName(), AMSFrame.getStadium().getArenaSection(8).getSectionName(),
						AMSFrame.getStadium().getArenaSection(9).getSectionName(), AMSFrame.getStadium().getArenaSection(10).getSectionName(),
						AMSFrame.getStadium().getArenaSection(11).getSectionName(), AMSFrame.getStadium().getArenaSection(12).getSectionName(),
						AMSFrame.getStadium().getArenaSection(13).getSectionName(), AMSFrame.getStadium().getArenaSection(14).getSectionName(), }));
		cb_sectionSelection.setFont(UI_Elements.font_bodyFillText);
		cb_sectionSelection.setBorder(null);
		cb_sectionSelection.setBounds(35, 275, 265, 20);
		panelProperties.add(cb_sectionSelection);

		lblSectionType = new JLabel("Section Type:");
		lblSectionType.setForeground(Color.WHITE);
		lblSectionType.setFont(UI_Elements.font_bodyLabel);
		lblSectionType.setBorder(null);
		lblSectionType.setBounds(35, 315, 109, 26);
		panelProperties.add(lblSectionType);

		cb_sectionType = new JComboBox();
		cb_sectionType.setEnabled(false);
		cb_sectionType.setModel(new DefaultComboBoxModel(new String[] { "Club Level", "Bleachers", "VIP" }));
		cb_sectionType.setFont(UI_Elements.font_bodyFillText);
		cb_sectionType.setBorder(null);
		cb_sectionType.setBounds(156, 315, 265, 20);
		panelProperties.add(cb_sectionType);
		cb_sectionType.setSelectedItem(AMSFrame.getStadium().getArenaSection(0/* DO NOT CHANGE 0 VALUE */).getSectionType());
		cb_sectionType.setRenderer(new DefaultListCellRenderer() { // Send Yoni
			public void paint(Graphics g) {
				setForeground(Color.BLACK);
				super.paint(g);
			}
		});

		lblSectionTicketPrice = new JLabel("Ticket Price:");
		lblSectionTicketPrice.setBorder(null);
		lblSectionTicketPrice.setForeground(Color.WHITE);
		lblSectionTicketPrice.setFont(UI_Elements.font_bodyLabel);
		lblSectionTicketPrice.setBounds(35, 345, 109, 26);
		panelProperties.add(lblSectionTicketPrice);

		tf_sectionTicketPrice = new JTextField(String.valueOf(AMSFrame.getStadium().getArenaSection(0).getTicketPrice()));
		tf_sectionTicketPrice.setDisabledTextColor(Color.BLACK);
		tf_sectionTicketPrice.setEnabled(false);
		tf_sectionTicketPrice.setEditable(false);
		tf_sectionTicketPrice.setHorizontalAlignment(SwingConstants.LEFT);
		tf_sectionTicketPrice.setFont(UI_Elements.font_bodyFillText);
		tf_sectionTicketPrice.setBounds(156, 345, 265, 20);
		panelProperties.add(tf_sectionTicketPrice);
		tf_sectionTicketPrice.setColumns(10);

		lblSectionNumOfSeats = new JLabel("Num. of Seats:");
		lblSectionNumOfSeats.setBorder(null);
		lblSectionNumOfSeats.setForeground(Color.WHITE);
		lblSectionNumOfSeats.setFont(UI_Elements.font_bodyLabel);
		lblSectionNumOfSeats.setBounds(35, 375, 109, 26);
		panelProperties.add(lblSectionNumOfSeats);

		tf_sectionNumOfSeats = new JTextField(String.valueOf(AMSFrame.getStadium().getArenaSection(1).getNumOfSeats()));
		tf_sectionNumOfSeats.setDisabledTextColor(Color.BLACK);
		tf_sectionNumOfSeats.setEnabled(false);
		tf_sectionNumOfSeats.setEditable(false);
		tf_sectionNumOfSeats.setHorizontalAlignment(SwingConstants.LEFT);
		tf_sectionNumOfSeats.setFont(UI_Elements.font_bodyFillText);
		tf_sectionNumOfSeats.setBounds(156, 375, 265, 20);
		panelProperties.add(tf_sectionNumOfSeats);
		tf_sectionNumOfSeats.setColumns(10);

		lblIsRoofed = new JLabel("Is Roofed?:");
		lblIsRoofed.setBorder(null);
		lblIsRoofed.setForeground(Color.WHITE);
		lblIsRoofed.setFont(UI_Elements.font_bodyLabel);
		lblIsRoofed.setBounds(35, 405, 109, 26);
		panelProperties.add(lblIsRoofed);

		rdbtnIsRoofedYes = new JRadioButton("Yes");
		rdbtnIsRoofedYes.setEnabled(false);
		rdbtnIsRoofedYes.setOpaque(false);
		rdbtnIsRoofedYes.setActionCommand("");
		rdbtnIsRoofedYes.setVerticalAlignment(SwingConstants.TOP);
		rdbtnIsRoofedYes.setToolTipText("Yes");
		rdbtnIsRoofedYes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnIsRoofedYes.setForeground(Color.WHITE);
		rdbtnIsRoofedYes.setFont(UI_Elements.font_bodyFillText);
		rdbtnIsRoofedYes.setBounds(156, 405, 65, 26);
		panelProperties.add(rdbtnIsRoofedYes);

		rdbtnIsRoofedNO = new JRadioButton("No");
		rdbtnIsRoofedNO.setEnabled(false);
		rdbtnIsRoofedNO.setOpaque(false);
		rdbtnIsRoofedNO.setActionCommand("");
		rdbtnIsRoofedNO.setVerticalAlignment(SwingConstants.TOP);
		rdbtnIsRoofedNO.setToolTipText("No");
		rdbtnIsRoofedNO.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnIsRoofedNO.setForeground(Color.WHITE);
		rdbtnIsRoofedNO.setFont(UI_Elements.font_bodyFillText);
		rdbtnIsRoofedNO.setBounds(230, 405, 65, 26);
		panelProperties.add(rdbtnIsRoofedNO);

		lblSectionRanking = new JLabel("Section Ranking:");
		lblSectionRanking.setForeground(Color.WHITE);
		lblSectionRanking.setFont(UI_Elements.font_bodyLabel);
		lblSectionRanking.setBorder(null);
		lblSectionRanking.setBounds(35, 435, 109, 26);
		panelProperties.add(lblSectionRanking);

		cb_sectionRanking = new JComboBox();
		cb_sectionRanking.setEnabled(false);
		cb_sectionRanking.setModel(new DefaultComboBoxModel(new String[] { "High", "Medium", "Low" }));
		cb_sectionRanking.setFont(UI_Elements.font_bodyFillText);
		cb_sectionRanking.setBorder(null);
		cb_sectionRanking.setBounds(156, 435, 265, 20);
		panelProperties.add(cb_sectionRanking);
		cb_sectionRanking.setSelectedItem(AMSFrame.getStadium().getArenaSection(0/* DO NOT CHANGE 0 VALUE */).getSectionRanking());
		cb_sectionRanking.setRenderer(new DefaultListCellRenderer() { // Send Yoni
			public void paint(Graphics g) {
				setForeground(Color.BLACK);
				super.paint(g);
			}
		});
		//

		// Buttons:

		// Button declarations:
		editProperties = new JButton("EDIT");
		editProperties.setVisible(true);
		editProperties.setBounds(460, 103, 90, 20);
		editProperties.setFocusPainted(false);
		editProperties.setRequestFocusEnabled(false);
		editProperties.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		editProperties.setHorizontalAlignment(SwingConstants.CENTER);
		editProperties.setForeground(Color.WHITE);
		editProperties.setOpaque(true);
		editProperties.setBorder(null);
		editProperties.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 17));
		editProperties.setBackground(UI_Elements.color_panelBodyButtonDefault);
		editProperties.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				editProperties.setBackground(UI_Elements.color_panelBodyButtonRollover);
			}

			public void mouseExited(MouseEvent e) {
				editProperties.setBackground(UI_Elements.color_panelBodyButtonDefault);

			}
		});
		panelProperties.add(editProperties);

		finishEditPropertiesButton = new JButton("FINISH");
		finishEditPropertiesButton.setVisible(false);
		finishEditPropertiesButton.setBounds(460, 485, 90, 20);
		finishEditPropertiesButton.setFocusPainted(false);
		finishEditPropertiesButton.setRequestFocusEnabled(false);
		finishEditPropertiesButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		finishEditPropertiesButton.setHorizontalAlignment(SwingConstants.CENTER);
		finishEditPropertiesButton.setForeground(Color.WHITE);
		finishEditPropertiesButton.setOpaque(true);
		finishEditPropertiesButton.setBorder(null);
		finishEditPropertiesButton.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 17));
		finishEditPropertiesButton.setBackground(UI_Elements.color_panelBodyButtonDefault);
		finishEditPropertiesButton.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				finishEditPropertiesButton.setBackground(UI_Elements.color_panelBodyButtonRollover);
			}

			public void mouseExited(MouseEvent e) {
				finishEditPropertiesButton.setBackground(UI_Elements.color_panelBodyButtonDefault);

			}
		});
		panelProperties.add(finishEditPropertiesButton);

		btnCancelEdit = new JButton("CANCEL");
		btnCancelEdit.setVisible(false);
		btnCancelEdit.setBounds(460, 103, 90, 20);
		btnCancelEdit.setFocusPainted(false);
		btnCancelEdit.setRequestFocusEnabled(false);
		btnCancelEdit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelEdit.setHorizontalAlignment(SwingConstants.CENTER);
		btnCancelEdit.setForeground(Color.WHITE);
		btnCancelEdit.setOpaque(true);
		btnCancelEdit.setBorder(null);
		btnCancelEdit.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 17));
		btnCancelEdit.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnCancelEdit.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnCancelEdit.setBackground(UI_Elements.color_panelBodyButtonRollover);
			}

			public void mouseExited(MouseEvent e) {
				btnCancelEdit.setBackground(UI_Elements.color_panelBodyButtonDefault);

			}
		});
		panelProperties.add(btnCancelEdit);
		// end buttons declarations

		// Actions:
		editProperties.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editProperties.setVisible(false);
				btnCancelEdit.setVisible(true);
				finishEditPropertiesButton.setVisible(true);
				setProperties(true);
				cb_sectionSelection.setEnabled(false);
				cb_sectionSelection.setRenderer(new DefaultListCellRenderer() { // Send Yoni
					public void paint(Graphics g) {
						setForeground(Color.BLACK);
						super.paint(g);
					}
				});
			}
		});

		finishEditPropertiesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cb_sectionSelection.setEnabled(true);
				finishEditPropertiesButton.setVisible(false);
				editProperties.setVisible(true);
				btnCancelEdit.setVisible(false);

				sectionInedex = cb_sectionSelection.getSelectedIndex(); // Gets the Section we want to edit

				AMSFrame.getStadium().setStadiumName(tf_arenaName.getText());
				AMSFrame.getStadium().setAddress(tf_address.getText());
				AMSFrame.getStadium().setCapacity(Integer.valueOf(tf_arenaNumOfSeats.getText()).intValue());
				// -------------//
				AMSFrame.getStadium().getArenaSection(sectionInedex)
						.setSectionType(cb_sectionType.getModel().getSelectedItem().toString());
				AMSFrame.getStadium().getArenaSection(sectionInedex)
						.setSectionRanking(cb_sectionRanking.getModel().getSelectedItem().toString());
				AMSFrame.getStadium().getArenaSection(sectionInedex)
						.setTicketPrice(Float.valueOf(tf_sectionTicketPrice.getText()).floatValue());
				AMSFrame.getStadium().getArenaSection(sectionInedex)
						.setNumOfSeats(Integer.valueOf(tf_sectionNumOfSeats.getText()).intValue());
				if (rdbtnIsRoofedYes.isSelected()) {
					AMSFrame.getStadium().getArenaSection(sectionInedex).setRoofed(true);
				} else {
					AMSFrame.getStadium().getArenaSection(sectionInedex).setRoofed(false);
				}
				// -------------//
				setProperties(false);
			}
		});

		btnCancelEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cb_sectionSelection.setEnabled(true);
				btnCancelEdit.setVisible(false);
				editProperties.setVisible(true);
				finishEditPropertiesButton.setVisible(false);

				sectionInedex = cb_sectionSelection.getSelectedIndex(); // Gets the Section we want to edit

				tf_arenaName.setText(AMSFrame.getStadium().getStadiumName());
				tf_address.setText(AMSFrame.getStadium().getAddress());
				tf_arenaNumOfSeats.setText(String.valueOf(AMSFrame.getStadium().getCapacity()));
				// -------------//

				cb_sectionType.setSelectedItem(AMSFrame.getStadium().getArenaSection(sectionInedex).getSectionType());
				cb_sectionRanking.setSelectedItem(AMSFrame.getStadium().getArenaSection(sectionInedex).getSectionRanking());
				tf_sectionTicketPrice.setText(String.valueOf(AMSFrame.getStadium().getArenaSection(sectionInedex).getTicketPrice()));
				tf_sectionNumOfSeats.setText(String.valueOf(AMSFrame.getStadium().getArenaSection(sectionInedex).getNumOfSeats()));
				if (AMSFrame.getStadium().getArenaSection(sectionInedex).isRoofed()) {
					rdbtnIsRoofedYes.setSelected(true);
					rdbtnIsRoofedNO.setSelected(false);
				} else {
					rdbtnIsRoofedYes.setSelected(false);
					rdbtnIsRoofedNO.setSelected(true);
				}

				setProperties(false);
			}
		});

		cb_sectionSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				displaySectionDetails(cb_sectionSelection.getSelectedIndex()); // function which display the data on a
																				// given section
			}
		});

		rdbtnIsRoofedYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!rdbtnIsRoofedYes.isSelected()) {
					rdbtnIsRoofedYes.setSelected(true);
					rdbtnIsRoofedNO.setSelected(false);
				} else {
					rdbtnIsRoofedYes.setSelected(true);
					rdbtnIsRoofedNO.setSelected(false);
				}
			}
		});

		rdbtnIsRoofedNO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!rdbtnIsRoofedNO.isSelected()) {
					rdbtnIsRoofedNO.setSelected(true);
					rdbtnIsRoofedYes.setSelected(false);
				} else {
					rdbtnIsRoofedNO.setSelected(true);
					rdbtnIsRoofedYes.setSelected(false);
				}
			}
		});
		// put after cb_sectionRanking
		for (int i = 0; i < 15; i++) {
			AMSFrame.getStadium().getArenaSection(i).setSectionType(cb_sectionType.getModel().getSelectedItem().toString());

		}
		if (AMSFrame.getStadium().getArenaSection(0).isRoofed()) {
			rdbtnIsRoofedYes.setSelected(true);
		} else {
			rdbtnIsRoofedYes.setSelected(false);
		}
		if (!AMSFrame.getStadium().getArenaSection(0).isRoofed()) {
			rdbtnIsRoofedNO.setSelected(true);
		} else {
			rdbtnIsRoofedNO.setSelected(false);
		}
		for (int i = 0; i < 15; i++) {
			AMSFrame.getStadium().getArenaSection(i).setSectionRanking(cb_sectionRanking.getModel().getSelectedItem().toString());
		}
	}

	// methods:
	public void setProperties(boolean action) // Function which set the properties page by a given action (true/false)
	{
		tf_arenaName.setEnabled(action);
		tf_arenaName.setEditable(action);
		tf_address.setEnabled(action);
		tf_address.setEditable(action);
		tf_arenaNumOfSeats.setEnabled(action);
		tf_arenaNumOfSeats.setEditable(action);
		tf_sectionTicketPrice.setEnabled(action);
		tf_sectionTicketPrice.setEditable(action);
		tf_sectionNumOfSeats.setEnabled(action);
		tf_sectionNumOfSeats.setEditable(action);
		cb_sectionType.setEnabled(action);
		cb_sectionRanking.setEnabled(action);
		rdbtnIsRoofedYes.setEnabled(action);
		rdbtnIsRoofedNO.setEnabled(action);
	}

	public void displaySectionDetails(int index) {

		cb_sectionType.setSelectedItem(AMSFrame.getStadium().getArenaSection(index).getSectionType());
		cb_sectionRanking.setSelectedItem(AMSFrame.getStadium().getArenaSection(index).getSectionRanking());
		tf_sectionTicketPrice.setText(String.valueOf(AMSFrame.getStadium().getArenaSection(index).getTicketPrice()));
		tf_sectionNumOfSeats.setText(String.valueOf(AMSFrame.getStadium().getArenaSection(index).getNumOfSeats()));
		if (AMSFrame.getStadium().getArenaSection(index).isRoofed()) {
			rdbtnIsRoofedYes.setSelected(true);
			rdbtnIsRoofedNO.setSelected(false);
		} else {
			rdbtnIsRoofedYes.setSelected(false);
			rdbtnIsRoofedNO.setSelected(true);
		}

	}
	

}
