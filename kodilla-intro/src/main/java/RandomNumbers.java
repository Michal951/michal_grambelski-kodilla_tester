import java.util.Random;

public class RandomNumbers {
    static int max = 0;
    static int min = 30;

    public static void main(String[] args) {
        int sum = 0;

        Random random = new Random();

        while (sum < 5000) {
            int temp = 0;

            temp = random.nextInt(31);
            sum += temp;
            System.out.println(temp);
            System.out.println(sum);
        }
    }
        static int getMax ( int number){
            if (number > max) {
                max = number;
            }
            return max;
        }

        static int getMin ( int number){
            if (number < min) {
                min = number;
            }
            return min;
        }
    }