public class Main {

    public static void main(String[] args) {
        int tableSize = 10;
        for (int row = 0; row < tableSize; row++) {
            for (int col = 0; col < tableSize; col++) {
                if(col > row){
                    System.out.format("%2d", tableSize - 1 - col);
                } else {
                    System.out.format("%2d", tableSize - 1 - row);
                }
            }
            System.out.println();
        }
    }
}
