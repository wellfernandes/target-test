package model.util;

import java.lang.reflect.Type;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import model.BillingPerDay;

public class DeserializerJson implements JsonDeserializer<BillingPerDay> {

	@Override
	public BillingPerDay deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {

		BillingPerDay billingPerDay = new BillingPerDay();

		JsonArray jsonArray = json.getAsJsonArray();
		if (jsonArray.size() != 1) {
			throw new IllegalStateException("unexpected json");
		}
		JsonObject jsonObject = jsonArray.get(0).getAsJsonObject(); // get only element
		JsonElement jsonElement = jsonObject.get("dia");
		if (!jsonElement.isJsonNull()) {
			billingPerDay.setDia(jsonElement.getAsString());
		}
		billingPerDay.setValor((double) jsonObject.get("valor").getAsInt());

		return billingPerDay;
	}
}
