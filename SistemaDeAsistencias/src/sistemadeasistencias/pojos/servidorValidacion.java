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
public class servidorValidacion {
    public void validarUsuario(Validable objeto) throws SQLException, IllegalArgumentException{
        if (objeto!= null && objeto instanceof Usuario){
            Usuario usuarioAValidar = (Usuario) objeto;
            
        }
    }
}
