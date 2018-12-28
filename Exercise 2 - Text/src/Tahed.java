import java.util.HashMap;

public class Tahed {
    private static final HashMap<Character, String[]> alphabet = new HashMap<>();

    static {
        alphabet.put('a', new String[]{
                " ###  ",
                "#   # ",
                "##### ",
                "#   # ",
                "#   # "
        });
        alphabet.put('t', new String[]{
                "#######",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   "
        });
        alphabet.put('m', new String[]{
                "#     #",
                "##   ##",
                "# # # #",
                "#  #  #",
                "#     #"
        });
        alphabet.put('u', new String[]{
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#######"
        });
    }

    public static HashMap<Character, String[]> getAlphabet() {
        return alphabet;
    }
}
