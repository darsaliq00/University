class Student{
    public int x = 10;
    protected int y = 20;
    private int z = 30;
    int p = 22;
}

public class AccessModifiers {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.x);
        System.out.println(s.y);
        // System.out.println(s.z);
        System.out.println(s.p);
    }
}
