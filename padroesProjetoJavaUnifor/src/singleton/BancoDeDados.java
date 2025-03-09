package singleton;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    private static BancoDeDados instanciaUnica;
    private List<String> dados;

    private BancoDeDados() {
        dados = new ArrayList<>();
    }

    public static BancoDeDados getInstance() {
        if(instanciaUnica == null) {
            instanciaUnica = new BancoDeDados();
        }
        return instanciaUnica;
    }

    public void salvarDados(String dado) {
        dados.add(dado);
        System.out.println("Dado salvo: " + dado);
    }

    public void listarDados() {
        System.out.println("Dados no banco: " + dados);
    }
}
