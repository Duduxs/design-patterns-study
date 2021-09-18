package solid.ocp.right;

/** Agora essa classe está obedecendo o OCP, pois não estou mexendo nela a cada vez que aparecer um novo tipo de conta,
 * mas, sim extendendo novos subfilhos a partir dela para fazer sua própria implementação do debit.
 *
 * Note que, isso da uma grande melhora nos testes unitários uma vez que naquele outro modelo eu precisaria toda vez
 * que trocar o método debit rever os testes, já aqui eu só preciso revê-los caso haja alguma mudança nas filhas.
 */
public abstract class AccountDebit {

    public abstract void debit(final Double value, final String account);

}
class CurrentAccountDebit extends AccountDebit {

    @Override
    public void debit(Double value, String account) {
        //Lógica para fazer o débito em uma conta corrente.
    }
}

class InvestmentAccountDebit extends AccountDebit {

    @Override
    public void debit(Double value, String account) {
        //Lógica para fazer o débito em uma conta de investimento.
    }
}

class SavingAccountDebit extends AccountDebit {

    @Override
    public void debit(Double value, String account) {
        //Lógica para fazer o débito em uma conta poupança.
    }
}
