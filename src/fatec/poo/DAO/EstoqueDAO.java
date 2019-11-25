
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

    public Estoque consultaProdutoEstoque(int codProd) throws SQLException {
        Estoque e = new Estoque();;
        int retorno = 0;
        String query = "SELECT cod_produto,quant,saindo FROM estoque WHERE cod_produto = " + codProd + "";
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt = con.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        e.setQuantidade(rs.getInt("quant"));
        e.setCod_produto(rs.getInt("cod_produto"));
        e.setSaindo(rs.getInt("saindo"));
        stmt.close();
        return e;
    }

    public Estoque quantidadeSaindo(Estoque e) throws SQLException {
        String sql = "SELECT saindo from ESTOQUE where cod_produto = " + e.getCod_produto() + "";
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        e.setSaindo(rs.getInt("saindo"));

        return e;
    }

    public Estoque saindoProduto(Estoque e) throws SQLException {
        String sql = "UPDATE estoque SET saindo = ? where cod_produto = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, e.getSaindo());
        stmt.setInt(2, e.getCod_produto());
        stmt.execute();
        stmt.close();
        return e;
    }

    public Estoque transitoPedidoItemPed(int codProd) {

        return null;
    }

    public void adicionaSaindo(Estoque e) throws SQLException {
        
        String sql = "INSERT INTO saida_estoque VALUES(?,?,?,?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, e.getCod());
        stmt.setInt(2, e.getCod());
        stmt.setString(3, e.getDescricao());
        stmt.setInt(4, e.getQuantidade());
        stmt.setDouble(5, e.getPreco());
        stmt.setString(6, e.getData());
     
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
