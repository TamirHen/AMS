package view;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Facilities extends JPanel {
	
	public  JPanel panelFacilities;
	private  JLabel titleFacilities;
	
	public Facilities() {
		//Facilities Panel Settings
		panelFacilities = new JPanel();
		panelFacilities.setBorder(null);
		panelFacilities.setBackground(UI_Elements.color_mainBackgroundColor);
		panelFacilities.setBounds(189, 0, 925, 617);
		panelFacilities.setLayout(null);
		//STARTUP STATE
		panelFacilities.setVisible(false);
		
		//Facilities Page Title
		titleFacilities = new JLabel("FACILITIES");
		titleFacilities.setVerticalAlignment(SwingConstants.TOP);
		titleFacilities.setBounds(25, 22, 470, 76);
		titleFacilities.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleFacilities.setForeground(Color.WHITE);
		titleFacilities.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, UI_Elements.textPanelTitleSize));
		panelFacilities.add(titleFacilities);
	}

}
