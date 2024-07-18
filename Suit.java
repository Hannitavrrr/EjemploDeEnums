package university.jala.institutional.cartas;

enum Suit {
    TREBOL("T"), DIAMANTES("D"), CORAZONES("C"), ESPADAS("E");

    private final String symbol;

    Suit(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
