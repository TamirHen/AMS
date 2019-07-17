package AMS;

import java.awt.EventQueue;

import view.*;
import controller.*;
import model.*;

public class Main {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {				
				try {
					Model amsModel = new Model();
					View amsView = new View();
					Controller amsController = new Controller(amsView, amsModel);
								
					amsView.setVisible(true);
					amsView.setResizable(false);
					amsView.setTitle("AMS - Arena Management System");
					amsView.setIconImage(UI_Elements.amsIcon.getImage());
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
