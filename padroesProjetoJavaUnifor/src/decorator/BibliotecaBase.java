package decorator;

public class BibliotecaBase implements Livro {
    private String nome;
    private double valor;

    public BibliotecaBase(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String getDescricao() {
        return "Livro: " + nome;
    }

    @Override
    public double getCusto() {
        return valor;
    }
}
