package solid.lsp.exampleTwo.right;

/**
 * Veja que agora no eu consigo adicionar quartos somente para o PenthouseSuite e não mais
 * precisar fazer aquela verificação com o IF pra evitar de adicionar quartos sem querer no Studio.
 * Naquele exemplo o Studio não conseguia implementar todas as ações da clase base, diferentemente do PenthouseSuite.
 * Assim, ferindo o princípio da LSP, pois ele não é capaz de substituir todos os comportamentos da classe base por completo,
 * portanto isso foi um erro de abstração.
 */
class PenthouseSuite {
    int squareFootage;
    int numberOfBedrooms;

    public PenthouseSuite() { numberOfBedrooms = 4; }
    public void setSquareFootage(int squareFootage) { this.squareFootage = squareFootage; }
}

//Estúdio por definição NUNCA poderá ter um quarto.
class Studio {
    int squareFootage;
    int numberOfBedrooms;

    public Studio() { numberOfBedrooms = 0; }
    public void setSquareFootage(int squareFootage) { this.squareFootage = squareFootage; }
}

class BedroomAdder {
    public void addBedroom(PenthouseSuite penthouse) {
        penthouse.numberOfBedrooms += 1;
    }
}