public class User {
    String name;
    int age;
    public User(String name, int age ) {
        this.name= name;
        this.age = age;
        User justyna = new User("Justyna", 18);
        User ewelina = new User("Ewelina", 23);
        User marcin = new User("Marcin", 29);
        User adrian = new User("Adrian", 15);
        User karolina = new User("Karolina", 35);
        User michal = new User("Michal", 50);
        User[] user = {justyna, ewelina, marcin, adrian, karolina, michal};
    }
        public int getAge() {
            return age;
        }
        public String getName() {
            return name;
    }

    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i< age.lenght; i++) {
            result = result + age[i];
            return result;
            System.out.println(i);
        }
    }
}