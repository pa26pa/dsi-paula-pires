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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class CarroDAO {

    private Connection con;

    public CarroDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String inserir(CarroBean carro) {

        String sql = "INSERT INTO carro (placa, cor, descricao) "
                   + "VALUES (?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getDescricao());
            if (ps.executeUpdate() > 0) {
                return "Carro inserido com sucesso!";
            } else {
                return "Não foi possível inserir o carro.";
            }

        } catch (SQLException e) {
            return "Erro ao inserir: " + e.getMessage();
        }
    }

    public String alterar(CarroBean carro) {

        String sql = "UPDATE carro SET cor = ?, descricao = ? "
                   + "WHERE placa = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, carro.getCor());
            ps.setString(2, carro.getDescricao());
            ps.setString(3, carro.getPlaca());

            if (ps.executeUpdate() > 0) {
                return "Carro alterado :) :) :)!";
            } else {
                return "Nenhum carro encontrado :( :( :(";
            }

        } catch (SQLException e) {
            return "Erro ao alterar: " + e.getMessage();
        }
    }

    public String excluir(CarroBean carro) {

        String sql = "DELETE FROM carro WHERE placa = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, carro.getPlaca());

            if (ps.executeUpdate() > 0) {
                return "Carro excluído com sucesso!";
            } else {
                return "Nenhum carro encontrado com essa placa.";
            }

        } catch (SQLException e) {
            return "Erro ao excluir: " + e.getMessage();
        }
    }

    public List<CarroBean> listarTodos() {

        String sql = "SELECT placa, cor, descricao FROM carro";

        
        List<CarroBean> listaCarro = new ArrayList<>();

        try (PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            
            while (rs.next()) {

                
                CarroBean carro = new CarroBean();

                
                carro.setPlaca(rs.getString("placa"));
                carro.setCor(rs.getString("cor"));
                carro.setDescricao(rs.getString("descricao"));

                
                listaCarro.add(carro);
            }

            
            return listaCarro;

        } catch (SQLException e) {
            System.out.println("Errooooooo ao listar carros: "
                               + e.getMessage());

            return null;
        }
    }
}
