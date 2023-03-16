package sprint;

public class Administrativo extends Usuario{
	private String experienciaPrevia;
	private String area;
	protected static String[][] contenedor;  // revisar si es usuario o contenedor


	public Administrativo() {
		super();
	}
	
	public Administrativo(String experienciaPrevia, String area) {
		super (nombre, fechaNacimiento, run);
		this.experienciaPrevia = experienciaPrevia;
		this.area = area;
		
		
	}
	
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		if(experienciaPrevia.length() < 100) {
		this.experienciaPrevia = experienciaPrevia;
		}else {
			System.out.println("La experiencia previa no debe exceder los 100 caracteres");
		}
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		if (area.length() > 5 && area.length() <20) {
			this.area = area;
		}else {
			System.out.println("Ingrese un area valida");
		}
	}

	@Override
	public String analizarUsuario() {
		return "El administrativo " + super.analizarUsuario() + " su experiencia es " + experienciaPrevia + " y pertenece al area " + area;
		
	}
}
