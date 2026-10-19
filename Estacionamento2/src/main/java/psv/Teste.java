/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package psv;

import java.sql.Connection;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        Connection con = Conexao.abrirConexao();

        if (con == null) {
            System.out.println(
                "Não foi possível conectar ao banco de dados."
            );
            return;
        }

        try {
            
            CarroDAO dao = new CarroDAO(con);

            
            List<CarroBean> lista = dao.listarTodos();

            if (lista == null) {
                System.out.println(
                    "Não foi possível consultar os carros."
                );
            } else if (lista.isEmpty()) {
                System.out.println("Nenhum carro cadastrado.");
            } else {
                for (CarroBean item : lista) {
                    System.out.println("Placa: " + item.getPlaca());
                    System.out.println("Cor: " + item.getCor());
                    System.out.println(
                        "Descrição: " + item.getDescricao()
                    );
                    System.out.println("----------------------");
                }
            }

        } finally {
            
            Conexao.fecharConexao(con);
        }
    }
}


