package observer;

import subject.Subject;

/**
 * the observer gets pushed information rather than go get it
 * subject field is not used - can be used if in the future the observer wants to be unsubscribed
 */
public class CurrentConditionDisplay implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private Subject subject;

    public CurrentConditionDisplay(Subject weatherData) {
        registerSubject(weatherData);
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
        System.out.println("Current conditions: " + temp + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
