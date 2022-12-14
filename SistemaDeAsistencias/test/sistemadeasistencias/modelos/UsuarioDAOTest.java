/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package sistemadeasistencias.modelos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sistemadeasistencias.pojos.Usuario;
import java.sql.SQLException;

/**
 *
 * @author josephy
 */
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of obtenerUsuarioPorCorreoYClave method, of class UsuarioDAO.
     */
    @Test
    public void testObtenerUsuarioPorCorreoYClave() throws SQLException {
        System.out.println("obtenerUsuarioPorCorreoYClave");
        String correo = "spiderman@uv.mx";
        String claveIngreso = "password";
        UsuarioDAO instance = new UsuarioDAO();
        Usuario expResult = new Usuario();
        expResult.setIdUsuario("1");
        expResult.setNombres("Peter");
        expResult.setApellidoPaterno("Benjamin");
        expResult.setApellidoMaterno("Parker");
        expResult.setCorreoInstitucional(correo);
        expResult.setIdRol("1");
        expResult.setClaveIngreso("5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8");
        Usuario result = instance.obtenerUsuarioPorCorreoYClave(correo, claveIngreso);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
