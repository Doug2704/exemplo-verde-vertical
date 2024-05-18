package domain;

public class Plant {
    String name;
    Double idealTemperature;
    Double idealHumidity;

    public Plant(String name, Double temperature, Double humidity) {

	this.name = name;
	this.idealTemperature = temperature;
	this.idealHumidity = humidity;
    }

    public String getName() {
        return name;
    }

    public Double getTemperature() {
        return idealTemperature;
    }

    public Double getHumidity() {
        return idealHumidity;
    }
    
}
