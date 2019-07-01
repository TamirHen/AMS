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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import model.Stadium;

public class OverviewStadium extends JPanel {
	
	public JPanel panelOverviewStadium;
	public JLabel overviewStadium;
	private ImageIcon stadium = new ImageIcon(Overview.class.getResource("/Images/Stadium3.png"));
	
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
	
	private int numOfSelected = 0;
	private JButton lastSelectedButton;
	private MouseAdapter lastAdapter;
	
	
	
	public OverviewStadium()
	{
	
		panelOverviewStadium = new JPanel();
		panelOverviewStadium.setBorder(null);
		panelOverviewStadium.setLayout(null);
		panelOverviewStadium.setBackground(UI_Elements.color_mainBackgroundColor);
		
		overviewStadium = new JLabel();
		overviewStadium.setBorder(null);
		double stadiumLblHeight = 412;
		double stadiumSizeRatio = (stadiumLblHeight/stadium.getIconHeight());
		double stadiumLblWidth = ((stadium.getIconWidth())*stadiumSizeRatio);
		overviewStadium.setBounds(0, 0, (int)stadiumLblWidth , (int)stadiumLblHeight);
		panelOverviewStadium.add(overviewStadium);
		overviewStadium.setVisible(true);
		
		panelOverviewStadium.setBounds(0, 0, overviewStadium.getBounds().width, overviewStadium.getBounds().height);		
		
		overviewStadium_49 = new JButton();
		overviewStadium_49.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_49.setBorderPainted(false);
		overviewStadium_49.setFocusPainted(false);
		overviewStadium_49.setBorder(null);
		String path49 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(49) + "_49.png";
		ImageIcon img49 = new ImageIcon(Overview.class.getResource(path49));
		overviewStadium_49.setBounds(overviewStadium.getBounds().x + (int)(535*stadiumSizeRatio), overviewStadium.getBounds().y + (int)(451*stadiumSizeRatio) , (int)(img49.getIconWidth()*stadiumSizeRatio), (int)(img49.getIconHeight()*stadiumSizeRatio));
		overviewStadium_49.setIcon(View.scaleImageToButton(img49, overviewStadium_49));
		panelOverviewStadium.add(overviewStadium_49);
		
		overviewStadium_19 = new JButton();
		overviewStadium_19.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_19.setBorderPainted(false);
		overviewStadium_19.setFocusPainted(false);
		overviewStadium_19.setBorder(null);
		String path19 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(19) + "_19.png";
		ImageIcon img19 = new ImageIcon(Overview.class.getResource(path19));
		overviewStadium_19.setBounds(overviewStadium_49.getBounds().x, overviewStadium_49.getBounds().y + overviewStadium_49.getBounds().height, (int)(img19.getIconWidth()*stadiumSizeRatio), (int)(img19.getIconHeight()*stadiumSizeRatio));
		overviewStadium_19.setIcon(View.scaleImageToButton(img19, overviewStadium_19));
		panelOverviewStadium.add(overviewStadium_19);
		
		overviewStadium_26 = new JButton();
		overviewStadium_26.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_26.setBorderPainted(false);
		overviewStadium_26.setFocusPainted(false);
		overviewStadium_26.setBorder(null);
		String path26 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(26) + "_26.png";
		ImageIcon img26 = new ImageIcon(Overview.class.getResource(path26));
		overviewStadium_26.setBounds(overviewStadium_19.getBounds().x, overviewStadium_19.getBounds().y + overviewStadium_19.getBounds().height, (int)(img26.getIconWidth()*stadiumSizeRatio), (int)(img26.getIconHeight()*stadiumSizeRatio));
		overviewStadium_26.setIcon(View.scaleImageToButton(img26, overviewStadium_26));
		panelOverviewStadium.add(overviewStadium_26);
		
		overviewStadium_28 = new JButton();
		overviewStadium_28.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_28.setBorderPainted(false);
		overviewStadium_28.setFocusPainted(false);
		overviewStadium_28.setBorder(null);
		String path28 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(28) + "_28.png";
		ImageIcon img28 = new ImageIcon(Overview.class.getResource(path28));
		overviewStadium_28.setBounds(overviewStadium_26.getBounds().x, overviewStadium_26.getBounds().y + overviewStadium_26.getBounds().height, (int)(img28.getIconWidth()*stadiumSizeRatio), (int)(img28.getIconHeight()*stadiumSizeRatio));
		overviewStadium_28.setIcon(View.scaleImageToButton(img28, overviewStadium_28));
		panelOverviewStadium.add(overviewStadium_28);
		
		overviewStadium_51 = new JButton();
		overviewStadium_51.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_51.setBorderPainted(false);
		overviewStadium_51.setFocusPainted(false);
		overviewStadium_51.setBorder(null);
		String path51 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(51) + "_51.png";
		ImageIcon img51 = new ImageIcon(Overview.class.getResource(path51));
		overviewStadium_51.setBounds(overviewStadium_26.getBounds().x, overviewStadium_28.getBounds().y + overviewStadium_28.getBounds().height, (int)(img51.getIconWidth()*stadiumSizeRatio), (int)(img51.getIconHeight()*stadiumSizeRatio));
		overviewStadium_51.setIcon(View.scaleImageToButton(img51, overviewStadium_51));
		panelOverviewStadium.add(overviewStadium_51);
		
		overviewStadium_48 = new JButton();
		overviewStadium_48.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_48.setBorderPainted(false);
		overviewStadium_48.setFocusPainted(false);
		overviewStadium_48.setBorder(null);
		String path48 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(48) + "_48.png";
		ImageIcon img48 = new ImageIcon(Overview.class.getResource(path48));
		overviewStadium_48.setBounds(overviewStadium.getBounds().x, overviewStadium.getBounds().y, (int)(img48.getIconWidth()*stadiumSizeRatio), (int)(img48.getIconHeight()*stadiumSizeRatio));
		overviewStadium_48.setIcon(View.scaleImageToButton(img48, overviewStadium_48));
		panelOverviewStadium.add(overviewStadium_48);
		
		overviewStadium_02 = new JButton();
		overviewStadium_02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_02.setBorderPainted(false);
		overviewStadium_02.setFocusPainted(false);
		overviewStadium_02.setBorder(null);
		String path02 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(2) + "_02.png";
		ImageIcon img02 = new ImageIcon(Overview.class.getResource(path02));
		overviewStadium_02.setBounds(overviewStadium_48.getBounds().x + overviewStadium_48.getBounds().width, overviewStadium.getBounds().y, (int)(img02.getIconWidth()*stadiumSizeRatio), (int)(img02.getIconHeight()*stadiumSizeRatio));
		overviewStadium_02.setIcon(View.scaleImageToButton(img02, overviewStadium_02));
		panelOverviewStadium.add(overviewStadium_02);
		String path02_R = "/Images/StadiumSlices/Stadium3_Rollover_02.png";
		ImageIcon img02_R = new ImageIcon(Overview.class.getResource(path02_R));
		String path02_S = "/Images/StadiumSlices/Stadium3_Selected_02.png";
		ImageIcon img02_S = new ImageIcon(Overview.class.getResource(path02_S));
		MouseAdapter ma02 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_02.setIcon(View.scaleImageToButton(img02_R, overviewStadium_02));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_02.isSelected() != true)
		    	{
		    		overviewStadium_02.setIcon(View.scaleImageToButton(img02, overviewStadium_02));
		    	}
		    	else
		    	{
		    		overviewStadium_02.setIcon(View.scaleImageToButton(img02_S, overviewStadium_02));
		    	}
		    }
		};
		overviewStadium_02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(overviewStadium_02.isSelected() != true)
		    	{
					if(numOfSelected > 0)
					{
						lastSelectedButton.setSelected(false);
						lastAdapter.mouseExited(null);
						numOfSelected = 0;
					}
					overviewStadium_02.setSelected(true);
		    		overviewStadium_02.setIcon(View.scaleImageToButton(img02_S, overviewStadium_02));
		    		lastSelectedButton = overviewStadium_02;
		    		lastAdapter = ma02;
					numOfSelected++;
		    	}
				else
				{
					overviewStadium_02.setSelected(false);
				}
			}
		});
		overviewStadium_02.addMouseListener(ma02);
		
		overviewStadium_03 = new JButton();
		overviewStadium_03.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_03.setBorderPainted(false);
		overviewStadium_03.setFocusPainted(false);
		overviewStadium_03.setBorder(null);
		String path03 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(3) + "_03.png";
		ImageIcon img03 = new ImageIcon(Overview.class.getResource(path03));
		overviewStadium_03.setBounds(overviewStadium_02.getBounds().x + overviewStadium_02.getBounds().width, overviewStadium.getBounds().y, (int)(img03.getIconWidth()*stadiumSizeRatio), (int)(img03.getIconHeight()*stadiumSizeRatio));
		overviewStadium_03.setIcon(View.scaleImageToButton(img03, overviewStadium_03));
		panelOverviewStadium.add(overviewStadium_03);
		String path03_R = "/Images/StadiumSlices/Stadium3_Rollover_03.png";
		ImageIcon img03_R = new ImageIcon(Overview.class.getResource(path03_R));
		String path03_S = "/Images/StadiumSlices/Stadium3_Selected_03.png";
		ImageIcon img03_S = new ImageIcon(Overview.class.getResource(path03_S));
		MouseAdapter ma03 =  new MouseAdapter(){
			public void mouseEntered( MouseEvent e ) {
				overviewStadium_03.setIcon(View.scaleImageToButton(img03_R, overviewStadium_03));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_03.isSelected() != true)
		    	{
		    		overviewStadium_03.setIcon(View.scaleImageToButton(img03, overviewStadium_03));
		    	}
		    	else
		    	{
		    		overviewStadium_03.setIcon(View.scaleImageToButton(img03_S, overviewStadium_03));
		    	}
		    }
		};
		overviewStadium_03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(overviewStadium_03.isSelected() != true)
		    	{
					if(numOfSelected > 0)
					{
						lastSelectedButton.setSelected(false);
						lastAdapter.mouseExited(null);
						numOfSelected = 0;
					}
					overviewStadium_03.setSelected(true);
		    		overviewStadium_03.setIcon(View.scaleImageToButton(img03_S, overviewStadium_03));
					lastSelectedButton = overviewStadium_03;
		    		lastAdapter = ma03;
					numOfSelected++;
		    	}
				else
				{
					overviewStadium_03.setSelected(false);
				}
			}
		});
		overviewStadium_03.addMouseListener(ma03);
		
		overviewStadium_04 = new JButton();
		overviewStadium_04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_04.setBorderPainted(false);
		overviewStadium_04.setFocusPainted(false);
		overviewStadium_04.setBorder(null);
		String path04 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(4) + "_04.png";
		ImageIcon img04 = new ImageIcon(Overview.class.getResource(path04));
		overviewStadium_04.setBounds(overviewStadium_03.getBounds().x + overviewStadium_03.getBounds().width, overviewStadium.getBounds().y, (int)(img04.getIconWidth()*stadiumSizeRatio), (int)(img04.getIconHeight()*stadiumSizeRatio));
		overviewStadium_04.setIcon(View.scaleImageToButton(img04, overviewStadium_04));
		panelOverviewStadium.add(overviewStadium_04);
		String path04_R = "/Images/StadiumSlices/Stadium3_Rollover_04.png";
		ImageIcon img04_R = new ImageIcon(Overview.class.getResource(path04_R));
		String path04_S = "/Images/StadiumSlices/Stadium3_Selected_04.png";
		ImageIcon img04_S = new ImageIcon(Overview.class.getResource(path04_S));
		MouseAdapter ma04 =  new MouseAdapter(){
			public void mouseEntered( MouseEvent e ) {
				overviewStadium_04.setIcon(View.scaleImageToButton(img04_R, overviewStadium_04));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(overviewStadium_04.isSelected() != true)
		    	{
		    		overviewStadium_04.setIcon(View.scaleImageToButton(img04, overviewStadium_04));
		    	}
		    	else
		    	{
		    		overviewStadium_04.setIcon(View.scaleImageToButton(img04_S, overviewStadium_04));
		    	}
		    }
		};
		overviewStadium_04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(overviewStadium_04.isSelected() != true)
		    	{
					if(numOfSelected > 0)
					{
						lastSelectedButton.setSelected(false);
						lastAdapter.mouseExited(null);
						numOfSelected = 0;
					}
					overviewStadium_04.setSelected(true);
		    		overviewStadium_04.setIcon(View.scaleImageToButton(img04_S, overviewStadium_04));
					lastSelectedButton = overviewStadium_04;
		    		lastAdapter = ma04;
					numOfSelected++;
		    	}
				else
				{
					overviewStadium_04.setSelected(false);
				}
			}
		});
		overviewStadium_04.addMouseListener(ma04);

		
		
		overviewStadium_05 = new JButton();
		overviewStadium_05.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_05.setBorderPainted(false);
		overviewStadium_05.setFocusPainted(false);
		overviewStadium_05.setBorder(null);
		String path05 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(5) + "_05.png";
		ImageIcon img05 = new ImageIcon(Overview.class.getResource(path05));
		overviewStadium_05.setBounds(overviewStadium_04.getBounds().x + overviewStadium_04.getBounds().width, overviewStadium.getBounds().y, (int)(img05.getIconWidth()*stadiumSizeRatio), (int)(img05.getIconHeight()*stadiumSizeRatio));
		overviewStadium_05.setIcon(View.scaleImageToButton(img05, overviewStadium_05));
		panelOverviewStadium.add(overviewStadium_05);

		
		overviewStadium_06 = new JButton();
		overviewStadium_06.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_06.setBorderPainted(false);
		overviewStadium_06.setFocusPainted(false);
		overviewStadium_06.setBorder(null);
		String path06 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(6) + "_06.png";
		ImageIcon img06 = new ImageIcon(Overview.class.getResource(path06));
		overviewStadium_06.setBounds(overviewStadium_05.getBounds().x + overviewStadium_05.getBounds().width, overviewStadium.getBounds().y, (int)(img06.getIconWidth()*stadiumSizeRatio), (int)(img06.getIconHeight()*stadiumSizeRatio));
		overviewStadium_06.setIcon(View.scaleImageToButton(img06, overviewStadium_06));
		panelOverviewStadium.add(overviewStadium_06);
		
		
		overviewStadium_07 = new JButton();
		overviewStadium_07.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_07.setBorderPainted(false);
		overviewStadium_07.setFocusPainted(false);
		overviewStadium_07.setBorder(null);
		String path07 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(7) + "_07.png";
		ImageIcon img07 = new ImageIcon(Overview.class.getResource(path07));
		overviewStadium_07.setBounds(overviewStadium_06.getBounds().x + overviewStadium_06.getBounds().width, overviewStadium.getBounds().y, (int)(img07.getIconWidth()*stadiumSizeRatio), (int)(img07.getIconHeight()*stadiumSizeRatio));
		overviewStadium_07.setIcon(View.scaleImageToButton(img07, overviewStadium_07));
		panelOverviewStadium.add(overviewStadium_07);
		
		overviewStadium_08 = new JButton();
		overviewStadium_08.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_08.setBorderPainted(false);
		overviewStadium_08.setFocusPainted(false);
		overviewStadium_08.setBorder(null);
		String path08 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(8) + "_08.png";
		ImageIcon img08 = new ImageIcon(Overview.class.getResource(path08));
		overviewStadium_08.setBounds(overviewStadium_07.getBounds().x + overviewStadium_07.getBounds().width, overviewStadium.getBounds().y, (int)(img08.getIconWidth()*stadiumSizeRatio), (int)(img08.getIconHeight()*stadiumSizeRatio));
		overviewStadium_08.setIcon(View.scaleImageToButton(img08, overviewStadium_08));
		panelOverviewStadium.add(overviewStadium_08);
		
		overviewStadium_10 = new JButton();
		overviewStadium_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_10.setBorderPainted(false);
		overviewStadium_10.setFocusPainted(false);
		overviewStadium_10.setBorder(null);
		String path10 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(10) + "_10.png";
		ImageIcon img10 = new ImageIcon(Overview.class.getResource(path10));
		overviewStadium_10.setBounds(overviewStadium.getBounds().x + (int)(1013*stadiumSizeRatio), overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img10.getIconWidth()*stadiumSizeRatio), (int)(img10.getIconHeight()*stadiumSizeRatio));
		overviewStadium_10.setIcon(View.scaleImageToButton(img10, overviewStadium_10));
		panelOverviewStadium.add(overviewStadium_10);
		
		overviewStadium_11 = new JButton();
		overviewStadium_11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_11.setBorderPainted(false);
		overviewStadium_11.setFocusPainted(false);
		overviewStadium_11.setBorder(null);
		String path11 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(11) + "_11.png";
		ImageIcon img11 = new ImageIcon(Overview.class.getResource(path11));
		overviewStadium_11.setBounds(overviewStadium_10.getBounds().x + overviewStadium_10.getBounds().width, overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img11.getIconWidth()*stadiumSizeRatio), (int)(img11.getIconHeight()*stadiumSizeRatio));
		overviewStadium_11.setIcon(View.scaleImageToButton(img11, overviewStadium_11));
		panelOverviewStadium.add(overviewStadium_11);
		
		overviewStadium_12 = new JButton();
		overviewStadium_12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_12.setBorderPainted(false);
		overviewStadium_12.setFocusPainted(false);
		overviewStadium_12.setBorder(null);
		String path12 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(12) + "_12.png";
		ImageIcon img12 = new ImageIcon(Overview.class.getResource(path12));
		overviewStadium_12.setBounds(overviewStadium_11.getBounds().x + overviewStadium_11.getBounds().width, overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img12.getIconWidth()*stadiumSizeRatio), (int)(img12.getIconHeight()*stadiumSizeRatio));
		overviewStadium_12.setIcon(View.scaleImageToButton(img12, overviewStadium_12));
		panelOverviewStadium.add(overviewStadium_12);
		
		overviewStadium_13 = new JButton();
		overviewStadium_13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_13.setBorderPainted(false);
		overviewStadium_13.setFocusPainted(false);
		overviewStadium_13.setBorder(null);
		String path13 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(13) + "_13.png";
		ImageIcon img13 = new ImageIcon(Overview.class.getResource(path13));
		overviewStadium_13.setBounds(overviewStadium_12.getBounds().x + overviewStadium_12.getBounds().width, overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img13.getIconWidth()*stadiumSizeRatio), (int)(img13.getIconHeight()*stadiumSizeRatio));
		overviewStadium_13.setIcon(View.scaleImageToButton(img13, overviewStadium_13));
		panelOverviewStadium.add(overviewStadium_13);
		
		overviewStadium_14 = new JButton();
		overviewStadium_14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_14.setBorderPainted(false);
		overviewStadium_14.setFocusPainted(false);
		overviewStadium_14.setBorder(null);
		String path14 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(14) + "_14.png";
		ImageIcon img14 = new ImageIcon(Overview.class.getResource(path14));
		overviewStadium_14.setBounds(overviewStadium_13.getBounds().x + overviewStadium_13.getBounds().width, overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img14.getIconWidth()*stadiumSizeRatio), (int)(img14.getIconHeight()*stadiumSizeRatio));
		overviewStadium_14.setIcon(View.scaleImageToButton(img14, overviewStadium_14));
		panelOverviewStadium.add(overviewStadium_14);
		
		overviewStadium_15 = new JButton();
		overviewStadium_15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_15.setBorderPainted(false);
		overviewStadium_15.setFocusPainted(false);
		overviewStadium_15.setBorder(null);
		String path15 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(15) + "_15.png";
		ImageIcon img15 = new ImageIcon(Overview.class.getResource(path15));
		overviewStadium_15.setBounds(overviewStadium_14.getBounds().x + overviewStadium_14.getBounds().width, overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img15.getIconWidth()*stadiumSizeRatio), (int)(img15.getIconHeight()*stadiumSizeRatio));
		overviewStadium_15.setIcon(View.scaleImageToButton(img15, overviewStadium_15));
		panelOverviewStadium.add(overviewStadium_15);
		
		overviewStadium_16 = new JButton();
		overviewStadium_16.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_16.setBorderPainted(false);
		overviewStadium_16.setFocusPainted(false);
		overviewStadium_16.setBorder(null);
		String path16 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(16) + "_16.png";
		ImageIcon img16 = new ImageIcon(Overview.class.getResource(path16));
		overviewStadium_16.setBounds(overviewStadium_15.getBounds().x + overviewStadium_15.getBounds().width, overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img16.getIconWidth()*stadiumSizeRatio), (int)(img16.getIconHeight()*stadiumSizeRatio));
		overviewStadium_16.setIcon(View.scaleImageToButton(img16, overviewStadium_16));
		panelOverviewStadium.add(overviewStadium_16);
				
		
		overviewStadium_55 = new JButton();
		overviewStadium_55.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_55.setBorderPainted(false);
		overviewStadium_55.setFocusPainted(false);
		overviewStadium_55.setBorder(null);
		String path55 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(55) + "_55.png";
		ImageIcon img55 = new ImageIcon(Overview.class.getResource(path55));
		overviewStadium_55.setBounds(overviewStadium_08.getBounds().x + overviewStadium_08.getBounds().width, overviewStadium_49.getBounds().y, (int)(img55.getIconWidth()*stadiumSizeRatio), (int)(img55.getIconHeight()*stadiumSizeRatio));
		overviewStadium_55.setIcon(View.scaleImageToButton(img55, overviewStadium_55));
		panelOverviewStadium.add(overviewStadium_55);
		
		overviewStadium_22 = new JButton();
		overviewStadium_22.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_22.setBorderPainted(false);
		overviewStadium_22.setFocusPainted(false);
		overviewStadium_22.setBorder(null);
		String path22 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(22) + "_22.png";
		ImageIcon img22 = new ImageIcon(Overview.class.getResource(path22));
		overviewStadium_22.setBounds(overviewStadium_55.getBounds().x + overviewStadium_55.getBounds().width - (int)(img22.getIconWidth()*stadiumSizeRatio), overviewStadium_55.getBounds().y + overviewStadium_55.getBounds().height, (int)(img22.getIconWidth()*stadiumSizeRatio), (int)(img22.getIconHeight()*stadiumSizeRatio));
		overviewStadium_22.setIcon(View.scaleImageToButton(img22, overviewStadium_22));
		panelOverviewStadium.add(overviewStadium_22);
		
		overviewStadium_27 = new JButton();
		overviewStadium_27.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_27.setBorderPainted(false);
		overviewStadium_27.setFocusPainted(false);
		overviewStadium_27.setBorder(null);
		String path27 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(27) + "_27.png";
		ImageIcon img27 = new ImageIcon(Overview.class.getResource(path27));
		overviewStadium_27.setBounds(overviewStadium_22.getBounds().x, overviewStadium_22.getBounds().y + overviewStadium_22.getBounds().height, (int)(img27.getIconWidth()*stadiumSizeRatio), (int)(img27.getIconHeight()*stadiumSizeRatio));
		overviewStadium_27.setIcon(View.scaleImageToButton(img27, overviewStadium_27));
		panelOverviewStadium.add(overviewStadium_27);
		
		overviewStadium_29 = new JButton();
		overviewStadium_29.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_29.setBorderPainted(false);
		overviewStadium_29.setFocusPainted(false);
		overviewStadium_29.setBorder(null);
		String path29 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(29) + "_29.png";
		ImageIcon img29 = new ImageIcon(Overview.class.getResource(path29));
		overviewStadium_29.setBounds(overviewStadium_27.getBounds().x, overviewStadium_27.getBounds().y + overviewStadium_27.getBounds().height, (int)(img29.getIconWidth()*stadiumSizeRatio), (int)(img29.getIconHeight()*stadiumSizeRatio));
		overviewStadium_29.setIcon(View.scaleImageToButton(img29, overviewStadium_29));
		panelOverviewStadium.add(overviewStadium_29);
		
		overviewStadium_54 = new JButton();
		overviewStadium_54.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_54.setBorderPainted(false);
		overviewStadium_54.setFocusPainted(false);
		overviewStadium_54.setBorder(null);
		String path54 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(54) + "_54.png";
		ImageIcon img54 = new ImageIcon(Overview.class.getResource(path54));
		overviewStadium_54.setBounds(overviewStadium_55.getBounds().x, overviewStadium.getBounds().y, (int)(img54.getIconWidth()*stadiumSizeRatio), (int)(img54.getIconHeight()*stadiumSizeRatio));
		overviewStadium_54.setIcon(View.scaleImageToButton(img54, overviewStadium_54));
		panelOverviewStadium.add(overviewStadium_54);
		
		overviewStadium_25 = new JButton();
		overviewStadium_25.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_25.setBorderPainted(false);
		overviewStadium_25.setFocusPainted(false);
		overviewStadium_25.setBorder(null);
		String path25 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(25) + "_25.png";
		ImageIcon img25 = new ImageIcon(Overview.class.getResource(path25));
		overviewStadium_25.setBounds(overviewStadium_29.getBounds().x + overviewStadium_29.getBounds().width, overviewStadium_54.getBounds().y + overviewStadium_54.getBounds().height, (int)(img25.getIconWidth()*stadiumSizeRatio), (int)(img25.getIconHeight()*stadiumSizeRatio));
		overviewStadium_25.setIcon(View.scaleImageToButton(img25, overviewStadium_25));
		panelOverviewStadium.add(overviewStadium_25);
	
		
		overviewStadium_24 = new JButton();
		overviewStadium_24.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_24.setBorderPainted(false);
		overviewStadium_24.setFocusPainted(false);
		overviewStadium_24.setBorder(null);
		String path24 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(24) + "_24.png";
		ImageIcon img24 = new ImageIcon(Overview.class.getResource(path24));
		overviewStadium_24.setBounds(overviewStadium_48.getBounds().x, overviewStadium_48.getBounds().y + overviewStadium_48.getBounds().height, (int)(img24.getIconWidth()*stadiumSizeRatio), (int)(img24.getIconHeight()*stadiumSizeRatio));
		overviewStadium_24.setIcon(View.scaleImageToButton(img24, overviewStadium_24));
		panelOverviewStadium.add(overviewStadium_24);
		
		overviewStadium_50 = new JButton();
		overviewStadium_50.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_50.setBorderPainted(false);
		overviewStadium_50.setFocusPainted(false);
		overviewStadium_50.setBorder(null);
		String path50 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(50) + "_50.png";
		ImageIcon img50 = new ImageIcon(Overview.class.getResource(path50));
		overviewStadium_50.setBounds(overviewStadium_24.getBounds().x, overviewStadium_24.getBounds().y + overviewStadium_24.getBounds().height - 2, (int)(img50.getIconWidth()*stadiumSizeRatio), (int)(img50.getIconHeight()*stadiumSizeRatio));
		overviewStadium_50.setIcon(View.scaleImageToButton(img50, overviewStadium_50));
		panelOverviewStadium.add(overviewStadium_50);
		
		overviewStadium_41 = new JButton();
		overviewStadium_41.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_41.setBorderPainted(false);
		overviewStadium_41.setFocusPainted(false);
		overviewStadium_41.setBorder(null);
		String path41 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(41) + "_41.png";
		ImageIcon img41 = new ImageIcon(Overview.class.getResource(path41));
		overviewStadium_41.setBounds(overviewStadium_50.getBounds().x + overviewStadium_50.getBounds().width, overviewStadium_50.getBounds().y + overviewStadium_50.getBounds().height - (int)(img41.getIconHeight()*stadiumSizeRatio), (int)(img41.getIconWidth()*stadiumSizeRatio), (int)(img41.getIconHeight()*stadiumSizeRatio));
		overviewStadium_41.setIcon(View.scaleImageToButton(img41, overviewStadium_41));
		panelOverviewStadium.add(overviewStadium_41);
		
		overviewStadium_42 = new JButton();
		overviewStadium_42.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_42.setBorderPainted(false);
		overviewStadium_42.setFocusPainted(false);
		overviewStadium_42.setBorder(null);
		String path42 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(42) + "_42.png";
		ImageIcon img42 = new ImageIcon(Overview.class.getResource(path42));
		overviewStadium_42.setBounds(overviewStadium_41.getBounds().x + overviewStadium_41.getBounds().width, overviewStadium_41.getBounds().y, (int)(img42.getIconWidth()*stadiumSizeRatio), (int)(img42.getIconHeight()*stadiumSizeRatio));
		overviewStadium_42.setIcon(View.scaleImageToButton(img42, overviewStadium_42));
		panelOverviewStadium.add(overviewStadium_42);
		
		overviewStadium_43 = new JButton();
		overviewStadium_43.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_43.setBorderPainted(false);
		overviewStadium_43.setFocusPainted(false);
		overviewStadium_43.setBorder(null);
		String path43 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(43) + "_43.png";
		ImageIcon img43 = new ImageIcon(Overview.class.getResource(path43));
		overviewStadium_43.setBounds(overviewStadium_42.getBounds().x + overviewStadium_42.getBounds().width, overviewStadium_42.getBounds().y, (int)(img43.getIconWidth()*stadiumSizeRatio), (int)(img43.getIconHeight()*stadiumSizeRatio));
		overviewStadium_43.setIcon(View.scaleImageToButton(img43, overviewStadium_43));
		panelOverviewStadium.add(overviewStadium_43);
		
		overviewStadium_44 = new JButton();
		overviewStadium_44.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_44.setBorderPainted(false);
		overviewStadium_44.setFocusPainted(false);
		overviewStadium_44.setBorder(null);
		String path44 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(44) + "_44.png";
		ImageIcon img44 = new ImageIcon(Overview.class.getResource(path44));
		overviewStadium_44.setBounds(overviewStadium_43.getBounds().x + overviewStadium_43.getBounds().width, overviewStadium_43.getBounds().y, (int)(img44.getIconWidth()*stadiumSizeRatio), (int)(img44.getIconHeight()*stadiumSizeRatio));
		overviewStadium_44.setIcon(View.scaleImageToButton(img44, overviewStadium_44));
		panelOverviewStadium.add(overviewStadium_44);
		
		overviewStadium_45 = new JButton();
		overviewStadium_45.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_45.setBorderPainted(false);
		overviewStadium_45.setFocusPainted(false);
		overviewStadium_45.setBorder(null);
		String path45 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(45) + "_45.png";
		ImageIcon img45 = new ImageIcon(Overview.class.getResource(path45));
		overviewStadium_45.setBounds(overviewStadium_44.getBounds().x + overviewStadium_44.getBounds().width, overviewStadium_44.getBounds().y, (int)(img45.getIconWidth()*stadiumSizeRatio), (int)(img45.getIconHeight()*stadiumSizeRatio));
		overviewStadium_45.setIcon(View.scaleImageToButton(img45, overviewStadium_45));
		panelOverviewStadium.add(overviewStadium_45);
		
		overviewStadium_46 = new JButton();
		overviewStadium_46.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_46.setBorderPainted(false);
		overviewStadium_46.setFocusPainted(false);
		overviewStadium_46.setBorder(null);
		String path46 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(46) + "_46.png";
		ImageIcon img46 = new ImageIcon(Overview.class.getResource(path46));
		overviewStadium_46.setBounds(overviewStadium_45.getBounds().x + overviewStadium_45.getBounds().width, overviewStadium_45.getBounds().y, (int)(img46.getIconWidth()*stadiumSizeRatio), (int)(img46.getIconHeight()*stadiumSizeRatio));
		overviewStadium_46.setIcon(View.scaleImageToButton(img46, overviewStadium_46));
		panelOverviewStadium.add(overviewStadium_46);
		
		overviewStadium_47 = new JButton();
		overviewStadium_47.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_47.setBorderPainted(false);
		overviewStadium_47.setFocusPainted(false);
		overviewStadium_47.setBorder(null);
		String path47 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(47) + "_47.png";
		ImageIcon img47 = new ImageIcon(Overview.class.getResource(path47));
		overviewStadium_47.setBounds(overviewStadium_46.getBounds().x + overviewStadium_46.getBounds().width, overviewStadium_46.getBounds().y, (int)(img47.getIconWidth()*stadiumSizeRatio), (int)(img47.getIconHeight()*stadiumSizeRatio));
		overviewStadium_47.setIcon(View.scaleImageToButton(img47, overviewStadium_47));
		panelOverviewStadium.add(overviewStadium_47);
		
		overviewStadium_34 = new JButton();
		overviewStadium_34.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_34.setBorderPainted(false);
		overviewStadium_34.setFocusPainted(false);
		overviewStadium_34.setBorder(null);
		String path34 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(34) + "_34.png";
		ImageIcon img34 = new ImageIcon(Overview.class.getResource(path34));
		overviewStadium_34.setBounds(overviewStadium_41.getBounds().x, overviewStadium_41.getBounds().y - (int)(img34.getIconHeight()*stadiumSizeRatio), (int)(img34.getIconWidth()*stadiumSizeRatio), (int)(img34.getIconHeight()*stadiumSizeRatio));
		overviewStadium_34.setIcon(View.scaleImageToButton(img34, overviewStadium_34));
		panelOverviewStadium.add(overviewStadium_34);
		
		overviewStadium_35 = new JButton();
		overviewStadium_35.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_35.setBorderPainted(false);
		overviewStadium_35.setFocusPainted(false);
		overviewStadium_35.setBorder(null);
		String path35 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(35) + "_35.png";
		ImageIcon img35 = new ImageIcon(Overview.class.getResource(path35));
		overviewStadium_35.setBounds(overviewStadium_34.getBounds().x + overviewStadium_34.getBounds().width, overviewStadium_34.getBounds().y, (int)(img35.getIconWidth()*stadiumSizeRatio), (int)(img35.getIconHeight()*stadiumSizeRatio));
		overviewStadium_35.setIcon(View.scaleImageToButton(img35, overviewStadium_35));
		panelOverviewStadium.add(overviewStadium_35);
		
		overviewStadium_36 = new JButton();
		overviewStadium_36.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_36.setBorderPainted(false);
		overviewStadium_36.setFocusPainted(false);
		overviewStadium_36.setBorder(null);
		String path36 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(36) + "_36.png";
		ImageIcon img36 = new ImageIcon(Overview.class.getResource(path36));
		overviewStadium_36.setBounds(overviewStadium_35.getBounds().x + overviewStadium_35.getBounds().width, overviewStadium_35.getBounds().y, (int)(img36.getIconWidth()*stadiumSizeRatio), (int)(img36.getIconHeight()*stadiumSizeRatio));
		overviewStadium_36.setIcon(View.scaleImageToButton(img36, overviewStadium_36));
		panelOverviewStadium.add(overviewStadium_36);
		
		overviewStadium_37 = new JButton();
		overviewStadium_37.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_37.setBorderPainted(false);
		overviewStadium_37.setFocusPainted(false);
		overviewStadium_37.setBorder(null);
		String path37 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(37) + "_37.png";
		ImageIcon img37 = new ImageIcon(Overview.class.getResource(path37));
		overviewStadium_37.setBounds(overviewStadium_36.getBounds().x + overviewStadium_36.getBounds().width, overviewStadium_36.getBounds().y, (int)(img37.getIconWidth()*stadiumSizeRatio), (int)(img37.getIconHeight()*stadiumSizeRatio));
		overviewStadium_37.setIcon(View.scaleImageToButton(img37, overviewStadium_37));
		panelOverviewStadium.add(overviewStadium_37);
		
		overviewStadium_38 = new JButton();
		overviewStadium_38.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_38.setBorderPainted(false);
		overviewStadium_38.setFocusPainted(false);
		overviewStadium_38.setBorder(null);
		String path38 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(38) + "_38.png";
		ImageIcon img38 = new ImageIcon(Overview.class.getResource(path38));
		overviewStadium_38.setBounds(overviewStadium_37.getBounds().x + overviewStadium_37.getBounds().width, overviewStadium_37.getBounds().y, (int)(img38.getIconWidth()*stadiumSizeRatio), (int)(img38.getIconHeight()*stadiumSizeRatio));
		overviewStadium_38.setIcon(View.scaleImageToButton(img38, overviewStadium_38));
		panelOverviewStadium.add(overviewStadium_38);
		
		overviewStadium_39 = new JButton();
		overviewStadium_39.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_39.setBorderPainted(false);
		overviewStadium_39.setFocusPainted(false);
		overviewStadium_39.setBorder(null);
		String path39 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(39) + "_39.png";
		ImageIcon img39 = new ImageIcon(Overview.class.getResource(path39));
		overviewStadium_39.setBounds(overviewStadium_38.getBounds().x + overviewStadium_38.getBounds().width, overviewStadium_38.getBounds().y, (int)(img39.getIconWidth()*stadiumSizeRatio), (int)(img39.getIconHeight()*stadiumSizeRatio));
		overviewStadium_39.setIcon(View.scaleImageToButton(img39, overviewStadium_39));
		panelOverviewStadium.add(overviewStadium_39);
		
		overviewStadium_40 = new JButton();
		overviewStadium_40.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_40.setBorderPainted(false);
		overviewStadium_40.setFocusPainted(false);
		overviewStadium_40.setBorder(null);
		String path40 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(40) + "_40.png";
		ImageIcon img40 = new ImageIcon(Overview.class.getResource(path40));
		overviewStadium_40.setBounds(overviewStadium_39.getBounds().x + overviewStadium_39.getBounds().width, overviewStadium_39.getBounds().y, (int)(img40.getIconWidth()*stadiumSizeRatio), (int)(img40.getIconHeight()*stadiumSizeRatio));
		overviewStadium_40.setIcon(View.scaleImageToButton(img40, overviewStadium_40));
		panelOverviewStadium.add(overviewStadium_40);
		
		overviewStadium_53 = new JButton();
		overviewStadium_53.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_53.setBorderPainted(false);
		overviewStadium_53.setFocusPainted(false);
		overviewStadium_53.setBorder(null);
		String path53 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(53) + "_53.png";
		ImageIcon img53 = new ImageIcon(Overview.class.getResource(path53));
		overviewStadium_53.setBounds(overviewStadium_40.getBounds().x + overviewStadium_40.getBounds().width, overviewStadium_51.getBounds().y, (int)(img53.getIconWidth()*stadiumSizeRatio), (int)(img53.getIconHeight()*stadiumSizeRatio));
		overviewStadium_53.setIcon(View.scaleImageToButton(img53, overviewStadium_53));
		panelOverviewStadium.add(overviewStadium_53);
		
		overviewStadium_52 = new JButton();
		overviewStadium_52.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		overviewStadium_52.setBorderPainted(false);
		overviewStadium_52.setFocusPainted(false);
		overviewStadium_52.setBorder(null);
		String path52 = "/Images/StadiumSlices/Stadium3" + getOverviewSectionType(52) + "_52.png";
		ImageIcon img52 = new ImageIcon(Overview.class.getResource(path52));
		overviewStadium_52.setBounds(overviewStadium_40.getBounds().x + overviewStadium_40.getBounds().width, overviewStadium_50.getBounds().y, (int)(img52.getIconWidth()*stadiumSizeRatio), (int)(img52.getIconHeight()*stadiumSizeRatio));
		overviewStadium_52.setIcon(View.scaleImageToButton(img52, overviewStadium_52));
		panelOverviewStadium.add(overviewStadium_52);
		
		
		JLabel stadiumPitch3 = new JLabel();
		stadiumPitch3.setBorder(null);
		String pathPitch3 = "/Images/StadiumSlices/StadiumPitch3.png";
		ImageIcon imgPitch3 = new ImageIcon(Overview.class.getResource(pathPitch3));
		stadiumPitch3.setBounds(93, 81 , (int)(imgPitch3.getIconWidth()*stadiumSizeRatio), (int)(imgPitch3.getIconHeight()*stadiumSizeRatio));
		stadiumPitch3.setIcon(View.scaleImageTolabel(imgPitch3, stadiumPitch3));
		panelOverviewStadium.add(stadiumPitch3);
		
		JLabel overviewStadiumImg = new JLabel();
		overviewStadiumImg.setBorder(null);
		overviewStadiumImg.setBounds(0, 0, (int)stadiumLblWidth , (int)stadiumLblHeight);
		panelOverviewStadium.add(overviewStadiumImg);
	//	overviewStadiumImg.setIcon(View.scaleImageTolabel(stadium, overviewStadium));
		overviewStadiumImg.setVisible(true);
		
	}

	public String getOverviewSectionType(int i_SectionNum) {
		
		String type = "";
		
		/*if(model.Stadiumtadium.getArenaSection(i_SectionNum).getSectionType() != null)
		{
			type = Stadium.getArenaSection(i_SectionNum).getSectionType();
		}*/
		
		return type;
		
	}

}
