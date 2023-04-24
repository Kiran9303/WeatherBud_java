package app.weatherBud.apiModels;
import lombok.Data;

@Data
public class WeatherBudWeatherModel {
    public Float temp_c;
    public Float temp_f;
    public Float feelslike_c;
    public Float feelslike_f;
}
