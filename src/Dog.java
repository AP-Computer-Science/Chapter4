public class Dog {
    private String breed;
    private String name;
    private boolean isPuppy;
    public Dog(String b, String n, boolean p) {
        breed = b;
        name = n;
        isPuppy = p;
    }
    public void poddy() {
        System.out.println("Uh oh! Forgot a baggey, I'll use my hands.");
    }
    public void fetch(String f) {
        System.out.println("Go get your " + f + "!");
        System.out.println("Good job " + name + "!");
    }
    public String getName() {
        return name;
    }
    public void sniffButts(Dog d) {
        System.out.println("I want to be friends with you, " + d.getName());
    }
    @Override
    public String toString() {
        String result = "Breed: " + breed + ", Name: " + name + ", Adult: " + !isPuppy;
        return result;
    }
}
