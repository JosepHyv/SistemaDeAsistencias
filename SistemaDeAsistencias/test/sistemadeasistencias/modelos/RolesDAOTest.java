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
import sistemadeasistencias.pojos.Roles;

/**
 *
 * @author josephy
 */
public class RolesDAOTest {
    
    public RolesDAOTest() {
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
     * Test of obtenerRolPorId method, of class RolesDAO.
     */
    @Test
    public void testObtenerRolPorIdProfesor() throws Exception {
        System.out.println("obtenerRolPorId Profesor");
        int idRol = 1;
        RolesDAO instance = new RolesDAO();
        Roles expResult = new Roles();
        expResult.setIdRol(1);
        expResult.setNombreRol("Profesor");
        Roles result = instance.obtenerRolPorId(idRol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
    @Test
    public void testObtenerRolPorIdEstudiante() throws Exception {
        System.out.println("obtenerRolPorId Estudiante");
        int idRol = 2;
        RolesDAO instance = new RolesDAO();
        Roles expResult = new Roles();
        expResult.setIdRol(2);
        expResult.setNombreRol("Estudiante");
        Roles result = instance.obtenerRolPorId(idRol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
    @Test
    public void testObtenerRolPorIdInexistente() throws Exception {
        System.out.println("obtenerRolPorId Inexistente");
        int idRol = 3;
        RolesDAO instance = new RolesDAO();
        Roles expResult = new Roles();
        Roles result = instance.obtenerRolPorId(idRol);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
