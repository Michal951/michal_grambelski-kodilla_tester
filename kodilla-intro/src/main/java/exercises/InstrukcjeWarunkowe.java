package exercises;

import java.util.Scanner;

public class InstrukcjeWarunkowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PODAJ MI SWOJ WIEK NEDZNA KREATURO");
        int age = scanner.nextInt();

        if (age > 0 && age <= 3) {
            System.out.println("TELETUBISIE IDA SPAC");
        } else if (age >= 6 && age < 18) {
            System.out.println("LEKCJE SAMA SIE NIE ZROBIA!");
        } else if (age >= 18 && age <= 27) {
            System.out.println("SESJA SAMA SIE NIE ZDA CO?");
        } else if (age >= 4 && age < 6) {
            System.out.println("ARE YOU AFRAID OF THE DARK?");
        } else {
            System.out.println("JUTRO NA 8 DO 20 HAHAHAHAHAHA");
        }
    }
}