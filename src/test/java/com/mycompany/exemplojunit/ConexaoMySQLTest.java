/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplojunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ConexaoMySQLTest 
{
    
    public ConexaoMySQLTest() 
    {
      
    }

    @Test
    public void testConecta() 
    {
        System.out.println("Testando conecta");
        ConexaoMySQL instance = new ConexaoMySQL();
        boolean expResult = true;
        boolean result = instance.conecta();
        assertEquals(expResult , result);
    }

    @Test
    public void testDesconecta() {
        System.out.println("Testando desconecta");
        ConexaoMySQL instance = new ConexaoMySQL();
        instance.conecta();
        instance.desconecta();
    }

}