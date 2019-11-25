/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.time.LocalDate;

/**
 *
 * @author Kaique
 */
public class Pagamento {

    private int numPagamento;
    private int formaPagamento;
    private double valorPagamento;
    private LocalDate dataPagamento ;
    private Funcionario funcionarioOperador ;
    private int numCaixa;
    private Pedido numPedido;
    private Venda venda;

    
    public int getNumPagamento() {
        return numPagamento;
    }

    public void setNumPagamento(int numPagamento) {
        this.numPagamento = numPagamento;
    }

    public int getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(int formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Funcionario getFuncionarioOperador() {
        return funcionarioOperador;
    }

    public void setFuncionarioOperador(Funcionario funcionarioOperador) {
        this.funcionarioOperador = funcionarioOperador;
    }

    public int getNumCaixa() {
        return numCaixa;
    }

    public void setNumCaixa(int numCaixa) {
        this.numCaixa = numCaixa;
    }

    public Pedido getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(Pedido numPedido) {
        this.numPedido = numPedido;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    
    

}
