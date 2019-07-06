package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
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
	public static int textSubPanelTitleSize = 30;
	public static int textBodyLabelSize = 15;
	public static int textBodyFillText = 13;
	public static int textBodySalesData = 17;
	
	//ICON
	public static ImageIcon amsIcon = new ImageIcon("Images/Icon.jpg");

	//FONTS
	public static String mainFontName = "Agency FB"; // Change string name to change main Menu & Title font
	public static Font font_menuButtonTextDefault = new Font(mainFontName, Font.PLAIN, 19);
	public static Font font_menuButtonTextUser = new Font(mainFontName, Font.PLAIN, 16);
	public static Font font_bodyLabel = new Font("Calibri", Font.BOLD, textBodyLabelSize); // Body JLabel font
	public static Font font_bodyFillText = new Font("Calibri", Font.PLAIN, textBodyFillText); // Text Field & Combo Box font
	public static Font font_bodySalesData = new Font("Calibri", Font.PLAIN, textBodySalesData); // Text Field & Combo Box font
	
	//UI METHODS
	public static ImageIcon scaleImageTolabel(ImageIcon i_Img, JLabel i_label)
	{
		ImageIcon scaledImage;
		
		scaledImage = new ImageIcon(i_Img.getImage().getScaledInstance(i_label.getWidth(), i_label.getHeight(), Image.SCALE_SMOOTH));
		
		return scaledImage;
	}
	
	public static ImageIcon scaleImageToButton(ImageIcon i_Img, JButton i_button)
	{
		ImageIcon scaledImage;
		
		scaledImage = new ImageIcon(i_Img.getImage().getScaledInstance(i_button.getWidth(), i_button.getHeight(), Image.SCALE_SMOOTH));
		
		return scaledImage;
	}

}
