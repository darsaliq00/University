import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try{
            FileReader f = new FileReader("First.txt");
            int i; 
            while ( (i = f.read()) != -1){
                System.out.print((char) i);
            }
            f.close();

        }catch(IOException e){
            System.out.println("Error while Reading File");
            e.toString();
        }
    }
}
