package model;

import java.io.Serializable;
import java.util.List;

public class BillingPerDay implements Serializable {

	private static final long serialVersionUID = 1L;
	private String dia; // same name of json file.
	private Double valor;
	private Double minBilling;
	private Double maxBilling;

	public BillingPerDay() {
	}

	public BillingPerDay(String dia, Double valor) {
		super();
		this.dia = dia;
		this.valor = valor;
	}

	public Double minBilled(List<BillingPerDay> list) {

		minBilling = 0.0;

		for (int k = 0; k < list.size(); k++) {
			if (list.get(k).getValor() != 0.0) {
				if (list.get(k) == list.get(0)) {
					minBilling = list.get(k).getValor();
				}
				if (list.get(k).getValor() < minBilling) {
					minBilling = list.get(k).getValor();
				}
			}
		}
		return minBilling;
	}

	public Double maxBilled(List<BillingPerDay> list) {

		maxBilling = 0.0;

		for (int k = 0; k < list.size(); k++) {
			if (list.get(k).getValor() != 0.0) {
				if (list.get(k) == list.get(0)) {
					maxBilling = list.get(k).getValor();
				}
				if (list.get(k).getValor() > maxBilling) {
					maxBilling = list.get(k).getValor();
				}
			}
		}
		return maxBilling;
	}

	public Double averageBilled(List<BillingPerDay> list) {

		Double average = 0.0;
		for (int i = 0; i < list.size(); i++) {
			average += list.get(i).getValor() / 30;
		}
		return average;
	}

	public Integer averageSupPerDay(List<BillingPerDay> list) {

		Double avarageMonth = averageBilled(list);
		int days = 0;

		for (int j = 0; j < list.size(); j++) {
			if (list.get(j).getValor() > avarageMonth) {
				days += 1;
			}
		}
		return days;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
