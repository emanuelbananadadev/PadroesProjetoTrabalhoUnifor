package decorator;

public class Main {
    public static void main(String[] args) {
        BibliotecaBase biblioteca = new BibliotecaBase("Machado de Assis", 10);
        System.out.println(biblioteca.getDescricao() + " - R$" + biblioteca.getCusto());

        BibliotecaPublicaDecoretor publica = new BibliotecaPublicaDecoretor(biblioteca, true);
        System.out.println(publica.getDescricao() + " - R$" + publica.getCusto());

        BibliotecaParticularDecoretor particular = new BibliotecaParticularDecoretor(biblioteca);
        System.out.println(particular.getDescricao() + " - R$" + particular.getCusto());
    }

    //Decorator: Adiciona funcionalidades a um objeto dinamicamente sem alterar a classe original.
}
