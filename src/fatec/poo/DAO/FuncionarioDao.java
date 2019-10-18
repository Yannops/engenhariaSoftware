/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.DAO;

import fatec.poo.factory.ConnectionFactory;
import fatec.poo.model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Kaique
 */
public class FuncionarioDao {

    private Connection connection;

    String nome;
    String CPF;
    String dataNascimento;
    String  cargo;

    public FuncionarioDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Funcionario funcionario) {
        String sql = "INSERT INTO funcionarios  (nome,cpf,dt_Nascimento,cargo_nome) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCPF());
            stmt.setString(3, funcionario.getDataNascimento());
            stmt.setString(4, funcionario.getCargo());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }

}
