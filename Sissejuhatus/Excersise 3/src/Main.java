import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sisesta üks arv: ");
        Scanner scanner = new Scanner(System.in);
        String sisend = scanner.nextLine();

        int summa = 0;
        for (int i = 0; i < sisend.length();i++){
            char symbol = sisend.charAt(i);
            summa = summa + Integer.parseInt(String.valueOf(symbol));
        }
        System.out.println("Arvu " + sisend + " numbrite summa on " + summa);
    }
}