import java.util.Scanner;

public class WeatherApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        WeatherService service = new WeatherService();
        WeatherCache cache = new WeatherCache();

        System.out.print("Enter city name: ");
        String city = sc.nextLine().toLowerCase();

        if (cache.hasCity(city)) {

            System.out.println("\nWeather Data (from cache):");
            System.out.println(cache.getWeather(city));

        } else {

            System.out.println("\nFetching weather data from API...");
            String weatherData = service.fetchWeather(city);

            if (weatherData != null) {
                cache.saveWeather(city, weatherData);

                System.out.println("\nWeather Data:");
                System.out.println(weatherData);
            } else {
                System.out.println("Failed to fetch weather data.");
            }
        }

        sc.close();
    }
}
