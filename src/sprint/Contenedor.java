package sprintCapacitacion;

import java.util.ArrayList;
import java.util.Iterator;

public class Contenedor {
   private  ArrayList<Asesoria> asesorias;
   private  ArrayList<Capacitacion> capacitaciones;

    public Contenedor() {
       this.asesorias = new ArrayList<Asesoria>();
       this.capacitaciones = new ArrayList<Capacitacion>();
    }

    /**
     * Método que permite agregar un nuevo Cliente a la lista de instancias de la interface Asesoria
     * @param cliente
     */
    public void almacenarCliente(Cliente cliente){
        /*Ojo debo instanciar los usuarios en el menu de esta forma

         Asesoria cliente = new Cliente();

         */
        asesorias.add(cliente);
    }

    /**
     * Método que permite agregar un nuevo Profesional a la lista de instancias de la interface asesoria
     * @param profesional
     */
    public void almacenarProfesional(Profesional profesional){
        //Asesoria profesional = new Profesional();

        asesorias.add(profesional);
    }

    /**
     * Método que permite agregar un nuevo Administrativo a la lista de instancias de la interface asesoria
     * @param administrativo
     */
    public void almacenarAdministrativo(Administrativo administrativo){
        // se debera instanciar asi: Asesoria administrativo = new Administrativo();
        asesorias.add(administrativo);
    }

    /**
     * Método que permite agregar un nuevo Capacitación a la lista de instancias de la clase capacitación
     * @param capacitacion
     */
    public void almacenarCapacitacion(Capacitacion capacitacion){
        capacitaciones.add(capacitacion);
    }

    /**
     * Método que permite eliminar un usuario desde la lista de interfaces de asesoria de acuerdo con el run del Usuario
     * @param run
     */
    public void eliminarUsuario(String run){
        boolean existe = false;
        // Iterar sobre la lista de Interface de asesoria y buscar el objeto que tenga el mismo rut
        for (Iterator<Asesoria> iter = asesorias.iterator(); iter.hasNext();) {
            Asesoria asesora = iter.next();
            String datos = asesora.analizarUsuario();
            int index = datos.indexOf(":"); //encuentra el indice del primer carácter ':'
            String salida = datos.substring(index + 2); // obtiene los caracteres después de los dos puntos

            if(salida.equals(run)) {
                existe = true;
                iter.remove(); // Elimina el objeto de la lista
                break;
            }

        }
        if(existe == false)
            System.out.println("El rut solicita no existe");
    }


    /**
     * Método que permite desplegar la lista de usuarios, independientemente del tipo este metodo
     * solo desplega los datos de la clase usuario
     * @param listaU  Lista de Usuarios contenidos en dicha lista
     */
    public void ListarUsuarios(ListaUsuarios listaU){
        for (Usuario user : listaU.getListaUsuarios() ) {
            System.out.println(user.getNombreUsuario() + user.getFechaNacimiento()+ user.getRut());

        }

    };


    /**
     * Método que lista los usuarios por tipo (Cliente, Administrador,
     * Profesional y retorna los datos respectivos según el tipo
     * @param listaU
     */
    public void ListarUsuariosPorTipo(ListaUsuarios listaU){
        ;
        for (Usuario user : listaU.getListaUsuarios() ) {

            if(user instanceof Cliente){
                Cliente varCliente = (Cliente)user;
                System.out.println("Cliente: " + varCliente.analizarUsuario());
            }

            if(user instanceof Profesional){
                Profesional varProfesional = (Profesional)user;
                System.out.println("Profesional: " + varProfesional.analizarUsuario());
            }

            if(user instanceof Administrativo){
                Administrativo varAdministrativo = (Administrativo)user;
                System.out.println("Administrativo: " + varAdministrativo.analizarUsuario());
            }

        }

    };


    /**
     * Capacitaciones registradas en la lista lista de Capacitaciones del Cliente, junto con los
     * datos del Cliente al que esta asociada dicha capacitación
     * @param cliente
     */
    public void ListarCapacitaciones(Cliente cliente){
        ArrayList<Capacitacion> listaCapacitaciones = cliente.getCapacitaciones();



        for (Capacitacion capacitaciones: listaCapacitaciones) {

            System.out.println(capacitaciones.toString());
            Integer run =capacitaciones.getRutCliente();
            this.mostrarCliente(run.toString());

        }

    };

    public void mostrarCliente(String run){
        boolean existe = false;
        // Iterar sobre la lista de Interface de asesoría y buscar el objeto que tenga el mismo rut
        for (Iterator<Asesoria> iter = asesorias.iterator(); iter.hasNext();) {
            Asesoria asesora = iter.next();
            String datos = asesora.analizarUsuario();
            int index = datos.indexOf(":"); //encuentra el indice del primer carácter ':'
            String salida = datos.substring(index + 2); // obtiene los caracteres después de los dos puntos

            if(salida.equals(run)) {
                existe = true;
                System.out.println(datos);
            }

        }
        if(existe == false)
            System.out.println("El rut solicitado no existe");
    }




}
