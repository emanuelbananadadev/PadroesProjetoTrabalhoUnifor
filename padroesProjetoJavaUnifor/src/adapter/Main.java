package adapter;

public class Main {
    public static void main(String[] args) {
        MedidorFahrenhit medidorFahrenhit = new MedidorFahrenhit(89.6);
        MedidorCelsius medidorCelsius = new AdaptadorFahrenheitParaCelsius(medidorFahrenhit);

        System.out.println("Temperatura em Celsius: " + medidorCelsius.getTemperaturaCelsius());
    }

    //Adapter: Permite que classes com interfaces incompatíveis funcionem juntas, agindo como um tradutor.
}
