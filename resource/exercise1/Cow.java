package exercise1;

public class Cow implements Animal{
    @Override
    public void eat() {
        System.out.println("Cow eats grass.");
    }

    @Override
    public void sound() {
        System.out.println("cow moo");
    }
}
