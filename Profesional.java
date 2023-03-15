package Sprint;

/**
 * @Definicion: Clase que registra los Profesionales que heredan de la Clase Usuario
 * @author Grupo Java (Jose Zamora, Benjamin Paez, Maria Fernanda Zuñiga, Javiera Saavedra)
 *
 */

public class Profesional extends Usuario {
	private String titulo;
	private String fechaIngreso;

	public Profesional(){
		super();
	}
	/**
	 * @Definicion: Construcyot de la clase Profesional que instancia la clase super que hereda de Usuario
	 * @param titulo
	 * @param fechaIngreso
	 */
	public Profesional(String titulo, String fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;		
	}
	/**
	 * Devuelve titulo, de caracter obligatorio, debe tener un minimo de 10 caracteres y un maximo de 50
	 * @return titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * Establace titulo
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		
		this.titulo = titulo;
	}
	/**
	 * devuelve la fecha de ingreso, debe ser en formato DD/MM/AA
	 * @return FechaIngreso
	 */
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	/**
	 * establece la fecha de ingreso
	 * @param fechaIngreso
	 */
	public void setFechaIngreso(String fechaIngreso) {
		
	/*	try {
		    Date myDate = new Date();
		    System.out.println(myDate);

		    SimpleDateFormat dmyFormat = new SimpleDateFormat("dd-MM-yyyy");

		    // Format the date to Strings
		    String dmy = dmyFormat.format(myDate);

		    // Results...
		    System.out.println(dmy);

		    // Parse the Strings back to dates
		    // Note, the formats don't "stick" with the Date value
		    System.out.println(dmyFormat.parse(dmy));

		} catch (ParseException exp) {
		    exp.printStackTrace(); */

		
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String analizarUsuario() {
		return "El profesional " + super.analizarUsuario() + " posee el titulo de " + titulo + " y su fecha de ingreso es " + fechaIngreso;
		
	}

}
