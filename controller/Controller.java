package controller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;
import model.Stadium;
import model.User;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

import sqlite.*;
import model.*;
import view.*;

public class Controller {
	private View view;
	private Model model;
	
	//--ViewStadium Images--//
	public ImageIcon img_1;
	public ImageIcon img_2;
	public ImageIcon img_3;
	public ImageIcon img_4;
	public ImageIcon img_5;
	public ImageIcon img_6;
	public ImageIcon img_7;
	public ImageIcon img_8;
	public ImageIcon img_9;
	public ImageIcon img_10;
	public ImageIcon img_11;
	public ImageIcon img_12;
	public ImageIcon img_13;
	public ImageIcon img_14;
	public ImageIcon img_15;
	public ImageIcon img_16;
	public ImageIcon img_17;
	public ImageIcon img_18;
	public ImageIcon img_19;
	public ImageIcon img_20;
	public ImageIcon img_21;
	public ImageIcon img_22;
	public ImageIcon img_23;
	public ImageIcon img_24;
	public ImageIcon img_25;
	public ImageIcon img_26;
	public ImageIcon img_27;
	public ImageIcon img_28;
	public ImageIcon img_29;
	public ImageIcon img_30;
	public ImageIcon img_31;
	public ImageIcon img_32;
	public ImageIcon img_33;
	public ImageIcon img_34;
	public ImageIcon img_35;
	public ImageIcon img_36;
	public ImageIcon img_37;
	public ImageIcon img_38;
	public ImageIcon img_39;
	public ImageIcon img_40;
	public ImageIcon img_41;
	public ImageIcon img_42;
	public ImageIcon img_43;
	public ImageIcon img_44;
	
	public ImageIcon img_1_R;
	public ImageIcon img_2_R;
	public ImageIcon img_3_R;
	public ImageIcon img_4_R;
	public ImageIcon img_5_R;
	public ImageIcon img_6_R;
	public ImageIcon img_7_R;
	public ImageIcon img_8_R;
	public ImageIcon img_9_R;
	public ImageIcon img_10_R;
	public ImageIcon img_11_R;
	public ImageIcon img_12_R;
	public ImageIcon img_13_R;
	public ImageIcon img_14_R;
	public ImageIcon img_15_R;
	public ImageIcon img_16_R;
	public ImageIcon img_17_R;
	public ImageIcon img_18_R;
	public ImageIcon img_19_R;
	public ImageIcon img_20_R;
	public ImageIcon img_21_R;
	public ImageIcon img_22_R;
	public ImageIcon img_23_R;
	public ImageIcon img_24_R;
	public ImageIcon img_25_R;
	public ImageIcon img_26_R;
	public ImageIcon img_27_R;
	public ImageIcon img_28_R;
	public ImageIcon img_29_R;
	public ImageIcon img_30_R;
	public ImageIcon img_31_R;
	public ImageIcon img_32_R;
	public ImageIcon img_33_R;
	public ImageIcon img_34_R;
	public ImageIcon img_35_R;
	public ImageIcon img_36_R;
	public ImageIcon img_37_R;
	public ImageIcon img_38_R;
	public ImageIcon img_39_R;
	public ImageIcon img_40_R;
	public ImageIcon img_41_R;
	public ImageIcon img_42_R;
	public ImageIcon img_43_R;
	public ImageIcon img_44_R;
	
	public ImageIcon img_1_S;
	public ImageIcon img_2_S;
	public ImageIcon img_3_S;
	public ImageIcon img_4_S;
	public ImageIcon img_5_S;
	public ImageIcon img_6_S;
	public ImageIcon img_7_S;
	public ImageIcon img_8_S;
	public ImageIcon img_9_S;
	public ImageIcon img_10_S;
	public ImageIcon img_11_S;
	public ImageIcon img_12_S;
	public ImageIcon img_13_S;
	public ImageIcon img_14_S;
	public ImageIcon img_15_S;
	public ImageIcon img_16_S;
	public ImageIcon img_17_S;
	public ImageIcon img_18_S;
	public ImageIcon img_19_S;
	public ImageIcon img_20_S;
	public ImageIcon img_21_S;
	public ImageIcon img_22_S;
	public ImageIcon img_23_S;
	public ImageIcon img_24_S;
	public ImageIcon img_25_S;
	public ImageIcon img_26_S;
	public ImageIcon img_27_S;
	public ImageIcon img_28_S;
	public ImageIcon img_29_S;
	public ImageIcon img_30_S;
	public ImageIcon img_31_S;
	public ImageIcon img_32_S;
	public ImageIcon img_33_S;
	public ImageIcon img_34_S;
	public ImageIcon img_35_S;
	public ImageIcon img_36_S;
	public ImageIcon img_37_S;
	public ImageIcon img_38_S;
	public ImageIcon img_39_S;
	public ImageIcon img_40_S;
	public ImageIcon img_41_S;
	public ImageIcon img_42_S;
	public ImageIcon img_43_S;
	public ImageIcon img_44_S;
	//---------------------//
	
	
	
	public Controller(View amsView, Model amsModel) {
		this.view = amsView;
		this.model = amsModel;
	
		//---login panel---//
		//	btnLogin pressed:
		view.loginPanel.btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (model.isUserExist(view.loginPanel.tf_loginUsername.getText(),view.loginPanel.passwordField_Login.getPassword())) {
					btnLoginPressed();
				}
				else
					view.loginPanel.lblLoginFailed.setVisible(true);

			}	
		});
		//btnSignUp pressed:
		view.loginPanel.btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.signUpFrame.setVisible(true);

			}	
		});
		
		//---sign up panel---//
		view.signUpFrame.btnFinishSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(model.isUserNameExist(view.signUpFrame.tf_enterUserName.getText())) {
					view.signUpFrame.lblUsernameAlreadyExist.setVisible(true);
					view.signUpFrame.lblPasswordMismatch.setVisible(false);
				}
				else if(!Arrays.equals(view.signUpFrame.pf_enterPassword.getPassword(),view.signUpFrame.pf_enterPasswordAgain.getPassword())) {
					view.signUpFrame.lblPasswordMismatch.setVisible(true);
					view.signUpFrame.lblUsernameAlreadyExist.setVisible(false);
				}
				else {
					view.signUpFrame.setVisible(false);
					model.addUser(view.signUpFrame.tf_enterUserName.getText(), view.signUpFrame.tf_enterFirstName.getText(), view.signUpFrame.tf_enterLastName.getText(), view.signUpFrame.pf_enterPassword.getPassword(), view.signUpFrame.tf_enterEmail.getText());
				}

			}	
		});
		view.signUpFrame.btnCancelSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.signUpFrame.setVisible(false);
			}	
		});
		
		//---menu panel---//
		//Menu Button behavior//		
		//btnOverview - press:
		view.menuPanel.btnOverview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchMainMenuPage(view.menuPanel.btnOverview);
			}
		});
		//btnOverview - Rollover:
		view.menuPanel.btnOverview.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	view.menuPanel.btnOverview.setBackground(UI_Elements.color_menuButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(view.overviewPanel.panelOverview.isVisible() == true)
		    	{
		    		view.menuPanel.btnOverview.setBackground(UI_Elements.color_menuButtonSelected);
		    	}
		    	else
		    	{
		    		view.menuPanel.btnOverview.setBackground(UI_Elements.color_menuBar);
		    	}
		    }
		} );
		
		//btnProperties - press:
		view.menuPanel.btnProperties.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			switchMainMenuPage(view.menuPanel.btnProperties);
			
			}
		});
		//btnProperties - Rollover:
		view.menuPanel.btnProperties.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	view.menuPanel.btnProperties.setBackground(UI_Elements.color_menuButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(view.propertiesPanel.panelProperties.isVisible() == true)
		    	{
		    		view.menuPanel.btnProperties.setBackground(UI_Elements.color_menuButtonSelected);
		    	}
		    	else
		    	{
		    		view.menuPanel.btnProperties.setBackground(UI_Elements.color_menuBar);
		    	}
		    }
		} );
		
		//btnSales - press:
		view.menuPanel.btnSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchMainMenuPage(view.menuPanel.btnSales);
			}
		});
		//btnSales - Rollover:
		view.menuPanel.btnSales.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	view.menuPanel.btnSales.setBackground(UI_Elements.color_menuButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(view.salesPanel.panelSales.isVisible() == true)
		    	{
		    		view.menuPanel.btnSales.setBackground(UI_Elements.color_menuButtonSelected);
		    	}
		    	else
		    	{
		    		view.menuPanel.btnSales.setBackground(UI_Elements.color_menuBar);
		    	}
		    }
		} );
		
		//btnFacilities - press:
		view.menuPanel.btnFacilities.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			switchMainMenuPage(view.menuPanel.btnFacilities);			
			}
		});
		//btnFacilities - Rollover:
		view.menuPanel.btnFacilities.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	view.menuPanel.btnFacilities.setBackground(UI_Elements.color_menuButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(view.facilitiesPanel.panelFacilities.isVisible() == true)
		    	{
		    		view.menuPanel.btnFacilities.setBackground(UI_Elements.color_menuButtonSelected);
		    	}
		    	else
		    	{
		    		view.menuPanel.btnFacilities.setBackground(UI_Elements.color_menuBar);
		    	}
		    }
		} );
		
		//btnGames - press:
		view.menuPanel.btnGames.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			switchMainMenuPage(view.menuPanel.btnGames);			
			}
		});
		//btnFacilities - Rollover:
		view.menuPanel.btnGames.addMouseListener( new MouseAdapter() {
		    public void mouseEntered( MouseEvent e ) {
		    	view.menuPanel.btnGames.setBackground(UI_Elements.color_menuButtonRollover);
		    }
		    public void mouseExited( MouseEvent e ) {
		    	if(view.gamesPanel.panelGames.isVisible() == true)
		    	{
		    		view.menuPanel.btnGames.setBackground(UI_Elements.color_menuButtonSelected);
		    	}
		    	else
		    	{
		    		view.menuPanel.btnGames.setBackground(UI_Elements.color_menuBar);
		    	}
		    }
		} );
		
		
		//button UserName:
		view.menuPanel.btnUserName.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			if (view.menuPanel.btnLogout.isVisible() == false)
			{
				view.menuPanel.btnLogout.setVisible(true);
				view.menuPanel.btnUserName.setBackground(UI_Elements.color_menuButtonSelected);
			}
			else {
				view.menuPanel.btnUserName.setBackground(UI_Elements.color_menuBar);
				view.menuPanel.btnLogout.setVisible(false);
			}

		}
	});
		
		//button logout:
		view.menuPanel.btnLogout.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			view.menuPanel.btnUserName.setBackground(UI_Elements.color_menuBar);
			view.menuPanel.btnLogout.setVisible(false);
			view.displayLoginPage();
		}
	});

		
		//---properties panel---//
		//text fields:
		view.propertiesPanel.tf_ArenaName.setText(model.stadium.getStadiumName());
		view.propertiesPanel.tf_Address.setText(model.stadium.getAddress());
		view.propertiesPanel.tf_ArenaNumOfSeats.setText(String.valueOf(model.stadium.getCapacity()));
		view.propertiesPanel.tf_SectionTicketPrice.setText(String.valueOf(model.stadium.getArenaSection(0).getTicketPrice()));
		view.propertiesPanel.tf_SectionNumOfSeats.setText(String.valueOf(model.stadium.getArenaSection(1).getNumOfSeats()));
		//set sections in the combobox:
		for (int i = 0; i < model.db.sectionSize; i++) {
			view.propertiesPanel.cb_SectionSelection.addItem(model.db.section[i].getSectionName());
		}
		//set the first section in view:
		displaySectionDetails(0);
		// Actions:
		view.propertiesPanel.btnEditProperties.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.propertiesPanel.btnEditProperties.setVisible(false);
				view.propertiesPanel.btnCancelEditing.setVisible(true);
				view.propertiesPanel.btnFinishEditingProperties.setVisible(true);
				view.propertiesPanel.btnEditSectionTypeTicketPrice.setVisible(true);
				view.propertiesPanel.setProperties(true);
				view.propertiesPanel.cb_SectionSelection.setEnabled(false);
				view.propertiesPanel.cb_SectionSelection.setRenderer(new DefaultListCellRenderer() { // Send Yoni
					public void paint(Graphics g) {
						setForeground(Color.BLACK);
						super.paint(g);
					}
				});
			}
		});

		view.propertiesPanel.btnFinishEditingProperties.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				view.propertiesPanel.cb_SectionSelection.setEnabled(true);
				view.propertiesPanel.btnFinishEditingProperties.setVisible(false);
				view.propertiesPanel.btnEditProperties.setVisible(true);
				view.propertiesPanel.btnCancelEditing.setVisible(false);
				view.propertiesPanel.btnEditSectionTypeTicketPrice.setVisible(false);

				view.propertiesPanel.sectionInedex = view.propertiesPanel.cb_SectionSelection.getSelectedIndex(); // Gets the Section we want to edit
				
				model.stadium.setStadiumName(view.propertiesPanel.tf_ArenaName.getText());
				model.stadium.setAddress(view.propertiesPanel.tf_Address.getText());
				// -------------//
				model.stadium.getArenaSection(view.propertiesPanel.sectionInedex)
						.setSectionType(view.propertiesPanel.cb_SectionType.getModel().getSelectedItem().toString());
				model.stadium.getArenaSection(view.propertiesPanel.sectionInedex)
						.setSectionRanking(view.propertiesPanel.cb_SectionRanking.getModel().getSelectedItem().toString());
				model.stadium.getArenaSection(view.propertiesPanel.sectionInedex)
						.setTicketPrice(Float.valueOf(view.propertiesPanel.tf_SectionTicketPrice.getText()).floatValue());
				model.stadium.getArenaSection(view.propertiesPanel.sectionInedex)
						.setNumOfSeats(Integer.valueOf(view.propertiesPanel.tf_SectionNumOfSeats.getText()).intValue(), model.stadium);
				if (view.propertiesPanel.rdbtnIsRoofedYes.isSelected()) {
					model.stadium.getArenaSection(view.propertiesPanel.sectionInedex).setRoofed(true);
					//set new Section properties in DB with "isRoofed" true:
					model.db.updateSections(view.propertiesPanel.sectionInedex+1, view.propertiesPanel.cb_SectionType.getModel().getSelectedItem().toString(), Float.valueOf(view.propertiesPanel.tf_SectionTicketPrice.getText()).floatValue(), Integer.valueOf(view.propertiesPanel.tf_SectionNumOfSeats.getText()).intValue(), "true", view.propertiesPanel.cb_SectionRanking.getModel().getSelectedItem().toString());
				} else {
					model.stadium.getArenaSection(view.propertiesPanel.sectionInedex).setRoofed(false);
					//set new Section properties in DB with "isRoofed" false:
					model.db.updateSections(view.propertiesPanel.sectionInedex+1, view.propertiesPanel.cb_SectionType.getModel().getSelectedItem().toString(), Float.valueOf(view.propertiesPanel.tf_SectionTicketPrice.getText()).floatValue(), Integer.valueOf(view.propertiesPanel.tf_SectionNumOfSeats.getText()).intValue(), "false", view.propertiesPanel.cb_SectionRanking.getModel().getSelectedItem().toString());

				}
				// -------------//
				//update changes in DB:
				model.db.updateProperties(1, view.propertiesPanel.tf_ArenaName.getText(), "Real Madrid", model.stadium.getCapacity(), view.propertiesPanel.tf_Address.getText(), 5);
				//--------------//

				view.propertiesPanel.tf_ArenaNumOfSeats.setText(String.valueOf(model.stadium.getCapacity())); //changes number of seats according to the section changes

				view.propertiesPanel.setProperties(false);
			}
		});

		view.propertiesPanel.btnCancelEditing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.propertiesPanel.cb_SectionSelection.setEnabled(true);
				view.propertiesPanel.btnCancelEditing.setVisible(false);
				view.propertiesPanel.btnEditProperties.setVisible(true);
				view.propertiesPanel.btnFinishEditingProperties.setVisible(false);
				view.propertiesPanel.btnEditSectionTypeTicketPrice.setVisible(false);

				view.propertiesPanel.sectionInedex = view.propertiesPanel.cb_SectionSelection.getSelectedIndex(); // Gets the Section we want to edit

				view.propertiesPanel.tf_ArenaName.setText(model.stadium.getStadiumName());
				view.propertiesPanel.tf_Address.setText(model.stadium.getAddress());
				view.propertiesPanel.tf_ArenaNumOfSeats.setText(String.valueOf(model.stadium.getCapacity()));
				// -------------//

				view.propertiesPanel.cb_SectionType.setSelectedItem(model.stadium.getArenaSection(view.propertiesPanel.sectionInedex).getSectionType());
				view.propertiesPanel.cb_SectionRanking.setSelectedItem(model.stadium.getArenaSection(view.propertiesPanel.sectionInedex).getSectionRanking());
				view.propertiesPanel.tf_SectionTicketPrice.setText(String.valueOf(model.stadium.getArenaSection(view.propertiesPanel.sectionInedex).getTicketPrice()));
				view.propertiesPanel.tf_SectionNumOfSeats.setText(String.valueOf(model.stadium.getArenaSection(view.propertiesPanel.sectionInedex).getNumOfSeats()));
				if (model.stadium.getArenaSection(view.propertiesPanel.sectionInedex).isRoofed()) {
					view.propertiesPanel.rdbtnIsRoofedYes.setSelected(true);
					view.propertiesPanel.rdbtnIsRoofedNO.setSelected(false);
				} else {
					view.propertiesPanel.rdbtnIsRoofedYes.setSelected(false);
					view.propertiesPanel.rdbtnIsRoofedNO.setSelected(true);
				}

				view.propertiesPanel.setProperties(false);
			}
		});
		
		view.propertiesPanel.btnEditSectionTypeTicketPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(view.propertiesPanel.tf_SectionTicketPrice.isEnabled() == false)
				{
					view.propertiesPanel.tf_SectionTicketPrice.setEnabled(true);
					view.propertiesPanel.tf_SectionTicketPrice.setEditable(true);
				}
				else
				{
					view.propertiesPanel.tf_SectionTicketPrice.setEnabled(false);
					view.propertiesPanel.tf_SectionTicketPrice.setEditable(false);
				}
			}
		});
		
		view.propertiesPanel.cb_SectionSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				displaySectionDetails(view.propertiesPanel.cb_SectionSelection.getSelectedIndex()); // function which display the data on a
																				// given section
			}
		});

		view.propertiesPanel.rdbtnIsRoofedYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!view.propertiesPanel.rdbtnIsRoofedYes.isSelected()) {
					view.propertiesPanel.rdbtnIsRoofedYes.setSelected(true);
					view.propertiesPanel.rdbtnIsRoofedNO.setSelected(false);
				} else {
					view.propertiesPanel.rdbtnIsRoofedYes.setSelected(true);
					view.propertiesPanel.rdbtnIsRoofedNO.setSelected(false);
				}
			}
		});

		view.propertiesPanel.rdbtnIsRoofedNO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!view.propertiesPanel.rdbtnIsRoofedNO.isSelected()) {
					view.propertiesPanel.rdbtnIsRoofedNO.setSelected(true);
					view.propertiesPanel.rdbtnIsRoofedYes.setSelected(false);
				} else {
					view.propertiesPanel.rdbtnIsRoofedNO.setSelected(true);
					view.propertiesPanel.rdbtnIsRoofedYes.setSelected(false);
				}
			}
		});
		
		//---Sales Panel (in view)---//
		view.salesPanel.cb_SalesSeason.removeAllItems();
		for (int i = 0; i < model.seasonSize; i++) {
			view.salesPanel.cb_SalesSeason.addItem(model.season[i].getName());
		}
		displayAllGamesInGivenSeasonSalePanel();//set up default
		view.salesPanel.cb_SalesSeason.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				displayAllGamesInGivenSeasonSalePanel(); //
			}
		});
		
		view.salesPanel.btnTickets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				displayGameRevenue(view.salesPanel.cb_SalesSeason.getSelectedIndex(),view.salesPanel.cb_SalesGame.getSelectedIndex());
				
			}
		});
		
//		view.salesPanel.btnSponsorships.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				view.salesPanel.sponsorshipsPanel.sponsorTable.setVisible(true);
//				view.salesPanel.sponsorshipsPanel.sponsorTableScrollPane.setVisible(true);
//				view.salesPanel.sponsorshipsPanel.sponsorTable.setEnabled(true);
//				view.salesPanel.sponsorshipsPanel.sponsorTableScrollPane.setEnabled(true);
//				
//				
//			}
//		});
		
	
//		
//		for (int i = 0; i < model.sponsorsSize; i++) {
//			view.salesPanel.sponsorshipsPanel.sponsorTable.add(model.season[i].getName());
//			
//		view.salesPanel.sponsorshipsPanel.btnAddSponsorFinish.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				model.sponsors[1].setName(view.salesPanel.sponsorshipsPanel.tf_SponsorName.getText());
//				model.sponsors[1].setContractLength(Integer.parseInt(view.salesPanel.sponsorshipsPanel.tf_SponsorName.getText()));
//				model.sponsors[1].setName(view.salesPanel.sponsorshipsPanel.tf_SponsorName.getText());
//				
//				
//			}
//		});
		//-----------------------------------------//
		
		//---Game Panel (in view)---//
		for (int i = 0; i < model.seasonSize; i++) {
			view.gamesPanel.cb_SalesSeason.addItem(model.season[i].getName());
		}
		displayAllGamesInGivenSeason();//set up default
		view.gamesPanel.cb_SalesSeason.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				displayAllGamesInGivenSeason();
				
			}
		});
		//--------------------------//
		
		//---ViewStadium Image Manipulations---//
		
		String path44 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(44) + "_44.png"; //TODO
		img_44 = new ImageIcon(Overview.class.getResource(path44));
		String path44_R = "/Images/StadiumSlices/Stadium_Rollover_44.png";
		img_44_R = new ImageIcon(Overview.class.getResource(path44_R));
		String path44_S = "/Images/StadiumSlices/Stadium_Selected_44.png";
		img_44_S = new ImageIcon(Overview.class.getResource(path44_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_44.setBounds(view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().x + (int)(535*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y + (int)(451*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio) , (int)(img_44.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_44.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_44.setIcon(UI_Elements.scaleImageToBox(img_44, view.overviewPanel.overviewStadiumPanel.viewStadium_44));
		MouseAdapter ma44_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_44, img_44, img_44_R, img_44_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_44, ma44_Overview, img_44_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_44.addMouseListener(ma44_Overview);
		
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_44.setBounds(view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().x + (int)(535*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y + (int)(451*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio) , (int)(img_44.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_44.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_44.setIcon(UI_Elements.scaleImageToBox(img_44, view.gamesPanel.gamesStadiumPanel.viewStadium_44));
		MouseAdapter ma44_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_44, img_44, img_44_R, img_44_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_44, ma44_Games, img_44_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_44.addMouseListener(ma44_Games);

		
		String path43 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(43) + "_43.png";
		img_43 = new ImageIcon(Overview.class.getResource(path43));
		String path43_R = "/Images/StadiumSlices/Stadium_Rollover_43.png";
		img_43_R = new ImageIcon(Overview.class.getResource(path43_R));
		String path43_S = "/Images/StadiumSlices/Stadium_Selected_43.png";
		img_43_S = new ImageIcon(Overview.class.getResource(path43_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_43.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_44.getBounds().x, view.overviewPanel.overviewStadiumPanel.viewStadium_44.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_44.getBounds().height, (int)(img_43.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_43.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_43.setIcon(UI_Elements.scaleImageToBox(img_43, view.overviewPanel.overviewStadiumPanel.viewStadium_43));
		MouseAdapter ma43_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_43, img_43, img_43_R, img_43_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_43, ma43_Overview, img_43_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_43.addMouseListener(ma43_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_43.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_44.getBounds().x, view.gamesPanel.gamesStadiumPanel.viewStadium_44.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_44.getBounds().height, (int)(img_43.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_43.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_43.setIcon(UI_Elements.scaleImageToBox(img_43, view.gamesPanel.gamesStadiumPanel.viewStadium_43));
		MouseAdapter ma43_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_43, img_43, img_43_R, img_43_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_43, ma43_Games, img_43_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_43.addMouseListener(ma43_Games);
		
		

		String path42 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(42) + "_42.png";
		img_42 = new ImageIcon(Overview.class.getResource(path42));
		String path42_R = "/Images/StadiumSlices/Stadium_Rollover_42.png";
		img_42_R = new ImageIcon(Overview.class.getResource(path42_R));
		String path42_S = "/Images/StadiumSlices/Stadium_Selected_42.png";
		img_42_S = new ImageIcon(Overview.class.getResource(path42_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_42.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_43.getBounds().x, view.overviewPanel.overviewStadiumPanel.viewStadium_43.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_43.getBounds().height, (int)(img_42.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_42.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_42.setIcon(UI_Elements.scaleImageToBox(img_42, view.overviewPanel.overviewStadiumPanel.viewStadium_42));
		MouseAdapter ma42_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_42, img_42, img_42_R, img_42_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_42, ma42_Overview, img_42_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_42.addMouseListener(ma42_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_42.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_43.getBounds().x, view.gamesPanel.gamesStadiumPanel.viewStadium_43.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_43.getBounds().height, (int)(img_42.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_42.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_42.setIcon(UI_Elements.scaleImageToBox(img_42, view.gamesPanel.gamesStadiumPanel.viewStadium_42));
		MouseAdapter ma42_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_42, img_42, img_42_R, img_42_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_42, ma42_Games, img_42_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_42.addMouseListener(ma42_Games);
		
		

		String path41 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(41) + "_41.png";
		img_41 = new ImageIcon(Overview.class.getResource(path41));
		String path41_R = "/Images/StadiumSlices/Stadium_Rollover_41.png";
		img_41_R = new ImageIcon(Overview.class.getResource(path41_R));
		String path41_S = "/Images/StadiumSlices/Stadium_Selected_41.png";
		img_41_S = new ImageIcon(Overview.class.getResource(path41_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_41.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_42.getBounds().x, view.overviewPanel.overviewStadiumPanel.viewStadium_42.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_42.getBounds().height, (int)(img_41.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_41.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_41.setIcon(UI_Elements.scaleImageToBox(img_41, view.overviewPanel.overviewStadiumPanel.viewStadium_41));
		MouseAdapter ma41_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_41, img_41, img_41_R, img_41_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_41, ma41_Overview, img_41_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_41.addMouseListener(ma41_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_41.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_42.getBounds().x, view.gamesPanel.gamesStadiumPanel.viewStadium_42.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_42.getBounds().height, (int)(img_41.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_41.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_41.setIcon(UI_Elements.scaleImageToBox(img_41, view.gamesPanel.gamesStadiumPanel.viewStadium_41));
		MouseAdapter ma41_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_41, img_41, img_41_R, img_41_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_41, ma41_Games, img_41_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_41.addMouseListener(ma41_Games);
		
		

		String path40 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(40) + "_40.png";
		img_40 = new ImageIcon(Overview.class.getResource(path40));
		String path40_R = "/Images/StadiumSlices/Stadium_Rollover_40.png";
		img_40_R = new ImageIcon(Overview.class.getResource(path40_R));
		String path40_S = "/Images/StadiumSlices/Stadium_Selected_40.png";
		img_40_S = new ImageIcon(Overview.class.getResource(path40_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_40.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_42.getBounds().x, view.overviewPanel.overviewStadiumPanel.viewStadium_41.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_41.getBounds().height, (int)(img_40.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_40.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_40.setIcon(UI_Elements.scaleImageToBox(img_40, view.overviewPanel.overviewStadiumPanel.viewStadium_40));
		MouseAdapter ma40_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_40, img_40, img_40_R, img_40_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_40, ma40_Overview, img_40_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_40.addMouseListener(ma40_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_40.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_42.getBounds().x, view.gamesPanel.gamesStadiumPanel.viewStadium_41.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_41.getBounds().height, (int)(img_40.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_40.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_40.setIcon(UI_Elements.scaleImageToBox(img_40, view.gamesPanel.gamesStadiumPanel.viewStadium_40));
		MouseAdapter ma40_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_40, img_40, img_40_R, img_40_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_40, ma40_Games, img_40_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_40.addMouseListener(ma40_Games);
		
		
		String path20 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(20) + "_20.png";
		img_20 = new ImageIcon(Overview.class.getResource(path20));
		String path20_R = "/Images/StadiumSlices/Stadium_Rollover_20.png";
		img_20_R = new ImageIcon(Overview.class.getResource(path20_R));
		String path20_S = "/Images/StadiumSlices/Stadium_Selected_20.png";
		img_20_S = new ImageIcon(Overview.class.getResource(path20_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_20.setBounds(view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().x, view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y, (int)(img_20.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_20.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_20.setIcon(UI_Elements.scaleImageToBox(img_20, view.overviewPanel.overviewStadiumPanel.viewStadium_20));
		MouseAdapter ma20_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_20, img_20, img_20_R, img_20_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_20, ma20_Overview, img_20_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_20.addMouseListener(ma20_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_20.setBounds(view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().x, view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y, (int)(img_20.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_20.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_20.setIcon(UI_Elements.scaleImageToBox(img_20, view.gamesPanel.gamesStadiumPanel.viewStadium_20));
		MouseAdapter ma20_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_20, img_20, img_20_R, img_20_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_20, ma20_Games, img_20_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_20.addMouseListener(ma20_Games);
		
		
		String path1 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(2) + "_1.png";
		img_1 = new ImageIcon(Overview.class.getResource(path1));
		String path1_R = "/Images/StadiumSlices/Stadium_Rollover_1.png";
		img_1_R = new ImageIcon(Overview.class.getResource(path1_R));
		String path1_S = "/Images/StadiumSlices/Stadium_Selected_1.png";
		img_1_S = new ImageIcon(Overview.class.getResource(path1_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_1.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_20.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_20.getBounds().width, view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y, (int)(img_1.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_1.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_1.setIcon(UI_Elements.scaleImageToBox(img_1, view.overviewPanel.overviewStadiumPanel.viewStadium_1));
		MouseAdapter ma1_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_1, img_1, img_1_R, img_1_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_1, ma1_Overview, img_1_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_1.addMouseListener(ma1_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_1.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_20.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_20.getBounds().width, view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y, (int)(img_1.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_1.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_1.setIcon(UI_Elements.scaleImageToBox(img_1, view.gamesPanel.gamesStadiumPanel.viewStadium_1));
		MouseAdapter ma1_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_1, img_1, img_1_R, img_1_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_1, ma1_Games, img_1_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_1.addMouseListener(ma1_Games);
		

		String path2 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(3) + "_2.png";
		img_2 = new ImageIcon(Overview.class.getResource(path2));
		String path2_R = "/Images/StadiumSlices/Stadium_Rollover_2.png";
		img_2_R = new ImageIcon(Overview.class.getResource(path2_R));
		String path2_S = "/Images/StadiumSlices/Stadium_Selected_2.png";
		img_2_S = new ImageIcon(Overview.class.getResource(path2_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_2.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_1.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_1.getBounds().width, view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y, (int)(img_2.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_2.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_2.setIcon(UI_Elements.scaleImageToBox(img_2, view.overviewPanel.overviewStadiumPanel.viewStadium_2));
		MouseAdapter ma2_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_2, img_2, img_2_R, img_2_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_2, ma2_Overview, img_2_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_2.addMouseListener(ma2_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_2.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_1.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_1.getBounds().width, view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y, (int)(img_2.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_2.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_2.setIcon(UI_Elements.scaleImageToBox(img_2, view.gamesPanel.gamesStadiumPanel.viewStadium_2));
		MouseAdapter ma2_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_2, img_2, img_2_R, img_2_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_2, ma2_Games, img_2_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_2.addMouseListener(ma2_Games);
		

		String path3 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(4) + "_3.png";
		img_3 = new ImageIcon(Overview.class.getResource(path3));
		String path3_R = "/Images/StadiumSlices/Stadium_Rollover_3.png";
		img_3_R = new ImageIcon(Overview.class.getResource(path3_R));
		String path3_S = "/Images/StadiumSlices/Stadium_Selected_3.png";
		img_3_S = new ImageIcon(Overview.class.getResource(path3_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_3.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_2.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_2.getBounds().width, view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y, (int)(img_3.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_3.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_3.setIcon(UI_Elements.scaleImageToBox(img_3, view.overviewPanel.overviewStadiumPanel.viewStadium_3));
		MouseAdapter ma3_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_3, img_3, img_3_R, img_3_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_3, ma3_Overview, img_3_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_3.addMouseListener(ma3_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_3.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_2.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_2.getBounds().width, view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y, (int)(img_3.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_3.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_3.setIcon(UI_Elements.scaleImageToBox(img_3, view.gamesPanel.gamesStadiumPanel.viewStadium_3));
		MouseAdapter ma3_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_3, img_3, img_3_R, img_3_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_3, ma3_Games, img_3_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_3.addMouseListener(ma3_Games);
		
		
		String path4 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(5) + "_4.png";
		img_4 = new ImageIcon(Overview.class.getResource(path4));
		String path4_R = "/Images/StadiumSlices/Stadium_Rollover_4.png";
		img_4_R = new ImageIcon(Overview.class.getResource(path4_R));
		String path4_S = "/Images/StadiumSlices/Stadium_Selected_4.png";
		img_4_S = new ImageIcon(Overview.class.getResource(path4_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_4.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_3.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_3.getBounds().width, view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y, (int)(img_4.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_4.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_4.setIcon(UI_Elements.scaleImageToBox(img_4, view.overviewPanel.overviewStadiumPanel.viewStadium_4));
		MouseAdapter ma4_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_4, img_4, img_4_R, img_4_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_4, ma4_Overview, img_4_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_4.addMouseListener(ma4_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_4.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_3.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_3.getBounds().width, view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y, (int)(img_4.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_4.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_4.setIcon(UI_Elements.scaleImageToBox(img_4, view.gamesPanel.gamesStadiumPanel.viewStadium_4));
		MouseAdapter ma4_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_4, img_4, img_4_R, img_4_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_4, ma4_Games, img_4_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_4.addMouseListener(ma4_Games);
		

		

		String path5 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(6) + "_5.png";
		img_5 = new ImageIcon(Overview.class.getResource(path5));
		String path5_R = "/Images/StadiumSlices/Stadium_Rollover_5.png";
		img_5_R = new ImageIcon(Overview.class.getResource(path5_R));
		String path5_S = "/Images/StadiumSlices/Stadium_Selected_5.png";
		img_5_S = new ImageIcon(Overview.class.getResource(path5_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_5.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_4.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_4.getBounds().width, view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y, (int)(img_5.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_5.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_5.setIcon(UI_Elements.scaleImageToBox(img_5, view.overviewPanel.overviewStadiumPanel.viewStadium_5));
		MouseAdapter ma5_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_5, img_5, img_5_R, img_5_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_5, ma5_Overview, img_5_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_5.addMouseListener(ma5_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_5.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_4.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_4.getBounds().width, view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y, (int)(img_5.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_5.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_5.setIcon(UI_Elements.scaleImageToBox(img_5, view.gamesPanel.gamesStadiumPanel.viewStadium_5));
		MouseAdapter ma5_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_5, img_5, img_5_R, img_5_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_5, ma5_Games, img_5_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_5.addMouseListener(ma5_Games);
		
		
		

		String path6 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(7) + "_6.png";
		img_6 = new ImageIcon(Overview.class.getResource(path6));
		String path6_R = "/Images/StadiumSlices/Stadium_Rollover_6.png";
		img_6_R = new ImageIcon(Overview.class.getResource(path6_R));
		String path6_S = "/Images/StadiumSlices/Stadium_Selected_6.png";
		img_6_S = new ImageIcon(Overview.class.getResource(path6_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_6.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_5.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_5.getBounds().width, view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y, (int)(img_6.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_6.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_6.setIcon(UI_Elements.scaleImageToBox(img_6, view.overviewPanel.overviewStadiumPanel.viewStadium_6));
		MouseAdapter ma6_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_6, img_6, img_6_R, img_6_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_6, ma6_Overview, img_6_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_6.addMouseListener(ma6_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_6.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_5.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_5.getBounds().width, view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y, (int)(img_6.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_6.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_6.setIcon(UI_Elements.scaleImageToBox(img_6, view.gamesPanel.gamesStadiumPanel.viewStadium_6));
		MouseAdapter ma6_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_6, img_6, img_6_R, img_6_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_6, ma6_Games, img_6_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_6.addMouseListener(ma6_Games);
		
		

		String path7 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(7) + "_7.png";
		img_7 = new ImageIcon(Overview.class.getResource(path7));
		String path7_R = "/Images/StadiumSlices/Stadium_Rollover_7.png";
		img_7_R = new ImageIcon(Overview.class.getResource(path7_R));
		String path7_S = "/Images/StadiumSlices/Stadium_Selected_7.png";
		img_7_S = new ImageIcon(Overview.class.getResource(path7_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_7.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_6.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_6.getBounds().width, view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y, (int)(img_7.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_7.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_7.setIcon(UI_Elements.scaleImageToBox(img_7, view.overviewPanel.overviewStadiumPanel.viewStadium_7));
		MouseAdapter ma7_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_7, img_7, img_7_R, img_7_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_7, ma7_Overview, img_7_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_7.addMouseListener(ma7_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_7.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_6.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_6.getBounds().width, view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y, (int)(img_7.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_7.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_7.setIcon(UI_Elements.scaleImageToBox(img_7, view.gamesPanel.gamesStadiumPanel.viewStadium_7));
		MouseAdapter ma7_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_7, img_7, img_7_R, img_7_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_7, ma7_Games, img_7_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_7.addMouseListener(ma7_Games);
		
		
		String path21 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(21) + "_21.png";
		img_21 = new ImageIcon(Overview.class.getResource(path21));
		String path21_R = "/Images/StadiumSlices/Stadium_Rollover_21.png";
		img_21_R = new ImageIcon(Overview.class.getResource(path21_R));
		String path21_S = "/Images/StadiumSlices/Stadium_Selected_21.png";
		img_21_S = new ImageIcon(Overview.class.getResource(path21_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_21.setBounds(view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().x + (int)(1013*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), view.overviewPanel.overviewStadiumPanel.viewStadium_1.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_6.getBounds().height, (int)(img_21.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_21.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_21.setIcon(UI_Elements.scaleImageToBox(img_21, view.overviewPanel.overviewStadiumPanel.viewStadium_21));
		MouseAdapter ma21_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_21, img_21, img_21_R, img_21_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_21, ma21_Overview, img_21_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_21.addMouseListener(ma21_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_21.setBounds(view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().x + (int)(1013*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), view.gamesPanel.gamesStadiumPanel.viewStadium_1.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_6.getBounds().height, (int)(img_21.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_21.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_21.setIcon(UI_Elements.scaleImageToBox(img_21, view.gamesPanel.gamesStadiumPanel.viewStadium_21));
		MouseAdapter ma21_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_21, img_21, img_21_R, img_21_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_21, ma21_Games, img_21_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_21.addMouseListener(ma21_Games);
		

		String path22 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(22) + "_22.png";
		img_22 = new ImageIcon(Overview.class.getResource(path22));
		String path22_R = "/Images/StadiumSlices/Stadium_Rollover_22.png";
		img_22_R = new ImageIcon(Overview.class.getResource(path22_R));
		String path22_S = "/Images/StadiumSlices/Stadium_Selected_22.png";
		img_22_S = new ImageIcon(Overview.class.getResource(path22_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_22.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_21.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_21.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_1.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_6.getBounds().height, (int)(img_22.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_22.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_22.setIcon(UI_Elements.scaleImageToBox(img_22, view.overviewPanel.overviewStadiumPanel.viewStadium_22));
		MouseAdapter ma22_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_22, img_22, img_22_R, img_22_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_22, ma22_Overview, img_22_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_22.addMouseListener(ma22_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_22.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_21.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_21.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_1.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_6.getBounds().height, (int)(img_22.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_22.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_22.setIcon(UI_Elements.scaleImageToBox(img_22, view.gamesPanel.gamesStadiumPanel.viewStadium_22));
		MouseAdapter ma22_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_22, img_22, img_22_R, img_22_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_22, ma22_Games, img_22_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_22.addMouseListener(ma22_Games);
		

		String path23 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(23) + "_23.png";
		img_23 = new ImageIcon(Overview.class.getResource(path23));
		String path23_R = "/Images/StadiumSlices/Stadium_Rollover_23.png";
		img_23_R = new ImageIcon(Overview.class.getResource(path23_R));
		String path23_S = "/Images/StadiumSlices/Stadium_Selected_23.png";
		img_23_S = new ImageIcon(Overview.class.getResource(path23_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_23.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_22.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_22.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_1.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_6.getBounds().height, (int)(img_23.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_23.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_23.setIcon(UI_Elements.scaleImageToBox(img_23, view.overviewPanel.overviewStadiumPanel.viewStadium_23));
		MouseAdapter ma23_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_23, img_23, img_23_R, img_23_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_23, ma23_Overview, img_23_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_23.addMouseListener(ma23_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_23.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_22.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_22.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_1.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_6.getBounds().height, (int)(img_23.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_23.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_23.setIcon(UI_Elements.scaleImageToBox(img_23, view.gamesPanel.gamesStadiumPanel.viewStadium_23));
		MouseAdapter ma23_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_23, img_23, img_23_R, img_23_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_23, ma23_Games, img_23_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_23.addMouseListener(ma23_Games);
		

		String path24 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(24) + "_24.png";
		img_24 = new ImageIcon(Overview.class.getResource(path24));
		String path24_R = "/Images/StadiumSlices/Stadium_Rollover_24.png";
		img_24_R = new ImageIcon(Overview.class.getResource(path24_R));
		String path24_S = "/Images/StadiumSlices/Stadium_Selected_24.png";
		img_24_S = new ImageIcon(Overview.class.getResource(path24_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_24.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_23.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_23.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_1.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_6.getBounds().height, (int)(img_24.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_24.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_24.setIcon(UI_Elements.scaleImageToBox(img_24, view.overviewPanel.overviewStadiumPanel.viewStadium_24));
		MouseAdapter ma24_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_24, img_24, img_24_R, img_24_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_24, ma24_Overview, img_24_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_24.addMouseListener(ma24_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_24.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_23.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_23.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_1.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_6.getBounds().height, (int)(img_24.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_24.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_24.setIcon(UI_Elements.scaleImageToBox(img_24, view.gamesPanel.gamesStadiumPanel.viewStadium_24));
		MouseAdapter ma24_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_24, img_24, img_24_R, img_24_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_24, ma24_Games, img_24_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_24.addMouseListener(ma24_Games);
		
		String path25 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(25) + "_25.png";
		img_25 = new ImageIcon(Overview.class.getResource(path25));
		String path25_R = "/Images/StadiumSlices/Stadium_Rollover_25.png";
		img_25_R = new ImageIcon(Overview.class.getResource(path25_R));
		String path25_S = "/Images/StadiumSlices/Stadium_Selected_25.png";
		img_25_S = new ImageIcon(Overview.class.getResource(path25_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_25.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_24.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_24.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_1.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_6.getBounds().height, (int)(img_25.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_25.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_25.setIcon(UI_Elements.scaleImageToBox(img_25, view.overviewPanel.overviewStadiumPanel.viewStadium_25));
		MouseAdapter ma25_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_25, img_25, img_25_R, img_25_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_25, ma25_Overview, img_25_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_25.addMouseListener(ma25_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_25.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_24.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_24.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_1.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_6.getBounds().height, (int)(img_25.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_25.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_25.setIcon(UI_Elements.scaleImageToBox(img_25, view.gamesPanel.gamesStadiumPanel.viewStadium_25));
		MouseAdapter ma25_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_25, img_25, img_25_R, img_25_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_25, ma25_Games, img_25_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_25.addMouseListener(ma25_Games);
		
		
		String path26 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(26) + "_26.png";
		img_26 = new ImageIcon(Overview.class.getResource(path26));
		String path26_R = "/Images/StadiumSlices/Stadium_Rollover_26.png";
		img_26_R = new ImageIcon(Overview.class.getResource(path26_R));
		String path26_S = "/Images/StadiumSlices/Stadium_Selected_26.png";
		img_26_S = new ImageIcon(Overview.class.getResource(path26_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_26.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_25.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_25.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_1.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_6.getBounds().height, (int)(img_26.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_26.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_26.setIcon(UI_Elements.scaleImageToBox(img_26, view.overviewPanel.overviewStadiumPanel.viewStadium_26));
		MouseAdapter ma26_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_26, img_26, img_26_R, img_26_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_26, ma26_Overview, img_26_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_26.addMouseListener(ma26_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_26.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_25.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_25.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_1.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_6.getBounds().height, (int)(img_26.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_26.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_26.setIcon(UI_Elements.scaleImageToBox(img_26, view.gamesPanel.gamesStadiumPanel.viewStadium_26));
		MouseAdapter ma26_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_26, img_26, img_26_R, img_26_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_26, ma26_Games, img_26_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_26.addMouseListener(ma26_Games);
		
		String path27 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(27) + "_27.png";
		img_27 = new ImageIcon(Overview.class.getResource(path27));
		String path27_R = "/Images/StadiumSlices/Stadium_Rollover_27.png";
		img_27_R = new ImageIcon(Overview.class.getResource(path27_R));
		String path27_S = "/Images/StadiumSlices/Stadium_Selected_27.png";
		img_27_S = new ImageIcon(Overview.class.getResource(path27_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_27.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_26.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_26.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_1.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_6.getBounds().height, (int)(img_27.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_27.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_27.setIcon(UI_Elements.scaleImageToBox(img_27, view.overviewPanel.overviewStadiumPanel.viewStadium_27));
		MouseAdapter ma27_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_27, img_27, img_27_R, img_27_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_27, ma27_Overview, img_27_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_27.addMouseListener(ma27_Overview);
						
		view.gamesPanel.gamesStadiumPanel.viewStadium_27.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_26.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_26.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_1.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_6.getBounds().height, (int)(img_27.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_27.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_27.setIcon(UI_Elements.scaleImageToBox(img_27, view.gamesPanel.gamesStadiumPanel.viewStadium_27));
		MouseAdapter ma27_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_27, img_27, img_27_R, img_27_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_27, ma27_Games, img_27_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_27.addMouseListener(ma27_Games);
		

		String path28 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(28) + "_28.png";
		img_28 = new ImageIcon(Overview.class.getResource(path28));
		String path28_R = "/Images/StadiumSlices/Stadium_Rollover_28.png";
		img_28_R = new ImageIcon(Overview.class.getResource(path28_R));
		String path28_S = "/Images/StadiumSlices/Stadium_Selected_28.png";
		img_28_S = new ImageIcon(Overview.class.getResource(path28_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_28.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_7.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_7.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_44.getBounds().y, (int)(img_28.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_28.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_28.setIcon(UI_Elements.scaleImageToBox(img_28, view.overviewPanel.overviewStadiumPanel.viewStadium_28));
		MouseAdapter ma28_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_28, img_28, img_28_R, img_28_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_28, ma28_Overview, img_28_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_28.addMouseListener(ma28_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_28.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_7.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_7.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_44.getBounds().y, (int)(img_28.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_28.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_28.setIcon(UI_Elements.scaleImageToBox(img_28, view.gamesPanel.gamesStadiumPanel.viewStadium_28));
		MouseAdapter ma28_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_28, img_28, img_28_R, img_28_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_28, ma28_Games, img_28_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_28.addMouseListener(ma28_Games);
		

		String path29 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(29) + "_29.png";
		img_29 = new ImageIcon(Overview.class.getResource(path29));
		String path29_R = "/Images/StadiumSlices/Stadium_Rollover_29.png";
		img_29_R = new ImageIcon(Overview.class.getResource(path29_R));
		String path29_S = "/Images/StadiumSlices/Stadium_Selected_29.png";
		img_29_S = new ImageIcon(Overview.class.getResource(path29_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_29.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_28.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_28.getBounds().width - (int)(img_29.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), view.overviewPanel.overviewStadiumPanel.viewStadium_28.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_28.getBounds().height, (int)(img_29.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_29.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_29.setIcon(UI_Elements.scaleImageToBox(img_29, view.overviewPanel.overviewStadiumPanel.viewStadium_29));
		MouseAdapter ma29_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_29, img_29, img_29_R, img_29_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_29, ma29_Overview, img_29_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_29.addMouseListener(ma29_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_29.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_28.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_28.getBounds().width - (int)(img_29.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), view.gamesPanel.gamesStadiumPanel.viewStadium_28.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_28.getBounds().height, (int)(img_29.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_29.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_29.setIcon(UI_Elements.scaleImageToBox(img_29, view.gamesPanel.gamesStadiumPanel.viewStadium_29));
		MouseAdapter ma29_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_29, img_29, img_29_R, img_29_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_29, ma29_Games, img_29_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_29.addMouseListener(ma29_Games);
		

		String path30 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(30) + "_30.png";
		img_30 = new ImageIcon(Overview.class.getResource(path30));
		String path30_R = "/Images/StadiumSlices/Stadium_Rollover_30.png";
		img_30_R = new ImageIcon(Overview.class.getResource(path30_R));
		String path30_S = "/Images/StadiumSlices/Stadium_Selected_30.png";
		img_30_S = new ImageIcon(Overview.class.getResource(path30_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_30.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_29.getBounds().x, view.overviewPanel.overviewStadiumPanel.viewStadium_29.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_29.getBounds().height, (int)(img_30.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_30.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_30.setIcon(UI_Elements.scaleImageToBox(img_30, view.overviewPanel.overviewStadiumPanel.viewStadium_30));
		MouseAdapter ma30_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_30, img_30, img_30_R, img_30_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_30, ma30_Overview, img_30_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_30.addMouseListener(ma30_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_30.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_29.getBounds().x, view.gamesPanel.gamesStadiumPanel.viewStadium_29.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_29.getBounds().height, (int)(img_30.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_30.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_30.setIcon(UI_Elements.scaleImageToBox(img_30, view.gamesPanel.gamesStadiumPanel.viewStadium_30));
		MouseAdapter ma30_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_30, img_30, img_30_R, img_30_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_30, ma30_Games, img_30_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_30.addMouseListener(ma30_Games);
		
		
		String path31 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(31) + "_31.png";
		img_31 = new ImageIcon(Overview.class.getResource(path31));
		String path31_R = "/Images/StadiumSlices/Stadium_Rollover_31.png";
		img_31_R = new ImageIcon(Overview.class.getResource(path31_R));
		String path31_S = "/Images/StadiumSlices/Stadium_Selected_31.png";
		img_31_S = new ImageIcon(Overview.class.getResource(path31_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_31.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_30.getBounds().x, view.overviewPanel.overviewStadiumPanel.viewStadium_30.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_30.getBounds().height, (int)(img_31.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_31.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_31.setIcon(UI_Elements.scaleImageToBox(img_31, view.overviewPanel.overviewStadiumPanel.viewStadium_31));
		MouseAdapter ma31_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_31, img_31, img_31_R, img_31_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_31, ma31_Overview, img_31_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_31.addMouseListener(ma31_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_31.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_30.getBounds().x, view.gamesPanel.gamesStadiumPanel.viewStadium_30.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_30.getBounds().height, (int)(img_31.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_31.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_31.setIcon(UI_Elements.scaleImageToBox(img_31, view.gamesPanel.gamesStadiumPanel.viewStadium_31));
		MouseAdapter ma31_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_31, img_31, img_31_R, img_31_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_31, ma31_Games, img_31_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_31.addMouseListener(ma31_Games);		

		String path8 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(8) + "_8.png";
		img_8 = new ImageIcon(Overview.class.getResource(path8));
		String path8_R = "/Images/StadiumSlices/Stadium_Rollover_8.png";
		img_8_R = new ImageIcon(Overview.class.getResource(path8_R));
		String path8_S = "/Images/StadiumSlices/Stadium_Selected_8.png";
		img_8_S = new ImageIcon(Overview.class.getResource(path8_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_8.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_28.getBounds().x, view.overviewPanel.overviewStadiumPanel.panelViewStadium.getBounds().y, (int)(img_8.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_8.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_8.setIcon(UI_Elements.scaleImageToBox(img_8, view.overviewPanel.overviewStadiumPanel.viewStadium_8));
		MouseAdapter ma8_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_8, img_8, img_8_R, img_8_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_8, ma8_Overview, img_8_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_8.addMouseListener(ma8_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_8.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_28.getBounds().x, view.gamesPanel.gamesStadiumPanel.panelViewStadium.getBounds().y, (int)(img_8.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_8.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_8.setIcon(UI_Elements.scaleImageToBox(img_8, view.gamesPanel.gamesStadiumPanel.viewStadium_8));
		MouseAdapter ma8_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_8, img_8, img_8_R, img_8_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_8, ma8_Games, img_8_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_8.addMouseListener(ma8_Games);
		
		
		String path9 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(9) + "_9.png";
		img_9 = new ImageIcon(Overview.class.getResource(path9));
		String path9_R = "/Images/StadiumSlices/Stadium_Rollover_9.png";
		img_9_R = new ImageIcon(Overview.class.getResource(path9_R));
		String path9_S = "/Images/StadiumSlices/Stadium_Selected_9.png";
		img_9_S = new ImageIcon(Overview.class.getResource(path9_S));

		view.overviewPanel.overviewStadiumPanel.viewStadium_9.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_31.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_31.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_8.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_8.getBounds().height, (int)(img_9.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_9.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_9.setIcon(UI_Elements.scaleImageToBox(img_9, view.overviewPanel.overviewStadiumPanel.viewStadium_9));
		MouseAdapter ma9_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_9, img_9, img_9_R, img_9_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_9, ma9_Overview, img_9_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_9.addMouseListener(ma9_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_9.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_31.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_31.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_8.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_8.getBounds().height, (int)(img_9.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_9.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_9.setIcon(UI_Elements.scaleImageToBox(img_9, view.gamesPanel.gamesStadiumPanel.viewStadium_9));
		MouseAdapter ma9_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_9, img_9, img_9_R, img_9_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_9, ma9_Games, img_9_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_9.addMouseListener(ma9_Games);
		
	
		String path19 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(19) + "_19.png";
		img_19 = new ImageIcon(Overview.class.getResource(path19));
		String path19_R = "/Images/StadiumSlices/Stadium_Rollover_19.png";
		img_19_R = new ImageIcon(Overview.class.getResource(path19_R));
		String path19_S = "/Images/StadiumSlices/Stadium_Selected_19.png";
		img_19_S = new ImageIcon(Overview.class.getResource(path19_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_19.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_20.getBounds().x, view.overviewPanel.overviewStadiumPanel.viewStadium_20.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_20.getBounds().height, (int)(img_19.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_19.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_19.setIcon(UI_Elements.scaleImageToBox(img_19, view.overviewPanel.overviewStadiumPanel.viewStadium_19));
		MouseAdapter ma19_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_19, img_19, img_19_R, img_19_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_19, ma19_Overview, img_19_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_19.addMouseListener(ma19_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_19.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_20.getBounds().x, view.gamesPanel.gamesStadiumPanel.viewStadium_20.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_20.getBounds().height, (int)(img_19.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_19.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_19.setIcon(UI_Elements.scaleImageToBox(img_19, view.gamesPanel.gamesStadiumPanel.viewStadium_19));
		MouseAdapter ma19_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_19, img_19, img_19_R, img_19_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_19, ma19_Games, img_19_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_19.addMouseListener(ma19_Games);
		
		
		String path18 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(18) + "_18.png";
		img_18 = new ImageIcon(Overview.class.getResource(path18));
		String path18_R = "/Images/StadiumSlices/Stadium_Rollover_18.png";
		img_18_R = new ImageIcon(Overview.class.getResource(path18_R));
		String path18_S = "/Images/StadiumSlices/Stadium_Selected_18.png";
		img_18_S = new ImageIcon(Overview.class.getResource(path18_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_18.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_19.getBounds().x, view.overviewPanel.overviewStadiumPanel.viewStadium_19.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_19.getBounds().height, (int)(img_18.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_18.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_18.setIcon(UI_Elements.scaleImageToBox(img_18, view.overviewPanel.overviewStadiumPanel.viewStadium_18));
		MouseAdapter ma18_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_18, img_18, img_18_R, img_18_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_18, ma18_Overview, img_18_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_18.addMouseListener(ma18_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_18.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_19.getBounds().x, view.gamesPanel.gamesStadiumPanel.viewStadium_19.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_19.getBounds().height, (int)(img_18.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_18.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_18.setIcon(UI_Elements.scaleImageToBox(img_18, view.gamesPanel.gamesStadiumPanel.viewStadium_18));
		MouseAdapter ma18_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_18, img_18, img_18_R, img_18_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_18, ma18_Games, img_18_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_18.addMouseListener(ma18_Games);
		
		
		String path17 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(17) + "_17.png";
		img_17 = new ImageIcon(Overview.class.getResource(path17));
		String path17_R = "/Images/StadiumSlices/Stadium_Rollover_17.png";
		img_17_R = new ImageIcon(Overview.class.getResource(path17_R));
		String path17_S = "/Images/StadiumSlices/Stadium_Selected_17.png";
		img_17_S = new ImageIcon(Overview.class.getResource(path17_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_17.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_18.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_18.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_18.getBounds().y + view.overviewPanel.overviewStadiumPanel.viewStadium_18.getBounds().height - (int)(img_17.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_17.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_17.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_17.setIcon(UI_Elements.scaleImageToBox(img_17, view.overviewPanel.overviewStadiumPanel.viewStadium_17));
		MouseAdapter ma17_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_17, img_17, img_17_R, img_17_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_17, ma17_Overview, img_17_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_17.addMouseListener(ma17_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_17.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_18.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_18.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_18.getBounds().y + view.gamesPanel.gamesStadiumPanel.viewStadium_18.getBounds().height - (int)(img_17.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_17.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_17.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_17.setIcon(UI_Elements.scaleImageToBox(img_17, view.gamesPanel.gamesStadiumPanel.viewStadium_17));
		MouseAdapter ma17_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_17, img_17, img_17_R, img_17_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_17, ma17_Games, img_17_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_17.addMouseListener(ma17_Games);
		
		
		String path16 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(16) + "_16.png";
		img_16 = new ImageIcon(Overview.class.getResource(path16));
		String path16_R = "/Images/StadiumSlices/Stadium_Rollover_16.png";
		img_16_R = new ImageIcon(Overview.class.getResource(path16_R));
		String path16_S = "/Images/StadiumSlices/Stadium_Selected_16.png";
		img_16_S = new ImageIcon(Overview.class.getResource(path16_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_16.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_17.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_17.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_17.getBounds().y, (int)(img_16.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_16.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_16.setIcon(UI_Elements.scaleImageToBox(img_16, view.overviewPanel.overviewStadiumPanel.viewStadium_16));
		MouseAdapter ma16_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_16, img_16, img_16_R, img_16_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_16, ma16_Overview, img_16_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_16.addMouseListener(ma16_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_16.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_17.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_17.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_17.getBounds().y, (int)(img_16.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_16.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_16.setIcon(UI_Elements.scaleImageToBox(img_16, view.gamesPanel.gamesStadiumPanel.viewStadium_16));
		MouseAdapter ma16_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_16, img_16, img_16_R, img_16_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_16, ma16_Games, img_16_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_16.addMouseListener(ma16_Games);
				
		
		String path15 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(15) + "_15.png";
		img_15 = new ImageIcon(Overview.class.getResource(path15));
		String path15_R = "/Images/StadiumSlices/Stadium_Rollover_15.png";
		img_15_R = new ImageIcon(Overview.class.getResource(path15_R));
		String path15_S = "/Images/StadiumSlices/Stadium_Selected_15.png";
		img_15_S = new ImageIcon(Overview.class.getResource(path15_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_15.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_16.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_16.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_16.getBounds().y, (int)(img_15.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_15.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_15.setIcon(UI_Elements.scaleImageToBox(img_15, view.overviewPanel.overviewStadiumPanel.viewStadium_15));
		MouseAdapter ma15_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_15, img_15, img_15_R, img_15_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_15, ma15_Overview, img_15_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_15.addMouseListener(ma15_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_15.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_16.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_16.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_16.getBounds().y, (int)(img_15.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_15.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_15.setIcon(UI_Elements.scaleImageToBox(img_15, view.gamesPanel.gamesStadiumPanel.viewStadium_15));
		MouseAdapter ma15_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_15, img_15, img_15_R, img_15_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_15, ma15_Games, img_15_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_15.addMouseListener(ma15_Games);
		
		
		String path14 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(14) + "_14.png";
		img_14 = new ImageIcon(Overview.class.getResource(path14));
		String path14_R = "/Images/StadiumSlices/Stadium_Rollover_14.png";
		img_14_R = new ImageIcon(Overview.class.getResource(path14_R));
		String path14_S = "/Images/StadiumSlices/Stadium_Selected_14.png";
		img_14_S = new ImageIcon(Overview.class.getResource(path14_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_14.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_15.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_15.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_15.getBounds().y, (int)(img_14.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_14.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_14.setIcon(UI_Elements.scaleImageToBox(img_14, view.overviewPanel.overviewStadiumPanel.viewStadium_14));
		MouseAdapter ma14_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_14, img_14, img_14_R, img_14_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_14, ma14_Overview, img_14_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_14.addMouseListener(ma14_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_14.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_15.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_15.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_15.getBounds().y, (int)(img_14.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_14.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_14.setIcon(UI_Elements.scaleImageToBox(img_14, view.gamesPanel.gamesStadiumPanel.viewStadium_14));
		MouseAdapter ma14_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_14, img_14, img_14_R, img_14_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_14, ma14_Games, img_14_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_14.addMouseListener(ma14_Games);
		
		
		
		String path13 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(13) + "_13.png";
		img_13 = new ImageIcon(Overview.class.getResource(path13));
		String path13_R = "/Images/StadiumSlices/Stadium_Rollover_13.png";
		img_13_R = new ImageIcon(Overview.class.getResource(path13_R));
		String path13_S = "/Images/StadiumSlices/Stadium_Selected_13.png";
		img_13_S = new ImageIcon(Overview.class.getResource(path13_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_13.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_14.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_14.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_14.getBounds().y, (int)(img_13.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_13.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_13.setIcon(UI_Elements.scaleImageToBox(img_13, view.overviewPanel.overviewStadiumPanel.viewStadium_13));
		MouseAdapter ma13_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_13, img_13, img_13_R, img_13_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_13, ma13_Overview, img_13_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_13.addMouseListener(ma13_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_13.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_14.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_14.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_14.getBounds().y, (int)(img_13.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_13.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_13.setIcon(UI_Elements.scaleImageToBox(img_13, view.gamesPanel.gamesStadiumPanel.viewStadium_13));
		MouseAdapter ma13_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_13, img_13, img_13_R, img_13_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_13, ma13_Games, img_13_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_13.addMouseListener(ma13_Games);
		
		
		String path12 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(12) + "_12.png";
		img_12 = new ImageIcon(Overview.class.getResource(path12));
		String path12_R = "/Images/StadiumSlices/Stadium_Rollover_12.png";
		img_12_R = new ImageIcon(Overview.class.getResource(path12_R));
		String path12_S = "/Images/StadiumSlices/Stadium_Selected_12.png";
		img_12_S = new ImageIcon(Overview.class.getResource(path12_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_12.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_13.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_13.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_13.getBounds().y, (int)(img_12.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_12.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_12.setIcon(UI_Elements.scaleImageToBox(img_12, view.overviewPanel.overviewStadiumPanel.viewStadium_12));
		MouseAdapter ma12_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_12, img_12, img_12_R, img_12_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_12, ma12_Overview, img_12_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_12.addMouseListener(ma12_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_12.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_13.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_13.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_13.getBounds().y, (int)(img_12.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_12.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_12.setIcon(UI_Elements.scaleImageToBox(img_12, view.gamesPanel.gamesStadiumPanel.viewStadium_12));
		MouseAdapter ma12_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_12, img_12, img_12_R, img_12_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_12, ma12_Games, img_12_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_12.addMouseListener(ma12_Games);
		
		
		String path11 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(11) + "_11.png";
		img_11 = new ImageIcon(Overview.class.getResource(path11));
		String path11_R = "/Images/StadiumSlices/Stadium_Rollover_11.png";
		img_11_R = new ImageIcon(Overview.class.getResource(path11_R));
		String path11_S = "/Images/StadiumSlices/Stadium_Selected_11.png";
		img_11_S = new ImageIcon(Overview.class.getResource(path11_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_11.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_12.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_12.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_12.getBounds().y, (int)(img_11.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_11.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_11.setIcon(UI_Elements.scaleImageToBox(img_11, view.overviewPanel.overviewStadiumPanel.viewStadium_11));
		MouseAdapter ma11_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_11, img_11, img_11_R, img_11_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_11, ma11_Overview, img_11_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_11.addMouseListener(ma11_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_11.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_12.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_12.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_12.getBounds().y, (int)(img_11.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_11.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_11.setIcon(UI_Elements.scaleImageToBox(img_11, view.gamesPanel.gamesStadiumPanel.viewStadium_11));
		MouseAdapter ma11_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_11, img_11, img_11_R, img_11_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_11, ma11_Games, img_11_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_11.addMouseListener(ma11_Games);
		
		
		String path39 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(39) + "_39.png";
		img_39 = new ImageIcon(Overview.class.getResource(path39));
		String path39_R = "/Images/StadiumSlices/Stadium_Rollover_39.png";
		img_39_R = new ImageIcon(Overview.class.getResource(path39_R));
		String path39_S = "/Images/StadiumSlices/Stadium_Selected_39.png";
		img_39_S = new ImageIcon(Overview.class.getResource(path39_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_39.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_17.getBounds().x, view.overviewPanel.overviewStadiumPanel.viewStadium_17.getBounds().y - (int)(img_39.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio) - 2, (int)(img_39.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_39.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_39.setIcon(UI_Elements.scaleImageToBox(img_39, view.overviewPanel.overviewStadiumPanel.viewStadium_39));
		MouseAdapter ma39_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_39, img_39, img_39_R, img_39_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_39, ma39_Overview, img_39_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_39.addMouseListener(ma39_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_39.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_17.getBounds().x, view.gamesPanel.gamesStadiumPanel.viewStadium_17.getBounds().y - (int)(img_39.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio) - 2, (int)(img_39.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_39.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_39.setIcon(UI_Elements.scaleImageToBox(img_39, view.gamesPanel.gamesStadiumPanel.viewStadium_39));
		MouseAdapter ma39_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_39, img_39, img_39_R, img_39_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_39, ma39_Games, img_39_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_39.addMouseListener(ma39_Games);
		


		String path38 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(38) + "_38.png";
		img_38 = new ImageIcon(Overview.class.getResource(path38));
		String path38_R = "/Images/StadiumSlices/Stadium_Rollover_38.png";
		img_38_R = new ImageIcon(Overview.class.getResource(path38_R));
		String path38_S = "/Images/StadiumSlices/Stadium_Selected_38.png";
		img_38_S = new ImageIcon(Overview.class.getResource(path38_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_38.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_39.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_39.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_39.getBounds().y, (int)(img_38.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_38.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_38.setIcon(UI_Elements.scaleImageToBox(img_38, view.overviewPanel.overviewStadiumPanel.viewStadium_38));
		MouseAdapter ma38_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_38, img_38, img_38_R, img_38_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_38, ma38_Overview, img_38_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_38.addMouseListener(ma38_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_38.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_39.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_39.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_39.getBounds().y, (int)(img_38.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_38.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_38.setIcon(UI_Elements.scaleImageToBox(img_38, view.gamesPanel.gamesStadiumPanel.viewStadium_38));
		MouseAdapter ma38_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_38, img_38, img_38_R, img_38_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_38, ma38_Games, img_38_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_38.addMouseListener(ma38_Games);
		

		String path37 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(37) + "_37.png";
		img_37 = new ImageIcon(Overview.class.getResource(path37));
		String path37_R = "/Images/StadiumSlices/Stadium_Rollover_37.png";
		img_37_R = new ImageIcon(Overview.class.getResource(path37_R));
		String path37_S = "/Images/StadiumSlices/Stadium_Selected_37.png";
		img_37_S = new ImageIcon(Overview.class.getResource(path37_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_37.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_38.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_38.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_38.getBounds().y, (int)(img_37.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_37.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_37.setIcon(UI_Elements.scaleImageToBox(img_37, view.overviewPanel.overviewStadiumPanel.viewStadium_37));
		MouseAdapter ma37_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_37, img_37, img_37_R, img_37_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_37, ma37_Overview, img_37_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_37.addMouseListener(ma37_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_37.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_38.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_38.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_38.getBounds().y, (int)(img_37.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_37.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_37.setIcon(UI_Elements.scaleImageToBox(img_37, view.gamesPanel.gamesStadiumPanel.viewStadium_37));
		MouseAdapter ma37_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_37, img_37, img_37_R, img_37_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_37, ma37_Games, img_37_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_37.addMouseListener(ma37_Games);
		
		
		String path36 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(36) + "_36.png";
		img_36 = new ImageIcon(Overview.class.getResource(path36));
		String path36_R = "/Images/StadiumSlices/Stadium_Rollover_36.png";
		img_36_R = new ImageIcon(Overview.class.getResource(path36_R));
		String path36_S = "/Images/StadiumSlices/Stadium_Selected_36.png";
		img_36_S = new ImageIcon(Overview.class.getResource(path36_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_36.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_37.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_37.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_37.getBounds().y, (int)(img_36.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_36.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_36.setIcon(UI_Elements.scaleImageToBox(img_36, view.overviewPanel.overviewStadiumPanel.viewStadium_36));
		MouseAdapter ma36_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_36, img_36, img_36_R, img_36_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_36, ma36_Overview, img_36_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_36.addMouseListener(ma36_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_36.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_37.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_37.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_37.getBounds().y, (int)(img_36.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_36.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_36.setIcon(UI_Elements.scaleImageToBox(img_36, view.gamesPanel.gamesStadiumPanel.viewStadium_36));
		MouseAdapter ma36_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_36, img_36, img_36_R, img_36_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_36, ma36_Games, img_36_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_36.addMouseListener(ma36_Games);
		
		

		String path35 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(35) + "_35.png";
		img_35 = new ImageIcon(Overview.class.getResource(path35));
		String path35_R = "/Images/StadiumSlices/Stadium_Rollover_35.png";
		img_35_R = new ImageIcon(Overview.class.getResource(path35_R));
		String path35_S = "/Images/StadiumSlices/Stadium_Selected_35.png";
		img_35_S = new ImageIcon(Overview.class.getResource(path35_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_35.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_36.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_36.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_36.getBounds().y, (int)(img_35.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_35.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_35.setIcon(UI_Elements.scaleImageToBox(img_35, view.overviewPanel.overviewStadiumPanel.viewStadium_35));
		MouseAdapter ma35_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_35, img_35, img_35_R, img_35_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_35, ma35_Overview, img_35_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_35.addMouseListener(ma35_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_35.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_36.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_36.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_36.getBounds().y, (int)(img_35.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_35.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_35.setIcon(UI_Elements.scaleImageToBox(img_35, view.gamesPanel.gamesStadiumPanel.viewStadium_35));
		MouseAdapter ma35_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_35, img_35, img_35_R, img_35_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_35, ma35_Games, img_35_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_35.addMouseListener(ma35_Games);
		
		

		String path34 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(34) + "_34.png";
		img_34 = new ImageIcon(Overview.class.getResource(path34));
		String path34_R = "/Images/StadiumSlices/Stadium_Rollover_34.png";
		img_34_R = new ImageIcon(Overview.class.getResource(path34_R));
		String path34_S = "/Images/StadiumSlices/Stadium_Selected_34.png";
		img_34_S = new ImageIcon(Overview.class.getResource(path34_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_34.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_35.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_35.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_35.getBounds().y, (int)(img_34.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_34.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_34.setIcon(UI_Elements.scaleImageToBox(img_34, view.overviewPanel.overviewStadiumPanel.viewStadium_34));
		MouseAdapter ma34_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_34, img_34, img_34_R, img_34_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_34, ma34_Overview, img_34_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_34.addMouseListener(ma34_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_34.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_35.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_35.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_35.getBounds().y, (int)(img_34.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_34.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_34.setIcon(UI_Elements.scaleImageToBox(img_34, view.gamesPanel.gamesStadiumPanel.viewStadium_34));
		MouseAdapter ma34_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_34, img_34, img_34_R, img_34_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_34, ma34_Games, img_34_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_34.addMouseListener(ma34_Games);



		String path33 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(33) + "_33.png";
		img_33 = new ImageIcon(Overview.class.getResource(path33));
		String path33_R = "/Images/StadiumSlices/Stadium_Rollover_33.png";
		img_33_R = new ImageIcon(Overview.class.getResource(path33_R));
		String path33_S = "/Images/StadiumSlices/Stadium_Selected_33.png";
		img_33_S = new ImageIcon(Overview.class.getResource(path33_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_33.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_34.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_34.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_34.getBounds().y, (int)(img_33.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_33.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_33.setIcon(UI_Elements.scaleImageToBox(img_33, view.overviewPanel.overviewStadiumPanel.viewStadium_33));
		MouseAdapter ma33_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_33, img_33, img_33_R, img_33_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_33, ma33_Overview, img_33_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_33.addMouseListener(ma33_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_33.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_34.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_34.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_34.getBounds().y, (int)(img_33.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_33.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_33.setIcon(UI_Elements.scaleImageToBox(img_33, view.gamesPanel.gamesStadiumPanel.viewStadium_33));
		MouseAdapter ma33_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_33, img_33, img_33_R, img_33_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_33, ma33_Games, img_33_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_33.addMouseListener(ma33_Games);
		
		String path32 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(32) + "_32.png";
		img_32 = new ImageIcon(Overview.class.getResource(path32));
		String path32_R = "/Images/StadiumSlices/Stadium_Rollover_32.png";
		img_32_R = new ImageIcon(Overview.class.getResource(path32_R));
		String path32_S = "/Images/StadiumSlices/Stadium_Selected_32.png";
		img_32_S = new ImageIcon(Overview.class.getResource(path32_S));
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_32.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_33.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_33.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_40.getBounds().y, (int)(img_32.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_32.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_32.setIcon(UI_Elements.scaleImageToBox(img_32, view.overviewPanel.overviewStadiumPanel.viewStadium_32));
		MouseAdapter ma32_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_32, img_32, img_32_R, img_32_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_32, ma32_Overview, img_32_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_32.addMouseListener(ma32_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_32.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_33.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_33.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_40.getBounds().y, (int)(img_32.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_32.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_32.setIcon(UI_Elements.scaleImageToBox(img_32, view.gamesPanel.gamesStadiumPanel.viewStadium_32));
		MouseAdapter ma32_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_32, img_32, img_32_R, img_32_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_32, ma32_Games, img_32_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_32.addMouseListener(ma32_Games);
		
		String path10 = "/Images/StadiumSlices/Stadium" + getViewStadiumSectionType(10) + "_10.png";
		img_10 = new ImageIcon(Controller.class.getResource(path10));
		String path10_R = "/Images/StadiumSlices/Stadium_Rollover_10.png";
		img_10_R = new ImageIcon(Controller.class.getResource(path10_R));
		String path10_S = "/Images/StadiumSlices/Stadium_Selected_10.png";
		img_10_S = new ImageIcon(Controller.class.getResource(path10_S));
		
		
		view.overviewPanel.overviewStadiumPanel.viewStadium_10.setBounds(view.overviewPanel.overviewStadiumPanel.viewStadium_33.getBounds().x + view.overviewPanel.overviewStadiumPanel.viewStadium_33.getBounds().width, view.overviewPanel.overviewStadiumPanel.viewStadium_18.getBounds().y, (int)(img_10.getIconWidth()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio), (int)(img_10.getIconHeight()*view.overviewPanel.overviewStadiumPanel.stadiumSizeRatio));
		view.overviewPanel.overviewStadiumPanel.viewStadium_10.setIcon(UI_Elements.scaleImageToBox(img_10, view.overviewPanel.overviewStadiumPanel.viewStadium_10));
		MouseAdapter ma10_Overview = view.overviewPanel.overviewStadiumPanel.createSectionAdapter(view.overviewPanel.overviewStadiumPanel.viewStadium_10, img_10, img_10_R, img_10_S);
		view.overviewPanel.overviewStadiumPanel.viewStadium_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.overviewStadiumPanel.stadiumSectionSelection(view.overviewPanel.overviewStadiumPanel.viewStadium_10, ma10_Overview, img_10_S);
			}
		});
		view.overviewPanel.overviewStadiumPanel.viewStadium_10.addMouseListener(ma10_Overview);
		
		view.gamesPanel.gamesStadiumPanel.viewStadium_10.setBounds(view.gamesPanel.gamesStadiumPanel.viewStadium_33.getBounds().x + view.gamesPanel.gamesStadiumPanel.viewStadium_33.getBounds().width, view.gamesPanel.gamesStadiumPanel.viewStadium_18.getBounds().y, (int)(img_10.getIconWidth()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio), (int)(img_10.getIconHeight()*view.gamesPanel.gamesStadiumPanel.stadiumSizeRatio));
		view.gamesPanel.gamesStadiumPanel.viewStadium_10.setIcon(UI_Elements.scaleImageToBox(img_10, view.gamesPanel.gamesStadiumPanel.viewStadium_10));
		MouseAdapter ma10_Games = view.gamesPanel.gamesStadiumPanel.createSectionAdapter(view.gamesPanel.gamesStadiumPanel.viewStadium_10, img_10, img_10_R, img_10_S);
		view.gamesPanel.gamesStadiumPanel.viewStadium_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.gamesPanel.gamesStadiumPanel.stadiumSectionSelection(view.gamesPanel.gamesStadiumPanel.viewStadium_10, ma10_Games, img_10_S);
			}
		});
		view.gamesPanel.gamesStadiumPanel.viewStadium_10.addMouseListener(ma10_Games);

		//--------------------------//

		
		
	}//end of constructor
	
	//---controller methods---//
	//sale panel:
	private void displayAllGamesInGivenSeasonSalePanel() {
		view.salesPanel.cb_SalesGame.removeAllItems();
		for (int i = 0; i < model.season[view.salesPanel.cb_SalesSeason.getSelectedIndex()].getNumOfGames(); i++) {
			view.salesPanel.cb_SalesGame.addItem(model.season[view.salesPanel.cb_SalesSeason.getSelectedIndex()].games[i].getName());
		}
	}
	
	public void displayGameRevenue(int seasonIndex, int gameIndex) {
		view.salesPanel.ticketsPanel.tf_TotalAttendance.setText(String.valueOf(model.season[seasonIndex].games[gameIndex].getSoldTickets()));
		view.salesPanel.ticketsPanel.tf_TotalRevenue.setText(String.valueOf(model.season[seasonIndex].games[gameIndex].getTotalGameRevenue()));
		view.salesPanel.ticketsPanel.tf_TotalNumOfGameTickets.setText(String.valueOf(model.season[seasonIndex].games[gameIndex].getTotalSingleTickes()));
		view.salesPanel.ticketsPanel.tf_TotalRevenueGameTickets.setText(String.valueOf(model.season[seasonIndex].games[gameIndex].getSingleTicketsRevenue()));
		view.salesPanel.ticketsPanel.tf_TotalSingleVIP.setText(String.valueOf(model.season[seasonIndex].games[gameIndex].getVipRevenue()));
		view.salesPanel.ticketsPanel.tf_TotalSingleClubLevel.setText(String.valueOf(model.season[seasonIndex].games[gameIndex].getClubLevelRevenue()));
		view.salesPanel.ticketsPanel.tf_TotalSingleBleachers.setText(String.valueOf(model.season[seasonIndex].games[gameIndex].getBleachersRevenue()));
		view.salesPanel.ticketsPanel.tf_TotalNumOfSeasonTickets.setText(String.valueOf(model.season[seasonIndex].games[gameIndex].getSeasonTicketsSold()));
		view.salesPanel.ticketsPanel.tf_TotalSeasonTicketRevenue.setText(String.valueOf(model.season[seasonIndex].games[gameIndex].getSeasonTicketsRevenue()));

	}
	//games panel:
	private void displayAllGamesInGivenSeason() {
		view.gamesPanel.cb_SalesGame.removeAllItems();
		for (int i = 0; i < model.season[view.gamesPanel.cb_SalesSeason.getSelectedIndex()].getNumOfGames(); i++) {
			view.gamesPanel.cb_SalesGame.addItem(model.season[view.gamesPanel.cb_SalesSeason.getSelectedIndex()].games[i].getName());
		}
	}
	
	//login panel:
	public void btnLoginPressed() {
	view.loginPanel.panelLogin.setVisible(false);
	switchMainMenuPage(view.menuPanel.btnOverview); //Mimics use of btnOverview as startup view
	
	view.loginPanel.lblLoginFailed.setVisible(false);
	
	//set the logged in user:
	view.menuPanel.btnUserName.setText("Welcome "+model.signInUser.getFirstName()+"!");
	view.menuPanel.btnUserName.setBorder(null);
	
	}
	
	//properties panel:
	public void displaySectionDetails(int index) {

		view.propertiesPanel.cb_SectionType.setSelectedItem(model.stadium.getArenaSection(index).getSectionType());
		view.propertiesPanel.cb_SectionRanking.setSelectedItem(model.stadium.getArenaSection(index).getSectionRanking());
		view.propertiesPanel.tf_SectionTicketPrice.setText(String.valueOf(model.stadium.getArenaSection(index).getTicketPrice()));
		view.propertiesPanel.tf_SectionNumOfSeats.setText(String.valueOf(model.stadium.getArenaSection(index).getNumOfSeats()));
		if (model.stadium.getArenaSection(index).isRoofed()) {
			view.propertiesPanel.rdbtnIsRoofedYes.setSelected(true);
			view.propertiesPanel.rdbtnIsRoofedNO.setSelected(false);
		} else {
			view.propertiesPanel.rdbtnIsRoofedYes.setSelected(false);
			view.propertiesPanel.rdbtnIsRoofedNO.setSelected(true);
		}

	}
	
	//ViewStadium
	public String getViewStadiumSectionType(int i_SectionNum) {
		
		StringBuilder type = new StringBuilder();
		String sectionType = model.stadium.getArenaSection(i_SectionNum-1).getSectionType();	
		
		if(sectionType != null)
		{
			if(sectionType.equals("Club Level"))
			{
				type.append("_" + "ClubLevel");				
			}
			else
			{
				type.append("_" + sectionType);				
			}
		}
		
		return type.toString();
	}
	///
	
	public void switchMainMenuPage(JButton i_PressedButton)
	{
		view.menuPanel.menuPanel.setVisible(true);
		//Make all panels invisible and all buttons set to default color
		view.overviewPanel.panelOverview.setVisible(false);
		view.menuPanel.btnOverview.setBackground(UI_Elements.color_menuBar);
		view.propertiesPanel.panelProperties.setVisible(false);
		view.menuPanel.btnProperties.setBackground(UI_Elements.color_menuBar);
		view.salesPanel.panelSales.setVisible(false);
		view.menuPanel.btnSales.setBackground(UI_Elements.color_menuBar);
		view.facilitiesPanel.panelFacilities.setVisible(false);
		view.menuPanel.btnFacilities.setBackground(UI_Elements.color_menuBar);
		view.gamesPanel.panelGames.setVisible(false);
		view.menuPanel.btnGames.setBackground(UI_Elements.color_menuBar);
		//switch page and button color based on the pressed one
		switch(i_PressedButton.getText())
		{
			case "OVERVIEW":
				view.overviewPanel.panelOverview.setVisible(true);
				view.menuPanel.btnOverview.setBackground(UI_Elements.color_menuButtonSelected);
				break;
			case "PROPERTIES":
				view.propertiesPanel.panelProperties.setVisible(true);
				view.menuPanel.btnProperties.setBackground(UI_Elements.color_menuButtonSelected);
				break;
			case "SALES":
				view.salesPanel.panelSales.setVisible(true);
				view.menuPanel.btnSales.setBackground(UI_Elements.color_menuButtonSelected);
				break;
			case "FACILITIES":
				view.facilitiesPanel.panelFacilities.setVisible(true);
				view.menuPanel.btnFacilities.setBackground(UI_Elements.color_menuButtonSelected);
				break;
			case "GAMES":
				view.gamesPanel.panelGames.setVisible(true);
				view.menuPanel.btnGames.setBackground(UI_Elements.color_menuButtonSelected);
				break;
		}
	}
	
}
