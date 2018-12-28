public class Main {

    public static void main(String[] args) {
        String smallText = "tammu";

        for (int row = 0; row < 5; row++) {
            for (int i = 0; i < smallText.length(); i++) {
                if (Tahed.getAlphabet().containsKey(smallText.charAt(i))) {
                    String symbol[] = Tahed.getAlphabet().get(smallText.charAt(i));
                    System.out.print(symbol[row]);
                }
            }
            System.out.println();
        }

    }
}
