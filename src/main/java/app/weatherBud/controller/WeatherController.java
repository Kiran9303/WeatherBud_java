package app.weatherBud.controller;

import app.weatherBud.apiModels.WeatherBudObject;
import app.weatherBud.services.WeatherService;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @GetMapping("/weatherBud")
    public WeatherBudObject index() {
        WeatherService service = new WeatherService();
        WeatherBudObject apiResp = service.callCurrentWeather();
        System.out.println(apiResp);
        return apiResp;
    }


}
