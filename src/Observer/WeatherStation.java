package Observer;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation extends Thread {
    private final List<Observer> observers = new ArrayList<>();
    private final Random random = new Random();

    private double temperature;

    public WeatherStation (){
        temperature = random.nextInt(61)- 20;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer : observers ){
            observer.update();
        }
    }

    public double getTemperature(){
        return temperature;
    }

    @Override
    public void run() {
        while (true){
            try {
                int seconds = random.nextInt(5) + 1;
                Thread.sleep(seconds * 1000);

                int change;
                if(random.nextBoolean()){
                    change = 1;
                }else {
                    change = -1;
                }

                double minTemperature = -20;
                double maxTemperature = 40;
                if (temperature + change >= minTemperature && temperature + change <= maxTemperature){
                    temperature += change;
                }
                notifyObservers();



            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;

            }
        }
    }

}
