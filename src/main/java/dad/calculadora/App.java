package dad.calculadora;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
	private Controlador controller;

	public void start(Stage primaryStage) throws Exception {
		controller = new Controlador();
		Scene scene = new Scene(controller.getVista());
		primaryStage.setTitle("Calculadora FXML");
		primaryStage.setScene(scene);
		primaryStage.getIcons().add(new Image("file:src/main/resources/calculator-32x32.png"));
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
