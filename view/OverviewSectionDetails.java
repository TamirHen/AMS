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


public class OverviewSectionDetails extends JPanel {
	
	public JPanel panelSectionDetails;
	private JLabel titleSectionDetails;
	private JLabel lblSectionNumber;
	private JLabel lblSectionRanking;
	private JTextField tf_SectionRanking;
	private JLabel lblSectionType;
	private JTextField tf_SectionType;
	private JLabel lblTicketPrice;
	private JTextField tf_TicketPrice;
	private JLabel lblCapacity;
	private JTextField tf_Capacity;
	private JLabel lblIsRoofed;

	private int lineSpacing = 11;
	private JTextField tf_IsRoofed;
	
	public OverviewSectionDetails() {
		setBackground(UI_Elements.color_mainBackgroundColor);

		panelSectionDetails = new JPanel();
		panelSectionDetails.setBorder(null);
		panelSectionDetails.setBackground(SystemColor.control);
		panelSectionDetails.setBounds(0, 0, 329, 617);
		panelSectionDetails.setLayout(null);
		panelSectionDetails.setVisible(false);

		titleSectionDetails = new JLabel("SECTION DETAILS");
		titleSectionDetails.setHorizontalAlignment(SwingConstants.LEFT);
		titleSectionDetails.setAlignmentY(Component.TOP_ALIGNMENT);
		titleSectionDetails.setVerticalAlignment(SwingConstants.TOP);
		titleSectionDetails.setBounds(35, 22, 294, 36);
		titleSectionDetails.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleSectionDetails.setForeground(UI_Elements.color_mainBackgroundColor);
		titleSectionDetails.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, UI_Elements.textSubPanelTitleSize));
		panelSectionDetails.add(titleSectionDetails);
		
		lblSectionNumber = new JLabel("SECTION X");
		lblSectionNumber.setVerticalAlignment(SwingConstants.TOP);
		lblSectionNumber.setBounds(titleSectionDetails.getBounds().x, titleSectionDetails.getBounds().y+titleSectionDetails.getBounds().height+25, 265, 26);
		lblSectionNumber.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblSectionNumber.setForeground(UI_Elements.color_mainBackgroundColor);
		lblSectionNumber.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, 23));
		panelSectionDetails.add(lblSectionNumber);
		
		lblSectionRanking = new JLabel("Section Ranking:");
		lblSectionRanking.setBorder(null);
		lblSectionRanking.setForeground(UI_Elements.color_mainBackgroundColor);
		lblSectionRanking.setFont(UI_Elements.font_bodyOverviewSectionDetailsBold);
		lblSectionRanking.setBounds(lblSectionNumber.getBounds().x, lblSectionNumber.getBounds().y+lblSectionNumber.getBounds().height+lineSpacing*3, 135, 20);
		panelSectionDetails.add(lblSectionRanking);
		
		tf_SectionRanking = new JTextField("High");
		tf_SectionRanking.setBorder(null);
		tf_SectionRanking.setOpaque(false);
		tf_SectionRanking.setBounds(lblSectionRanking.getBounds().x+lblSectionRanking.getBounds().width+25, lblSectionRanking.getBounds().y, 150, 20);
		tf_SectionRanking.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_SectionRanking.setEnabled(true);
		tf_SectionRanking.setEditable(false);
		tf_SectionRanking.setHorizontalAlignment(SwingConstants.LEFT);
		tf_SectionRanking.setFont(UI_Elements.font_bodyOverviewSectionDetails);
		panelSectionDetails.add(tf_SectionRanking);
	
		lblSectionType = new JLabel("Section Type:");
		lblSectionType.setBorder(null);
		lblSectionType.setForeground(UI_Elements.color_mainBackgroundColor);
		lblSectionType.setFont(UI_Elements.font_bodyOverviewSectionDetailsBold);
		lblSectionType.setBounds(lblSectionRanking.getBounds().x, lblSectionRanking.getBounds().y+lblSectionRanking.getBounds().height+lineSpacing, 115, 20);
		panelSectionDetails.add(lblSectionType);
		
		tf_SectionType  = new JTextField("VIP");
		tf_SectionType.setBorder(null);
		tf_SectionType.setOpaque(false);
		tf_SectionType.setBounds(tf_SectionRanking.getBounds().x, lblSectionType.getBounds().y, 150, 20);
		tf_SectionType.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_SectionType.setEnabled(true);
		tf_SectionType.setEditable(false);
		tf_SectionType.setHorizontalAlignment(SwingConstants.LEFT);
		tf_SectionType.setFont(UI_Elements.font_bodyOverviewSectionDetails);
		panelSectionDetails.add(tf_SectionType);
		
		lblTicketPrice = new JLabel("Ticket Price:");
		lblTicketPrice.setBorder(null);
		lblTicketPrice.setForeground(UI_Elements.color_mainBackgroundColor);
		lblTicketPrice.setFont(UI_Elements.font_bodyOverviewSectionDetailsBold);
		lblTicketPrice.setBounds(lblSectionType.getBounds().x, lblSectionType.getBounds().y+lblSectionType.getBounds().height+lineSpacing, 115, 20);
		panelSectionDetails.add(lblTicketPrice);
		
		tf_TicketPrice  = new JTextField("$200");
		tf_TicketPrice.setBorder(null);
		tf_TicketPrice.setOpaque(false);
		tf_TicketPrice.setBounds(tf_SectionRanking.getBounds().x, lblTicketPrice.getBounds().y, 150, 20);
		tf_TicketPrice.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_TicketPrice.setEnabled(true);
		tf_TicketPrice.setEditable(false);
		tf_TicketPrice.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TicketPrice.setFont(UI_Elements.font_bodyOverviewSectionDetails);
		panelSectionDetails.add(tf_TicketPrice);
		
		lblCapacity = new JLabel("Capacity:");
		lblCapacity.setBorder(null);
		lblCapacity.setForeground(UI_Elements.color_mainBackgroundColor);
		lblCapacity.setFont(UI_Elements.font_bodyOverviewSectionDetailsBold);
		lblCapacity.setBounds(lblTicketPrice.getBounds().x, lblTicketPrice.getBounds().y+lblTicketPrice.getBounds().height+lineSpacing, 115, 20);
		panelSectionDetails.add(lblCapacity);
		
		tf_Capacity  = new JTextField("2,000");
		tf_Capacity.setBorder(null);
		tf_Capacity.setOpaque(false);
		tf_Capacity.setBounds(tf_SectionRanking.getBounds().x, lblCapacity.getBounds().y, 150, 20);
		tf_Capacity.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_Capacity.setEnabled(true);
		tf_Capacity.setEditable(false);
		tf_Capacity.setHorizontalAlignment(SwingConstants.LEFT);
		tf_Capacity.setFont(UI_Elements.font_bodyOverviewSectionDetails);
		panelSectionDetails.add(tf_Capacity);
		
		lblIsRoofed = new JLabel("Is Roofed?:");
		lblIsRoofed.setBorder(null);
		lblIsRoofed.setForeground(UI_Elements.color_mainBackgroundColor);
		lblIsRoofed.setFont(UI_Elements.font_bodyOverviewSectionDetailsBold);
		lblIsRoofed.setBounds(lblCapacity.getBounds().x, lblCapacity.getBounds().y+lblCapacity.getBounds().height+lineSpacing, 115, 20);
		panelSectionDetails.add(lblIsRoofed);
		
		tf_IsRoofed  = new JTextField("Yes");
		tf_IsRoofed.setBorder(null);
		tf_IsRoofed.setOpaque(false);
		tf_IsRoofed.setBounds(tf_SectionRanking.getBounds().x, lblIsRoofed.getBounds().y, 150, 20);
		tf_IsRoofed.setForeground(UI_Elements.color_mainBackgroundColor);
		tf_IsRoofed.setEnabled(true);
		tf_IsRoofed.setEditable(false);
		tf_IsRoofed.setHorizontalAlignment(SwingConstants.LEFT);
		tf_IsRoofed.setFont(UI_Elements.font_bodyOverviewSectionDetails);
		panelSectionDetails.add(tf_IsRoofed);

		
	}

}
