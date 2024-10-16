package interface_abstract_test;

public class AbstractClassTest {
    public static void main(String[] args) {
        Dog dog = new Dog(5); // 나이가 5살인 강아지 생성
        Rabbit rabbit = new Rabbit(3); //나이가 3살인 토끼 생성
        dog.move();
        rabbit.move();
        dog.sound();
        rabbit.sound();
        dog.eat();
        rabbit.eat();
        dog.getAge();
        rabbit.getAge();
    }
}
