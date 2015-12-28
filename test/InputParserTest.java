import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class InputParserTest {

    @Test
    public void shouldParseTheInputAndConvertIntoItemObjectForm() {
        InputParser parser = new InputParser();
        Item item = parser.parseInput("1 musicCD at 14.99");
        assertTrue(item instanceof  Item);
       // assertEquals(item,new Item(1, "MusicCd",14.99,false,false));
    }
}
