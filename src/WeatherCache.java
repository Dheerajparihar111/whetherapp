import java.util.HashMap;

public class WeatherCache {

    private HashMap<String, String> cache = new HashMap<>();

    public boolean hasCity(String city) {
        return cache.containsKey(city);
    }

    public String getWeather(String city) {
        return cache.get(city);
    }

    public void saveWeather(String city, String data) {
        cache.put(city, data);
    }
}
