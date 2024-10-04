interface BaseOne {
    public void display();
}

interface BaseTwo{
    public void show();
}

class Three implements BaseOne, BaseTwo{
    public void display(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("World");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        Three t = new Three();
        t.display();
        t.show();
    }
}
