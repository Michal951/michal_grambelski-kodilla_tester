package exercises;

import java.util.Scanner;

public class ExerciseNumberOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaki jest twój ulubiony musical?");
        String answer = scanner.nextLine();
        System.out.println("A twój drugi uluiony musical?");
        String secondAnswer = scanner.nextLine();
        System.out.println("A lepszy w roli Valjeana jest Alfie Boe czy Hugh Jackman?");
        String thirdAnswer = scanner.nextLine();
        System.out.println(" I tak wszyscy wiemy, że Lin Manuel Miranda byłby najlepszy w tej roli. Żegnam.");
    }
}



