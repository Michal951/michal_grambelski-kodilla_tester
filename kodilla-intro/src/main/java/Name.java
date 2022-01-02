import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek");

        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Możesz legalnie kupić piwo");
        } else {
            System.out.println("Nie możesz legalnie kupić piwa.");
        }
    }
}