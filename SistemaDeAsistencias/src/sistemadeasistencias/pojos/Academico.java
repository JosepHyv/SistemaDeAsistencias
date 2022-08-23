/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeasistencias.pojos;

/**
 *
 * @author josephy
 */
public class Academico {
    private int idAcademico;
    private int idUsuario;
    private String numeroPersonal;
    private String profesion;

    public Academico() {
        this.idAcademico = -1;
        this.idUsuario = -1;
        this.numeroPersonal = null;
        this.profesion = null;
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
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the numeroPersonal
     */
    public String getNumeroPersonal() {
        return numeroPersonal;
    }

    /**
     * @param numeroPersonal the numeroPersonal to set
     */
    public void setNumeroPersonal(String numeroPersonal) {
        this.numeroPersonal = numeroPersonal;
    }

    /**
     * @return the profesion
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * @param profesion the profesion to set
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
     public String toString() {
       return "Academico{ \n" +
               "idAcademico: "+ this.idAcademico + "\n" +
               "idUsuario: "+ this.idUsuario + "\n" +
               "numeroPersonal: "+ this.numeroPersonal + "\n" +
               "profesion: "+ this.profesion + "\n" +
               "}\n";
    }
}

