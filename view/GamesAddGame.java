package view;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class GamesAddGame extends JPanel {
	
	public JPanel panelAddGame;
	private JLabel titleAddGame;
	private JLabel lblGameName;
	private JTextField tf_GameName;
	private JLabel lblSeasonName;
	private JTextField tf_SeasonName;
	private JLabel lblLeagueName;
	private JTextField tf_LeagueName;
	private JButton btnAddSeasonFinish;
	private JButton btnAddSeasonCancel;
	
	private List<JButton> observerButtons = new ArrayList<JButton>();
	
	public GamesAddGame() {
		setBackground(UI_Elements.color_mainBackgroundColor);
		
		panelAddGame = new JPanel();
		panelAddGame.setBorder(null);
		panelAddGame.setBackground(UI_Elements.color_mainBackgroundColor);
		panelAddGame.setBounds(0, 5, 300, 272);
		panelAddGame.setLayout(null);
		panelAddGame.setVisible(false);
		
		titleAddGame = new JLabel("ADD GAME:");
		titleAddGame.setVerticalAlignment(SwingConstants.TOP);
		titleAddGame.setBounds(35, 1, 265, 26);
		titleAddGame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleAddGame.setForeground(Color.WHITE);
		titleAddGame.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, 20));
		panelAddGame.add(titleAddGame);
		
		lblGameName = new JLabel("Game Name (e. Name - Date):");
		lblGameName.setBorder(null);
		lblGameName.setForeground(Color.WHITE);
		lblGameName.setFont(UI_Elements.font_bodyLabel);
		lblGameName.setBounds(35, titleAddGame.getBounds().y+titleAddGame.getBounds().height+12, 250, 22);
		panelAddGame.add(lblGameName);
		
		tf_GameName = new JTextField(); //TODO - add name validation
		tf_GameName.setDisabledTextColor(Color.BLACK);
		tf_GameName.setEnabled(true);
		tf_GameName.setEditable(true);
		tf_GameName.setHorizontalAlignment(SwingConstants.LEFT);
		tf_GameName.setFont(UI_Elements.font_bodyFillText);
		tf_GameName.setBounds(lblGameName.getBounds().x, lblGameName.getBounds().y+lblGameName.getBounds().height, panelAddGame.getBounds().width, 30);
		panelAddGame.add(tf_GameName);
		tf_GameName.setColumns(10);
		
		lblSeasonName = new JLabel("Season Name:");
		lblSeasonName.setBorder(null);
		lblSeasonName.setForeground(Color.WHITE);
		lblSeasonName.setFont(UI_Elements.font_bodyLabel);
		lblSeasonName.setBounds(lblGameName.getBounds().x, tf_GameName.getBounds().y+tf_GameName.getBounds().height+10, 250, 22);
		panelAddGame.add(lblSeasonName);
		
		tf_SeasonName = new JTextField(); //TODO - add name validation
		tf_SeasonName.setDisabledTextColor(Color.BLACK);
		tf_SeasonName.setEnabled(true);
		tf_SeasonName.setEditable(true);
		tf_SeasonName.setHorizontalAlignment(SwingConstants.LEFT);
		tf_SeasonName.setFont(UI_Elements.font_bodyFillText);
		tf_SeasonName.setBounds(lblSeasonName.getBounds().x, lblSeasonName.getBounds().y+lblSeasonName.getBounds().height, panelAddGame.getBounds().width, 30);
		panelAddGame.add(tf_SeasonName);
		tf_SeasonName.setColumns(10);
		
		btnAddSeasonFinish = new JButton("FINISH");
		btnAddSeasonFinish.setFocusPainted(false);
		btnAddSeasonFinish.setRequestFocusEnabled(false);
		btnAddSeasonFinish.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddSeasonFinish.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddSeasonFinish.setForeground(Color.WHITE);
		btnAddSeasonFinish.setOpaque(true);
		btnAddSeasonFinish.setBorder(null);
		btnAddSeasonFinish.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 18));
		btnAddSeasonFinish.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnAddSeasonFinish.setBounds(35, tf_SeasonName.getBounds().y+tf_SeasonName.getBounds().height+12, 75, 25);
		btnAddSeasonFinish.setSelected(false);
		panelAddGame.add(btnAddSeasonFinish);
		btnAddSeasonFinish.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddSeasonFinish.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnAddSeasonFinish.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    }
		} );
		
		btnAddSeasonCancel = new JButton("CANCEL");
		btnAddSeasonCancel.setFocusPainted(false);
		btnAddSeasonCancel.setRequestFocusEnabled(false);
		btnAddSeasonCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddSeasonCancel.setHorizontalAlignment(SwingConstants.CENTER);
		btnAddSeasonCancel.setForeground(Color.WHITE);
		btnAddSeasonCancel.setOpaque(true);
		btnAddSeasonCancel.setBorder(null);
		btnAddSeasonCancel.setFont(new Font(UI_Elements.mainFontName, Font.PLAIN, 18));
		btnAddSeasonCancel.setBackground(UI_Elements.color_panelBodyButtonDefault);
		btnAddSeasonCancel.setBounds(btnAddSeasonFinish.getBounds().x + btnAddSeasonFinish.getBounds().width + 15, btnAddSeasonFinish.getBounds().y, 75, 25);
		btnAddSeasonCancel.setSelected(false);
		panelAddGame.add(btnAddSeasonCancel);
		btnAddSeasonCancel.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	btnAddSeasonCancel.setBackground(UI_Elements.color_panelBodyButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	btnAddSeasonCancel.setBackground(UI_Elements.color_panelBodyButtonDefault);
		    }
		} );
		
		
		//Action Listeners
		btnAddSeasonFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelAddGame.setVisible(false);
				setButtonsToDefault();
			}
		});
		
		btnAddSeasonCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelAddGame.setVisible(false);
				setButtonsToDefault();
			}
		});
		
	}

	public void addObserverButton(JButton i_Button)
	{
		this.observerButtons.add(i_Button);
	}

	public void removeObserverButton(JButton i_Button)
	{
		this.observerButtons.remove(i_Button);
	}
	
	public void setButtonsToDefault()
	{
		for(JButton button : observerButtons)
		{
			button.setEnabled(true);
			button.setSelected(false);
		}
	}
	
}
