/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sistemadeasistencias.vistas;

import java.io.File;
import java.io.IOException;
import javafx.event.ActionEvent;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sistemadeasistencias.encriptacion.encriptadorSHA256;
import sistemadeasistencias.modelos.UsuarioDAO;
import sistemadeasistencias.modelos.RolesDAO;
import sistemadeasistencias.modelos.AcademicoDAO;
import sistemadeasistencias.modelos.EstudianteDAO;
import sistemadeasistencias.pojos.Usuario;

/**
 * FXML Controller class
 *
 * @author josephy
 */
public class FXMLInicioSesionController implements Initializable {

    @FXML
    private TextField tfCorreo;
    @FXML
    private Label lbCorreo;
    @FXML
    private Label lbClave;
    @FXML
    private PasswordField pfClave;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clicIniciarSesion(ActionEvent event) {
        try {

            lbCorreo.setText("");
            lbClave.setText("");

            String correoInstitucional = tfCorreo.getText();
           
            String claveIngreso = pfClave.getText();
            boolean isValid = false;

            if (correoInstitucional.isEmpty()) {
                lbCorreo.setText("El campo es obligatorio");
                isValid = false;
            }

            if (claveIngreso.isEmpty()) {
                lbClave.setText("El campo es obligatorio");
                isValid = false;
            }
            
            encriptadorSHA256 encriptado = new encriptadorSHA256();
            UsuarioDAO usuarioActual = new UsuarioDAO();
            Usuario usuarioObtenido = usuarioActual.obtenerUsuarioPorCorreoYClave(correoInstitucional, claveIngreso);
            
            String correoObtenido = usuarioObtenido.getCorreoInstitucional();
            String contraseniaObtanida = usuarioObtenido.getClaveIngreso();
            String claveEncriptada = encriptado.encriptarCadena(claveIngreso);
            isValid = (correoObtenido.equals(correoInstitucional)) && (contraseniaObtanida.equals(claveEncriptada));

            if (isValid) {
                Utilidades.mostrarAlertaSinConfirmacion("Aviso", "Bienvenido(a).", Alert.AlertType.INFORMATION);
             //   InformacionSesion.getInformacionSesion().setNombreRol(usuarioObtenido.getGlobalNombreRol());
                irPantallaPrincipal();
            } else {
                Utilidades.mostrarAlertaSinConfirmacion("Error",
                        "El correo inistitucional y/o contraseña son incorrectos", Alert.AlertType.WARNING);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FXMLInicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void irPantallaPrincipal() {
        
        Stage escenarioPrincipal = (Stage) tfCorreo.getScene().getWindow();
        try {
            URL url = new File("FXMLPantallaPrincipal.fxml").toURI().toURL();
            Scene pantallaPrincipal = new Scene(FXMLLoader.load(url));
            escenarioPrincipal.setScene(pantallaPrincipal);
            escenarioPrincipal.setTitle("Sistema De Asistencias");
            escenarioPrincipal.show();
        } catch (IOException ioException) {
            Utilidades.mensajeErrorAlCargarLaInformacionDeLaVentana();
            ioException.printStackTrace();
        } catch (IllegalStateException isException) {
            Utilidades.mensajeErrorAlCargarLaInformacionDeLaVentana();
            isException.printStackTrace();
        }

    }

}
