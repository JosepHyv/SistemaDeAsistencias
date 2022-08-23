
package sistemadeasistencias.accesoBaseDeDatos;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josephy
 */
public class conexionBaseDeDatosTest {
    
    public conexionBaseDeDatosTest() {
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
  

    @Test
    public void testGetConexion() throws Exception {
        System.out.println("test conexion exitosa");
        conexionBaseDeDatos instance = new conexionBaseDeDatos();
        Connection expResult = null;
        instance.conectar();
        Connection result = instance.getConexion();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of conectar method, of class conexionBaseDeDatos.
     */
    /**
     * Test of estaConectado method, of class conexionBaseDeDatos.
     */
    @Test
    public void testEstaConectado() throws Exception {
        System.out.println("esta actualmente conectado");
        conexionBaseDeDatos instance = new conexionBaseDeDatos();
        boolean expResult = true;
        instance.conectar();
        boolean result = instance.estaConectado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testNoEstaConectado() throws Exception {
        System.out.println("esta actualmente desconectado");
        conexionBaseDeDatos instance = new conexionBaseDeDatos();
        boolean expResult = false;
        boolean result = instance.estaConectado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of desconectar method, of class conexionBaseDeDatos.
     */
    @Test
    public void testDesconectar() throws Exception {
        System.out.println("desconectar");
        conexionBaseDeDatos instance = new conexionBaseDeDatos();
        instance.desconectar();
        Connection estatusEsperado = null;
        Connection estatusObtenido = instance.getConexion();
        String conectado = instance.estaConectado()?"True":"false";
        System.out.println(conectado);
        assertEquals(estatusEsperado, estatusObtenido);
        // TODO review the generated test code and remove the default call to fail.

    }
}
