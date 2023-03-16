package sprint;

import java.util.ArrayList;
import java.util.List;

public class Capacitacion {

	private List<Capacitacion> capacitaciones = new ArrayList<Capacitacion>();
	private Integer idCapacitacion;
	Cliente run;
	private String dia;
	private Integer hora;
	private String lugar;
	private String duracion;
	private Integer cantAsistentes;

	public Capacitacion(int idCapacitacion, Integer run, String dia, int hora, String lugar, String duracion,
			int cantAsistentes) {
		this.idCapacitacion = idCapacitacion;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantAsistentes = cantAsistentes;
		Cliente.run = run;
	}

	public Capacitacion() {
	}

	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(Integer idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		System.out.println("Ingrese un dia de la semana");
		if (dia.length() >= 5 && dia.length() <= 7) {
			this.dia = dia;
		}
	}

	public int getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		do {
			System.out.println("Ingrese un lugar de capacitacion");
			if (lugar.length() > 10 && lugar.length() <= 50) {
				this.lugar = lugar;
			} else {
				System.out.println();
			}
		} while (lugar.isEmpty());
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

	public void setCantAsistentes(Integer cantAsistentes) {
		do {
			System.out.println("Ingrese la cantidad de asistentes");
			if (cantAsistentes < 1000) {
				this.cantAsistentes = cantAsistentes;
			} else {System.out.println("Campo vacio");
			}
		} while (cantAsistentes == null);
	}

	public void agregarCapacitacion(Capacitacion c) {
		capacitaciones.add(c);
	}

	public void clientesCapacitacion() {
		for (Capacitacion c : capacitaciones) {
			c.mostrarDetalle();
		}

	}

	public String mostrarDetalle() {
		return "La capacitacion sera en " + lugar + " a las " + hora + " del dia " + dia + ", y durara " + duracion
				+ " minutos";
	}

	@Override
	public String toString() {
		return "Rut Cliente: " + Cliente.run + "\n" + mostrarDetalle();

	}

}
