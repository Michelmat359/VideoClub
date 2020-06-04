/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

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
public class PeliculaTest {
    
    public PeliculaTest() {
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
     * Test of setIdPelicula method, of class Pelicula.
     */
    @Test
    public void testSetIdPelicula() {
        System.out.println("setIdPelicula");
        int idPelicula = 0;
        Pelicula instance = null;
        instance.setIdPelicula(idPelicula);
    // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Pelicula.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Pelicula instance = null;
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTema method, of class Pelicula.
     */
    @Test
    public void testSetTema() {
        System.out.println("setTema");
        String tema = "";
        Pelicula instance = null;
        instance.setTema(tema);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuracion method, of class Pelicula.
     */
    @Test
    public void testSetDuracion() {
        System.out.println("setDuracion");
        int duracion = 0;
        Pelicula instance = null;
        instance.setDuracion(duracion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Pelicula.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 0.0;
        Pelicula instance = null;
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdPelicula method, of class Pelicula.
     */
    @Test
    public void testGetIdPelicula() {
        System.out.println("getIdPelicula");
        Pelicula instance = null;
        int expResult = 0;
        int result = instance.getIdPelicula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class Pelicula.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Pelicula instance = null;
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTema method, of class Pelicula.
     */
    @Test
    public void testGetTema() {
        System.out.println("getTema");
        Pelicula instance = null;
        String expResult = "";
        String result = instance.getTema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuracion method, of class Pelicula.
     */
    @Test
    public void testGetDuracion() {
        System.out.println("getDuracion");
        Pelicula instance = null;
        int expResult = 0;
        int result = instance.getDuracion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Pelicula.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Pelicula instance = null;
        double expResult = 0.0;
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Pelicula.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Pelicula instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
