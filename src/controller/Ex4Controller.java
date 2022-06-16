package controller;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.PercentageByState;

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
	private Label lblRj;

	@FXML
	private Label lblMg;

	@FXML
	private Label lblEs;

	@FXML
	private Label lblOthers;

	@FXML
	private Label lblTotalBilling;

	private List<Double> listTotalBilling;

	@Override
	public void initialize(URL url, ResourceBundle res) {

	}

	public void onClicked(ActionEvent btn) {

		if (btn.getSource().equals(btnCalc)) {

			PercentageByState percentageByState = new PercentageByState();

			listTotalBilling = percentageByState.calcPercentage(Double.parseDouble(txtSp.getText()),
					Double.parseDouble(txtRj.getText()), Double.parseDouble(txtMg.getText()),
					Double.parseDouble(txtEs.getText()), Double.parseDouble(txtOthers.getText()));

			lblSp.setText(new DecimalFormat("#,##0.00").format(listTotalBilling.get(0)) + " %");
			lblRj.setText(new DecimalFormat("#,##0.00").format(listTotalBilling.get(1)) + " %");
			lblMg.setText(new DecimalFormat("#,##0.00").format(listTotalBilling.get(2)) + " %");
			lblEs.setText(new DecimalFormat("#,##0.00").format(listTotalBilling.get(3)) + " %");
			lblOthers.setText(new DecimalFormat("#,##0.00").format(listTotalBilling.get(4)) + " %");
			lblTotalBilling.setText(new DecimalFormat("#,##0.00").format(listTotalBilling.get(5)));

		}
	}
}
