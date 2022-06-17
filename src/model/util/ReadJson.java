package model.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import model.BillingPerDay;

public class ReadJson {

	private static List<BillingPerDay> listBillingObj = new ArrayList<>();

	public void convertJsonToObj(File file) {

		Gson gson = new Gson();

		JsonReader reader = null;
		try {
			reader = new JsonReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		BillingPerDay[] billingPerDays = gson.fromJson(reader, BillingPerDay[].class);

		for (int i = 0; i < billingPerDays.length; i++) {
			listBillingObj.add(billingPerDays[i]);
		}
	}

	public static List<BillingPerDay> getListBillingObj() {
		return listBillingObj;
	}

	public static void setListBillingObj(List<BillingPerDay> listBillingObj) {
		ReadJson.listBillingObj = listBillingObj;
	}
}
