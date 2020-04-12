package observer.publisher;

import observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Publisher {
    private List<Observer> observers;

    private double temperature;
    private double windSpeed;
    private double pressure;

    public List<Observer> getObservers() {
        return observers;
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

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
        notifyObservers();
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
        notifyObservers();
    }

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this.temperature, this.windSpeed, this.pressure);
        }
    }
}
