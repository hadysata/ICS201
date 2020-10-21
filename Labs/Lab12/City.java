
public class City implements Comparable<City> {

	private String cityName;
	private int temperature;

	public City() {
		this("", 0);
	}

	public City(String cityName, int temperature) {
		this.cityName = cityName;
		this.temperature = temperature;
	}

	public String getName() {
		return this.cityName;
	}

	public int getTemperature() {
		return this.temperature;
	}

	public void setName(String name) {
		this.cityName = name;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}


	@Override
	public int compareTo(City object) {
		if (temperature > object.temperature)
			return 1;
		else if (temperature < object.temperature)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return String.format("City: %s, Temperature: %d", this.cityName, this.temperature);
	}

}
