
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
    private String direccionBD;
    private String usuario;
    private String contrasenia;

    public Connection getConexion() throws SQLException {
        return conexion;
    }
    
    public void cargarConfiguracion(){
        FileInputStream archivoConfiguracion = null;
        try{
            Path CURRENT_FILE = Paths.get("");
            String directorio = CURRENT_FILE.toAbsolutePath().toString();
            directorio = Paths.get(directorio, "src", "sistemadeasistencias", "accesoBaseDeDatos", "configuracionAcceso.txt").toString();
            URL url = new File(directorio).toURI().toURL();
            archivoConfiguracion = new FileInputStream(new File(url.getPath()));
            Properties atributos = new Properties();
            atributos.load(archivoConfiguracion);
            archivoConfiguracion.close();
            Class.forName("java.sql.Driver");
            this.direccionBD = atributos.getProperty("DireccionBD");
            this.usuario = atributos.getProperty("Usuario");
            this.contrasenia = atributos.getProperty("Contrasenia");
            
        } catch (FileNotFoundException fnfException) {
            Logger.getLogger(conexionBaseDeDatos.class.getName()).log(Level.SEVERE, null, fnfException);
        } catch (IOException ioException) {
            Logger.getLogger(conexionBaseDeDatos.class.getName()).log(Level.SEVERE, null, ioException);
        } catch (ClassNotFoundException cnfException) {
            Logger.getLogger(conexionBaseDeDatos.class.getName()).log(Level.SEVERE, null, cnfException);
        }
    }
    
    public void conectar() throws SQLException {        
        this.cargarConfiguracion();
        this.conexion = DriverManager.getConnection(this.direccionBD, this.usuario, this.contrasenia);
    
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
