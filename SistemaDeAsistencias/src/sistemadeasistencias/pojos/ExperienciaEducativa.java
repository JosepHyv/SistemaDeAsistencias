/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeasistencias.pojos;

/**
 *
 * @author josephy
 */
public class ExperienciaEducativa {
    private int nrc;
    private String nombreExperiencia;
    private String escuela;

    public ExperienciaEducativa(){
        this.nrc = -1;
        this.nombreExperiencia = null;
        this.escuela = null;
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

    /**
     * @return the nombreExperiencia
     */
    public String getNombreExperiencia() {
        return nombreExperiencia;
    }

    /**
     * @param nombreExperiencia the nombreExperiencia to set
     */
    public void setNombreExperiencia(String nombreExperiencia) {
        this.nombreExperiencia = nombreExperiencia;
    }

    /**
     * @return the escuela
     */
    public String getEscuela() {
        return escuela;
    }

    /**
     * @param escuela the escuela to set
     */
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    
    @Override
    public String toString() {
       return "ExperienciaEducativa{ \n" +
               "nrc: "+ this.nrc + "\n" +
               "nombreExperiencia: "+ this.nombreExperiencia + "\n" +
               "escuela: "+ this.escuela + "\n" +
               "}\n";
    }
}
