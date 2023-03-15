package Sprint;

/**
 * @Definicion: Clase que registra los Administrativos que heredan de la Clase Usuario
 * @author Grupo Java (Jose Zamora, Benjamin Paez, Maria Fernanda Zuñiga, Javiera Saavedra)
 *
 */
public class Administrativo extends Usuario{
	private String experienciaPrevia;
	private String area;
	
	public Administrativo() {
		super();
	}
	
	public Administrativo(String experienciaPrevia, String area) {
		super (nombre, fechaNacimiento, run);
		this.experienciaPrevia = experienciaPrevia;
		this.area = area;
		
		
	}
	/**
	 * devuelve la experiencia previa, de maximo 100 caracteres
	 * @return ExperienciaPrevia
	 */
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}
	/**
	 * establece la experiencia previa
	 * @param experienciaPrevia
	 */
	public void setExperienciaPrevia(String experienciaPrevia) {
		if(experienciaPrevia.length() < 100) {
		this.experienciaPrevia = experienciaPrevia;
		}else {
			System.out.println("La experiencia previa no debe exceder los 100 caracteres");
		}
	}
	/**
	 * devuelve area de caracter obligatorio con un minimo de 5 caracteres y un maximo de 20
	 * @return area
	 */
	public String getArea() {
		return area;
	}
	/** 
	 * establece area
	 * @param area
	 */
	public void setArea(String area) {
		if (area.length() > 5 && area.length() <20) {
			this.area = area;
		}else {
			System.out.println("Ingrese un area valida");
		}
	}

	/**
	 * una cadena con todos los datos de Administrativo
	 */
	@Override
	public String analizarUsuario() {
		return "El administrativo " + super.analizarUsuario() + " su experiencia es " + experienciaPrevia + " y pertenece al area " + area;
		
	}
}
