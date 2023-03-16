package sprint;

import java.text.SimpleDateFormat;

public class Accidente {
	private Integer idAccidente;
	Usuario run;
	private String fecha;
	int hora;
	private String lugar;
	private String origen;
	private String consecuencias;

	public Accidente(Integer idAccidente, int run, String fecha, int hora, String lugar, String origen,
			String consecuencias) {
		this.idAccidente = idAccidente;
		Usuario.run = run;
		this.fecha = fecha;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}

	public int getIdAccidente() {
		return idAccidente;
	}

	public void setIdAccidente(Integer idAccidente) {
		if (idAccidente != null) {
			this.idAccidente = idAccidente;
		} else {
			System.out.println("Ingrese un identificador valido");
		}
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		if (lugar.length() > 10 && lugar.length() <= 50) {
			this.lugar = lugar;
		} else {
			System.out.println("Ingrese un lugar de accidente");
		}
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		if (origen.length() <= 100) {
			this.origen = origen;
		}
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		if (consecuencias.length() <= 100) {
			this.consecuencias = consecuencias;
		}
	}

	public String fecha() {
		return (new SimpleDateFormat("dd/MM/yyyy").format(fecha));
	}
}
