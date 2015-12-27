import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InputParserTest {

    @Test
    public void shouldParseTheInputAndConvertIntoItemObjectForm() {
        InputParser parser = new InputParser();
        Item item = parser.parseInput("1 musicCD at 14.99");
        assertEquals(item,new Item("MusicCd",14.99,false,true));
    }


}
