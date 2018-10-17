package model;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	
	
	@Override
	public void start(Stage primaryStage) {
		
		final String appName = "Bank";
		try {
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource(
                "/view/MainView.fxml"));
        Scene scene = new Scene(parent);
        
        primaryStage.setTitle(appName);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
		} catch (Exception e) {
			System.out.println("Wyj¹tek w main");
            e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
