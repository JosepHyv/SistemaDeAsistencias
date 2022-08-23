/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package sistemadeasistencias;

import sistemadeasistencias.accesoBaseDeDatos.conexionBaseDeDatos;
import sistemadeasistencias.modelos.UsuarioDAO;
import sistemadeasistencias.modelos.AcademicoDAO;
import sistemadeasistencias.modelos.EstudianteDAO;
import sistemadeasistencias.pojos.Academico;
import sistemadeasistencias.pojos.Estudiante;
import sistemadeasistencias.pojos.Usuario;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author josephy
 */
public class SistemaDeAsistencias extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("vistas/FXMLInicioSesion.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Sistema De Asistencias");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
