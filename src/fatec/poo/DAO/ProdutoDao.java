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
import java.sql.SQLException;

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
        prepara.setString(3, produto.getTipo());
        prepara.setDouble(4, produto.getPreco());
        prepara.execute();
        prepara.close();
    }

}
