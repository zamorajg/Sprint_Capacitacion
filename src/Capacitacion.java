package sprint;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Capacitacion {

	private List<Cliente> clienteCapacitacion = new ArrayList<Cliente>();
	private Integer idCapacitacion;
	private Integer run;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private Integer cantAsistentes;
	Scanner sc = new Scanner(System.in);

	public Capacitacion(int idCapacitacion, Integer run, String dia, String hora, String lugar, String duracion,
			int cantAsistentes) {
		this.idCapacitacion = idCapacitacion;
		this.run = run;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantAsistentes = cantAsistentes;
	}

	public Capacitacion() {
	}

	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(Integer idCapacitacion) {
		do {
			if (idCapacitacion != null) {
				this.idCapacitacion = idCapacitacion;
			}
		} while (idCapacitacion == null);
	}

	public Integer getRun() {
		return run;
	}

	public void setRun(Integer run) {
		this.run = run;
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

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		String regex = "^(0?[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
		if (hora.matches(regex)) {
			this.hora = hora;
		} else {
			System.out.println("La hora introducida debe estar en el siguiente formato: HH:MM");
		}
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		do {
			if (lugar.length() <10 && lugar.length() > 50){
			System.out.println("Ingrese un lugar de capacitacion");
			lugar = sc.nextLine();
		}  else if (lugar.length() > 9 && lugar.length() <= 50) {
				this.lugar = lugar;
			} 
		} while (lugar.length() <10 || lugar.length() > 50 ||lugar.isEmpty());
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
		if (cantAsistentes > 1000) {
			System.out.println("Ingrese la cantidad de asistentes");
			cantAsistentes = Integer.parseInt(sc.nextLine());
		}else if (cantAsistentes < 1001) {
				this.cantAsistentes = cantAsistentes;
		}
		} while (cantAsistentes == null);
	}

	public void agregarCapacitacion(Cliente c) {
		clienteCapacitacion.add(c);
	}

	public void clientesCapacitacion() {
		for (Cliente c : clienteCapacitacion) {
			c.analizarUsuario();
		}

	}

	public String mostrarDetalle() {
		return "La capacitacion sera en " + lugar + " a las " + hora + " del dia " + dia + ", y durara " + duracion
				+ " minutos";
	}

	@Override
	public String toString() {
		return "Rut Cliente: " + run + "\n" + mostrarDetalle() + "\nCantidad de asistentes: " + cantAsistentes + "asistentes.";

	}

}
