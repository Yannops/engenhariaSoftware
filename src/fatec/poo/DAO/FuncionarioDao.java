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
import java.sql.ResultSet;
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
        String sql = "INSERT INTO funcionario (nome, cpf, dt_Nascimento, cargo, senha) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCPF());
            stmt.setString(3, funcionario.getDataNascimento());
            stmt.setLong(4, funcionario.getCargo());
            stmt.setString(5, funcionario.getSenha());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public int tamPesquisa(String nome){
        String sqlTam = "SELECT count(*) FROM funcionario WHERE nome like ?";
        try {
            int tam = 0;
            PreparedStatement stmt = connection.prepareStatement(sqlTam);
            stmt.setString(1, nome+"%");
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                tam = rs.getInt("count(*)");
            }
            
            return tam;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public Funcionario[] pesquisar(String nome) {
        Funcionario[] funcionario;
        String sql = "SELECT * FROM funcionario WHERE nome like ?";
        try {
            
            int tam = tamPesquisa(nome);
            funcionario = new Funcionario[tam];
            int i = 0;
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome+"%");
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                funcionario[i] = new Funcionario();
                funcionario[i].setId(rs.getLong("id_funcionario"));
                funcionario[i].setNome(rs.getString("nome"));
                funcionario[i].setCPF(rs.getString("cpf"));
                funcionario[i].setCargo(rs.getLong("cargo"));
                funcionario[i].setDataNascimento(rs.getString("dt_Nascimento"));
                i++;
            }
            
            stmt.close();
            return funcionario;
                
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public void deletar(String cpf) {
        String sql = "DELETE FROM funcionario WHERE cpf = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.executeUpdate();
            
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public void alterar(Funcionario f, String cpf){
        String sql = "UPDATE funcionario SET nome = ?, cargo = ?, cpf = ?, dt_Nascimento = ? WHERE cpf = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, f.getNome());
            stmt.setLong(2, f.getCargo());
            stmt.setString(3, f.getCPF());
            stmt.setString(4, f.getDataNascimento());
            stmt.setString(5, cpf);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public Funcionario verificarLogin(String CPF, String senha){
        Funcionario funcionario = null;
        ResultSet rs = null;
        String sql = "select * from funcionario where cpf = ? and senha = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, CPF);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();
            
            if(rs.isBeforeFirst()){
                funcionario = new Funcionario();
                
                while(rs.next()){
                    funcionario.setId(rs.getLong("id_funcionario"));
                    funcionario.setNome(rs.getString("nome"));
                    funcionario.setCargo(rs.getLong("cargo"));
                    funcionario.setCPF(rs.getString("cpf"));
                    funcionario.setDataNascimento(rs.getString("dt_Nascimento"));
                    funcionario.setSenha(rs.getString("senha"));
                }
                return funcionario;
            }else{
                return funcionario;
            }
            
            
            
        } catch (Exception e) {
            
        }
        
        
        return funcionario;
        
    }
}
