package decorator;

public class BibliotecaParticularDecoretor extends  LivroDecorator {

    public BibliotecaParticularDecoretor(BibliotecaBase biblioteca) {
        super(biblioteca);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "\nFaz parte de uma biblioteca particular";
    }

    @Override
    public double getCusto() {
        return super.getCusto() * 2;
    }
}
