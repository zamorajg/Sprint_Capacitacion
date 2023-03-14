package herenciaPolimorfismoInterface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creo un Usuario
        Usuario usuario = new Usuario("usuario1","18/09/1986","27167394-9");
        // Creacion de un Usurio del tipo Cliente
        Usuario cliente = new Cliente("cliente1","19/09/1986","Nieves5",
                "Bianca5","37167394-9","59099090","Capital",1,
                "Los olivos 1030","Cafetal",28);
        // Creación de un Usuario del tipo Profesional
        Usuario profesional = new Profesional("profesional","20/09/1986","47167394-9","Ingeniero","20/02/2020");
        //Creación de un Usuario del tipo Administrativo
        Usuario administrativo1 = new Administrativo("administrativo1","20/09/1986","57167394-9","Nomina","2 años");
        //Creación de un adicional Usuario del tipo Administrativo
        Usuario administrativo2 = new Administrativo("administrativo2","30/09/1986","67167394-9","Nomina","3 años");
        // Creacion de un Listado
        Listado lista = new Listado();
        // Agregación de los usuarios
        lista.agregar(usuario);
        lista.agregar(cliente);
        lista.agregar(profesional);
        lista.agregar(administrativo1);
        lista.agregar(administrativo2);
        //Listado de los diferentes tipos de usuarios a traves del metodo mostrar
        lista.mostrarUsuarios();

    }
}