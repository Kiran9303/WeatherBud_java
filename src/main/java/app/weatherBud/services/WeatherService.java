package app.weatherBud.services;

import app.weatherBud.apiModels.WeatherBudObject;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

//import java.net.URL;
//import java.net.http.HttpResponse;

public class WeatherService {

    public WeatherBudObject callCurrentWeather(){
        String url = "https://api.weatherapi.com/v1/current.json?key=158405d6ebf848ce8bd40910232004&q=ottawa&aqi=no&Content-Type=application/json";
        RestTemplate weatherApi = new RestTemplate();
        ResponseEntity<WeatherBudObject> responseEntity = weatherApi.getForEntity(url, WeatherBudObject.class);
        WeatherBudObject resp = new WeatherBudObject();
        resp = responseEntity.getBody();
        System.out.println(responseEntity.getBody());// JSONObject tempResp = weatherApi.getForObject(url, JSONObject.class);
        System.out.println(resp);
        return resp;
    }
}
