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
	public OverviewStadium overviewStadiumPanel;
	
	private JLabel lblStadiumLegend;
	
	private ImageIcon stadiumLegend = new ImageIcon(Overview.class.getResource("/Images/StadiumLegend.png"));
	private JSeparator separatorOverview;
	private JPanel panelSectionDetails;
	private JLabel titleSectionDetails;

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
		
		overviewStadiumPanel = new OverviewStadium();
		overviewStadiumPanel.setLayout(null);
		overviewStadiumPanel.setBounds(20, 85, overviewStadiumPanel.panelOverviewStadium.getBounds().width, overviewStadiumPanel.panelOverviewStadium.getBounds().height);
		overviewStadiumPanel.setVisible(true);
		panelOverview.add(overviewStadiumPanel);
		overviewStadiumPanel.add(overviewStadiumPanel.panelOverviewStadium);
		
		lblStadiumLegend = new JLabel();
		lblStadiumLegend.setBounds(20, overviewStadiumPanel.getBounds().y + overviewStadiumPanel.getBounds().height, 555, 60);
		lblStadiumLegend.setIcon(UI_Elements.scaleImageTolabel(stadiumLegend, lblStadiumLegend));
		lblStadiumLegend.setOpaque(false);
		lblStadiumLegend.setBorder(null);
		panelOverview.add(lblStadiumLegend);

		panelSectionDetails = new JPanel();
		panelSectionDetails.setBorder(null);
		panelSectionDetails.setBackground(SystemColor.control);
		panelSectionDetails.setBounds(596, 0, 329, 617);
		panelOverview.add(panelSectionDetails);
		panelSectionDetails.setLayout(null);
		panelSectionDetails.setVisible(false);

		titleSectionDetails = new JLabel("SECTION DETAILS");
		titleSectionDetails.setHorizontalAlignment(SwingConstants.CENTER);
		titleSectionDetails.setAlignmentY(Component.TOP_ALIGNMENT);
		titleSectionDetails.setVerticalAlignment(SwingConstants.TOP);
		titleSectionDetails.setBounds(0, 22, 345, 76);
		titleSectionDetails.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleSectionDetails.setForeground(UI_Elements.color_mainBackgroundColor);
		titleSectionDetails.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, UI_Elements.textSubPanelTitleSize));
		panelSectionDetails.add(titleSectionDetails);
		
		panelOverview.addMouseListener(new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				if(overviewStadiumPanel.numOfSelected != 0)
				{
					panelSectionDetails.setVisible(true);
				};
		    }
		});
		
			
	}

}
