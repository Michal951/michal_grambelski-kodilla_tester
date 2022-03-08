package exercises;

public class UserApp {
    public static void main(String[] args) {
        User Hamilton = new User("Alexander", 23);
        User Vader = new User("Vader", 69);
        User Spock = new User("Spock", 65);
        User Doctor = new User("Doctor", 35);
        User Blues = new User("Blues", 99);
        User Wokulski = new User("Wokulski", 42);

        User[] users = {Hamilton, Vader, Spock, Doctor, Blues, Wokulski};
        int result = 0;
        int numberOfElements = users.length;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
            System.out.println(i);
        }
        System.out.println(result + " result");
        double average = result / users.length;
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < average) ;
            System.out.println(users[i].name + users[i].age +  " Tam jest! ");

        }
    }
}