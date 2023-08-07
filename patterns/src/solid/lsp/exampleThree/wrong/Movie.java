package solid.lsp.exampleThree.wrong;
/**
 * Esse principio diz uma classe base deve poder ser substituída pela sua classe derivada.
 * "Se nada como um pato, voa como um pato, porém precisa de baterias, provavelmente você possui um problema de abstração."
 */
public interface Movie {

    default void play() { System.out.println("Playing movie"); }
    boolean increaseVolume();
}

class TheLionKing implements Movie {
    @Override
    public boolean increaseVolume() { System.out.println("Volume increased"); return true;}
}
    /**
     * Esse filme abaixo do Charlie Chaplin é mudo, não possui volume. Portanto, quaisquers outras classes
     * que precisariam utilizar desse modelo de herança não poderiam utilizar o método increaseVolume.
     */
class ModernTimes implements Movie {
    @Override
    public boolean increaseVolume() {
        // VESH!
        return false;
    }
}