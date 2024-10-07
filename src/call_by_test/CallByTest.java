package call_by_test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class CallByTest {
    enum Grade {A,B,C,D};
    public static void main(String[] args) {
        int main_num = 0;
        Grade mainGrade = Grade.A;
        int[] main_arr = new int[5];
        human kilwon = new human(20001014,"kilwon",25);
        Integer wrapper_num = 0;
        String str = "";
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);

        System.out.println("int 타입 선언한 변수를 전달");
        CallByValue.increaseNum(main_num);
        System.out.println(main_num+" (in main)\n");

        System.out.println("int[] 타입 선언한 배열 레퍼런스를 전달");
        CallByRef.increaseNumArr(main_arr);
        System.out.println(Arrays.toString(main_arr) +  " (in main)\n");

        System.out.println("int[] 할당된 배열의 1번 인덱스 값을 전달");
        CallByValue.increaseNum(main_arr[1]);
        System.out.println(main_arr[1] + " (in main)\n");

        System.out.println("문자열을 테스트");
        CallByValue.addString(str);
        System.out.println(str + " (in main)\n");

        System.out.println("Wrapper Class 테스트");
        CallByValue.increaseWrapper(wrapper_num);
        System.out.println(wrapper_num +  " (in main)\n");

        System.out.println("Enum 테스트");
        CallByValue.changeGrade(mainGrade);
        System.out.println(mainGrade + " (in main)\n");

        System.out.println("Map 테스트");
        CallByRef.removeA(map);
        System.out.println(map + " (in main)\n");

        System.out.println("클래스 테스트");
        CallByRef.nextYear(kilwon);
        System.out.println(kilwon.age + " (in main)\n");
    }
}

class human{
    int id;
    String name;
    int age;
    human(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

class CallByValue{
    static void increaseNum(int num){
        num++;
        System.out.println(num+" (in method)");
    }
    static void addString(String str){
        str += "hi kilwon";
        System.out.println(str + " (in method)");
    }
    static void increaseWrapper(Integer wrapper_num){
        wrapper_num++;
        System.out.println(wrapper_num +" (in method)");
    }
    static void changeGrade(CallByTest.Grade grade){
        grade = CallByTest.Grade.B;
        System.out.println(grade + " (in method)");
    }

}

class CallByRef{
    static void increaseNumArr(int[] num){
        for(int i=0;i<num.length;i++){
            num[i] = i+1;
        }
        System.out.println(Arrays.toString(num) + " (in method)");
    }
    static void removeA(Map<String,Integer> map){
        map.remove("A");
        System.out.println(map + " (in method)");
    }
    static void nextYear(human kilwon){
        kilwon.age++;
        System.out.println(kilwon.age + " (in method)");
    }
}