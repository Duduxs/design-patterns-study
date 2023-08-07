package solid.lsp.exampleThree.right;
/**
 * Veja agora que fiz uma segregação do método increaseVolume() em outra interface, fazendo assim com que classes
 * não precisem implementar métodos que elas não podem e/ou não vão utilizar (ISP) e também fazendo com que a classe
 * ModernTimes obedeça o (LSP) pois agora ela consegue substituir os comportamentos da classe pai por completo, e
 * qualquer lugar que for utilizar do meu esqueça de herança não vai precisar ficar se preocupando de inserir lógicas
 * de if e elses para evitar uma chamada a um método que pode não ser implementando/obedecido em todos as classes
 * concretas.
 */
public interface Movie {

    default void play() { System.out.println("Playing movie"); }
}

interface AudioControls {
    boolean increaseVolume();
}

class TheLionKing implements Movie, AudioControls {
    @Override
    public boolean increaseVolume() { System.out.println("Volume increased"); return true;}
}
class ModernTimes implements Movie { }