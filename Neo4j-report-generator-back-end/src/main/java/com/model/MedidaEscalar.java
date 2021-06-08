package com.model;

import java.sql.Timestamp;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class MedidaEscalar {
	
	
	@Id @GeneratedValue private Long id;
	private int ecu; 
	private  String idSesion; 
	private double tiempoTotalSesion;
	private double tiempoContacto;
	private double tiempoRalenti;
	private double numeroFrenadas;
	private double usoTomaFuerza;
	private double tiempoExcesoVelocidad;
	private double tiempoControlCrucero;
	private double distanciaInicial;
	private double distanciaRecorridaSesion;
	private double distanciaCalculada;
	private double consumoCombustibleInicial;
	private double consumoCombustibleSesion;
	private double consumoLiquidoCalculado;
	private double consumoLiquidoConduccion;
	private double consumoLiquidoConduccionCalculado;
	private double consumoGaseosoInicial;
	private double consumoGaseosoSesion;
	private double consumoGaseosoCalculado;
	private double consumoGaseosoConduccion;
	private double consumoGaseosoConduccionCalculado; 
	private double horasOperacionInicial;
	private double horasOperacionSesion;
	private double horasOperacionCalculadas;
	private double consumoAdBlueInicial;
	private double consumoAdBlueSesion;
	private double tiempoConduccionPreventiva;
	private double distanciaConduccionPreventiva;
	private double pesoMedioVehiculo;
	private double distanciaFrenado;
	private double distanciaFrenadoEficiente;
	private double velocidadMaxima;
	private double cargaMotorMedia;
	private int estadoTarjetaConductor1;
	private int estadoTarjetaConductor2;
	private int conductorAsignado; 
	private Timestamp fechaUltimoTimeoutCAN;
	private int numTimeoutsCAN; 
	private int idRecepcion;
	private Timestamp fechaECU; 
	private Timestamp fechaServidor;
	
	public MedidaEscalar() {
		super();
	}
	public MedidaEscalar(Long id, int ecu, String idSesion, double tiempoTotalSesion, double tiempoContacto,
			double tiempoRalenti, double numeroFrenadas, double usoTomaFuerza, double tiempoExcesoVelocidad,
			double tiempoControlCrucero, double distanciaInicial, double distanciaRecorridaSesion,
			double distanciaCalculada, double consumoCombustibleInicial, double consumoCombustibleSesion,
			double consumoLiquidoCalculado, double consumoLiquidoConduccion, double consumoLiquidoConduccionCalculado,
			double consumoGaseosoInicial, double consumoGaseosoSesion, double consumoGaseosoCalculado,
			double consumoGaseosoConduccion, double consumoGaseosoConduccionCalculado, double horasOperacionInicial,
			double horasOperacionSesion, double horasOperacionCalculadas, double consumoAdBlueInicial,
			double consumoAdBlueSesion, double tiempoConduccionPreventiva, double distanciaConduccionPreventiva,
			double pesoMedioVehiculo, double distanciaFrenado, double distanciaFrenadoEficiente, double velocidadMaxima,
			double cargaMotorMedia, int estadoTarjetaConductor1, int estadoTarjetaConductor2, int conductorAsignado,
			Timestamp fechaUltimoTimeoutCAN, int numTimeoutsCAN, int idRecepcion, Timestamp fechaECU,
			Timestamp fechaServidor) {
		super();
		this.id = id;
		this.ecu = ecu;
		this.idSesion = idSesion;
		this.tiempoTotalSesion = tiempoTotalSesion;
		this.tiempoContacto = tiempoContacto;
		this.tiempoRalenti = tiempoRalenti;
		this.numeroFrenadas = numeroFrenadas;
		this.usoTomaFuerza = usoTomaFuerza;
		this.tiempoExcesoVelocidad = tiempoExcesoVelocidad;
		this.tiempoControlCrucero = tiempoControlCrucero;
		this.distanciaInicial = distanciaInicial;
		this.distanciaRecorridaSesion = distanciaRecorridaSesion;
		this.distanciaCalculada = distanciaCalculada;
		this.consumoCombustibleInicial = consumoCombustibleInicial;
		this.consumoCombustibleSesion = consumoCombustibleSesion;
		this.consumoLiquidoCalculado = consumoLiquidoCalculado;
		this.consumoLiquidoConduccion = consumoLiquidoConduccion;
		this.consumoLiquidoConduccionCalculado = consumoLiquidoConduccionCalculado;
		this.consumoGaseosoInicial = consumoGaseosoInicial;
		this.consumoGaseosoSesion = consumoGaseosoSesion;
		this.consumoGaseosoCalculado = consumoGaseosoCalculado;
		this.consumoGaseosoConduccion = consumoGaseosoConduccion;
		this.consumoGaseosoConduccionCalculado = consumoGaseosoConduccionCalculado;
		this.horasOperacionInicial = horasOperacionInicial;
		this.horasOperacionSesion = horasOperacionSesion;
		this.horasOperacionCalculadas = horasOperacionCalculadas;
		this.consumoAdBlueInicial = consumoAdBlueInicial;
		this.consumoAdBlueSesion = consumoAdBlueSesion;
		this.tiempoConduccionPreventiva = tiempoConduccionPreventiva;
		this.distanciaConduccionPreventiva = distanciaConduccionPreventiva;
		this.pesoMedioVehiculo = pesoMedioVehiculo;
		this.distanciaFrenado = distanciaFrenado;
		this.distanciaFrenadoEficiente = distanciaFrenadoEficiente;
		this.velocidadMaxima = velocidadMaxima;
		this.cargaMotorMedia = cargaMotorMedia;
		this.estadoTarjetaConductor1 = estadoTarjetaConductor1;
		this.estadoTarjetaConductor2 = estadoTarjetaConductor2;
		this.conductorAsignado = conductorAsignado;
		this.fechaUltimoTimeoutCAN = fechaUltimoTimeoutCAN;
		this.numTimeoutsCAN = numTimeoutsCAN;
		this.idRecepcion = idRecepcion;
		this.fechaECU = fechaECU;
		this.fechaServidor = fechaServidor;
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
	public String getIdSesion() {
		return idSesion;
	}
	public void setIdSesion(String idSesion) {
		this.idSesion = idSesion;
	}
	public double getTiempoTotalSesion() {
		return tiempoTotalSesion;
	}
	public void setTiempoTotalSesion(double tiempoTotalSesion) {
		this.tiempoTotalSesion = tiempoTotalSesion;
	}
	public double getTiempoContacto() {
		return tiempoContacto;
	}
	public void setTiempoContacto(double tiempoContacto) {
		this.tiempoContacto = tiempoContacto;
	}
	public double getTiempoRalenti() {
		return tiempoRalenti;
	}
	public void setTiempoRalenti(double tiempoRalenti) {
		this.tiempoRalenti = tiempoRalenti;
	}
	public double getNumeroFrenadas() {
		return numeroFrenadas;
	}
	public void setNumeroFrenadas(double numeroFrenadas) {
		this.numeroFrenadas = numeroFrenadas;
	}
	public double getUsoTomaFuerza() {
		return usoTomaFuerza;
	}
	public void setUsoTomaFuerza(double usoTomaFuerza) {
		this.usoTomaFuerza = usoTomaFuerza;
	}
	public double getTiempoExcesoVelocidad() {
		return tiempoExcesoVelocidad;
	}
	public void setTiempoExcesoVelocidad(double tiempoExcesoVelocidad) {
		this.tiempoExcesoVelocidad = tiempoExcesoVelocidad;
	}
	public double getTiempoControlCrucero() {
		return tiempoControlCrucero;
	}
	public void setTiempoControlCrucero(double tiempoControlCrucero) {
		this.tiempoControlCrucero = tiempoControlCrucero;
	}
	public double getDistanciaInicial() {
		return distanciaInicial;
	}
	public void setDistanciaInicial(double distanciaInicial) {
		this.distanciaInicial = distanciaInicial;
	}
	public double getDistanciaRecorridaSesion() {
		return distanciaRecorridaSesion;
	}
	public void setDistanciaRecorridaSesion(double distanciaRecorridaSesion) {
		this.distanciaRecorridaSesion = distanciaRecorridaSesion;
	}
	public double getDistanciaCalculada() {
		return distanciaCalculada;
	}
	public void setDistanciaCalculada(double distanciaCalculada) {
		this.distanciaCalculada = distanciaCalculada;
	}
	public double getConsumoCombustibleInicial() {
		return consumoCombustibleInicial;
	}
	public void setConsumoCombustibleInicial(double consumoCombustibleInicial) {
		this.consumoCombustibleInicial = consumoCombustibleInicial;
	}
	public double getConsumoCombustibleSesion() {
		return consumoCombustibleSesion;
	}
	public void setConsumoCombustibleSesion(double consumoCombustibleSesion) {
		this.consumoCombustibleSesion = consumoCombustibleSesion;
	}
	public double getConsumoLiquidoCalculado() {
		return consumoLiquidoCalculado;
	}
	public void setConsumoLiquidoCalculado(double consumoLiquidoCalculado) {
		this.consumoLiquidoCalculado = consumoLiquidoCalculado;
	}
	public double getConsumoLiquidoConduccion() {
		return consumoLiquidoConduccion;
	}
	public void setConsumoLiquidoConduccion(double consumoLiquidoConduccion) {
		this.consumoLiquidoConduccion = consumoLiquidoConduccion;
	}
	public double getConsumoLiquidoConduccionCalculado() {
		return consumoLiquidoConduccionCalculado;
	}
	public void setConsumoLiquidoConduccionCalculado(double consumoLiquidoConduccionCalculado) {
		this.consumoLiquidoConduccionCalculado = consumoLiquidoConduccionCalculado;
	}
	public double getConsumoGaseosoInicial() {
		return consumoGaseosoInicial;
	}
	public void setConsumoGaseosoInicial(double consumoGaseosoInicial) {
		this.consumoGaseosoInicial = consumoGaseosoInicial;
	}
	public double getConsumoGaseosoSesion() {
		return consumoGaseosoSesion;
	}
	public void setConsumoGaseosoSesion(double consumoGaseosoSesion) {
		this.consumoGaseosoSesion = consumoGaseosoSesion;
	}
	public double getConsumoGaseosoCalculado() {
		return consumoGaseosoCalculado;
	}
	public void setConsumoGaseosoCalculado(double consumoGaseosoCalculado) {
		this.consumoGaseosoCalculado = consumoGaseosoCalculado;
	}
	public double getConsumoGaseosoConduccion() {
		return consumoGaseosoConduccion;
	}
	public void setConsumoGaseosoConduccion(double consumoGaseosoConduccion) {
		this.consumoGaseosoConduccion = consumoGaseosoConduccion;
	}
	public double getConsumoGaseosoConduccionCalculado() {
		return consumoGaseosoConduccionCalculado;
	}
	public void setConsumoGaseosoConduccionCalculado(double consumoGaseosoConduccionCalculado) {
		this.consumoGaseosoConduccionCalculado = consumoGaseosoConduccionCalculado;
	}
	public double getHorasOperacionInicial() {
		return horasOperacionInicial;
	}
	public void setHorasOperacionInicial(double horasOperacionInicial) {
		this.horasOperacionInicial = horasOperacionInicial;
	}
	public double getHorasOperacionSesion() {
		return horasOperacionSesion;
	}
	public void setHorasOperacionSesion(double horasOperacionSesion) {
		this.horasOperacionSesion = horasOperacionSesion;
	}
	public double getHorasOperacionCalculadas() {
		return horasOperacionCalculadas;
	}
	public void setHorasOperacionCalculadas(double horasOperacionCalculadas) {
		this.horasOperacionCalculadas = horasOperacionCalculadas;
	}
	public double getConsumoAdBlueInicial() {
		return consumoAdBlueInicial;
	}
	public void setConsumoAdBlueInicial(double consumoAdBlueInicial) {
		this.consumoAdBlueInicial = consumoAdBlueInicial;
	}
	public double getConsumoAdBlueSesion() {
		return consumoAdBlueSesion;
	}
	public void setConsumoAdBlueSesion(double consumoAdBlueSesion) {
		this.consumoAdBlueSesion = consumoAdBlueSesion;
	}
	public double getTiempoConduccionPreventiva() {
		return tiempoConduccionPreventiva;
	}
	public void setTiempoConduccionPreventiva(double tiempoConduccionPreventiva) {
		this.tiempoConduccionPreventiva = tiempoConduccionPreventiva;
	}
	public double getDistanciaConduccionPreventiva() {
		return distanciaConduccionPreventiva;
	}
	public void setDistanciaConduccionPreventiva(double distanciaConduccionPreventiva) {
		this.distanciaConduccionPreventiva = distanciaConduccionPreventiva;
	}
	public double getPesoMedioVehiculo() {
		return pesoMedioVehiculo;
	}
	public void setPesoMedioVehiculo(double pesoMedioVehiculo) {
		this.pesoMedioVehiculo = pesoMedioVehiculo;
	}
	public double getDistanciaFrenado() {
		return distanciaFrenado;
	}
	public void setDistanciaFrenado(double distanciaFrenado) {
		this.distanciaFrenado = distanciaFrenado;
	}
	public double getDistanciaFrenadoEficiente() {
		return distanciaFrenadoEficiente;
	}
	public void setDistanciaFrenadoEficiente(double distanciaFrenadoEficiente) {
		this.distanciaFrenadoEficiente = distanciaFrenadoEficiente;
	}
	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public double getCargaMotorMedia() {
		return cargaMotorMedia;
	}
	public void setCargaMotorMedia(double cargaMotorMedia) {
		this.cargaMotorMedia = cargaMotorMedia;
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
	public int getConductorAsignado() {
		return conductorAsignado;
	}
	public void setConductorAsignado(int conductorAsignado) {
		this.conductorAsignado = conductorAsignado;
	}
	public Timestamp getFechaUltimoTimeoutCAN() {
		return fechaUltimoTimeoutCAN;
	}
	public void setFechaUltimoTimeoutCAN(Timestamp fechaUltimoTimeoutCAN) {
		this.fechaUltimoTimeoutCAN = fechaUltimoTimeoutCAN;
	}
	public int getNumTimeoutsCAN() {
		return numTimeoutsCAN;
	}
	public void setNumTimeoutsCAN(int numTimeoutsCAN) {
		this.numTimeoutsCAN = numTimeoutsCAN;
	}
	public int getIdRecepcion() {
		return idRecepcion;
	}
	public void setIdRecepcion(int idRecepcion) {
		this.idRecepcion = idRecepcion;
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

}
