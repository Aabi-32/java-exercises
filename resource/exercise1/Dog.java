package exercise1;

public class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("Dog eats bone.");
    }

    @Override
    public void sound() {
        System.out.println("Dog barks.!");
    }
}
