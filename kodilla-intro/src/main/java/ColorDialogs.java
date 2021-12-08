import java.util.Scanner;
public class ColorDialogs {
    public static String getColorSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose letter (Y, W, B, R):");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color) {
                case "Y": return "Yellow";
                case "W": return "White";
                case "B": return "Black";
                case "R": return "Red";
            }
        }
    }
}