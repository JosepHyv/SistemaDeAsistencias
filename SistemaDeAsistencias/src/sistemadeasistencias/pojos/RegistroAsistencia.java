/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeasistencias.pojos;

import java.time.LocalDate;

/**
 *
 * @author josephy
 */
public class RegistroAsistencia {
    private int idAsistencia;
    private LocalDate fecha;
    private int idEstudiante;
    private int nrc;

    public RegistroAsistencia() {
        this.idAsistencia = -1;
        this.fecha = null;
        this.idEstudiante = -1;
        this.nrc = -1;
    }

    /**
     * @return the idAsistencia
     */
    public int getIdAsistencia() {
        return idAsistencia;
    }

    /**
     * @param idAsistencia the idAsistencia to set
     */
    public void setIdAsistencia(int idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    /**
     * @return the fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the idEstudiante
     */
    public int getIdEstudiante() {
        return idEstudiante;
    }

    /**
     * @param idEstudiante the idEstudiante to set
     */
    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    /**
     * @return the nrc
     */
    public int getNrc() {
        return nrc;
    }

    /**
     * @param nrc the nrc to set
     */
    public void setNrc(int nrc) {
        this.nrc = nrc;
    }
    
    public String toString() {
       return "RegistroAsistencia{ \n" +
               "idAsistencia: "+ this.idAsistencia + "\n" +
               "fecha: "+ this.fecha + "\n" +
               "idEstudiante: "+ this.idEstudiante + "\n" +
               "nrc: "+ this.nrc + "\n" +
               "}\n";
    }
    
    
    
}
