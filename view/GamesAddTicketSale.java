package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GamesAddTicketSale extends JFrame {

	public JPanel panelAddTicketSale;
	private JLabel titleAddTicketSale;

	
	public GamesAddTicketSale() {
		//set Frame:
		setBounds(385, 55, 400, 550);
		this.setResizable(false);
		panelAddTicketSale = new JPanel();
		panelAddTicketSale.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelAddTicketSale.setBackground(UI_Elements.color_menuBar);
		setContentPane(panelAddTicketSale);
		panelAddTicketSale.setLayout(null);
		panelAddTicketSale.setVisible(true);
		this.setIconImage(UI_Elements.amsIcon.getImage());
		
		titleAddTicketSale = new JLabel("ADD TICKET SALE");
		titleAddTicketSale.setVerticalAlignment(SwingConstants.TOP);
		titleAddTicketSale.setBounds(25, 22, 265, 26);
		titleAddTicketSale.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		titleAddTicketSale.setForeground(Color.WHITE);
		titleAddTicketSale.setFont(new Font(UI_Elements.mainFontName, Font.BOLD, 25));
		panelAddTicketSale.add(titleAddTicketSale);
		
	}
}

