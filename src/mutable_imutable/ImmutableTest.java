package mutable_imutable;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Optional;

public class ImmutableTest {
    public static void main(String[] args) {
        //예시 1. String
        String str = "hi";
        System.out.println("수정 전 : "+str);
        String str2 = str.replace("i","o");
        System.out.println("수정 후 : "+str);
        System.out.println("새로운 객체 : "+str2);

        //예시 2. Wrapper Class
        Long i = 0L;
        System.out.println("수정 전 : "+i);
        i = 22L;
        System.out.println("수정 후 : "+i);

        //예시 3. 큰 수 객체
        BigInteger bi = BigInteger.valueOf(-20);
        System.out.println("수정 전 : "+bi);
        BigInteger bi2 = bi.abs();
        System.out.println("수정 후 : "+bi);
        System.out.println("새로운 객체 : "+bi2);

        //예시 4. 날짜 시간 객체
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("수정 전 : " + ldt);
        LocalDateTime minus3Days = ldt.minusDays(3);
        System.out.println("수정 후 : " + ldt);
        System.out.println("새로운 객체 : "+minus3Days);

        //예시 5. Optional
        Optional<Integer> optional = Optional.of(3);
        System.out.println("수정 전 : "+optional);
        Optional<Integer> optional2 = optional.stream().max(Integer::compareTo);
        System.out.println("수정 후 : "+optional);
        System.out.println("새로운 객체 : "+optional2);

        //얘시 6. 사용자 정의 불변 객체
        CustomImmutable customImmutable = new CustomImmutable(5);
        System.out.println("수정 전 : " +customImmutable.getNumber());
        customImmutable.increaseNumber(3);
        System.out.println("수정 후 : " +customImmutable.getNumber());
    }
}
class CustomImmutable{
    private final int number;
    public CustomImmutable(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public int increaseNumber(int addNum){
        return number + addNum;
    }
}
