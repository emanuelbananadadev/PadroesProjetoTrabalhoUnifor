package singleton;

public class Main {
    public static void main(String[] args) {
        BancoDeDados banco1 = BancoDeDados.getInstance();
        banco1.salvarDados("User1");
        banco1.salvarDados("User2");

        BancoDeDados banco2 = BancoDeDados.getInstance();
        banco2.listarDados();

        System.out.println("As instancias são iguais? " + (banco1 == banco2));
    }

    //Singleton: Garante que uma classe tenha apenas uma instância global no sistema.
}
