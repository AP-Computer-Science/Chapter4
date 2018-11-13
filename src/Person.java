import java.util.LinkedList;
public class Person {
    private String name;
    private int age;
    private LinkedList<String> hobbies;
    public Person(String n, int a) {
        name = n;
        age = a;
    }
    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }
    public boolean likesHobby(String hobby) {
        return hobbies.contains(hobby);
    }
    public String[] getHobbies() {
        return (String[])hobbies.toArray();
    }
    public String getName() {
        return name;
    }
    public void birthday() {
        age++;
    }
}
