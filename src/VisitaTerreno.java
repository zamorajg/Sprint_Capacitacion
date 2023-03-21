package sprintJavaFinal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que permite el registro de una Visiata en terreno de un Cliente
 * y cuyos atributos son y deben cumplir los siguientes requerimientos:
 * - Identificador de la visita en terreno: obligatorio, número interno manejado
 *   porla compañía.
 * - RUT cliente: obligatorio
 * - Día: fecha del accidente, independiente si lo declara como una fecha o un
 *    String,debe ser desplegado con el formato DD/MM/AAAA
 * - Hora: debe ser una hora válida del día, en formato HH:MM (hora desde
 *   0 a23, minutos entre 0 y 59)
 * - Lugar: obligatorio, mínimo 10 caracteres, máximo 50
 * - Comentarios: máximo 100 caracteres
 *
 */
public class VisitaTerreno {
    private int idVisita;
    private Long rutCliente;
    private String diaAccidente;
    private String hora;
    private String lugar;
    private String comentarios;

    private ArrayList<Revision> listaRevisiones = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    private Revision revision;// Clase que compone a la clase Visita

    /**
     * Constructor sin parametros
     */
    public VisitaTerreno() {
    }

    /**
     * Constructor de la clase con todos sus parametros
     * @param idVisita
     * @param rutCliente
     * @param diaAccidente
     * @param hora
     * @param lugar
     * @param comentarios
     */
    public VisitaTerreno(int idVisita, Long rutCliente, String diaAccidente, String hora, String lugar, String comentarios) {
        this.idVisita = idVisita;
        this.rutCliente = rutCliente;
        this.diaAccidente = diaAccidente;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
        this.revision = new Revision();

    }

    //Métodos Getters y Setters para acceder a cada uno de los atributos
    // de acuerdo a lo descritos en la descripcion de la clase

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public long getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(Long rutCliente) {
        do {

            if (rutCliente <= 99999999) {
                this.rutCliente = rutCliente;
                break;
            }
            else {
                System.out.println("No puede exceder 99.999.999");
                String input = sc.nextLine();
            }
        }while(true);
    }

        public String getDiaAccidente() {
        return diaAccidente;
    }

    /**
     * Método que valida la fecha del accidente en el formato DD/MM/AAAA bajo una expresión regular
     * @param diaAccidente retorna la fecha en el formato indicado
     */
    public void setDiaAccidente(String diaAccidente) {
        do {
            String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";

            if (diaAccidente.matches(regex)) {
                this.diaAccidente = diaAccidente;
                break;
            } else {
                System.out.println("La fecha no es valida, debe ingresarla en este formato DD/MM/AAAA");
                diaAccidente = sc.nextLine();
            }
        }while(true);
    }

    public String getHora() {
        return hora;
    }

    /**
     * Metodo que establece la hora del accidente en el formato DD/MM/AAAA, atraves de una expresión regular
     * @param hora valor del tipo String
     */
    public void setHora(String hora) {
        do {
            String regex = "^(0?[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
            if (hora.matches(regex)) {
                this.hora = hora;
                break;
            } else {
                System.out.println("La hora introducida debe estar en el siguiente formato: HH:MM");
                hora = sc.nextLine();
            }
        }while(true);
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        do {
            if (lugar.length() >= 10 && lugar.length() <= 50) {
                this.lugar = lugar;
            } else {
                System.out.println("Ingrese el lugar de la Visita");
            }
        } while (lugar.trim().isEmpty());
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        if (comentarios.length()>100){
            System.out.println("Debe Ingresar menos de 100 caracteres");
            comentarios = sc.nextLine();}
        else
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

    public void agregarRevision(Revision revision){
        listaRevisiones.add(revision);
    }

		
	}

