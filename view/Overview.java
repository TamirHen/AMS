package view;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class Overview extends JPanel {

	public JPanel panelOverview;
	private JLabel titleOverview;
	public ViewStadium overviewStadiumPanel;
	
	private JLabel lblStadiumLegend;
	
	private ImageIcon stadiumLegend = new ImageIcon(Overview.class.getResource("/Images/StadiumLegend.png"));

	public OverviewSectionDetails sectionDetailsPanel;

	public Overview() {
		panelOverview = new JPanel();
		panelOverview.setBorder(null);
		panelOverview.setBackground(UI_Elements.color_mainBackgroundColor);
		panelOverview.setBounds(189, 0, 925, 617);
		panelOverview.setLayout(null);
		// Overview Page Title
		titleOverview = new JLabel("OVERVIEW");
		titleOverview.setVerticalAlignment(SwingConstants.TOP);
		titleOverview.setBounds(25, 22, 470, 76);
		titleOverview.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleOverview.setForeground(Color.WHITE);
		titleOverview.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, UI_Elements.textPanelTitleSize));
		panelOverview.add(titleOverview);
		
		overviewStadiumPanel = new ViewStadium();
		overviewStadiumPanel.setLayout(null);
		overviewStadiumPanel.setBounds(20, 85, overviewStadiumPanel.panelViewStadium.getBounds().width, overviewStadiumPanel.panelViewStadium.getBounds().height);
		overviewStadiumPanel.setVisible(true);
		panelOverview.add(overviewStadiumPanel);
		overviewStadiumPanel.add(overviewStadiumPanel.panelViewStadium);
		
		lblStadiumLegend = new JLabel();
		lblStadiumLegend.setBounds(overviewStadiumPanel.getBounds().x, overviewStadiumPanel.getBounds().y + overviewStadiumPanel.getBounds().height, 555, 60);
		lblStadiumLegend.setIcon(UI_Elements.scaleImageToBox(stadiumLegend, lblStadiumLegend));
		lblStadiumLegend.setOpaque(false);
		lblStadiumLegend.setBorder(null);
		panelOverview.add(lblStadiumLegend);
		
		sectionDetailsPanel = new OverviewSectionDetails();
		sectionDetailsPanel.setBounds(596, 0, sectionDetailsPanel.panelSectionDetails.getBounds().width, sectionDetailsPanel.panelSectionDetails.getBounds().height);
		sectionDetailsPanel.add(sectionDetailsPanel.panelSectionDetails);
		sectionDetailsPanel.setLayout(null);
		panelOverview.add(sectionDetailsPanel);
		overviewStadiumPanel.assignDetailsPanel(sectionDetailsPanel.panelSectionDetails);

		/*panelSectionDetails = new JPanel();
		panelSectionDetails.setBorder(null);
		panelSectionDetails.setBackground(SystemColor.control);
		panelSectionDetails.setBounds(596, 0, 329, 617);
		panelOverview.add(panelSectionDetails);
		panelSectionDetails.setLayout(null);
		panelSectionDetails.setVisible(false);*/


				
			
	}

}
