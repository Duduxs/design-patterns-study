package solid.dip.right;

/** Esse princípio diz que módulos de alto nível não devem depender de baixos níveis.
 * Dependa de uma abstração e não de uma implementação **/
public class EmployeeDAO {

    /**
     *     Agora aqui, não importa qual banco esteja sendo usado, pois agora utilizo uma abstração.
     */
    public void save(DBConnector msCon) {
        System.out.println("Saved to database");
    }
}

interface DBConnector {  public void connect(); }

class MySQLConnector implements DBConnector {
    public void connect() {
        System.out.println("Connected to MySQL database!");
    }
}
class OracleConnector implements DBConnector {
    public void connect() {
        System.out.println("Connected to MySQL database!");
    }
}
