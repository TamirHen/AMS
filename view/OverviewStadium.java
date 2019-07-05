package view;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import model.Stadium;

public class OverviewStadium extends JPanel {
	
	public JPanel panelOverviewStadium;
	public JLabel overviewStadium;
	private ImageIcon stadium = new ImageIcon(Overview.class.getResource("/Images/Stadium.png"));
	
	public JButton overviewStadium_02;
	public JButton overviewStadium_03;
	public JButton overviewStadium_04;
	public JButton overviewStadium_05;
	public JButton overviewStadium_06;
	public JButton overviewStadium_07;
	public JButton overviewStadium_08;
	public JButton overviewStadium_10;
	public JButton overviewStadium_11;
	public JButton overviewStadium_12;
	public JButton overviewStadium_13;
	public JButton overviewStadium_14;
	public JButton overviewStadium_15;
	public JButton overviewStadium_16;
	public JButton overviewStadium_19;
	public JButton overviewStadium_22;
	public JButton overviewStadium_23;
	public JButton overviewStadium_24;
	public JButton overviewStadium_25;
	public JButton overviewStadium_26;
	public JButton overviewStadium_27;
	public JButton overviewStadium_28;
	public JButton overviewStadium_29;
	public JButton overviewStadium_34;
	public JButton overviewStadium_35;
	public JButton overviewStadium_36;
	public JButton overviewStadium_37;
	public JButton overviewStadium_38;
	public JButton overviewStadium_39;
	public JButton overviewStadium_40;
	public JButton overviewStadium_41;
	public JButton overviewStadium_42;
	public JButton overviewStadium_43;
	public JButton overviewStadium_44;
	public JButton overviewStadium_45;
	public JButton overviewStadium_46;
	public JButton overviewStadium_47;
	public JButton overviewStadium_48;
	public JButton overviewStadium_49;
	public JButton overviewStadium_50;
	public JButton overviewStadium_51;
	public JButton overviewStadium_52;
	public JButton overviewStadium_53;
	public JButton overviewStadium_54;
	public JButton overviewStadium_55;
	
	private double stadiumLblHeight = 412;
	private double stadiumSizeRatio = (stadiumLblHeight/stadium.getIconHeight());
	private double stadiumLblWidth = ((stadium.getIconWidth())*stadiumSizeRatio);	
	
	public int numOfSelected = 0;
	public JButton lastSelectedButton;
	private MouseAdapter lastButtonMouseAdapter;
	
	public int totalStadiumHeight = 0;
	public int totalStaiumWidth = 0;
	
	
	public OverviewStadium()
	{
	
		panelOverviewStadium = new JPanel();
		panelOverviewStadium.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panelOverviewStadium.setBorder(null);
		panelOverviewStadium.setLayout(null);
		panelOverviewStadium.setBackground(UI_Elements.color_mainBackgroundColor);	
		panelOverviewStadium.setBounds(0, 0, (int)stadiumLblWidth, (int)stadiumLblHeight);		
		
		overviewStadium_49 = new JButton();
		overviewStadium_49.setContentAreaFilled(false);
		overviewStadium_49.setOpaque(false);
		overviewStadium_49.setName("49");
		overviewStadium_49.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_49.setBorderPainted(false);
		overviewStadium_49.setFocusPainted(false);
		overviewStadium_49.setBorder(null);
		String path49 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(49) + "_49.png";
		ImageIcon img49 = new ImageIcon(Overview.class.getResource(path49));
		overviewStadium_49.setBounds(panelOverviewStadium.getBounds().x + (int)(535*stadiumSizeRatio), panelOverviewStadium.getBounds().y + (int)(451*stadiumSizeRatio) , (int)(img49.getIconWidth()*stadiumSizeRatio), (int)(img49.getIconHeight()*stadiumSizeRatio));
		overviewStadium_49.setIcon(UI_Elements.scaleImageToButton(img49, overviewStadium_49));
		panelOverviewStadium.add(overviewStadium_49);
		String path49_R = "/Images/StadiumSlices/Stadium_Rollover_49.png";
		ImageIcon img49_R = new ImageIcon(Overview.class.getResource(path49_R));
		String path49_S = "/Images/StadiumSlices/Stadium_Selected_49.png";
		ImageIcon img49_S = new ImageIcon(Overview.class.getResource(path49_S));
		MouseAdapter ma49 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_49.setIcon(UI_Elements.scaleImageToButton(img49_R, overviewStadium_49));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_49.isSelected() != true)
		    	{
		    		overviewStadium_49.setIcon(UI_Elements.scaleImageToButton(img49, overviewStadium_49));
		    	}
		    	else
		    	{
		    		overviewStadium_49.setIcon(UI_Elements.scaleImageToButton(img49_S, overviewStadium_49));
		    	}
		    }
		};
		overviewStadium_49.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_49, ma49, img49_S);
			}
		});
		overviewStadium_49.addMouseListener(ma49);

		
		
		overviewStadium_19 = new JButton();
		overviewStadium_19.setContentAreaFilled(false);
		overviewStadium_19.setOpaque(false);
		overviewStadium_19.setName("19");
		overviewStadium_19.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_19.setBorderPainted(false);
		overviewStadium_19.setFocusPainted(false);
		overviewStadium_19.setBorder(null);
		String path19 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(19) + "_19.png";
		ImageIcon img19 = new ImageIcon(Overview.class.getResource(path19));
		overviewStadium_19.setBounds(overviewStadium_49.getBounds().x, overviewStadium_49.getBounds().y + overviewStadium_49.getBounds().height, (int)(img19.getIconWidth()*stadiumSizeRatio), (int)(img19.getIconHeight()*stadiumSizeRatio));
		overviewStadium_19.setIcon(UI_Elements.scaleImageToButton(img19, overviewStadium_19));
		panelOverviewStadium.add(overviewStadium_19);
		String path19_R = "/Images/StadiumSlices/Stadium_Rollover_19.png";
		ImageIcon img19_R = new ImageIcon(Overview.class.getResource(path19_R));
		String path19_S = "/Images/StadiumSlices/Stadium_Selected_19.png";
		ImageIcon img19_S = new ImageIcon(Overview.class.getResource(path19_S));
		MouseAdapter ma19 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_19.setIcon(UI_Elements.scaleImageToButton(img19_R, overviewStadium_19));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_19.isSelected() != true)
		    	{
		    		overviewStadium_19.setIcon(UI_Elements.scaleImageToButton(img19, overviewStadium_19));
		    	}
		    	else
		    	{
		    		overviewStadium_19.setIcon(UI_Elements.scaleImageToButton(img19_S, overviewStadium_19));
		    	}
		    }
		};
		overviewStadium_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_19, ma19, img19_S);
			}
		});
		overviewStadium_19.addMouseListener(ma19);
		
		
		overviewStadium_26 = new JButton();
		overviewStadium_26.setContentAreaFilled(false);
		overviewStadium_26.setOpaque(false);
		overviewStadium_26.setName("26");
		overviewStadium_26.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_26.setBorderPainted(false);
		overviewStadium_26.setFocusPainted(false);
		overviewStadium_26.setBorder(null);
		String path26 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(26) + "_26.png";
		ImageIcon img26 = new ImageIcon(Overview.class.getResource(path26));
		overviewStadium_26.setBounds(overviewStadium_19.getBounds().x, overviewStadium_19.getBounds().y + overviewStadium_19.getBounds().height, (int)(img26.getIconWidth()*stadiumSizeRatio), (int)(img26.getIconHeight()*stadiumSizeRatio));
		overviewStadium_26.setIcon(UI_Elements.scaleImageToButton(img26, overviewStadium_26));
		panelOverviewStadium.add(overviewStadium_26);
		String path26_R = "/Images/StadiumSlices/Stadium_Rollover_26.png";
		ImageIcon img26_R = new ImageIcon(Overview.class.getResource(path26_R));
		String path26_S = "/Images/StadiumSlices/Stadium_Selected_26.png";
		ImageIcon img26_S = new ImageIcon(Overview.class.getResource(path26_S));
		MouseAdapter ma26 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_26.setIcon(UI_Elements.scaleImageToButton(img26_R, overviewStadium_26));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_26.isSelected() != true)
		    	{
		    		overviewStadium_26.setIcon(UI_Elements.scaleImageToButton(img26, overviewStadium_26));
		    	}
		    	else
		    	{
		    		overviewStadium_26.setIcon(UI_Elements.scaleImageToButton(img26_S, overviewStadium_26));
		    	}
		    }
		};
		overviewStadium_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_26, ma26, img26_S);
			}
		});
		overviewStadium_26.addMouseListener(ma26);
		
		
		overviewStadium_28 = new JButton();
		overviewStadium_28.setContentAreaFilled(false);
		overviewStadium_28.setOpaque(false);
		overviewStadium_28.setName("28");
		overviewStadium_28.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_28.setBorderPainted(false);
		overviewStadium_28.setFocusPainted(false);
		overviewStadium_28.setBorder(null);
		String path28 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(28) + "_28.png";
		ImageIcon img28 = new ImageIcon(Overview.class.getResource(path28));
		overviewStadium_28.setBounds(overviewStadium_26.getBounds().x, overviewStadium_26.getBounds().y + overviewStadium_26.getBounds().height, (int)(img28.getIconWidth()*stadiumSizeRatio), (int)(img28.getIconHeight()*stadiumSizeRatio));
		overviewStadium_28.setIcon(UI_Elements.scaleImageToButton(img28, overviewStadium_28));
		panelOverviewStadium.add(overviewStadium_28);
		String path28_R = "/Images/StadiumSlices/Stadium_Rollover_28.png";
		ImageIcon img28_R = new ImageIcon(Overview.class.getResource(path28_R));
		String path28_S = "/Images/StadiumSlices/Stadium_Selected_28.png";
		ImageIcon img28_S = new ImageIcon(Overview.class.getResource(path28_S));
		MouseAdapter ma28 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_28.setIcon(UI_Elements.scaleImageToButton(img28_R, overviewStadium_28));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_28.isSelected() != true)
		    	{
		    		overviewStadium_28.setIcon(UI_Elements.scaleImageToButton(img28, overviewStadium_28));
		    	}
		    	else
		    	{
		    		overviewStadium_28.setIcon(UI_Elements.scaleImageToButton(img28_S, overviewStadium_28));
		    	}
		    }
		};
		overviewStadium_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_28, ma28, img28_S);
			}
		});
		overviewStadium_28.addMouseListener(ma28);
		
		
		overviewStadium_51 = new JButton();
		overviewStadium_51.setContentAreaFilled(false);
		overviewStadium_51.setOpaque(false);
		overviewStadium_51.setName("51");
		overviewStadium_51.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_51.setBorderPainted(false);
		overviewStadium_51.setFocusPainted(false);
		overviewStadium_51.setBorder(null);
		String path51 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(51) + "_51.png";
		ImageIcon img51 = new ImageIcon(Overview.class.getResource(path51));
		overviewStadium_51.setBounds(overviewStadium_26.getBounds().x, overviewStadium_28.getBounds().y + overviewStadium_28.getBounds().height, (int)(img51.getIconWidth()*stadiumSizeRatio), (int)(img51.getIconHeight()*stadiumSizeRatio));
		overviewStadium_51.setIcon(UI_Elements.scaleImageToButton(img51, overviewStadium_51));
		panelOverviewStadium.add(overviewStadium_51);
		String path51_R = "/Images/StadiumSlices/Stadium_Rollover_51.png";
		ImageIcon img51_R = new ImageIcon(Overview.class.getResource(path51_R));
		String path51_S = "/Images/StadiumSlices/Stadium_Selected_51.png";
		ImageIcon img51_S = new ImageIcon(Overview.class.getResource(path51_S));
		MouseAdapter ma51 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_51.setIcon(UI_Elements.scaleImageToButton(img51_R, overviewStadium_51));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_51.isSelected() != true)
		    	{
		    		overviewStadium_51.setIcon(UI_Elements.scaleImageToButton(img51, overviewStadium_51));
		    	}
		    	else
		    	{
		    		overviewStadium_51.setIcon(UI_Elements.scaleImageToButton(img51_S, overviewStadium_51));
		    	}
		    }
		};
		overviewStadium_51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_51, ma51, img51_S);
			}
		});
		overviewStadium_51.addMouseListener(ma51);
		
		
		overviewStadium_48 = new JButton();
		overviewStadium_48.setContentAreaFilled(false);
		overviewStadium_48.setOpaque(false);
		overviewStadium_48.setName("48");
		overviewStadium_48.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_48.setBorderPainted(false);
		overviewStadium_48.setFocusPainted(false);
		overviewStadium_48.setBorder(null);
		String path48 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(48) + "_48.png";
		ImageIcon img48 = new ImageIcon(Overview.class.getResource(path48));
		overviewStadium_48.setBounds(panelOverviewStadium.getBounds().x, panelOverviewStadium.getBounds().y, (int)(img48.getIconWidth()*stadiumSizeRatio), (int)(img48.getIconHeight()*stadiumSizeRatio));
		overviewStadium_48.setIcon(UI_Elements.scaleImageToButton(img48, overviewStadium_48));
		panelOverviewStadium.add(overviewStadium_48);
		String path48_R = "/Images/StadiumSlices/Stadium_Rollover_48.png";
		ImageIcon img48_R = new ImageIcon(Overview.class.getResource(path48_R));
		String path48_S = "/Images/StadiumSlices/Stadium_Selected_48.png";
		ImageIcon img48_S = new ImageIcon(Overview.class.getResource(path48_S));
		MouseAdapter ma48 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_48.setIcon(UI_Elements.scaleImageToButton(img48_R, overviewStadium_48));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_48.isSelected() != true)
		    	{
		    		overviewStadium_48.setIcon(UI_Elements.scaleImageToButton(img48, overviewStadium_48));
		    	}
		    	else
		    	{
		    		overviewStadium_48.setIcon(UI_Elements.scaleImageToButton(img48_S, overviewStadium_48));
		    	}
		    }
		};
		overviewStadium_48.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_48, ma48, img48_S);
			}
		});
		overviewStadium_48.addMouseListener(ma48);
		
		
		overviewStadium_02 = new JButton();
		overviewStadium_02.setContentAreaFilled(false);
		overviewStadium_02.setOpaque(false);
		overviewStadium_02.setName("2");
		overviewStadium_02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_02.setBorderPainted(false);
		overviewStadium_02.setFocusPainted(false);
		overviewStadium_02.setBorder(null);
		String path02 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(2) + "_02.png";
		ImageIcon img02 = new ImageIcon(Overview.class.getResource(path02));
		overviewStadium_02.setBounds(overviewStadium_48.getBounds().x + overviewStadium_48.getBounds().width, panelOverviewStadium.getBounds().y, (int)(img02.getIconWidth()*stadiumSizeRatio), (int)(img02.getIconHeight()*stadiumSizeRatio));
		overviewStadium_02.setIcon(UI_Elements.scaleImageToButton(img02, overviewStadium_02));
		panelOverviewStadium.add(overviewStadium_02);
		String path02_R = "/Images/StadiumSlices/Stadium_Rollover_02.png";
		ImageIcon img02_R = new ImageIcon(Overview.class.getResource(path02_R));
		String path02_S = "/Images/StadiumSlices/Stadium_Selected_02.png";
		ImageIcon img02_S = new ImageIcon(Overview.class.getResource(path02_S));
		MouseAdapter ma02 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_02.setIcon(UI_Elements.scaleImageToButton(img02_R, overviewStadium_02));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_02.isSelected() != true)
		    	{
		    		overviewStadium_02.setIcon(UI_Elements.scaleImageToButton(img02, overviewStadium_02));
		    	}
		    	else
		    	{
		    		overviewStadium_02.setIcon(UI_Elements.scaleImageToButton(img02_S, overviewStadium_02));
		    	}
		    }
		};
		overviewStadium_02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_02, ma02, img02_S);
			}
		});
		overviewStadium_02.addMouseListener(ma02);
		
		overviewStadium_03 = new JButton();
		overviewStadium_03.setContentAreaFilled(false);
		overviewStadium_03.setOpaque(false);
		overviewStadium_03.setName("3");
		overviewStadium_03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_03.setBorderPainted(false);
		overviewStadium_03.setFocusPainted(false);
		overviewStadium_03.setBorder(null);
		String path03 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(3) + "_03.png";
		ImageIcon img03 = new ImageIcon(Overview.class.getResource(path03));
		overviewStadium_03.setBounds(overviewStadium_02.getBounds().x + overviewStadium_02.getBounds().width, panelOverviewStadium.getBounds().y, (int)(img03.getIconWidth()*stadiumSizeRatio), (int)(img03.getIconHeight()*stadiumSizeRatio));
		overviewStadium_03.setIcon(UI_Elements.scaleImageToButton(img03, overviewStadium_03));
		panelOverviewStadium.add(overviewStadium_03);
		String path03_R = "/Images/StadiumSlices/Stadium_Rollover_03.png";
		ImageIcon img03_R = new ImageIcon(Overview.class.getResource(path03_R));
		String path03_S = "/Images/StadiumSlices/Stadium_Selected_03.png";
		ImageIcon img03_S = new ImageIcon(Overview.class.getResource(path03_S));
		MouseAdapter ma03 =  new MouseAdapter(){
			public void mouseEntered( MouseEvent e ) {
				overviewStadium_03.setIcon(UI_Elements.scaleImageToButton(img03_R, overviewStadium_03));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_03.isSelected() != true)
		    	{
		    		overviewStadium_03.setIcon(UI_Elements.scaleImageToButton(img03, overviewStadium_03));
		    	}
		    	else
		    	{
		    		overviewStadium_03.setIcon(UI_Elements.scaleImageToButton(img03_S, overviewStadium_03));
		    	}
		    }
		};
		overviewStadium_03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_03, ma03, img03_S);
			}
		});
		overviewStadium_03.addMouseListener(ma03);
		
		overviewStadium_04 = new JButton();
		overviewStadium_04.setContentAreaFilled(false);
		overviewStadium_04.setOpaque(false);
		overviewStadium_04.setName("4");
		overviewStadium_04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_04.setBorderPainted(false);
		overviewStadium_04.setFocusPainted(false);
		overviewStadium_04.setBorder(null);
		String path04 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(4) + "_04.png";
		ImageIcon img04 = new ImageIcon(Overview.class.getResource(path04));
		overviewStadium_04.setBounds(overviewStadium_03.getBounds().x + overviewStadium_03.getBounds().width, panelOverviewStadium.getBounds().y, (int)(img04.getIconWidth()*stadiumSizeRatio), (int)(img04.getIconHeight()*stadiumSizeRatio));
		overviewStadium_04.setIcon(UI_Elements.scaleImageToButton(img04, overviewStadium_04));
		panelOverviewStadium.add(overviewStadium_04);
		String path04_R = "/Images/StadiumSlices/Stadium_Rollover_04.png";
		ImageIcon img04_R = new ImageIcon(Overview.class.getResource(path04_R));
		String path04_S = "/Images/StadiumSlices/Stadium_Selected_04.png";
		ImageIcon img04_S = new ImageIcon(Overview.class.getResource(path04_S));
		MouseAdapter ma04 =  new MouseAdapter(){
			public void mouseEntered( MouseEvent e ) {
				overviewStadium_04.setIcon(UI_Elements.scaleImageToButton(img04_R, overviewStadium_04));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_04.isSelected() != true)
		    	{
		    		overviewStadium_04.setIcon(UI_Elements.scaleImageToButton(img04, overviewStadium_04));
		    	}
		    	else
		    	{
		    		overviewStadium_04.setIcon(UI_Elements.scaleImageToButton(img04_S, overviewStadium_04));
		    	}
		    }
		};
		overviewStadium_04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_04, ma04, img04_S);
			}
		});
		overviewStadium_04.addMouseListener(ma04);

		
		
		overviewStadium_05 = new JButton();
		overviewStadium_05.setContentAreaFilled(false);
		overviewStadium_05.setOpaque(false);
		overviewStadium_05.setName("5");
		overviewStadium_05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_05.setBorderPainted(false);
		overviewStadium_05.setFocusPainted(false);
		overviewStadium_05.setBorder(null);
		String path05 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(5) + "_05.png";
		ImageIcon img05 = new ImageIcon(Overview.class.getResource(path05));
		overviewStadium_05.setBounds(overviewStadium_04.getBounds().x + overviewStadium_04.getBounds().width, panelOverviewStadium.getBounds().y, (int)(img05.getIconWidth()*stadiumSizeRatio), (int)(img05.getIconHeight()*stadiumSizeRatio));
		overviewStadium_05.setIcon(UI_Elements.scaleImageToButton(img05, overviewStadium_05));
		panelOverviewStadium.add(overviewStadium_05);
		String path05_R = "/Images/StadiumSlices/Stadium_Rollover_05.png";
		ImageIcon img05_R = new ImageIcon(Overview.class.getResource(path05_R));
		String path05_S = "/Images/StadiumSlices/Stadium_Selected_05.png";
		ImageIcon img05_S = new ImageIcon(Overview.class.getResource(path05_S));
		MouseAdapter ma05 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_05.setIcon(UI_Elements.scaleImageToButton(img05_R, overviewStadium_05));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_05.isSelected() != true)
		    	{
		    		overviewStadium_05.setIcon(UI_Elements.scaleImageToButton(img05, overviewStadium_05));
		    	}
		    	else
		    	{
		    		overviewStadium_05.setIcon(UI_Elements.scaleImageToButton(img05_S, overviewStadium_05));
		    	}
		    }
		};
		overviewStadium_05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_05, ma05, img05_S);
			}
		});
		overviewStadium_05.addMouseListener(ma05);
		

		
		overviewStadium_06 = new JButton();
		overviewStadium_06.setContentAreaFilled(false);
		overviewStadium_06.setOpaque(false);
		overviewStadium_06.setName("6");
		overviewStadium_06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_06.setBorderPainted(false);
		overviewStadium_06.setFocusPainted(false);
		overviewStadium_06.setBorder(null);
		String path06 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(6) + "_06.png";
		ImageIcon img06 = new ImageIcon(Overview.class.getResource(path06));
		overviewStadium_06.setBounds(overviewStadium_05.getBounds().x + overviewStadium_05.getBounds().width, panelOverviewStadium.getBounds().y, (int)(img06.getIconWidth()*stadiumSizeRatio), (int)(img06.getIconHeight()*stadiumSizeRatio));
		overviewStadium_06.setIcon(UI_Elements.scaleImageToButton(img06, overviewStadium_06));
		panelOverviewStadium.add(overviewStadium_06);
		String path06_R = "/Images/StadiumSlices/Stadium_Rollover_06.png";
		ImageIcon img06_R = new ImageIcon(Overview.class.getResource(path06_R));
		String path06_S = "/Images/StadiumSlices/Stadium_Selected_06.png";
		ImageIcon img06_S = new ImageIcon(Overview.class.getResource(path06_S));
		MouseAdapter ma06 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_06.setIcon(UI_Elements.scaleImageToButton(img06_R, overviewStadium_06));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_06.isSelected() != true)
		    	{
		    		overviewStadium_06.setIcon(UI_Elements.scaleImageToButton(img06, overviewStadium_06));
		    	}
		    	else
		    	{
		    		overviewStadium_06.setIcon(UI_Elements.scaleImageToButton(img06_S, overviewStadium_06));
		    	}
		    }
		};
		overviewStadium_06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_06, ma06, img06_S);
			}
		});
		overviewStadium_06.addMouseListener(ma06);
		
		
		
		overviewStadium_07 = new JButton();
		overviewStadium_07.setContentAreaFilled(false);
		overviewStadium_07.setOpaque(false);
		overviewStadium_07.setName("7");
		overviewStadium_07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_07.setBorderPainted(false);
		overviewStadium_07.setFocusPainted(false);
		overviewStadium_07.setBorder(null);
		String path07 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(7) + "_07.png";
		ImageIcon img07 = new ImageIcon(Overview.class.getResource(path07));
		overviewStadium_07.setBounds(overviewStadium_06.getBounds().x + overviewStadium_06.getBounds().width, panelOverviewStadium.getBounds().y, (int)(img07.getIconWidth()*stadiumSizeRatio), (int)(img07.getIconHeight()*stadiumSizeRatio));
		overviewStadium_07.setIcon(UI_Elements.scaleImageToButton(img07, overviewStadium_07));
		panelOverviewStadium.add(overviewStadium_07);
		String path07_R = "/Images/StadiumSlices/Stadium_Rollover_07.png";
		ImageIcon img07_R = new ImageIcon(Overview.class.getResource(path07_R));
		String path07_S = "/Images/StadiumSlices/Stadium_Selected_07.png";
		ImageIcon img07_S = new ImageIcon(Overview.class.getResource(path07_S));
		MouseAdapter ma07 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_07.setIcon(UI_Elements.scaleImageToButton(img07_R, overviewStadium_07));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_07.isSelected() != true)
		    	{
		    		overviewStadium_07.setIcon(UI_Elements.scaleImageToButton(img07, overviewStadium_07));
		    	}
		    	else
		    	{
		    		overviewStadium_07.setIcon(UI_Elements.scaleImageToButton(img07_S, overviewStadium_07));
		    	}
		    }
		};
		overviewStadium_07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_07, ma07, img07_S);
			}
		});
		overviewStadium_07.addMouseListener(ma07);
		
		
		overviewStadium_08 = new JButton();
		overviewStadium_08.setContentAreaFilled(false);
		overviewStadium_08.setOpaque(false);
		overviewStadium_08.setName("8");
		overviewStadium_08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_08.setBorderPainted(false);
		overviewStadium_08.setFocusPainted(false);
		overviewStadium_08.setBorder(null);
		String path08 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(8) + "_08.png";
		ImageIcon img08 = new ImageIcon(Overview.class.getResource(path08));
		overviewStadium_08.setBounds(overviewStadium_07.getBounds().x + overviewStadium_07.getBounds().width, panelOverviewStadium.getBounds().y, (int)(img08.getIconWidth()*stadiumSizeRatio), (int)(img08.getIconHeight()*stadiumSizeRatio));
		overviewStadium_08.setIcon(UI_Elements.scaleImageToButton(img08, overviewStadium_08));
		panelOverviewStadium.add(overviewStadium_08);
		String path08_R = "/Images/StadiumSlices/Stadium_Rollover_08.png";
		ImageIcon img08_R = new ImageIcon(Overview.class.getResource(path08_R));
		String path08_S = "/Images/StadiumSlices/Stadium_Selected_08.png";
		ImageIcon img08_S = new ImageIcon(Overview.class.getResource(path08_S));
		MouseAdapter ma08 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_08.setIcon(UI_Elements.scaleImageToButton(img08_R, overviewStadium_08));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_08.isSelected() != true)
		    	{
		    		overviewStadium_08.setIcon(UI_Elements.scaleImageToButton(img08, overviewStadium_08));
		    	}
		    	else
		    	{
		    		overviewStadium_08.setIcon(UI_Elements.scaleImageToButton(img08_S, overviewStadium_08));
		    	}
		    }
		};
		overviewStadium_08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_08, ma08, img08_S);
			}
		});
		overviewStadium_08.addMouseListener(ma08);
		
		
		overviewStadium_10 = new JButton();
		overviewStadium_10.setContentAreaFilled(false);
		overviewStadium_10.setOpaque(false);
		overviewStadium_10.setName("10");
		overviewStadium_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_10.setBorderPainted(false);
		overviewStadium_10.setFocusPainted(false);
		overviewStadium_10.setBorder(null);
		String path10 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(10) + "_10.png";
		ImageIcon img10 = new ImageIcon(Overview.class.getResource(path10));
		overviewStadium_10.setBounds(panelOverviewStadium.getBounds().x + (int)(1013*stadiumSizeRatio), overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img10.getIconWidth()*stadiumSizeRatio), (int)(img10.getIconHeight()*stadiumSizeRatio));
		overviewStadium_10.setIcon(UI_Elements.scaleImageToButton(img10, overviewStadium_10));
		panelOverviewStadium.add(overviewStadium_10);
		String path10_R = "/Images/StadiumSlices/Stadium_Rollover_10.png";
		ImageIcon img10_R = new ImageIcon(Overview.class.getResource(path10_R));
		String path10_S = "/Images/StadiumSlices/Stadium_Selected_10.png";
		ImageIcon img10_S = new ImageIcon(Overview.class.getResource(path10_S));
		MouseAdapter ma10 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_10.setIcon(UI_Elements.scaleImageToButton(img10_R, overviewStadium_10));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_10.isSelected() != true)
		    	{
		    		overviewStadium_10.setIcon(UI_Elements.scaleImageToButton(img10, overviewStadium_10));
		    	}
		    	else
		    	{
		    		overviewStadium_10.setIcon(UI_Elements.scaleImageToButton(img10_S, overviewStadium_10));
		    	}
		    }
		};
		overviewStadium_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_10, ma10, img10_S);
			}
		});
		overviewStadium_10.addMouseListener(ma10);
		
		overviewStadium_11 = new JButton();
		overviewStadium_11.setContentAreaFilled(false);
		overviewStadium_11.setOpaque(false);
		overviewStadium_11.setName("11");
		overviewStadium_11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_11.setBorderPainted(false);
		overviewStadium_11.setFocusPainted(false);
		overviewStadium_11.setBorder(null);
		String path11 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(11) + "_11.png";
		ImageIcon img11 = new ImageIcon(Overview.class.getResource(path11));
		overviewStadium_11.setBounds(overviewStadium_10.getBounds().x + overviewStadium_10.getBounds().width, overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img11.getIconWidth()*stadiumSizeRatio), (int)(img11.getIconHeight()*stadiumSizeRatio));
		overviewStadium_11.setIcon(UI_Elements.scaleImageToButton(img11, overviewStadium_11));
		panelOverviewStadium.add(overviewStadium_11);
		String path11_R = "/Images/StadiumSlices/Stadium_Rollover_11.png";
		ImageIcon img11_R = new ImageIcon(Overview.class.getResource(path11_R));
		String path11_S = "/Images/StadiumSlices/Stadium_Selected_11.png";
		ImageIcon img11_S = new ImageIcon(Overview.class.getResource(path11_S));
		MouseAdapter ma11 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_11.setIcon(UI_Elements.scaleImageToButton(img11_R, overviewStadium_11));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_11.isSelected() != true)
		    	{
		    		overviewStadium_11.setIcon(UI_Elements.scaleImageToButton(img11, overviewStadium_11));
		    	}
		    	else
		    	{
		    		overviewStadium_11.setIcon(UI_Elements.scaleImageToButton(img11_S, overviewStadium_11));
		    	}
		    }
		};
		overviewStadium_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_11, ma11, img11_S);
			}
		});
		overviewStadium_11.addMouseListener(ma11);
		
		overviewStadium_12 = new JButton();
		overviewStadium_12.setContentAreaFilled(false);
		overviewStadium_12.setOpaque(false);
		overviewStadium_12.setName("12");
		overviewStadium_12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_12.setBorderPainted(false);
		overviewStadium_12.setFocusPainted(false);
		overviewStadium_12.setBorder(null);
		String path12 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(12) + "_12.png";
		ImageIcon img12 = new ImageIcon(Overview.class.getResource(path12));
		overviewStadium_12.setBounds(overviewStadium_11.getBounds().x + overviewStadium_11.getBounds().width, overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img12.getIconWidth()*stadiumSizeRatio), (int)(img12.getIconHeight()*stadiumSizeRatio));
		overviewStadium_12.setIcon(UI_Elements.scaleImageToButton(img12, overviewStadium_12));
		panelOverviewStadium.add(overviewStadium_12);
		String path12_R = "/Images/StadiumSlices/Stadium_Rollover_12.png";
		ImageIcon img12_R = new ImageIcon(Overview.class.getResource(path12_R));
		String path12_S = "/Images/StadiumSlices/Stadium_Selected_12.png";
		ImageIcon img12_S = new ImageIcon(Overview.class.getResource(path12_S));
		MouseAdapter ma12 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_12.setIcon(UI_Elements.scaleImageToButton(img12_R, overviewStadium_12));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_12.isSelected() != true)
		    	{
		    		overviewStadium_12.setIcon(UI_Elements.scaleImageToButton(img12, overviewStadium_12));
		    	}
		    	else
		    	{
		    		overviewStadium_12.setIcon(UI_Elements.scaleImageToButton(img12_S, overviewStadium_12));
		    	}
		    }
		};
		overviewStadium_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_12, ma12, img12_S);
			}
		});
		overviewStadium_12.addMouseListener(ma12);
		
		overviewStadium_13 = new JButton();
		overviewStadium_13.setContentAreaFilled(false);
		overviewStadium_13.setOpaque(false);
		overviewStadium_13.setName("13");
		overviewStadium_13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_13.setBorderPainted(false);
		overviewStadium_13.setFocusPainted(false);
		overviewStadium_13.setBorder(null);
		String path13 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(13) + "_13.png";
		ImageIcon img13 = new ImageIcon(Overview.class.getResource(path13));
		overviewStadium_13.setBounds(overviewStadium_12.getBounds().x + overviewStadium_12.getBounds().width, overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img13.getIconWidth()*stadiumSizeRatio), (int)(img13.getIconHeight()*stadiumSizeRatio));
		overviewStadium_13.setIcon(UI_Elements.scaleImageToButton(img13, overviewStadium_13));
		panelOverviewStadium.add(overviewStadium_13);
		String path13_R = "/Images/StadiumSlices/Stadium_Rollover_13.png";
		ImageIcon img13_R = new ImageIcon(Overview.class.getResource(path13_R));
		String path13_S = "/Images/StadiumSlices/Stadium_Selected_13.png";
		ImageIcon img13_S = new ImageIcon(Overview.class.getResource(path13_S));
		MouseAdapter ma13 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_13.setIcon(UI_Elements.scaleImageToButton(img13_R, overviewStadium_13));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_13.isSelected() != true)
		    	{
		    		overviewStadium_13.setIcon(UI_Elements.scaleImageToButton(img13, overviewStadium_13));
		    	}
		    	else
		    	{
		    		overviewStadium_13.setIcon(UI_Elements.scaleImageToButton(img13_S, overviewStadium_13));
		    	}
		    }
		};
		overviewStadium_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_13, ma13, img13_S);
			}
		});
		overviewStadium_13.addMouseListener(ma13);
		
		overviewStadium_14 = new JButton();
		overviewStadium_14.setContentAreaFilled(false);
		overviewStadium_14.setOpaque(false);
		overviewStadium_14.setName("14");
		overviewStadium_14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_14.setBorderPainted(false);
		overviewStadium_14.setFocusPainted(false);
		overviewStadium_14.setBorder(null);
		String path14 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(14) + "_14.png";
		ImageIcon img14 = new ImageIcon(Overview.class.getResource(path14));
		overviewStadium_14.setBounds(overviewStadium_13.getBounds().x + overviewStadium_13.getBounds().width, overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img14.getIconWidth()*stadiumSizeRatio), (int)(img14.getIconHeight()*stadiumSizeRatio));
		overviewStadium_14.setIcon(UI_Elements.scaleImageToButton(img14, overviewStadium_14));
		panelOverviewStadium.add(overviewStadium_14);
		String path14_R = "/Images/StadiumSlices/Stadium_Rollover_14.png";
		ImageIcon img14_R = new ImageIcon(Overview.class.getResource(path14_R));
		String path14_S = "/Images/StadiumSlices/Stadium_Selected_14.png";
		ImageIcon img14_S = new ImageIcon(Overview.class.getResource(path14_S));
		MouseAdapter ma14 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_14.setIcon(UI_Elements.scaleImageToButton(img14_R, overviewStadium_14));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_14.isSelected() != true)
		    	{
		    		overviewStadium_14.setIcon(UI_Elements.scaleImageToButton(img14, overviewStadium_14));
		    	}
		    	else
		    	{
		    		overviewStadium_14.setIcon(UI_Elements.scaleImageToButton(img14_S, overviewStadium_14));
		    	}
		    }
		};
		overviewStadium_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_14, ma14, img14_S);
			}
		});
		overviewStadium_14.addMouseListener(ma14);
		
		overviewStadium_15 = new JButton();
		overviewStadium_15.setContentAreaFilled(false);
		overviewStadium_15.setOpaque(false);
		overviewStadium_15.setName("15");
		overviewStadium_15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_15.setBorderPainted(false);
		overviewStadium_15.setFocusPainted(false);
		overviewStadium_15.setBorder(null);
		String path15 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(15) + "_15.png";
		ImageIcon img15 = new ImageIcon(Overview.class.getResource(path15));
		overviewStadium_15.setBounds(overviewStadium_14.getBounds().x + overviewStadium_14.getBounds().width, overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img15.getIconWidth()*stadiumSizeRatio), (int)(img15.getIconHeight()*stadiumSizeRatio));
		overviewStadium_15.setIcon(UI_Elements.scaleImageToButton(img15, overviewStadium_15));
		panelOverviewStadium.add(overviewStadium_15);
		String path15_R = "/Images/StadiumSlices/Stadium_Rollover_15.png";
		ImageIcon img15_R = new ImageIcon(Overview.class.getResource(path15_R));
		String path15_S = "/Images/StadiumSlices/Stadium_Selected_15.png";
		ImageIcon img15_S = new ImageIcon(Overview.class.getResource(path15_S));
		MouseAdapter ma15 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_15.setIcon(UI_Elements.scaleImageToButton(img15_R, overviewStadium_15));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_15.isSelected() != true)
		    	{
		    		overviewStadium_15.setIcon(UI_Elements.scaleImageToButton(img15, overviewStadium_15));
		    	}
		    	else
		    	{
		    		overviewStadium_15.setIcon(UI_Elements.scaleImageToButton(img15_S, overviewStadium_15));
		    	}
		    }
		};
		overviewStadium_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_15, ma15, img15_S);
			}
		});
		overviewStadium_15.addMouseListener(ma15);
		
		overviewStadium_16 = new JButton();
		overviewStadium_16.setContentAreaFilled(false);
		overviewStadium_16.setOpaque(false);
		overviewStadium_16.setName("16");
		overviewStadium_16.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_16.setBorderPainted(false);
		overviewStadium_16.setFocusPainted(false);
		overviewStadium_16.setBorder(null);
		String path16 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(16) + "_16.png";
		ImageIcon img16 = new ImageIcon(Overview.class.getResource(path16));
		overviewStadium_16.setBounds(overviewStadium_15.getBounds().x + overviewStadium_15.getBounds().width, overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img16.getIconWidth()*stadiumSizeRatio), (int)(img16.getIconHeight()*stadiumSizeRatio));
		overviewStadium_16.setIcon(UI_Elements.scaleImageToButton(img16, overviewStadium_16));
		panelOverviewStadium.add(overviewStadium_16);
		String path16_R = "/Images/StadiumSlices/Stadium_Rollover_16.png";
		ImageIcon img16_R = new ImageIcon(Overview.class.getResource(path16_R));
		String path16_S = "/Images/StadiumSlices/Stadium_Selected_16.png";
		ImageIcon img16_S = new ImageIcon(Overview.class.getResource(path16_S));
		MouseAdapter ma16 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_16.setIcon(UI_Elements.scaleImageToButton(img16_R, overviewStadium_16));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_16.isSelected() != true)
		    	{
		    		overviewStadium_16.setIcon(UI_Elements.scaleImageToButton(img16, overviewStadium_16));
		    	}
		    	else
		    	{
		    		overviewStadium_16.setIcon(UI_Elements.scaleImageToButton(img16_S, overviewStadium_16));
		    	}
		    }
		};
		overviewStadium_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_16, ma16, img16_S);
			}
		});
		overviewStadium_16.addMouseListener(ma16);
						
		overviewStadium_55 = new JButton();
		overviewStadium_55.setContentAreaFilled(false);
		overviewStadium_55.setOpaque(false);
		overviewStadium_55.setName("55");
		overviewStadium_55.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_55.setBorderPainted(false);
		overviewStadium_55.setFocusPainted(false);
		overviewStadium_55.setBorder(null);
		String path55 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(55) + "_55.png";
		ImageIcon img55 = new ImageIcon(Overview.class.getResource(path55));
		overviewStadium_55.setBounds(overviewStadium_08.getBounds().x + overviewStadium_08.getBounds().width, overviewStadium_49.getBounds().y, (int)(img55.getIconWidth()*stadiumSizeRatio), (int)(img55.getIconHeight()*stadiumSizeRatio));
		overviewStadium_55.setIcon(UI_Elements.scaleImageToButton(img55, overviewStadium_55));
		panelOverviewStadium.add(overviewStadium_55);
		String path55_R = "/Images/StadiumSlices/Stadium_Rollover_55.png";
		ImageIcon img55_R = new ImageIcon(Overview.class.getResource(path55_R));
		String path55_S = "/Images/StadiumSlices/Stadium_Selected_55.png";
		ImageIcon img55_S = new ImageIcon(Overview.class.getResource(path55_S));
		MouseAdapter ma55 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_55.setIcon(UI_Elements.scaleImageToButton(img55_R, overviewStadium_55));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_55.isSelected() != true)
		    	{
		    		overviewStadium_55.setIcon(UI_Elements.scaleImageToButton(img55, overviewStadium_55));
		    	}
		    	else
		    	{
		    		overviewStadium_55.setIcon(UI_Elements.scaleImageToButton(img55_S, overviewStadium_55));
		    	}
		    }
		};
		overviewStadium_55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_55, ma55, img55_S);
			}
		});
		overviewStadium_55.addMouseListener(ma55);
		
		overviewStadium_22 = new JButton();
		overviewStadium_22.setContentAreaFilled(false);
		overviewStadium_22.setOpaque(false);
		overviewStadium_22.setName("22");
		overviewStadium_22.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_22.setBorderPainted(false);
		overviewStadium_22.setFocusPainted(false);
		overviewStadium_22.setBorder(null);
		String path22 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(22) + "_22.png";
		ImageIcon img22 = new ImageIcon(Overview.class.getResource(path22));
		overviewStadium_22.setBounds(overviewStadium_55.getBounds().x + overviewStadium_55.getBounds().width - (int)(img22.getIconWidth()*stadiumSizeRatio), overviewStadium_55.getBounds().y + overviewStadium_55.getBounds().height, (int)(img22.getIconWidth()*stadiumSizeRatio), (int)(img22.getIconHeight()*stadiumSizeRatio));
		overviewStadium_22.setIcon(UI_Elements.scaleImageToButton(img22, overviewStadium_22));
		panelOverviewStadium.add(overviewStadium_22);
		String path22_R = "/Images/StadiumSlices/Stadium_Rollover_22.png";
		ImageIcon img22_R = new ImageIcon(Overview.class.getResource(path22_R));
		String path22_S = "/Images/StadiumSlices/Stadium_Selected_22.png";
		ImageIcon img22_S = new ImageIcon(Overview.class.getResource(path22_S));
		MouseAdapter ma22 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_22.setIcon(UI_Elements.scaleImageToButton(img22_R, overviewStadium_22));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_22.isSelected() != true)
		    	{
		    		overviewStadium_22.setIcon(UI_Elements.scaleImageToButton(img22, overviewStadium_22));
		    	}
		    	else
		    	{
		    		overviewStadium_22.setIcon(UI_Elements.scaleImageToButton(img22_S, overviewStadium_22));
		    	}
		    }
		};
		overviewStadium_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_22, ma22, img22_S);
			}
		});
		overviewStadium_22.addMouseListener(ma22);
		
		overviewStadium_27 = new JButton();
		overviewStadium_27.setContentAreaFilled(false);
		overviewStadium_27.setOpaque(false);
		overviewStadium_27.setName("27");
		overviewStadium_27.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_27.setBorderPainted(false);
		overviewStadium_27.setFocusPainted(false);
		overviewStadium_27.setBorder(null);
		String path27 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(27) + "_27.png";
		ImageIcon img27 = new ImageIcon(Overview.class.getResource(path27));
		overviewStadium_27.setBounds(overviewStadium_22.getBounds().x, overviewStadium_22.getBounds().y + overviewStadium_22.getBounds().height, (int)(img27.getIconWidth()*stadiumSizeRatio), (int)(img27.getIconHeight()*stadiumSizeRatio));
		overviewStadium_27.setIcon(UI_Elements.scaleImageToButton(img27, overviewStadium_27));
		panelOverviewStadium.add(overviewStadium_27);
		String path27_R = "/Images/StadiumSlices/Stadium_Rollover_27.png";
		ImageIcon img27_R = new ImageIcon(Overview.class.getResource(path27_R));
		String path27_S = "/Images/StadiumSlices/Stadium_Selected_27.png";
		ImageIcon img27_S = new ImageIcon(Overview.class.getResource(path27_S));
		MouseAdapter ma27 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_27.setIcon(UI_Elements.scaleImageToButton(img27_R, overviewStadium_27));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_27.isSelected() != true)
		    	{
		    		overviewStadium_27.setIcon(UI_Elements.scaleImageToButton(img27, overviewStadium_27));
		    	}
		    	else
		    	{
		    		overviewStadium_27.setIcon(UI_Elements.scaleImageToButton(img27_S, overviewStadium_27));
		    	}
		    }
		};
		overviewStadium_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_27, ma27, img27_S);
			}
		});
		overviewStadium_27.addMouseListener(ma27);
		
		
		overviewStadium_29 = new JButton();
		overviewStadium_29.setContentAreaFilled(false);
		overviewStadium_29.setOpaque(false);
		overviewStadium_29.setName("29");
		overviewStadium_29.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_29.setBorderPainted(false);
		overviewStadium_29.setFocusPainted(false);
		overviewStadium_29.setBorder(null);
		String path29 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(29) + "_29.png";
		ImageIcon img29 = new ImageIcon(Overview.class.getResource(path29));
		overviewStadium_29.setBounds(overviewStadium_27.getBounds().x, overviewStadium_27.getBounds().y + overviewStadium_27.getBounds().height, (int)(img29.getIconWidth()*stadiumSizeRatio), (int)(img29.getIconHeight()*stadiumSizeRatio));
		overviewStadium_29.setIcon(UI_Elements.scaleImageToButton(img29, overviewStadium_29));
		panelOverviewStadium.add(overviewStadium_29);
		String path29_R = "/Images/StadiumSlices/Stadium_Rollover_29.png";
		ImageIcon img29_R = new ImageIcon(Overview.class.getResource(path29_R));
		String path29_S = "/Images/StadiumSlices/Stadium_Selected_29.png";
		ImageIcon img29_S = new ImageIcon(Overview.class.getResource(path29_S));
		MouseAdapter ma29 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_29.setIcon(UI_Elements.scaleImageToButton(img29_R, overviewStadium_29));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_29.isSelected() != true)
		    	{
		    		overviewStadium_29.setIcon(UI_Elements.scaleImageToButton(img29, overviewStadium_29));
		    	}
		    	else
		    	{
		    		overviewStadium_29.setIcon(UI_Elements.scaleImageToButton(img29_S, overviewStadium_29));
		    	}
		    }
		};
		overviewStadium_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_29, ma29, img29_S);
			}
		});
		overviewStadium_29.addMouseListener(ma29);
		
		
		overviewStadium_54 = new JButton();
		overviewStadium_54.setContentAreaFilled(false);
		overviewStadium_54.setOpaque(false);
		overviewStadium_54.setName("54");
		overviewStadium_54.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_54.setBorderPainted(false);
		overviewStadium_54.setFocusPainted(false);
		overviewStadium_54.setBorder(null);
		String path54 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(54) + "_54.png";
		ImageIcon img54 = new ImageIcon(Overview.class.getResource(path54));
		overviewStadium_54.setBounds(overviewStadium_55.getBounds().x, panelOverviewStadium.getBounds().y, (int)(img54.getIconWidth()*stadiumSizeRatio), (int)(img54.getIconHeight()*stadiumSizeRatio));
		overviewStadium_54.setIcon(UI_Elements.scaleImageToButton(img54, overviewStadium_54));
		panelOverviewStadium.add(overviewStadium_54);
		String path54_R = "/Images/StadiumSlices/Stadium_Rollover_54.png";
		ImageIcon img54_R = new ImageIcon(Overview.class.getResource(path54_R));
		String path54_S = "/Images/StadiumSlices/Stadium_Selected_54.png";
		ImageIcon img54_S = new ImageIcon(Overview.class.getResource(path54_S));
		MouseAdapter ma54 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_54.setIcon(UI_Elements.scaleImageToButton(img54_R, overviewStadium_54));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_54.isSelected() != true)
		    	{
		    		overviewStadium_54.setIcon(UI_Elements.scaleImageToButton(img54, overviewStadium_54));
		    	}
		    	else
		    	{
		    		overviewStadium_54.setIcon(UI_Elements.scaleImageToButton(img54_S, overviewStadium_54));
		    	}
		    }
		};
		overviewStadium_54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_54, ma54, img54_S);
			}
		});
		overviewStadium_54.addMouseListener(ma54);
		
		
		overviewStadium_25 = new JButton();
		overviewStadium_25.setContentAreaFilled(false);
		overviewStadium_25.setOpaque(false);
		overviewStadium_25.setName("25");
		overviewStadium_25.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_25.setBorderPainted(false);
		overviewStadium_25.setFocusPainted(false);
		overviewStadium_25.setBorder(null);
		String path25 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(25) + "_25.png";
		ImageIcon img25 = new ImageIcon(Overview.class.getResource(path25));
		overviewStadium_25.setBounds(overviewStadium_29.getBounds().x + overviewStadium_29.getBounds().width, overviewStadium_54.getBounds().y + overviewStadium_54.getBounds().height, (int)(img25.getIconWidth()*stadiumSizeRatio), (int)(img25.getIconHeight()*stadiumSizeRatio));
		overviewStadium_25.setIcon(UI_Elements.scaleImageToButton(img25, overviewStadium_25));
		panelOverviewStadium.add(overviewStadium_25);
		String path25_R = "/Images/StadiumSlices/Stadium_Rollover_25.png";
		ImageIcon img25_R = new ImageIcon(Overview.class.getResource(path25_R));
		String path25_S = "/Images/StadiumSlices/Stadium_Selected_25.png";
		ImageIcon img25_S = new ImageIcon(Overview.class.getResource(path25_S));
		MouseAdapter ma25 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_25.setIcon(UI_Elements.scaleImageToButton(img25_R, overviewStadium_25));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_25.isSelected() != true)
		    	{
		    		overviewStadium_25.setIcon(UI_Elements.scaleImageToButton(img25, overviewStadium_25));
		    	}
		    	else
		    	{
		    		overviewStadium_25.setIcon(UI_Elements.scaleImageToButton(img25_S, overviewStadium_25));
		    	}
		    }
		};
		overviewStadium_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_25, ma25, img25_S);
			}
		});
		overviewStadium_25.addMouseListener(ma25);
		
	
		
		overviewStadium_24 = new JButton();
		overviewStadium_24.setContentAreaFilled(false);
		overviewStadium_24.setOpaque(false);
		overviewStadium_24.setName("24");
		overviewStadium_24.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_24.setBorderPainted(false);
		overviewStadium_24.setFocusPainted(false);
		overviewStadium_24.setBorder(null);
		String path24 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(24) + "_24.png";
		ImageIcon img24 = new ImageIcon(Overview.class.getResource(path24));
		overviewStadium_24.setBounds(overviewStadium_48.getBounds().x, overviewStadium_48.getBounds().y + overviewStadium_48.getBounds().height, (int)(img24.getIconWidth()*stadiumSizeRatio), (int)(img24.getIconHeight()*stadiumSizeRatio));
		overviewStadium_24.setIcon(UI_Elements.scaleImageToButton(img24, overviewStadium_24));
		panelOverviewStadium.add(overviewStadium_24);
		String path24_R = "/Images/StadiumSlices/Stadium_Rollover_24.png";
		ImageIcon img24_R = new ImageIcon(Overview.class.getResource(path24_R));
		String path24_S = "/Images/StadiumSlices/Stadium_Selected_24.png";
		ImageIcon img24_S = new ImageIcon(Overview.class.getResource(path24_S));
		MouseAdapter ma24 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_24.setIcon(UI_Elements.scaleImageToButton(img24_R, overviewStadium_24));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_24.isSelected() != true)
		    	{
		    		overviewStadium_24.setIcon(UI_Elements.scaleImageToButton(img24, overviewStadium_24));
		    	}
		    	else
		    	{
		    		overviewStadium_24.setIcon(UI_Elements.scaleImageToButton(img24_S, overviewStadium_24));
		    	}
		    }
		};
		overviewStadium_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_24, ma24, img24_S);
			}
		});
		overviewStadium_24.addMouseListener(ma24);
		
		
		overviewStadium_50 = new JButton();
		overviewStadium_50.setContentAreaFilled(false);
		overviewStadium_50.setOpaque(false);
		overviewStadium_50.setName("50");
		overviewStadium_50.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_50.setBorderPainted(false);
		overviewStadium_50.setFocusPainted(false);
		overviewStadium_50.setBorder(null);
		String path50 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(50) + "_50.png";
		ImageIcon img50 = new ImageIcon(Overview.class.getResource(path50));
		overviewStadium_50.setBounds(overviewStadium_24.getBounds().x, overviewStadium_24.getBounds().y + overviewStadium_24.getBounds().height, (int)(img50.getIconWidth()*stadiumSizeRatio), (int)(img50.getIconHeight()*stadiumSizeRatio));
		overviewStadium_50.setIcon(UI_Elements.scaleImageToButton(img50, overviewStadium_50));
		panelOverviewStadium.add(overviewStadium_50);
		String path50_R = "/Images/StadiumSlices/Stadium_Rollover_50.png";
		ImageIcon img50_R = new ImageIcon(Overview.class.getResource(path50_R));
		String path50_S = "/Images/StadiumSlices/Stadium_Selected_50.png";
		ImageIcon img50_S = new ImageIcon(Overview.class.getResource(path50_S));
		MouseAdapter ma50 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_50.setIcon(UI_Elements.scaleImageToButton(img50_R, overviewStadium_50));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_50.isSelected() != true)
		    	{
		    		overviewStadium_50.setIcon(UI_Elements.scaleImageToButton(img50, overviewStadium_50));
		    	}
		    	else
		    	{
		    		overviewStadium_50.setIcon(UI_Elements.scaleImageToButton(img50_S, overviewStadium_50));
		    	}
		    }
		};
		overviewStadium_50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_50, ma50, img50_S);
			}
		});
		overviewStadium_50.addMouseListener(ma50);
		
		
		overviewStadium_41 = new JButton();
		overviewStadium_41.setContentAreaFilled(false);
		overviewStadium_41.setOpaque(false);
		overviewStadium_41.setName("41");
		overviewStadium_41.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_41.setBorderPainted(false);
		overviewStadium_41.setFocusPainted(false);
		overviewStadium_41.setBorder(null);
		String path41 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(41) + "_41.png";
		ImageIcon img41 = new ImageIcon(Overview.class.getResource(path41));
		overviewStadium_41.setBounds(overviewStadium_50.getBounds().x + overviewStadium_50.getBounds().width, overviewStadium_50.getBounds().y + overviewStadium_50.getBounds().height - (int)(img41.getIconHeight()*stadiumSizeRatio), (int)(img41.getIconWidth()*stadiumSizeRatio), (int)(img41.getIconHeight()*stadiumSizeRatio));
		overviewStadium_41.setIcon(UI_Elements.scaleImageToButton(img41, overviewStadium_41));
		panelOverviewStadium.add(overviewStadium_41);
		String path41_R = "/Images/StadiumSlices/Stadium_Rollover_41.png";
		ImageIcon img41_R = new ImageIcon(Overview.class.getResource(path41_R));
		String path41_S = "/Images/StadiumSlices/Stadium_Selected_41.png";
		ImageIcon img41_S = new ImageIcon(Overview.class.getResource(path41_S));
		MouseAdapter ma41 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_41.setIcon(UI_Elements.scaleImageToButton(img41_R, overviewStadium_41));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_41.isSelected() != true)
		    	{
		    		overviewStadium_41.setIcon(UI_Elements.scaleImageToButton(img41, overviewStadium_41));
		    	}
		    	else
		    	{
		    		overviewStadium_41.setIcon(UI_Elements.scaleImageToButton(img41_S, overviewStadium_41));
		    	}
		    }
		};
		overviewStadium_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_41, ma41, img41_S);
			}
		});
		overviewStadium_41.addMouseListener(ma41);
		
		
		overviewStadium_42 = new JButton();
		overviewStadium_42.setContentAreaFilled(false);
		overviewStadium_42.setOpaque(false);
		overviewStadium_42.setName("42");
		overviewStadium_42.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_42.setBorderPainted(false);
		overviewStadium_42.setFocusPainted(false);
		overviewStadium_42.setBorder(null);
		String path42 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(42) + "_42.png";
		ImageIcon img42 = new ImageIcon(Overview.class.getResource(path42));
		overviewStadium_42.setBounds(overviewStadium_41.getBounds().x + overviewStadium_41.getBounds().width, overviewStadium_41.getBounds().y, (int)(img42.getIconWidth()*stadiumSizeRatio), (int)(img42.getIconHeight()*stadiumSizeRatio));
		overviewStadium_42.setIcon(UI_Elements.scaleImageToButton(img42, overviewStadium_42));
		panelOverviewStadium.add(overviewStadium_42);
		String path42_R = "/Images/StadiumSlices/Stadium_Rollover_42.png";
		ImageIcon img42_R = new ImageIcon(Overview.class.getResource(path42_R));
		String path42_S = "/Images/StadiumSlices/Stadium_Selected_42.png";
		ImageIcon img42_S = new ImageIcon(Overview.class.getResource(path42_S));
		MouseAdapter ma42 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_42.setIcon(UI_Elements.scaleImageToButton(img42_R, overviewStadium_42));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_42.isSelected() != true)
		    	{
		    		overviewStadium_42.setIcon(UI_Elements.scaleImageToButton(img42, overviewStadium_42));
		    	}
		    	else
		    	{
		    		overviewStadium_42.setIcon(UI_Elements.scaleImageToButton(img42_S, overviewStadium_42));
		    	}
		    }
		};
		overviewStadium_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_42, ma42, img42_S);
			}
		});
		overviewStadium_42.addMouseListener(ma42);
		
		
		overviewStadium_43 = new JButton();
		overviewStadium_43.setContentAreaFilled(false);
		overviewStadium_43.setOpaque(false);
		overviewStadium_43.setName("43");
		overviewStadium_43.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_43.setBorderPainted(false);
		overviewStadium_43.setFocusPainted(false);
		overviewStadium_43.setBorder(null);
		String path43 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(43) + "_43.png";
		ImageIcon img43 = new ImageIcon(Overview.class.getResource(path43));
		overviewStadium_43.setBounds(overviewStadium_42.getBounds().x + overviewStadium_42.getBounds().width, overviewStadium_42.getBounds().y, (int)(img43.getIconWidth()*stadiumSizeRatio), (int)(img43.getIconHeight()*stadiumSizeRatio));
		overviewStadium_43.setIcon(UI_Elements.scaleImageToButton(img43, overviewStadium_43));
		panelOverviewStadium.add(overviewStadium_43);
		String path43_R = "/Images/StadiumSlices/Stadium_Rollover_43.png";
		ImageIcon img43_R = new ImageIcon(Overview.class.getResource(path43_R));
		String path43_S = "/Images/StadiumSlices/Stadium_Selected_43.png";
		ImageIcon img43_S = new ImageIcon(Overview.class.getResource(path43_S));
		MouseAdapter ma43 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_43.setIcon(UI_Elements.scaleImageToButton(img43_R, overviewStadium_43));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_43.isSelected() != true)
		    	{
		    		overviewStadium_43.setIcon(UI_Elements.scaleImageToButton(img43, overviewStadium_43));
		    	}
		    	else
		    	{
		    		overviewStadium_43.setIcon(UI_Elements.scaleImageToButton(img43_S, overviewStadium_43));
		    	}
		    }
		};
		overviewStadium_43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_43, ma43, img43_S);
			}
		});
		overviewStadium_43.addMouseListener(ma43);
		
		
		overviewStadium_44 = new JButton();
		overviewStadium_44.setContentAreaFilled(false);
		overviewStadium_44.setOpaque(false);
		overviewStadium_44.setName("44");
		overviewStadium_44.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_44.setBorderPainted(false);
		overviewStadium_44.setFocusPainted(false);
		overviewStadium_44.setBorder(null);
		String path44 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(44) + "_44.png";
		ImageIcon img44 = new ImageIcon(Overview.class.getResource(path44));
		overviewStadium_44.setBounds(overviewStadium_43.getBounds().x + overviewStadium_43.getBounds().width, overviewStadium_43.getBounds().y, (int)(img44.getIconWidth()*stadiumSizeRatio), (int)(img44.getIconHeight()*stadiumSizeRatio));
		overviewStadium_44.setIcon(UI_Elements.scaleImageToButton(img44, overviewStadium_44));
		panelOverviewStadium.add(overviewStadium_44);
		String path44_R = "/Images/StadiumSlices/Stadium_Rollover_44.png";
		ImageIcon img44_R = new ImageIcon(Overview.class.getResource(path44_R));
		String path44_S = "/Images/StadiumSlices/Stadium_Selected_44.png";
		ImageIcon img44_S = new ImageIcon(Overview.class.getResource(path44_S));
		MouseAdapter ma44 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_44.setIcon(UI_Elements.scaleImageToButton(img44_R, overviewStadium_44));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_44.isSelected() != true)
		    	{
		    		overviewStadium_44.setIcon(UI_Elements.scaleImageToButton(img44, overviewStadium_44));
		    	}
		    	else
		    	{
		    		overviewStadium_44.setIcon(UI_Elements.scaleImageToButton(img44_S, overviewStadium_44));
		    	}
		    }
		};
		overviewStadium_44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_44, ma44, img44_S);
			}
		});
		overviewStadium_44.addMouseListener(ma44);
		
		
		overviewStadium_45 = new JButton();
		overviewStadium_45.setContentAreaFilled(false);
		overviewStadium_45.setOpaque(false);
		overviewStadium_45.setName("45");
		overviewStadium_45.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_45.setBorderPainted(false);
		overviewStadium_45.setFocusPainted(false);
		overviewStadium_45.setBorder(null);
		String path45 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(45) + "_45.png";
		ImageIcon img45 = new ImageIcon(Overview.class.getResource(path45));
		overviewStadium_45.setBounds(overviewStadium_44.getBounds().x + overviewStadium_44.getBounds().width, overviewStadium_44.getBounds().y, (int)(img45.getIconWidth()*stadiumSizeRatio), (int)(img45.getIconHeight()*stadiumSizeRatio));
		overviewStadium_45.setIcon(UI_Elements.scaleImageToButton(img45, overviewStadium_45));
		panelOverviewStadium.add(overviewStadium_45);
		String path45_R = "/Images/StadiumSlices/Stadium_Rollover_45.png";
		ImageIcon img45_R = new ImageIcon(Overview.class.getResource(path45_R));
		String path45_S = "/Images/StadiumSlices/Stadium_Selected_45.png";
		ImageIcon img45_S = new ImageIcon(Overview.class.getResource(path45_S));
		MouseAdapter ma45 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_45.setIcon(UI_Elements.scaleImageToButton(img45_R, overviewStadium_45));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_45.isSelected() != true)
		    	{
		    		overviewStadium_45.setIcon(UI_Elements.scaleImageToButton(img45, overviewStadium_45));
		    	}
		    	else
		    	{
		    		overviewStadium_45.setIcon(UI_Elements.scaleImageToButton(img45_S, overviewStadium_45));
		    	}
		    }
		};
		overviewStadium_45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_45, ma45, img45_S);
			}
		});
		overviewStadium_45.addMouseListener(ma45);
		
		
		overviewStadium_46 = new JButton();
		overviewStadium_46.setContentAreaFilled(false);
		overviewStadium_46.setOpaque(false);
		overviewStadium_46.setName("46");
		overviewStadium_46.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_46.setBorderPainted(false);
		overviewStadium_46.setFocusPainted(false);
		overviewStadium_46.setBorder(null);
		String path46 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(46) + "_46.png";
		ImageIcon img46 = new ImageIcon(Overview.class.getResource(path46));
		overviewStadium_46.setBounds(overviewStadium_45.getBounds().x + overviewStadium_45.getBounds().width, overviewStadium_45.getBounds().y, (int)(img46.getIconWidth()*stadiumSizeRatio), (int)(img46.getIconHeight()*stadiumSizeRatio));
		overviewStadium_46.setIcon(UI_Elements.scaleImageToButton(img46, overviewStadium_46));
		panelOverviewStadium.add(overviewStadium_46);
		String path46_R = "/Images/StadiumSlices/Stadium_Rollover_46.png";
		ImageIcon img46_R = new ImageIcon(Overview.class.getResource(path46_R));
		String path46_S = "/Images/StadiumSlices/Stadium_Selected_46.png";
		ImageIcon img46_S = new ImageIcon(Overview.class.getResource(path46_S));
		MouseAdapter ma46 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_46.setIcon(UI_Elements.scaleImageToButton(img46_R, overviewStadium_46));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_46.isSelected() != true)
		    	{
		    		overviewStadium_46.setIcon(UI_Elements.scaleImageToButton(img46, overviewStadium_46));
		    	}
		    	else
		    	{
		    		overviewStadium_46.setIcon(UI_Elements.scaleImageToButton(img46_S, overviewStadium_46));
		    	}
		    }
		};
		overviewStadium_46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_46, ma46, img46_S);
			}
		});
		overviewStadium_46.addMouseListener(ma46);
		
		
		overviewStadium_47 = new JButton();
		overviewStadium_47.setContentAreaFilled(false);
		overviewStadium_47.setOpaque(false);
		overviewStadium_47.setName("47");
		overviewStadium_47.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_47.setBorderPainted(false);
		overviewStadium_47.setFocusPainted(false);
		overviewStadium_47.setBorder(null);
		String path47 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(47) + "_47.png";
		ImageIcon img47 = new ImageIcon(Overview.class.getResource(path47));
		overviewStadium_47.setBounds(overviewStadium_46.getBounds().x + overviewStadium_46.getBounds().width, overviewStadium_46.getBounds().y, (int)(img47.getIconWidth()*stadiumSizeRatio), (int)(img47.getIconHeight()*stadiumSizeRatio));
		overviewStadium_47.setIcon(UI_Elements.scaleImageToButton(img47, overviewStadium_47));
		panelOverviewStadium.add(overviewStadium_47);
		String path47_R = "/Images/StadiumSlices/Stadium_Rollover_47.png";
		ImageIcon img47_R = new ImageIcon(Overview.class.getResource(path47_R));
		String path47_S = "/Images/StadiumSlices/Stadium_Selected_47.png";
		ImageIcon img47_S = new ImageIcon(Overview.class.getResource(path47_S));
		MouseAdapter ma47 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_47.setIcon(UI_Elements.scaleImageToButton(img47_R, overviewStadium_47));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_47.isSelected() != true)
		    	{
		    		overviewStadium_47.setIcon(UI_Elements.scaleImageToButton(img47, overviewStadium_47));
		    	}
		    	else
		    	{
		    		overviewStadium_47.setIcon(UI_Elements.scaleImageToButton(img47_S, overviewStadium_47));
		    	}
		    }
		};
		overviewStadium_47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_47, ma47, img47_S);
			}
		});
		overviewStadium_47.addMouseListener(ma47);
		
		
		overviewStadium_34 = new JButton();
		overviewStadium_34.setContentAreaFilled(false);
		overviewStadium_34.setOpaque(false);
		overviewStadium_34.setName("34");
		overviewStadium_34.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_34.setBorderPainted(false);
		overviewStadium_34.setFocusPainted(false);
		overviewStadium_34.setBorder(null);
		String path34 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(34) + "_34.png";
		ImageIcon img34 = new ImageIcon(Overview.class.getResource(path34));
		overviewStadium_34.setBounds(overviewStadium_41.getBounds().x, overviewStadium_41.getBounds().y - (int)(img34.getIconHeight()*stadiumSizeRatio), (int)(img34.getIconWidth()*stadiumSizeRatio), (int)(img34.getIconHeight()*stadiumSizeRatio));
		overviewStadium_34.setIcon(UI_Elements.scaleImageToButton(img34, overviewStadium_34));
		panelOverviewStadium.add(overviewStadium_34);
		String path34_R = "/Images/StadiumSlices/Stadium_Rollover_34.png";
		ImageIcon img34_R = new ImageIcon(Overview.class.getResource(path34_R));
		String path34_S = "/Images/StadiumSlices/Stadium_Selected_34.png";
		ImageIcon img34_S = new ImageIcon(Overview.class.getResource(path34_S));
		MouseAdapter ma34 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_34.setIcon(UI_Elements.scaleImageToButton(img34_R, overviewStadium_34));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_34.isSelected() != true)
		    	{
		    		overviewStadium_34.setIcon(UI_Elements.scaleImageToButton(img34, overviewStadium_34));
		    	}
		    	else
		    	{
		    		overviewStadium_34.setIcon(UI_Elements.scaleImageToButton(img34_S, overviewStadium_34));
		    	}
		    }
		};
		overviewStadium_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_34, ma34, img34_S);
			}
		});
		overviewStadium_34.addMouseListener(ma34);
		
		
		overviewStadium_35 = new JButton();
		overviewStadium_35.setContentAreaFilled(false);
		overviewStadium_35.setOpaque(false);
		overviewStadium_35.setName("35");
		overviewStadium_35.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_35.setBorderPainted(false);
		overviewStadium_35.setFocusPainted(false);
		overviewStadium_35.setBorder(null);
		String path35 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(35) + "_35.png";
		ImageIcon img35 = new ImageIcon(Overview.class.getResource(path35));
		overviewStadium_35.setBounds(overviewStadium_34.getBounds().x + overviewStadium_34.getBounds().width, overviewStadium_34.getBounds().y, (int)(img35.getIconWidth()*stadiumSizeRatio), (int)(img35.getIconHeight()*stadiumSizeRatio));
		overviewStadium_35.setIcon(UI_Elements.scaleImageToButton(img35, overviewStadium_35));
		panelOverviewStadium.add(overviewStadium_35);
		String path35_R = "/Images/StadiumSlices/Stadium_Rollover_35.png";
		ImageIcon img35_R = new ImageIcon(Overview.class.getResource(path35_R));
		String path35_S = "/Images/StadiumSlices/Stadium_Selected_35.png";
		ImageIcon img35_S = new ImageIcon(Overview.class.getResource(path35_S));
		MouseAdapter ma35 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_35.setIcon(UI_Elements.scaleImageToButton(img35_R, overviewStadium_35));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_35.isSelected() != true)
		    	{
		    		overviewStadium_35.setIcon(UI_Elements.scaleImageToButton(img35, overviewStadium_35));
		    	}
		    	else
		    	{
		    		overviewStadium_35.setIcon(UI_Elements.scaleImageToButton(img35_S, overviewStadium_35));
		    	}
		    }
		};
		overviewStadium_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_35, ma35, img35_S);
			}
		});
		overviewStadium_35.addMouseListener(ma35);
		
		
		overviewStadium_36 = new JButton();
		overviewStadium_36.setContentAreaFilled(false);
		overviewStadium_36.setOpaque(false);
		overviewStadium_36.setName("36");
		overviewStadium_36.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_36.setBorderPainted(false);
		overviewStadium_36.setFocusPainted(false);
		overviewStadium_36.setBorder(null);
		String path36 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(36) + "_36.png";
		ImageIcon img36 = new ImageIcon(Overview.class.getResource(path36));
		overviewStadium_36.setBounds(overviewStadium_35.getBounds().x + overviewStadium_35.getBounds().width, overviewStadium_35.getBounds().y, (int)(img36.getIconWidth()*stadiumSizeRatio), (int)(img36.getIconHeight()*stadiumSizeRatio));
		overviewStadium_36.setIcon(UI_Elements.scaleImageToButton(img36, overviewStadium_36));
		panelOverviewStadium.add(overviewStadium_36);
		String path36_R = "/Images/StadiumSlices/Stadium_Rollover_36.png";
		ImageIcon img36_R = new ImageIcon(Overview.class.getResource(path36_R));
		String path36_S = "/Images/StadiumSlices/Stadium_Selected_36.png";
		ImageIcon img36_S = new ImageIcon(Overview.class.getResource(path36_S));
		MouseAdapter ma36 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_36.setIcon(UI_Elements.scaleImageToButton(img36_R, overviewStadium_36));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_36.isSelected() != true)
		    	{
		    		overviewStadium_36.setIcon(UI_Elements.scaleImageToButton(img36, overviewStadium_36));
		    	}
		    	else
		    	{
		    		overviewStadium_36.setIcon(UI_Elements.scaleImageToButton(img36_S, overviewStadium_36));
		    	}
		    }
		};
		overviewStadium_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_36, ma36, img36_S);
			}
		});
		overviewStadium_36.addMouseListener(ma36);
		
		
		overviewStadium_37 = new JButton();
		overviewStadium_37.setContentAreaFilled(false);
		overviewStadium_37.setOpaque(false);
		overviewStadium_37.setName("37");
		overviewStadium_37.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_37.setBorderPainted(false);
		overviewStadium_37.setFocusPainted(false);
		overviewStadium_37.setBorder(null);
		String path37 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(37) + "_37.png";
		ImageIcon img37 = new ImageIcon(Overview.class.getResource(path37));
		overviewStadium_37.setBounds(overviewStadium_36.getBounds().x + overviewStadium_36.getBounds().width, overviewStadium_36.getBounds().y, (int)(img37.getIconWidth()*stadiumSizeRatio), (int)(img37.getIconHeight()*stadiumSizeRatio));
		overviewStadium_37.setIcon(UI_Elements.scaleImageToButton(img37, overviewStadium_37));
		panelOverviewStadium.add(overviewStadium_37);
		String path37_R = "/Images/StadiumSlices/Stadium_Rollover_37.png";
		ImageIcon img37_R = new ImageIcon(Overview.class.getResource(path37_R));
		String path37_S = "/Images/StadiumSlices/Stadium_Selected_37.png";
		ImageIcon img37_S = new ImageIcon(Overview.class.getResource(path37_S));
		MouseAdapter ma37 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_37.setIcon(UI_Elements.scaleImageToButton(img37_R, overviewStadium_37));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_37.isSelected() != true)
		    	{
		    		overviewStadium_37.setIcon(UI_Elements.scaleImageToButton(img37, overviewStadium_37));
		    	}
		    	else
		    	{
		    		overviewStadium_37.setIcon(UI_Elements.scaleImageToButton(img37_S, overviewStadium_37));
		    	}
		    }
		};
		overviewStadium_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_37, ma37, img37_S);
			}
		});
		overviewStadium_37.addMouseListener(ma37);
		
		
		overviewStadium_38 = new JButton();
		overviewStadium_38.setContentAreaFilled(false);
		overviewStadium_38.setOpaque(false);
		overviewStadium_38.setName("38");
		overviewStadium_38.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_38.setBorderPainted(false);
		overviewStadium_38.setFocusPainted(false);
		overviewStadium_38.setBorder(null);
		String path38 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(38) + "_38.png";
		ImageIcon img38 = new ImageIcon(Overview.class.getResource(path38));
		overviewStadium_38.setBounds(overviewStadium_37.getBounds().x + overviewStadium_37.getBounds().width, overviewStadium_37.getBounds().y, (int)(img38.getIconWidth()*stadiumSizeRatio), (int)(img38.getIconHeight()*stadiumSizeRatio));
		overviewStadium_38.setIcon(UI_Elements.scaleImageToButton(img38, overviewStadium_38));
		panelOverviewStadium.add(overviewStadium_38);
		String path38_R = "/Images/StadiumSlices/Stadium_Rollover_38.png";
		ImageIcon img38_R = new ImageIcon(Overview.class.getResource(path38_R));
		String path38_S = "/Images/StadiumSlices/Stadium_Selected_38.png";
		ImageIcon img38_S = new ImageIcon(Overview.class.getResource(path38_S));
		MouseAdapter ma38 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_38.setIcon(UI_Elements.scaleImageToButton(img38_R, overviewStadium_38));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_38.isSelected() != true)
		    	{
		    		overviewStadium_38.setIcon(UI_Elements.scaleImageToButton(img38, overviewStadium_38));
		    	}
		    	else
		    	{
		    		overviewStadium_38.setIcon(UI_Elements.scaleImageToButton(img38_S, overviewStadium_38));
		    	}
		    }
		};
		overviewStadium_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_38, ma38, img38_S);
			}
		});
		overviewStadium_38.addMouseListener(ma38);
		
		
		overviewStadium_39 = new JButton();
		overviewStadium_39.setContentAreaFilled(false);
		overviewStadium_39.setOpaque(false);
		overviewStadium_39.setName("39");
		overviewStadium_39.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_39.setBorderPainted(false);
		overviewStadium_39.setFocusPainted(false);
		overviewStadium_39.setBorder(null);
		String path39 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(39) + "_39.png";
		ImageIcon img39 = new ImageIcon(Overview.class.getResource(path39));
		overviewStadium_39.setBounds(overviewStadium_38.getBounds().x + overviewStadium_38.getBounds().width, overviewStadium_38.getBounds().y, (int)(img39.getIconWidth()*stadiumSizeRatio), (int)(img39.getIconHeight()*stadiumSizeRatio));
		overviewStadium_39.setIcon(UI_Elements.scaleImageToButton(img39, overviewStadium_39));
		panelOverviewStadium.add(overviewStadium_39);
		String path39_R = "/Images/StadiumSlices/Stadium_Rollover_39.png";
		ImageIcon img39_R = new ImageIcon(Overview.class.getResource(path39_R));
		String path39_S = "/Images/StadiumSlices/Stadium_Selected_39.png";
		ImageIcon img39_S = new ImageIcon(Overview.class.getResource(path39_S));
		MouseAdapter ma39 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_39.setIcon(UI_Elements.scaleImageToButton(img39_R, overviewStadium_39));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_39.isSelected() != true)
		    	{
		    		overviewStadium_39.setIcon(UI_Elements.scaleImageToButton(img39, overviewStadium_39));
		    	}
		    	else
		    	{
		    		overviewStadium_39.setIcon(UI_Elements.scaleImageToButton(img39_S, overviewStadium_39));
		    	}
		    }
		};
		overviewStadium_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_39, ma39, img39_S);
			}
		});
		overviewStadium_39.addMouseListener(ma39);
		
		
		overviewStadium_40 = new JButton();
		overviewStadium_40.setContentAreaFilled(false);
		overviewStadium_40.setOpaque(false);
		overviewStadium_40.setName("40");
		overviewStadium_40.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_40.setBorderPainted(false);
		overviewStadium_40.setFocusPainted(false);
		overviewStadium_40.setBorder(null);
		String path40 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(40) + "_40.png";
		ImageIcon img40 = new ImageIcon(Overview.class.getResource(path40));
		overviewStadium_40.setBounds(overviewStadium_39.getBounds().x + overviewStadium_39.getBounds().width, overviewStadium_39.getBounds().y, (int)(img40.getIconWidth()*stadiumSizeRatio), (int)(img40.getIconHeight()*stadiumSizeRatio));
		overviewStadium_40.setIcon(UI_Elements.scaleImageToButton(img40, overviewStadium_40));
		panelOverviewStadium.add(overviewStadium_40);
		String path40_R = "/Images/StadiumSlices/Stadium_Rollover_40.png";
		ImageIcon img40_R = new ImageIcon(Overview.class.getResource(path40_R));
		String path40_S = "/Images/StadiumSlices/Stadium_Selected_40.png";
		ImageIcon img40_S = new ImageIcon(Overview.class.getResource(path40_S));
		MouseAdapter ma40 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_40.setIcon(UI_Elements.scaleImageToButton(img40_R, overviewStadium_40));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_40.isSelected() != true)
		    	{
		    		overviewStadium_40.setIcon(UI_Elements.scaleImageToButton(img40, overviewStadium_40));
		    	}
		    	else
		    	{
		    		overviewStadium_40.setIcon(UI_Elements.scaleImageToButton(img40_S, overviewStadium_40));
		    	}
		    }
		};
		overviewStadium_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_40, ma40, img40_S);
			}
		});
		overviewStadium_40.addMouseListener(ma40);
		
		
		overviewStadium_53 = new JButton();
		overviewStadium_53.setContentAreaFilled(false);
		overviewStadium_53.setOpaque(false);
		overviewStadium_53.setName("53");
		overviewStadium_53.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_53.setBorderPainted(false);
		overviewStadium_53.setFocusPainted(false);
		overviewStadium_53.setBorder(null);
		String path53 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(53) + "_53.png";
		ImageIcon img53 = new ImageIcon(Overview.class.getResource(path53));
		overviewStadium_53.setBounds(overviewStadium_40.getBounds().x + overviewStadium_40.getBounds().width, overviewStadium_51.getBounds().y, (int)(img53.getIconWidth()*stadiumSizeRatio), (int)(img53.getIconHeight()*stadiumSizeRatio));
		overviewStadium_53.setIcon(UI_Elements.scaleImageToButton(img53, overviewStadium_53));
		panelOverviewStadium.add(overviewStadium_53);
		String path53_R = "/Images/StadiumSlices/Stadium_Rollover_53.png";
		ImageIcon img53_R = new ImageIcon(Overview.class.getResource(path53_R));
		String path53_S = "/Images/StadiumSlices/Stadium_Selected_53.png";
		ImageIcon img53_S = new ImageIcon(Overview.class.getResource(path53_S));
		MouseAdapter ma53 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_53.setIcon(UI_Elements.scaleImageToButton(img53_R, overviewStadium_53));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_53.isSelected() != true)
		    	{
		    		overviewStadium_53.setIcon(UI_Elements.scaleImageToButton(img53, overviewStadium_53));
		    	}
		    	else
		    	{
		    		overviewStadium_53.setIcon(UI_Elements.scaleImageToButton(img53_S, overviewStadium_53));
		    	}
		    }
		};
		overviewStadium_53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_53, ma53, img53_S);
			}
		});
		overviewStadium_53.addMouseListener(ma53);
		
		
		overviewStadium_52 = new JButton();
		overviewStadium_52.setContentAreaFilled(false);
		overviewStadium_52.setOpaque(false);
		overviewStadium_52.setName("52");
		overviewStadium_52.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_52.setBorderPainted(false);
		overviewStadium_52.setFocusPainted(false);
		overviewStadium_52.setBorder(null);
		String path52 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(52) + "_52.png";
		ImageIcon img52 = new ImageIcon(Overview.class.getResource(path52));
		overviewStadium_52.setBounds(overviewStadium_40.getBounds().x + overviewStadium_40.getBounds().width, overviewStadium_50.getBounds().y, (int)(img52.getIconWidth()*stadiumSizeRatio), (int)(img52.getIconHeight()*stadiumSizeRatio));
		overviewStadium_52.setIcon(UI_Elements.scaleImageToButton(img52, overviewStadium_52));
		panelOverviewStadium.add(overviewStadium_52);
		String path52_R = "/Images/StadiumSlices/Stadium_Rollover_52.png";
		ImageIcon img52_R = new ImageIcon(Overview.class.getResource(path52_R));
		String path52_S = "/Images/StadiumSlices/Stadium_Selected_52.png";
		ImageIcon img52_S = new ImageIcon(Overview.class.getResource(path52_S));
		MouseAdapter ma52 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_52.setIcon(UI_Elements.scaleImageToButton(img52_R, overviewStadium_52));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_52.isSelected() != true)
		    	{
		    		overviewStadium_52.setIcon(UI_Elements.scaleImageToButton(img52, overviewStadium_52));
		    	}
		    	else
		    	{
		    		overviewStadium_52.setIcon(UI_Elements.scaleImageToButton(img52_S, overviewStadium_52));
		    	}
		    }
		};
		overviewStadium_52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(overviewStadium_52, ma52, img52_S);
			}
		});
		overviewStadium_52.addMouseListener(ma52);
		
		
		JLabel stadiumPitch = new JLabel();
		stadiumPitch.setBorder(null);
		String pathPitch = "/Images/StadiumSlices/StadiumPitch.png";
		ImageIcon imgPitch = new ImageIcon(Overview.class.getResource(pathPitch));
		stadiumPitch.setBounds(93, 81 , (int)(imgPitch.getIconWidth()*stadiumSizeRatio), (int)(imgPitch.getIconHeight()*stadiumSizeRatio));
		stadiumPitch.setIcon(UI_Elements.scaleImageTolabel(imgPitch, stadiumPitch));
		panelOverviewStadium.add(stadiumPitch);
		
		JLabel overviewStadiumBG = new JLabel();
		overviewStadiumBG.setBorder(null);
		panelOverviewStadium.add(overviewStadiumBG);
		String pathStadiumBG = "/Images/Stadium_BG.png";
		ImageIcon imgStadiumBG = new ImageIcon(Overview.class.getResource(pathStadiumBG));
		overviewStadiumBG.setBounds(0, 0, (int)(imgStadiumBG.getIconWidth()*stadiumSizeRatio)-4 , (int)(imgStadiumBG.getIconHeight()*stadiumSizeRatio)-2);
		overviewStadiumBG.setIcon(UI_Elements.scaleImageTolabel(imgStadiumBG, overviewStadiumBG));
		overviewStadiumBG.setVisible(true);
		
		JLabel overviewStadiumImg = new JLabel();
		overviewStadiumImg.setBorder(null);
		overviewStadiumImg.setBounds(0, 0, (int)stadiumLblWidth , (int)stadiumLblHeight);
		panelOverviewStadium.add(overviewStadiumImg);
	//	overviewStadiumImg.setIcon(UI_Elements.scaleImageTolabel(stadium, overviewStadium));
		overviewStadiumImg.setVisible(true);
		
	}

	
	public String getOverviewSectionType(int i_SectionNum) {
		
		String type = "";
		
		/*if(model.Stadiumtadium.getArenaSection(i_SectionNum).getSectionType() != null)
		{
			type = "_" + Stadium.getArenaSection(i_SectionNum).getSectionType();
		}*/
		
		return type;
		
	}
	
	public void stadiumSectionSelection(JButton i_Section, MouseAdapter i_SectionAdapter, ImageIcon i_selectedImg)
	{
		if(i_Section.isSelected() == false)
    	{
			if(numOfSelected > 0)
			{
				lastSelectedButton.setSelected(false);
				lastButtonMouseAdapter.mouseExited(null);
				numOfSelected = 0;
			}
			i_Section.setSelected(true);
			i_Section.setIcon(UI_Elements.scaleImageToButton(i_selectedImg, i_Section));
    		lastSelectedButton = i_Section;
    		lastButtonMouseAdapter = i_SectionAdapter;
			numOfSelected++;
    	}
		else
		{
			i_Section.setSelected(false);
			numOfSelected--;
		}
		
	}

}
