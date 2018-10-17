package controller;


import java.net.URL;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class LoginViewController implements Initializable {

	
	private MainController mainController;

	@FXML
	private Button loginButton;

	@FXML
	private Button registerButton;

	@FXML
	private TextField clientNumberField;

	@FXML
	private PasswordField passwordField;

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		loginButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				logIn();
			}
		});

	}

	private void logIn() {
		String clientNumber = clientNumberField.getText();
		String password = passwordField.getText();
		if (clientNumber.equals("1") && password.equals("1")) {
			System.out.println("Password OK");
			mainController.showHomePanel();
		}
	}
	
}
