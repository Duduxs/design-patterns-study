package patterns.behavioural.observer.examples.second;

public enum WeatherType {

    SUNNY("Sunny"),
    RAINY("Rainy"),
    WINDY("Windy"),
    COLD("Cold");

    private final String description;

    WeatherType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WeatherType{");
        sb.append("description='").append(description.toLowerCase()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
