package solid.isp.wrong;

import solid.srp.right.Employee;

/**
 * Esse princípio diz que as classes não devem ser forçadas a depender de métodos que não usam.
 *
 * Por isso, por exemplo é de extrema importância de se trabalhar com pequenas interfaces,
 * ao invés de somente uma.
 **/

interface UtilsInterface {
    boolean isAValidEntity(); boolean saveInDatabase(); boolean sendEmail();
}

class Driver implements UtilsInterface {
    @Override
    public boolean isAValidEntity() {
        return true;
    }

    @Override
    public boolean saveInDatabase() { System.out.println("Saved!"); return true; }
    
    @Override
    public boolean sendEmail() {
        /*
         * Motoristas no sistema não tem email, e agora???
         *  Sou obrigado a implementar esse método passando um valor default
         * ou emitindo uma exception, ou até mesmo colocando um comentário, mas isso está errado!
         */
        return false;
    }
}
class Cook implements UtilsInterface {

    @Override
    public boolean isAValidEntity() {
        return true;
    }

    @Override
    public boolean saveInDatabase() { System.out.println("Saved!"); return false; }

    @Override
    public boolean sendEmail() { System.out.println("Email sended"); return true; }
}
