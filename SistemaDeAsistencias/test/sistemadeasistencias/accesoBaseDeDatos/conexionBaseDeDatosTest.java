/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package sistemadeasistencias.accesoBaseDeDatos;

import java.sql.Connection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.apiguardian.api;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author josephy
 */
public class conexionBaseDeDatosTest {
    
    public conexionBaseDeDatosTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getConexion method, of class conexionBaseDeDatos.
     */
    @Test
    public void testGetConexion() throws Exception {
        System.out.println("getConexion");
        conexionBaseDeDatos instance = new conexionBaseDeDatos();
        Connection expResult = null;
        Connection result = instance.getConexion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conectar method, of class conexionBaseDeDatos.
     */
    @Test
    public void testConectar() throws Exception {
        System.out.println("conectar");
        conexionBaseDeDatos instance = new conexionBaseDeDatos();
        instance.conectar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaConectado method, of class conexionBaseDeDatos.
     */
    @Test
    public void testEstaConectado() throws Exception {
        System.out.println("estaConectado");
        conexionBaseDeDatos instance = new conexionBaseDeDatos();
        boolean expResult = false;
        boolean result = instance.estaConectado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desconectar method, of class conexionBaseDeDatos.
     */
    @Test
    public void testDesconectar() throws Exception {
        System.out.println("desconectar");
        conexionBaseDeDatos instance = new conexionBaseDeDatos();
        instance.desconectar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
