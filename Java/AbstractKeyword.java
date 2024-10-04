abstract class One{
    abstract void display();
    void show(){
        System.out.println("Base One");
    }
}

class two extends One{
    void display(){
        System.out.println("Implemented One in Two");
    }
}
public class AbstractKeyword {
    public static void main(String[] args) {
        One t = new two();
        t.display();
        t.show();
    }
}
