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

public class GamesEditTickets extends JPanel {
	
	public JPanel panelEditTickets;
	private JLabel titleEditTickets;
	
	private List<JButton> observerButtons = new ArrayList<JButton>();
	
	public GamesEditTickets() {
		setBackground(UI_Elements.color_mainBackgroundColor);
		
		panelEditTickets = new JPanel();
		panelEditTickets.setBorder(null);
		panelEditTickets.setBackground(UI_Elements.color_mainBackgroundColor);
		panelEditTickets.setBounds(0, 5, 300, 272);
		panelEditTickets.setLayout(null);
		panelEditTickets.setVisible(false);
		
		titleEditTickets = new JLabel("EDIT TICKETS:");
		titleEditTickets.setVerticalAlignment(SwingConstants.TOP);
		titleEditTickets.setBounds(35, 1, 265, 26);
		titleEditTickets.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleEditTickets.setForeground(Color.WHITE);
		titleEditTickets.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, 20));
		panelEditTickets.add(titleEditTickets);
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
