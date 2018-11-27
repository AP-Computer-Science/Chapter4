
import java.text.NumberFormat;
import java.util.Scanner;

public class AccountDriver {
    public static void main(String[] args) {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        Account a1 = new Account("Bob", 1543457543, 1600);
        Account a2 = new Account("Brian", 77777777);
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println(a1.getName() + ":" + " has " + fmt.format(a1.getBalance()));
            System.out.println(a2.getName() + ":" + " has " + fmt.format(a2.getBalance()));
            System.out.print("Transfer amount. Enter 0 to exit: ");
            double amount = s.nextDouble();
            if(amount == 0) {
                break;
            }
            a1.move(a2, amount);
        }
    }
}