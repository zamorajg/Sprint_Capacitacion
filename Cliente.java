package Sprint;



/**
 * @Definicion: de la Clase: Clase para mantener los Clientes que recibirán los usuarios que se capacitaran
 * @Version: 1.0
 * @Autor: Grupo Java (Jose Zamora, Benjamin, Fernanda, Javiera)
 *
 */


public class Cliente extends Usuario {
    // Creación de los atributos de la Clase Cliente
	private String nombres;
    private String apellidos;
    private int telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;
    //private int cantidadAccidentes;
    
    
	public Cliente(String nombre, String apellidos, int telefono,
    		String afp, int sistemaSalud, String direccion, String comuna, int edad, String String) {
    	super(nombre, fechaNacimiento, run);
    	this.nombres = nombre;
    	this.apellidos = apellidos;
    	this.telefono = telefono;
    	this.afp = afp;
    	this.sistemaSalud = sistemaSalud;
    	this.direccion = direccion;
    	this.comuna = comuna;
    	this.edad = edad;
    }

    public Cliente () {
    	super();
    }
    /**
     * devuelve los nombres del cliente con minimo 5 caracteres y maximo 30
     * @return nombre
     */
    public String getNombres() {
		return nombre;
	}
    /**
     * Establece los nombres del cliente
     * @param nombres
     */
	public void setNombres(String nombres) {
		if (nombres.length() > 5 && nombres.length() < 30 ) {
			this.nombres = nombres;
		} else {
    	    System.out.println("Ingrese un nombre valido");}
	}

	/**
     * Devuelve los apellidos del Cliente.
     *
     * @return los apellidos del Cliente.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos del Cliente.
     *
     * @param apellidos  los nuevos apellidos del Cliente.
     */
    public void setApellidos(String apellidos) {
    	if (nombre.length() > 5 && nombre.length() < 30 ) {
        this.apellidos = apellidos;
    	} else {
    	    System.out.println("Ingrese un apellido valido");}
    	
}
    	

    /**
     * Devuelve el telefono del Cliente.
     *
     * @return el telefono del Cliente.
     */
    public int getTelefono() {
            return telefono;
    }

    /**
     * Establece el telefono del Cliente.
     *
     * @param telefono el nuevo telefono del Cliente.
     */
    public void setTelefono(int telefono) {
    	if(telefono != 0) {
        this.telefono = telefono;
    	} else {
    	    System.out.println("Ingrese un telefono valido");}
    }

    /**
     * Devuelve el AFP del Cliente.
     *
     * @return el AFP del Cliente.
     */
    public String getAfp() {
        return afp;
    }

    /**
     * Establece el AFP del Cliente.
     *
     * @param afp  el nuevo AFP del Cliente.
     */
    public void setAfp(String afp) {
    	if (afp.length() > 4 && afp.length() < 30 ) {
    		this.afp = afp;
        	} else {
        	    System.out.println("Ingrese una afp valida");}
        	
    }

    /**
     * Devuelve el Sistema de Salud del Cliente.
     *
     * @return el Sistema de Salud del Cliente.
     */
    public int getSistemaSalud() {
        return sistemaSalud;
    }

    /**
     * Establece el requerimiento para asignar un valor a sistemaSalud(el valor
     * ingresado debe ser 1 o 2) y si no se cumple, retorna un mensaje de error
     *
     * @param sistemaSalud  el nuevo sistema de salud del Cliente.
     */
    public void setSistemaSalud(int sistemaSalud) {
        if (sistemaSalud == 1 || sistemaSalud == 2) {
            this.sistemaSalud = sistemaSalud;
        } else {
            System.out.println("Valor incorrecto. Por favor ingrese 1 o 2.");
        }
    }

    /**
     * Devuelve la dirección del Cliente.
     *
     * @return la dirección del Cliente.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del Cliente.
     *
     * @param direccion  la nueva dirección del Cliente.
     */
    public void setDireccion(String direccion) {
    	if (direccion.length() < 70) {
        this.direccion = direccion;
    	}else {
    		System.out.println("La direccion debe tener menos de 70 caracteres ");
    	}
    }

    /**
     * Devuelve la comuna del Cliente.
     *
     * @return la comuna del Cliente.
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Establece la comuna del Cliente.
     *
     * @param comuna La nueva comuna del Cliente.
     */
    public void setComuna(String comuna) {
    	if (comuna.length() < 50) {
        this.comuna = comuna;
    	}else {
    		System.out.println("La comuna debe tener menos de 50 caracteres");
    	}
    }

    /**
     * Devuelve la edad del Cliente.
     *
     * @return la edad del Cliente.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del Cliente.
     *
     * @param edad la nueva edad del Cliente.
     */
    public void setEdad(int edad) {
    	if(edad >= 0 && edad < 150) {
        this.edad = edad;
    	}else {
    		System.out.println("Debe ingresar una edad valida");
    	}
    }
    
    /**
     * Devuelve la cantidad de accidentes asociadas al Cliente.
     *
     * @return cantidad de accidentes del cliente.
     */
    
   // public int getCantidadAccidentes() {
	//	return cantidadAccidentes;}
    
    /**
     * Establece la cantidad de accidentes por cliente.
     *
     * @param accidentes del Cliente.
     */

	//public void setCantidadAccidentes(int cantidadAccidentes) {
	//	this.cantidadAccidentes = cantidadAccidentes;}

    /**
     * Devuelve una representación en cadena de la instancia de la clase Cliente
     *
     * @return Una representación en cadena de la instancia de la clase Cliente
     */
    @Override
    public String toString() {
        return "Cliente [rut = " + run + ", nombre = " + nombres + ", apellidos = " + apellidos + ", telefono = " + telefono
                + ", afp = " + afp + ", sistemaSalud = " + sistemaSalud + ", direccion = " + direccion + ", comuna = " + comuna
                + ", edad = " + edad + "]";
    }
    
	@Override
	public String analizarUsuario() {
		return "Los datos del Cliente son: " + super.analizarUsuario() + ", apellidos = " + apellidos + ", telefono = " + telefono
                + ", afp = " + afp + ", sistemaSalud = " + sistemaSalud + ", direccion = " + direccion + ", comuna = " + comuna
                + ", edad = " + edad + "]";
		
	}
    


}

