import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Stelle mir eine Ja/Nein-Frage:");
        String question = scanner.nextLine();

        System.out.println("Hmm... mal sehen...");
        String[] answers = {"Ja!", "Nein!", "Vielleicht?", "Auf keinen Fall!", "Frag mich nicht sowas!"};
        String answer = answers[new Random().nextInt(answers.length)];

        System.out.println("Die Antwort lautet: " + answer);
        System.out.println("Ob das jetzt wirklich stimmt? Tja, wer weiß...");
        }
    }
}