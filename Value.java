package university.jala.institutional.cartas;

enum Value {
    _2("2"), _3("3"), _4("4"), _5("5"), _6("6"), _7("7"), _8("8"), _9("9"), _10("10"),
    J("J"), Q("Q"), K("K"), A("A");

    private final String symbol;

    Value(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
