
import java.util.HashMap;
public class Boss extends Employee {
    private HashMap<String, Employee> subOrdinates;
    public Boss(String n, int a, int s, Boss b, String r, Employer e) {
        super(n, a, s, b, r, e);
    }
    public void addSubOrdinate(Employee e) {
        e.switchBoss(this);
        subOrdinates.put(e.getName(), e);
    }
}