
import java.util.Scanner;
import java.util.HashMap;
public class DogPark {
    private HashMap<String, Dog> dogs;
    public DogPark() {
        dogs = new HashMap<String, Dog>();
    }
    public void addDog(Dog d) {
        dogs.put(d.getName(), d);
    }
    public Dog getDogByName(String dogName) {
        return dogs.get(dogName);
    }
}
