package sprintJavaFinal;

import java.util.Scanner;

/**
 * Clase que registra los Accidentes en que haya incurrido un Cliente sus atributos son:
 * Identificador del accidente: obligatorio, número interno manejado por la compañía.
 * - RUT Cliente: obligatorio
 * - Día: fecha del accidente, independiente si lo declara como una fecha o un
 *   String,debe ser desplegado con el formato DD/MM/AAAA
 * - Hora: debe ser una hora válida del día, en formato HH:MM (hora desde
 * 0 a23, minutos entre 0 y 59)
 * - Lugar: obligatorio, mínimo 10 caracteres, máximo 50
 * - Origen: máximo 100 caracteres
 * - Consecuencias: máximo 100 caracteres
 */
public class Accidente {
    private int idAccidente;
	private Long run;
	private String fecha;
	private String hora;
	private String lugar;
	private String origen;
	private String consecuencias;

	Scanner sc = new Scanner(System.in);


	/**
	 * Constructor de la clase accidente que no recibe parametros
	 */
	public Accidente() {

	}

	/**
	 * Constructor de la clase accidente que recibe todos los parámetros de la clase
	 * @param idAccidente
	 * @param run
	 * @param fecha
	 * @param hora
	 * @param lugar
	 * @param origen
	 * @param consecuencias
	 */
	public Accidente(Integer idAccidente, Long run, String fecha, String hora, String lugar, String origen,
			String consecuencias) {
		this.idAccidente = idAccidente;
		this.run = run;
		this.fecha = fecha;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}

	/**
	 * Método que retorna el idAccidente
	 * @return idAccidente
	 */
	public int getIdAccidente() {
		return idAccidente;
	}

	/**
	 * Método que establece el idAccidente, se genera de manera interna a través de una variable estática
	 * declarada en el MenuPrincipal, por lo que ya viene validada
	 * @param idAccidente
	 */
	public void setIdAccidente(Integer idAccidente) {this.idAccidente = idAccidente;}

	/**
	 * Método que retorna el Rut del Cliente
	 * @return run
	 */
	public Long getRun() {
		return run;
	}
	/**
	 * Método que establece el Rut del Cliente, este valor proviene del Cliente que debe
	 * existir y al cual se le agrega el accidente por lo tanto ya viene validado
	 */
	public void setRun(Long run) {
		this.run = run;
	}

	/**
	 * Metodo que retorna la fecha del Accidente
	 * @return fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * Método que establece la fecha del Accidente, en el formato  DD/MM/AAAA
	 */
    public void setFecha(String fecha) {
    	String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";
		do {
			if (fecha.matches(regex)) {
				this.fecha = fecha;
				break;
			} else {
				System.out.println("La fecha no es valida");
				fecha = sc.nextLine();
			}
		} while (!fecha.matches(regex));

    }

	/**
	 * Método que retorna la Hora del Accidente
	 * @return hora
	 */
	public String getHora() {
		return hora;
	}
	/**
	 * Método que establece la Hora del Accidente
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
	 * Método que retorna el lugar  del Accidente
	 * @return lugar
	 */
	public String getLugar() {
		return lugar;
	}
	/**
	 * Método que establece el lugar del Accidente
	 */
	public void setLugar(String lugar) {
		do {
			if (lugar.length() >= 10 && lugar.length() <= 50) {
				this.lugar = lugar;
			} else {
				System.out.println("Ingrese un lugar de accidente");
			}
		} while (lugar.trim().isEmpty());
	}

	/**
	 * Método que retorna el origen  del Accidente
	 * @return origen
	 */
	public String getOrigen() {
		return origen;
	}
	/**
	 * Método que establece el origen del Accidente
	 */
	public void setOrigen(String origen) {
		if (origen.length() <= 100) {
			this.origen = origen;
		}
	}
	/**
	 * Método que retorna las consecuencias del Accidente
	 * @return consecuencias
	 */
	public String getConsecuencias() {
		return consecuencias;
	}
	/**
	 * Método que establece las consecuencias que acarrea el Accidente
	 */
	public void setConsecuencias(String consecuencias) {
		do{
			if (consecuencias.length() >= 100) {
				this.consecuencias = consecuencias;
				break;
			}else{
				System.out.println("Debe introducir menos de 100 caracteres");
				consecuencias = sc.nextLine();
			}
		}while(true);
	}

	/**
	 * Método sobreescrito que retorna una cadena, con cada uno de los atributos que la componen
	 * @return "Detalles del Accidente: Rut cliente: " + run + "\nFecha accidente: " + fecha + "\nHora: " + hora + "\nLugar: " + lugar
	 * 				+ "\nOrigen: " + origen + "\nConsecuencias: " + consecuencias;
	 */
	@Override
	public String toString() {
		return "Detalles del Accidente: Rut cliente: " + run + "\nFecha accidente: " + fecha + "\nHora: " + hora + "\nLugar: " + lugar
				+ "\nOrigen: " + origen + "\nConsecuencias: " + consecuencias;
	}

}
