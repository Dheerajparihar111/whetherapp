import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("********wel-come to whether app *********");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Your choice");
            System.out.println("1)start");
            System.out.println("2) Exit");
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                System.out.println("Enter city name: ");
                String city = input.nextLine().toLowerCase();
                int temperature = 0;
                String condition = "";
                int humidity = 0;

                if (city.equals("pune")) {
                    temperature = 30;
                    condition = "Sunny";
                    humidity = 40;
                } else if (city.equals("mumbai")) {
                    temperature = 28;
                    condition = "Humid";
                    humidity = 70;
                } else if (city.equals("delhi")) {
                    temperature = 35;
                    condition = "Hot";
                    humidity = 30;
                } else if (city.equals("bangalore")) {
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
                }

                System.out.println("\n🌦 Weather Report");
                System.out.println("City: " + city);
                System.out.println("Temperature: " + temperature + "°C");
                System.out.println("Condition: " + condition);
                System.out.println("Humidity: " + humidity + "%");


            }else {
                System.out.println("thank you for using whether app ");
                System.exit(0);
            }
        }
    }
}
