import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class Overview extends JPanel {

	public JPanel panelOverview;
	
	private JLabel titleOverview;
	private JLabel overviewStadium;
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

		overviewStadium = new JLabel();
		overviewStadium.setIcon(new ImageIcon(Overview.class.getResource("/Images/overviewStadium.png")));
		overviewStadium.setBorder(null);
		overviewStadium.setBounds(25, 100, 542, 436);
		panelOverview.add(overviewStadium);

		separatorOverview = new JSeparator();
		separatorOverview.setOrientation(SwingConstants.VERTICAL);
		separatorOverview.setBounds(598, 26, 12, 563);
		panelOverview.add(separatorOverview);

	}

}
