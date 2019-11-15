/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.DAO;

import java.sql.Connection;
import fatec.poo.factory.ConnectionFactory;
import fatec.poo.model.Estoque;
import fatec.poo.model.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Group
 */
public class EstoqueDAO {

    private Connection connection;

    int cod;
    String descricao;
    String dataentrada;
    double preco;
    int quantidade;

    public EstoqueDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Estoque estoque) {
        String sql = "INSERT INTO entrada_produto VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, estoque.getCod());
            stmt.setInt(2, estoque.getCod_produto());
            stmt.setString(3, estoque.getDescricao());
            stmt.setInt(4, estoque.getQuantidade());
            stmt.setDouble(5, estoque.getPreco());
            stmt.setString(6, estoque.getData());   
            stmt.execute();
            stmt.close();
        } catch (SQLException a) {
            System.out.println(a);
        }

    }

    public List<Produto> lêbancoproduto() {
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt;
        ResultSet rs;

        List<Produto> produtos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT cod_produto, descricao, preco_venda from produto");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();

                produto.setCodProduto(rs.getInt("cod_produto"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getDouble("preco_venda"));

                produtos.add(produto);
            }
        } catch (SQLException a) {
            System.out.println(a);
        }
        return produtos;
    }

    public List<Estoque> lêbancoestoque() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt;
        ResultSet rs;

        List<Estoque> estoques = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT cod_produto, descricao, quant, preco_compra from estoque");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Estoque estoque = new Estoque();

                estoque.setCod_produto(rs.getInt("cod_produto"));
                estoque.setDescricao(rs.getString("descricao"));
                estoque.setPreco(rs.getDouble("preco_compra"));
                estoque.setQuantidade(rs.getInt("quant"));

                estoques.add(estoque);
            }
        } catch (SQLException a) {
            throw new RuntimeException(a);
        }
        return estoques;
    }

}
