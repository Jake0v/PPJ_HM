public class Task1 {
    public static void main(String[] args) {

        Person john = new Person("John", 2000);
        Person alex = new Person("Alex", 1999);

        Person bob = new Employee("Bob", 2001, "programmer");
        Employee martha =
                new Employee("Martha", 2002, "manager");

        Person[] persons = {john, alex, bob, martha};

        for (int i = 0; i < persons.length; i++) {
            IO.println(persons[i]);
        }

    }
}
