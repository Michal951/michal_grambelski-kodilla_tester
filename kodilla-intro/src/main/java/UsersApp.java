public class UsersApp {
    public static void main(String[] args) {
        User justyna = new User("Justyna", 18);
        User ewelina = new User("Ewelina", 23);
        User marcin = new User("Marcin", 29);
        User adrian = new User("Adrian", 15);
        User karolina = new User("Karolina", 35);
        User michal = new User("Michal", 50);

        User[] users = {justyna, ewelina, marcin, adrian, karolina, michal};
        int numberOfElements = users.length;
        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
            // result += users[i].age;
            System.out.println(i);
        }
        System.out.println("result " + result);

        double average = result / users.length;

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < average) {
                System.out.println(users[i].name);
                System.out.println(users[i].age);
            }
        }
    }
}