package solid.dip.right;

/** Esse princípio diz que módulos de alto nível não devem depender de baixos níveis.
 * Dependa de uma abstração e não de uma implementação **/
public class EmployeeDAO {

    /**
     *     Agora aqui, não importa qual banco esteja sendo usado, pois agora utilizo uma abstração.
     */
    public void save(DBConnector3 msCon) {
        System.out.println("Saved to database");
    }
}

interface DBConnector3 {  public void connect(); }

class OracleConnector implements DBConnector3 {
    public void connect() {
        System.out.println("Connected to MySQL database!");
    }


}
class MySQLConnector implements DBConnector3 {
    public void connect() {
        System.out.println("Connected to MySQL database!");
    }
}
