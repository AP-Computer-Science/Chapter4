
public class Container {
    //Instance data
    private int size;
    private String brand;
    private String liquid;
    //Constructor
    public Container() {
        size = 16;
        brand = "Starbucks";
        liquid = "Coffee";
    }
    //Methods
    public void drink() {
        if(size == 0) {
            fill();
        }
        else {
            System.out.println("Mmmmmmm. Feel the caffeine!");
            size--;
        }
    }
    public void fill() {
        System.out.println("Fill her up!");
        size = 16;
    }
    //Accessors
    public int getSize() {
        return size;
    }
    public String getBrand() {
        return brand;
    }
    public String getLiquid() {
        return liquid;
    }
    //Mutators
    
}