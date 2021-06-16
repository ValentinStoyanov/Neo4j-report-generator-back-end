package com.model;

public class Report1Result {
	
	public Report1Result(String ecu, String percentage) {
		super();
		this.ecu = ecu;
		this.percentage = percentage;
	}
	private String ecu;
	private String percentage;
	public String getEcu() {
		return ecu;
	}
	public void setEcu(String ecu) {
		this.ecu = ecu;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

}
