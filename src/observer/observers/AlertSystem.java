package observer.observers;

import observer.publisher.Publisher;

public class AlertSystem implements Observer {
    private double temperature;
    private double windSpeed;
    private double pressure;

    private Publisher publisher;

    public AlertSystem(Publisher publisher) {
        // Subscribe
        this.publisher = publisher;
        publisher.registerObserver(this);
    }

    @Override
    public void update(double temperature, double windSpeed, double pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;

        if (temperature < 0 || temperature > 40) {
            alert();
        }
    }

    public void unsubscribe() {
        publisher.removeObserver(this);
    }

    public void alert() {
        System.out.println("ALERT! Temperature is out of normal ranges!");
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
