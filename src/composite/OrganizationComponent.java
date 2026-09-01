package composite;

public abstract class OrganizationComponent {
    public abstract void add (OrganizationComponent component);
    public abstract void remove (OrganizationComponent component);
    public abstract double getSalary ();
    public abstract String toXML ();

}