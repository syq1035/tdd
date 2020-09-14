import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mommifier {
    private List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");

    public String convert(String str) {
        if (getVowelsCount(str) < (0.3 * str.length())) {
            return str;
        }

        String repeatStr = "";
        for (int index = 0; index < str.length(); index++) {
            if (vowels.contains(String.valueOf(str.charAt(index)))){
                if (String.valueOf(str.charAt(index)).equals(repeatStr)){
                    return convert(str.substring(0, index) + "mommy" + str.substring(index));
                }
            }
            repeatStr = String.valueOf(str.charAt(index));
        }
        return str;
    }

    public int getVowelsCount(String str) {
        int vowelsCount = 0;
        for (int index = 0; index < str.length(); index++) {
            if (vowels.contains(String.valueOf(str.charAt(index)))){
                vowelsCount ++;
            }
        }

        return vowelsCount;
    }
}
