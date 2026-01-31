import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter city name: ");
        String city = sc.nextLine().toLowerCase();

        int temperature = 0;
        String condition = "";
        int humidity = 0;

        if (city.equals("pune")) {
            temperature = 30;
            condition = "Sunny";
            humidity = 40;
        }
        else if (city.equals("mumbai")) {
            temperature = 28;
            condition = "Humid";
            humidity = 70;
        }
        else if (city.equals("delhi")) {
            temperature = 35;
            condition = "Hot";
            humidity = 30;
        }
        else if (city.equals("bangalore")) {
            temperature = 25;
            condition = "Cloudy";
            humidity = 50;
        } else if (city.equals("kolhapur")) {
            temperature = 20;
            condition = "Clear";
            humidity = 30;

        } else if (city.equals("gao")) {
            temperature = 28;
            condition = "Clear";
            humidity = 70;

        } else {
            System.out.println("\nCity not found in database.");
            sc.close();
            return;
        }

        System.out.println("\n🌦 Weather Report");
        System.out.println("City: " + city);
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Condition: " + condition);
        System.out.println("Humidity: " + humidity + "%");

        sc.close();
    }
}
