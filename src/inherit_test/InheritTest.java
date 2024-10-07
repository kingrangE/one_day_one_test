package inherit_test;

public class InheritTest {
    public static void main(String[] args) {
        System.out.println("* 생성자 호출 테스트 *");
        Person person = new Person();
        System.out.println("-------------------");
        Student student = new Student("길원",25,200118);
        System.out.println("-------------------");
        Researcher researcher = new Researcher("길원",25,200118);
        System.out.println("-------------------");
        Professor professor = new Professor("길원",25,20011832,200118);

        System.out.println("UpCasting");
        Person studentToPerson;
        studentToPerson = student;
        System.out.println(studentToPerson.name + studentToPerson.age);
        studentToPerson.name = "전길원";
        studentToPerson.age = 20;
        System.out.println(student.name+student.age);

        System.out.println("DownCasting");
        Professor researcherToProf;
        researcherToProf = (Professor) researcher;
        System.out.println(researcherToProf.name + researcherToProf.age+researcherToProf.researchId);

    }
}

class Person{
    String name;
    int age;
    Person(){
        System.out.println("Person Default");
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Student extends Person{
    int studentId;
    Student(String name, int age,int studentId) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        System.out.println("Student Default");
    }
}
class Researcher extends Person{
    int researchId;
    Researcher() {
        System.out.println("Researcher Default");
    }
    Researcher(String name, int age,int researchId) {
        this.name = name;
        this.age = age;
        this.researchId = researchId;
        System.out.println("Researcher Constructor");
    }
}
class Professor extends Researcher {
    int profId;
    Professor(String name, int age,int researchId,int profId) {
        this.name = name;
        this.age = age;
        this.researchId = researchId;
        this.profId = profId;
        System.out.println("Professor Constructor");
    }
}