import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.peer.PanelPeer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import arenaClasses.*;

public class Menu extends JPanel {
	
	//---set menu panels---//
	public JPanel menuPanel;
	public JPanel overviewPanel;
	//---------------------//

	private JLabel HeaderBG;
	private JButton btnOverview;
	private JButton btnProperties;
	private JButton btnSales;
	private JButton btnFacilities;

	public Menu() {
		
		menuPanel = new JPanel();
		
		menuPanel.setBackground(UI_Elements.color_menuBar);
		menuPanel.setBounds(0, 0, 1114, 600);
		menuPanel.setLayout(null);

		HeaderBG = new JLabel();
		HeaderBG.setIcon(new ImageIcon(Menu.class.getResource("/Images/logoHeader.png")));
		HeaderBG.setBorder(null);
		HeaderBG.setBackground(new Color(28, 23, 92));
		HeaderBG.setBounds(0, 0, 190, 100);
		menuPanel.add(HeaderBG);

		btnOverview = new JButton("OVERVIEW");
		btnOverview.setAlignmentY(0.0f);
		btnOverview.setFocusPainted(false);
		btnOverview.setRequestFocusEnabled(false);
		btnOverview.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOverview.setHorizontalAlignment(SwingConstants.CENTER);
		btnOverview.setForeground(UI_Elements.color_menuButtonText);
		btnOverview.setOpaque(true);
		btnOverview.setBorder(null);
		btnOverview.setFont(UI_Elements.font_menuButtonTextDefault);
		btnOverview.setBackground(UI_Elements.color_menuButtonSelected);
		btnOverview.setBounds(0, 100, 189, 40);
		btnOverview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainLogin.overviewPanel.panelOverview.setVisible(true);
				btnOverview.setBackground(UI_Elements.color_menuButtonSelected);
				MainLogin.propertiesPanel.panelProperties.setVisible(false);
				btnProperties.setBackground(UI_Elements.color_menuBar);
				MainLogin.salesPanel.panelSales.setVisible(false);
				btnSales.setBackground(UI_Elements.color_menuBar);
				MainLogin.facilitiesPanel.panelFacilities.setVisible(false);
				btnFacilities.setBackground(UI_Elements.color_menuBar);
			}
		});
		menuPanel.add(btnOverview);

		btnProperties = new JButton("PROPERTIES");
		btnProperties.setAlignmentY(0.0f);
		btnProperties.setFocusPainted(false);
		btnProperties.setRequestFocusEnabled(false);
		btnProperties.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProperties.setHorizontalAlignment(SwingConstants.CENTER);
		btnProperties.setForeground(UI_Elements.color_menuButtonText);
		btnProperties.setOpaque(true);
		btnProperties.setBorder(null);
		btnProperties.setFont(UI_Elements.font_menuButtonTextDefault);
		btnProperties.setBackground(UI_Elements.color_menuBar);
		btnProperties.setBounds(0, (btnOverview.getBounds().y) + 40, 189, 40);
		btnProperties.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainLogin.overviewPanel.panelOverview.setVisible(false);
				btnOverview.setBackground(UI_Elements.color_menuBar);
				MainLogin.propertiesPanel.panelProperties.setVisible(true);
				btnProperties.setBackground(UI_Elements.color_menuButtonSelected);
				MainLogin.salesPanel.panelSales.setVisible(false);
				btnSales.setBackground(UI_Elements.color_menuBar);
				MainLogin.facilitiesPanel.panelFacilities.setVisible(false);
				btnFacilities.setBackground(UI_Elements.color_menuBar);
			}
		});
		menuPanel.add(btnProperties);

		btnSales = new JButton("SALES");
		btnSales.setAlignmentY(0.0f);
		btnSales.setFocusPainted(false);
		btnSales.setRequestFocusEnabled(false);
		btnSales.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSales.setHorizontalAlignment(SwingConstants.CENTER);
		btnSales.setForeground(UI_Elements.color_menuButtonText);
		btnSales.setOpaque(true);
		btnSales.setBorder(null);
		btnSales.setFont(UI_Elements.font_menuButtonTextDefault);
		btnSales.setBackground(UI_Elements.color_menuBar);
		btnSales.setBounds(0, (btnOverview.getBounds().y) + 40 * 2, 189, 40);
		btnSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainLogin.overviewPanel.panelOverview.setVisible(false);
				btnOverview.setBackground(UI_Elements.color_menuBar);
				MainLogin.propertiesPanel.panelProperties.setVisible(false);
				btnProperties.setBackground(UI_Elements.color_menuBar);
				MainLogin.salesPanel.panelSales.setVisible(true);
				btnSales.setBackground(UI_Elements.color_menuButtonSelected);
				MainLogin.facilitiesPanel.panelFacilities.setVisible(false);
				btnFacilities.setBackground(UI_Elements.color_menuBar);
			}
		});
		menuPanel.add(btnSales);

		btnFacilities = new JButton("FACILITIES");
		btnFacilities.setAlignmentY(0.0f);
		btnFacilities.setFocusPainted(false);
		btnFacilities.setRequestFocusEnabled(false);
		btnFacilities.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFacilities.setHorizontalAlignment(SwingConstants.CENTER);
		btnFacilities.setForeground(UI_Elements.color_menuButtonText);
		btnFacilities.setOpaque(true);
		btnFacilities.setBorder(null);
		btnFacilities.setFont(UI_Elements.font_menuButtonTextDefault);
		btnFacilities.setBackground(UI_Elements.color_menuBar);
		btnFacilities.setBounds(0, (btnOverview.getBounds().y) + 40 * 3, 189, 40);
		btnFacilities.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			MainLogin.overviewPanel.panelOverview.setVisible(false);
			btnOverview.setBackground(UI_Elements.color_menuBar);
			MainLogin.propertiesPanel.panelProperties.setVisible(false);
			btnProperties.setBackground(UI_Elements.color_menuBar);
			MainLogin.salesPanel.panelSales.setVisible(false);
			btnSales.setBackground(UI_Elements.color_menuBar);
			MainLogin.facilitiesPanel.panelFacilities.setVisible(true);
			btnFacilities.setBackground(UI_Elements.color_menuButtonSelected);
		}
	});
		menuPanel.add(btnFacilities);

	}

}
