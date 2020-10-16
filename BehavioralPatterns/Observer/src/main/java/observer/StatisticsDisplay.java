package observer;

import subject.Subject;

import java.util.ArrayList;
import java.util.Collections;

public class StatisticsDisplay implements Observer, DisplayElement{
    private float minTemp;
    private float maxTemp;
    private float avgTemp;
    private ArrayList<Float> temps = new ArrayList<>();
    private Subject subject;

    public StatisticsDisplay(Subject subject) {
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

    private void setAvgTemp() {
        this.avgTemp = (float) temps.stream().mapToDouble(Float::doubleValue).summaryStatistics().getAverage();
    }

    private void setMinTemp() {
        this.minTemp = Collections.min(temps);
    }

    private void setMaxTemp() {
        this.maxTemp = Collections.max(temps);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + avgTemp + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        temps.add(temp);
        setAvgTemp();
        setMinTemp();
        setMaxTemp();
        display();
    }
}
