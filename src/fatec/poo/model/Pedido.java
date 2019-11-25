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
public class Pedido {

    private int codPedido;
    private LocalDate date;
    Cliente codCliente;
    Funcionario codVendedor;
    Produto produto;

    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Cliente getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Cliente codCliente) {
        this.codCliente = codCliente;
    }

    public Funcionario getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(Funcionario codVendedor) {
        this.codVendedor = codVendedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}
