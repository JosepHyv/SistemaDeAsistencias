/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeasistencias.modelos;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import sistemadeasistencias.accesoBaseDeDatos.conexionBaseDeDatos;
import sistemadeasistencias.pojos.Roles;
/**
 *
 * @author josephy
 */
public class RolesDAO {
    public Roles obtenerRolPorId(int idRol) throws SQLException{
        Roles rolEncontrado = new Roles();
        String consulta = "SELECT * FROM Roles WHERE idRol = ?";
        conexionBaseDeDatos baseDeDatos = new conexionBaseDeDatos();
        try{
            baseDeDatos.conectar();
            Connection conexion = baseDeDatos.getConexion();
            PreparedStatement sentencia = conexion.prepareStatement(consulta);
            sentencia.setInt(1, idRol);
            ResultSet resultado = sentencia.executeQuery();
            if(resultado.next()){
                rolEncontrado.setIdRol(idRol);
                rolEncontrado.setNombreRol(resultado.getString("nombreRol"));
            }
        }finally{
            baseDeDatos.desconectar();
        }
        return rolEncontrado;
    }
}
