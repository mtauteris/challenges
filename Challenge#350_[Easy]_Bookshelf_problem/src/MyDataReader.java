import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Minde on 2018.03.06.
 */
public class MyDataReader {
    private static final String data = "data.txt";
    private static String firstLine = null;
    public void read(){
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(data);
            bufferedReader = new BufferedReader(fileReader);

            firstLine = bufferedReader.readLine();
            System.out.println(firstLine);
        }
        catch (IOException ex){
            System.out.println("klaida "+ ex);
        }
    }

}
