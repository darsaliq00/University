public class PersonDemo {
    public static void main(String[] args) {
        System.out.println("Person speaking:");
        Person person = new Person();
        person.speak();

        System.out.println("\nStudent speaking:");
        Student student = new Student();
        student.speak();

        System.out.println("\nTeacher speaking:");
        Teacher teacher = new Teacher();
        teacher.speak();
    }
}

class Person {
    public void speak() {
        System.out.println("The person is speaking");
    }
}

class Student extends Person {
    @Override
    public void speak() {
        System.out.println("The student is asking a question");
    }
}

class Teacher extends Person {
    @Override
    public void speak() {
        System.out.println("The teacher is giving a lecture");
    }
}
