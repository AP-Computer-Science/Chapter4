public class Card {
    private int value;
    private SuitType suit;
    public Card(int v, SuitType s) {
        value = v;
        suit = s;
    }
    public int getValue() {
        return value;
    }
    public SuitType getSuit() {
        return suit;
    }
    @Override
    public String toString() {
        return "Value: " + value + " suit: " + suit.toString();
    }
}
