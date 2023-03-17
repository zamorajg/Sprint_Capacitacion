package sprint;

public class visitaTerreno {
    private int idVisita;
    private Integer rutCliente;
    private String diaAccidente;
    private String hora;
    private String lugar;
    private String comentarios;

    private Revision revision;

    /**
     * Método constructor vacío
     */
    public visitaTerreno() {
    }
    
    /**
     * Método constructor con parámetros
     * @param idVisita
     * @param rutCliente
     * @param diaAccidente
     * @param hora
     * @param lugar
     * @param comentarios
     */
    public visitaTerreno(int idVisita, Integer rutCliente, String diaAccidente, String hora, String lugar, String comentarios) {
        this.idVisita = idVisita;
        this.rutCliente = rutCliente;
        this.diaAccidente = diaAccidente;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
        this.revision = new Revision();

    }

    /**
     * Metodo que retorna la ID de la visita
     * @return idVisita
     */
    public int getIdVisita() {
        return idVisita;
    }

    /**
     * Metodo que establece la ID de la visita
     * @param idVisita
     */
    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }
    
    /**
     * Metodo que retorna el rut del cliente
     * @return rutCliente
     */
    public long getRutCliente() {
        return rutCliente;
    }

    /**
     * Metodo que establece que el rut del cliente no puede ser mayor a 99.999.999
     * @param rutCliente
     */
    public void setRutCliente(Integer rutCliente) {
        do {

            if (rutCliente <= 99999999) {
                this.rutCliente = rutCliente;
            }
            else {
                System.out.println("No puede exceder 99.999.999");
            }
        }while(rutCliente==null);
    }

    	/**
    	 * Metodo que retorna el Dia del accidente
    	 * @return diaAccidente
    	 */
        public String getDiaAccidente() {
        return diaAccidente;
    }

    /**
     * Metodo que valida la fecha del accidente en el formato DD/MM/AAAA bajo una expresión regular
     * @param diaAccidente retorna la fecha en el formato indicado
     */
    public void setDiaAccidente(String diaAccidente) {
        String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";

        if (diaAccidente.matches(regex)) {
            this.diaAccidente = diaAccidente;
        }
        else {
            System.out.println("La fecha no es valida, debe ingresarla en este formato DD/MM/AAAA");
        }

    }
    
    /**
     * Metodo que retorna la hora del accidente
     * @return hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * Metodo que establece la hora del accidente en el formato DD/MM/AAAA, atraves de una expresión regular
     * @param hora valor del tipo String
     */
    public void setHora(String hora) {
        String regex = "^(0?[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
        if (hora.matches(regex)) {
            this.hora = hora;
        }
        else {
            System.out.println("La hora introducida debe estar en el siguiente formato: HH:MM");
        }
    }
    
    /**
     *Metodo que retorna el lugar 
     * @return lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Metodo que establece el lugar
     * @param lugar
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * Metodo que retorna los comentarios
     * @return
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * Metodo que establece que comentarios no superen los 100 caracteres
     * @param comentarios
     */
    public void setComentarios(String comentarios) {
        if (comentarios.length()>100)
            this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "visitaTerreno{" +
                "idVisita=" + idVisita +
                ", rutCliente='" + rutCliente + '\'' +
                ", diaAccidente='" + diaAccidente + '\'' +
                ", hora='" + hora + '\'' +
                ", Lugar='" + lugar + '\'' +
                ", Comentarios='" + comentarios + '\'' +
                '}';
    }
}
