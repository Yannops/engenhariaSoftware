/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.DAO;

import fatec.poo.factory.ConnectionFactory;
import fatec.poo.model.Cliente;
import fatec.poo.model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Kaique
 */
public class ClienteDao {

    private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    String bairro;
    String rua;
    String cidade;
    long numero;

    public ClienteDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Cliente cliente, Endereco endereco) {
        String sql = "INSERT INTO cliente (nome,cpf,email,telefone,bairro,rua,cidade,numero,observacao) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpfCnpj());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getTelefone());
            stmt.setString(5, endereco.getBairro());
            stmt.setString(6, endereco.getRua());
            stmt.setString(7, endereco.getCidade());
            stmt.setInt(8, (int) endereco.getNumero());
            stmt.setString(9, cliente.getObservalcao());

            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
/*        }catch(MySQLIntegrityConstraintViolationException ex){
*/
    }

    public void delete(Cliente c) {

        String sql = "DELETE FROM cliente WHERE id  = (SELECT id FROM cliente WHERE cpf = ?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, c.getCpfCnpj());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Deletado com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Aconteceu algum Erro !");
        }
    }

    public void Update(Cliente c, Endereco e) {

        String sql = "UPDATE cliente SET nome  =? ,cpf = ?,email = ?,telefone=?,bairro=?,rua=?,cidade=?,numero=?,observacao=? where id = (SELECT id from cliente where nome = ?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCpfCnpj());
            stmt.setString(3, c.getEmail());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, e.getBairro());
            stmt.setString(6, e.getRua());
            stmt.setString(7, e.getCidade());
            stmt.setInt(8, (int) e.getNumero());
            stmt.setString(9, c.getObservalcao());
            stmt.setString(10, c.getNome());
            stmt.executeUpdate();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Aconteceu algum Erro !");
        }
    }

    public List<Cliente> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();
        List<Endereco> enderecos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE nome LIKE ?");
            stmt.setString(1, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente cli = new Cliente();
                Endereco end = new Endereco();

                cli.setNome(rs.getString("nome"));
                cli.setCpfCnpj(rs.getString("cpf"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setEmail(rs.getString("email"));
                cli.setObservalcao(rs.getString("observacao"));
                end.setBairro(rs.getString("bairro"));
                end.setCidade(rs.getString("cidade"));
                end.setRua(rs.getString("rua"));
                end.setNumero(rs.getInt("numero"));
                cli.adiciona(end);
                clientes.add(cli);
                System.out.println("");

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //   ConnectionFactory.closeConnecttion(con, stmt, rs);
        }

        return clientes;
    }

}
