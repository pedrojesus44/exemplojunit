package com.mycompany.exemplojunit;

public class Principal 
{
    public static void main(String[] args) 
    {
      ConexaoMySQL conexaoMySQL = new ConexaoMySQL();
      
      conexaoMySQL.conecta();
      
      conexaoMySQL.desconecta();

    }
}
