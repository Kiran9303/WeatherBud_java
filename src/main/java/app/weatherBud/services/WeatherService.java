package app.weatherBud.services;

import app.weatherBud.apiModels.WeatherBudObject;
import org.json.JSONObject;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static app.weatherBud.constants.CommonConstants.apiBaseUrl;
import static app.weatherBud.constants.CommonConstants.apiKey;

//import java.net.URL;
//import java.net.http.HttpResponse;

public class WeatherService {

    public WeatherBudObject callCurrentWeather(String location, String responseType){
        String url = apiBaseUrl+"/current.json?key="+apiKey+"&q="+location+"&Content-Type="+responseType;
        RestTemplate weatherApi = new RestTemplate();
        ResponseEntity<WeatherBudObject> responseEntity = weatherApi.getForEntity(url, WeatherBudObject.class);
        WeatherBudObject resp = new WeatherBudObject();
        resp = responseEntity.getBody();
        return resp;
    }
}
