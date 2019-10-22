/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Kaique
 */
public class Venda {

    private long idVenda;
    private double valorVenda;
    private ProdutoVenda produtoVebda;
    private Cliente clienteVenda;

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

    public ProdutoVenda getProdutoVebda() {
        return produtoVebda;
    }

    public void setProdutoVebda(ProdutoVenda produtoVebda) {
        this.produtoVebda = produtoVebda;
    }

    public Cliente getClienteVenda() {
        return clienteVenda;
    }

    public void setClienteVenda(Cliente clienteVenda) {
        this.clienteVenda = clienteVenda;
    }

}
