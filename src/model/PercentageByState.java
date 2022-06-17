package model;

import java.util.ArrayList;
import java.util.List;

public class PercentageByState {

	private List<Double> listPercentState = new ArrayList<>();

	public List<Double> calcPercentage(Double sp, Double rj, Double mg, Double es, Double others) {

		Double sum, percentSp, percentRj, percentMg, percentEs, percentOthers;

		sum = sp + rj + mg + es + others;

		percentSp = (sp * 100.0) / sum;
		percentRj = (rj * 100.0) / sum;
		percentMg = (mg * 100.0) / sum;
		percentEs = (es * 100.0) / sum;
		percentOthers = (others * 100.0) / sum;

		listPercentState.add(percentSp);
		listPercentState.add(percentRj);
		listPercentState.add(percentMg);
		listPercentState.add(percentEs);
		listPercentState.add(percentOthers);
		listPercentState.add(sum);

		return listPercentState;
	}

	public List<Double> getListPercentState() {
		return listPercentState;
	}
}
