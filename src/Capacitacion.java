package sprint;

import java.text.SimpleDateFormat;

public class Capacitacion {

	int idCapacitacion;
	Usuario run;
	String dia;
	int hora;
	String lugar;
	String duracion;
	int cantAsistentes;

	public Capacitacion(int idCapacitacion, int run, String dia, int hora, String lugar, String duracion,
			int cantAsistentes) {
		this.idCapacitacion = idCapacitacion;
		Usuario.run = run;
	}

	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		if (dia.length() >= 5 && dia.length() <= 7) {
			this.dia = dia;
		}
	}

	public String getHora() {
		return (new SimpleDateFormat("HH:MM").format(hora));
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
			System.out.println("Ingrese un lugar de capacitacion");
		}
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		if (duracion.length() <= 70) {
			this.duracion = duracion;
		}
	}

	public int getCantAsistentes() {
		return cantAsistentes;
	}

	public void setCantAsistentes(int cantAsistentes) {
		if (cantAsistentes < 1000) {
			this.cantAsistentes = cantAsistentes;
		}else {
			System.out.println("Ingrese la cantidad de asistentes");
		}
	}

	public String mostrarDetalle() {
		return "La capacitación será en " + lugar + " a las " + hora + " del día " + dia + ", y durará " + duracion
				+ " minutos";
	}

}
