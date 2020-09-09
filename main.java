import java.util.Scanner;

public class main {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите имя собаки: ");
        String name = s.nextLine();
        System.out.println("Введите возраст собаки: ");
        int age = s.nextInt();
        Dog d = new Dog(name, age);
        boolean flag = true;
        while (flag) {
            System.out.println("Варианты: 1 - изменить имя; 2 - изменить возраст; 3 - показать возраст собаки на \"Человеческом\"; 4 - показать описание собаки; 5 - показать имя собаки; 6 - показать возраст собаки; 7 - закончить работу.");
            int i = s.nextInt();
            switch (i){
                case 1:
                {
                    d.setName(name = s.next());
                    break;
                }
                case 2:
                {
                    d.setAge(age = s.nextInt());
                    break;
                }
                case 3:
                {
                    d.translate();
                    break;
                }
                case 4:
                {
                    System.out.println(d);
                    break;
                }
                case 5:
                {
                    d.getName();
                    break;
                }
                case 6:
                {
                    d.getAge();
                    break;
                }
                case 7:
                {
                    flag = false;
                    break;
                }
            }
        }
    }
}
