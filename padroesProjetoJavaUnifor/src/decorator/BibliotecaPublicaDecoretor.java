package decorator;

public class BibliotecaPublicaDecoretor extends LivroDecorator {

    private boolean boasCondicoes;

    public BibliotecaPublicaDecoretor(BibliotecaBase biblioteca, boolean condicoes) {
        super(biblioteca);
        this.boasCondicoes = condicoes;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "\nEstá em boas condições? " + boasCondicoes;
    }

    @Override
    public double getCusto() {
        return 0.0;
    }
}
