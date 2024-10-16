package interface_abstract_test;

public class pigeon extends Animal implements Flyable {

    public pigeon(int age) {
        super(age);
    }

    @Override
    public void fly() {
        System.out.println("펄럭펄럭");
    }

    @Override
    public void sound() {
        System.out.println("구구구구");
    }

    @Override
    public void move() {
        System.out.println("슈우우웅");
    }
}
