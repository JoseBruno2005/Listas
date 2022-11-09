package Model;

public class ProdutoModel {

    String nome;
    float preco;
    int porDesconto;

    int estoque;

    public ProdutoModel(String nome, float preco, int porDesconto, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.porDesconto = porDesconto;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPorDesconto() {
        return porDesconto;
    }

    public void setPorDesconto(int porDesconto) {
        this.porDesconto = porDesconto;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "ProdutoModel{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", porDesconto=" + porDesconto +
                ", estoque=" + estoque +
                '}';
    }
}
