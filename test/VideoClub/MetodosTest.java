/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoClub;

import VideoClub.Metodos;
import com.db4o.ObjectContainer;
import objeto.Pelicula;
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
public class MetodosTest {
    
    public MetodosTest() {
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
     * Test of anyadePelicula method, of class Metodos.
     */
    @Test
    public void testAnyadePelicula() {
        System.out.println("anyadePelicula");
        ObjectContainer miConexion = null;
        Pelicula miPelicula = null;
        String expResult = "";
        String result = Metodos.anyadePelicula(miConexion, miPelicula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaPelicula method, of class Metodos.
     */
    @Test
    public void testConsultaPelicula_ObjectContainer_Pelicula() {
        System.out.println("consultaPelicula");
        ObjectContainer miConexion = null;
        Pelicula miPelicula = null;
        String expResult = "";
        String result = Metodos.consultaPelicula(miConexion, miPelicula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaPelicula method, of class Metodos.
     */
    @Test
    public void testConsultaPelicula_ObjectContainer_String() {
        System.out.println("consultaPelicula");
        ObjectContainer miConexion = null;
        String idPeliculaTexto = "";
        String expResult = "";
        String result = Metodos.consultaPelicula(miConexion, idPeliculaTexto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaPeliculas method, of class Metodos.
     */
    @Test
    public void testListaPeliculas() {
        System.out.println("listaPeliculas");
        ObjectContainer miConexion = null;
        String expResult = "";
        String result = Metodos.listaPeliculas(miConexion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarPelicula method, of class Metodos.
     */
    @Test
    public void testBorrarPelicula() {
        System.out.println("borrarPelicula");
        ObjectContainer miConexion = null;
        String idPeliculaTexto = "";
        String expResult = "";
        String result = Metodos.borrarPelicula(miConexion, idPeliculaTexto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarPelicula method, of class Metodos.
     */
    @Test
    public void testActualizarPelicula() {
        System.out.println("actualizarPelicula");
        ObjectContainer miConexion = null;
        Pelicula laPelicula = null;
        Metodos.actualizarPelicula(miConexion, laPelicula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cerrarConexion method, of class Metodos.
     */
    @Test
    public void testCerrarConexion() {
        System.out.println("cerrarConexion");
        ObjectContainer miConexion = null;
        Metodos.cerrarConexion(miConexion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
