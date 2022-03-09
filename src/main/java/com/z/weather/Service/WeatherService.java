package com.z.weather.Service;

import com.z.weather.vo.WeatherVo;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    public WeatherVo getWeather(WeatherVo weatherVo) {
        String city_code = weatherVo.getCityName() ;
        String url= "http://t.weather.itboy.net/api/weather/city/"+city_code;
        return weatherVo;
    }

}
