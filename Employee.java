public class Employee extends Person {

    private String jobTitle;

    public Employee(String name, int birthYear, String jobTitle) {
        super(name, birthYear);
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return super.toString() + ": "+ jobTitle +"";
    }
}
