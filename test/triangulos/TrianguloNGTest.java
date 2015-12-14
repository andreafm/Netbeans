/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulos;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author andreas
 */
public class TrianguloNGTest {
    
    public TrianguloNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of classify method, of class Triangulo.
     */
    @Test
    public void testClassify() {
        System.out.println("Prueba triangulo TestNG");
        int a = 15;
        int b = 15;
        int c = 15;
        String expResult = "EQUILATERO";
        TrianguloType result = Triangulo.classify(a, b, c);
        assertEquals(TrianguloType.EQUILATERO, result);
        
    }
    
}
