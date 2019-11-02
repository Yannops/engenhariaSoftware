/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.DAO;

import fatec.poo.factory.ConnectionFactory;
import fatec.poo.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kaique
 */
public class ProdutoDao {

    private Connection connection;
    private int codProduto;
    private String descricao;
    private double preco;
    private String tipo;
    private byte[] imagem;

    public ProdutoDao() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public Produto buscaimagem(int cod) throws SQLException{
        Produto retorno = null;
        String sql = "SELECT imagem, cod_produto from produto where cod_produto = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        try {
            stmt.setInt(1, cod);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                retorno = new Produto();
                retorno.setImagem(rs.getBytes("imagem"));
            }
        } catch (Exception e) {
        }
       return retorno;
    }

    public void adiciona(Produto produto) throws SQLException {

        String sql = "INSERT INTO produto (cod_produto,descricao,preco,tipo,imagem) VALUES (?,?,?,?,?)";

        PreparedStatement prepara = connection.prepareStatement(sql);

        prepara.setInt(1, (int) produto.getCodProduto());
        prepara.setString(2, produto.getDescricao());
        prepara.setString(4, produto.getTipo());
        prepara.setString(3, produto.getPreco());
        prepara.setBytes(5,  produto.getImagem());
        prepara.executeUpdate();
        prepara.close();

    }

    public void update(Produto produto, int cod) throws SQLException {

        String sql = "UPDATE produto SET cod_produto = ? , descricao = ?, preco = ?, imagem = ? where cod_produto = ?";

        try {
            PreparedStatement prepara = connection.prepareStatement(sql);

            prepara.setInt(1, produto.getCodProduto());
            prepara.setString(2, produto.getDescricao());
            prepara.setString(3, produto.getPreco());
            prepara.setBytes(4, produto.getImagem());
            prepara.setInt(5, cod);
            prepara.executeUpdate();
            prepara.close();

        } catch (SQLException a) {
            throw new RuntimeException(a);
        }

    }

    public void exclui(Produto produto) throws SQLException {
        String sql = "DELETE FROM produto where cod_produto = ?";

        try {
            PreparedStatement prepara = connection.prepareStatement(sql);
            prepara.setInt(1, produto.getCodProduto());
            prepara.executeUpdate();
            prepara.close();
        } catch (SQLException a) {
            throw new RuntimeException(a);
        }
    }

    public List<Produto> read() {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt;
        ResultSet rs;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setCodProduto(rs.getInt("cod_produto"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setTipo(rs.getString("tipo"));
                produto.setPreco(rs.getString("preco"));
               
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;

    }

    public List<Produto> readforCod(int cod) {
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto where cod_produto = ?");
            stmt.setInt(1, cod);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodProduto(rs.getInt("cod_produto"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setTipo(rs.getString("tipo"));
                produto.setPreco(rs.getString("preco"));
                produtos.add(produto);
            }

        } catch (SQLException a) {
            throw new RuntimeException(a);
        }
        return produtos;
    }

    public List<Produto> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE descricao LIKE ?");
            stmt.setString(1, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setCodProduto(rs.getInt("cod_produto"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setTipo(rs.getString("tipo"));
                produto.setPreco(rs.getString("preco"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //   ConnectionFactory.closeConnecttion(con, stmt, rs);
        }

        return produtos;
    }

    

}
