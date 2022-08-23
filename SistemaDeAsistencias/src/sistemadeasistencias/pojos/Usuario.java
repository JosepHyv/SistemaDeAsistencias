/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeasistencias.pojos;

import java.sql.SQLException;
/**
 *
 * @author josephy
 */
public class Usuario implements Validable{
    private String idUsuario;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correoInstitucional;
    private String claveIngreso;
    private String idRol;
    
    public Usuario(){
        this.idUsuario = null;
        this.nombres = null;
        this.apellidoPaterno = null;
        this.apellidoMaterno = null;
        this.correoInstitucional = null;
        this.claveIngreso = null;
        this.idRol = null;
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
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidoPaterno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * @param apellidoPaterno the apellidoPaterno to set
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * @return the apellidoMaterno
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * @param apellidoMaterno the apellidoMaterno to set
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * @return the correoInstitucional
     */
    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    /**
     * @param correoInstitucional the correoInstitucional to set
     */
    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    /**
     * @return the claveIngreso
     */
    public String getClaveIngreso() {
        return claveIngreso;
    }

    /**
     * @param claveIngreso the claveIngreso to set
     */
    public void setClaveIngreso(String claveIngreso) {
        this.claveIngreso = claveIngreso;
    }

    /**
     * @return the idRol
     */
    public String getIdRol() {
        return idRol;
    }

    /**
     * @param idRol the idRol to set
     */
    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    @Override
    public String toString() {
       return "Usuario{ \n" +
               "idUsuario: "+ this.idUsuario + "\n" +
               "nombres: "+ this.nombres + "\n" +
               "apellidoPaterno: "+ this.apellidoPaterno + "\n" +
               "apellidoMaterno: "+ this.apellidoMaterno + "\n" +
               "correoInstitucional: "+ this.correoInstitucional + "\n" +
               "idRol: "+ this.idRol + "\n" +
               "}\n";
    }
    
     @Override
    public boolean equals(Object objeto) {
        boolean iguales = false;
        if(objeto == this){
            iguales = true;
        }
        if(objeto != null && objeto instanceof Usuario){
            Usuario secundario = (Usuario) objeto;
            iguales = this.idUsuario.equals(secundario.idUsuario) && 
                    this.nombres.equals(secundario.nombres) &&
                    this.apellidoMaterno.equals(secundario.apellidoMaterno) &&
                    this.apellidoPaterno.equals(secundario.apellidoPaterno);
        }
        return iguales;
    }

   
    
    @Override
    public void validar() throws SQLException, IllegalArgumentException {
        new servidorValidacion().validarUsuario(this);
    }

    
}
