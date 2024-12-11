import java.util.ArrayList;

public class WeatherData {
    /** Guaranteed not to be null and to contain only non-null entries */
    private final ArrayList<Double> temperatures;
    public WeatherData(ArrayList<Double> temperatures){
        this.temperatures = temperatures;
    }
    /**
     * Cleans the data by removing from temperatures all values that are less than
     * lower and all values that are greater than upper, as described in part (a)
     */
    public void cleanData(double lower, double upper)
    {
        temperatures.removeIf(c->c-lower<0||c-upper>0);
    }
    /**
     * Returns the length of the longest heat wave found in temperatures, as described in
     * part (b)
     * Precondition: There is at least one heat wave in temperatures based on threshold.
     */
    public int longestHeatWave(double threshold) {
        int longestWave = 0;
        int currentWave = 0;
        for(Double d:temperatures){
            if(d>threshold){
                currentWave++;
            }else{
                currentWave = 0;
            }
            if(currentWave>longestWave) longestWave = currentWave;
        }
        return longestWave;
    }
// There may be instance variables, constructors, and methods that are not shown.
}