package solid.dip.exampleTwo.right;

interface Notifier {
    void alertWeatherConditions(String weatherConditions);
}

class MobileDevice implements Notifier {
    public void alertWeatherConditions(String weatherConditions) {
        if (weatherConditions == "rainy") System.out.print("It is rainy");
    }
}

class EmailClient implements Notifier {
    public void alertWeatherConditions(String weatherConditions) {
        if (weatherConditions == "sunny") System.out.print("It is sunny");
    }
}

/**
 * Aqui obedecemos o DIP, SRP, OCP e de quebra o LSP, pois temos uma abstração bem feita.
 * Tudo isso devido somente a uma interface.
 * Recebemos agora a abstração no método notify() e chamamos o alertWeatherConditions
 * sem precisar conhecer as suas implementações. Se houver alguma outra nova implementação no futuro
 * esse WeatherTracker não precisará de manutenção. É só simplesmente chama-lo passando a implementação
 * que você deseja no método notify, simplesmente isso.
 */
public class WeatherTracker {
    String currentConditions;

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
    }

    public void notify(Notifier notifier) {
        notifier.alertWeatherConditions(currentConditions);
    }
}