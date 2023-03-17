package sprint;

public class Profesional extends Usuario {
	private String titulo;
	private String fechaIngreso;
	protected static String[][] contenedor; // revisar si es contenedor o usuario

	public Profesional(){
		super();
	}
	public Profesional(String nombre, String fechaNacimiento, Integer run, String titulo, String fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;		
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		do {
			if (titulo.length() > 9 && titulo.length() < 51 ) {
				this.titulo = titulo;
			}else {
				System.out.println("El titulo ingresado debe tener al menos 10 caracteres");
		}
		} while (titulo.length() < 10 || titulo.length() >50 || titulo == null);
	}
	
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	
	public void setFechaIngreso(String fechaIngreso) {
		
        String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";

        if (fechaIngreso.matches(regex)) {
        	this.fechaIngreso = fechaIngreso;
        }
        else {
            System.out.println("La fecha no es valida, debe ingresarla en este formato DD/MM/AAAA");
        }
	}

	@Override
	public String analizarUsuario() {
		return "El profesional " + super.analizarUsuario() + " posee el titulo de " + titulo + " y su fecha de ingreso es " + fechaIngreso;
		
	}

}
