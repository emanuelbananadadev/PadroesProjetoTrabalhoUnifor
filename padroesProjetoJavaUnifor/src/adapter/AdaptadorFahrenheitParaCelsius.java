package adapter;

public class AdaptadorFahrenheitParaCelsius implements MedidorCelsius {
    private MedidorFahrenhit medidorFahrenhit;

    public AdaptadorFahrenheitParaCelsius(MedidorFahrenhit medidorFahrenhit) {
        this.medidorFahrenhit = medidorFahrenhit;
    }

    @Override
    public double getTemperaturaCelsius() {
        return (medidorFahrenhit.getTemperaturaFahrenheit() - 32) * 5 / 9;
    }
}
