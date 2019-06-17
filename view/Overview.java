package view;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class Overview extends JPanel {

	public static JPanel panelOverview;
	public static JPanel panelWestGate;
	public static JPanel panelNorthGate;
	public static JPanel panelEastGate;
	public static JPanel panelSouthGate;

	
	private JLabel titleOverview;
	private JLabel titleWestGate;
	private JLabel titleNorthGate;
	private JLabel titleEastGate;
	private JLabel titleSouthGate;

	
	//private JLabel overviewStadium;
	
	private JButton btnStadiumWestGate;
	private JButton btnStadiumEastGate;
	private JButton btnStadiumNorthGate;
	private JButton btnStadiumSouthGate;
	private JButton btnStadiumPitch;
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

		/*overviewStadium = new JLabel();
		overviewStadium.setIcon(new ImageIcon(Overview.class.getResource("/Images/overviewStadium.png")));
		overviewStadium.setBorder(null);
		overviewStadium.setBounds(25, 95, 542, 436);
		panelOverview.add(overviewStadium);*/

		
		btnStadiumWestGate = new JButton();
		btnStadiumWestGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_01.png")));
		btnStadiumWestGate.setBorder(null);
		btnStadiumWestGate.setBounds(25, 110, 132, 380);
		btnStadiumWestGate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelOverview.add(btnStadiumWestGate);
		btnStadiumWestGate.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnStadiumWestGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Rollover_01.png")));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(panelWestGate.isVisible() == true)
		    	{
			    	btnStadiumWestGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Selected_01.png")));
		    	}
		    	else
		    	{
			    	btnStadiumWestGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_01.png")));
		    	}
		    }
		} );
		
		btnStadiumNorthGate = new JButton();
		btnStadiumNorthGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_02.png")));
		btnStadiumNorthGate.setBorder(null);
		btnStadiumNorthGate.setBounds(btnStadiumWestGate.getBounds().x+btnStadiumWestGate.getBounds().width, btnStadiumWestGate.getBounds().y, 259, 103);
		btnStadiumNorthGate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelOverview.add(btnStadiumNorthGate);
		btnStadiumNorthGate.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnStadiumNorthGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Rollover_02.png")));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(panelNorthGate.isVisible() == true)
		    	{
		    		btnStadiumNorthGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Selected_02.png")));
		    	}
		    	else
		    	{
		    		btnStadiumNorthGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_02.png")));
		    	}
		    }
		} );
		
		btnStadiumEastGate = new JButton();
		btnStadiumEastGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_03.png")));
		btnStadiumEastGate.setBorder(null);
		btnStadiumEastGate.setBounds(btnStadiumNorthGate.getBounds().x+btnStadiumNorthGate.getBounds().width, btnStadiumWestGate.getBounds().y, 132, 380);
		btnStadiumEastGate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelOverview.add(btnStadiumEastGate);
		btnStadiumEastGate.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnStadiumEastGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Rollover_03.png")));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(panelEastGate.isVisible() == true)
		    	{
		    		btnStadiumEastGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Selected_03.png")));
		    	}
		    	else
		    	{
		    		btnStadiumEastGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_03.png")));
		    	}
		    }
		} );
		
		btnStadiumSouthGate = new JButton();
		btnStadiumSouthGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_05.png")));
		btnStadiumSouthGate.setBorder(null);
		btnStadiumSouthGate.setBounds(btnStadiumWestGate.getBounds().x+btnStadiumWestGate.getBounds().width, btnStadiumWestGate.getBounds().y+btnStadiumWestGate.getBounds().height-btnStadiumNorthGate.getBounds().height, 259, 102);
		btnStadiumSouthGate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelOverview.add(btnStadiumSouthGate);
		btnStadiumSouthGate.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnStadiumSouthGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Rollover_05.png")));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(panelSouthGate.isVisible() == true)
		    	{
		    		btnStadiumSouthGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Selected_05.png")));
		    	}
		    	else
		    	{
		    		btnStadiumSouthGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_05.png")));
		    	}
		    }
		} );
		
		btnStadiumPitch = new JButton();
		btnStadiumPitch.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_04.png")));
		btnStadiumPitch.setBorder(null);
		btnStadiumPitch.setBounds(btnStadiumNorthGate.getBounds().x, btnStadiumWestGate.getBounds().y+btnStadiumNorthGate.getBounds().height, 259, 175);
		panelOverview.add(btnStadiumPitch);

		separatorOverview = new JSeparator();
		separatorOverview.setOrientation(SwingConstants.VERTICAL);
		separatorOverview.setBounds(598, 26, 12, 563);
		panelOverview.add(separatorOverview);
		
		// West Gate Panel
		panelWestGate = new JPanel();
		panelWestGate.setBorder(null);
		panelWestGate.setVisible(false);
		panelWestGate.setBackground(UI_Elements.color_mainBackgroundColor);
		panelWestGate.setBounds(separatorOverview.getBounds().x+separatorOverview.getBounds().width, 0, 310, 617);
		panelWestGate.setLayout(null);
		panelOverview.add(panelWestGate);
		// West Gate Panel Title
		titleWestGate = new JLabel("WEST GATE");
		titleWestGate.setHorizontalAlignment(SwingConstants.CENTER);
		titleWestGate.setVerticalAlignment(SwingConstants.TOP);
		titleWestGate.setBounds(0, 22, panelWestGate.getBounds().width, 76);
		titleWestGate.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleWestGate.setForeground(Color.WHITE);
		titleWestGate.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, UI_Elements.textSubPanelTitleSize));
		panelWestGate.add(titleWestGate);
		
		// North Gate Panel
		panelNorthGate = new JPanel();
		panelNorthGate.setBorder(null);
		panelNorthGate.setVisible(false);
		panelNorthGate.setBackground(UI_Elements.color_mainBackgroundColor);
		panelNorthGate.setBounds(separatorOverview.getBounds().x+separatorOverview.getBounds().width, 0, 310, 617);
		panelNorthGate.setLayout(null);
		panelOverview.add(panelNorthGate);
		// North Gate Panel Title
		titleNorthGate = new JLabel("NORTH GATE");
		titleNorthGate.setHorizontalAlignment(SwingConstants.CENTER);
		titleNorthGate.setVerticalAlignment(SwingConstants.TOP);
		titleNorthGate.setBounds(0, 22, panelWestGate.getBounds().width, 76);
		titleNorthGate.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleNorthGate.setForeground(Color.WHITE);
		titleNorthGate.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, UI_Elements.textSubPanelTitleSize));
		panelNorthGate.add(titleNorthGate);
		
		// East Gate Panel
		panelEastGate = new JPanel();
		panelEastGate.setBorder(null);
		panelEastGate.setVisible(false);
		panelEastGate.setBackground(UI_Elements.color_mainBackgroundColor);
		panelEastGate.setBounds(separatorOverview.getBounds().x+separatorOverview.getBounds().width, 0, 310, 617);
		panelEastGate.setLayout(null);
		panelOverview.add(panelEastGate);
		// East Gate Panel Title
		titleEastGate = new JLabel("EAST GATE");
		titleEastGate.setHorizontalAlignment(SwingConstants.CENTER);
		titleEastGate.setVerticalAlignment(SwingConstants.TOP);
		titleEastGate.setBounds(0, 22, panelWestGate.getBounds().width, 76);
		titleEastGate.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleEastGate.setForeground(Color.WHITE);
		titleEastGate.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, UI_Elements.textSubPanelTitleSize));
		panelEastGate.add(titleEastGate);
		
		// South Gate Panel
		panelSouthGate = new JPanel();
		panelSouthGate.setBorder(null);
		panelSouthGate.setVisible(false);
		panelSouthGate.setBackground(UI_Elements.color_mainBackgroundColor);
		panelSouthGate.setBounds(separatorOverview.getBounds().x+separatorOverview.getBounds().width, 0, 310, 617);
		panelSouthGate.setLayout(null);
		panelOverview.add(panelSouthGate);
		// South Gate Panel Title
		titleSouthGate = new JLabel("SOUTH GATE");
		titleSouthGate.setHorizontalAlignment(SwingConstants.CENTER);
		titleSouthGate.setVerticalAlignment(SwingConstants.TOP);
		titleSouthGate.setBounds(0, 22, panelWestGate.getBounds().width, 76);
		titleSouthGate.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleSouthGate.setForeground(Color.WHITE);
		titleSouthGate.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, UI_Elements.textSubPanelTitleSize));
		panelSouthGate.add(titleSouthGate);
		
		//Action listeners
		btnStadiumWestGate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelWestGate.setVisible(true);
				btnStadiumWestGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Selected_01.png")));
				
				panelNorthGate.setVisible(false);
				btnStadiumNorthGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_02.png")));
				
				panelEastGate.setVisible(false);
				btnStadiumEastGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_03.png")));
				
				panelSouthGate.setVisible(false);
				btnStadiumSouthGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_05.png")));						
				
				panelWestGate.revalidate();
			}
		});
		
		btnStadiumNorthGate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelWestGate.setVisible(false);
				btnStadiumWestGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_01.png")));
				
				panelNorthGate.setVisible(true);
				btnStadiumNorthGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Selected_02.png")));
				
				panelEastGate.setVisible(false);
				btnStadiumEastGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_03.png")));
				
				panelSouthGate.setVisible(false);
				btnStadiumSouthGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_05.png")));						
				
				panelNorthGate.revalidate();
			}
		});
		
		btnStadiumEastGate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelWestGate.setVisible(false);
				btnStadiumWestGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_01.png")));
				
				panelNorthGate.setVisible(false);
				btnStadiumNorthGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_02.png")));
				
				panelEastGate.setVisible(true);
				btnStadiumEastGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Selected_03.png")));
				
				panelSouthGate.setVisible(false);
				btnStadiumSouthGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_05.png")));						
				
				panelEastGate.revalidate();
			}
		});
		
		btnStadiumSouthGate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelWestGate.setVisible(false);
				btnStadiumWestGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_01.png")));
				
				panelNorthGate.setVisible(false);
				btnStadiumNorthGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_02.png")));
				
				panelEastGate.setVisible(false);
				btnStadiumEastGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Default_03.png")));
				
				panelSouthGate.setVisible(true);
				btnStadiumSouthGate.setIcon(new ImageIcon(Overview.class.getResource("/Images/Stadium_Selected_05.png")));
				
				panelSouthGate.revalidate();
			}
		});

	}

}
