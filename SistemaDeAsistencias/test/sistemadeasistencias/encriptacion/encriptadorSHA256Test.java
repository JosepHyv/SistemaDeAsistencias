/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package sistemadeasistencias.encriptacion;

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
public class encriptadorSHA256Test {
    
    public encriptadorSHA256Test() {
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
     * Test of encriptarCadena method, of class encriptadorSHA256.
     */
    @Test
    public void testEncriptarCadena() {
        System.out.println("encriptar Cadena correctamente");
        String contraseniaTextoPlano = "una_contra_segura";
        encriptadorSHA256 instance = new encriptadorSHA256();
        String expResult = "38b170441cab7331eb1a522a2fe234dcb62ad712e4d3cb0415387502f256b955";
        String result = instance.encriptarCadena(contraseniaTextoPlano);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testEncriptarCadenaTrivial() {
        System.out.println("encriptar Cadena trivial correctamente");
        String contraseniaTextoPlano = "password";
        encriptadorSHA256 instance = new encriptadorSHA256();
        String expResult = "5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8";
        String result = instance.encriptarCadena(contraseniaTextoPlano);
        assertEquals(expResult, result);
        
    }
    
    
    
}
