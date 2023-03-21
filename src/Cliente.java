package sprintJavaFinal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que define cada uno de los clientes del sistema el cual puede registrarse en una
 * Capacitación, un accidente o una visita en terreno y esta compuesta por los sig atributos:
 * - RUT: corresponde a un número menor a 99.999.999
 * - Nombres: obligatorio, mínimo 5 caracteres, máximo 30
 * - Apellidos: obligatorio, mínimo 5 caracteres, máximo 30
 * - Teléfono: obligatorio
 * - AFP: mínimo 4 caracteres, máximo 30
 * - Sistema de salud: 1 (Fonasa) o 2 (Isapre), debe ser solo una de las dos
 *     opcionesindicadas
 * - Dirección: máximo 70 caracteres
 * - Comuna: máximo 50 caracteres
 * - Edad: obligatorio, número mayor o igual a cero, y menor a 150
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
	Scanner sc = new Scanner(System.in);
    //private ArrayList<Capacitacion> listaCapacitaciones;
    private ArrayList<Accidente> ListaAccidentes; // lista de Accidentes
    private ArrayList<VisitaTerreno> listaVisitasTerreno; // lista de Visitas en Terreno


    /**
     * Constructor con todos los atributos del Cliente
     * @param nombre
     * @param fechaNacimiento
     * @param run
     * @param nombres
     * @param apellidos
     * @param telefono
     * @param afp
     * @param sistemaSalud
     * @param direccion
     * @param comuna
     * @param edad
     * @param String
     */
	public Cliente(String nombre, String fechaNacimiento, Long run, String nombres, String apellidos, int telefono,
    		String afp, int sistemaSalud, String direccion, String comuna, int edad, String String) {
    	super(nombre, fechaNacimiento, run);
    	this.nombres = nombres;
    	this.apellidos = apellidos;
    	this.telefono = telefono;
    	this.afp = afp;
    	this.sistemaSalud = sistemaSalud;
    	this.direccion = direccion;
    	this.comuna = comuna;
    	this.edad = edad;
        //this.listaCapacitaciones = new ArrayList<Capacitacion>();
        this.ListaAccidentes= new ArrayList<Accidente>();
        this.listaVisitasTerreno = new ArrayList<VisitaTerreno>();
    }

    /**
     * Contenedor de la clase Cliente que contiene los datos del padre o clase que extiende(Usuario)
     * @param usuario
     */
    public Cliente (Usuario usuario) {

        super(usuario.getNombreUsuario(),usuario.getFechaNacimientoUsuario(),usuario.getRunUsuario());
    }
    /**
     * Constructor de la clase cliente que no recibe parámetros
     */
    public Cliente(){};

    /**
     * Método que retorna los nombres del cliente
     * @return idAccidente
     */
    public String getNombres() {
		return nombres;
	}

    /**
     * Método que establece los nombres del cliente
     */
	public void setNombres(String nombres) {
		do {
            if (nombres.length() >=5 || nombres.length() <= 30) {
                this.nombres = nombres;
                break;

            } else {
                System.out.println("Ingrese nombre valido, mínimo 5 caracteres y máximo 30");
                nombres = sc.nextLine();
            }
		}while (nombres.length() == 0);
    }



	/**
     * Método que Devuelve los apellidos del Cliente.
     * @return los apellidos del Cliente.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Método que establece los apellidos del Cliente.
     * @param apellidos  los nuevos apellidos del Cliente.
     */
    public void setApellidos(String apellidos) {
    	do { 
            if (apellidos.length() >= 5 || apellidos.length() <= 30 || apellidos.isEmpty()) {
                this.apellidos = apellidos;
                break;
            }else {
                System.out.println("El apellido debe ser mayor que 5 caracteres y mayor de 30 caracteres");
                apellidos = sc.nextLine();
            }
    	}while (apellidos.length()==0);
}
    	

    /**
     * Devuelve el telefono del Cliente.
     * @return telefono
     */
    public int getTelefono() {
            return telefono;
    }

    /**
     * Establece el telefono del Cliente.
     * @param telefono el nuevo telefono del Cliente.
     */
    public void setTelefono(int telefono) {
    	do {    		
            if(telefono == 0) {
                System.out.println("Ingrese teléfono, de 12 dígitos numéricos ");
                telefono = Integer.parseInt(sc.nextLine());
            }else if(telefono !=0) {
                this.telefono = telefono;
                break;
            }
    	} while (true);
    }

    /**
     * Devuelve el AFP del Cliente.
     * @return el AFP del Cliente.
     */
    public String getAfp() {
        return afp;
    }

    /**
     * Establece el AFP del Cliente.
     * @param afp  el nuevo AFP del Cliente.
     */
    public void setAfp(String afp) {
        do {
            if (afp.length() >= 4 && afp.length() <= 30) {
                this.afp = afp;
                break;
            } else {
                System.out.println("Ingrese una afp con más de 4 caracteres y menos a 10 caracateres");
            }
            afp = sc.nextLine();
        }while(true);
    }

    /**
     * Devuelve el Sistema de Salud del Cliente.
     * @return el Sistema de Salud del Cliente.
     */
    public int getSistemaSalud() {
        return sistemaSalud;
    }

    /**
     * Establece el requerimiento para asignar un valor a sistemaSalud(el valor
     * ingresado debe ser 1 o 2) y si no se cumple, retorna un mensaje de error
     * @param sistemaSalud  el nuevo sistema de salud del Cliente.
     */
    public void setSistemaSalud(int sistemaSalud) {
        do {
            if (sistemaSalud == 1 || sistemaSalud == 2) {
                this.sistemaSalud = sistemaSalud;
                break;
            } else {
                System.out.println("Valor incorrecto. Por favor ingrese 1 o 2.");
                sistemaSalud = Integer.parseInt(sc.nextLine());
            }
        }while(true);
    }

    /**
     * Devuelve la dirección del Cliente.
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del Cliente.
     * @param direccion  la nueva dirección del Cliente.
     */
    public void setDireccion(String direccion) {
        do {
            if (direccion.length() <= 70) {
                this.direccion = direccion;
                break;
            } else {
                System.out.println("La dirección debe tener menos de 70 caracteres ");
                direccion = sc.nextLine();
            }
        }while(true);
    }

    /**
     * Devuelve la comuna del Cliente.
      * @return la comuna del Cliente.
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Establece la comuna del Cliente.
     * @param comuna La nueva comuna del Cliente.
     */
    public void setComuna(String comuna) {
        do {
            if (comuna.length() <= 50) {
                this.comuna = comuna;
                break;
            } else {
                System.out.println("La comuna no debe exceder de  50 caracteres");
                comuna = sc.nextLine();
            }
        }while(true);
    }

    /**
     * Devuelve la edad del Cliente.
     * @return la edad del Cliente.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del Cliente.
     * @param edad la nueva edad del Cliente.
     */
    public void setEdad(int edad) {
    	do {
            if ( edad < 0 || edad > 150) {
                System.out.println("Ingrese una Edad mayor o igual a 0 y menor de 150 años");
                edad = Integer.parseInt(sc.nextLine());
            }
            else {
                this.edad = edad;
                break;
            }
    	}while (true);
    }

	public String obtenerSistemaSalud() {
		if (sistemaSalud == 1) {
			return "FONASA";
		} else {
			return "ISAPRE";
		}
	}

    /**
     * Método sobreescrito que retorna una cadena, con cada uno de los atributos que la componen
     * @return Una representación en cadena de la instancia de la clase Cliente
     */
    @Override
    public String toString() {
        return "\nCliente: " + super.toString() + "\nNombre: " + nombres + "\nApellidos: " + apellidos + "\nTelefono: " + telefono
                + "\nAfp: " + afp + "\nSistema de salud: " + obtenerSistemaSalud() + "\nDireccion: " + direccion + "\nComuna = " + comuna
                + "\nEdad: " + edad;
    }
    
	@Override
	public String analizarUsuario() {
		return "Los datos del Cliente" + "\nDirección: " + direccion + "\nComuna: " + comuna +  super.analizarUsuario();
		
	}

    /**
     * Metrodo que agrega los accidentes que ha tenido el Cliente
     * @param accidente
     */
    public void agregarAccidente(Accidente accidente){
        this.ListaAccidentes.add(accidente);
    }

    /**
     * Metrodo que agrega las visitas en terreno  que ha tenido el Cliente
     * @param visita
     */
    public void agregarVisitaTerreno(VisitaTerreno visita){
        this.listaVisitasTerreno.add(visita);
    }


}

