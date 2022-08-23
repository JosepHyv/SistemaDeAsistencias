/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeasistencias.pojos;

import java.sql.Time;
/**
 *
 * @author josephy
 */
public class Horario {
    private int idHorario;
    private String dia;
    private Time horaInicio;
    private Time horaFin;
    private int nrc;

    public Horario() {
        this.idHorario = -1;
        this.dia = null;
        this.horaInicio = null;
        this.horaFin = null;
        this.nrc = -1;
    }
    
    

    /**
     * @return the idHorario
     */
    public int getIdHorario() {
        return idHorario;
    }

    /**
     * @param idHorario the idHorario to set
     */
    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the horaInicio
     */
    public Time getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return the horaFin
     */
    public Time getHoraFin() {
        return horaFin;
    }

    /**
     * @param horaFin the horaFin to set
     */
    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
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
       return "Horario{ \n" +
               "idHorario: "+ this.idHorario + "\n" +
               "dia: "+ this.dia + "\n" +
               "horaInicio: "+ this.horaInicio + "\n" +
               "horaFin: "+ this.horaFin + "\n" +
               "nrc: "+ this.nrc + "\n" +
               "}\n";
    }
}
