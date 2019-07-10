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
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import model.Model;
import model.Stadium;

public class ViewStadium extends JPanel {
	
	public JPanel panelViewStadium;
	public JLabel viewStadium;
	private ImageIcon stadium = new ImageIcon(Overview.class.getResource("/Images/Stadium.png"));
	
	public JButton viewStadium_02;
	public JButton viewStadium_03;
	public JButton viewStadium_04;
	public JButton viewStadium_05;
	public JButton viewStadium_06;
	public JButton viewStadium_07;
	public JButton viewStadium_08;
	public JButton viewStadium_10;
	public JButton viewStadium_11;
	public JButton viewStadium_12;
	public JButton viewStadium_13;
	public JButton viewStadium_14;
	public JButton viewStadium_15;
	public JButton viewStadium_16;
	public JButton viewStadium_19;
	public JButton viewStadium_22;
	public JButton viewStadium_23;
	public JButton viewStadium_24;
	public JButton viewStadium_25;
	public JButton viewStadium_26;
	public JButton viewStadium_27;
	public JButton viewStadium_28;
	public JButton viewStadium_29;
	public JButton viewStadium_34;
	public JButton viewStadium_35;
	public JButton viewStadium_36;
	public JButton viewStadium_37;
	public JButton viewStadium_38;
	public JButton viewStadium_39;
	public JButton viewStadium_40;
	public JButton viewStadium_41;
	public JButton viewStadium_42;
	public JButton viewStadium_43;
	public JButton viewStadium_44;
	public JButton viewStadium_45;
	public JButton viewStadium_46;
	public JButton viewStadium_47;
	public JButton viewStadium_48;
	public JButton viewStadium_49;
	public JButton viewStadium_50;
	public JButton viewStadium_51;
	public JButton viewStadium_52;
	public JButton viewStadium_53;
	public JButton viewStadium_54;
	public JButton viewStadium_55;
	
	private List<JButton> sectionList = new ArrayList<JButton>();
	
	public double stadiumLblHeight = 412;
	public double stadiumSizeRatio = (stadiumLblHeight/stadium.getIconHeight());
	public double stadiumLblWidth = ((stadium.getIconWidth())*stadiumSizeRatio);	
	
	public int numOfSelected = 0;
	public JButton lastSelectedButton;
	private MouseAdapter lastButtonMouseAdapter;
	
	
	public JPanel detailsPanel;
	
	
	public ViewStadium()
	{
	
		panelViewStadium = new JPanel();
		panelViewStadium.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panelViewStadium.setBorder(null);
		panelViewStadium.setLayout(null);
		panelViewStadium.setBackground(UI_Elements.color_mainBackgroundColor);	
		panelViewStadium.setBounds(0, 0, (int)stadiumLblWidth, (int)stadiumLblHeight);	
		
		viewStadium_49 = new JButton();
		viewStadium_49.setEnabled(false);
		viewStadium_49.setContentAreaFilled(false);
		viewStadium_49.setOpaque(false);
		viewStadium_49.setName("49");
		viewStadium_49.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_49.setBorderPainted(false);
		viewStadium_49.setFocusPainted(false);
		viewStadium_49.setBorder(null);
		String path49 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(49) + "_49.png";
		ImageIcon img49 = new ImageIcon(Overview.class.getResource(path49));
		viewStadium_49.setBounds(panelViewStadium.getBounds().x + (int)(535*stadiumSizeRatio), panelViewStadium.getBounds().y + (int)(451*stadiumSizeRatio) , (int)(img49.getIconWidth()*stadiumSizeRatio), (int)(img49.getIconHeight()*stadiumSizeRatio));
		viewStadium_49.setIcon(UI_Elements.scaleImageToButton(img49, viewStadium_49));
		panelViewStadium.add(viewStadium_49);
		String path49_R = "/Images/StadiumSlices/Stadium_Rollover_49.png";
		ImageIcon img49_R = new ImageIcon(Overview.class.getResource(path49_R));
		String path49_S = "/Images/StadiumSlices/Stadium_Selected_49.png";
		ImageIcon img49_S = new ImageIcon(Overview.class.getResource(path49_S));
		MouseAdapter ma49 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_49.setIcon(UI_Elements.scaleImageToButton(img49_R, viewStadium_49));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_49.isSelected() != true)
		    	{
		    		viewStadium_49.setIcon(UI_Elements.scaleImageToButton(img49, viewStadium_49));
		    	}
		    	else
		    	{
		    		viewStadium_49.setIcon(UI_Elements.scaleImageToButton(img49_S, viewStadium_49));
		    	}
		    }
		};
		viewStadium_49.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_49, ma49, img49_S);
			}
		});
		viewStadium_49.addMouseListener(ma49);

		
		
		viewStadium_19 = new JButton();
		viewStadium_19.setEnabled(false);
		viewStadium_19.setContentAreaFilled(false);
		viewStadium_19.setOpaque(false);
		viewStadium_19.setName("19");
		viewStadium_19.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_19.setBorderPainted(false);
		viewStadium_19.setFocusPainted(false);
		viewStadium_19.setBorder(null);
		String path19 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(19) + "_19.png";
		ImageIcon img19 = new ImageIcon(Overview.class.getResource(path19));
		viewStadium_19.setBounds(viewStadium_49.getBounds().x, viewStadium_49.getBounds().y + viewStadium_49.getBounds().height, (int)(img19.getIconWidth()*stadiumSizeRatio), (int)(img19.getIconHeight()*stadiumSizeRatio));
		viewStadium_19.setIcon(UI_Elements.scaleImageToButton(img19, viewStadium_19));
		panelViewStadium.add(viewStadium_19);
		String path19_R = "/Images/StadiumSlices/Stadium_Rollover_19.png";
		ImageIcon img19_R = new ImageIcon(Overview.class.getResource(path19_R));
		String path19_S = "/Images/StadiumSlices/Stadium_Selected_19.png";
		ImageIcon img19_S = new ImageIcon(Overview.class.getResource(path19_S));
		MouseAdapter ma19 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_19.setIcon(UI_Elements.scaleImageToButton(img19_R, viewStadium_19));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_19.isSelected() != true)
		    	{
		    		viewStadium_19.setIcon(UI_Elements.scaleImageToButton(img19, viewStadium_19));
		    	}
		    	else
		    	{
		    		viewStadium_19.setIcon(UI_Elements.scaleImageToButton(img19_S, viewStadium_19));
		    	}
		    }
		};
		viewStadium_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_19, ma19, img19_S);
			}
		});
		viewStadium_19.addMouseListener(ma19);
		
		
		viewStadium_26 = new JButton();
		viewStadium_26.setEnabled(false);
		viewStadium_26.setContentAreaFilled(false);
		viewStadium_26.setOpaque(false);
		viewStadium_26.setName("26");
		viewStadium_26.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_26.setBorderPainted(false);
		viewStadium_26.setFocusPainted(false);
		viewStadium_26.setBorder(null);
		String path26 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(26) + "_26.png";
		ImageIcon img26 = new ImageIcon(Overview.class.getResource(path26));
		viewStadium_26.setBounds(viewStadium_19.getBounds().x, viewStadium_19.getBounds().y + viewStadium_19.getBounds().height, (int)(img26.getIconWidth()*stadiumSizeRatio), (int)(img26.getIconHeight()*stadiumSizeRatio));
		viewStadium_26.setIcon(UI_Elements.scaleImageToButton(img26, viewStadium_26));
		panelViewStadium.add(viewStadium_26);
		String path26_R = "/Images/StadiumSlices/Stadium_Rollover_26.png";
		ImageIcon img26_R = new ImageIcon(Overview.class.getResource(path26_R));
		String path26_S = "/Images/StadiumSlices/Stadium_Selected_26.png";
		ImageIcon img26_S = new ImageIcon(Overview.class.getResource(path26_S));
		MouseAdapter ma26 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_26.setIcon(UI_Elements.scaleImageToButton(img26_R, viewStadium_26));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_26.isSelected() != true)
		    	{
		    		viewStadium_26.setIcon(UI_Elements.scaleImageToButton(img26, viewStadium_26));
		    	}
		    	else
		    	{
		    		viewStadium_26.setIcon(UI_Elements.scaleImageToButton(img26_S, viewStadium_26));
		    	}
		    }
		};
		viewStadium_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_26, ma26, img26_S);
			}
		});
		viewStadium_26.addMouseListener(ma26);
		
		
		viewStadium_28 = new JButton();
		viewStadium_28.setEnabled(false);
		viewStadium_28.setContentAreaFilled(false);
		viewStadium_28.setOpaque(false);
		viewStadium_28.setName("28");
		viewStadium_28.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_28.setBorderPainted(false);
		viewStadium_28.setFocusPainted(false);
		viewStadium_28.setBorder(null);
		String path28 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(28) + "_28.png";
		ImageIcon img28 = new ImageIcon(Overview.class.getResource(path28));
		viewStadium_28.setBounds(viewStadium_26.getBounds().x, viewStadium_26.getBounds().y + viewStadium_26.getBounds().height, (int)(img28.getIconWidth()*stadiumSizeRatio), (int)(img28.getIconHeight()*stadiumSizeRatio));
		viewStadium_28.setIcon(UI_Elements.scaleImageToButton(img28, viewStadium_28));
		panelViewStadium.add(viewStadium_28);
		String path28_R = "/Images/StadiumSlices/Stadium_Rollover_28.png";
		ImageIcon img28_R = new ImageIcon(Overview.class.getResource(path28_R));
		String path28_S = "/Images/StadiumSlices/Stadium_Selected_28.png";
		ImageIcon img28_S = new ImageIcon(Overview.class.getResource(path28_S));
		MouseAdapter ma28 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_28.setIcon(UI_Elements.scaleImageToButton(img28_R, viewStadium_28));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_28.isSelected() != true)
		    	{
		    		viewStadium_28.setIcon(UI_Elements.scaleImageToButton(img28, viewStadium_28));
		    	}
		    	else
		    	{
		    		viewStadium_28.setIcon(UI_Elements.scaleImageToButton(img28_S, viewStadium_28));
		    	}
		    }
		};
		viewStadium_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_28, ma28, img28_S);
			}
		});
		viewStadium_28.addMouseListener(ma28);
		
		
		viewStadium_51 = new JButton();
		viewStadium_51.setEnabled(false);
		viewStadium_51.setContentAreaFilled(false);
		viewStadium_51.setOpaque(false);
		viewStadium_51.setName("51");
		viewStadium_51.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_51.setBorderPainted(false);
		viewStadium_51.setFocusPainted(false);
		viewStadium_51.setBorder(null);
		String path51 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(51) + "_51.png";
		ImageIcon img51 = new ImageIcon(Overview.class.getResource(path51));
		viewStadium_51.setBounds(viewStadium_26.getBounds().x, viewStadium_28.getBounds().y + viewStadium_28.getBounds().height, (int)(img51.getIconWidth()*stadiumSizeRatio), (int)(img51.getIconHeight()*stadiumSizeRatio));
		viewStadium_51.setIcon(UI_Elements.scaleImageToButton(img51, viewStadium_51));
		panelViewStadium.add(viewStadium_51);
		String path51_R = "/Images/StadiumSlices/Stadium_Rollover_51.png";
		ImageIcon img51_R = new ImageIcon(Overview.class.getResource(path51_R));
		String path51_S = "/Images/StadiumSlices/Stadium_Selected_51.png";
		ImageIcon img51_S = new ImageIcon(Overview.class.getResource(path51_S));
		MouseAdapter ma51 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_51.setIcon(UI_Elements.scaleImageToButton(img51_R, viewStadium_51));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_51.isSelected() != true)
		    	{
		    		viewStadium_51.setIcon(UI_Elements.scaleImageToButton(img51, viewStadium_51));
		    	}
		    	else
		    	{
		    		viewStadium_51.setIcon(UI_Elements.scaleImageToButton(img51_S, viewStadium_51));
		    	}
		    }
		};
		viewStadium_51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_51, ma51, img51_S);
			}
		});
		viewStadium_51.addMouseListener(ma51);
		
		
		viewStadium_48 = new JButton();
		viewStadium_48.setEnabled(false);
		viewStadium_48.setContentAreaFilled(false);
		viewStadium_48.setOpaque(false);
		viewStadium_48.setName("48");
		viewStadium_48.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_48.setBorderPainted(false);
		viewStadium_48.setFocusPainted(false);
		viewStadium_48.setBorder(null);
		String path48 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(48) + "_48.png";
		ImageIcon img48 = new ImageIcon(Overview.class.getResource(path48));
		viewStadium_48.setBounds(panelViewStadium.getBounds().x, panelViewStadium.getBounds().y, (int)(img48.getIconWidth()*stadiumSizeRatio), (int)(img48.getIconHeight()*stadiumSizeRatio));
		viewStadium_48.setIcon(UI_Elements.scaleImageToButton(img48, viewStadium_48));
		panelViewStadium.add(viewStadium_48);
		String path48_R = "/Images/StadiumSlices/Stadium_Rollover_48.png";
		ImageIcon img48_R = new ImageIcon(Overview.class.getResource(path48_R));
		String path48_S = "/Images/StadiumSlices/Stadium_Selected_48.png";
		ImageIcon img48_S = new ImageIcon(Overview.class.getResource(path48_S));
		MouseAdapter ma48 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_48.setIcon(UI_Elements.scaleImageToButton(img48_R, viewStadium_48));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_48.isSelected() != true)
		    	{
		    		viewStadium_48.setIcon(UI_Elements.scaleImageToButton(img48, viewStadium_48));
		    	}
		    	else
		    	{
		    		viewStadium_48.setIcon(UI_Elements.scaleImageToButton(img48_S, viewStadium_48));
		    	}
		    }
		};
		viewStadium_48.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_48, ma48, img48_S);
			}
		});
		viewStadium_48.addMouseListener(ma48);
		
		
		viewStadium_02 = new JButton();
		viewStadium_02.setEnabled(false);
		viewStadium_02.setContentAreaFilled(false);
		viewStadium_02.setOpaque(false);
		viewStadium_02.setName("2");
		viewStadium_02.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_02.setBorderPainted(false);
		viewStadium_02.setFocusPainted(false);
		viewStadium_02.setBorder(null);
		String path02 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(2) + "_02.png";
		ImageIcon img02 = new ImageIcon(Overview.class.getResource(path02));
		viewStadium_02.setBounds(viewStadium_48.getBounds().x + viewStadium_48.getBounds().width, panelViewStadium.getBounds().y, (int)(img02.getIconWidth()*stadiumSizeRatio), (int)(img02.getIconHeight()*stadiumSizeRatio));
		viewStadium_02.setIcon(UI_Elements.scaleImageToButton(img02, viewStadium_02));
		panelViewStadium.add(viewStadium_02);
		String path02_R = "/Images/StadiumSlices/Stadium_Rollover_02.png";
		ImageIcon img02_R = new ImageIcon(Overview.class.getResource(path02_R));
		String path02_S = "/Images/StadiumSlices/Stadium_Selected_02.png";
		ImageIcon img02_S = new ImageIcon(Overview.class.getResource(path02_S));
		MouseAdapter ma02 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_02.setIcon(UI_Elements.scaleImageToButton(img02_R, viewStadium_02));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_02.isSelected() != true)
		    	{
		    		viewStadium_02.setIcon(UI_Elements.scaleImageToButton(img02, viewStadium_02));
		    	}
		    	else
		    	{
		    		viewStadium_02.setIcon(UI_Elements.scaleImageToButton(img02_S, viewStadium_02));
		    	}
		    }
		};
		viewStadium_02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_02, ma02, img02_S);
			}
		});
		viewStadium_02.addMouseListener(ma02);
		
		viewStadium_03 = new JButton();
		viewStadium_03.setEnabled(false);
		viewStadium_03.setContentAreaFilled(false);
		viewStadium_03.setOpaque(false);
		viewStadium_03.setName("3");
		viewStadium_03.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_03.setBorderPainted(false);
		viewStadium_03.setFocusPainted(false);
		viewStadium_03.setBorder(null);
		String path03 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(3) + "_03.png";
		ImageIcon img03 = new ImageIcon(Overview.class.getResource(path03));
		viewStadium_03.setBounds(viewStadium_02.getBounds().x + viewStadium_02.getBounds().width, panelViewStadium.getBounds().y, (int)(img03.getIconWidth()*stadiumSizeRatio), (int)(img03.getIconHeight()*stadiumSizeRatio));
		viewStadium_03.setIcon(UI_Elements.scaleImageToButton(img03, viewStadium_03));
		panelViewStadium.add(viewStadium_03);
		String path03_R = "/Images/StadiumSlices/Stadium_Rollover_03.png";
		ImageIcon img03_R = new ImageIcon(Overview.class.getResource(path03_R));
		String path03_S = "/Images/StadiumSlices/Stadium_Selected_03.png";
		ImageIcon img03_S = new ImageIcon(Overview.class.getResource(path03_S));
		MouseAdapter ma03 =  new MouseAdapter(){
			public void mouseEntered( MouseEvent e ) {
				viewStadium_03.setIcon(UI_Elements.scaleImageToButton(img03_R, viewStadium_03));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_03.isSelected() != true)
		    	{
		    		viewStadium_03.setIcon(UI_Elements.scaleImageToButton(img03, viewStadium_03));
		    	}
		    	else
		    	{
		    		viewStadium_03.setIcon(UI_Elements.scaleImageToButton(img03_S, viewStadium_03));
		    	}
		    }
		};
		viewStadium_03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_03, ma03, img03_S);
			}
		});
		viewStadium_03.addMouseListener(ma03);
		
		viewStadium_04 = new JButton();
		viewStadium_04.setEnabled(false);
		viewStadium_04.setContentAreaFilled(false);
		viewStadium_04.setOpaque(false);
		viewStadium_04.setName("4");
		viewStadium_04.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_04.setBorderPainted(false);
		viewStadium_04.setFocusPainted(false);
		viewStadium_04.setBorder(null);
		String path04 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(4) + "_04.png";
		ImageIcon img04 = new ImageIcon(Overview.class.getResource(path04));
		viewStadium_04.setBounds(viewStadium_03.getBounds().x + viewStadium_03.getBounds().width, panelViewStadium.getBounds().y, (int)(img04.getIconWidth()*stadiumSizeRatio), (int)(img04.getIconHeight()*stadiumSizeRatio));
		viewStadium_04.setIcon(UI_Elements.scaleImageToButton(img04, viewStadium_04));
		panelViewStadium.add(viewStadium_04);
		String path04_R = "/Images/StadiumSlices/Stadium_Rollover_04.png";
		ImageIcon img04_R = new ImageIcon(Overview.class.getResource(path04_R));
		String path04_S = "/Images/StadiumSlices/Stadium_Selected_04.png";
		ImageIcon img04_S = new ImageIcon(Overview.class.getResource(path04_S));
		MouseAdapter ma04 =  new MouseAdapter(){
			public void mouseEntered( MouseEvent e ) {
				viewStadium_04.setIcon(UI_Elements.scaleImageToButton(img04_R, viewStadium_04));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_04.isSelected() != true)
		    	{
		    		viewStadium_04.setIcon(UI_Elements.scaleImageToButton(img04, viewStadium_04));
		    	}
		    	else
		    	{
		    		viewStadium_04.setIcon(UI_Elements.scaleImageToButton(img04_S, viewStadium_04));
		    	}
		    }
		};
		viewStadium_04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_04, ma04, img04_S);
			}
		});
		viewStadium_04.addMouseListener(ma04);

		
		
		viewStadium_05 = new JButton();
		viewStadium_05.setEnabled(false);
		viewStadium_05.setContentAreaFilled(false);
		viewStadium_05.setOpaque(false);
		viewStadium_05.setName("5");
		viewStadium_05.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_05.setBorderPainted(false);
		viewStadium_05.setFocusPainted(false);
		viewStadium_05.setBorder(null);
		String path05 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(5) + "_05.png";
		ImageIcon img05 = new ImageIcon(Overview.class.getResource(path05));
		viewStadium_05.setBounds(viewStadium_04.getBounds().x + viewStadium_04.getBounds().width, panelViewStadium.getBounds().y, (int)(img05.getIconWidth()*stadiumSizeRatio), (int)(img05.getIconHeight()*stadiumSizeRatio));
		viewStadium_05.setIcon(UI_Elements.scaleImageToButton(img05, viewStadium_05));
		panelViewStadium.add(viewStadium_05);
		String path05_R = "/Images/StadiumSlices/Stadium_Rollover_05.png";
		ImageIcon img05_R = new ImageIcon(Overview.class.getResource(path05_R));
		String path05_S = "/Images/StadiumSlices/Stadium_Selected_05.png";
		ImageIcon img05_S = new ImageIcon(Overview.class.getResource(path05_S));
		MouseAdapter ma05 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_05.setIcon(UI_Elements.scaleImageToButton(img05_R, viewStadium_05));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_05.isSelected() != true)
		    	{
		    		viewStadium_05.setIcon(UI_Elements.scaleImageToButton(img05, viewStadium_05));
		    	}
		    	else
		    	{
		    		viewStadium_05.setIcon(UI_Elements.scaleImageToButton(img05_S, viewStadium_05));
		    	}
		    }
		};
		viewStadium_05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_05, ma05, img05_S);
			}
		});
		viewStadium_05.addMouseListener(ma05);
		

		
		viewStadium_06 = new JButton();
		viewStadium_06.setEnabled(false);
		viewStadium_06.setContentAreaFilled(false);
		viewStadium_06.setOpaque(false);
		viewStadium_06.setName("6");
		viewStadium_06.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_06.setBorderPainted(false);
		viewStadium_06.setFocusPainted(false);
		viewStadium_06.setBorder(null);
		String path06 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(6) + "_06.png";
		ImageIcon img06 = new ImageIcon(Overview.class.getResource(path06));
		viewStadium_06.setBounds(viewStadium_05.getBounds().x + viewStadium_05.getBounds().width, panelViewStadium.getBounds().y, (int)(img06.getIconWidth()*stadiumSizeRatio), (int)(img06.getIconHeight()*stadiumSizeRatio));
		viewStadium_06.setIcon(UI_Elements.scaleImageToButton(img06, viewStadium_06));
		panelViewStadium.add(viewStadium_06);
		String path06_R = "/Images/StadiumSlices/Stadium_Rollover_06.png";
		ImageIcon img06_R = new ImageIcon(Overview.class.getResource(path06_R));
		String path06_S = "/Images/StadiumSlices/Stadium_Selected_06.png";
		ImageIcon img06_S = new ImageIcon(Overview.class.getResource(path06_S));
		MouseAdapter ma06 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_06.setIcon(UI_Elements.scaleImageToButton(img06_R, viewStadium_06));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_06.isSelected() != true)
		    	{
		    		viewStadium_06.setIcon(UI_Elements.scaleImageToButton(img06, viewStadium_06));
		    	}
		    	else
		    	{
		    		viewStadium_06.setIcon(UI_Elements.scaleImageToButton(img06_S, viewStadium_06));
		    	}
		    }
		};
		viewStadium_06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_06, ma06, img06_S);
			}
		});
		viewStadium_06.addMouseListener(ma06);
		
		
		
		viewStadium_07 = new JButton();
		viewStadium_07.setEnabled(false);
		viewStadium_07.setContentAreaFilled(false);
		viewStadium_07.setOpaque(false);
		viewStadium_07.setName("7");
		viewStadium_07.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_07.setBorderPainted(false);
		viewStadium_07.setFocusPainted(false);
		viewStadium_07.setBorder(null);
		String path07 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(7) + "_07.png";
		ImageIcon img07 = new ImageIcon(Overview.class.getResource(path07));
		viewStadium_07.setBounds(viewStadium_06.getBounds().x + viewStadium_06.getBounds().width, panelViewStadium.getBounds().y, (int)(img07.getIconWidth()*stadiumSizeRatio), (int)(img07.getIconHeight()*stadiumSizeRatio));
		viewStadium_07.setIcon(UI_Elements.scaleImageToButton(img07, viewStadium_07));
		panelViewStadium.add(viewStadium_07);
		String path07_R = "/Images/StadiumSlices/Stadium_Rollover_07.png";
		ImageIcon img07_R = new ImageIcon(Overview.class.getResource(path07_R));
		String path07_S = "/Images/StadiumSlices/Stadium_Selected_07.png";
		ImageIcon img07_S = new ImageIcon(Overview.class.getResource(path07_S));
		MouseAdapter ma07 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_07.setIcon(UI_Elements.scaleImageToButton(img07_R, viewStadium_07));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_07.isSelected() != true)
		    	{
		    		viewStadium_07.setIcon(UI_Elements.scaleImageToButton(img07, viewStadium_07));
		    	}
		    	else
		    	{
		    		viewStadium_07.setIcon(UI_Elements.scaleImageToButton(img07_S, viewStadium_07));
		    	}
		    }
		};
		viewStadium_07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_07, ma07, img07_S);
			}
		});
		viewStadium_07.addMouseListener(ma07);
		
		
		viewStadium_08 = new JButton();
		viewStadium_08.setEnabled(false);
		viewStadium_08.setContentAreaFilled(false);
		viewStadium_08.setOpaque(false);
		viewStadium_08.setName("8");
		viewStadium_08.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_08.setBorderPainted(false);
		viewStadium_08.setFocusPainted(false);
		viewStadium_08.setBorder(null);
		String path08 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(8) + "_08.png";
		ImageIcon img08 = new ImageIcon(Overview.class.getResource(path08));
		viewStadium_08.setBounds(viewStadium_07.getBounds().x + viewStadium_07.getBounds().width, panelViewStadium.getBounds().y, (int)(img08.getIconWidth()*stadiumSizeRatio), (int)(img08.getIconHeight()*stadiumSizeRatio));
		viewStadium_08.setIcon(UI_Elements.scaleImageToButton(img08, viewStadium_08));
		panelViewStadium.add(viewStadium_08);
		String path08_R = "/Images/StadiumSlices/Stadium_Rollover_08.png";
		ImageIcon img08_R = new ImageIcon(Overview.class.getResource(path08_R));
		String path08_S = "/Images/StadiumSlices/Stadium_Selected_08.png";
		ImageIcon img08_S = new ImageIcon(Overview.class.getResource(path08_S));
		MouseAdapter ma08 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_08.setIcon(UI_Elements.scaleImageToButton(img08_R, viewStadium_08));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_08.isSelected() != true)
		    	{
		    		viewStadium_08.setIcon(UI_Elements.scaleImageToButton(img08, viewStadium_08));
		    	}
		    	else
		    	{
		    		viewStadium_08.setIcon(UI_Elements.scaleImageToButton(img08_S, viewStadium_08));
		    	}
		    }
		};
		viewStadium_08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_08, ma08, img08_S);
			}
		});
		viewStadium_08.addMouseListener(ma08);
		
		
		viewStadium_10 = new JButton();
		viewStadium_10.setEnabled(false);
		viewStadium_10.setContentAreaFilled(false);
		viewStadium_10.setOpaque(false);
		viewStadium_10.setName("10");
		viewStadium_10.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_10.setBorderPainted(false);
		viewStadium_10.setFocusPainted(false);
		viewStadium_10.setBorder(null);
		String path10 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(10) + "_10.png";
		ImageIcon img10 = new ImageIcon(Overview.class.getResource(path10));
		viewStadium_10.setBounds(panelViewStadium.getBounds().x + (int)(1013*stadiumSizeRatio), viewStadium_02.getBounds().y + viewStadium_07.getBounds().height, (int)(img10.getIconWidth()*stadiumSizeRatio), (int)(img10.getIconHeight()*stadiumSizeRatio));
		viewStadium_10.setIcon(UI_Elements.scaleImageToButton(img10, viewStadium_10));
		panelViewStadium.add(viewStadium_10);
		String path10_R = "/Images/StadiumSlices/Stadium_Rollover_10.png";
		ImageIcon img10_R = new ImageIcon(Overview.class.getResource(path10_R));
		String path10_S = "/Images/StadiumSlices/Stadium_Selected_10.png";
		ImageIcon img10_S = new ImageIcon(Overview.class.getResource(path10_S));
		MouseAdapter ma10 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_10.setIcon(UI_Elements.scaleImageToButton(img10_R, viewStadium_10));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_10.isSelected() != true)
		    	{
		    		viewStadium_10.setIcon(UI_Elements.scaleImageToButton(img10, viewStadium_10));
		    	}
		    	else
		    	{
		    		viewStadium_10.setIcon(UI_Elements.scaleImageToButton(img10_S, viewStadium_10));
		    	}
		    }
		};
		viewStadium_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_10, ma10, img10_S);
			}
		});
		viewStadium_10.addMouseListener(ma10);
		
		viewStadium_11 = new JButton();
		viewStadium_11.setEnabled(false);
		viewStadium_11.setContentAreaFilled(false);
		viewStadium_11.setOpaque(false);
		viewStadium_11.setName("11");
		viewStadium_11.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_11.setBorderPainted(false);
		viewStadium_11.setFocusPainted(false);
		viewStadium_11.setBorder(null);
		String path11 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(11) + "_11.png";
		ImageIcon img11 = new ImageIcon(Overview.class.getResource(path11));
		viewStadium_11.setBounds(viewStadium_10.getBounds().x + viewStadium_10.getBounds().width, viewStadium_02.getBounds().y + viewStadium_07.getBounds().height, (int)(img11.getIconWidth()*stadiumSizeRatio), (int)(img11.getIconHeight()*stadiumSizeRatio));
		viewStadium_11.setIcon(UI_Elements.scaleImageToButton(img11, viewStadium_11));
		panelViewStadium.add(viewStadium_11);
		String path11_R = "/Images/StadiumSlices/Stadium_Rollover_11.png";
		ImageIcon img11_R = new ImageIcon(Overview.class.getResource(path11_R));
		String path11_S = "/Images/StadiumSlices/Stadium_Selected_11.png";
		ImageIcon img11_S = new ImageIcon(Overview.class.getResource(path11_S));
		MouseAdapter ma11 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_11.setIcon(UI_Elements.scaleImageToButton(img11_R, viewStadium_11));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_11.isSelected() != true)
		    	{
		    		viewStadium_11.setIcon(UI_Elements.scaleImageToButton(img11, viewStadium_11));
		    	}
		    	else
		    	{
		    		viewStadium_11.setIcon(UI_Elements.scaleImageToButton(img11_S, viewStadium_11));
		    	}
		    }
		};
		viewStadium_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_11, ma11, img11_S);
			}
		});
		viewStadium_11.addMouseListener(ma11);
		
		viewStadium_12 = new JButton();
		viewStadium_12.setEnabled(false);
		viewStadium_12.setContentAreaFilled(false);
		viewStadium_12.setOpaque(false);
		viewStadium_12.setName("12");
		viewStadium_12.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_12.setBorderPainted(false);
		viewStadium_12.setFocusPainted(false);
		viewStadium_12.setBorder(null);
		String path12 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(12) + "_12.png";
		ImageIcon img12 = new ImageIcon(Overview.class.getResource(path12));
		viewStadium_12.setBounds(viewStadium_11.getBounds().x + viewStadium_11.getBounds().width, viewStadium_02.getBounds().y + viewStadium_07.getBounds().height, (int)(img12.getIconWidth()*stadiumSizeRatio), (int)(img12.getIconHeight()*stadiumSizeRatio));
		viewStadium_12.setIcon(UI_Elements.scaleImageToButton(img12, viewStadium_12));
		panelViewStadium.add(viewStadium_12);
		String path12_R = "/Images/StadiumSlices/Stadium_Rollover_12.png";
		ImageIcon img12_R = new ImageIcon(Overview.class.getResource(path12_R));
		String path12_S = "/Images/StadiumSlices/Stadium_Selected_12.png";
		ImageIcon img12_S = new ImageIcon(Overview.class.getResource(path12_S));
		MouseAdapter ma12 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_12.setIcon(UI_Elements.scaleImageToButton(img12_R, viewStadium_12));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_12.isSelected() != true)
		    	{
		    		viewStadium_12.setIcon(UI_Elements.scaleImageToButton(img12, viewStadium_12));
		    	}
		    	else
		    	{
		    		viewStadium_12.setIcon(UI_Elements.scaleImageToButton(img12_S, viewStadium_12));
		    	}
		    }
		};
		viewStadium_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_12, ma12, img12_S);
			}
		});
		viewStadium_12.addMouseListener(ma12);
		
		viewStadium_13 = new JButton();
		viewStadium_13.setEnabled(false);
		viewStadium_13.setContentAreaFilled(false);
		viewStadium_13.setOpaque(false);
		viewStadium_13.setName("13");
		viewStadium_13.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_13.setBorderPainted(false);
		viewStadium_13.setFocusPainted(false);
		viewStadium_13.setBorder(null);
		String path13 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(13) + "_13.png";
		ImageIcon img13 = new ImageIcon(Overview.class.getResource(path13));
		viewStadium_13.setBounds(viewStadium_12.getBounds().x + viewStadium_12.getBounds().width, viewStadium_02.getBounds().y + viewStadium_07.getBounds().height, (int)(img13.getIconWidth()*stadiumSizeRatio), (int)(img13.getIconHeight()*stadiumSizeRatio));
		viewStadium_13.setIcon(UI_Elements.scaleImageToButton(img13, viewStadium_13));
		panelViewStadium.add(viewStadium_13);
		String path13_R = "/Images/StadiumSlices/Stadium_Rollover_13.png";
		ImageIcon img13_R = new ImageIcon(Overview.class.getResource(path13_R));
		String path13_S = "/Images/StadiumSlices/Stadium_Selected_13.png";
		ImageIcon img13_S = new ImageIcon(Overview.class.getResource(path13_S));
		MouseAdapter ma13 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_13.setIcon(UI_Elements.scaleImageToButton(img13_R, viewStadium_13));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_13.isSelected() != true)
		    	{
		    		viewStadium_13.setIcon(UI_Elements.scaleImageToButton(img13, viewStadium_13));
		    	}
		    	else
		    	{
		    		viewStadium_13.setIcon(UI_Elements.scaleImageToButton(img13_S, viewStadium_13));
		    	}
		    }
		};
		viewStadium_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_13, ma13, img13_S);
			}
		});
		viewStadium_13.addMouseListener(ma13);
		
		viewStadium_14 = new JButton();
		viewStadium_14.setEnabled(false);
		viewStadium_14.setContentAreaFilled(false);
		viewStadium_14.setOpaque(false);
		viewStadium_14.setName("14");
		viewStadium_14.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_14.setBorderPainted(false);
		viewStadium_14.setFocusPainted(false);
		viewStadium_14.setBorder(null);
		String path14 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(14) + "_14.png";
		ImageIcon img14 = new ImageIcon(Overview.class.getResource(path14));
		viewStadium_14.setBounds(viewStadium_13.getBounds().x + viewStadium_13.getBounds().width, viewStadium_02.getBounds().y + viewStadium_07.getBounds().height, (int)(img14.getIconWidth()*stadiumSizeRatio), (int)(img14.getIconHeight()*stadiumSizeRatio));
		viewStadium_14.setIcon(UI_Elements.scaleImageToButton(img14, viewStadium_14));
		panelViewStadium.add(viewStadium_14);
		String path14_R = "/Images/StadiumSlices/Stadium_Rollover_14.png";
		ImageIcon img14_R = new ImageIcon(Overview.class.getResource(path14_R));
		String path14_S = "/Images/StadiumSlices/Stadium_Selected_14.png";
		ImageIcon img14_S = new ImageIcon(Overview.class.getResource(path14_S));
		MouseAdapter ma14 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_14.setIcon(UI_Elements.scaleImageToButton(img14_R, viewStadium_14));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_14.isSelected() != true)
		    	{
		    		viewStadium_14.setIcon(UI_Elements.scaleImageToButton(img14, viewStadium_14));
		    	}
		    	else
		    	{
		    		viewStadium_14.setIcon(UI_Elements.scaleImageToButton(img14_S, viewStadium_14));
		    	}
		    }
		};
		viewStadium_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_14, ma14, img14_S);
			}
		});
		viewStadium_14.addMouseListener(ma14);
		
		viewStadium_15 = new JButton();
		viewStadium_15.setEnabled(false);
		viewStadium_15.setContentAreaFilled(false);
		viewStadium_15.setOpaque(false);
		viewStadium_15.setName("15");
		viewStadium_15.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_15.setBorderPainted(false);
		viewStadium_15.setFocusPainted(false);
		viewStadium_15.setBorder(null);
		String path15 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(15) + "_15.png";
		ImageIcon img15 = new ImageIcon(Overview.class.getResource(path15));
		viewStadium_15.setBounds(viewStadium_14.getBounds().x + viewStadium_14.getBounds().width, viewStadium_02.getBounds().y + viewStadium_07.getBounds().height, (int)(img15.getIconWidth()*stadiumSizeRatio), (int)(img15.getIconHeight()*stadiumSizeRatio));
		viewStadium_15.setIcon(UI_Elements.scaleImageToButton(img15, viewStadium_15));
		panelViewStadium.add(viewStadium_15);
		String path15_R = "/Images/StadiumSlices/Stadium_Rollover_15.png";
		ImageIcon img15_R = new ImageIcon(Overview.class.getResource(path15_R));
		String path15_S = "/Images/StadiumSlices/Stadium_Selected_15.png";
		ImageIcon img15_S = new ImageIcon(Overview.class.getResource(path15_S));
		MouseAdapter ma15 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_15.setIcon(UI_Elements.scaleImageToButton(img15_R, viewStadium_15));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_15.isSelected() != true)
		    	{
		    		viewStadium_15.setIcon(UI_Elements.scaleImageToButton(img15, viewStadium_15));
		    	}
		    	else
		    	{
		    		viewStadium_15.setIcon(UI_Elements.scaleImageToButton(img15_S, viewStadium_15));
		    	}
		    }
		};
		viewStadium_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_15, ma15, img15_S);
			}
		});
		viewStadium_15.addMouseListener(ma15);
		
		viewStadium_16 = new JButton();
		viewStadium_16.setEnabled(false);
		viewStadium_16.setContentAreaFilled(false);
		viewStadium_16.setOpaque(false);
		viewStadium_16.setName("16");
		viewStadium_16.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_16.setBorderPainted(false);
		viewStadium_16.setFocusPainted(false);
		viewStadium_16.setBorder(null);
		String path16 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(16) + "_16.png";
		ImageIcon img16 = new ImageIcon(Overview.class.getResource(path16));
		viewStadium_16.setBounds(viewStadium_15.getBounds().x + viewStadium_15.getBounds().width, viewStadium_02.getBounds().y + viewStadium_07.getBounds().height, (int)(img16.getIconWidth()*stadiumSizeRatio), (int)(img16.getIconHeight()*stadiumSizeRatio));
		viewStadium_16.setIcon(UI_Elements.scaleImageToButton(img16, viewStadium_16));
		panelViewStadium.add(viewStadium_16);
		String path16_R = "/Images/StadiumSlices/Stadium_Rollover_16.png";
		ImageIcon img16_R = new ImageIcon(Overview.class.getResource(path16_R));
		String path16_S = "/Images/StadiumSlices/Stadium_Selected_16.png";
		ImageIcon img16_S = new ImageIcon(Overview.class.getResource(path16_S));
		MouseAdapter ma16 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_16.setIcon(UI_Elements.scaleImageToButton(img16_R, viewStadium_16));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_16.isSelected() != true)
		    	{
		    		viewStadium_16.setIcon(UI_Elements.scaleImageToButton(img16, viewStadium_16));
		    	}
		    	else
		    	{
		    		viewStadium_16.setIcon(UI_Elements.scaleImageToButton(img16_S, viewStadium_16));
		    	}
		    }
		};
		viewStadium_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_16, ma16, img16_S);
			}
		});
		viewStadium_16.addMouseListener(ma16);
						
		viewStadium_55 = new JButton();
		viewStadium_55.setEnabled(false);
		viewStadium_55.setContentAreaFilled(false);
		viewStadium_55.setOpaque(false);
		viewStadium_55.setName("55");
		viewStadium_55.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_55.setBorderPainted(false);
		viewStadium_55.setFocusPainted(false);
		viewStadium_55.setBorder(null);
		String path55 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(55) + "_55.png";
		ImageIcon img55 = new ImageIcon(Overview.class.getResource(path55));
		viewStadium_55.setBounds(viewStadium_08.getBounds().x + viewStadium_08.getBounds().width, viewStadium_49.getBounds().y, (int)(img55.getIconWidth()*stadiumSizeRatio), (int)(img55.getIconHeight()*stadiumSizeRatio));
		viewStadium_55.setIcon(UI_Elements.scaleImageToButton(img55, viewStadium_55));
		panelViewStadium.add(viewStadium_55);
		String path55_R = "/Images/StadiumSlices/Stadium_Rollover_55.png";
		ImageIcon img55_R = new ImageIcon(Overview.class.getResource(path55_R));
		String path55_S = "/Images/StadiumSlices/Stadium_Selected_55.png";
		ImageIcon img55_S = new ImageIcon(Overview.class.getResource(path55_S));
		MouseAdapter ma55 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_55.setIcon(UI_Elements.scaleImageToButton(img55_R, viewStadium_55));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_55.isSelected() != true)
		    	{
		    		viewStadium_55.setIcon(UI_Elements.scaleImageToButton(img55, viewStadium_55));
		    	}
		    	else
		    	{
		    		viewStadium_55.setIcon(UI_Elements.scaleImageToButton(img55_S, viewStadium_55));
		    	}
		    }
		};
		viewStadium_55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_55, ma55, img55_S);
			}
		});
		viewStadium_55.addMouseListener(ma55);
		
		viewStadium_22 = new JButton();
		viewStadium_22.setEnabled(false);
		viewStadium_22.setContentAreaFilled(false);
		viewStadium_22.setOpaque(false);
		viewStadium_22.setName("22");
		viewStadium_22.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_22.setBorderPainted(false);
		viewStadium_22.setFocusPainted(false);
		viewStadium_22.setBorder(null);
		String path22 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(22) + "_22.png";
		ImageIcon img22 = new ImageIcon(Overview.class.getResource(path22));
		viewStadium_22.setBounds(viewStadium_55.getBounds().x + viewStadium_55.getBounds().width - (int)(img22.getIconWidth()*stadiumSizeRatio), viewStadium_55.getBounds().y + viewStadium_55.getBounds().height, (int)(img22.getIconWidth()*stadiumSizeRatio), (int)(img22.getIconHeight()*stadiumSizeRatio));
		viewStadium_22.setIcon(UI_Elements.scaleImageToButton(img22, viewStadium_22));
		panelViewStadium.add(viewStadium_22);
		String path22_R = "/Images/StadiumSlices/Stadium_Rollover_22.png";
		ImageIcon img22_R = new ImageIcon(Overview.class.getResource(path22_R));
		String path22_S = "/Images/StadiumSlices/Stadium_Selected_22.png";
		ImageIcon img22_S = new ImageIcon(Overview.class.getResource(path22_S));
		MouseAdapter ma22 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_22.setIcon(UI_Elements.scaleImageToButton(img22_R, viewStadium_22));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_22.isSelected() != true)
		    	{
		    		viewStadium_22.setIcon(UI_Elements.scaleImageToButton(img22, viewStadium_22));
		    	}
		    	else
		    	{
		    		viewStadium_22.setIcon(UI_Elements.scaleImageToButton(img22_S, viewStadium_22));
		    	}
		    }
		};
		viewStadium_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_22, ma22, img22_S);
			}
		});
		viewStadium_22.addMouseListener(ma22);
		
		viewStadium_27 = new JButton();
		viewStadium_27.setEnabled(false);
		viewStadium_27.setContentAreaFilled(false);
		viewStadium_27.setOpaque(false);
		viewStadium_27.setName("27");
		viewStadium_27.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_27.setBorderPainted(false);
		viewStadium_27.setFocusPainted(false);
		viewStadium_27.setBorder(null);
		String path27 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(27) + "_27.png";
		ImageIcon img27 = new ImageIcon(Overview.class.getResource(path27));
		viewStadium_27.setBounds(viewStadium_22.getBounds().x, viewStadium_22.getBounds().y + viewStadium_22.getBounds().height, (int)(img27.getIconWidth()*stadiumSizeRatio), (int)(img27.getIconHeight()*stadiumSizeRatio));
		viewStadium_27.setIcon(UI_Elements.scaleImageToButton(img27, viewStadium_27));
		panelViewStadium.add(viewStadium_27);
		String path27_R = "/Images/StadiumSlices/Stadium_Rollover_27.png";
		ImageIcon img27_R = new ImageIcon(Overview.class.getResource(path27_R));
		String path27_S = "/Images/StadiumSlices/Stadium_Selected_27.png";
		ImageIcon img27_S = new ImageIcon(Overview.class.getResource(path27_S));
		MouseAdapter ma27 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_27.setIcon(UI_Elements.scaleImageToButton(img27_R, viewStadium_27));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_27.isSelected() != true)
		    	{
		    		viewStadium_27.setIcon(UI_Elements.scaleImageToButton(img27, viewStadium_27));
		    	}
		    	else
		    	{
		    		viewStadium_27.setIcon(UI_Elements.scaleImageToButton(img27_S, viewStadium_27));
		    	}
		    }
		};
		viewStadium_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_27, ma27, img27_S);
			}
		});
		viewStadium_27.addMouseListener(ma27);
		
		
		viewStadium_29 = new JButton();
		viewStadium_29.setEnabled(false);
		viewStadium_29.setContentAreaFilled(false);
		viewStadium_29.setOpaque(false);
		viewStadium_29.setName("29");
		viewStadium_29.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_29.setBorderPainted(false);
		viewStadium_29.setFocusPainted(false);
		viewStadium_29.setBorder(null);
		String path29 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(29) + "_29.png";
		ImageIcon img29 = new ImageIcon(Overview.class.getResource(path29));
		viewStadium_29.setBounds(viewStadium_27.getBounds().x, viewStadium_27.getBounds().y + viewStadium_27.getBounds().height, (int)(img29.getIconWidth()*stadiumSizeRatio), (int)(img29.getIconHeight()*stadiumSizeRatio));
		viewStadium_29.setIcon(UI_Elements.scaleImageToButton(img29, viewStadium_29));
		panelViewStadium.add(viewStadium_29);
		String path29_R = "/Images/StadiumSlices/Stadium_Rollover_29.png";
		ImageIcon img29_R = new ImageIcon(Overview.class.getResource(path29_R));
		String path29_S = "/Images/StadiumSlices/Stadium_Selected_29.png";
		ImageIcon img29_S = new ImageIcon(Overview.class.getResource(path29_S));
		MouseAdapter ma29 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_29.setIcon(UI_Elements.scaleImageToButton(img29_R, viewStadium_29));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_29.isSelected() != true)
		    	{
		    		viewStadium_29.setIcon(UI_Elements.scaleImageToButton(img29, viewStadium_29));
		    	}
		    	else
		    	{
		    		viewStadium_29.setIcon(UI_Elements.scaleImageToButton(img29_S, viewStadium_29));
		    	}
		    }
		};
		viewStadium_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_29, ma29, img29_S);
			}
		});
		viewStadium_29.addMouseListener(ma29);
		
		
		viewStadium_54 = new JButton();
		viewStadium_54.setEnabled(false);
		viewStadium_54.setContentAreaFilled(false);
		viewStadium_54.setOpaque(false);
		viewStadium_54.setName("54");
		viewStadium_54.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_54.setBorderPainted(false);
		viewStadium_54.setFocusPainted(false);
		viewStadium_54.setBorder(null);
		String path54 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(54) + "_54.png";
		ImageIcon img54 = new ImageIcon(Overview.class.getResource(path54));
		viewStadium_54.setBounds(viewStadium_55.getBounds().x, panelViewStadium.getBounds().y, (int)(img54.getIconWidth()*stadiumSizeRatio), (int)(img54.getIconHeight()*stadiumSizeRatio));
		viewStadium_54.setIcon(UI_Elements.scaleImageToButton(img54, viewStadium_54));
		panelViewStadium.add(viewStadium_54);
		String path54_R = "/Images/StadiumSlices/Stadium_Rollover_54.png";
		ImageIcon img54_R = new ImageIcon(Overview.class.getResource(path54_R));
		String path54_S = "/Images/StadiumSlices/Stadium_Selected_54.png";
		ImageIcon img54_S = new ImageIcon(Overview.class.getResource(path54_S));
		MouseAdapter ma54 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_54.setIcon(UI_Elements.scaleImageToButton(img54_R, viewStadium_54));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_54.isSelected() != true)
		    	{
		    		viewStadium_54.setIcon(UI_Elements.scaleImageToButton(img54, viewStadium_54));
		    	}
		    	else
		    	{
		    		viewStadium_54.setIcon(UI_Elements.scaleImageToButton(img54_S, viewStadium_54));
		    	}
		    }
		};
		viewStadium_54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_54, ma54, img54_S);
			}
		});
		viewStadium_54.addMouseListener(ma54);
		
		
		viewStadium_25 = new JButton();
		viewStadium_25.setEnabled(false);
		viewStadium_25.setContentAreaFilled(false);
		viewStadium_25.setOpaque(false);
		viewStadium_25.setName("25");
		viewStadium_25.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_25.setBorderPainted(false);
		viewStadium_25.setFocusPainted(false);
		viewStadium_25.setBorder(null);
		String path25 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(25) + "_25.png";
		ImageIcon img25 = new ImageIcon(Overview.class.getResource(path25));
		viewStadium_25.setBounds(viewStadium_29.getBounds().x + viewStadium_29.getBounds().width, viewStadium_54.getBounds().y + viewStadium_54.getBounds().height, (int)(img25.getIconWidth()*stadiumSizeRatio), (int)(img25.getIconHeight()*stadiumSizeRatio));
		viewStadium_25.setIcon(UI_Elements.scaleImageToButton(img25, viewStadium_25));
		panelViewStadium.add(viewStadium_25);
		String path25_R = "/Images/StadiumSlices/Stadium_Rollover_25.png";
		ImageIcon img25_R = new ImageIcon(Overview.class.getResource(path25_R));
		String path25_S = "/Images/StadiumSlices/Stadium_Selected_25.png";
		ImageIcon img25_S = new ImageIcon(Overview.class.getResource(path25_S));
		MouseAdapter ma25 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_25.setIcon(UI_Elements.scaleImageToButton(img25_R, viewStadium_25));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_25.isSelected() != true)
		    	{
		    		viewStadium_25.setIcon(UI_Elements.scaleImageToButton(img25, viewStadium_25));
		    	}
		    	else
		    	{
		    		viewStadium_25.setIcon(UI_Elements.scaleImageToButton(img25_S, viewStadium_25));
		    	}
		    }
		};
		viewStadium_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_25, ma25, img25_S);
			}
		});
		viewStadium_25.addMouseListener(ma25);
		
	
		
		viewStadium_24 = new JButton();
		viewStadium_24.setEnabled(false);
		viewStadium_24.setContentAreaFilled(false);
		viewStadium_24.setOpaque(false);
		viewStadium_24.setName("24");
		viewStadium_24.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_24.setBorderPainted(false);
		viewStadium_24.setFocusPainted(false);
		viewStadium_24.setBorder(null);
		String path24 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(24) + "_24.png";
		ImageIcon img24 = new ImageIcon(Overview.class.getResource(path24));
		viewStadium_24.setBounds(viewStadium_48.getBounds().x, viewStadium_48.getBounds().y + viewStadium_48.getBounds().height, (int)(img24.getIconWidth()*stadiumSizeRatio), (int)(img24.getIconHeight()*stadiumSizeRatio));
		viewStadium_24.setIcon(UI_Elements.scaleImageToButton(img24, viewStadium_24));
		panelViewStadium.add(viewStadium_24);
		String path24_R = "/Images/StadiumSlices/Stadium_Rollover_24.png";
		ImageIcon img24_R = new ImageIcon(Overview.class.getResource(path24_R));
		String path24_S = "/Images/StadiumSlices/Stadium_Selected_24.png";
		ImageIcon img24_S = new ImageIcon(Overview.class.getResource(path24_S));
		MouseAdapter ma24 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_24.setIcon(UI_Elements.scaleImageToButton(img24_R, viewStadium_24));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_24.isSelected() != true)
		    	{
		    		viewStadium_24.setIcon(UI_Elements.scaleImageToButton(img24, viewStadium_24));
		    	}
		    	else
		    	{
		    		viewStadium_24.setIcon(UI_Elements.scaleImageToButton(img24_S, viewStadium_24));
		    	}
		    }
		};
		viewStadium_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_24, ma24, img24_S);
			}
		});
		viewStadium_24.addMouseListener(ma24);
		
		
		viewStadium_50 = new JButton();
		viewStadium_50.setEnabled(false);
		viewStadium_50.setContentAreaFilled(false);
		viewStadium_50.setOpaque(false);
		viewStadium_50.setName("50");
		viewStadium_50.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_50.setBorderPainted(false);
		viewStadium_50.setFocusPainted(false);
		viewStadium_50.setBorder(null);
		String path50 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(50) + "_50.png";
		ImageIcon img50 = new ImageIcon(Overview.class.getResource(path50));
		viewStadium_50.setBounds(viewStadium_24.getBounds().x, viewStadium_24.getBounds().y + viewStadium_24.getBounds().height, (int)(img50.getIconWidth()*stadiumSizeRatio), (int)(img50.getIconHeight()*stadiumSizeRatio));
		viewStadium_50.setIcon(UI_Elements.scaleImageToButton(img50, viewStadium_50));
		panelViewStadium.add(viewStadium_50);
		String path50_R = "/Images/StadiumSlices/Stadium_Rollover_50.png";
		ImageIcon img50_R = new ImageIcon(Overview.class.getResource(path50_R));
		String path50_S = "/Images/StadiumSlices/Stadium_Selected_50.png";
		ImageIcon img50_S = new ImageIcon(Overview.class.getResource(path50_S));
		MouseAdapter ma50 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_50.setIcon(UI_Elements.scaleImageToButton(img50_R, viewStadium_50));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_50.isSelected() != true)
		    	{
		    		viewStadium_50.setIcon(UI_Elements.scaleImageToButton(img50, viewStadium_50));
		    	}
		    	else
		    	{
		    		viewStadium_50.setIcon(UI_Elements.scaleImageToButton(img50_S, viewStadium_50));
		    	}
		    }
		};
		viewStadium_50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_50, ma50, img50_S);
			}
		});
		viewStadium_50.addMouseListener(ma50);
		
		
		viewStadium_41 = new JButton();
		viewStadium_41.setEnabled(false);
		viewStadium_41.setContentAreaFilled(false);
		viewStadium_41.setOpaque(false);
		viewStadium_41.setName("41");
		viewStadium_41.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_41.setBorderPainted(false);
		viewStadium_41.setFocusPainted(false);
		viewStadium_41.setBorder(null);
		String path41 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(41) + "_41.png";
		ImageIcon img41 = new ImageIcon(Overview.class.getResource(path41));
		viewStadium_41.setBounds(viewStadium_50.getBounds().x + viewStadium_50.getBounds().width, viewStadium_50.getBounds().y + viewStadium_50.getBounds().height - (int)(img41.getIconHeight()*stadiumSizeRatio), (int)(img41.getIconWidth()*stadiumSizeRatio), (int)(img41.getIconHeight()*stadiumSizeRatio));
		viewStadium_41.setIcon(UI_Elements.scaleImageToButton(img41, viewStadium_41));
		panelViewStadium.add(viewStadium_41);
		String path41_R = "/Images/StadiumSlices/Stadium_Rollover_41.png";
		ImageIcon img41_R = new ImageIcon(Overview.class.getResource(path41_R));
		String path41_S = "/Images/StadiumSlices/Stadium_Selected_41.png";
		ImageIcon img41_S = new ImageIcon(Overview.class.getResource(path41_S));
		MouseAdapter ma41 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_41.setIcon(UI_Elements.scaleImageToButton(img41_R, viewStadium_41));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_41.isSelected() != true)
		    	{
		    		viewStadium_41.setIcon(UI_Elements.scaleImageToButton(img41, viewStadium_41));
		    	}
		    	else
		    	{
		    		viewStadium_41.setIcon(UI_Elements.scaleImageToButton(img41_S, viewStadium_41));
		    	}
		    }
		};
		viewStadium_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_41, ma41, img41_S);
			}
		});
		viewStadium_41.addMouseListener(ma41);
		
		
		viewStadium_42 = new JButton();
		viewStadium_42.setEnabled(false);
		viewStadium_42.setContentAreaFilled(false);
		viewStadium_42.setOpaque(false);
		viewStadium_42.setName("42");
		viewStadium_42.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_42.setBorderPainted(false);
		viewStadium_42.setFocusPainted(false);
		viewStadium_42.setBorder(null);
		String path42 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(42) + "_42.png";
		ImageIcon img42 = new ImageIcon(Overview.class.getResource(path42));
		viewStadium_42.setBounds(viewStadium_41.getBounds().x + viewStadium_41.getBounds().width, viewStadium_41.getBounds().y, (int)(img42.getIconWidth()*stadiumSizeRatio), (int)(img42.getIconHeight()*stadiumSizeRatio));
		viewStadium_42.setIcon(UI_Elements.scaleImageToButton(img42, viewStadium_42));
		panelViewStadium.add(viewStadium_42);
		String path42_R = "/Images/StadiumSlices/Stadium_Rollover_42.png";
		ImageIcon img42_R = new ImageIcon(Overview.class.getResource(path42_R));
		String path42_S = "/Images/StadiumSlices/Stadium_Selected_42.png";
		ImageIcon img42_S = new ImageIcon(Overview.class.getResource(path42_S));
		MouseAdapter ma42 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_42.setIcon(UI_Elements.scaleImageToButton(img42_R, viewStadium_42));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_42.isSelected() != true)
		    	{
		    		viewStadium_42.setIcon(UI_Elements.scaleImageToButton(img42, viewStadium_42));
		    	}
		    	else
		    	{
		    		viewStadium_42.setIcon(UI_Elements.scaleImageToButton(img42_S, viewStadium_42));
		    	}
		    }
		};
		viewStadium_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_42, ma42, img42_S);
			}
		});
		viewStadium_42.addMouseListener(ma42);
		
		
		viewStadium_43 = new JButton();
		viewStadium_43.setEnabled(false);
		viewStadium_43.setContentAreaFilled(false);
		viewStadium_43.setOpaque(false);
		viewStadium_43.setName("43");
		viewStadium_43.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_43.setBorderPainted(false);
		viewStadium_43.setFocusPainted(false);
		viewStadium_43.setBorder(null);
		String path43 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(43) + "_43.png";
		ImageIcon img43 = new ImageIcon(Overview.class.getResource(path43));
		viewStadium_43.setBounds(viewStadium_42.getBounds().x + viewStadium_42.getBounds().width, viewStadium_42.getBounds().y, (int)(img43.getIconWidth()*stadiumSizeRatio), (int)(img43.getIconHeight()*stadiumSizeRatio));
		viewStadium_43.setIcon(UI_Elements.scaleImageToButton(img43, viewStadium_43));
		panelViewStadium.add(viewStadium_43);
		String path43_R = "/Images/StadiumSlices/Stadium_Rollover_43.png";
		ImageIcon img43_R = new ImageIcon(Overview.class.getResource(path43_R));
		String path43_S = "/Images/StadiumSlices/Stadium_Selected_43.png";
		ImageIcon img43_S = new ImageIcon(Overview.class.getResource(path43_S));
		MouseAdapter ma43 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_43.setIcon(UI_Elements.scaleImageToButton(img43_R, viewStadium_43));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_43.isSelected() != true)
		    	{
		    		viewStadium_43.setIcon(UI_Elements.scaleImageToButton(img43, viewStadium_43));
		    	}
		    	else
		    	{
		    		viewStadium_43.setIcon(UI_Elements.scaleImageToButton(img43_S, viewStadium_43));
		    	}
		    }
		};
		viewStadium_43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_43, ma43, img43_S);
			}
		});
		viewStadium_43.addMouseListener(ma43);
		
		
		viewStadium_44 = new JButton();
		viewStadium_44.setEnabled(false);
		viewStadium_44.setContentAreaFilled(false);
		viewStadium_44.setOpaque(false);
		viewStadium_44.setName("44");
		viewStadium_44.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_44.setBorderPainted(false);
		viewStadium_44.setFocusPainted(false);
		viewStadium_44.setBorder(null);
		String path44 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(44) + "_44.png";
		ImageIcon img44 = new ImageIcon(Overview.class.getResource(path44));
		viewStadium_44.setBounds(viewStadium_43.getBounds().x + viewStadium_43.getBounds().width, viewStadium_43.getBounds().y, (int)(img44.getIconWidth()*stadiumSizeRatio), (int)(img44.getIconHeight()*stadiumSizeRatio));
		viewStadium_44.setIcon(UI_Elements.scaleImageToButton(img44, viewStadium_44));
		panelViewStadium.add(viewStadium_44);
		String path44_R = "/Images/StadiumSlices/Stadium_Rollover_44.png";
		ImageIcon img44_R = new ImageIcon(Overview.class.getResource(path44_R));
		String path44_S = "/Images/StadiumSlices/Stadium_Selected_44.png";
		ImageIcon img44_S = new ImageIcon(Overview.class.getResource(path44_S));
		MouseAdapter ma44 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_44.setIcon(UI_Elements.scaleImageToButton(img44_R, viewStadium_44));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_44.isSelected() != true)
		    	{
		    		viewStadium_44.setIcon(UI_Elements.scaleImageToButton(img44, viewStadium_44));
		    	}
		    	else
		    	{
		    		viewStadium_44.setIcon(UI_Elements.scaleImageToButton(img44_S, viewStadium_44));
		    	}
		    }
		};
		viewStadium_44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_44, ma44, img44_S);
			}
		});
		viewStadium_44.addMouseListener(ma44);
		
		
		viewStadium_45 = new JButton();
		viewStadium_45.setEnabled(false);
		viewStadium_45.setContentAreaFilled(false);
		viewStadium_45.setOpaque(false);
		viewStadium_45.setName("45");
		viewStadium_45.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_45.setBorderPainted(false);
		viewStadium_45.setFocusPainted(false);
		viewStadium_45.setBorder(null);
		String path45 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(45) + "_45.png";
		ImageIcon img45 = new ImageIcon(Overview.class.getResource(path45));
		viewStadium_45.setBounds(viewStadium_44.getBounds().x + viewStadium_44.getBounds().width, viewStadium_44.getBounds().y, (int)(img45.getIconWidth()*stadiumSizeRatio), (int)(img45.getIconHeight()*stadiumSizeRatio));
		viewStadium_45.setIcon(UI_Elements.scaleImageToButton(img45, viewStadium_45));
		panelViewStadium.add(viewStadium_45);
		String path45_R = "/Images/StadiumSlices/Stadium_Rollover_45.png";
		ImageIcon img45_R = new ImageIcon(Overview.class.getResource(path45_R));
		String path45_S = "/Images/StadiumSlices/Stadium_Selected_45.png";
		ImageIcon img45_S = new ImageIcon(Overview.class.getResource(path45_S));
		MouseAdapter ma45 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_45.setIcon(UI_Elements.scaleImageToButton(img45_R, viewStadium_45));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_45.isSelected() != true)
		    	{
		    		viewStadium_45.setIcon(UI_Elements.scaleImageToButton(img45, viewStadium_45));
		    	}
		    	else
		    	{
		    		viewStadium_45.setIcon(UI_Elements.scaleImageToButton(img45_S, viewStadium_45));
		    	}
		    }
		};
		viewStadium_45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_45, ma45, img45_S);
			}
		});
		viewStadium_45.addMouseListener(ma45);
		
		
		viewStadium_46 = new JButton();
		viewStadium_46.setEnabled(false);
		viewStadium_46.setContentAreaFilled(false);
		viewStadium_46.setOpaque(false);
		viewStadium_46.setName("46");
		viewStadium_46.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_46.setBorderPainted(false);
		viewStadium_46.setFocusPainted(false);
		viewStadium_46.setBorder(null);
		String path46 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(46) + "_46.png";
		ImageIcon img46 = new ImageIcon(Overview.class.getResource(path46));
		viewStadium_46.setBounds(viewStadium_45.getBounds().x + viewStadium_45.getBounds().width, viewStadium_45.getBounds().y, (int)(img46.getIconWidth()*stadiumSizeRatio), (int)(img46.getIconHeight()*stadiumSizeRatio));
		viewStadium_46.setIcon(UI_Elements.scaleImageToButton(img46, viewStadium_46));
		panelViewStadium.add(viewStadium_46);
		String path46_R = "/Images/StadiumSlices/Stadium_Rollover_46.png";
		ImageIcon img46_R = new ImageIcon(Overview.class.getResource(path46_R));
		String path46_S = "/Images/StadiumSlices/Stadium_Selected_46.png";
		ImageIcon img46_S = new ImageIcon(Overview.class.getResource(path46_S));
		MouseAdapter ma46 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_46.setIcon(UI_Elements.scaleImageToButton(img46_R, viewStadium_46));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_46.isSelected() != true)
		    	{
		    		viewStadium_46.setIcon(UI_Elements.scaleImageToButton(img46, viewStadium_46));
		    	}
		    	else
		    	{
		    		viewStadium_46.setIcon(UI_Elements.scaleImageToButton(img46_S, viewStadium_46));
		    	}
		    }
		};
		viewStadium_46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_46, ma46, img46_S);
			}
		});
		viewStadium_46.addMouseListener(ma46);
		
		
		viewStadium_47 = new JButton();
		viewStadium_47.setEnabled(false);
		viewStadium_47.setContentAreaFilled(false);
		viewStadium_47.setOpaque(false);
		viewStadium_47.setName("47");
		viewStadium_47.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_47.setBorderPainted(false);
		viewStadium_47.setFocusPainted(false);
		viewStadium_47.setBorder(null);
		String path47 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(47) + "_47.png";
		ImageIcon img47 = new ImageIcon(Overview.class.getResource(path47));
		viewStadium_47.setBounds(viewStadium_46.getBounds().x + viewStadium_46.getBounds().width, viewStadium_46.getBounds().y, (int)(img47.getIconWidth()*stadiumSizeRatio), (int)(img47.getIconHeight()*stadiumSizeRatio));
		viewStadium_47.setIcon(UI_Elements.scaleImageToButton(img47, viewStadium_47));
		panelViewStadium.add(viewStadium_47);
		String path47_R = "/Images/StadiumSlices/Stadium_Rollover_47.png";
		ImageIcon img47_R = new ImageIcon(Overview.class.getResource(path47_R));
		String path47_S = "/Images/StadiumSlices/Stadium_Selected_47.png";
		ImageIcon img47_S = new ImageIcon(Overview.class.getResource(path47_S));
		MouseAdapter ma47 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_47.setIcon(UI_Elements.scaleImageToButton(img47_R, viewStadium_47));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_47.isSelected() != true)
		    	{
		    		viewStadium_47.setIcon(UI_Elements.scaleImageToButton(img47, viewStadium_47));
		    	}
		    	else
		    	{
		    		viewStadium_47.setIcon(UI_Elements.scaleImageToButton(img47_S, viewStadium_47));
		    	}
		    }
		};
		viewStadium_47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_47, ma47, img47_S);
			}
		});
		viewStadium_47.addMouseListener(ma47);
		
		
		viewStadium_34 = new JButton();
		viewStadium_34.setEnabled(false);
		viewStadium_34.setContentAreaFilled(false);
		viewStadium_34.setOpaque(false);
		viewStadium_34.setName("34");
		viewStadium_34.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_34.setBorderPainted(false);
		viewStadium_34.setFocusPainted(false);
		viewStadium_34.setBorder(null);
		String path34 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(34) + "_34.png";
		ImageIcon img34 = new ImageIcon(Overview.class.getResource(path34));
		viewStadium_34.setBounds(viewStadium_41.getBounds().x, viewStadium_41.getBounds().y - (int)(img34.getIconHeight()*stadiumSizeRatio) - 2, (int)(img34.getIconWidth()*stadiumSizeRatio), (int)(img34.getIconHeight()*stadiumSizeRatio));
		viewStadium_34.setIcon(UI_Elements.scaleImageToButton(img34, viewStadium_34));
		panelViewStadium.add(viewStadium_34);
		String path34_R = "/Images/StadiumSlices/Stadium_Rollover_34.png";
		ImageIcon img34_R = new ImageIcon(Overview.class.getResource(path34_R));
		String path34_S = "/Images/StadiumSlices/Stadium_Selected_34.png";
		ImageIcon img34_S = new ImageIcon(Overview.class.getResource(path34_S));
		MouseAdapter ma34 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_34.setIcon(UI_Elements.scaleImageToButton(img34_R, viewStadium_34));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_34.isSelected() != true)
		    	{
		    		viewStadium_34.setIcon(UI_Elements.scaleImageToButton(img34, viewStadium_34));
		    	}
		    	else
		    	{
		    		viewStadium_34.setIcon(UI_Elements.scaleImageToButton(img34_S, viewStadium_34));
		    	}
		    }
		};
		viewStadium_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_34, ma34, img34_S);
			}
		});
		viewStadium_34.addMouseListener(ma34);
		
		
		viewStadium_35 = new JButton();
		viewStadium_35.setEnabled(false);
		viewStadium_35.setContentAreaFilled(false);
		viewStadium_35.setOpaque(false);
		viewStadium_35.setName("35");
		viewStadium_35.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_35.setBorderPainted(false);
		viewStadium_35.setFocusPainted(false);
		viewStadium_35.setBorder(null);
		String path35 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(35) + "_35.png";
		ImageIcon img35 = new ImageIcon(Overview.class.getResource(path35));
		viewStadium_35.setBounds(viewStadium_34.getBounds().x + viewStadium_34.getBounds().width, viewStadium_34.getBounds().y, (int)(img35.getIconWidth()*stadiumSizeRatio), (int)(img35.getIconHeight()*stadiumSizeRatio));
		viewStadium_35.setIcon(UI_Elements.scaleImageToButton(img35, viewStadium_35));
		panelViewStadium.add(viewStadium_35);
		String path35_R = "/Images/StadiumSlices/Stadium_Rollover_35.png";
		ImageIcon img35_R = new ImageIcon(Overview.class.getResource(path35_R));
		String path35_S = "/Images/StadiumSlices/Stadium_Selected_35.png";
		ImageIcon img35_S = new ImageIcon(Overview.class.getResource(path35_S));
		MouseAdapter ma35 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_35.setIcon(UI_Elements.scaleImageToButton(img35_R, viewStadium_35));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_35.isSelected() != true)
		    	{
		    		viewStadium_35.setIcon(UI_Elements.scaleImageToButton(img35, viewStadium_35));
		    	}
		    	else
		    	{
		    		viewStadium_35.setIcon(UI_Elements.scaleImageToButton(img35_S, viewStadium_35));
		    	}
		    }
		};
		viewStadium_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_35, ma35, img35_S);
			}
		});
		viewStadium_35.addMouseListener(ma35);
		
		
		viewStadium_36 = new JButton();
		viewStadium_36.setEnabled(false);
		viewStadium_36.setContentAreaFilled(false);
		viewStadium_36.setOpaque(false);
		viewStadium_36.setName("36");
		viewStadium_36.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_36.setBorderPainted(false);
		viewStadium_36.setFocusPainted(false);
		viewStadium_36.setBorder(null);
		String path36 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(36) + "_36.png";
		ImageIcon img36 = new ImageIcon(Overview.class.getResource(path36));
		viewStadium_36.setBounds(viewStadium_35.getBounds().x + viewStadium_35.getBounds().width, viewStadium_35.getBounds().y, (int)(img36.getIconWidth()*stadiumSizeRatio), (int)(img36.getIconHeight()*stadiumSizeRatio));
		viewStadium_36.setIcon(UI_Elements.scaleImageToButton(img36, viewStadium_36));
		panelViewStadium.add(viewStadium_36);
		String path36_R = "/Images/StadiumSlices/Stadium_Rollover_36.png";
		ImageIcon img36_R = new ImageIcon(Overview.class.getResource(path36_R));
		String path36_S = "/Images/StadiumSlices/Stadium_Selected_36.png";
		ImageIcon img36_S = new ImageIcon(Overview.class.getResource(path36_S));
		MouseAdapter ma36 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_36.setIcon(UI_Elements.scaleImageToButton(img36_R, viewStadium_36));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_36.isSelected() != true)
		    	{
		    		viewStadium_36.setIcon(UI_Elements.scaleImageToButton(img36, viewStadium_36));
		    	}
		    	else
		    	{
		    		viewStadium_36.setIcon(UI_Elements.scaleImageToButton(img36_S, viewStadium_36));
		    	}
		    }
		};
		viewStadium_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_36, ma36, img36_S);
			}
		});
		viewStadium_36.addMouseListener(ma36);
		
		
		viewStadium_37 = new JButton();
		viewStadium_37.setEnabled(false);
		viewStadium_37.setContentAreaFilled(false);
		viewStadium_37.setOpaque(false);
		viewStadium_37.setName("37");
		viewStadium_37.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_37.setBorderPainted(false);
		viewStadium_37.setFocusPainted(false);
		viewStadium_37.setBorder(null);
		String path37 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(37) + "_37.png";
		ImageIcon img37 = new ImageIcon(Overview.class.getResource(path37));
		viewStadium_37.setBounds(viewStadium_36.getBounds().x + viewStadium_36.getBounds().width, viewStadium_36.getBounds().y, (int)(img37.getIconWidth()*stadiumSizeRatio), (int)(img37.getIconHeight()*stadiumSizeRatio));
		viewStadium_37.setIcon(UI_Elements.scaleImageToButton(img37, viewStadium_37));
		panelViewStadium.add(viewStadium_37);
		String path37_R = "/Images/StadiumSlices/Stadium_Rollover_37.png";
		ImageIcon img37_R = new ImageIcon(Overview.class.getResource(path37_R));
		String path37_S = "/Images/StadiumSlices/Stadium_Selected_37.png";
		ImageIcon img37_S = new ImageIcon(Overview.class.getResource(path37_S));
		MouseAdapter ma37 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_37.setIcon(UI_Elements.scaleImageToButton(img37_R, viewStadium_37));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_37.isSelected() != true)
		    	{
		    		viewStadium_37.setIcon(UI_Elements.scaleImageToButton(img37, viewStadium_37));
		    	}
		    	else
		    	{
		    		viewStadium_37.setIcon(UI_Elements.scaleImageToButton(img37_S, viewStadium_37));
		    	}
		    }
		};
		viewStadium_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_37, ma37, img37_S);
			}
		});
		viewStadium_37.addMouseListener(ma37);
		
		
		viewStadium_38 = new JButton();
		viewStadium_38.setEnabled(false);
		viewStadium_38.setContentAreaFilled(false);
		viewStadium_38.setOpaque(false);
		viewStadium_38.setName("38");
		viewStadium_38.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_38.setBorderPainted(false);
		viewStadium_38.setFocusPainted(false);
		viewStadium_38.setBorder(null);
		String path38 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(38) + "_38.png";
		ImageIcon img38 = new ImageIcon(Overview.class.getResource(path38));
		viewStadium_38.setBounds(viewStadium_37.getBounds().x + viewStadium_37.getBounds().width, viewStadium_37.getBounds().y, (int)(img38.getIconWidth()*stadiumSizeRatio), (int)(img38.getIconHeight()*stadiumSizeRatio));
		viewStadium_38.setIcon(UI_Elements.scaleImageToButton(img38, viewStadium_38));
		panelViewStadium.add(viewStadium_38);
		String path38_R = "/Images/StadiumSlices/Stadium_Rollover_38.png";
		ImageIcon img38_R = new ImageIcon(Overview.class.getResource(path38_R));
		String path38_S = "/Images/StadiumSlices/Stadium_Selected_38.png";
		ImageIcon img38_S = new ImageIcon(Overview.class.getResource(path38_S));
		MouseAdapter ma38 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_38.setIcon(UI_Elements.scaleImageToButton(img38_R, viewStadium_38));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_38.isSelected() != true)
		    	{
		    		viewStadium_38.setIcon(UI_Elements.scaleImageToButton(img38, viewStadium_38));
		    	}
		    	else
		    	{
		    		viewStadium_38.setIcon(UI_Elements.scaleImageToButton(img38_S, viewStadium_38));
		    	}
		    }
		};
		viewStadium_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_38, ma38, img38_S);
			}
		});
		viewStadium_38.addMouseListener(ma38);
		
		
		viewStadium_39 = new JButton();
		viewStadium_39.setEnabled(false);
		viewStadium_39.setContentAreaFilled(false);
		viewStadium_39.setOpaque(false);
		viewStadium_39.setName("39");
		viewStadium_39.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_39.setBorderPainted(false);
		viewStadium_39.setFocusPainted(false);
		viewStadium_39.setBorder(null);
		String path39 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(39) + "_39.png";
		ImageIcon img39 = new ImageIcon(Overview.class.getResource(path39));
		viewStadium_39.setBounds(viewStadium_38.getBounds().x + viewStadium_38.getBounds().width, viewStadium_38.getBounds().y, (int)(img39.getIconWidth()*stadiumSizeRatio), (int)(img39.getIconHeight()*stadiumSizeRatio));
		viewStadium_39.setIcon(UI_Elements.scaleImageToButton(img39, viewStadium_39));
		panelViewStadium.add(viewStadium_39);
		String path39_R = "/Images/StadiumSlices/Stadium_Rollover_39.png";
		ImageIcon img39_R = new ImageIcon(Overview.class.getResource(path39_R));
		String path39_S = "/Images/StadiumSlices/Stadium_Selected_39.png";
		ImageIcon img39_S = new ImageIcon(Overview.class.getResource(path39_S));
		MouseAdapter ma39 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_39.setIcon(UI_Elements.scaleImageToButton(img39_R, viewStadium_39));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_39.isSelected() != true)
		    	{
		    		viewStadium_39.setIcon(UI_Elements.scaleImageToButton(img39, viewStadium_39));
		    	}
		    	else
		    	{
		    		viewStadium_39.setIcon(UI_Elements.scaleImageToButton(img39_S, viewStadium_39));
		    	}
		    }
		};
		viewStadium_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_39, ma39, img39_S);
			}
		});
		viewStadium_39.addMouseListener(ma39);

		viewStadium_40 = new JButton();
		viewStadium_40.setEnabled(false);
		viewStadium_40.setContentAreaFilled(false);
		viewStadium_40.setOpaque(false);
		viewStadium_40.setName("40");
		viewStadium_40.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_40.setBorderPainted(false);
		viewStadium_40.setFocusPainted(false);
		viewStadium_40.setBorder(null);
		String path40 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(40) + "_40.png";
		ImageIcon img40 = new ImageIcon(Overview.class.getResource(path40));
		viewStadium_40.setBounds(viewStadium_39.getBounds().x + viewStadium_39.getBounds().width, viewStadium_39.getBounds().y, (int)(img40.getIconWidth()*stadiumSizeRatio), (int)(img40.getIconHeight()*stadiumSizeRatio));
		viewStadium_40.setIcon(UI_Elements.scaleImageToButton(img40, viewStadium_40));
		panelViewStadium.add(viewStadium_40);
		String path40_R = "/Images/StadiumSlices/Stadium_Rollover_40.png";
		ImageIcon img40_R = new ImageIcon(Overview.class.getResource(path40_R));
		String path40_S = "/Images/StadiumSlices/Stadium_Selected_40.png";
		ImageIcon img40_S = new ImageIcon(Overview.class.getResource(path40_S));
		MouseAdapter ma40 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_40.setIcon(UI_Elements.scaleImageToButton(img40_R, viewStadium_40));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_40.isSelected() != true)
		    	{
		    		viewStadium_40.setIcon(UI_Elements.scaleImageToButton(img40, viewStadium_40));
		    	}
		    	else
		    	{
		    		viewStadium_40.setIcon(UI_Elements.scaleImageToButton(img40_S, viewStadium_40));
		    	}
		    }
		};
		viewStadium_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_40, ma40, img40_S);
			}
		});
		viewStadium_40.addMouseListener(ma40);
		
		
		viewStadium_53 = new JButton();
		viewStadium_53.setEnabled(false);
		viewStadium_53.setContentAreaFilled(false);
		viewStadium_53.setOpaque(false);
		viewStadium_53.setName("53");
		viewStadium_53.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_53.setBorderPainted(false);
		viewStadium_53.setFocusPainted(false);
		viewStadium_53.setBorder(null);
		String path53 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(53) + "_53.png";
		ImageIcon img53 = new ImageIcon(Overview.class.getResource(path53));
		viewStadium_53.setBounds(viewStadium_40.getBounds().x + viewStadium_40.getBounds().width, viewStadium_51.getBounds().y, (int)(img53.getIconWidth()*stadiumSizeRatio), (int)(img53.getIconHeight()*stadiumSizeRatio));
		viewStadium_53.setIcon(UI_Elements.scaleImageToButton(img53, viewStadium_53));
		panelViewStadium.add(viewStadium_53);
		String path53_R = "/Images/StadiumSlices/Stadium_Rollover_53.png";
		ImageIcon img53_R = new ImageIcon(Overview.class.getResource(path53_R));
		String path53_S = "/Images/StadiumSlices/Stadium_Selected_53.png";
		ImageIcon img53_S = new ImageIcon(Overview.class.getResource(path53_S));
		MouseAdapter ma53 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_53.setIcon(UI_Elements.scaleImageToButton(img53_R, viewStadium_53));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_53.isSelected() != true)
		    	{
		    		viewStadium_53.setIcon(UI_Elements.scaleImageToButton(img53, viewStadium_53));
		    	}
		    	else
		    	{
		    		viewStadium_53.setIcon(UI_Elements.scaleImageToButton(img53_S, viewStadium_53));
		    	}
		    }
		};
		viewStadium_53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_53, ma53, img53_S);
			}
		});
		viewStadium_53.addMouseListener(ma53);
		
		
		viewStadium_52 = new JButton();
		viewStadium_52.setEnabled(false);
		viewStadium_52.setContentAreaFilled(false);
		viewStadium_52.setOpaque(false);
		viewStadium_52.setName("52");
		viewStadium_52.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		viewStadium_52.setBorderPainted(false);
		viewStadium_52.setFocusPainted(false);
		viewStadium_52.setBorder(null);
		String path52 = "/Images/StadiumSlices/Stadium" + getOverviewSectionType(52) + "_52.png";
		ImageIcon img52 = new ImageIcon(Overview.class.getResource(path52));
		viewStadium_52.setBounds(viewStadium_40.getBounds().x + viewStadium_40.getBounds().width, viewStadium_50.getBounds().y, (int)(img52.getIconWidth()*stadiumSizeRatio), (int)(img52.getIconHeight()*stadiumSizeRatio));
		viewStadium_52.setIcon(UI_Elements.scaleImageToButton(img52, viewStadium_52));
		panelViewStadium.add(viewStadium_52);
		String path52_R = "/Images/StadiumSlices/Stadium_Rollover_52.png";
		ImageIcon img52_R = new ImageIcon(Overview.class.getResource(path52_R));
		String path52_S = "/Images/StadiumSlices/Stadium_Selected_52.png";
		ImageIcon img52_S = new ImageIcon(Overview.class.getResource(path52_S));
		viewStadium_52.setDisabledIcon(UI_Elements.scaleImageToButton(img52, viewStadium_52)); //$$ TODO
		MouseAdapter ma52 =  new MouseAdapter(){
		    public void mouseEntered( MouseEvent e ) {
				viewStadium_52.setIcon(UI_Elements.scaleImageToButton(img52_R, viewStadium_52));
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(viewStadium_52.isSelected() != true)
		    	{
		    		viewStadium_52.setIcon(UI_Elements.scaleImageToButton(img52, viewStadium_52));
		    	}
		    	else
		    	{
		    		viewStadium_52.setIcon(UI_Elements.scaleImageToButton(img52_S, viewStadium_52));
		    	}
		    }
		};
		viewStadium_52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stadiumSectionSelection(viewStadium_52, ma52, img52_S);
			}
		});
		viewStadium_52.addMouseListener(ma52);
		
		
		JLabel stadiumPitch = new JLabel();
		stadiumPitch.setBorder(null);
		String pathPitch = "/Images/StadiumSlices/StadiumPitch.png";
		ImageIcon imgPitch = new ImageIcon(Overview.class.getResource(pathPitch));
		stadiumPitch.setBounds(93, 81 , (int)(imgPitch.getIconWidth()*stadiumSizeRatio), (int)(imgPitch.getIconHeight()*stadiumSizeRatio));
		stadiumPitch.setIcon(UI_Elements.scaleImageTolabel(imgPitch, stadiumPitch));
		panelViewStadium.add(stadiumPitch);
		
		JLabel viewStadiumBG = new JLabel();
		viewStadiumBG.setBorder(null);
		panelViewStadium.add(viewStadiumBG);
		String pathStadiumBG = "/Images/Stadium_BG.png";
		ImageIcon imgStadiumBG = new ImageIcon(Overview.class.getResource(pathStadiumBG));
		viewStadiumBG.setBounds(0, 0, (int)(imgStadiumBG.getIconWidth()*stadiumSizeRatio)-4 , (int)(imgStadiumBG.getIconHeight()*stadiumSizeRatio)-2);
		viewStadiumBG.setIcon(UI_Elements.scaleImageTolabel(imgStadiumBG, viewStadiumBG));
		viewStadiumBG.setVisible(true);
		
		JLabel viewStadiumImg = new JLabel();
		viewStadiumImg.setBorder(null);
		viewStadiumImg.setBounds(0, 0, (int)stadiumLblWidth , (int)stadiumLblHeight);
		panelViewStadium.add(viewStadiumImg);
		viewStadiumImg.setVisible(true);
		
		addAllSectionsToList();	
	}
	
	public void addAllSectionsToList() {
		//Add All JButtons to sectionList
		sectionList.add(viewStadium_02);
		sectionList.add(viewStadium_03);
		sectionList.add(viewStadium_04);
		sectionList.add(viewStadium_05);
		sectionList.add(viewStadium_06);
		sectionList.add(viewStadium_07);
		sectionList.add(viewStadium_08);
		sectionList.add(viewStadium_10);
		sectionList.add(viewStadium_11);
		sectionList.add(viewStadium_12);
		sectionList.add(viewStadium_13);
		sectionList.add(viewStadium_14);
		sectionList.add(viewStadium_15);
		sectionList.add(viewStadium_16);
		sectionList.add(viewStadium_19);
		sectionList.add(viewStadium_22);
		sectionList.add(viewStadium_23);
		sectionList.add(viewStadium_24);
		sectionList.add(viewStadium_25);
		sectionList.add(viewStadium_26);
		sectionList.add(viewStadium_27);
		sectionList.add(viewStadium_28);
		sectionList.add(viewStadium_29);
		sectionList.add(viewStadium_34);
		sectionList.add(viewStadium_35);
		sectionList.add(viewStadium_36);
		sectionList.add(viewStadium_37);
		sectionList.add(viewStadium_38);
		sectionList.add(viewStadium_39);
		sectionList.add(viewStadium_40);
		sectionList.add(viewStadium_41);
		sectionList.add(viewStadium_42);
		sectionList.add(viewStadium_43);
		sectionList.add(viewStadium_44);
		sectionList.add(viewStadium_45);
		sectionList.add(viewStadium_46);
		sectionList.add(viewStadium_47);
		sectionList.add(viewStadium_48);
		sectionList.add(viewStadium_49);
		sectionList.add(viewStadium_50);
		sectionList.add(viewStadium_51);
		sectionList.add(viewStadium_52);
		sectionList.add(viewStadium_53);
		sectionList.add(viewStadium_54);
		sectionList.add(viewStadium_55);
		//
	}

	
	public String getOverviewSectionType(int i_SectionNum) {
		
		StringBuilder type = new StringBuilder();
		/*String sectionType = view.model.getArenaSection(i_SectionNum).getSectionType(); //copy get method to ctrlr
		
		if(sectionType != null)
		{
			type.append("_" + sectionType);
		}*/
				
		return type.toString();
		
	}
	
	public void stadiumSectionSelection(JButton i_Section, MouseAdapter i_SectionAdapter, ImageIcon i_SelectedImg)
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
			i_Section.setIcon(UI_Elements.scaleImageToButton(i_SelectedImg, i_Section));
			try {
				detailsPanel.setVisible(true);
			}
			//in case detailsPanel is null
			catch (Exception e) {
				e.printStackTrace();
			}
    		lastSelectedButton = i_Section;
    		lastButtonMouseAdapter = i_SectionAdapter;
			numOfSelected++;
    	}
		else
		{
			i_Section.setSelected(false);
			numOfSelected--;
			if(numOfSelected == 0)
			{
				detailsPanel.setVisible(false);
			}
		}
		
	}
	
	public void assignDetailsPanel(JPanel i_Panel)
	{
		detailsPanel = i_Panel;
		for(JButton button : sectionList)
		{
			try {
				button.setEnabled(true);
				button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
