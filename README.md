🌦 Weather App (Java Console Application)

A clean, object-oriented Java console application that fetches real-time weather data using the OpenWeather API and displays formatted weather information for any city.

📌 Features

Fetch real-time weather data

Clean OOP architecture

JSON parsing using Gson

Professional formatted console output

Error handling for invalid cities

Metric units support (°C)

🏗 Project Architecture

This project follows a simple OOP structure:

weather-app
│
├── WeatherApp.java        (Main class)
├── WeatherService.java    (API communication logic)
├── WeatherResponse.java   (Data model for JSON mapping)
├── WeatherConfig.java     (API configuration)
└── pom.xml                (Maven dependencies)

Class Responsibilities
Class	Responsibility
WeatherApp	Handles user input and output
WeatherService	Calls OpenWeather API
WeatherResponse	Maps JSON response to Java object
WeatherConfig	Stores API key and base URL
⚙️ Technologies Used

Java 11+ / 17+

Maven

Gson (JSON parsing)

OpenWeather API

🔑 Setup Instructions
1️⃣ Get OpenWeather API Key

Go to: https://openweathermap.org

Create an account

Navigate to API Keys

Generate a new key

Copy the API key

2️⃣ Insert API Key

Open:

WeatherConfig.java


Replace:

public static final String API_KEY = "PASTE_YOUR_OPENWEATHER_API_KEY";


With:

public static final String API_KEY = "your_actual_api_key_here";

3️⃣ Install Dependencies

Ensure your pom.xml contains:

<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>


Then reload Maven:

Maven → Reload Project

▶️ Running the Application

Open WeatherApp.java

Click Run

Enter city name

Example:

Enter city name: Pune


Output:

--- Weather Report ---
City: Pune
Temperature: 29.5 °C
Feels Like: 30.1 °C
Humidity: 45 %
Weather: scattered clouds
Wind Speed: 3.2 m/s

🧠 How It Works

User enters city name

Application builds API request URL

HTTP GET request sent to OpenWeather

JSON response received

Gson converts JSON → Java Object

Data displayed in formatted output

🌍 API Endpoint Used
https://api.openweathermap.org/data/2.5/weather


With parameters:

q → City name

appid → API key

units=metric → Celsius

🚀 Possible Enhancements

5-Day Forecast support

Sunrise / Sunset time conversion

Weather icons

Exception logging

Unit selection (Celsius / Fahrenheit)

GUI version (JavaFX / Swing)

Spring Boot REST API version

Docker support

🛠 Error Handling

The app handles:

Invalid city names

API connectivity issues

Null response protection

📄 License

This project is for educational purposes.
