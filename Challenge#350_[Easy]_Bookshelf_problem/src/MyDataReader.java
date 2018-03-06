import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Minde on 2018.03.06.
 */
public class MyDataReader {
    private static final String data = "data.txt";
    private static String firstLine = null;
    private static String[] bookShelfLength = null;
    private static int[] bookShelfLengthInt = null;

    public void read(){
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(data);
            bufferedReader = new BufferedReader(fileReader);
            firstLine = bufferedReader.readLine();
            bookShelfLength=firstLine.split(" ");
            bookShelfLengthInt = new int[bookShelfLength.length];
            for (int i= 0; bookShelfLength.length>i;i++){
                bookShelfLengthInt[i]=Integer.valueOf(bookShelfLength[i]);
                System.out.println(bookShelfLengthInt[i]);
            }
        }
        catch (IOException ex){
            System.out.println("klaida "+ ex);
        }
    }

}
