package org.badgrades.wordswithsalt.api.domain

/**
  * https://www.glerl.noaa.gov/metdata/chi/
  * @param windSpeed
  * @param maxWindSpeed
  * @param windDirection
  * @param airTemperature
  * @param dewPoint
  * @param relativeHumidity
  */
case class WeatherRecord
(
  windSpeed: String = "",
  maxWindSpeed: String = "",
  windDirection: (Int, String) = (0, ""),
  airTemperature: String = "",
  dewPoint: String = "",
  relativeHumidity: Double = 1.0
)
