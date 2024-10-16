package interface_abstract_test;

public class Rabbit extends Animal {
    public Rabbit(int age) {
        super(age);
    }
    @Override
    public void sound() {
        System.out.println("토끼끼");
    }

    @Override
    public void move() {
        System.out.println("깡총");
    }

}
