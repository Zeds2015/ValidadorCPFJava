/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zed.banco.tests.utils;

import com.zed.banco.utils.ValidadorDeCpf;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2016101383
 */
public class ValidadorDeCpfTest {
    
    public ValidadorDeCpfTest() {
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
     * Test of GetCpf method, of class ValidadorDeCpf.
     */
    @Test
    public void testGetCpf() {
        System.out.println("GetCpf");
        ValidadorDeCpf instance = null;
        String expResult = "";
        String result = instance.GetCpf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
