
package sistemaprevencion;

import java.util.Scanner;

public class SistemaPrevencion {
    //Variables globales
    static String[][] matriz = new String[100][10];// Defino la matriz con los valores que tendra, datos de Prueba
    static String rut; // Rut que se ingresara
    static String opcion = "";

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean salir = false;

        while (!salir) {    // Menu de opciones, funciona mientras salir sea false
            System.out.println("--------------------MENU---------------------------");
            System.out.println("Por favor escoja una de las opciones del menu:");
            System.out.println("1-. Registrar de usuario ");
            System.out.println("2-. Mostrar usuario");
            System.out.println("3-. Contar usuarios por categoría");
            System.out.println("4-. Modificar usuarios");
            System.out.println("5-. Eliminar usuario");
            System.out.println("6-. Salir");

            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    registroUsuario(matriz);
                    break;
                case "2":
                    mostrarUsuarios(matriz);
                    break;
                case "3":
                    contarUsuariosPorCategoria(matriz);
                    break;
                case "4":
                    System.out.print("Ingrese el RUT del Usuario a modificar: ");
                    rut = sc.nextLine();
                    modificarUsuario(matriz, rut);
                    break;
                case "5":
                    System.out.print("Ingrese el RUT del Usuario a eliminar: ");
                    rut = sc.nextLine();
                    eliminarUsuario(rut, matriz);
                    break;
                case "6":
                    salir = true; // vuelve salir true y sale del bucle
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion ingresada no es valida");
                    break;
            } // indica que la opcion ingresada no se encuentra dentro del menu
        }
    } // Cierre del Main

    // funcion para registrar los diferentes tipos de Usuarios: Clientes, Profesional, Administrativo
    private static void registroUsuario(String [][] matriz) {

        System.out.println("----------------------REGISTRO DE USUARIOS--------------------------");
        System.out.println("Indique el tipo de Usuario a registar");
        System.out.println("1.-Cliente");
        System.out.println("2.-Profesional");
        System.out.println("3.-Administrador");

        opcion = sc.nextLine();
        int filaAIngresar = 0;
        String input = "";
        //Determino la posición de la fila que este vacía

        for (int i = 0; i < matriz.length; i++) {

            if (matriz[i][0] == null) {
                filaAIngresar = i;
                //System.out.println("La fila a modificar es: " + filaAIngresar);
                break; // Si la fila está vacía, salir del ciclo
            }
        }

        switch (opcion) {
            case "1":
                //  Ingreso del tipo: CLIENTE
                matriz[filaAIngresar][0] = "Cliente";

                // Ingreso el Nombre del Cliente
                do {
                    System.out.println(" Ingrese el Nombre de Cliente:");
                    input = sc.nextLine();

                    if (input.length() == 0) {
                        System.out.println("[ERROR] Nombre del Cliente es Obligatorio, favor reintente.");
                    } else {
                        // Guarda Nombre
                        matriz[filaAIngresar][1] = input;
                    }
                } while (input.length() == 0);

                //Ingreso la fecha de Nacimiento
                System.out.println("Ingrese la fecha de Nacimiento: ");
                matriz[filaAIngresar][2] = sc.nextLine();

                // Ingreso el RUT
                do {
                    System.out.println("Ingrese  el RUN del cliente: ");
                    input = sc.nextLine();

                    if (input.length() == 0) {
                        System.out.println("[ERROR]: RUN es un campo obligatorio");

                    } else {
                      if (consultaRut(input, matriz) == -1)
                        // Cliente ya existe!!
                        System.out.println("[ERROR]: RUT ingresado ya fue registrado.");
                      else
                        // Guardo rut
                        matriz[filaAIngresar][3] = input;
                    }
                } while (input.length() == 0);

                //Ingreso la direccion
                do {
                    System.out.println("Ingrese Dirección del Cliente: ");
                    input = sc.nextLine();
                    if (input.length() == 0) {
                        System.out.println("[ERROR] La Dirección No puede estar vacío, favor reintente.");
                    } else {
                        // Guarda direccion
                        matriz[filaAIngresar][4] = input;
                    }
                } while (input.length() == 0);

                // Ingreso el Telefono del Cliente
                do {
                    System.out.println("Ingrese Teléfono del Cliente: ");
                    input = sc.nextLine();
                    if (input.length() == 0) {
                        System.out.println("[ERROR] Teléfono No puede estar vacío, favor reintente. ");
                    } else {
                        //  Guardo el Telefono
                        matriz[filaAIngresar][5] = input;
                    }
                } while (input.length() == 0);

                System.out.println("Ingrese la cantidad de empleados del Cliente:");
                matriz[filaAIngresar][6] = sc.nextLine();

                break;

            case "2":
                //  Ingreso del tipo: PROFESIONAL
                matriz[filaAIngresar][0] = "Profesional";

                // Ingreso el Nombre del Cliente
                do {
                    System.out.println(" Ingrese el Nombre del Profesional: ");
                    input = sc.nextLine();

                    if (input.length() == 0) {
                        System.out.println("[ERROR] Nombre del profesional es Obligatorio, favor reintente.");
                    } else {
                        // Guarda Nombre
                        matriz[filaAIngresar][1] = input;
                    }
                } while (input.length() == 0);

                //Ingreso la fecha de Nacimiento
                System.out.println("Ingrese la fecha de Nacimiento: ");
                matriz[filaAIngresar][2] = sc.nextLine();

                // Ingreso el RUT
                do {
                    System.out.println("Ingrese  el RUT del Profesional: ");
                    input = sc.nextLine();

                    if (input.length() == 0) {
                        System.out.println("[ERROR]: RUT es un campo obligatorio");
                    }

                    if (consultaRut(input, matriz) == -1)
                        System.out.println("[ERROR]: RUT ingresado ya fue registrado. Ingrese rut correcto. ");
                    else // Guarda Rut Profesional
                        matriz[filaAIngresar][3] = input;

                } while (input.length() == 0 || consultaRut(input, matriz) ==-1 );

                //Ingreso años de Experiencia del Profesional
                System.out.println("Favor Ingrese Experiencia en años : ");
                matriz[filaAIngresar][4] = sc.nextLine();


                // Ingreso el Departamento de trabajo del Profesional
                do {
                    System.out.println("Ingrese el Departamento: ");
                    input = sc.nextLine().toUpperCase();

                    if (input.length() == 0) {
                        System.out.println("[ERROR] El  Departamento NO puede estar vacío, favor reintente.");
                    } else {
                        matriz[filaAIngresar][5] = input;
                    }
                } while (input.length() == 0);

                break;

            case "3":
                //  Ingreso del tipo: ADMINISTRATIVO
                matriz[filaAIngresar][0] = "Administrativo";

                // Ingreso el Nombre del Cliente
                do {
                    System.out.println(" Ingrese el Nombre del Administrativo: ");
                    input = sc.nextLine();

                    if (input.length() == 0) {
                        System.out.println("[ERROR] Nombre del Administrativo es Obligatorio, favor reintente.");
                    } else {
                        // Guarda Nombre
                        matriz[filaAIngresar][1] = input;
                    }
                } while (input.length() == 0);

                //Ingreso la fecha de Nacimiento
                System.out.println("Ingrese la fecha de Nacimiento: ");
                matriz[filaAIngresar][2] = sc.nextLine();

                // Ingreso el RUT
                do {
                    System.out.println("Ingrese  el RUT del Administrativo: ");
                    input = sc.nextLine();

                    if (input.length() == 0) {
                        System.out.println("[ERROR]: RUT es un campo obligatorio");

                    } else {
                        if (consultaRut(input, matriz) == -1)
                            System.out.println("[ERROR]: RUT ingresado ya fue registrado.");
                         else
                            // Guarda Rut Profesional
                            matriz[filaAIngresar][3] = input;
                    }
                } while (input.length() == 0);

                // Ingreso la funcion del Administrativo
                do {
                    System.out.println("Ingrese la Función del Administrativo:");
                    input = sc.nextLine().trim().toUpperCase();
                    if (input.length() == 0) {
                        System.out.println("[ERROR] Función no puede estar vacío, favor reintente");
                    } else {
                        matriz[filaAIngresar][4] = input;
                    }
                } while (input.length() == 0);

                // Ingreso el Nombre del Superior
                System.out.println("Ingrese Nombre Superior : ");
                input = sc.nextLine();
                matriz[filaAIngresar][5] = input;

            default:
                System.out.println("Opción ingresada no es valida");
                break;
        }

    }

    //Funcion que recorre la matriz y muestra los usuarios registrados
    private static void mostrarUsuarios(String[][] matriz) {
        System.out.println("------------------------Mostrar Usuarios-------------------------------");

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == null) {
                continue; // Si la fila está vacía, omitir
            }

            // recorre las 10 columnas desde 0 hasta 9
            int inicio = matriz[i].length;

            for (int j = 0; j < matriz[i].length; j++) {
                // System.out.println("longitud de la matriz j " + matriz[j].length);
                // Solo imprimira los valores que no sean nulos
                if (matriz[i][j] != null)
                    System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }

    // Funcion que cuenta la cantidad de usuarios del tipo cliente, tipo administrativo y tipo profesional
    private static void contarUsuariosPorCategoria(String[][] matriz) {
        int cuentaCliente = 0;
        int cuentaProfesional = 0;
        int cuentaAdministrativo = 0;

        System.out.println("------------------Contar Usuarios por Categoria-----------------------------");

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == null) {
                continue; // Si la fila está vacía, omitir
            }

            for (int j = 0; j < matriz[i].length; j++) {

                if (j == 0) {

                    String tipo = matriz[i][0];
                    switch (tipo) {
                        case "Cliente":
                            cuentaCliente = cuentaCliente + 1;
                            break;
                        case "Profesional":
                            cuentaProfesional = cuentaProfesional + 1;
                            break;
                        case "Administrativo":
                            cuentaAdministrativo = cuentaAdministrativo + 1;
                            break;
                        default:
                            System.out.println("Tipo de Usuario no valido, vuelve a intentar...");
                    }

                }

            }
        }
        System.out.println("Se han registrado: " + cuentaCliente + " Clientes, " + cuentaProfesional + " Profesionales, "
                + cuentaAdministrativo + " Administrativos");
    }


    //Funcion que consulta el Rut y  retorna la fila donde se encuentra
    public static int consultaRut(String rut, String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 && j == 0) {
                    return 0; // Si la fila está vacía, retorno la primera posición de la fila
                }
                if ((matriz[i][j]).equals(rut)) { // SI EL RUT EXISTE DEVUELVE LA FILA
                    return i;
                }
            }
        }
        return -1;
    }


    //Funcion creada para eliminar un usuario dado el rut
    public static void eliminarUsuario(String rut, String[][] matriz) {
        int filaAEliminar;

        System.out.println("-----------------------Eliminar Usuario -----------------------");

        if (consultaRut(rut, matriz) != -1) {
            filaAEliminar = consultaRut(rut, matriz);

            // Desplaza las filas ubicadas debajo de la fila a eliminar hacia arriba
            for (int i = filaAEliminar + 1; i < matriz.length; i++) {
                /*Uso el metodo arraycopy: Este método sirve para copiar los datos de un array en otro. copia “n” datos del array “origen”
                al array “destino”. El primer dato que se copia del origen es el que esté en la posición “p1”, que va a la
                posición “p2” del destino. arraycopy(arrayOrigen, p1, arrayDestino, p2)*/
                System.arraycopy(matriz, i, matriz, i - 1, 1);
            }

            // Coloca una fila nula en la última posición del arreglo
            matriz[matriz.length - 1] = new String[matriz[0].length];
            System.out.println("El usuario cuyo rut es: " + rut + " fue eliminado satisfactoriamente.");

        } else
            System.out.println("El rut introducido por Ud no existe");

        mostrarUsuarios(matriz);
    }

    // Función que permite modificar cada uno de los valores del registro del usuario
    public static void modificarUsuario(String[][] matriz, String rut) {
        Scanner valorNuevo = new Scanner(System.in);
        int filaAModificar;


        System.out.println("-----------------------Modificar Usuario -----------------------");

        if (consultaRut(rut, matriz) != -1) { // Si el Rut Existe lo modifico
            filaAModificar = consultaRut(rut, matriz);
            System.out.println("Usted modificara el usuario del tipo: " + matriz[filaAModificar][0] + " ,cuyo nombre es: " +
                    matriz[filaAModificar][1] + ", nacio el " + matriz[filaAModificar][2] + " y su rut es: " + matriz[filaAModificar][3]);
            System.out.println("");
            System.out.println("Ingrese los datos a modificar: ");
            for (int i = 0; i < matriz[i].length; i++) {


                if (matriz[filaAModificar][i] != null) {
                    switch (i) {
                        case 0:
                            System.out.println("Actualice el Tipo de Usuario: ");
                            matriz[filaAModificar][0] = valorNuevo.nextLine();
                            break;
                        case 1:
                            System.out.println("Actualice el Nombre de Usuario: ");
                            matriz[filaAModificar][1] = valorNuevo.nextLine();
                            break;
                        case 2:
                            System.out.println("Actualice la fecha de Nacimiento:");
                            matriz[filaAModificar][2] = valorNuevo.nextLine();
                            break;
                        case 3:
                            System.out.println("Actualice el Run de Usuario:");
                            matriz[filaAModificar][3] = valorNuevo.nextLine();
                            break;
                        case 4:
                            System.out.println("Actualice la DIRECCION si el  tipo de usuario es: CLIENTE");
                            System.out.println("Actualice los AÑOS DE EXPERIENCIA si el  tipo de usuario es :PROFESIONAL");
                            System.out.println("Actualice la FUNCION si el  tipo de usuario es : ADMINISTRATIVO");
                            matriz[filaAModificar][4] = valorNuevo.nextLine();
                            break;
                        case 5:
                            System.out.println("Actualice el TELEFONO si el  tipo de usuario es: CLIENTE");
                            System.out.println("Actualice EL DEPARTAMENTO si el  tipo de usuario es :PROFESIONAL");
                            System.out.println("Actualice el NOMBRE DEL SUPERVISOR si el  tipo de usuario es : ADMINISTRATIVO");
                            matriz[filaAModificar][5] = valorNuevo.nextLine();
                            break;
                        case 6:
                            System.out.println("Actualice la cantidad de empleados, solo aplica para usuarios tipo Cliente");
                            matriz[filaAModificar][6] = valorNuevo.nextLine();
                            break;
                        default:
                            //matriz[filaAModificar][i] = valorNuevo.nextLine();
                            break;

                    }
                }
            }
            mostrarUsuarios(matriz);
        } else
            System.out.println("El rut introducido no existe!!");
    }
}

