import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
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
    public HashSet<String> getEmployeesName() {
        java.util.HashSet<String> ll = new HashSet<String>();
        for(Employee e : employees.values()) {
            ll.add(e.getName());
        }
        return ll;
    }
}