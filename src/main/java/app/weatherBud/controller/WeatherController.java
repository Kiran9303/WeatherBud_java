package app.weatherBud.controller;

import app.weatherBud.apiModels.WeatherBudObject;
import app.weatherBud.services.WeatherService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;

@RestController
@Api(tags = "customized weather report API" )
public class WeatherController {
    @ApiOperation( value = "used to get current weather", httpMethod = "GET")
    @GetMapping("/weatherBud/current")
    public WeatherBudObject currentWeather(@RequestParam String location, @RequestParam String responseType) {
        //WeatherService service = new WeatherService();
        WeatherBudObject apiResp = new WeatherService().callCurrentWeather(location, responseType);
        return apiResp;
    }


}
