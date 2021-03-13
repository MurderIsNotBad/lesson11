public class Employee {

    private final String name;

    public String getName() {
        return name;
    }

    public Employee(Person person) {
        this.name = person.getName();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
