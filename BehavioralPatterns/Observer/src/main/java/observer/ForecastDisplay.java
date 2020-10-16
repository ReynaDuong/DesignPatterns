package observer;

import subject.Subject;

public class ForecastDisplay implements Observer, DisplayElement{
    private float currentPressure = 29.2f;
    private float lastPressure;
    private Subject subject;

    public ForecastDisplay(Subject subject) {
        registerSubject(subject);
    }

    private void registerSubject(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    private void unregisterSubject() {
        subject.removeObserver(this);
        subject = null;
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}
