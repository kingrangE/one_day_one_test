package wrapper_test;

import java.util.ArrayList;

public class WrapperTest {
    public static void main(String[] args) {
        //선언 시, Auto Boxing 덕분에 아래와 같이 작성하지 않습니다.
        // Integer num = new Integer(10);
        Integer wrapper = 999; // 자동 박싱 ( R-value의 기본 자료형 값을 자동으로 객체로 변환 )
        int primitive = wrapper; // 자동 unboxing ( R-value의 객체를 자동으로 기본 자료형으로 변환 )

        Integer wrapper2 = Integer.valueOf(999);

        System.out.println(wrapper2 == primitive);
        System.out.println(wrapper == wrapper2);

    }
}
