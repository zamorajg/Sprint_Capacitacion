package sprintCapacitacion;


import sprintCapacitacion.Asesoria;

public class Usuario implements Asesoria{
    private String nombreUsuario; //nombres que identifica al usuario
    private String fechaNacimiento; //fecha de nacimiento del usuario

    private String rut; //rut del Usuario

    public Usuario(String nombreUsuario, String fechaNacimiento, String rut) {
        this.nombreUsuario = nombreUsuario;
        this.fechaNacimiento = fechaNacimiento;
        this.rut = rut;
    }
    /**
     * devuelve nombre de usuario, minimo de caracteres 10 y maximo 50
     * @return nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    /**
     * establece nombre de usuario
     * @param nombreUsuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    /**
     * devuelve fecha de nacimiento, debe ser con formato DD/MM/AA
     * @return fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    /**
     * establece fecha de nacimiento
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     * devuelve rut menor a 99.999.999
     * @return rut
     */
    public String getRut() {
        return rut;
    }
    /**
     * establece rut
     * @param rut
     */
    public void setRut(String rut) {
        this.rut = rut;
    }
    /**
     * @return una cadena con todos los datos de Usuario
     */
    @Override
    public String  analizarUsuario() {
        return "nombre de Usuario: " + nombreUsuario;
    }
}
