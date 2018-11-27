public class RollAIOperation extends AIOperation {
    public RollAIOperation(Player p) {
        super(p);
    }
    @Override
    public void run(PigGameContext context) {
        super.roll();
    }
}