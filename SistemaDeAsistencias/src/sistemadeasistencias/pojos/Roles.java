/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeasistencias.pojos;

/**
 *
 * @author josephy
 */
public class Roles {
    private int idRol;
    private String nombreRol;
    
    public Roles(){
        this.idRol = -1;
        this.nombreRol = null;
    }

    /**
     * @return the idRol
     */
    public int getIdRol() {
        return idRol;
    }

    /**
     * @param idRol the idRol to set
     */
    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    /**
     * @return the nombreRol
     */
    public String getNombreRol() {
        return nombreRol;
    }

    /**
     * @param nombreRol the nombreRol to set
     */
    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
    
    @Override
    public String toString() {
       return "Roles{ \n" +
               "idRol: "+ this.idRol + "\n" +
               "nombreRol: "+ this.nombreRol + "\n" +
               "}\n";
    }
    
    @Override
    public boolean equals(Object objeto) {
        boolean iguales = false;
        if(objeto == this){
            iguales = true;
        }
        if(objeto != null && objeto instanceof Roles){
            Roles secundario = (Roles) objeto;
            iguales = this.idRol == secundario.idRol && 
                    this.nombreRol != null && secundario.nombreRol != null &&
                    this.nombreRol.equals(secundario.nombreRol);
        }
        return iguales;
    }
    
}
