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

    @Test
    public void should_return_mommifier_when_the_string_is_continuous_set_of_vowels_and_the_number_of_vowels_are_less_than_30_percent() {
        Mommifier mommifier = new Mommifier();

        assertEquals("kemommyep", mommifier.convert("keep"));
        assertEquals("kemommyemommyep", mommifier.convert("keeep"));
    }

    @Test
    public void should_return_itself_when_the_string_is_not_continuous_set_of_vowels() {
        Mommifier mommifier = new Mommifier();
        String str = "apple";
        String expect = "apple";
        assertEquals(expect, mommifier.convert(str));
    }
}
