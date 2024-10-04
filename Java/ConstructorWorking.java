

class ABC{
    int number;
    String  input;

    ABC(){
        number = 10;
        input = "Hello";
    }

    void display(){
        System.out.println("Number: " + number + "\nMessage: " + input);
    }
}
public class ConstructorWorking {
    public static void main(String[] args) {
        ABC obj = new ABC();
        obj.display();
    }
}
