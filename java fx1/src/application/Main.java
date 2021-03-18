package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			/*Classe pai onde vou chamar a view */
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/view.fxml"));
			Scene scene = new Scene(parent);
			/*Atribuo para exibi��o de scena*/
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
