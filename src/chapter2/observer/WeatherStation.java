package chapter2.observer;

public class WeatherStation {
    public static void main(String[] args) {
//        WeatherData weatherData = new WeatherData();
//        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

        WeatherDataOvservable weatherDataOvservable = new WeatherDataOvservable();
        CurrentConditionDisplayObserver currentDisplay = new CurrentConditionDisplayObserver(weatherDataOvservable);

//        weatherData.setMeasurements(80, 65, 30.2f);
//        weatherData.setMeasurements(77, 60, 45f);

        weatherDataOvservable.setMeasurements(80, 65, 30.2f);
        weatherDataOvservable.setMeasurements(77, 60, 45f);
    }
}
