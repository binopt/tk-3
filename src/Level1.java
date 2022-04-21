import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Level1 {
    static String[] answers = {
        "die",
        "led",
        "lei",
        "let",
        "lid",
        "lie",
        "lit",
        "tie",
        "deli",
        "diet",
        "edit",
        "idle",
        "lied",
        "tide",
        "tied",
        "tile",
        "tilt",
        "tilde",
        "tiled",
        "title",
        "tilted",
        "titled",
    };

    public int playLevel1() {
        int score = 0;
        int count = 0;
        ArrayList<String> typedWords = new ArrayList<String>(); 
        Scanner input = new Scanner(System.in);

        System.out.println("Level 1");
        System.out.println("--------");
        System.out.println("     d     e     t     t     l     i     ");

        for (int i = 1; i <= 10;) {
            System.out.print(i +  "> Your Answer : ");
            String answer = input.next();

            if (Arrays.stream(answers).anyMatch(answer::contains)) {
                if (typedWords.contains(answer)) {
                    System.out.println("You had already type this word before!");
                    continue;
                }
                score += 10;
                typedWords.add(answer);
                System.out.println("#Right. Score : " + score);
                count += 1;
                i++;
            } else {
                System.out.println("#Wrong. Score : " + score);
                i++;
            }
        }
        
        showSummary(count);
        return score;
    }

    private void showSummary(int count) {
        System.out.println("You had answerd 10 times with " + count + " right answers..");
        System.out.println("Correct answers : ");
        for (String answer : answers) {
            System.out.print(answer + " ");
        }
    }
}
