package java_docs_test;

/**
 * JavaDocs를 연습하는 클래스입니다.
 * @author 전길원
 * @version 1.0
 */
public class JavaDocs {

    /**
     * Student 정보 관리 Class
     */
    static class Student{
        /**
         * 학생 이름
         */
        private String name;
        /**
         * 학생 나이
         */
        private int age;

        /**
         * 학생의 이름과 나이를 이용하여 정보를 설정합니다.
         *
         * @param name 학생의 이름
         * @param age 학생의 나이
         */
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        /**
         * 학생의 이름을 반환합니다.
         *
         * @return 학생의 이름
         */
        public String getName() {
            return name;
        }

        /**
         * setNameVer1 메서드 대신 setNameVer2 메서드로 변경되었습니다.
         *
         * @deprecated setNameVer2 메서드 사용하십시오.
         * @param name
         */
        public void setNameVer1(String name) {
            // 더 이상 사용하지 않는 메소드
            this.name = name;
        }

        /**
         * 김씨를 제외하고 이름 설정이 가능한 메서드
         *
         * @param name 학생의 이름
         * @see Student#getName() 학생 이름 반환 메서드
         * @throws IllegalArgumentException 이름이 김씨인 경우 예외가 발생합니다.
         */
        public void setNameVer2(String name) {
            if(name.startsWith("김")){
                throw new IllegalArgumentException("김씨는 등록할 수 없습니다.");
            }
            this.name = name;
        }

        /**
         * <p>이 메서드는 개명한 이름을 입력받아 기존의 이름을 지우고 새로 저장하는 메서드입니다. </p>
         * <p> 사용 예제 </p>
         * <pre>
         *     Student student = new Student("전길원",25);
         *     student.updateName("점심원");
         *     student.getName(); // 출력 결과 : 점심원
         * </pre>
         */
        public void updateName(String name){
            this.name = name;
        }
    }
}
