public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void translate() {
        System.out.println("Человеческий возраст собаки: " + 7*age);
    }

    public String toString() {
        return "Имя собаки: " + name +" Возраст собаки: "+ age +" \"Человеческий\" возраст собаки: " + 7*age;
    }
}
