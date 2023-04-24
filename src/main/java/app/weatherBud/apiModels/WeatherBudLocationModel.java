package app.weatherBud.apiModels;

import lombok.Data;

import java.util.Date;

@Data
public class WeatherBudLocationModel {
    public String name;
    public String region;
    public String country;
    public String localtime;
}
