import classes.Cat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        FIRST EX

        Cat cat = new Cat("Kot", "Black", 2);
        cat.setName("Fenya");
        System.out.println("Name: " + cat.getName());
        System.out.println("Color: " + cat.getColor());
        System.out.println("Age: " + cat.getAge());
        cat.sleep(); //meow or sleeping
        System.out.println(cat.say());
        System.out.println(cat.toString());

        System.out.println("-----------------------------------------------------------");

//        SECOND EX
        Cat catTwo = new Cat();
        catTwo.setName("Mrka");
        catTwo.setColor("While");
        catTwo.setAge(3);
        System.out.println("Name: " + catTwo.getName());
        System.out.println("Color: " + catTwo.getColor());
        System.out.println("Age: " + catTwo.getAge());
//        catTwo.sleep(); //meow or sleeping
        System.out.println(catTwo.say());
        System.out.println(catTwo.toString());

        System.out.println("-----------------------------------------------------------");
        Cat catThree = new Cat();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите Имя Вашего Котенка:");
        catThree.setName(in.next());
        System.out.print("Введите Цвет:)");
        catThree.setColor(in.next());
        System.out.print("Введите Возраст:");
        catThree.setAge(in.nextInt());

        System.out.println("-----------------------------------------------------------");
        System.out.println("Name: " + catThree.getName());
        System.out.println("Color: " + catThree.getColor());
        System.out.println("Age: " + catThree.getAge());
    }
}
