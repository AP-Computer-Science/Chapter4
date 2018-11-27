public class BoxCars {
    public static void main(String[] args) {
        PairOfDice d = new PairOfDice();
        int boxCarCount = 0;
        for(int i = 1; i <= 100; i++) {
            System.out.println("=============New Iteration==============");
            System.out.println("# of iterations: " + i);
            d.roll();
            int d1Value = d.getDie1Face();
            int d2Value = d.getDie2Face();
            System.out.println("Die 1: " + d1Value);
            System.out.println("Die 2: " + d2Value);
            if(d1Value == 6 && d2Value == 6) {
                boxCarCount++;
            }
            System.out.println("# of box cars: " + boxCarCount);
        }
    }
}