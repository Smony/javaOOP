import classes.Cat;

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
    }
}
