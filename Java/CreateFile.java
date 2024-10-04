import java.util.*;
import java.io.*;

public class CreateFile {
    public static void main(String[] args) {
        try{
            File f = new File("First.txt");
            if(f.createNewFile()){
                System.out.println("File Created!: " + f.getName());
            }else{
                System.out.println("File Not Created!");
            }
        }catch(IOException e){
            System.out.println("Error Occured!");
            e.toString();
        }
    }
}
