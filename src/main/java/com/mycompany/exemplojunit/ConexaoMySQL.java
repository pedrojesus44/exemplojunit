package com.mycompany.exemplojunit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoMySQL 
{
    private final static String DRIVER = "com.mysql.jdbc.Driver";
    private final static String URL = "jdbc:mysql://localhost:3306/banco_etec";
    private final static String USUARIO = "root";
    private final static String SENHA = "usbw";
    private Connection conexao;

    public boolean conecta()
    {
        //aqui utilizamos as variaveis de entrada para iniciar a conexão com o banco
        //Caso a conexão não tenha sucesso, exibe uma mensagem de erro ao usuário
        boolean result = true;
        
        try 
        {
            Class.forName(DRIVER);
            
            conexao = DriverManager.getConnection(URL , USUARIO , SENHA); 
            
            JOptionPane.showMessageDialog(null, "Conexão com o banco realizada com sucesso!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            
            result = true;
        } 
        catch (ClassNotFoundException erro)
        {
            JOptionPane.showMessageDialog(null, "Driver não localizado.", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            
            result = false;
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Fonte de dados não localizada.", "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            
            result = false;
        }
        return result;
    }
    
    public void desconecta()
    {
        //aqui nós iremos finalizar a conexão com o banco, caso seja chamada
        
        try 
        {
            conexao.close();
            
            JOptionPane.showMessageDialog(null, "Conexão com o banco fechada", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);    
        } 
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão.", "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }

}

