package interface_abstract_test;

public class Dog extends Animal {
    public Dog(int age){
        super(age);
    }
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
    @Override
    public void move() {
        System.out.println("저벅저벅");
    }
}

