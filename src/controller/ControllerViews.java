package controller;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ControllerViews {

	private static Stage stageMain;
	private static Stage stageEx2;
	private static Stage stageEx3;
	private static Stage stageEx4;
	private static Stage stageEx5;

	public static void showMainView(Stage primaryStage) {
		try {
			FXMLLoader rootFXML = new FXMLLoader();
			rootFXML.setLocation(ControllerViews.class.getResource("/view/MainView.fxml"));
			rootFXML.setController(null);

			Parent root = rootFXML.load();
			Scene scene = new Scene(root);

			stageMain = primaryStage;
			stageMain.setTitle("Teste - Target Sistemas");
			stageMain.setScene(scene);
			stageMain.setResizable(false);
			stageMain.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void showEx2View() {

		try {
			FXMLLoader rootFXML = new FXMLLoader();
			rootFXML.setLocation(ControllerViews.class.getResource("/view/Ex2View.fxml"));
			// rootFXML.setController(new Ex2Controller());
			Parent root = rootFXML.load();
			Scene scene = new Scene(root);

			stageEx2 = new Stage();
			stageEx2.setTitle("Exercício 2 - Fibonacci");
			stageEx2.initModality(Modality.WINDOW_MODAL);
			stageEx2.initOwner(stageMain);
			stageEx2.setScene(scene);
			stageEx2.setResizable(false);
			stageEx2.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Stage getStageMain() {
		return stageMain;
	}

	public static void setStageMain(Stage stageMain) {
		ControllerViews.stageMain = stageMain;
	}

	public static Stage getStageEx2() {
		return stageEx2;
	}

	public static void setStageEx2(Stage stageEx2) {
		ControllerViews.stageEx2 = stageEx2;
	}

	public static Stage getStageEx3() {
		return stageEx3;
	}

	public static void setStageEx3(Stage stageEx3) {
		ControllerViews.stageEx3 = stageEx3;
	}

	public static Stage getStageEx4() {
		return stageEx4;
	}

	public static void setStageEx4(Stage stageEx4) {
		ControllerViews.stageEx4 = stageEx4;
	}

	public static Stage getStageEx5() {
		return stageEx5;
	}

	public static void setStageEx5(Stage stageEx5) {
		ControllerViews.stageEx5 = stageEx5;
	}
}
