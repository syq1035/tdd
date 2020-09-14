import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {

    @Test
    public void should_return_itself_when_the_number_of_vowels_are_less_than_30_percent() {
        Mommifier mommifier = new Mommifier();
        String str = "keepplayballlll";
        String expect = "keepplayballlll";

        assertEquals(expect, mommifier.convert(str));
    }
    
}
