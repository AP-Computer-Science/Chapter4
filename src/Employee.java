public class Employee extends Person {
    private boolean isFired;
    private double salary;
    private Boss boss;
    private String role;
    private Employer employer;
    public Employee(String n, int a, int s, Boss b, String r, Employer e) {
        super(n, a);
        salary = s;
        boss = b;
        role = r;
        employer = e;
    }
    public void fire() {
        isFired = true;
    }
    public void switchEmployer(Employer e) {
        isFired = false;
        employer = e;
        boss = null;
    }
    public void switchBoss(Boss newBoss) {
        boss = newBoss;
    }
    public void getMoney(double money) {
        salary = money;
    }
    public void switchJob(String newRole) {
        role = newRole;
    }
}