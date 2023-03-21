package sprintJavaFinal;


import java.util.Scanner;

/**
 * Clase que registra el personal administrativo de la compañia  esta clase hereda de la clase Usuario
 * y está compuesta de los siguientes atributos:
 * - Área: obligatorio, mínimo 5 caracteres, máximo 20
 * - Experiencia previa: máximo 100 caracteres
 */
public class Administrativo extends Usuario{
	private String experienciaPrevia;
	private String area;


	Scanner sc = new Scanner(System.in);



	/**
	 * Constructor de la clase administrativo que recibe los datos del Objeto padre
	 * @param usuario
	 */
	public Administrativo(Usuario usuario) {
		super(usuario.getNombreUsuario(), usuario.getFechaNacimientoUsuario(), usuario.getRunUsuario());
	}

	/**
	 * Constructor de la clase administrativo que recibe los datos del Objeto padre, mas los atributos que la componen
	 * @param nombre
	 * @param fechaNacimiento
	 * @param run
	 * @param experienciaPrevia
	 * @param area
	 */
	public Administrativo(String nombre, String fechaNacimiento, Long run, String experienciaPrevia, String area) {
		super (nombre, fechaNacimiento, run);
		this.experienciaPrevia = experienciaPrevia;
		this.area = area;
		
		
	}
	/**
	 * Método que retorna la experiencia Previa que tuvo el administrativo
	 * @return experienciaPrevia
	 */
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}
	/**
	 * Método que establece la experiencia Previa que tuvo el administrativo
	 */
	public void setExperienciaPrevia(String experienciaPrevia) {
		do {
			if (experienciaPrevia.length() <= 100) {
				this.experienciaPrevia = experienciaPrevia;
				break;
			} else {
				System.out.println("La experiencia previa no debe exceder los 100 caracteres");
				experienciaPrevia = sc.nextLine();
			}
		}while(true);
	}
	/**
	 * Método que retorna el área de trabajo del administrativo
	 * @return experienciaPrevia
	 */
	public String getArea() {
		return area;
	}

	/**
	 * Método que establece el área de trabajo del administrativo
	 * @param area
	 */
	public void setArea(String area) {
		do {
			if (area.length() >= 5 && area.length() <=20) {
				this.area = area;
				break;
			}else {
				System.out.println("Ingrese un area mayor que 4 y menor que 20 caracteres");
				area = sc.nextLine();
			}
		} while (true);
	}
	/**
 	* Método sobreescrito que retorna una cadena, con los atributos que la componen, incluyendo el mismo
	 * metodo de la clase de la cual hereda
 	* @return return "El administrativo tiene una experiencia=" + experienciaPrevia + " y pertenece al area " + area +  super.analizarUsuario();
	*/
	@Override
	public String analizarUsuario() {
		return "El administrativo tiene una experiencia: " + experienciaPrevia + " y pertenece al area " + area
				+ super.analizarUsuario();

	}

	/**
	 * Método sobreescrito que retorna una cadena, con cada uno de los atributos que la componen
	 * @return
	 */
	@Override
	public String toString() {
		return "Administrativo: " + super.toString() + "\nExperiencia previa: " + getExperienciaPrevia() + "\nArea: "
				+ area;
	}

}
