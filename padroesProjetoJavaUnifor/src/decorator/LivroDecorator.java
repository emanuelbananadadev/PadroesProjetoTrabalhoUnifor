package decorator;

abstract class LivroDecorator implements Livro {
    protected BibliotecaBase biblioteca;

    public LivroDecorator(BibliotecaBase biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public String getDescricao() {
        return biblioteca.getDescricao();
    }

    @Override
    public double getCusto() {
        return biblioteca.getCusto();
    }
}
