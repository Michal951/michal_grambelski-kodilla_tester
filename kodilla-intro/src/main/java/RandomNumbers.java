public class RandomNumbers {
    public int getCountOfRandomNumber(int max) {
        RandomNumbers random = new RandomNumbers();
        int result = 30;
        int sum = 0;
        while (sum > max) {
            int temp = random.int();
            sum = sum + temp;
            result++;
        }
        return result;
        }
}










