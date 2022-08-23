
package sistemadeasistencias.accesoBaseDeDatos;

/**
 *
 * @author josephy
 */

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class conexionBaseDeDatos {
    private Connection conexion;

    public Connection getConexion() throws SQLException {
        return conexion;
    }

    public void conectar() throws SQLException {
        try {
            // usando directorios  generales for win ||  unix like systems

            Path CURRENT_FILE = Paths.get("");
            String directorio = CURRENT_FILE.toAbsolutePath().toString();
            directorio = Paths.get(directorio, "src", "sistemadeasistencias", "accesoBaseDeDatos", "configuracionAcceso.txt").toString();
            URL url = new File(directorio).toURI().toURL();
            FileInputStream archivoConfiguracion = new FileInputStream(new File(url.getPath()));
            Properties atributos = new Properties();
            atributos.load(archivoConfiguracion);
            archivoConfiguracion.close();
            Class.forName("java.sql.Driver");
            String direccionBD = atributos.getProperty("DireccionBD");
            String usuario = atributos.getProperty("Usuario");
            String contrasenia = atributos.getProperty("Contrasenia");
            conexion = DriverManager.getConnection(direccionBD, usuario, contrasenia);
        } catch (FileNotFoundException fnfException) {
            Logger.getLogger(conexionBaseDeDatos.class.getName()).log(Level.SEVERE, null, fnfException);
        } catch (IOException ioException) {
            Logger.getLogger(conexionBaseDeDatos.class.getName()).log(Level.SEVERE, null, ioException);
        } catch (ClassNotFoundException cnfException) {
            Logger.getLogger(conexionBaseDeDatos.class.getName()).log(Level.SEVERE, null, cnfException);
        }
    }
    
    public boolean estaConectado() throws SQLException{
        return (this.conexion != null);
    }

    public void desconectar() throws SQLException {
        if (conexion != null)
            if(!this.conexion.isClosed()) {
            this.conexion.close();
        }
    }
    
}
