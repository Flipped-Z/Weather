package com.z.weather.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class WeatherVo {

    String CityName;

    LocalDateTime UpdateDateTime;

    String Weather;

    Float Temperature;

    Float Wind;

}
