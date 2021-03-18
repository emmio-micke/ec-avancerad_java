package guess;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Skriv ett tal");
            String guess = sc.nextLine();
            System.out.println("Ditt tal: " + guess);
        }
    }
}