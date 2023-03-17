
package sprint;

import java.util.Scanner;

public class MenuPrincipal {

    // VARIABLES GLOBALES
    static int idCapacitacion = 0; // Correlativo de la Capacitacion
    static int idAccicente = 0; // Correlativo del Accidente
    static int idVisitaTerreno = 0; // Correlativo del Accidente
    static int idRevision = 0; // Correlativo del Accidente


    public static void main(String[] args) {

        Contenedor contenedora = new Contenedor();
       menuOpciones(contenedora);

    }

    public static void menuOpciones(Contenedor contenedora) {

        boolean salir = false;

        while (!salir) {    // Menu de opciones, funciona mientras salir sea false
            System.out.println("--------------------MENU---------------------------");
            System.out.println("Por favor escoja una de las opciones del menu:");
            System.out.println("1-. Almacenar Cliente");
            System.out.println("2-. Almacenar Profesional");
            System.out.println("3-. Almacenar Administrativo");
            System.out.println("4-. Almacenar Capacitación");
            System.out.println("5-. Eliminar Usuario");
            System.out.println("6-. Listar Usuarios");
            System.out.println("7-. Listar Usuarios por Tipo");
            System.out.println("8-. Listar Capacitaciones");
            System.out.println("9-. Salir");

           Scanner sc = new Scanner(System.in); // Variable que lee el valor introducido por consola
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    Usuario usuario = contenedora.ingresarUsuario("Cliente");
                    if(usuario.getRun() == null)
                    contenedora.almacenarCliente(contenedora.ingresarUsuario("Cliente"));
                    break;
                case "2":
                    contenedora.almacenarProfesional(contenedora.ingresarUsuario("Profesional"));
                    break;
                case "3":
                    contenedora.almacenarUsuario(contenedora.ingresarUsuario("Administrativo"));
                    break;
                case "4":
                    System.out.println(" Ingrese el RUN del Cliente que recibirá la Capacitación:");
                    String input = sc.nextLine();
                    int run = Integer.parseInt(input);
                    if(contenedora.buscarRut(run)){
                        contenedora.almacenarCapacitacion(idCapacitacion,input);
                    }else{
                        System.out.println("El Run ingresado no Existe!!, ingrese un Run Valido");
                    }
                    break;
                case "5":
                    System.out.println(" Ingrese el RUN del Usuario a Eliminar:");
                     input = sc.nextLine();
                    //int run = Integer.parseInt(input);
                    contenedora.eliminarUsuario(input);
                    break;
                case "6":
                    contenedora.ListarUsuarios();
                case "7":
                    contenedora.ListarUsuariosPorTipo();
                case "8":
                    contenedora.ListarCapacitaciones();
                case "9":
                    salir = true; // vuelve salir true y sale del bucle
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opcion ingresada no es valida");
                    break;
            } // indica que la opcion ingresada no se encuentra dentro del menu
        }
    } // Cierre del Main




    }



