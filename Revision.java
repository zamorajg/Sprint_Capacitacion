package sprint;

public class Revision {
    private int idRevision;
    private int idVisita;
    private String nombreRev;
    private String detalleRev;
    private int estadoRev;

    /**
     * Método constructor sin parámetros
     */
    public Revision() {
    }
    
    /**
     * Método constructor con parámetros
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
    
    /**
     * Devuelve la ID de la revisión
     * @return idRevision
     */
    public int getIdRevision() {
        return idRevision;
    }
    
    /**
     * Establece la ID de la revisión
     * @param idRevision
     */
    public void setIdRevision(int idRevision) {
        this.idRevision = idRevision;
    }

    /**
     * Devuelve la ID de la visita
     * @return idVisita
     */
    public int getIdVisita() {
        return idVisita;
    }

    /**
     * Establece la ID de la visita
     * @param idVisita
     */
    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }
    
    /**
     * Devuelve el nombre de la revisión
     * @return nombreRev
     */
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
            if (nombreRev.length()<10 || nombreRev.length()>50) {
                //throw new IllegalArgumentException("El nombre debe tener mínimo 10 caracteres y máximo 50");
                System.out.println("El nombre debe tener mínimo 10 caracteres y máximo 50");
            }else{
                this.nombreRev = nombreRev;
            }

        } while (nombreRev == null || nombreRev.trim().isEmpty());
    }

    /**
     * Método que devuelve el detalle de la revisión
     * @return detalleRev
     */
    public String getDetalleRev() {
        return detalleRev;
    }
    
    /**
     * Establece que el detalle de la revisión no exceda los 100 caracteres
     * @param detalleRev
     */
    public void setDetalleRev(String detalleRev) {

            if(detalleRev.length()>100)
                System.out.println("El detalle de la revisión no debe exceder de 100 caracteres");
            else
                this.detalleRev = detalleRev;

    }

    /**
     * Devuelve el estado de la revisión
     * @return estadoRev
     */
    public int getEstadoRev() {
        return estadoRev;
    }

    /**
     * Establece que el estado de la revisión sea un valor entre 1 y 3 siendo 1 sin problemas, 2 con observaciones y 3 no aprueba
     * @param estadoRev
     */
    public void setEstadoRev(int estadoRev) {

            if (estadoRev >= 1 && estadoRev <= 3)
                this.estadoRev = estadoRev;
            else
                System.out.println("Ingrese un valor del estado  entre 1 y 3"
                        +"\n Estado: 1 (sin problemas), 2 (con observaciones), 3 (No aprueba)");

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
                ", estadoRev=" + estadoRev +
                '}';
    }
}
