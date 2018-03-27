/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zed.banco.tests.principal;

import com.zed.banco.principal.Conta;
import com.zed.banco.principal.ContaCorrente;
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
public class ContaCorrenteTest {
    
    public ContaCorrenteTest() {
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
     * Test of sacar method, of class ContaCorrente.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        double valor = 0.0;
        ContaCorrente instance = null;
        boolean expResult = false;
        boolean result = instance.sacar(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of depositar method, of class ContaCorrente.
     */
    @Test
    public void testDepositar() {
        System.out.println("depositar");
        double valor = 0.0;
        ContaCorrente instance = null;
        instance.depositar(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transferir method, of class ContaCorrente.
     */
    @Test
    public void testTransferir() {
        System.out.println("transferir");
        double valor = 0.0;
        Conta outraConta = null;
        ContaCorrente instance = null;
        instance.transferir(valor, outraConta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
