package Observer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WeatherStation station = new WeatherStation();
        WeatherObserver observer1 = new WeatherObserver("Observer 1", station);
        WeatherObserver observer2 = new WeatherObserver("Observer 2", station);


        station.start();
        Thread.sleep(15000);

        System.out.println("\nRemoving Observer 1...\n");

        station.removeObserver(observer1);

        System.out.println("\nRemoving Observer 2...\n");

        station.removeObserver(observer2);


        Thread.sleep(15000);

        System.out.println("\nSimulation finished.");
        System.exit(0);


    }
}
