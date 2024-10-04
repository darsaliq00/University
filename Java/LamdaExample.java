import java.util.*;

interface inter{
    public void getDetails();
}



public class LamdaExample {
    public static void main(String[] args) {
        inter b = () -> {
            System.out.println("Get Details");
        };
        
        b.getDetails();
    }
}
