import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

public class InputReader1 {
    private BufferedReader bufferedReader;

    public InputReader1(BufferedReader bufferedReader) {

        this.bufferedReader = bufferedReader;
    }


    public String readInputData() {
        String inputLine = null;
        try {
            inputLine = bufferedReader.readLine();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return inputLine;
    }
}
