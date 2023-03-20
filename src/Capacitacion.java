package sprintCapacitacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Capacitacion {

	private Integer idCapacitacion;
	private Long runClienteCapa; // revisar nombre
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private Integer cantAsistentes;
	Scanner sc = new Scanner(System.in);

	/**
	 * metodo constructor con parametros
	 * @param idCapacitacion
	 * @param runClienteCapa
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param duracion
	 * @param cantAsistentes
	 */
	public Capacitacion(int idCapacitacion, Long runClienteCapa, String dia, String hora, String lugar, String duracion,
			int cantAsistentes) {
		this.idCapacitacion = idCapacitacion;
		this.runClienteCapa = runClienteCapa;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantAsistentes = cantAsistentes;
	}

	/**
	 * metodo constructor sin parametros
	 */
	public Capacitacion() {
	}

	/**
	 * retorna la ID de la capacication
	 * @return idCapacitacion
	 */
	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	/**
	 * establece que la ID de la capacitacion no este vacia
	 * @param idCapacitacion
	 */
	public void setIdCapacitacion(Integer idCapacitacion) {
		do {
			if (idCapacitacion != null) {
				this.idCapacitacion = idCapacitacion;
			}
		} while (idCapacitacion == null);
	}

	/**
	 * retorna el run del cliente de la capacitacion
	 * @return runClienteCapa
	 */
	public Long getRunClienteCapa() {
		return runClienteCapa;
	}

	/**
	 * Establece el run del cliente de la capacitacion
	 * @param runClienteCapa
	 */
	public void setRun(Long runClienteCapa) {
		this.runClienteCapa = runClienteCapa;
	}

	/**
	 * 	retorna el dia de la capacitacion
	 * @return
	 */
	public String getDia() {
		return dia;
	}

	/**
	 * establece que el dia de la capacitacion tenga un largo entre 5 y 7 caracteres
	 * @param dia
	 */
	public void setDia(String dia) {

		if (dia.length() >= 5 && dia.length() <= 7) {
			this.dia = dia;
		}else
			System.out.println("Ingrese un dia de la semana valido, la próxima vez");
	}

	/**
	 * retorna la hora de la capacitacion
	 * @return hora
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * Establece que la hora de la capacitacion este en formato hh:mm
	 * @param hora
	 */
	public void setHora(String hora) {
		String regex = "^(0?[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
		if (hora.matches(regex)) {
			this.hora = hora;
		} else {
			System.out.println("La hora introducida debe estar en el siguiente formato: HH:MM, intentelo en otra ocasión");
		}
	}

	/**
	 * retorna el lugar de la capacitacion
	 * @return
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * establece que el lugar de la capacitacion tenga un largo entre 10 y 50 caracteres
	 * @param lugar
	 */
	public void setLugar(String lugar) {
		do {
			if (lugar.length() >=10 && lugar.length() <= 50){
				this.lugar = lugar;
				break;
			}  else {
				System.out.println("Ingrese un lugar de capacitación mayor de 10 caracteres y menor de 50 caracteres");
				lugar = sc.nextLine();

			} 
		} while (true);
	}

	/**
	 * retorna la duracion de la capacitacion
	 * @return
	 */
	public String getDuracion() {
		return duracion;
	}

	/**
	 * establece que la duracion de la capacitacion debe ser menor o igual a 70
	 * @param duracion
	 */
	public void setDuracion(String duracion) {
		if (duracion.length() <= 70) {
			this.duracion = duracion;
		}
	}

	/**
	 * retorna la cantidad de asistentes a la capacitacion
	 * @return cantAsistentes
	 */
	public int getCantAsistentes() {
		return cantAsistentes;
	}

	/**
	 * establece que la cantidad de asistentes a la capacitacion sea menor a 1000
	 * @param cantAsistentes
	 */
	public void setCantAsistentes(Integer cantAsistentes) {
		do {
		if (cantAsistentes > 1000) {
			System.out.println("Ingrese la cantidad de asistentes");
			cantAsistentes = Integer.parseInt(sc.nextLine());
		}else if (cantAsistentes < 1001) {
				this.cantAsistentes = cantAsistentes;
				break;
		}
		} while (true);
	}

	/**
	 * metodo que retorna el detalle de la capacitacion
	 * @return
	 */
	public String mostrarDetalle() {
		return "La capacitación que sera en " + lugar + " a las " + hora + " del dia " + dia + ", y tendrá una duración de " + duracion;

	}

	@Override
	public String toString() {
		return " El Usuario cuyo rut es: " + runClienteCapa + " asistirá a " +  mostrarDetalle() + "\n y asistirán : " + cantAsistentes + " asistentes";

	}

}
