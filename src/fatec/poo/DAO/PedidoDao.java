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
import javax.swing.JOptionPane;

/**
 *
 * @author Kaique
 */
public class PedidoDao {

    private Connection connection;

    public void SelecionaDireto(Produto pruduto) {

        String sql = "SELECT cod_produto, descricao, preco, tipo, imagem  FROM produto  WHERE cod_produto = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.close();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Aconteceu algum Erro !");
        }
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
