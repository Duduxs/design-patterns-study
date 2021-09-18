package solid.dip.wrong;

/** Esse princípio diz que módulos de alto nível não devem depender de baixos níveis.
 * Dependa de uma abstração e não de uma implementação **/
public class EmployeeDAO {

    /**
     *     Aqui existe um alto acoplamento, essa classe de alto nível está dependendo da classe de baixo nível
     *     Caso eu queria mudar de MySQLConnector pra OracleConnector teria que mudar em todos os pontos.
     */
    public void save(MySQLConnector msCon) {
        System.out.println("Saved to database");
    }
}

class MySQLConnector {

    public void connect() {
        System.out.println("Connected to MySQL database!");
    }
}
