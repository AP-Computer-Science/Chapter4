import java.util.HashMap;
import java.util.LinkedList;
import javax.swing.ListModel;
public class Employer {
    private HashMap<String, Employee> employees;
    public Employer() {
        employees = new HashMap<String, Employee>();
    }
    public void addEmployee(Employee e) {
        employees.put(e.getName(), e);
    }
    public Employee[] getEmployees() {
        return (Employee[])employees.values().toArray();
    }
    public String[] getEmployeesName() {
        LinkedList<String> ll = new LinkedList<String>();
        for(Employee e : employees.values()) {
            ll.add(e.getName());
        }
        return (String[])(ll.toArray());
    }
}