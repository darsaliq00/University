import java.io.*;

public class DeleteFIle {
    public static void main(String[] args) {
        try{
            File f = new File("First.txt");
            if(f.delete()){
                System.out.println("File Deleted!");  
            }else{
                System.out.println("File Not Deleted");
            }
        }catch(Exception e){
            System.out.println("Error Deleting FIle");
            e.toString();
        }
    }
}
