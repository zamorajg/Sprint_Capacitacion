// Version 1.0

package sprint;

import java.util.Scanner;

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
	protected static String nombre; // nombres que identifica al usuario
	protected static String fechaNacimiento; // fecha de nacimiento del usuario
	protected static Long run; // RUN del usuario (menor a 99.999.999)
	Scanner sc = new Scanner(System.in);

	// Constructor con todos los parametros.
	public Usuario(String nombre, String fechaNacimiento, Long run) {
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
	 */

	public void setNombre(String nombre) {
		do {
			if (nombre.length() < 10 || nombre.length() > 50 || nombre.isEmpty() || nombre.isBlank()) {
				System.out.println("Ingrese nombre");
				nombre = sc.nextLine();
			}else if (nombre.length() > 9 && nombre.length() < 51) {
				Usuario.nombre = nombre;
				break;
			} 

		} while (true);

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

	public void setFechaNacimiento(String fechaNacimiento) {// se cae

			String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";

			if (fechaNacimiento.matches(regex)) {
				Usuario.fechaNacimiento = fechaNacimiento;
			} else {
				System.out.println("La fecha no es valida, debe ingresarla en este formato DD/MM/AAAA");
			}
	}
	// Solicita y retorna el valor de rut.
	/**
	 * Devuelve el rut del Usuario
	 *
	 * @return rut del Usuario
	 */
	public Long getRun() {
		return run;
	}

	/**
	 * Establece el run del Usuario
	 *
	 * @param Cliente.run el nuevo run del Usuario.
	 */
	public void setRun(Long run) {
		do {
			if (run == 0 || run.equals(null) || run >99999999 || run < 999999) {
				System.out.println("Ingrese rut valido");
				run = Long.parseLong(sc.nextLine());
			}else if (run <= 99999999 && run >999999) {
				Usuario.run = run;
				break;
			}
			}while (true);
			
		}

	public Integer calcularEdad(String fechaNacimiento) {
		// Parsear la fecha de nacimiento a un objeto LocalDate
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formatter);

		// Obtener la edad actual
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNac, ahora);
		return periodo.getYears();
	}

	public static ArrayList<Asesoria> getClientes() {
		return clientes;
	}

	public static void setClientes(ArrayList<Asesoria> clientes) {
		Usuario.clientes = clientes;
	}
	
	@Override
	public String toString() {
		return "Usuario [getNombre()=" + getNombre() + ", getFechaNacimiento()=" + getFechaNacimiento() + ", getRun()="
				+ getRun() + ", mostrarEdad()=" + mostrarEdad() + ", analizarUsuario()=" + analizarUsuario() + "]";
	}

	public String mostrarEdad() {
		return "El Usuario: " + nombre + " tiene " + calcularEdad(fechaNacimiento);
	}

	public String analizarUsuario() {
		return "Usuario [nombre = " + nombre + ", rut: " + run + "]";}
}
