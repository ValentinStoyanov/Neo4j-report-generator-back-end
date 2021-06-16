package com.model;

public class Report2Result {
	
	public Report2Result(String ecu, String average, String fechaconv) {
		super();
		this.ecu = ecu;
		this.average = average;
		this.fechaconv = fechaconv;
	}
	private String ecu;
	private String average;
	private String fechaconv;
	public String getEcu() {
		return ecu;
	}
	public void setEcu(String ecu) {
		this.ecu = ecu;
	}
	public String getAverage() {
		return average;
	}
	public void setAverage(String average) {
		this.average = average;
	}
	public String getFechaconv() {
		return fechaconv;
	}
	public void setFechaconv(String fechaconv) {
		this.fechaconv = fechaconv;
	}

}
