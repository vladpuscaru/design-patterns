package observer.observers;

import observer.publisher.Publisher;

public class Logger implements Observer {
    private double temperature;
    private double windSpeed;
    private double pressure;

    private Publisher publisher;

    public Logger(Publisher publisher) {
        // Subscribe
        this.publisher = publisher;
        publisher.registerObserver(this);
    }

    @Override
    public void update(double temperature, double windSpeed, double pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;

        log();
    }

    public void unsubscribe() {
        publisher.removeObserver(this);
    }

    public void log() {
        System.out.println("Logging: T: " + temperature + " | " + "WS: " + windSpeed + " | " + "P: " + pressure + ";");
    }

    public double getTemperature() {
        return temperature;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double getPressure() {
        return pressure;
    }
}
