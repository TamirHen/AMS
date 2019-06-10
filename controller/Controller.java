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
import java.awt.event.ActionEvent;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import sqlite.*;
import model.*;
import view.*;

public class Controller {
	private View view;
	private Model model;
	
	public Controller(View amsView, Model amsModel) {
		this.view = amsView;
		this.model = amsModel;
	
		//---login panel---//
		//	btnLogin pressed:
		view.loginPanel.btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (model.db.isUserExist(view.loginPanel.tf_loginUsername.getText(),view.loginPanel.passwordField_Login.getPassword())) {
					btnLoginPressed();
				}
				else
					view.loginPanel.lblLoginFailed.setVisible(true);

			}	
		});
	
		//---menu panel---//
		//button overview pressed:
		view.menuPanel.btnOverview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.panelOverview.setVisible(true);
				view.setBackground(UI_Elements.color_menuButtonSelected);
				view.propertiesPanel.panelProperties.setVisible(false);
				view.menuPanel.btnProperties.setBackground(UI_Elements.color_menuBar);
				view.salesPanel.panelSales.setVisible(false);
				view.menuPanel.btnSales.setBackground(UI_Elements.color_menuBar);
				view.facilitiesPanel.panelFacilities.setVisible(false);
				view.menuPanel.btnFacilities.setBackground(UI_Elements.color_menuBar);
				

			}
		});
		//button properties pressed:
		view.menuPanel.btnProperties.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			view.overviewPanel.panelOverview.setVisible(false);
			view.menuPanel.btnOverview.setBackground(UI_Elements.color_menuBar);
			view.propertiesPanel.panelProperties.setVisible(true);
			view.menuPanel.btnProperties.setBackground(UI_Elements.color_menuButtonSelected);
			view.salesPanel.panelSales.setVisible(false);
			view.menuPanel.btnSales.setBackground(UI_Elements.color_menuBar);
			view.facilitiesPanel.panelFacilities.setVisible(false);
			view.menuPanel.btnFacilities.setBackground(UI_Elements.color_menuBar);
			
			}
		});
		//button sales pressed:
		view.menuPanel.btnSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.overviewPanel.panelOverview.setVisible(false);
				view.menuPanel.btnOverview.setBackground(UI_Elements.color_menuBar);
				view.propertiesPanel.panelProperties.setVisible(false);
				view.menuPanel.btnProperties.setBackground(UI_Elements.color_menuBar);
				view.salesPanel.panelSales.setVisible(true);
				view.menuPanel.btnSales.setBackground(UI_Elements.color_menuButtonSelected);
				view.facilitiesPanel.panelFacilities.setVisible(false);
				view.menuPanel.btnFacilities.setBackground(UI_Elements.color_menuBar);

			}
		});
		// button facilities pressed:
		view.menuPanel.btnFacilities.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			view.overviewPanel.panelOverview.setVisible(false);
			view.menuPanel.btnOverview.setBackground(UI_Elements.color_menuBar);
			view.propertiesPanel.panelProperties.setVisible(false);
			view.menuPanel.btnProperties.setBackground(UI_Elements.color_menuBar);
			view.salesPanel.panelSales.setVisible(false);
			view.menuPanel.btnSales.setBackground(UI_Elements.color_menuBar);
			view.facilitiesPanel.panelFacilities.setVisible(true);
			view.menuPanel.btnFacilities.setBackground(UI_Elements.color_menuButtonSelected);
			
			}
		});
		
		//button UserName:
//		view.menuPanel.btnUserName.setText("Welcome "+model.signInUser+"!");
		view.menuPanel.btnUserName.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			if (view.menuPanel.btnUserName.getBackground()==UI_Elements.color_menuButtonSelected) {
				view.menuPanel.btnUserName.setBackground(UI_Elements.color_menuBar);
				view.menuPanel.btnLogout.setVisible(false);
			}
			else {
				view.menuPanel.btnUserName.setBackground(UI_Elements.color_menuButtonSelected);
				view.menuPanel.btnLogout.setVisible(true);
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
		view.propertiesPanel.tf_arenaName.setText(model.stadium.getStadiumName());
		view.propertiesPanel.tf_address.setText(model.stadium.getAddress());
		view.propertiesPanel.tf_arenaNumOfSeats.setText(String.valueOf(model.stadium.getCapacity()));
		view.propertiesPanel.tf_sectionTicketPrice.setText(String.valueOf(model.stadium.getArenaSection(0).getTicketPrice()));
		view.propertiesPanel.tf_sectionNumOfSeats.setText(String.valueOf(model.stadium.getArenaSection(1).getNumOfSeats()));
		//set sections in the combobox:
		for (int i = 0; i < model.db.sectionSize; i++) {
			view.propertiesPanel.cb_sectionSelection.addItem(model.db.section[i].getSectionName());
		}
		//combo boxes:
		//need to setText for the combo box
//		view.propertiesPanel.cb_sectionSelection
//		.setModel(new DefaultComboBoxModel(new String[] { model.stadium.getArenaSection(0).getSectionName(),
//				model.stadium.getArenaSection(1).getSectionName(), model.stadium.getArenaSection(2).getSectionName(),
//				model.stadium.getArenaSection(3).getSectionName(), model.stadium.getArenaSection(4).getSectionName(),
//				 }));
//		view.propertiesPanel.cb_sectionType.setSelectedItem(model.stadium.getArenaSection(0/* DO NOT CHANGE 0 VALUE */).getSectionType());
//		view.propertiesPanel.cb_sectionRanking.setSelectedItem(model.stadium.getArenaSection(0/* DO NOT CHANGE 0 VALUE */).getSectionRanking());
		//display the first section (section 1):
		displaySectionDetails(0);
		// Actions:
		view.propertiesPanel.editProperties.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.propertiesPanel.editProperties.setVisible(false);
				view.propertiesPanel.btnCancelEdit.setVisible(true);
				view.propertiesPanel.finishEditPropertiesButton.setVisible(true);
				view.propertiesPanel.setProperties(true);
				view.propertiesPanel.cb_sectionSelection.setEnabled(false);
				view.propertiesPanel.cb_sectionSelection.setRenderer(new DefaultListCellRenderer() { // Send Yoni
					public void paint(Graphics g) {
						setForeground(Color.BLACK);
						super.paint(g);
					}
				});
			}
		});

		view.propertiesPanel.finishEditPropertiesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				view.propertiesPanel.cb_sectionSelection.setEnabled(true);
				view.propertiesPanel.finishEditPropertiesButton.setVisible(false);
				view.propertiesPanel.editProperties.setVisible(true);
				view.propertiesPanel.btnCancelEdit.setVisible(false);

				view.propertiesPanel.sectionInedex = view.propertiesPanel.cb_sectionSelection.getSelectedIndex(); // Gets the Section we want to edit

				model.stadium.setStadiumName(view.propertiesPanel.tf_arenaName.getText());
				model.stadium.setAddress(view.propertiesPanel.tf_address.getText());
				model.stadium.setCapacity(Integer.valueOf(view.propertiesPanel.tf_arenaNumOfSeats.getText()).intValue());
				// -------------//
				model.stadium.getArenaSection(view.propertiesPanel.sectionInedex)
						.setSectionType(view.propertiesPanel.cb_sectionType.getModel().getSelectedItem().toString());
				model.stadium.getArenaSection(view.propertiesPanel.sectionInedex)
						.setSectionRanking(view.propertiesPanel.cb_sectionRanking.getModel().getSelectedItem().toString());
				model.stadium.getArenaSection(view.propertiesPanel.sectionInedex)
						.setTicketPrice(Float.valueOf(view.propertiesPanel.tf_sectionTicketPrice.getText()).floatValue());
				model.stadium.getArenaSection(view.propertiesPanel.sectionInedex)
						.setNumOfSeats(Integer.valueOf(view.propertiesPanel.tf_sectionNumOfSeats.getText()).intValue());
				if (view.propertiesPanel.rdbtnIsRoofedYes.isSelected()) {
					model.stadium.getArenaSection(view.propertiesPanel.sectionInedex).setRoofed(true);
				} else {
					model.stadium.getArenaSection(view.propertiesPanel.sectionInedex).setRoofed(false);
				}
				// -------------//
				view.propertiesPanel.setProperties(false);
			}
		});

		view.propertiesPanel.btnCancelEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.propertiesPanel.cb_sectionSelection.setEnabled(true);
				view.propertiesPanel.btnCancelEdit.setVisible(false);
				view.propertiesPanel.editProperties.setVisible(true);
				view.propertiesPanel.finishEditPropertiesButton.setVisible(false);

				view.propertiesPanel.sectionInedex = view.propertiesPanel.cb_sectionSelection.getSelectedIndex(); // Gets the Section we want to edit

				view.propertiesPanel.tf_arenaName.setText(model.stadium.getStadiumName());
				view.propertiesPanel.tf_address.setText(model.stadium.getAddress());
				view.propertiesPanel.tf_arenaNumOfSeats.setText(String.valueOf(model.stadium.getCapacity()));
				// -------------//

				view.propertiesPanel.cb_sectionType.setSelectedItem(model.stadium.getArenaSection(view.propertiesPanel.sectionInedex).getSectionType());
				view.propertiesPanel.cb_sectionRanking.setSelectedItem(model.stadium.getArenaSection(view.propertiesPanel.sectionInedex).getSectionRanking());
				view.propertiesPanel.tf_sectionTicketPrice.setText(String.valueOf(model.stadium.getArenaSection(view.propertiesPanel.sectionInedex).getTicketPrice()));
				view.propertiesPanel.tf_sectionNumOfSeats.setText(String.valueOf(model.stadium.getArenaSection(view.propertiesPanel.sectionInedex).getNumOfSeats()));
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

		view.propertiesPanel.cb_sectionSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				displaySectionDetails(view.propertiesPanel.cb_sectionSelection.getSelectedIndex()); // function which display the data on a
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
		// set section the sections part of the panel to display first look
//		for (int i = 0; i < model.db.sectionSize; i++) {
//			model.stadium.getArenaSection(i).setSectionType(view.propertiesPanel.cb_sectionType.getModel().getSelectedItem().toString());
//
//		}
//		if (model.stadium.getArenaSection(0).isRoofed()) {
//			view.propertiesPanel.rdbtnIsRoofedYes.setSelected(true);
//		} else {
//			view.propertiesPanel.rdbtnIsRoofedYes.setSelected(false);
//		}
//		if (!model.stadium.getArenaSection(0).isRoofed()) {
//			view.propertiesPanel.rdbtnIsRoofedNO.setSelected(true);
//		} else {
//			view.propertiesPanel.rdbtnIsRoofedNO.setSelected(false);
//		}
//		for (int i = 0; i < model.db.sectionSize; i++) {
//			model.stadium.getArenaSection(i).setSectionRanking(view.propertiesPanel.cb_sectionRanking.getModel().getSelectedItem().toString());
//		}
		
		
		
	}//end of constructor
	
	//controller methods:
	
	//login panel:
	public void btnLoginPressed() {
	view.loginPanel.panelLogin.setVisible(false);
	view.menuPanel.menuPanel.setVisible(true);
	view.overviewPanel.panelOverview.setVisible(true);
	view.overviewPanel.panelOverview.setVisible(true);
	view.menuPanel.btnOverview.setBackground(UI_Elements.color_menuButtonSelected);
	view.propertiesPanel.panelProperties.setVisible(false);
	view.menuPanel.btnProperties.setBackground(UI_Elements.color_menuBar);
	view.salesPanel.panelSales.setVisible(false);
	view.menuPanel.btnSales.setBackground(UI_Elements.color_menuBar);
	view.facilitiesPanel.panelFacilities.setVisible(false);
	view.menuPanel.btnFacilities.setBackground(UI_Elements.color_menuBar);
	
	view.loginPanel.lblLoginFailed.setVisible(false);
	
	//set the logged in user:
	model.signInUser=model.db.signInUser;
	view.menuPanel.btnUserName.setText("Welcome "+model.signInUser.getFirstName()+"!");
	
	}
	
	//properties panel:
	public void displaySectionDetails(int index) {

		view.propertiesPanel.cb_sectionType.setSelectedItem(model.stadium.getArenaSection(index).getSectionType());
		view.propertiesPanel.cb_sectionRanking.setSelectedItem(model.stadium.getArenaSection(index).getSectionRanking());
		view.propertiesPanel.tf_sectionTicketPrice.setText(String.valueOf(model.stadium.getArenaSection(index).getTicketPrice()));
		view.propertiesPanel.tf_sectionNumOfSeats.setText(String.valueOf(model.stadium.getArenaSection(index).getNumOfSeats()));
		if (model.stadium.getArenaSection(index).isRoofed()) {
			view.propertiesPanel.rdbtnIsRoofedYes.setSelected(true);
			view.propertiesPanel.rdbtnIsRoofedNO.setSelected(false);
		} else {
			view.propertiesPanel.rdbtnIsRoofedYes.setSelected(false);
			view.propertiesPanel.rdbtnIsRoofedNO.setSelected(true);
		}

	}
}
