package application;
import java.util.ArrayList;

import banking.*;	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
//import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;


public class Main extends Application {
	static Stage primaryStage;
	static Bank bank = new Bank ("UAP Bank");
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			bank=DataHandler.readData();
		}catch(Exception e) {
			bank=new Bank("Uapian");
			
		}
		launch(args);
	}
}
