package sprint;

import java.util.ArrayList;
import java.util.List;

public class Capacitacion {

	private List<Cliente> clienteCapacitacion = new ArrayList<Cliente>();
	private Integer idCapacitacion;
	Usuario run;
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
		Usuario.run = run;
	}

	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(Integer idCapacitacion) {
		if (idCapacitacion != null) {
			this.idCapacitacion = idCapacitacion;
		} else {
			System.out.println("Ingrese un valor numerico para la id");
		}
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		if (dia.length() >= 5 && dia.length() <= 7) {
			this.dia = dia;
		}else {
			System.out.println("Ingrese un dia de la semana");
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

	public void setCantAsistentes(Integer cantAsistentes) {
		if (cantAsistentes < 1000) {
			this.cantAsistentes = cantAsistentes;
		} else {
			System.out.println("Ingrese la cantidad de asistentes");
		}
	}

	public void agregarCliente(Cliente c) {
		clienteCapacitacion.add(c);
	}

	public void clientesCapacitacion() {
		for (Cliente c : clienteCapacitacion) {
			c.analizarUsuario();
		}
	}

	public String mostrarDetalle() {
		return "La capacitación será en " + lugar + " a las " + hora + " del día " + dia + ", y durará " + duracion
				+ " minutos";
	}

	@Override
	public String toString() {
		return "Rut Cliente: " +run + "/n" + mostrarDetalle();
		
	}
	
}
