package sprint;

public class Accidente {
	private Integer idAccidente;
	private Cliente cliente;
	private String fecha;
	private String hora;
	private String lugar;
	private String origen;
	private String consecuencias;
	private static int idAccidentes;
	
	
	public Accidente() {
		++idAccidentes;
		this.idAccidentes = idAccidentes;
	}

	public Accidente(Integer idAccidente, Cliente cliente, String fecha, String hora, String lugar, String origen,
			String consecuencias) {
		
		++idAccidentes;
		this.idAccidente = idAccidente;
		this.cliente = cliente;
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
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		do {
			if (cliente.getRun() <= 99999999) {
				this.cliente = cliente;
				break;
			} else {
				System.out.println("");
			}
		} while (cliente.getRun() > 99999999);
	}

	public String getFecha() {
		return fecha;
	}

    public void Fecha(String fecha) {
    	String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";
		do {
			if (fecha.matches(regex)) {
				this.fecha = fecha;
				break;
			} else {
				System.out.println("La fecha no es valida");
			}
		} while (!fecha.matches(regex));

    }

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		String regex = "^(0?[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
		do {
			if (hora.matches(regex)) {
				this.hora = hora;
				break;
			} else {
				System.out.println("La hora no es valida");
			}
		} while (!hora.matches(regex));
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		do {
			if (lugar.length() > 10 && lugar.length() <= 50) {
				this.lugar = lugar;
			} else {
				System.out.println("Ingrese un lugar de accidente");
			}
		} while (lugar.isEmpty());
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
		do {
			if (consecuencias.length() > 100) {
				System.out.println("No puede ingresar mas de 100 caracteres");
			}
			if (consecuencias.length() <= 100) {
				this.consecuencias = consecuencias;
			} else {
							}
		} while (true);

	}

	@Override
	public String toString() {
		return "Rut cliente: " + cliente + "\nFecha accidente: " + fecha + "\nHora: " + hora + "\nLugar: " + lugar
				+ "\nOrigen: " + origen + "\nConsecuencias: " + consecuencias;
	}

}
