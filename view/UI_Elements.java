package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JButton;
import javax.swing.JLabel;

public class UI_Elements {

	//COLORS
	public static Color color_mainBackgroundColor = new Color(12, 25, 61);
	public static Color color_menuBar = new Color(40, 19, 68);
	public static Color color_menuButtonRollover = new Color(67, 54, 111);
	public static Color color_menuButtonSelected = new Color(38, 27, 77);
	public static Color color_menuButtonText = new Color(237, 217, 255);
	public static Color color_panelBodyButtonDefault = new Color(73, 59, 136); // Panel body button - Default
	public static Color color_panelBodyButtonSelected = new Color(95, 77, 179); // Panel body button - Selected
	public static Color color_panelBodyButtonRollover = new Color(63, 50, 117); // Panel body button - Rollover

	//SIZE CONTROLLERS
	public static int textPanelTitleSize = 40;
	public static int textSmallPanelTitleSize = 20;
	public static int textMediumPanelTitleSize = 28;
	public static int textSubPanelTitleSize = 30;
	public static int textBodyLabelSize = 15;
	public static int textBodyFillText = 13;
	public static int textBodySalesData = 17;
	public static int textOverviewSectionDetails = 18;
	public static int textMenuButtonTextDefault = 19;
	public static int textMenuButtonTextUsername = 16;
	public static int textPanelBodyButton = 20;
	public static int textActionButton = 17;
	public static int textHeader = 23;


	
	//ICON
	public static ImageIcon amsIcon = new ImageIcon("Images/Icon.jpg");

	//FONTS
	
	//Embedded Fonts
	public static String pathAgencyR = "assets/fonts/AGENCYR.TTF";
	public static String pathAgencyB = "assets/fonts/AGENCYB.TTF";
	
	public static Font font_AgencyPanelTitle;
	public static Font font_AgencySubPanelTitle;
	public static Font font_AgencySmallPanelTitle;
	public static Font font_AgencyMediumPanelTitle;
	public static Font font_AgencyMenu;
	public static Font font_AgencyMenuUsername;
	public static Font font_AgencyBodyButton;
	public static Font font_AgencyActionButton;
	public static Font font_AgencyHeader;


	
	//Dynamic Fonts
	//public static String mainFontName = "Agency FB"; // Change string name to change main Menu & Title font
	//public static Font font_menuButtonTextDefault = new Font(mainFontName, Font.PLAIN, textMenuButtonTextDefault);
	//public static Font font_menuButtonTextUser = new Font(mainFontName, Font.PLAIN, textMenuButtonTextUsername);
	//public static Font font_menuButtonTextDefault = font_AgencyMenu;
	//public static Font font_menuButtonTextUser = font_AgencyMenuUsername;
	public static Font font_bodyLabel = new Font("Calibri", Font.BOLD, textBodyLabelSize); // Body JLabel font
	public static Font font_bodyFillText = new Font("Calibri", Font.PLAIN, textBodyFillText); // Text Field & Combo Box font
	public static Font font_bodySalesData = new Font("Calibri", Font.PLAIN, textBodySalesData); // Text Field & Combo Box font
	public static Font font_bodyOverviewSectionDetails = new Font("Calibri", Font.PLAIN, textOverviewSectionDetails); 
	public static Font font_bodyOverviewSectionDetailsBold = new Font("Calibri", Font.BOLD, textOverviewSectionDetails);

	
	//UI METHODS
	public static ImageIcon scaleImageToBox(ImageIcon i_Img, JComponent i_box)
	{
		ImageIcon scaledImage;
		
		scaledImage = new ImageIcon(i_Img.getImage().getScaledInstance(i_box.getWidth(), i_box.getHeight(), Image.SCALE_SMOOTH));
		
		return scaledImage;
	}

	
	public static void createFonts()
	{
		try
		{
			font_AgencyPanelTitle = Font.createFont(Font.TRUETYPE_FONT, new File(pathAgencyB)).deriveFont((float)textPanelTitleSize);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(pathAgencyB)));		
			
		}
		catch(IOException | FontFormatException e)
		{
			
		}
		
		try
		{
			font_AgencySubPanelTitle = Font.createFont(Font.TRUETYPE_FONT, new File(pathAgencyB)).deriveFont((float)textSubPanelTitleSize);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(pathAgencyB)));		
			
		}
		catch(IOException | FontFormatException e)
		{
			
		}
		
		try
		{
			font_AgencyMenu = Font.createFont(Font.TRUETYPE_FONT, new File(pathAgencyR)).deriveFont((float)textMenuButtonTextDefault);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(pathAgencyR)));	
		}
		
		catch(IOException | FontFormatException e)
		{
			
		}
		
		try
		{
			font_AgencyMenuUsername = Font.createFont(Font.TRUETYPE_FONT, new File(pathAgencyR)).deriveFont((float)textMenuButtonTextUsername);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(pathAgencyR)));	
		}
		catch(IOException | FontFormatException e)
		{
			
		}
		
		try
		{
			font_AgencyBodyButton = Font.createFont(Font.TRUETYPE_FONT, new File(pathAgencyB)).deriveFont((float)textPanelBodyButton);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(pathAgencyB)));	
		}
		catch(IOException | FontFormatException e)
		{
			
		}
		try
		{
			font_AgencyActionButton = Font.createFont(Font.TRUETYPE_FONT, new File(pathAgencyB)).deriveFont((float)textActionButton);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(pathAgencyB)));	
		}
		catch(IOException | FontFormatException e)
		{
			
		}
		
		try
		{
			font_AgencyHeader = Font.createFont(Font.TRUETYPE_FONT, new File(pathAgencyB)).deriveFont((float)textHeader);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(pathAgencyB)));	
		}
		catch(IOException | FontFormatException e)
		{
			
		}
		
		try
		{
			font_AgencySmallPanelTitle = Font.createFont(Font.TRUETYPE_FONT, new File(pathAgencyB)).deriveFont((float)textSmallPanelTitleSize);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(pathAgencyB)));	
		}
		catch(IOException | FontFormatException e)
		{
			
		}
		
		try
		{
			font_AgencyMediumPanelTitle = Font.createFont(Font.TRUETYPE_FONT, new File(pathAgencyB)).deriveFont((float)textMediumPanelTitleSize);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(pathAgencyB)));	
		}
		catch(IOException | FontFormatException e)
		{
			
		}
	}
	

}
