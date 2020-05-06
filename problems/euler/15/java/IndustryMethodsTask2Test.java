/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package industrymethodstask2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author omser
 */
public class IndustryMethodsTask2Test {
    
    public IndustryMethodsTask2Test() {
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
     * Test of main method, of class IndustryMethodsTask2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        //IndustryMethodsTask2.main(args);
    }

    /**
     * Test of pathfinder method, of class IndustryMethodsTask2.
     */
    @Test
    public void testPathfinder() {
        System.out.println("pathfinder");
        int x = 20;
        int y = 20;
        long expResult = 137846528820L;
        long result;
        result = IndustryMethodsTask2.pathfinder(x, y);
        assertEquals(expResult, result);
    }
    
}
