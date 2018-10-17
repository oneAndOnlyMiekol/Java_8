package controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class HomeViewController implements Initializable{
	
	private MainController mainController;
	
	@FXML
	private Button button;
	
	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				
			}
		});
		
	}

}
