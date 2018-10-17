package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import model.Client;

public class MainController implements Initializable {

	@FXML
	private AnchorPane contentPane;
	@FXML
	private LoginViewController loginViewController;
	@FXML
	private HomeViewController homeViewController;

	String clientNumber;
	Client client;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	    contentPane.getChildren().get(0).setVisible(true);
        contentPane.getChildren().get(1).setVisible(false);
		loginViewController.setMainController(this);
		homeViewController.setMainController(this);
		
	}

	public void showHomePanel() {
	    contentPane.getChildren().get(0).setVisible(false);
	    contentPane.getChildren().get(1).setVisible(true);
	}
	
}
