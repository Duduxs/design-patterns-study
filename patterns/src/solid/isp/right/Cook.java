package solid.isp.right;

interface CookInterface {
    boolean isAValidEntity(); boolean saveInDatabase(); boolean sendEmail();
}
interface DriverInterface {
    boolean isAValidEntity(); boolean saveInDatabase();
}

public class Cook implements CookInterface {

    @Override
    public boolean isAValidEntity() {
        return true;
    }

    @Override
    public boolean saveInDatabase() { System.out.println("Saved!"); return false; }

    @Override
    public boolean sendEmail() { System.out.println("Email sended"); return true; }
}
/* Agora, como segreguei as interfaces, a DriverInterface não tem o método de sendMail, pois os motoristas no sitema
* não podem enviar emails, portanto agora tenho classes que não são obrigadas a implementar métodos inúteis.
**/
class Driver implements DriverInterface {

    @Override
    public boolean isAValidEntity() {
        return true;
    }

    @Override
    public boolean saveInDatabase() { System.out.println("Saved!"); return true; }
}