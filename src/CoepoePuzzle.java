import java.util.Scanner;

/**
 * CoepoePuzzle
 */
public class CoepoePuzzle {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Level1 level1 = new Level1();

        while(true) {
            showRules();

            // level 1
            int scoreLevel1 = level1.playLevel1();
            if (!checkScore(scoreLevel1)) {
                String answer = input.next();
                if (checkPlayAgain(answer)) {
                    continue;
                } else {
                    break;
                }
            }

            System.out.println("\nLevel 2");
        }

        input.close();
    }

    private static void showRules() {
        System.out.println("Coepoe Word Puzzle");
        System.out.println("=================");
        System.out.println("Rules :");
        System.out.println("1. Susun sebuah kata dalam bahasa Inggris dengan menggunakan huruf - huruf yang diberikan, setiap kata yang disusun harus memiliki banyak karakter minimal 3 karakter dan maksimal 6 karakter.");
        System.out.println("2. Setiap levelnya, user diberi 10 kesempatan untuk menyusun kata dengan benar.");
        System.out.println("3. Setiap jawaban yang benar akan diberikan skor 10.");
        System.out.println("4. Untuk dapat melanjutkan ke level berikutnya, user harus mencapai skor minimal 70 setiap levelnya.");
        System.out.println("5. User tidak dapat menginput kata yang sama.");
        System.out.println("\n");
    }

    private static boolean checkScore(int score) {
        if (score < 70) {
            System.out.println("You Lose!! Try Again..");
            System.out.print("Do you want to play again? (Y/T) : ");
            return false;
        }

        return true;
    }

    private static boolean checkPlayAgain(String answer) {
        return answer.toLowerCase().equals("y");
    }
}