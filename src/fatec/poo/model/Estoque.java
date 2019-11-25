package fatec.poo.model;

/**
 *
 * @author Group
 */
public class Estoque {

    private int cod;
    private int cod_produto;
    private String descricao;
    private int quantidade;
    private double preco;
    private String data;
    private int saindo;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getSaindo() {
        return saindo;
    }

    public void setSaindo(int saindo) {
        this.saindo = saindo;
    }

}
