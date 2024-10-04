final class Example{
    final String s = "hellow";
    void print(){
        System.out.println(s);
    }
}


public class FinalExample {
    public static void main(String[] args) {
        Example e = new Example();
        e.s = "world";
        e.print();
    }
}
