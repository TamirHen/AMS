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
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
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
	private JButton btnEditTickets;
	
	private List<JPanel> gamesPanelSubPanels = new ArrayList<JPanel>();
	private List<JButton> gamesPanelButtons = new ArrayList<JButton>();
	private GamesAddSeason addSeasonPanel;
	private GamesAddGame addGamePanel;
	private GamesEditTickets editTicketsPanel;

	
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
		gamesStadiumPanel.setBounds((int) (panelGames.getBounds().width-gamesStadiumPanel.stadiumLblWidth)-30, 85, gamesStadiumPanel.panelViewStadium.getBounds().width, gamesStadiumPanel.panelViewStadium.getBounds().height);
		gamesStadiumPanel.setVisible(true);
		panelGames.add(gamesStadiumPanel);
		gamesStadiumPanel.add(gamesStadiumPanel.panelViewStadium);
		
		lblStadiumLegend = new JLabel();
		lblStadiumLegend.setBounds(gamesStadiumPanel.getBounds().x, gamesStadiumPanel.getBounds().y + gamesStadiumPanel.getBounds().height, 555, 60);
		lblStadiumLegend.setIcon(UI_Elements.scaleImageToBox(stadiumLegend, lblStadiumLegend));
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
		btnAddSeason.setSelected(false);
		btnAddSeason.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddSeason.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(btnAddSeason.isSelected() == true)
		    	{
		    		btnAddSeason.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
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
		btnAddGame.setSelected(false);
		btnAddGame.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddGame.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(btnAddGame.isSelected() == true)
		    	{
		    		btnAddGame.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnAddGame.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    	}
		    }
		} );
		
		btnEditTickets = new JButton("   EDIT TICKETS");
		btnEditTickets.setFocusPainted(false);
		btnEditTickets.setRequestFocusEnabled(false);
		btnEditTickets.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEditTickets.setHorizontalAlignment(SwingConstants.LEFT);
		btnEditTickets.setForeground(Color.WHITE);
		btnEditTickets.setToolTipText("Merchandise");
		btnEditTickets.setOpaque(true);
		btnEditTickets.setBorder(null);
		btnEditTickets.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 20));
		btnEditTickets.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnEditTickets.setBounds(35, (btnAddSeason.getBounds().y)+55*2, 265, 40);
		panelGames.add(btnEditTickets);
		btnEditTickets.setSelected(false);
		btnEditTickets.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnEditTickets.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(btnEditTickets.isSelected() == true)
		    	{
		    		btnEditTickets.setBackground(UI_Elements.color_panelBodyButtonSelected);
		    	}
		    	else
		    	{
		    		btnEditTickets.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    	}
		    }
		} );
		
		//Sub-panels
		addSeasonPanel = new GamesAddSeason();
		addSeasonPanel.setBounds(0, 345, addSeasonPanel.panelAddSeason.getBounds().width, addSeasonPanel.panelAddSeason.getBounds().height);
		panelGames.add(addSeasonPanel);
		addSeasonPanel.add(addSeasonPanel.panelAddSeason);
		addSeasonPanel.setLayout(null);
		addSeasonPanel.addObserverButton(btnAddSeason);
		addSeasonPanel.addObserverButton(btnAddGame);
		addSeasonPanel.addObserverButton(btnEditTickets);
		
		addGamePanel = new GamesAddGame();
		addGamePanel.setBounds(0, 345, addGamePanel.panelAddGame.getBounds().width, addGamePanel.panelAddGame.getBounds().height);
		panelGames.add(addGamePanel);
		addGamePanel.add(addGamePanel.panelAddGame);
		addGamePanel.setLayout(null);
		addGamePanel.addObserverButton(btnAddSeason);
		addGamePanel.addObserverButton(btnAddGame);
		addGamePanel.addObserverButton(btnEditTickets);
		
		editTicketsPanel = new GamesEditTickets();
		editTicketsPanel.setBounds(0, 345, editTicketsPanel.panelEditTickets.getBounds().width, editTicketsPanel.panelEditTickets.getBounds().height);
		panelGames.add(editTicketsPanel);
		editTicketsPanel.add(editTicketsPanel.panelEditTickets);
		editTicketsPanel.setLayout(null);
		editTicketsPanel.addObserverButton(btnAddSeason);
		editTicketsPanel.addObserverButton(btnAddGame);
		editTicketsPanel.addObserverButton(btnEditTickets);
		
		
		gamesPanelButtons.add(btnAddSeason);
		gamesPanelButtons.add(btnAddGame);
		gamesPanelButtons.add(btnEditTickets);
		
		gamesPanelSubPanels.add(addSeasonPanel);
		gamesPanelSubPanels.add(addSeasonPanel.panelAddSeason);
		gamesPanelSubPanels.add(addGamePanel);
		gamesPanelSubPanels.add(addGamePanel.panelAddGame);
		gamesPanelSubPanels.add(editTicketsPanel);
		gamesPanelSubPanels.add(editTicketsPanel.panelEditTickets);
		
		//Action Listeners
		btnAddSeason.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnAddSeason.isSelected() == false)
				{
					disableAllButtons(gamesPanelButtons);
					disableAllPanels(gamesPanelSubPanels);
					btnAddSeason.setSelected(true);
					btnAddSeason.setEnabled(true);
					btnAddSeason.setBackground(UI_Elements.color_panelBodyButtonSelected);
					addSeasonPanel.setVisible(true);
					addSeasonPanel.panelAddSeason.setVisible(true);
				}
				else
				{
					disableAllPanels(gamesPanelSubPanels);
					revertButtonToDefault(btnAddSeason, gamesPanelButtons);
				}
			}
		});
		
		btnAddGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnAddGame.isSelected() == false)
				{
					disableAllButtons(gamesPanelButtons);
					disableAllPanels(gamesPanelSubPanels);
					btnAddGame.setSelected(true);
					btnAddGame.setEnabled(true);
					btnAddGame.setBackground(UI_Elements.color_panelBodyButtonSelected);
					addGamePanel.setVisible(true);
					addGamePanel.panelAddGame.setVisible(true);
				}
				else
				{
					disableAllPanels(gamesPanelSubPanels);
					revertButtonToDefault(btnAddGame, gamesPanelButtons);
				}
			}
		});
		
		btnEditTickets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnEditTickets.isSelected() == false)
				{
					disableAllButtons(gamesPanelButtons);
					disableAllPanels(gamesPanelSubPanels);
					btnEditTickets.setSelected(true);
					btnEditTickets.setEnabled(true);
					btnEditTickets.setBackground(UI_Elements.color_panelBodyButtonSelected);
					editTicketsPanel.setVisible(true);
					editTicketsPanel.panelEditTickets.setVisible(true);
					gamesStadiumPanel.assignDetailsPanel(null);
				}
				else
				{
					disableAllPanels(gamesPanelSubPanels);
					revertButtonToDefault(btnEditTickets, gamesPanelButtons);
					gamesStadiumPanel.removeDetailsPanel(null);
				}
			}
		});
	
		
		
	}
	
	public void disableAllButtons(List<JButton> i_ButtonList)
	{
		for(JButton button : i_ButtonList)
		{
			button.setSelected(false);
			button.setEnabled(false);
			button.setBackground(UI_Elements.color_panelBodyButtonDefault);
		}
	}
	
	public void disableAllPanels(List<JPanel> i_PanelList)
	{
		for(JPanel panel : i_PanelList)
		{
			panel.setVisible(false);
		}
	}
	
	public void revertButtonToDefault(JButton i_Button ,List<JButton> i_ButtonList)
	{
		for(JButton button : i_ButtonList)
		{
			button.setSelected(false);
			button.setEnabled(true);
		}
		i_Button.setBackground(UI_Elements.color_panelBodyButtonDefault);
	}
}
