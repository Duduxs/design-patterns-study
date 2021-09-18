package solid.ocp.wrong;

/**
 * Esse princípio diz que a classe deve estar fechada para modificações, entretanto aberta para extensão.
 **/
public class AccountDebit {

    public void debit(final Double value, final String account, final AccountType type) {

        if (type == AccountType.CURRENT) {
            //Lógica para fazer o débito da conta corrente
        }

        if (type == AccountType.SAVING) {
            //Lógica para fazer débito da conta poupança.
        }
        /*
         * Imagine que apareceu mais um novo tipo de conta no enum, por exemplo, a de investimento.
         * Eu precisaria colocar mais um IF nesse método debit para fazer a lógica dessa nova conta.
         * E, em simultâneo, estaria a ferir o princípio do OCP, pois eu estaria a modificar essa classe
         * Sendo que ela deveria estar fechada para modificações, porém ABERTA PARA EXTENSÃO.
         */

    }
}
enum AccountType { CURRENT,  SAVING }
