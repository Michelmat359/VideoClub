/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel Angel Mateo
 */
public class FormularioTest {
    
    public FormularioTest() {
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
     * Test of actionPerformed method, of class Formulario.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        Formulario instance = new Formulario();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBlanco method, of class Formulario.
     */
    @Test
    public void testSetBlanco() {
        System.out.println("setBlanco");
        JTextField idPeliculaTF = null;
        JTextField tituloTF = null;
        JTextField temaTF = null;
        JTextField duracionTF = null;
        JTextField precioTF = null;
        Formulario.setBlanco(idPeliculaTF, tituloTF, temaTF, duracionTF, precioTF);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of creaInstancia method, of class Formulario.
     */
    @Test
    public void testCreaInstancia() {
        System.out.println("creaInstancia");
        JTextField idPeliculaTF = null;
        JTextField tituloTF = null;
        JTextField temaTF = null;
        JTextField duracionTF = null;
        JTextField precioTF = null;
        Pelicula expResult = null;
        Pelicula result = Formulario.creaInstancia(idPeliculaTF, tituloTF, temaTF, duracionTF, precioTF);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
