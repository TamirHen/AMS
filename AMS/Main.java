package AMS;
import java.awt.Dimension;

import java.awt.EventQueue;

import view.*;
import controller.*;
import model.*;

public class Main {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {				
				try {
					View amsView = new View();
					Model amsModel = new Model();
					Controller amsController = new Controller(amsView, amsModel);
								
					amsView.setVisible(true);
					amsView.setMaximumSize(new Dimension(1114, 600));
					amsView.setMinimumSize(new Dimension(1114, 600));
					amsView.setResizable(false);
					amsView.setTitle("AMS - Arena Management System");
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
