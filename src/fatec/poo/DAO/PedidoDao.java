/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.DAO;

import fatec.poo.factory.ConnectionFactory;
import fatec.poo.model.Cliente;
import fatec.poo.model.Estoque;
import fatec.poo.model.ItensPedido;
import fatec.poo.model.Pedido;
import fatec.poo.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author Kaique
 */
public class PedidoDao {

    private Connection connection;
    int codPedido;
    LocalDate date;
    int cod_cliente;
    int cod_vendedor;

    public PedidoDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void saindoProduto(Estoque e) throws SQLException {
        String sql = "UPDATE estoque SET saindo = ? where cod_produto = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, e.getSaindo());
        stmt.setInt(2, e.getCod_produto());
        stmt.execute();
        stmt.close();
    }

    public void deletandoItenVenda(ItensPedido ip) {
        //  String sql = ""
    }

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

    public void inserteClientePedido(Cliente c, Pedido p) throws SQLException {
        String sql = "UPDATE pedido_ted SET cli_cod =  ? WHERE ped_num  = ? ";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, c.getId());
        stmt.setInt(2, p.getCodPedido());
        stmt.execute();
        stmt.close();

    }

    public void adicionarItemPedido(ItensPedido ip) throws SQLException {
        String sql = "INSERT INTO item_pedido (ped_num,prod_cod,item_ped_quant,val_unit) VALUES  (?,?,?,?)";

        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, ip.getCodPedido());
        stmt.setInt(2, ip.getCodProduto());
        stmt.setInt(3, ip.getQuantidade());
        stmt.setDouble(4, ip.getValor());
        stmt.execute();
        stmt.close();
    }

    public Pedido retornaUltimoPedido() throws SQLException {
        Pedido p = new Pedido();
        int retorno = 0;
        String query = "SELECT MAX(ped_num) as MAIOR FROM PEDIDO_TED";
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt = con.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        System.out.println("");
        p.setCodPedido(rs.getInt("MAIOR"));
        stmt.close();
        return p;
    }

}
