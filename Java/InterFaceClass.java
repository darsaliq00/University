import javax.xml.crypto.Data;

interface DataAccess{
    void saveData(String data);
    String retrieveData();
}

class DataBase_Access implements DataAccess{
    public void saveData(String data){
        System.out.println("Saved : " + data);
    }

    public String retrieveData(){
        return "Data Recieved";
    }
}

public class InterFaceClass {
    public static void main(String[] args) {
        DataAccess d = new DataBase_Access();
        d.saveData("Hello");
        System.out.println(d.retrieveData());
    }
    
}
