package interface_abstract_test;

public abstract class Animal {
    /**
     * abstract class (추상 클래스)는 상속을 통한 코드 재사용성을 높이고자 할 때 사용합니다.
     */
    int age = 0;
    public abstract void sound();
    public abstract void move();
    public void eat(){
        System.out.println("냠냠");
    }
    public void sleep(){
        System.out.println("쿨쿨");
    }
    public void nextYear(){
        this.age++;
    }
    public Animal(int age){
        this.age = age;
    }
    public void getAge(){
        System.out.println(this.age);
    }
}
