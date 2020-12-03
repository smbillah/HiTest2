/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitest2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author smbillah
 */
public class HiTest2Test {

    public HiTest2Test() {
    }

    /**
     * Test of main method, of class HiTest2.
     */
    @Test
    public void testMain() {
    }

    /**
     * Test of addition method, of class HiTest2.
     */
    @Test
    public void testAdditionSimple() {
        // define expected behavior
        int a = 0;
        int b = 0;
        int expected_result = 0;

        // create an instance of the class under testing
        HiTest2 ht = new HiTest2();
        
        // generate result from the function under testing
        int test_result = ht.addition(a, b);

        // create an instance of the class under testing
        assertEquals(expected_result, test_result); 
    }

    @Test
    public void testAdditionMultiple() {
        // define expected behavior
        int[] as = new int[]{1, 4, 5, 6};
        int[] bs = new int[]{5, 8, 12, 7};
        int[] expected_results = new int[]{6, 12, 17, 13};

        // create an instance of the class under testing
        HiTest2 ht = new HiTest2();
        
        // generate results from the function under testing
        int[] test_results = new int[expected_results.length];
        
        for (int i = 0; i < 4; i++) {
            test_results[i] = ht.addition(as[i], bs[i]);
        }
        
        // compare expected results with test results
        assertArrayEquals(expected_results, test_results);
        
    }

    @Test
    public void testisEven() {
        // define expected behavior
        int[] a = new int[]{2, 1, 0, 100, 5};
        boolean[] expected_results = new boolean[]{true, false, true, true, false};

        // create an instance of the class under testing
        HiTest2 ht = new HiTest2();
        
        // generate results from the function under testing
        boolean[] test_results = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            test_results[i] = ht.isEven(a[i]);
        }

        // compare expected results with test results
        assertArrayEquals(expected_results, test_results);
    }

}
