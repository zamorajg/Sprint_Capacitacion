package sprintCapacitacion;



/**
 * @Definicion: Clase que registra los Administrativos que heredan de la Clase Usuario
 * @Version: 1.0
 * @Autor: Grupo Java (Jose Zamora, Benjamin, Fernanda, Javiera)
 *
 */
public class Administrativo extends Usuario{
    private String area;
    private String experienciaPrevia;

    public Administrativo(String nombreUsuario, String fechaNacimiento,String rut, String area, String experienciaPrevia) {
        super(nombreUsuario, fechaNacimiento,rut);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }
    /**
     * devuelve area, de caracter obligatorio con un minimo de 5 caracteres y un maximo de 20
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
        this.area = area;
    }
    /**
     * devuelve experiencia previa, de maximo 100 caracteres
     * @return ExperienciaPrevia
     */
    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }
    /**
     * establece experiencia previa
     * @param experienciaPrevia
     */
    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    /**
     * @return Una cadena con todos los datos del Administrativo
     */
    @Override
    public String analizarUsuario() {
        return "Los datos del Usuario del tipo Administrativo son: "+ super.analizarUsuario() +", area: " + area + ", experiencia previa: " + experienciaPrevia;
    }
}
