package com.z.weather.Controller;

import com.z.weather.Service.WeatherService;
import com.z.weather.vo.WeatherVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/getWeather")
    public WeatherVo getWeather(WeatherVo weatherVo){
        return weatherService.getWeather(weatherVo);
    }

}
