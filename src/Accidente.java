package sprintCapacitacion;

public class Accidente {
	private Integer idAccidente;
	private Long run;
	private String fecha;
	private Integer hora;
	private String lugar;
	private String origen;
	private String consecuencias;

	/**
	 * Metodo constructor vacio
	 */
	public Accidente() {

	}

	/**
	 * Metodo constructor con parametros
	 * @param idAccidente
	 * @param run
	 * @param fecha
	 * @param hora
	 * @param lugar
	 * @param origen
	 * @param consecuencias
	 */
	public Accidente(Integer idAccidente, Long run, String fecha, Integer hora, String lugar, String origen,
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
	 * Retorna la ID del accidente
	 * @return idAccidente
	 */
	public int getIdAccidente() {
		return idAccidente;
	}

	/**
	 * Establece que la ID del accidente no puede ir vacio
	 * @param idAccidente
	 */
	public void setIdAccidente(Integer idAccidente) {
		if (idAccidente != null) {
			this.idAccidente = idAccidente;
		} else {
			System.out.println("Ingrese un identificador valido");
		}
	}

	/**
	 * Retorna la fecha del accidente
	 * @return fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * Establece que la fecha tenga un formato DD/MM/AA
	 * @param fecha
	 */
    public void Fecha(String fecha) {
    	String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";
		do {
			if (fecha.matches(regex)) {
				this.fecha = fecha;
			} else {
				System.out.println("La fecha no es valida");
			}
		} while (!fecha.matches(regex));

    }

    /**
     * Retorna la hora del accidente
     * @return hora
     */
	public int getHora() {
		return hora;
	}

	/**
	 * Establece la hora del accidente
	 * @param hora
	 */
	public void setHora(Integer hora) {
		this.hora = hora;
	}

	/**
	 * Retorna el lugar del accidente
	 * @return lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * Establece que el lugar del accidente tenga un largo entre 10 y 50 caracteres
	 * @param lugar
	 */
	public void setLugar(String lugar) {
		do {
			if (lugar.length() > 10 && lugar.length() <= 50) {
				this.lugar = lugar;
			} else {
				System.out.println("Ingrese un lugar de accidente");
			}
		} while (lugar.isEmpty());
	}

	/**
	 * Retorna el origen del accidente
	 * @return origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * Establece que el origen del accidente tenga un largo menor o igual a 100 caracteres
	 * @param origen
	 */
	public void setOrigen(String origen) {
		if (origen.length() <= 100) {
			this.origen = origen;
		}
	}

	/**
	 * Retorna las consecuencias del accidente
	 * @return consecuencias
	 */
	public String getConsecuencias() {
		return consecuencias;
	}

	/**
	 * Establece que las consecuencias del accidente tengan un largo menor o igual a 100 caracteres
	 * @param consecuencias
	 */
	public void setConsecuencias(String consecuencias) {
		if (consecuencias.length() <= 100) {
			this.consecuencias = consecuencias;
		}
	}

	@Override
	public String toString() {
		return "Rut cliente: " + run + "\nFecha accidente: " + fecha + "\nHora: " + hora + "\nLugar: " + lugar
				+ "\nOrigen: " + origen + "\nConsecuencias: " + consecuencias;
	}

}
