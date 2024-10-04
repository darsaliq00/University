class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: $" + salary);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        person.display();

        Employee employee = new Employee("Jane Smith", 35, 50000.0);
        employee.display();
    }
}
