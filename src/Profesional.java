package sprint;

public class Profesional extends Usuario {
	private String titulo;
	private String fechaIngreso;
	protected static String[][] contenedor; // revisar si es contenedor o usuario

	public Profesional(){
		super();
	}
	public Profesional(String titulo, String fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;		
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		
		this.titulo = titulo;
	}
	
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	
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
