// Version 1.0

package sprint;

/**
 * @Definicion: Clase usuario y se definen los parametros(nombre, fechaNacimiento y rut).
 * @Version: 1.0
 * @Autor: Grupo Java (Jose Zamora, Benjamin, Fernanda, Javiera)
 *
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Usuario implements Asesoria {
	// Creación de los atributos de la Clase Usuario
    private static ArrayList<Asesoria> clientes = new ArrayList<Asesoria>();
	protected static String nombre; //nombres que identifica al usuario
	protected static String fechaNacimiento; //fecha de nacimiento del usuario
	protected  static Integer run; // RUN del usuario (menor a 99.999.999)
	

	// Constructor con todos los parametros.
	public Usuario(String nombre, String fechaNacimiento, Integer run) {
		Usuario.nombre = nombre;
		Usuario.fechaNacimiento = fechaNacimiento;
		Usuario.run = run;

	}


	 public Usuario() {
	}


	/**
    * Devuelve el nombre del Usuario.
    *
    * @return nombre el nombre del Usuario.
    */
	public String getNombre() {
		return nombre;
	}

	/**
     * Establece el nombre del Usuario
     *
     * @param nombre el nuevo nombre del Usuario
     * */

	public void setNombre(String nombre) {
			
		if (nombre.length() > 10 && nombre.length() < 50 ) {
	        	Usuario.nombre = nombre;
		}else {
			System.out.println("Ingrese nombre valido");
		}
	
	
	}
		 /**
	     * Devuelve la fechaNacimiento del Usuario.
	     *
	     * @return fechaNacimiento la fechaNacimiento del Usuario.
	     */
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
     * Establece la fechaNacimiento del Usuario
     *
     * @param fechaNacimiento la nueva fechaNacimiento del Usuario.
     */
	
	public void setFechaNacimiento(String fechaNacimiento) {
		
		Usuario.fechaNacimiento = fechaNacimiento;
	}

	// Solicita y retorna el valor de rut.
	 /**
     * Devuelve el rut del Usuario
     *
     * @return rut del Usuario
     */
	public int getRun() {
		return run;
	}

	/**
     * Establece el run del Usuario
     *
     * @param Cliente.run  el nuevo run del Usuario.
     */
	public void setRun(Integer run) {
		if (run < 99999999 && run > 999999) {
		Usuario.run = run;}
		else {
			System.out.println("Ingrese rut valido");
		}
	}
	
	public void calcularEdad(String fechaNacimiento) {
		    // Parsear la fecha de nacimiento a un objeto LocalDate
		    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		    LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formatter);

		    // Obtener la edad actual
		    LocalDate ahora = LocalDate.now();
		    Period periodo = Period.between(fechaNac, ahora);
		    return periodo.getYears();
		}
	}


	
	public String mostrarEdad() {
		return "El Usuario: " + nombre + " tiene " + calcularEdad();
	}
	
	public String analizarUsuario() {
		return "Usuario [nombre = " + nombre + ", rut: " + run +"]";
	}

	
	


	
	

}
