import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        int rows = 6;
        System.out.println("Triangle outlook:");
        for (int h = 0; h < rows; h++) {
            for (int y = 0; y < rows - h; y++) {
                System.out.print(" ");
            }
            for (int t = 0; t <= h; t++) {
                System.out.print("* ");
            }
            System.out.println();
            //
        }
        triangle.close();
    }
}