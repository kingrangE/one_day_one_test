package mutable_imutable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MutableTest {
    public static void main(String[] args) throws ParseException {

        //예시 1. ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);

        System.out.println("수정 전 : "+arrayList);
        arrayList.set(1, 999);
        System.out.println("수정 후 : "+arrayList);

        //예시 2. StringBuilder
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append('h');
        stringBuilder.append('i');

        System.out.println("수정 전 : "+stringBuilder);
        stringBuilder.append("my name is kilwon");
        System.out.println("수정 후 : "+stringBuilder);

        //예시 3. Date
        Date date = new Date();
        System.out.println("수정 전 : "+date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, 5); //5일로 변경
        date.setTime(calendar.getTimeInMillis());
        System.out.println("수정 후 : "+date);

        //예시4. 사용자 정의 객체
        CustomMutable customMutable = new CustomMutable(5);
        System.out.println("수정 전 : "+customMutable.getNumber());
        customMutable.setNumber(1);
        System.out.println("수정 후 : "+customMutable.getNumber());

    }
}

class CustomMutable{
    private int number;

    public CustomMutable(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}