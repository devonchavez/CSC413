package edu.sfsu.csc413.chess.model;

public enum PieceType {
    PAWN('P'), KNIGHT('N'), BISHOP('B'), ROOK('R'), QUEEN('Q'), KING('K');

    private final char symbol;

    PieceType(char symbol) {
        this.symbol = symbol;
    }

    public char symbol() {
        return symbol;
    }

    /** The inverse: the type for a letter, in either case. Throws if it names no piece. */
    public static PieceType fromSymbol(char letter) {
        for(PieceType c : PieceType.values()){
            if(c.symbol == Character.toUpperCase(letter)){
                return c;
            }
        }
        throw new IllegalArgumentException("Invalid piece symbol " + letter);
    }

    @Override
    public String toString() {
        return String.valueOf(symbol());
    }

}
