package session5;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.color = "red";
        a.eatMeat();

        Tiger t = new Tiger();
        t.color = "orange";
        t.eatMeat();
        t.run();
        t.eatMeat();
        t.eatMeat("Hello");
        t.eatMeat("abc", 15);

        Cat c = new Cat();
        c.run();
    }
}
