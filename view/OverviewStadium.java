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

public class OverviewStadium extends JPanel {
	
	public JPanel panelOverviewStadium;
	public JLabel overviewStadium;
	private ImageIcon stadium = new ImageIcon(Overview.class.getResource("/Images/Stadium3.png"));
	
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
		
		JButton overviewStadium_02 = new JButton();
		overviewStadium_02.setBorder(null);
		String path02 = "/Images/StadiumSlices/Stadium3" + getSectionStatus(2) + "_02.png";
		ImageIcon img02 = new ImageIcon(Overview.class.getResource(path02));
		overviewStadium_02.setBounds(overviewStadium.getBounds().x + (int)(1013*stadiumSizeRatio), overviewStadium.getBounds().y, (int)(img02.getIconWidth()*stadiumSizeRatio), (int)(img02.getIconHeight()*stadiumSizeRatio));
		overviewStadium_02.setIcon(View.scaleImageToButton(img02, overviewStadium_02));
		panelOverviewStadium.add(overviewStadium_02);
		String path02_R = "/Images/StadiumSlices/Stadium3_Rollover_02.png";
		ImageIcon img02_R = new ImageIcon(Overview.class.getResource(path02_R));
		overviewStadium_02.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
				overviewStadium_02.setIcon(View.scaleImageToButton(img02_R, overviewStadium_02));
		    }
		    public void mouseExited( MouseEvent e ) {
				overviewStadium_02.setIcon(View.scaleImageToButton(img02, overviewStadium_02));
		    }
		} );
		
		JButton overviewStadium_03 = new JButton();
		overviewStadium_03.setBorder(null);
		String path03 = "/Images/StadiumSlices/Stadium3" + getSectionStatus(3) + "_03.png";
		ImageIcon img03 = new ImageIcon(Overview.class.getResource(path03));
		overviewStadium_03.setBounds(overviewStadium_02.getBounds().x + overviewStadium_02.getBounds().width, overviewStadium.getBounds().y, (int)(img03.getIconWidth()*stadiumSizeRatio), (int)(img03.getIconHeight()*stadiumSizeRatio));
		overviewStadium_03.setIcon(View.scaleImageToButton(img03, overviewStadium_03));
		panelOverviewStadium.add(overviewStadium_03);

		
		JButton overviewStadium_04 = new JButton();
		overviewStadium_04.setBorder(null);
		String path04 = "/Images/StadiumSlices/Stadium3" + getSectionStatus(4) + "_04.png";
		ImageIcon img04 = new ImageIcon(Overview.class.getResource(path04));
		overviewStadium_04.setBounds(overviewStadium_03.getBounds().x + overviewStadium_03.getBounds().width, overviewStadium.getBounds().y, (int)(img04.getIconWidth()*stadiumSizeRatio), (int)(img04.getIconHeight()*stadiumSizeRatio));
		overviewStadium_04.setIcon(View.scaleImageToButton(img04, overviewStadium_04));
		panelOverviewStadium.add(overviewStadium_04);

		
		
		JButton overviewStadium_05 = new JButton();
		overviewStadium_05.setBorder(null);
		String path05 = "/Images/StadiumSlices/Stadium3" + getSectionStatus(5) + "_05.png";
		ImageIcon img05 = new ImageIcon(Overview.class.getResource(path05));
		overviewStadium_05.setBounds(overviewStadium_04.getBounds().x + overviewStadium_04.getBounds().width, overviewStadium.getBounds().y, (int)(img05.getIconWidth()*stadiumSizeRatio), (int)(img05.getIconHeight()*stadiumSizeRatio));
		overviewStadium_05.setIcon(View.scaleImageToButton(img05, overviewStadium_05));
		panelOverviewStadium.add(overviewStadium_05);

		
		JButton overviewStadium_06 = new JButton();
		overviewStadium_06.setBorder(null);
		String path06 = "/Images/StadiumSlices/Stadium3" + getSectionStatus(6) + "_06.png";
		ImageIcon img06 = new ImageIcon(Overview.class.getResource(path06));
		overviewStadium_06.setBounds(overviewStadium_05.getBounds().x + overviewStadium_05.getBounds().width, overviewStadium.getBounds().y, (int)(img06.getIconWidth()*stadiumSizeRatio), (int)(img06.getIconHeight()*stadiumSizeRatio));
		overviewStadium_06.setIcon(View.scaleImageToButton(img06, overviewStadium_06));
		panelOverviewStadium.add(overviewStadium_06);
		
		
		JButton overviewStadium_07 = new JButton();
		overviewStadium_07.setBorder(null);
		String path07 = "/Images/StadiumSlices/Stadium3" + getSectionStatus(7) + "_07.png";
		ImageIcon img07 = new ImageIcon(Overview.class.getResource(path07));
		overviewStadium_07.setBounds(overviewStadium_06.getBounds().x + overviewStadium_06.getBounds().width, overviewStadium.getBounds().y, (int)(img07.getIconWidth()*stadiumSizeRatio), (int)(img07.getIconHeight()*stadiumSizeRatio));
		overviewStadium_07.setIcon(View.scaleImageToButton(img07, overviewStadium_07));
		panelOverviewStadium.add(overviewStadium_07);
		
		JButton overviewStadium_08 = new JButton();
		overviewStadium_08.setBorder(null);
		String path08 = "/Images/StadiumSlices/Stadium3" + getSectionStatus(8) + "_08.png";
		ImageIcon img08 = new ImageIcon(Overview.class.getResource(path08));
		overviewStadium_08.setBounds(overviewStadium_07.getBounds().x + overviewStadium_07.getBounds().width, overviewStadium.getBounds().y, (int)(img08.getIconWidth()*stadiumSizeRatio), (int)(img08.getIconHeight()*stadiumSizeRatio));
		overviewStadium_08.setIcon(View.scaleImageToButton(img08, overviewStadium_08));
		panelOverviewStadium.add(overviewStadium_08);
		
		JButton overviewStadium_10 = new JButton();
		overviewStadium_10.setBorder(null);
		String path10 = "/Images/StadiumSlices/Stadium3" + getSectionStatus(10) + "_10.png";
		ImageIcon img10 = new ImageIcon(Overview.class.getResource(path10));
		overviewStadium_10.setBounds(overviewStadium.getBounds().x + (int)(1013*stadiumSizeRatio), overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img10.getIconWidth()*stadiumSizeRatio), (int)(img10.getIconHeight()*stadiumSizeRatio));
		overviewStadium_10.setIcon(View.scaleImageToButton(img10, overviewStadium_10));
		panelOverviewStadium.add(overviewStadium_10);
		
		JButton overviewStadium_11 = new JButton();
		overviewStadium_11.setBorder(null);
		String path11 = "/Images/StadiumSlices/Stadium3" + getSectionStatus(11) + "_11.png";
		ImageIcon img11 = new ImageIcon(Overview.class.getResource(path11));
		overviewStadium_11.setBounds(overviewStadium_10.getBounds().x + overviewStadium_10.getBounds().width, overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img11.getIconWidth()*stadiumSizeRatio), (int)(img11.getIconHeight()*stadiumSizeRatio));
		overviewStadium_11.setIcon(View.scaleImageToButton(img11, overviewStadium_11));
		panelOverviewStadium.add(overviewStadium_11);
		
		JButton overviewStadium_12 = new JButton();
		overviewStadium_12.setBorder(null);
		String path12 = "/Images/StadiumSlices/Stadium3" + getSectionStatus(12) + "_12.png";
		ImageIcon img12 = new ImageIcon(Overview.class.getResource(path12));
		overviewStadium_12.setBounds(overviewStadium_11.getBounds().x + overviewStadium_11.getBounds().width, overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img12.getIconWidth()*stadiumSizeRatio), (int)(img12.getIconHeight()*stadiumSizeRatio));
		overviewStadium_12.setIcon(View.scaleImageToButton(img12, overviewStadium_12));
		panelOverviewStadium.add(overviewStadium_12);
		
		JButton overviewStadium_13 = new JButton();
		overviewStadium_13.setBorder(null);
		String path13 = "/Images/StadiumSlices/Stadium3" + getSectionStatus(13) + "_13.png";
		ImageIcon img13 = new ImageIcon(Overview.class.getResource(path13));
		overviewStadium_13.setBounds(overviewStadium_12.getBounds().x + overviewStadium_12.getBounds().width, overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img13.getIconWidth()*stadiumSizeRatio), (int)(img13.getIconHeight()*stadiumSizeRatio));
		overviewStadium_13.setIcon(View.scaleImageToButton(img13, overviewStadium_13));
		panelOverviewStadium.add(overviewStadium_13);
		
		JButton overviewStadium_14 = new JButton();
		overviewStadium_14.setBorder(null);
		String path14 = "/Images/StadiumSlices/Stadium3" + getSectionStatus(14) + "_14.png";
		ImageIcon img14 = new ImageIcon(Overview.class.getResource(path14));
		overviewStadium_14.setBounds(overviewStadium_13.getBounds().x + overviewStadium_13.getBounds().width, overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img14.getIconWidth()*stadiumSizeRatio), (int)(img14.getIconHeight()*stadiumSizeRatio));
		overviewStadium_14.setIcon(View.scaleImageToButton(img14, overviewStadium_14));
		panelOverviewStadium.add(overviewStadium_14);
		
		JButton overviewStadium_15 = new JButton();
		overviewStadium_15.setBorder(null);
		String path15 = "/Images/StadiumSlices/Stadium3" + getSectionStatus(15) + "_15.png";
		ImageIcon img15 = new ImageIcon(Overview.class.getResource(path15));
		overviewStadium_15.setBounds(overviewStadium_14.getBounds().x + overviewStadium_14.getBounds().width, overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img15.getIconWidth()*stadiumSizeRatio), (int)(img15.getIconHeight()*stadiumSizeRatio));
		overviewStadium_15.setIcon(View.scaleImageToButton(img15, overviewStadium_15));
		panelOverviewStadium.add(overviewStadium_15);
		
		JButton overviewStadium_16 = new JButton();
		overviewStadium_16.setBorder(null);
		String path16 = "/Images/StadiumSlices/Stadium3" + getSectionStatus(16) + "_16.png";
		ImageIcon img16 = new ImageIcon(Overview.class.getResource(path16));
		overviewStadium_16.setBounds(overviewStadium_15.getBounds().x + overviewStadium_15.getBounds().width, overviewStadium_02.getBounds().y + overviewStadium_07.getBounds().height, (int)(img16.getIconWidth()*stadiumSizeRatio), (int)(img16.getIconHeight()*stadiumSizeRatio));
		overviewStadium_16.setIcon(View.scaleImageToButton(img16, overviewStadium_16));
		panelOverviewStadium.add(overviewStadium_16);
		
		JLabel overviewStadiumImg = new JLabel();
		overviewStadiumImg.setBorder(null);
		overviewStadiumImg.setBounds(0, 0, (int)stadiumLblWidth , (int)stadiumLblHeight);
		panelOverviewStadium.add(overviewStadiumImg);
		overviewStadiumImg.setIcon(View.scaleImageTolabel(stadium, overviewStadium));
		overviewStadiumImg.setVisible(true);
		
		
	}
	
	public String getSectionStatus(int i_SectionNum) {
		return "";
	}

}
