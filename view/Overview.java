package view;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
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
	
	private JSeparator separatorOverview;

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
		overviewStadiumPanel.setBounds(25, 100, overviewStadiumPanel.overviewStadium.getBounds().width, overviewStadiumPanel.overviewStadium.getBounds().height);
		overviewStadiumPanel.setVisible(true);
		panelOverview.add(overviewStadiumPanel);
		overviewStadiumPanel.add(overviewStadiumPanel.panelOverviewStadium);

		separatorOverview = new JSeparator();
		separatorOverview.setOrientation(SwingConstants.VERTICAL);
		separatorOverview.setBounds(598, 26, 12, 563);
		panelOverview.add(separatorOverview);
			
	}

}
