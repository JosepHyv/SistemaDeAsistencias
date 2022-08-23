/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeasistencias.pojos;

/**
 *
 * @author josephy
 */
public class Estudiante {
    private int idEstudiante;
    private String idUsuario;
    private String matricula;
    
    public Estudiante(){
        this.idEstudiante = -1;
        this.idUsuario = null;
        this.matricula = null;
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
     * @return the idUsuario
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public String toString() {
       return "Usuario{ \n" +
               "idEstudiante: "+ this.idEstudiante + "\n" +
               "idUsuario: "+ this.idUsuario + "\n" +
               "matricula: "+ this.matricula  +"\n" +
               "}\n";
    }
}
