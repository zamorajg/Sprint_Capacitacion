package sprint;

public class Administrativo extends Usuario{
	private String experienciaPrevia;
	private String area;
	protected static String[][] contenedor;  // revisar si es usuario o contenedor


	public Administrativo() {
		super();
	}
	
	public Administrativo(String nombre, String fechaNacimiento, Long run, String experienciaPrevia, String area) {
		super (nombre, fechaNacimiento, run);
		this.experienciaPrevia = experienciaPrevia;
		this.area = area;
		
		
	}
	
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		if(experienciaPrevia.length() < 101) {
		this.experienciaPrevia = experienciaPrevia;
		}else {
			System.out.println("La experiencia previa no debe exceder los 100 caracteres");
		}
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		do {
		if (area.length() > 4 && area.length() <21) {
			this.area = area;
		}else {
			System.out.println("Ingrese un area valida");
		} 
	} while (area == null);
	}

	@Override
	public String analizarUsuario() {
		return "El administrativo " + super.analizarUsuario() + " su experiencia es " + experienciaPrevia + " y pertenece al area " + area;
		
	}
	@Override
	public String toString() {
		return "Administrativo [getExperienciaPrevia()=" + getExperienciaPrevia() + ", getArea()=" + getArea()
				+ ", analizarUsuario()=" + analizarUsuario() + "]";
	}
}
