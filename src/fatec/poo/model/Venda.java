/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.List;

/**
 *
 * @author Kaique
 */
public class Venda {

    private long idVenda;
    private double valorVenda;
    private List<ProdutoVenda> produtoVebda;
    private Cliente clienteVenda;
    private double valorTotalVenda;

    public long getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(long idVenda) {
        this.idVenda = idVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public List<ProdutoVenda> getProdutoVebda() {
        return produtoVebda;
    }

    public void setProdutoVebda(List<ProdutoVenda> produtoVebda) {
        this.produtoVebda = produtoVebda;
    }

    public Cliente getClienteVenda() {
        return clienteVenda;
    }

    public void setClienteVenda(Cliente clienteVenda) {
        this.clienteVenda = clienteVenda;
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

}
