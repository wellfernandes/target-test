package controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import model.BillingPerDay;
import model.util.ReadJson;

public class Ex3Controller implements Initializable {

	@FXML
	private Button btnLoadFile;
	@FXML
	private Button btnCalc;
	@FXML
	private Label lblNameFile;
	@FXML
	private Label lblResultText;

	@FXML
	private Label lblMinBilling;

	@FXML
	private Label lblMaxBilling;

	@FXML
	private Label lblMaxAverage;

	private FileChooser fileChooser;
	private File file;

	@Override
	public void initialize(URL url, ResourceBundle res) {

	}

	public void onClicked(ActionEvent btn) {

		if (btn.getSource().equals(btnLoadFile)) {
			try {
				fileChooser = new FileChooser();
				fileChooser.setTitle("Carregar arquivo JSON");

				if (fileChooser.getExtensionFilters()
						.add(new FileChooser.ExtensionFilter("JSON file (*.json)", "*.json"))) {
					file = fileChooser.showOpenDialog(null);
					if (!file.exists()) {
						Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
						alert.setTitle("JSON");
						alert.setContentText("Por favor, escolha um arquivo .JSON");
						alert.show();
					}

					ReadJson readJson = new ReadJson();
					readJson.convertJsonToObj(file); // reading json file with gson

					Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
					alert.setTitle("JSON");
					alert.setContentText("Arquivo carregado com sucesso!");
					alert.show();
					btnLoadFile.setDisable(true);

					btnLoadFile.setText("Carregado");
					lblNameFile.setText(file.getName());
				}

			} catch (RuntimeException e) {
				e.printStackTrace();
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setTitle("Erro ao carregar");
				alert.setContentText("Erro ao carregar arquivo.");
				alert.show();
			}
		}
		if (btn.getSource().equals(btnCalc)) {
			if (file == null) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setTitle("Atenção!");
				alert.setContentText("Carregue um arquivo antes de calcular.");
				alert.show();
			}

			// run calculate exercise 3
			BillingPerDay b = new BillingPerDay();

			lblMaxAverage.setText(b.averageSupPerDay(ReadJson.getListBillingObj()).toString() + " dias");
			lblMinBilling.setText(b.minBilled(ReadJson.getListBillingObj()).toString() + " reais");
			lblMaxBilling.setText(b.maxBilled(ReadJson.getListBillingObj()).toString() + " reais");
		}
	}
}
