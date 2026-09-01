package composite;

public class Employee extends OrganizationComponent {
    private String name;
    private double salary;

    public Employee (String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(OrganizationComponent component) {
        // no add
    }
    @Override
    public  void remove(OrganizationComponent component) {
        // no remove
    }
    @Override
    public double getSalary() {
        return salary;
    }
    @Override
    public String toXML() {
        return "<employee><name>" + name + "</name><salary>" + salary + "</salary></employee>";
    }
}
