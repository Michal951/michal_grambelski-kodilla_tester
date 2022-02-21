package exercises;

public class CaclApp {
    public static void main(String[] args) {
        Caclculator caclculator = new Caclculator();

        int sumResult = caclculator.sum(5, 6);
        System.out.println(sumResult);

        int divideResult = caclculator.divide(12, 2);
        System.out.println(divideResult);

        int multiplyResult = caclculator.multiply(5, 5);
        System.out.println(multiplyResult);

        int subResult = caclculator.subtract(15, 10);
        System.out.println(subResult);

    }
}