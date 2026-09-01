package composite;

import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent{
    private String name;
    private final List<OrganizationComponent> components;

    public Department (String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    @Override
    public void add(OrganizationComponent component) {
        components.add(component);
    }
    @Override
    public void remove(OrganizationComponent component) {
        components.remove(component);
    }
    @Override
    public double getSalary() {
        double totalSalary = 0;
        for (OrganizationComponent component : components){
            totalSalary += component.getSalary();
        }
        return totalSalary;

    }
    @Override
    public String toXML() {
        StringBuilder xml = new StringBuilder();
        xml.append("<department><name>").append(name).append("</name>");
        for (OrganizationComponent component : components){
            xml.append(component.toXML());
        }
        xml.append("</department>");
        return xml.toString();

    }


}

