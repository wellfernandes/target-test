package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainView {

	@FXML
	private Button btnEx2;

	@FXML
	private Button btnEx3;

	@FXML
	private Button btnEx4;

	@FXML
	private Button btnEx5;

	@FXML
	void onClicked(ActionEvent event) {

		if (event.getSource().equals(btnEx2)) {
			System.out.println("exercise 2");
		}
		if (event.getSource().equals(btnEx3)) {
			System.out.println("exercise 3");
		}
		if (event.getSource().equals(btnEx4)) {
			System.out.println("exercise 4");
		}
		if (event.getSource().equals(btnEx5)) {
			System.out.println("exercise 5");
		}
	}
}
