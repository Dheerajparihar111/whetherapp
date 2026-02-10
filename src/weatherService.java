import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class weatherService {

    public String fetchWeather(String city) {

        try {
            String apiUrl = WeatherConfig.BASE_URL
                    + "?q=" + city
                    + "&appid=" + WeatherConfig.API_KEY
                    + "&units=metric";

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
