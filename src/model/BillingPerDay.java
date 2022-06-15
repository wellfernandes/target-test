package model;

import java.io.Serializable;

public class BillingPerDay implements Serializable {

	private static final long serialVersionUID = 1L;
	private String dia; // same name of json file.
	private Double valor;

	public BillingPerDay() {
	}

	public BillingPerDay(String dia, Double valor) {
		super();
		this.dia = dia;
		this.valor = valor;
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
