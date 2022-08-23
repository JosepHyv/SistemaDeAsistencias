/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeasistencias.encriptacion;

/**
 *
 * @author josephy
 */

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class encriptadorSHA256 {
    public String encriptarCadena(String contraseniaTextoPlano) {
        String contraseniaEncriptada = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.reset();
            digest.update(contraseniaTextoPlano.getBytes("utf8"));
            contraseniaEncriptada = String.format("%064x", new BigInteger(1, digest.digest()));
        } catch (NoSuchAlgorithmException nsaException) {
            Logger.getLogger(encriptadorSHA256.class.getName()).log(Level.SEVERE, null, nsaException);
        } catch (UnsupportedEncodingException ueException) {
            Logger.getLogger(encriptadorSHA256.class.getName()).log(Level.SEVERE, null, ueException);
        }
        return contraseniaEncriptada;
    }
}
