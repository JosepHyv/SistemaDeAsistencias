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
public interface Validable {
    public void validar() throws SQLException, IllegalArgumentException;
    
}
