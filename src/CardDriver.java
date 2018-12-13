public class CardDriver {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            int suit = (int)(Math.random() * 4);
            SuitType s = SuitType.Clubs;
            switch (suit) {
                case 0:
                    s = SuitType.Clubs;
                    break;
                case 1:
                    s = SuitType.Diamonds;
                    break;
                case 2:
                    s = SuitType.Hearts;
                    break;
                case 3:
                    s = SuitType.Spades;
                    break;
            }
            System.out.println(i + ": " + new Card((int)(Math.random() * 10) + 1, s).toString());
        }
    }
}
