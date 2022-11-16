package JavaFileHandling;
import java.io.*;
public class File__CharacterStreamRead {

    String path = "./test1.txt";
    File file = new File(path);
    public void ReadFile(){
        try{
            FileReader fr = new FileReader(file);
            BufferedReader bfr = new BufferedReader(fr);
            String str = "";
            while((str = bfr.readLine())!=null){
                System.out.println(str);
            }

        }
        catch(Exception e){}
    }
    public static void main(String [] args){
        File__CharacterStreamRead fc = new File__CharacterStreamRead();
        fc.ReadFile();
    }
}
