import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class WeatherService {

    public String fetchWeather(String city) {

        try {
            String apiUrl = WeatherConfig.BASE_URL
                    + city
                    + "?key=" + WeatherConfig.API_KEY
                    + "&unitGroup=metric";

            URL url = new URL(apiUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream())
            );

            String line;
            StringBuilder response = new StringBuilder();

            while ((line = br.readLine()) != null) {
                response.append(line);
            }

            br.close();
            return response.toString();

        } catch (Exception e) {
            return null;
        }
    }
}
