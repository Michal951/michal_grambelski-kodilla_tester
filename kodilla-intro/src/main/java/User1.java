public class User1 {
    static String name = "Adam";
    static double age = 40.5;
    static double height = 178;

    public User1(String name, double age, double height) {

        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void showInfo() {
        if (name != null) {
        if (age < 30 && height > 160) {
            System.out.println("User is older than 30 and higher than 160 cm");
        }   else
                System.out.println(" User is 30(or younger) or 160cm(or shorter) ");
            }
        }
    }

