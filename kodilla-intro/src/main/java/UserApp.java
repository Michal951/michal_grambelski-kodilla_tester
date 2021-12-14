public class UserApp {
    static String name;
    static double age;
    static double height;

    public UserApp(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void showInfo(UserApp user) {
        if (user.name != null) {
            if (user.age > 30 && user.height > 160) {
                System.out.println("User is older than 30 and higher than 160 cm");
            } else
                System.out.println(" User is 30(or younger) or 160cm(or shorter) ");
        }
    }
}