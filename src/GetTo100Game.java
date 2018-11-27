
import java.util.Scanner;

public class GetTo100Game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.print("How many sides for your die: ");
            int sides = s.nextInt();
            if(sides < 1) {
                System.out.println("Invalid");
            }
            Die d = new Die(sides);
            d.roll();
            System.out.println("The die rooled: " + d.getFace());
        }
    }
}