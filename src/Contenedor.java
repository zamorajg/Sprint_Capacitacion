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

        // Iterar sobre la lista de Interface de asesoria y buscar el objeto que tenga el mismo rut
        for (Iterator<Asesoria> iter = asesorias.iterator(); iter.hasNext();) {
            Asesoria asesora = iter.next();
            String datos = asesora.analizarUsuario();
            int index = datos.indexOf(":"); //encuentra el indice del primer caracter ':'
            String salida = datos.substring(index + 2); // obtiene los caracteres después de los dos puntos

            if(salida.equals(run)) {
                iter.remove(); // Elimina el objeto de la lista
            }
        }

    }

    /**
     * Método que permite desplegar la lista de usuarios, independientemente del tipo este metodo
     * solo desplega los datos de la clase usuario
     */
    public void ListarUsuarios(){

    };
    public void ListarUsuariosPorTipo(){};
    public void ListarCapacitaciones(){};




}
