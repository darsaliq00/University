class Animal{
    void sound(){
        System.out.println("making shound");
    }    
}

class Mammal extends Animal{
    void birth(){
        System.out.println("birth");
    }
}

class Dog extends Mammal{
    void sound(){
        System.out.println("barking");
    }
}


public class override2{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.birth();

    }
}

