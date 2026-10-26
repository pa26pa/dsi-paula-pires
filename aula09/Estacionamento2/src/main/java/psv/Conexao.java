/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

/**
 *
 * @author Camargo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
    

public class Conexao {
    
    public static Connection abrirConexao() {
        String url = "jdbc:mysql://localhost:3306/estacionamento";
        
        String usuario = "root";
        String senha = "";
        
        try {
            return DriverManager.getConnection(
                url, usuario, senha
            );
        
        } catch (SQLException e) {
            System.out.println("Erro ao conectar BD: " + e.getMessage());
            return null;
        }
    }
    
    public static void fecharConexao(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(
                    "Erro ao fechar conexão: "
                    + e.getMessage()
                );
            }
        } 
    }
    
}   
