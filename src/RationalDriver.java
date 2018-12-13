
import java.util.Scanner;

public class RationalDriver {
    private static Rational parseString(String input) {
        if(!input.contains("/")) {
            return new Rational(Integer.parseInt(input), 1);
        }
        else {
            if(input.length() <= 1) {
                System.out.println("Invalid fraction. Passing in zero.");
                return new Rational(0, 1);
            }
            String[] parsed = input.split("/");
            if(parsed.length < 2) {
                System.out.println("No denominator found. Passing in one for denominator");
                return new Rational(Integer.parseInt(parsed[0]), 1);
            }
            return new Rational(Integer.parseInt(parsed[0]), Integer.parseInt(parsed[1]));
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("add, subtract, multiply, divide: ");
        String answer = s.next().trim().toUpperCase();
        if("ADD".equals(answer)) {
            System.out.print("First addend (optional: use / for fraction): ");
            String s1 = s.next();
            System.out.print("Second addend (optional: use / for fraction): ");
            String s2 = s.next();
            Rational r1 = parseString(s1);
            Rational r2 = parseString(s2);
            System.out.println("Answer: " + r1.add(r2));
        }
        else if("SUBTRACT".equals(answer)) {
            System.out.print("Enter minuend (optional: use / for fraction): ");
            String s1 = s.next();
            System.out.print("Enter sutrahend (optional: use / for fraction): ");
            String s2 = s.next();
            Rational r1 = parseString(s1);
            Rational r2 = parseString(s2);
            System.out.println("Answer: " + r1.subtract(r2));
        }
        else if("MULTIPLY".equals(answer)) {
            System.out.print("First Factor (optional: use / for fraction): ");
            String s1 = s.next();
            System.out.print("Second Factor (optional: use / for fraction): ");
            String s2 = s.next();
            Rational r1 = parseString(s1);
            Rational r2 = parseString(s2);
            System.out.println("Answer: " + r1.multiply(r2));
        }
        else if("DIVIDE".equals(answer)) {
            System.out.print("Enter Dividend (optional: use / for fraction): ");
            String s1 = s.next();
            System.out.print("Second Divisor (optional: use / for fraction): ");
            String s2 = s.next();
            Rational r1 = parseString(s1);
            Rational r2 = parseString(s2);
            System.out.println("Answer: " + r1.divide(r2));
        }
        else {
            System.out.println("No Such Operation exists.");
        }
    } 
}