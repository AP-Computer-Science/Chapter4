public class GetTo100Game {
    public static void main(String[] args) {
        int score = 0;
        int attempts = 0;
        Die d = new Die();
        Die d2 = new Die();
        while(true) {
            if(score > 100) {
                score = 50;
            }
            else if(score == 100) {
                break;
            }
            d.roll();
            d2.roll();
            int face1 = d.getFace();
            int face2 = d2.getFace();
            if(face1 == face2) {
                score -= (face1 + face2);
            }
            else {
                score += (face1 + face2);
            }
            System.out.println("Face1: " + face1);
            System.out.println("Face2: " + face2);
            System.out.println("Score: " + score);
            attempts++;
            System.out.println("# of attempts: " + attempts);
        }
    }
}
