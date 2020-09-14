import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mommifier {
    private List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");

    public String convert(String str) {
        if(getVowelsCount(str) < (0.3 * str.length())) {
            return str;
        }
        return null;
    }

    public int getVowelsCount(String str) {
        int vowelsCount = 0;
        for (int index = 0; index < str.length(); index++) {
            if(vowels.contains(String.valueOf(str.charAt(index)))){
                vowelsCount ++;
            }
        }
        return vowelsCount;
    }
}
