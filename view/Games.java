package view;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class Games extends JPanel {
	
	public JPanel panelGames;
	private JLabel titleGames;
	public ViewStadium gamesStadiumPanel;
	
	private JLabel lblStadiumLegend;
	private ImageIcon stadiumLegend = new ImageIcon(Overview.class.getResource("/Images/StadiumLegend.png"));
	
	private JLabel lblSeason;
	private JLabel lblGame;
	private JComboBox cb_SalesSeason;
	private JComboBox cb_SalesGame;
	private JButton btnAddSeason;
	private JButton btnAddGame;
	private JButton btnAddTicketData;
	
	Games(){
		
		panelGames = new JPanel();
		panelGames.setBorder(null);
		panelGames.setBackground(UI_Elements.color_mainBackgroundColor);
		panelGames.setBounds(189, 0, 925, 617);
		panelGames.setLayout(null);
		// Overview Page Title
		titleGames = new JLabel("GAMES");
		titleGames.setVerticalAlignment(SwingConstants.TOP);
		titleGames.setBounds(25, 22, 470, 76);
		titleGames.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleGames.setForeground(Color.WHITE);
		titleGames.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, UI_Elements.textPanelTitleSize));
		panelGames.add(titleGames);
		
		gamesStadiumPanel = new ViewStadium();
		gamesStadiumPanel.setLayout(null);
		gamesStadiumPanel.setBounds((int) (panelGames.getBounds().width-20-gamesStadiumPanel.stadiumLblWidth), 85, gamesStadiumPanel.panelViewStadium.getBounds().width, gamesStadiumPanel.panelViewStadium.getBounds().height);
		gamesStadiumPanel.setVisible(true);
		panelGames.add(gamesStadiumPanel);
		gamesStadiumPanel.add(gamesStadiumPanel.panelViewStadium);
		
		lblStadiumLegend = new JLabel();
		lblStadiumLegend.setBounds(gamesStadiumPanel.getBounds().x, gamesStadiumPanel.getBounds().y + gamesStadiumPanel.getBounds().height, 555, 60);
		lblStadiumLegend.setIcon(UI_Elements.scaleImageTolabel(stadiumLegend, lblStadiumLegend));
		lblStadiumLegend.setOpaque(false);
		lblStadiumLegend.setBorder(null);
		panelGames.add(lblStadiumLegend);
		
		lblSeason = new JLabel("Season:");
		lblSeason.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblSeason.setForeground(Color.WHITE);
		lblSeason.setFont(UI_Elements.font_bodyLabel);
		lblSeason.setBorder(null);
		lblSeason.setBounds(35, 103, 65, 20);
		panelGames.add(lblSeason);
		
		cb_SalesSeason = new JComboBox();
		cb_SalesSeason.setFont(UI_Elements.font_bodyFillText);
		cb_SalesSeason.setModel(new DefaultComboBoxModel(new String[] {"2019/2020"}));
		cb_SalesSeason.setBounds(100, 103, 200, 20);
		panelGames.add(cb_SalesSeason);
		
		lblGame = new JLabel("Game:");
		lblGame.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblGame.setForeground(Color.WHITE);
		lblGame.setFont(UI_Elements.font_bodyLabel);
		lblGame.setBorder(null);
		lblGame.setBounds(35, (lblSeason.getBounds().y)+30, 65, 20);
		panelGames.add(lblGame);
		
		cb_SalesGame = new JComboBox();
		cb_SalesGame.setFont(UI_Elements.font_bodyFillText);
		cb_SalesGame.setModel(new DefaultComboBoxModel(new String[] {"Tamir vs. Yoni - 01/09/2019"}));
		cb_SalesGame.setBounds(100, (cb_SalesSeason.getBounds().y)+30, 200, 20);
		panelGames.add(cb_SalesGame);
		
		//Buttons
		btnAddSeason = new JButton("   ADD SEASON");
		btnAddSeason.setFocusPainted(false);
		btnAddSeason.setRequestFocusEnabled(false);
		btnAddSeason.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddSeason.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddSeason.setForeground(Color.WHITE);
		btnAddSeason.setToolTipText("Tickets");
		btnAddSeason.setOpaque(true);
		btnAddSeason.setBorder(null);
		btnAddSeason.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 20));
		btnAddSeason.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnAddSeason.setBounds(35, 175, 265, 40);
		panelGames.add(btnAddSeason);
		btnAddSeason.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddSeason.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	/*if(panelTickets.isVisible() == true)
		    	{
		    		btnAddSeason.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else*/
		    	{
		    		btnAddSeason.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    	}
		    }
		} );
		
		btnAddGame = new JButton("   ADD GAME");
		btnAddGame.setFocusPainted(false);
		btnAddGame.setRequestFocusEnabled(false);
		btnAddGame.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddGame.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddGame.setForeground(Color.WHITE);
		btnAddGame.setToolTipText("Concessions");
		btnAddGame.setOpaque(true);
		btnAddGame.setBorder(null);
		btnAddGame.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 20));
		btnAddGame.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnAddGame.setBounds(35, (btnAddSeason.getBounds().y)+55, 265, 40);
		panelGames.add(btnAddGame);
		btnAddGame.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddGame.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	/*if(panelConcessions.isVisible() == true)
		    	{
		    		btnAddGame.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else*/
		    	{
		    		btnAddGame.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    	}
		    }
		} );
		
		btnAddTicketData = new JButton("   ADD TICKET DATA");
		btnAddTicketData.setFocusPainted(false);
		btnAddTicketData.setRequestFocusEnabled(false);
		btnAddTicketData.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddTicketData.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddTicketData.setForeground(Color.WHITE);
		btnAddTicketData.setToolTipText("Merchandise");
		btnAddTicketData.setOpaque(true);
		btnAddTicketData.setBorder(null);
		btnAddTicketData.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 20));
		btnAddTicketData.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnAddTicketData.setBounds(35, (btnAddSeason.getBounds().y)+55*2, 265, 40);
		panelGames.add(btnAddTicketData);
		btnAddTicketData.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddTicketData.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	/*if(panelMerchandise.isVisible() == true)
		    	{
		    		btnAddTicketData.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else*/
		    	{
		    		btnAddTicketData.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    	}
		    }
		} );
	
		
		
	}

}
