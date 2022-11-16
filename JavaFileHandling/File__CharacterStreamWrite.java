package JavaFileHandling;
import java.io.*;

class FileClass{
    String path = "./test1.txt";
    File file = new File(path);
    public void Create(){
        try{
            FileWriter fw = new FileWriter(file);
            fw.write("First Line of File");
            fw.write("Second Line of File");
            fw.close();
            System.out.println("File created at path: "+file.getAbsolutePath());
        }
        catch(Exception E){}
    }
}
public class File__CharacterStreamWrite{
    public static void main(String [] args){
        FileClass fc = new FileClass();
        fc.Create();
    }
}