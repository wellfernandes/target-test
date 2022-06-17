package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.InvertCharacters;

public class Ex5Controller implements Initializable {

	@FXML
	private Button btnInvert;

	@FXML
	private TextField txtString;

	@FXML
	private Label lblInvertString;

	@Override
	public void initialize(URL url, ResourceBundle res) {

	}

	public void onClicked(ActionEvent btn) {

		if (btn.getSource().equals(btnInvert)) {

			InvertCharacters inverChar = new InvertCharacters();

			String inverted = inverChar.splitString(txtString.getText());
			lblInvertString.setText(inverted);
		}
	}
}
