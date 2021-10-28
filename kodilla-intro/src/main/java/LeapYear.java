public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;
        int number1 = 4;
        int number2 = 100;
        int number3 = 400;
        if (year%number1==0 && year%number2!=0 || year%number3==0) {
            System.out.println("rok jest przestępny");
        } else {
            System.out.println("rok nie jest przestępny");
        }
    }
}