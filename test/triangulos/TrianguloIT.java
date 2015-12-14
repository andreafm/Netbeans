/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andreas
 */
public class TrianguloIT {
    
    public TrianguloIT() {
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
     * Test of classify method, of class Triangulo.
     */
    @Test
    public void testClassify() {
        System.out.println("Prueba tipo de triangulo.");
        int a = 30;
        int b = 30;
        int c = 30;
        String expResult = "EQUILATERO";
        TrianguloType result = Triangulo.classify(a, b, c);
        assertEquals(TrianguloType.EQUILATERO, result);
        
    }
    
    @Test
    public void testClassify2() {
        System.out.println("Prueba tipo de triangulo.");
        int a = 30;
        int b = 20;
        int c = 30;
        String expResult = "ISOSCELES";
        TrianguloType result = Triangulo.classify(a, b, c);
        assertEquals(TrianguloType.ISOSCELES, result);
        
    }
    
    @Test
    public void testClassify3() {
        System.out.println("Prueba tipo de triangulo.");
        int a = 30;
        int b = 20;
        int c = 20;
        String expResult = "ESCALENO";
        TrianguloType result = Triangulo.classify(a, b, c);
        assertEquals(TrianguloType.ESCALENO, result);
        
    }
}
