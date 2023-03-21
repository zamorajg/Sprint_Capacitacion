package sprintJavaFinal;

import java.util.Scanner;

/**
 * Clase que registra las revisiones con los siguientes atributos
 * - Identificador de la revisión: obligatorio, número interno manejado por la compañía.
 * - Identificador de la visita en terreno: obligatorio, número de la vista a la
 *  que seasóciala revisión.
 * - Nombre alusivo a la revisión: obligatorio, mínimo 10 caracteres, máximo 50
 * - Detalle para revisar: máximo 100 caracteres
 * - Estado: 1 (sin problemas), 2 (con observaciones), 3 (no aprueba), solo se
 *  pueden ingresar los valores antes indicados.
 */
public class Revision {
    private int idRevision;
    private int idVisita;
    private String nombreRev;
    private String detalleRev;
    private int estadoRev;

    Scanner sc = new Scanner(System.in);

    /**
     * Constructor de la clase Revision que no recibe parametros
     */
    public Revision() {
    }

    /**
     * Constructor con todos sus parametros
     * @param idRevision
     * @param idVisita
     * @param nombreRev
     * @param detalleRev
     * @param estadoRev
     */
    public Revision(int idRevision, int idVisita, String nombreRev, String detalleRev, int estadoRev) {
        this.idRevision = idRevision;
        this.idVisita = idVisita;
        this.nombreRev = nombreRev;
        this.detalleRev = detalleRev;
        this.estadoRev = estadoRev;
    }

    public int getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(int idRevision) {
        this.idRevision = idRevision;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public String getNombreRev() {
        return nombreRev;
    }

    /**
     * Método que establece que el nombre de la revision no este vacía y válida que
     * no sea menor a 10 caracteres y no exceda de 50
     * @param nombreRev nombre de la revision
     */
    public void setNombreRev(String nombreRev) {
        do{
            if (nombreRev.length()>=10 || nombreRev.length()<=50) {
                //throw new IllegalArgumentException("El nombre debe tener mínimo 10 caracteres y máximo 50");
                System.out.println("El nombre debe tener mínimo 10 caracteres y máximo 50");
            }else{
                this.nombreRev = nombreRev;
                nombreRev = sc.nextLine();
            }

        } while (nombreRev == null || nombreRev.trim().isEmpty());
    }

    public String getDetalleRev() {
        return detalleRev;
    }

    public void setDetalleRev(String detalleRev) {

        if (detalleRev.length() <= 100){
            System.out.println("El detalle de la revisión no debe exceder de 100 caracteres");
        detalleRev = sc.nextLine();
        }else{
                this.detalleRev = detalleRev;}

    }

    public int getEstadoRev() {
        return estadoRev;
    }

    public void setEstadoRev(int estadoRev) {

            if (estadoRev >= 1 && estadoRev <= 3)
                this.estadoRev = estadoRev;
            else {
                System.out.println("Ingrese un valor del estado  entre 1 y 3"
                        + "\n Estado: 1 (sin problemas), 2 (con observaciones), 3 (No aprueba)");
                estadoRev = Integer.parseInt(sc.nextLine());
                }

    }


    /**
     * Metodo que retorna el tipo de estado de la revision
     * @param estado
     */
    public String mostrarEstado(int estado){
        String estado1;

        switch(getEstadoRev()) {
            case 1:
                estado1 = "Sin problemas";
                break;
            case 2:
                estado1 = "Con observaciones";
                break;
            case 3:
                estado1 = "No aprueba";
                break;
            default:
                estado1 = "Estado no valido";
        }

        return estado1;
    }

    @Override
    public String toString() {
        return "Revision{" +
                "idRevision=" + idRevision +
                ", idVisita=" + idVisita +
                ", nombreRev='" + nombreRev + '\'' +
                ", detalleRev='" + detalleRev + '\'' +
                ", estadoRev=" + mostrarEstado(estadoRev) +
                '}';
    }
}
