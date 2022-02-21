public class Loops {
    public static void main(String[] args) {
        String[] names = new String[]{"Geralt", "Jaskier", "Milva", "Regis", "Cahir", "Angouleme"};
        int numberOfElements = names.length;
    }

    public int sumNumbers(String[] names) {
        int result = 0;
        for (int i = 0; i < names.length; i++) {
            result = result + names.length;
        }
        return result;
    }
}



