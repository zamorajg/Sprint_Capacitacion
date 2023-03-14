package sprintCapacitacion;




        /**
        * @Definicion: Clase que registra los Clientes que heredan de la Clase Usuario
        * @Version: 1.0
        * @Autor: Grupo Java (Jose Zamora, Benjamin, Fernanda, Javiera)
        *
        */
public class Cliente extends Usuario{

    private String nombre; //nombres que identifica al cliente que recibira la capacitación
    private String apellidos; //Apellido que identifica al cliente que recibira la capacitación
    private String telefono;//Teléfono de contacto del cliente que recibira la capacitacion
    private String afp; //Seguro de Jubilación con la que cuenta el cliente de la capacitación
    private int sistemaSalud;//Sistema de Salud con la que cuenta el Cliente 1 (Fonasa) o 2 Isapre
    private String direccion; //dirección del cliente que recibe la capacitación
    private String comuna; //comuna donde esta ubicado el Cliente
    private int edad; //edad del cliente que recibira la capacitación
    private String rut; //edad del cliente que recibira la capacitación

            /**
             * @Definicion: Constructor de la clase Cliente, conformado por los datos de la superClase usuario
             * @param nombreUsuario
             * @param fechaNacimiento
             * @param nombre
             * @param apellidos
             * @param rut
             * @param telefono
             * @param afp
             * @param sistemaSalud
             * @param direccion
             * @param comuna
             * @param edad
             */
    public Cliente(String nombreUsuario, String fechaNacimiento,  String nombre, String apellidos, String rut, String telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
        super(nombreUsuario, fechaNacimiento,rut);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.rut = rut;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    /**
     * devuelve nombre con minimo 5 caracteres y maximo de 30
     * @return Nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * establece nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * devuelve Apellidos, con un minimo de 5 caracteres y un maximo de 30
     * @return apellidos
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * establece apellidos
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * devuelve telefono, obligatorio
     * @return telefono
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * establece telefono
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     * devuelve Afp, minimo 4 caracteres y maximo 30
     * @return afp
     */
    public String getAfp() {
        return afp;
    }
    /**
     * establece afp
     * @param afp
     */
    public void setAfp(String afp) {
        this.afp = afp;
    }
    /**
     * devuelve sistema de salud, 1 siendo fonasa y 2 isapre
     * @return sistemaSalud
     */
    public int getSistemaSalud() {
        return sistemaSalud;
    }
    /**
     * establece sistema de salud
     * @param sistemaSalud
     */
    public void setSistemaSalud(int sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }
    /**
     * devuelve direccion, con un maximo de 70 caracteres
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * establece direccion
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * devuelve comuna con un maximo de 50 caracteres
     * @return comuna
     */
    public String getComuna() {
        return comuna;
    }
    /**
     * establece comuna
     * @param comuna
     */
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
    /**
     * devuelve edad, de caracter obligatorio con un numero entero
     * mayor o igual a 0 y menor que 150
     * @return edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * establece edad
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return Una cadena con todos los datos del Cliente
     */
    @Override
    public String analizarUsuario() {

        return "Los datos del Usuario del tipo Cliente son: "+ super.analizarUsuario() + ", nombres: " + nombre + ", apellidos: " +apellidos + ", rut: " + rut
                + ", telefono: " + telefono + ", afp: " + afp + ", sistema de salud: "+ afp + ", dirección: " + direccion
                + ", comuna: " + comuna + ", edad: "+ edad;
    }
}
