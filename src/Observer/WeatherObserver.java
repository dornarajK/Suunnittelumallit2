package Observer;

public class WeatherObserver implements Observer{
    private final String name;
    private final WeatherStation weatherStation;

    public WeatherObserver(String name, WeatherStation station) {
        this.name = name;
        this.weatherStation = station;
        weatherStation.addObserver(this);
    }

    @Override
    public void update() {
        double temperature = weatherStation.getTemperature();
        System.out.println(name + ": Current temperature is "
                + temperature
                + " °C");
    }

}
