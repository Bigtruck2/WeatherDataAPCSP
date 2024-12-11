import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Double> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 99.1,142d,85d,85.1,84.6,94.3,124.9,98d,101d,102.5);
        WeatherData weatherData = new WeatherData(arrayList);
        weatherData.cleanData(85d,120d);
        System.out.println(arrayList);
        arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 100.5,98.5,102d,103.9,87.5,105.2,90.3,94.8,109.1,102.1,107.4,93.2);
        weatherData = new WeatherData(arrayList);
        System.out.println(weatherData.longestHeatWave(100.5));
        System.out.println(weatherData.longestHeatWave(95.2));
        System.out.println(arrayList);
    }
}
