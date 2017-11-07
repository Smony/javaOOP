package classes;

public class Cat {

    private String name;
    private String color;
    private int age;

    private boolean sleep;

    public Cat(String name, String color, int age)
    {
        this.name = name;
        this.color = color;
        this.age = age;

        this.sleep = false;
    }

    public Cat()
    {

    }

    public String say()
    {
        if (!sleep)
        {
            return "MEOW!!!!!!!!!!!!!!";
        } else  {
            return "SLEEPING..(((";
        }
    }

    public void sleep() {
        sleep = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Cat{" + "color = '" + color + '\'' + ", name = '" + name + '\'' + ", age = " + age + '}';
    }
}
