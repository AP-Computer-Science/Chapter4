public class Barista {
    public static void main(String[] args) {
        Container mug = new Container();
        String s = "d";
        for(int i = 0; i <= 100; i++) {
            mug.drink();
            System.out.println(mug.getSize());
        }
        String s2 = "9ix stick";
    }
}