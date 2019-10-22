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
    private long codProduto;
    private String descricao;
    private String preco;
    private String tipo;

    public ProdutoDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Produto produto) throws SQLException {

        String sql = "INSERT INTO produto (cod_produto,descricao,preco,tipo) VALUES (?,?,?,?)";

        PreparedStatement prepara = connection.prepareStatement(sql);

        prepara.setInt(1, (int) produto.getCodProduto());
        prepara.setString(2, produto.getDescricao());
        prepara.setString(4, produto.getTipo());
        prepara.setDouble(3, produto.getPreco());
        prepara.execute();
        prepara.close();

    }
    
    public List<Produto> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setCodProduto(rs.getInt("cod_produto"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setTipo(rs.getString("tipo"));
                produto.setPreco(rs.getDouble("preco"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //ConnectionFactory.closeConnection(con, stmt, rs);
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
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setCodProduto(rs.getInt("cod_produto"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setTipo(rs.getString("tipo"));
                produto.setPreco(rs.getDouble("preco"));
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
