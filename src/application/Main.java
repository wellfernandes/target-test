package application;

import controller.ControllerViews;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {


	@Override
	public void start(Stage primaryStage) {
		ControllerViews.showMainView(primaryStage);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
