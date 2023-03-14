package sprintCapacitacion;



/**
 * @Definicion: Clase que registra los Profesionales que heredan de la Clase Usuario
 * @Version: 1.0
 * @Autor: Grupo Java (Jose Zamora, Benjamin, Fernanda, Javiera)
 *
 */
public class Profesional extends Usuario{
    private String titulo;
    private String fechaIngreso;

    /**
     * @Definicion: Constructor de la Clase profesional que instancia la clase super que hereda de la clase Usuario
     * @param nombreUsuario
     * @param fechaNacimiento
     * @param rut
     * @param titulo
     * @param fecha
     */
    public Profesional(String nombreUsuario, String fechaNacimiento,String rut, String titulo, String fecha) {
        super(nombreUsuario, fechaNacimiento,rut);
        this.titulo = titulo;
        this.fechaIngreso = fecha;
    }
    /**
     * devuelve titulode caracter obligatorio,
     * debe tener un minimo de 10 caracteres y un maximo de 50
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * establece titulo
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * devuelve fecha de ingreso debe ser con formato DD/MM/AA
     * @return fechaIngreso
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    /**
     * establece fecha de ingreso
     * @param fechaIn
     */
    public void setFechaIngreso(String fechaIn) {
        this.fechaIngreso = fechaIn;
    }

    /**
     * @return Una cadena con todos los datos del Usuario
     */
    @Override
    public String analizarUsuario() {

         return "Los datos del Usuario  del tipo Profesional son: "+ super.analizarUsuario() +" Titulo: " + titulo + ", Fecha de Ingreso: "+ fechaIngreso;
    }
}
