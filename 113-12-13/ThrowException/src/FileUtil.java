import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileUtil {
    public  static  String read(String name) throws IOException{
        StringBuilder text = new StringBuilder();
        try{
            Scanner reader = new Scanner(new FilterInputStream(name));
            while(reader.hasNext()){
                text.append(reader.nextLine()).append("\n");

            }
        }catch (IOException e){
            throw  e;
        }
        return text.toString();
    }
}
