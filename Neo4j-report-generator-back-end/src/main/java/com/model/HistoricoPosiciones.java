package com.model;

import java.sql.Timestamp;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class HistoricoPosiciones {
	
	@Id @GeneratedValue private Long id;
	private int ecu;
	private int vehiculo;
	private double latitud; 
	private double longitud;
	private double altitud; 
	private String idSesion;
	private int estadoKL15;
	private int estadoTarjetaConductor1;
	private int estadoTarjetaConductor2;
	private double velocidadGPS;
	private int KL30;
	private int RPM;
	private int modoTrabajo;
	private double valorOdometro; 
	private double nivelFuel1;
	private double nivelFuel2;
	private double nivelAdBlue;
	private Timestamp fechaECU;
	private Timestamp fechaServidor;
	private String fechaECUPorMinuto;
	private int idRecepcion;

	
	public HistoricoPosiciones() {
		super();
	}
	
	public HistoricoPosiciones(Long id, int ecu, int vehiculo, double latitud, double longitud, double altitud,
			String idSesion, int estadoKL15, int estadoTarjetaConductor1, int estadoTarjetaConductor2,
			double velocidadGPS, int kL30, int rPM, int modoTrabajo, double valorOdometro, double nivelFuel1,
			double nivelFuel2, double nivelAdBlue, Timestamp fechaECU, Timestamp fechaServidor,
			String fechaECUPorMinuto, int idRecepcion) {
		super();
		this.id = id;
		this.ecu = ecu;
		this.vehiculo = vehiculo;
		this.latitud = latitud;
		this.longitud = longitud;
		this.altitud = altitud;
		this.idSesion = idSesion;
		this.estadoKL15 = estadoKL15;
		this.estadoTarjetaConductor1 = estadoTarjetaConductor1;
		this.estadoTarjetaConductor2 = estadoTarjetaConductor2;
		this.velocidadGPS = velocidadGPS;
		KL30 = kL30;
		RPM = rPM;
		this.modoTrabajo = modoTrabajo;
		this.valorOdometro = valorOdometro;
		this.nivelFuel1 = nivelFuel1;
		this.nivelFuel2 = nivelFuel2;
		this.nivelAdBlue = nivelAdBlue;
		this.fechaECU = fechaECU;
		this.fechaServidor = fechaServidor;
		this.fechaECUPorMinuto = fechaECUPorMinuto;
		this.idRecepcion = idRecepcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getEcu() {
		return ecu;
	}

	public void setEcu(int ecu) {
		this.ecu = ecu;
	}

	public int getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(int vehiculo) {
		this.vehiculo = vehiculo;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getAltitud() {
		return altitud;
	}

	public void setAltitud(double altitud) {
		this.altitud = altitud;
	}

	public String getIdSesion() {
		return idSesion;
	}

	public void setIdSesion(String idSesion) {
		this.idSesion = idSesion;
	}

	public int getEstadoKL15() {
		return estadoKL15;
	}

	public void setEstadoKL15(int estadoKL15) {
		this.estadoKL15 = estadoKL15;
	}

	public int getEstadoTarjetaConductor1() {
		return estadoTarjetaConductor1;
	}

	public void setEstadoTarjetaConductor1(int estadoTarjetaConductor1) {
		this.estadoTarjetaConductor1 = estadoTarjetaConductor1;
	}

	public int getEstadoTarjetaConductor2() {
		return estadoTarjetaConductor2;
	}

	public void setEstadoTarjetaConductor2(int estadoTarjetaConductor2) {
		this.estadoTarjetaConductor2 = estadoTarjetaConductor2;
	}

	public double getVelocidadGPS() {
		return velocidadGPS;
	}

	public void setVelocidadGPS(double velocidadGPS) {
		this.velocidadGPS = velocidadGPS;
	}

	public int getKL30() {
		return KL30;
	}

	public void setKL30(int kL30) {
		KL30 = kL30;
	}

	public int getRPM() {
		return RPM;
	}

	public void setRPM(int rPM) {
		RPM = rPM;
	}

	public int getModoTrabajo() {
		return modoTrabajo;
	}

	public void setModoTrabajo(int modoTrabajo) {
		this.modoTrabajo = modoTrabajo;
	}

	public double getValorOdometro() {
		return valorOdometro;
	}

	public void setValorOdometro(double valorOdometro) {
		this.valorOdometro = valorOdometro;
	}

	public double getNivelFuel1() {
		return nivelFuel1;
	}

	public void setNivelFuel1(double nivelFuel1) {
		this.nivelFuel1 = nivelFuel1;
	}

	public double getNivelFuel2() {
		return nivelFuel2;
	}

	public void setNivelFuel2(double nivelFuel2) {
		this.nivelFuel2 = nivelFuel2;
	}

	public double getNivelAdBlue() {
		return nivelAdBlue;
	}

	public void setNivelAdBlue(double nivelAdBlue) {
		this.nivelAdBlue = nivelAdBlue;
	}

	public Timestamp getFechaECU() {
		return fechaECU;
	}

	public void setFechaECU(Timestamp fechaECU) {
		this.fechaECU = fechaECU;
	}

	public Timestamp getFechaServidor() {
		return fechaServidor;
	}

	public void setFechaServidor(Timestamp fechaServidor) {
		this.fechaServidor = fechaServidor;
	}

	public String getFechaECUPorMinuto() {
		return fechaECUPorMinuto;
	}

	public void setFechaECUPorMinuto(String fechaECUPorMinuto) {
		this.fechaECUPorMinuto = fechaECUPorMinuto;
	}

	public int getIdRecepcion() {
		return idRecepcion;
	}

	public void setIdRecepcion(int idRecepcion) {
		this.idRecepcion = idRecepcion;
	}

	
}
