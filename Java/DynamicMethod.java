class Student{
    void doGreet(){
        System.out.println("Hello, Student");
    }
}

class HeadStudent extends Student{
    void doGreet(){
        System.out.println("Hello, Head Student");
    }
}

public class DynamicMethod {
    public static void main(String[] args) {
        Student s = new Student();
        s.doGreet();
        HeadStudent hs = new HeadStudent();
        hs.doGreet();

        Student t = new HeadStudent();
        t.doGreet();
    }
}
