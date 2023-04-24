package app.weatherBud.apiModels;

import lombok.Data;

@Data
public class WeatherBudObject {
    public WeatherBudLocationModel location;
    public WeatherBudWeatherModel current;
}
