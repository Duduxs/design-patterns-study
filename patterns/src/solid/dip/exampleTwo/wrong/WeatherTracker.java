package solid.dip.exampleTwo.wrong;

class Phone {
    public String generateWeatherAlert(String weatherConditions) { return "It is " + weatherConditions; }
}

class Emailer {
    public String generateWeatherAlert(String weatherConditions) { return "It is " + weatherConditions; }
}

/**
 * Aqui não só ferimos o DIP, mas também como o SRP e o OCP.
 * Nessa classe, estamos dependendo de implementações concretas, ao invés de abstrações.
 * o setCurrentCondition irá mudar toda vez que houver um novo tipo de dia no meu app, e o mesmo não está aberto
 * para extensão, mas sim aberto para modificações.
 */
public class WeatherTracker {
    String currentConditions;
    Phone phone;
    Emailer emailer;

    public WeatherTracker() {
        phone = new Phone();
        emailer = new Emailer();
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = phone.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = emailer.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}


