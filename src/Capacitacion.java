package sprintJavaFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que registra las capacitaciones a las cuales asistirán cada uno de los clientes y dispone de
 * los siguientes atributos:
 * - Identificador: obligatorio, número interno de la capacitación manejado
 * - por la empresa
 * - RUT cliente: obligatorio
 * - Día: texto, día de la semana. Debe ser un valor permitido entre “lunes” y
 *   “Domingo”(en ese formato)
 * - Hora: debe ser una hora válida del día, en formato HH:MM (hora desde
 *   0 a23, minutos entre 0 y 59)
 * - Lugar: obligatorio, mínimo 10 caracteres, máximo 50
 * - Duración: máximo 70 caracteres
 * - Cantidad de asistentes: obligatorio, número entero menor que 1000
 */
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
	 * Constructor de la clase Capacitacion que recibe todos los parametros
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
	 * Constructor de la clase Capacitación que no recibe parametros
	 */
	public Capacitacion() {
	}
	/**
	 * Método que retorna el idCapacitacion
	 * @return idAccidente
	 */
	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	/**
	 * Metodo que establece el idCapacitacion, se genera de manera interna a través de una variable estática
	 * declarada en el MenuPrincipal, por lo que ya viene validada
	 * @param idCapacitacion
	 */
	public void setIdCapacitacion(Integer idCapacitacion) {	this.idCapacitacion = idCapacitacion;}

	/**
	 * Método que retorna el Rut del Cliente
	 * @return run
	 */
	public Long getRunClienteCapa() {
		return runClienteCapa;
	}
	/**
	 * Método que establece el Rut del Cliente que recibirá la capacitación
	 * debo considerar que el rut que reciba solo sea de la clase cliente
	 */
	public void setRun(Long runClienteCapa) {
		this.runClienteCapa = runClienteCapa;
	}

	/**
	 * Método que retorna el dia de la capacitación
	 * @return dia
	 */
	public String getDia() {
		return dia;
	}
	/**
	 * Método que establece Día: texto, día de la semana. Debe ser un valor permitido entre “lunes” y
	 * “Domingo”(en ese formato)
	 */
	public void setDia(String dia) {
		do {
			if (dia.length() >= 5 && dia.length() <= 7) {
				this.dia = dia;
				break;
			} else
				System.out.println("Ingrese un dia de la semana válido.");
				dia = sc.nextLine();
		}while(dia.length() >= 5 && dia.length() <= 7);
	}

	/**
	 * Método que retorna la Hora de la Capacitación
	 * @return hora
	 */
	public String getHora() {
		return hora;
	}
	/**
	 * Método que establece de la hora  Capacitación
	 */
	public void setHora(String hora) {
		do {
			String regex = "^(0?[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";//formato regular para el formato HH:MM
			if (hora.matches(regex)) {
				this.hora = hora;
				break;
			} else {
				System.out.println("La hora introducida debe estar en el siguiente formato: HH:MM");
				hora = sc.nextLine();

			}
		}while(true);
	}

	/**
	 * Método que retorna el lugar de la Capacitación
	 * @return lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * Método que establece el lugar de la capacitación
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
		} while (lugar.length()==0);
	}

	/**
	 * Método que retorna la duración de la capacitación
	 * @return duracion
	 */
	public String getDuracion() {
		return duracion;
	}

	/**
	 * Método que establece la duración de la capacitación
	 */
	public void setDuracion(String duracion) {
		do {
			if (duracion.length() <= 70) {
				this.duracion = duracion;
				break;
			}else{
				System.out.println("La duración debe ser menor de 70 caracteres");
				duracion = sc.nextLine();
			}
		}while(duracion.length()==0);
	}
	/**
	 * Método que retorna la cantidad de Asistentes de la capacitación
	 * @return cantAsistentes
	 */
	public int getCantAsistentes() {
		return cantAsistentes;
	}
	/**
	 * Método que establece los Asistentes de la capacitación
	 */
	public void setCantAsistentes(Integer cantAsistentes) {
		do {
			if (cantAsistentes > 1000) {
				System.out.println("La cantidad de asistentes, no debe exceder de 1000 asistentes ");
				cantAsistentes = Integer.parseInt(sc.nextLine());
			}else if (cantAsistentes <= 1000) {
					this.cantAsistentes = cantAsistentes;
					break;
			}
		} while (true);
	}

	/**
	 * Método que retorna que retorna un mensaje con el	 * texto “ La capacitación
	 * será en A a las B del día C, y durará D minutos”, en * donde A es el lugar,B es
	 * la hora, C es el día y D son los minutos.
	 * @return "La capacitación que sera en " + lugar + " a las " + hora + " del dia " + dia + ", tendrá una duración de " + duracion;
	 */
	public String mostrarDetalle() {
		return "La capacitación que sera en " + lugar + " a las " + hora + " del dia " + dia + ", tendrá una duración de " + duracion;

	}
	/**
 	* Método sobreescrito que retorna una cadena, con cada uno de los atributos que la componen
 	* @return " El Usuario cuyo rut es: " + runClienteCapa + " asistirá a " +  mostrarDetalle() + "\n y asistirán : " + cantAsistentes + " asistentes";
	*/
	@Override
	public String toString() {
		return " El Usuario cuyo rut es: " + runClienteCapa + " asistirá a " +  mostrarDetalle() + "\n y asistirán : " + cantAsistentes + " asistentes";

	}

}
