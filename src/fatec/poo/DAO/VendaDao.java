/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.DAO;

import fatec.poo.factory.ConnectionFactory;
import fatec.poo.model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Kaique
 */
public class VendaDao {

    private Connection connection;

    public VendaDao() {
        this.connection = new ConnectionFactory().getConnection();

    }

    public void insertPedido(Venda v) throws SQLException {
        String sql = "INSERT INTO venda VALUES (?,?,?,?,?) ";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, (int) v.getIdVenda());
        stmt.setInt(2, v.getIdPedido().getCodPedido());
        stmt.setDouble(3, v.getValorTotalVenda());
        stmt.setDate(4, java.sql.Date.valueOf(v.getData()));
        stmt.setInt(5, v.getCodPagamento());
        stmt.execute();
        stmt.close();
    }
    
    
    /*
     // insert into venda values (1,1,20,'2019-11-11',1)

     public void adicionaPedido(Pedido pedido) {
     String sql = "INSERT INTO Pedido_ted  VALUES(?,?,?,?)";
     try {
     PreparedStatement stmt = connection.prepareStatement(sql);
     stmt.setInt(1, pedido.getCodPedido());
     stmt.setDate(2, java.sql.Date.valueOf(pedido.getDate()));
     System.out.println(" "+java.sql.Date.valueOf(pedido.getDate()));
     if (pedido.getCodCliente() == null) {
     stmt.setInt(3, 0);
     } else {
     stmt.setInt(3, pedido.getCodCliente().getId());
     }
     stmt.setLong(4, pedido.getCodVendedor().getId());
     stmt.execute();
     stmt.close();
     } catch (SQLException u) {
     throw new RuntimeException(u);
     }
     }
     */
    // insert into venda values (1,1,20,'2019-11-11',1)

}
