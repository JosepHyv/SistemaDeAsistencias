/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeasistencias.modelos;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import sistemadeasistencias.pojos.Usuario;
import sistemadeasistencias.accesoBaseDeDatos.conexionBaseDeDatos;
import sistemadeasistencias.encriptacion.encriptadorSHA256;
/**
 *
 * @author josephy
 */
public class UsuarioDAO {
    public Usuario obtenerUsuarioPorCorreoYClave(String correo, String claveIngreso) throws SQLException{
        String consulta = "SELECT * FROM Usuario WHERE correoInstitucional = ? AND claveIngreso = ?;";
        Usuario usuarioEncontrado = new Usuario();
        conexionBaseDeDatos baseDeDatos = new conexionBaseDeDatos();
        try{
            baseDeDatos.conectar();
            Connection conexion = baseDeDatos.getConexion();
            PreparedStatement sentencia = conexion.prepareStatement(consulta);
            encriptadorSHA256 encriptador = new encriptadorSHA256();
            sentencia.setString(1,correo);
            sentencia.setString(2, encriptador.encriptarCadena(claveIngreso));
            ResultSet resultado = sentencia.executeQuery();
            if(resultado.next()){
                usuarioEncontrado.setIdUsuario(String.valueOf(resultado.getInt("idUsuario")));
                usuarioEncontrado.setNombres(resultado.getString("nombres"));
                usuarioEncontrado.setApellidoPaterno(resultado.getString("apellidoPaterno"));
                usuarioEncontrado.setApellidoMaterno(resultado.getString("apellidoMaterno"));
                usuarioEncontrado.setCorreoInstitucional(resultado.getString("correoInstitucional"));
                usuarioEncontrado.setIdRol(String.valueOf(resultado.getInt("idRol")));
            }
        } finally{
            baseDeDatos.desconectar();
        }
        
        return usuarioEncontrado;
        
    }
}
