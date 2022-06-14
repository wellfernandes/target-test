package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class MainView implements Initializable {

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

	@Override
	public void initialize(URL url, ResourceBundle res) {

	}

	public Button getBtnEx2() {
		return btnEx2;
	}

	public void setBtnEx2(Button btnEx2) {
		this.btnEx2 = btnEx2;
	}

	public Button getBtnEx3() {
		return btnEx3;
	}

	public void setBtnEx3(Button btnEx3) {
		this.btnEx3 = btnEx3;
	}

	public Button getBtnEx4() {
		return btnEx4;
	}

	public void setBtnEx4(Button btnEx4) {
		this.btnEx4 = btnEx4;
	}

	public Button getBtnEx5() {
		return btnEx5;
	}

	public void setBtnEx5(Button btnEx5) {
		this.btnEx5 = btnEx5;
	}
}
