package sprint;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Contenedor {
	public static ArrayList<Asesoria> asesorias = new ArrayList<Asesoria>();;
	public ArrayList<Capacitacion> capacitaciones = new ArrayList<Capacitacion>();;

	/**
	 * Método que permite agregar un nuevo Cliente a la lista de instancias de la
	 * interface Asesoria
	 * 
	 * @param usuario
	 */
	public static void almacenarCliente(Usuario usuario) {
		Scanner sc = new Scanner(System.in); // Variable que lee el valor introducido por consola
		String input = "";

		// Ingreso los datos del Cliente
		Cliente cliente = new Cliente();
		// Agrego el rut que trae de la clase padre que hereda
		cliente.setRun(usuario.getRun());
		// Agrego el nombre de Usuario que trae de la clase padre que hereda
		cliente.setNombres(usuario.getNombre());
		// Agrego la fecha de Nacimiento que trae del padre
		cliente.setFechaNacimiento(usuario.getFechaNacimiento());
		// Solicito los nombres del Cliente
		System.out.println(" Ingrese los Nombres de Cliente:");
		input = sc.nextLine();
		cliente.setNombres(input);
		// Solicito los apellidos del Cliente
		System.out.println(" Ingrese los apellidos del Cliente:");
		input = sc.nextLine();
		cliente.setApellidos(input);
		// Solicito el teléfono del cliente
		System.out.println(" Ingrese el teléfono del Cliente:");
		input = sc.nextLine();
		cliente.setApellidos(input);
		// Solicito el AFP del cliente
		System.out.println(" Ingrese el AFP del Cliente:");
		input = sc.nextLine();
		cliente.setAfp(input);
		// Solicito el sistema de Salud
		System.out.println(" Ingrese el sistema de Salud del Cliente: 1 (Fonasa) o 2 (Isapre)");
		input = sc.nextLine();
		cliente.setSistemaSalud(Integer.parseInt(input));
		// Solicito la direccion
		System.out.println("Ingrese Dirección del Cliente: ");
		input = sc.nextLine();
		cliente.setDireccion(input);
		// Solicito la comuna
		System.out.println("Ingrese la Comuna del Cliente: ");
		input = sc.nextLine();
		cliente.setComuna(input);
		// Solicito la edad
		System.out.println("Ingrese la edad del Cliente: ");
		input = sc.nextLine();
		cliente.setEdad(Integer.parseInt(input));

		Asesoria clienteA = (Asesoria) cliente;
		// asesorias.add(clientes);

		asesorias.add(clienteA);
	}

	/**
	 * Método que permite agregar un nuevo Profesional a la lista de instancias de
	 * la interface asesoria
	 * 
	 * @param usuario
	 */
	public static void almacenarProfesional(Usuario usuario) {
		Scanner sc = new Scanner(System.in); // Variable que lee el valor introducido por consola
		String input = "";

		// Ingreso los datos del Profesiona
		Profesional profesional = new Profesional();
		// Agrego el rut que trae de la clase padre que hereda
		profesional.setRun(usuario.getRun());
		// Agrego el nombre de Usuario que trae de la clase padre que hereda
		profesional.setNombre(usuario.getNombre());
		// Agrego la fecha de Nacimiento que trae del padre
		profesional.setFechaNacimiento(usuario.getFechaNacimiento());
		// Solicito el titulo
		System.out.println("Ingrese el titulo del profesional: ");
		input = sc.nextLine();
		profesional.setTitulo(input);
		// Solicito la fecha de Ingreso
		System.out.println("Ingrese la fecha de Ingreso en el formato: DD/MM/AAAA ");
		input = sc.nextLine();
		profesional.setFechaIngreso(input);

		// Asesoria profesionales = new Profesional();
		// asesorias.add(profesionales);

		asesorias.add(profesional);
	}

	/**
	 * Método que permite agregar un nuevo Administrativo a la lista de instancias
	 * de la interface asesoria
	 * 
	 * @param usuario
	 */
	public static void almacenarAdministrativo(Usuario usuario) {
		Scanner sc = new Scanner(System.in); // Variable que lee el valor introducido por consola
		String input = "";

		// Ingreso los datos del Profesional
		Administrativo administrativo = new Administrativo();
		// Agrego el rut que trae de la clase padre que hereda
		administrativo.setRun(usuario.getRun());
		// Agrego el nombre de Usuario que trae de la clase padre que hereda
		administrativo.setNombre(usuario.getNombre());
		// Agrego la fecha de Nacimiento que trae del padre
		administrativo.setFechaNacimiento(usuario.getFechaNacimiento());
		// Solicito el Area
		System.out.println("Ingrese el área de Trabajo: ");
		input = sc.nextLine();
		administrativo.setArea(input);
		// Solicito la Experiencia Previa
		System.out.println("Ingrese la Experiencia Previa: ");
		input = sc.nextLine();
		administrativo.setExperienciaPrevia(input);

		// Asesoria administrativos = new Administrativo();
		// asesorias.add(administrativos);
		asesorias.add(administrativo);
	}

	/**
	 * Método que permite agregar un nuevo Capacitación a la lista de instancias de
	 * la clase capacitación
	 * 
	 * @param idCapacitacion
	 * @param Run
	 */
	public void almacenarCapacitacion(int idCapacitacion, String Run) { // Ojo cambiar por int Run
		Scanner sc = new Scanner(System.in); // Variable que lee el valor introducido por consola
		String input = "";

		// Ingreso los datos de la Capacitacion
		Capacitacion capacitacion = new Capacitacion();
		// Identificador: obligatorio, número interno de la capacitación manejado por la
		// empresa
		capacitacion.setIdCapacitacion(idCapacitacion++);
		// RUT cliente: obligatorio
		capacitacion.setRun(Long.parseLong(Run));
		// Día: texto, día de la semana. Debe ser un valor permitido entre “lunes” y
		// “Domingo”(en ese formato)
		System.out.println("Ingrese el Día de la semana. Debe ser un valor permitido entre “lunes” y “Domingo”");
		input = sc.nextLine();
		capacitacion.setDia(input);
		// Hora: debe ser una hora válida del día, en formato HH:MM (hora desde 0 a23,
		// minutos entre 0 y 59)
		System.out.println(
				"Ingrese la Hora de la capacitación : debe ser una hora válida del día, en formato HH:MM (hora desde 0 a23, minutos entre 0 y 59)");
		input = sc.nextLine();
		capacitacion.setHora(input);
		// Lugar: obligatorio, mínimo 10 caracteres, máximo 50
		System.out.println("Ingrese el lugar de la Capacitación, mínimo 10 caracteres, máximo 50)");
		input = sc.nextLine();
		capacitacion.setHora(input);
		// Duración: máximo 70 caracteres
		System.out.println("Ingrese la Duración de la capacitación: máximo 70 caracteres )");
		input = sc.nextLine();
		capacitacion.setDuracion(input);
		// Cantidad de asistentes: obligatorio, número entero menor que 1000
		System.out.println("Ingrese la cantidad de asistentes: obligatorio, número entero menor que 1000");
		input = sc.nextLine();
		capacitacion.setCantAsistentes(Integer.parseInt(input));

		capacitaciones.add(capacitacion);
	}

	/**
	 * Método que permite eliminar un usuario desde la lista de interfaces de
	 * asesoria de acuerdo con el run del Usuario
	 * 
	 * @param run
	 */
	public void eliminarUsuario(String run) {
		boolean existe = false;
		// Iterar sobre la lista de Interface de asesoria y buscar el objeto que tenga
		// el mismo rut
		for (Iterator<Asesoria> iter = asesorias.iterator(); iter.hasNext();) {
			Asesoria asesora = iter.next();
			String datos = asesora.analizarUsuario();
			int index = datos.indexOf(":"); // encuentra el indice del primer carácter ':'
			String salida = datos.substring(index + 2); // obtiene los caracteres después de los dos puntos

			if (salida.equals(run)) {
				existe = true;
				iter.remove(); // Elimina el objeto de la lista
				break;
			}

		}
		if (existe == false)
			System.out.println("El rut solicita no existe");
	}

	/**
	 * Método que permite desplegar la lista de usuarios, independientemente del
	 * tipo este metodo solo desplega los datos de la clase usuario
	 *
	 */
	public void ListarUsuarios() {
		for (Asesoria user : asesorias) {
			System.out.println(user);

		}
		

	}

	/**
	 * Método que lista los usuarios por tipo (Cliente, Administrador, Profesional y
	 * retorna los datos respectivos según el tipo
	 *
	 */
	public void ListarUsuariosPorTipo() {
		
		for (Asesoria user : asesorias) {

			if (user instanceof Cliente) {
				Cliente varCliente = (Cliente) user;
				System.out.println("Cliente: " + varCliente.analizarUsuario());
			}

			if (user instanceof Profesional) {
				Profesional varProfesional = (Profesional) user;
				System.out.println("Profesional: " + varProfesional.analizarUsuario());
			}

			if (user instanceof Administrativo) {
				Administrativo varAdministrativo = (Administrativo) user;
				System.out.println("Administrativo: " + varAdministrativo.analizarUsuario());
			}

		}

	}

	/**
	 * Capacitaciones registradas en la lista lista de Capacitaciones del Cliente,
	 * junto con los datos del Cliente al que esta asociada dicha capacitación
	 *
	 */
	public void ListarCapacitaciones() {

		for (Capacitacion capacitacion : capacitaciones) {

			System.out.println(capacitacion.toString());
			long run = capacitacion.getRunClienteCapa();
			this.mostrarCliente(run + "");

		}

	}

	public void mostrarCliente(String run) {
		boolean existe = false;
		// Iterar sobre la lista de Interface de asesoría y buscar el objeto que tenga
		// el mismo rut
		for (Iterator<Asesoria> iter = asesorias.iterator(); iter.hasNext();) {
			Asesoria asesora = iter.next();
			String datos = asesora.analizarUsuario();
			int index = datos.indexOf(":"); // encuentra el indice del primer carácter ':'
			String salida = datos.substring(index + 2); // obtiene los caracteres después de los dos puntos

			if (salida.equals(run)) {
				existe = true;
				System.out.println(datos);
			}

		}
		if (existe == false)
			System.out.println("El rut solicitado no existe");
	}

	/**
	 * @param run run del Usuario tipo String
	 * @return boolean
	 */
	public boolean buscarRut(Long run) {
		for (Asesoria itemUsuario : asesorias) {
			Usuario usuario = (Usuario) itemUsuario; // Casteo
			if (usuario.getRun() == run) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Metodo que almacena en la lista de interfaz cada vez que se crea un usuario
	 * 
	 * @param usuario
	 */
	public void almacenarUsuario(Usuario usuario) {
		asesorias.add(usuario);
	}

	public static Usuario ingresarUsuario(String tipoUsuario) {
		// Pido los datos básicos para crear el usuario

			boolean existe = false;
			Scanner sc = new Scanner(System.in);
			System.out.println(" Ingrese el RUN del Usuario:");
			String input = sc.nextLine();

			Long run = Long.parseLong(input);
			// if (tipoUsuario.equals("Cliente")){
			Usuario user = new Cliente();
			asesorias.add(user);
			user.setRun(run);
			System.out.println("Ingrese el nombre de Usuario: ");
			input = sc.nextLine();
			user.setNombre(input);
			System.out.println(" Ingrese la fecha de Nacimiento del Usuario(DD/MM/AAAA):");
			input = sc.nextLine();
			user.setFechaNacimiento(input);
			almacenarCliente(user);
			return user;
}
	}
