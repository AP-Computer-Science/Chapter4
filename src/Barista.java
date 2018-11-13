public class Barista {
    public static void main(String[] args) {
        Container mug = new Container();
        for(int i = 0; i <= 100; i++) {
            mug.drink();
            System.out.println(mug.getSize());
        }
    }
}