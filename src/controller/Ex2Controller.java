package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Fibonacci;

public class Ex2Controller implements Initializable {

	@FXML
	TextField txtNumber;
	@FXML
	Button btnVerify;
	@FXML
	Label lblResultNumber;
	@FXML
	Label lblResultText;

	@Override
	public void initialize(URL url, ResourceBundle res) {

	}

	public void onClicked(ActionEvent btn) {

		if (btn.getSource().equals(btnVerify)) {
			if (!txtNumber.getText().isEmpty()) {
				try {
					Fibonacci fibonacci = new Fibonacci();
					if(fibonacci.fiboCheck(Integer.parseInt(txtNumber.getText()))) {
						lblResultText.setText("Pertence a sequência de Fibonacci!");
					}else {
						lblResultText.setText("Não pertence a sequência de Fibonacci!");
					}
					lblResultNumber.setText(txtNumber.getText());
					
				} catch (NumberFormatException e) {
					Alert alert = new Alert(Alert.AlertType.ERROR);
					alert.setTitle("Atenção!");
					alert.setContentText("Insira apenas números.");
					alert.show();
				}
			} else {
				Alert alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setTitle("Atenção!");
				alert.setContentText("O campo não pode ser vazio.");
				alert.show();
			}

		}
	}
}
