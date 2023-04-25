package app.weatherBud.apiModels;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(value = "response object info")
@Data
public class WeatherBudObject {
    public WeatherBudLocationModel location;
    public WeatherBudWeatherModel current;
}
