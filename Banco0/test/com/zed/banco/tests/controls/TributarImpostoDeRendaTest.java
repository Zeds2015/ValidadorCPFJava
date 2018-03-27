/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zed.banco.tests.controls;

import com.zed.banco.principal.ContaPoupanca;
import com.zed.banco.controls.TributarImpostoDeRenda;
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
public class TributarImpostoDeRendaTest {
    
    public TributarImpostoDeRendaTest() {
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
     * Test of tributarImpostos method, of class TributarImpostoDeRenda.
     */
    @Test
    public void testTributarImpostos() {
        System.out.println("tributarImpostos");
        ContaPoupanca cp = null;
        TributarImpostoDeRenda instance = new TributarImpostoDeRenda();
        instance.tributarImpostos(cp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalTributado method, of class TributarImpostoDeRenda.
     */
    @Test
    public void testGetTotalTributado() {
        System.out.println("getTotalTributado");
        double expResult = 0.0;
        double result = TributarImpostoDeRenda.getTotalTributado();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
