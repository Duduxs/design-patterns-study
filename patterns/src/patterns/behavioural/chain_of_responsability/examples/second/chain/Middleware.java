package patterns.behavioural.chain_of_responsability.examples.second.chain;

/**
 * Base chain class
 */
public abstract class Middleware {

    private Middleware next;

    public static Middleware link(Middleware first, Middleware... chain) {

        Middleware head = first;

        for(var nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }

        return first;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password) {
        if(next == null) return true;

        return next.check(email, password);
    }


}
