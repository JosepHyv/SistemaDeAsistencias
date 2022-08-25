/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sistemadeasistencias.vistas;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import sistemadeasistencias.vistas.Utilidades;
/**
 * FXML Controller class
 *
 * @author josephy
 */
public class FXMLPantallaPrincipalController implements Initializable {

    @FXML
    private Button btnMisExperiencias;
    @FXML
    private Button btnRegistroAsistencia;
    @FXML
    private Button btnExperiencias;
    @FXML
    private Button btnReporteAsistencia;
    @FXML
    private Button btnCerrarSesion;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clicCerrarSesion(ActionEvent event) {
        Utilidades.mostrarAlertaConfirmacion("Advertencia","¿Seguro que desea cerrar sesión?", Alert.AlertType.CONFIRMATION);
        boolean opcion = Utilidades.getOption().orElse(ButtonType.OK).getButtonData().isDefaultButton();
        if (opcion) {
            try {
                Stage escenarioPrincipal = (Stage) btnCerrarSesion.getScene().getWindow();
                URL url = new File("src/sistemadeasistencias/vistas/FXMLInicioSesion.fxml").toURI().toURL();
                Scene pantallaPrincipal = new Scene(FXMLLoader.load(url));
                escenarioPrincipal.setScene(pantallaPrincipal);
                escenarioPrincipal.setTitle("Sistema de Asistencias");
                escenarioPrincipal.show();
            } catch (IOException e) {
                Utilidades.mostrarAlertaSinConfirmacion("Error", "Error al mostrar ventana", Alert.AlertType.ERROR);
            } catch (IllegalStateException isException){
                Utilidades.mensajeErrorAlCargarLaInformacionDeLaVentana();
                isException.printStackTrace();
            }
        }
    }
    
}
