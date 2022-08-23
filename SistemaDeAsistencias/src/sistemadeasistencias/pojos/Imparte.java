/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeasistencias.pojos;

/**
 *
 * @author josephy
 */
public class Imparte {
    private int idImparte;
    private int idAcademico;
    private int nrc;
    
    public Imparte(){
        this.idAcademico = -1;
        this.idImparte = -1;
        this.nrc = -1;
    }

    /**
     * @return the idImparte
     */
    public int getIdImparte() {
        return idImparte;
    }

    /**
     * @param idImparte the idImparte to set
     */
    public void setIdImparte(int idImparte) {
        this.idImparte = idImparte;
    }

    /**
     * @return the idAcademico
     */
    public int getIdAcademico() {
        return idAcademico;
    }

    /**
     * @param idAcademico the idAcademico to set
     */
    public void setIdAcademico(int idAcademico) {
        this.idAcademico = idAcademico;
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
       return "Imparte{ \n" +
               "idImparte: "+ this.idImparte + "\n" +
               "idAcademico: "+ this.idAcademico + "\n" +
               "nrc: "+ this.nrc + "\n" +
               "}\n";
    }
}
