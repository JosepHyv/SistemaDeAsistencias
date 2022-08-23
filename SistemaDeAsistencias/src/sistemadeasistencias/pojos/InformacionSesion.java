package sistemadeasistencias.pojos;

/**
 *
 * @author josephy
 */

import java.util.Date;

public class  InformacionSesion {
    private String nombreRol;
    private static InformacionSesion instancia;
    
    private InformacionSesion() {
    }

    public static InformacionSesion getInformacionSesion(){
        if(instancia == null){
            instancia = new InformacionSesion();
        }
        return instancia;
    }
    public String getGlobalRol() {
        return this.nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
    
}