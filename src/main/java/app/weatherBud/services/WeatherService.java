package app.weatherBud.services;

import app.weatherBud.apiModels.WeatherBudObject;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static app.weatherBud.constants.CommonConstants.apiBaseUrl;

//import java.net.URL;
//import java.net.http.HttpResponse;

public class WeatherService {

    public WeatherBudObject callCurrentWeather(){
        String url = apiBaseUrl+"/current.json?key=158405d6ebf848ce8bd40910232004&q=ottawa&aqi=no&Content-Type=application/json";
        RestTemplate weatherApi = new RestTemplate();
        ResponseEntity<WeatherBudObject> responseEntity = weatherApi.getForEntity(url, WeatherBudObject.class);
        WeatherBudObject resp = new WeatherBudObject();
        resp = responseEntity.getBody();
        return resp;
    }
}
