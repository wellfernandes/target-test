package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Ex4Controller implements Initializable {

	@FXML
	private Button btnCalc;

	@FXML
	private TextField txtSp;

	@FXML
	private TextField txtRj;

	@FXML
	private TextField txtMg;

	@FXML
	private TextField txtEs;

	@FXML
	private TextField txtOthers;

	@FXML
	private Label lblSp;

	@FXML
	private Label lbRj;

	@FXML
	private Label lblMg;

	@FXML
	private Label lblEs;

	@FXML
	private Label lblOthers;

	@Override
	public void initialize(URL url, ResourceBundle res) {

	}

	public void onClicked(ActionEvent btn) {

		if (btn.getSource().equals(btnCalc)) {
			System.out.println("Clicou Calc");
		}
	}
}
