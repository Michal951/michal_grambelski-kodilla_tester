package exercises;

public class User {
  int age;
  String name;

  public User(String name, int age){
      this.age = age;
      this.name = name;
  }

    public int getAge() {
        return age;
    }

    public String getName(){
      return name;
    }
}