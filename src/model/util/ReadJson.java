package model.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import model.BillingPerDay;

public class ReadJson {

	private String json;
	private List<String> listString = new ArrayList<>();

	private static List<BillingPerDay> listBillingObj = new ArrayList<>();

	public void readJson(File file) {

		Scanner in = null;

		try {
			in = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (in.hasNextLine()) {
			String line = in.nextLine();
			listString.add(line);
		}

		json = listString.toString().trim();
		System.out.println(json);
		// convertJsonToObj(json);
	}

	public void convertJsonToObj(File file) {

		Gson gson = new Gson();

		JsonReader reader = null;
		try {
			reader = new JsonReader(new FileReader(file));
			System.out.println("Arquivo Lido com sucesso!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BillingPerDay[] billingPerDays = gson.fromJson(reader, BillingPerDay[].class);

		// for print for test
		for (int i = 0; i < billingPerDays.length; i++) {

			listBillingObj.add(billingPerDays[i]);

			System.out.println(billingPerDays[i].getDia());
			System.out.println(billingPerDays[i].getValor());
			System.out.println("");
		}
	}

	public static List<BillingPerDay> getListBillingObj() {
		return listBillingObj;
	}

	public static void setListBillingObj(List<BillingPerDay> listBillingObj) {
		ReadJson.listBillingObj = listBillingObj;
	}
}
