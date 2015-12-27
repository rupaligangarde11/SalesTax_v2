import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

import static junit.framework.TestCase.assertEquals;

public class InputReader1Test {
    @Test
    public void shouldReadInputGivenByUser() throws Exception {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("1 music CD at 14.99".getBytes());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream));
        InputReader1 inputReader = new InputReader1(bufferedReader);
        String input = inputReader.readInputData();
        assertEquals("1 music CD at 14.99",input);
    }
}
