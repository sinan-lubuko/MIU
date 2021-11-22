package w2d4;

public class City implements Comparable<City> {
    private String cityName;
    private double temperature;

    public City(String cityName, double temperature) {
        this.cityName = cityName;
        this.temperature = temperature;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public int compareTo(City city) {
        //comparison using temperature in natural order (ASCENDING)
        if(this.temperature > city.temperature){
            return 1;
        }
        else if(this.temperature < city.temperature){
           return -1;
        }
        return 0;
    }

    /*@Override
    public int compareTo(City city) {
        //for properties which is a string or an objects
        return this.cityName.compareTo(city.cityName);
    }*/

    @Override
    public String toString() {
        return "CityName=" + cityName+
                ", temperature=" + temperature;
    }
}
