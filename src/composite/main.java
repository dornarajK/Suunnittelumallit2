package composite;

public class main {
    public static void main(String[] args) {
        Department company = new Department("Company");

        Employee employee1 = new Employee("e1", 50000);
        Employee employee2 = new Employee("e2", 60000);

        Department it = new Department("IT");
        Employee employee3 = new Employee("e3", 70000);
        Employee employee4 = new Employee("e4", 80000);

        it.add(employee3);
        it.add(employee4);

        company.add(employee1);
        company.add(employee2);
        company.add(it);

        System.out.println("Total Salary: " + company.getSalary());
        System.out.println();
        System.out.println("Organization Structure in XML:");
        System.out.println(company.toXML());







    }
}
