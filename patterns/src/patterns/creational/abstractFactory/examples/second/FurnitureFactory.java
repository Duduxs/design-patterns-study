package patterns.creational.abstractFactory.examples.second;

/**
 * Aqui eu separo uma factory para cada família de objeto, assim segregando a criação da lógica
 * com as suas respectivas regras negociais por variantes da família. Assim, se precisarmos adicionar
 * uma nova família é só simplesmente herdar da interface, obedecendo ao COP.
 */

public interface FurnitureFactory {

    Couch createCouch();
    Chair createChair();
    Table createTable();

}

class ArtFurnitureFactory implements FurnitureFactory {
    @Override
    public Couch createCouch() {
        return new ArtCouch();
    }

    @Override
    public Chair createChair() {
        return new ArtChair();
    }

    @Override
    public Table createTable() {
        return new ArtTable();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Couch createCouch() {
        return new VictorianCouch();
    }

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}

class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Couch createCouch() {
        return new ModernCouch();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}