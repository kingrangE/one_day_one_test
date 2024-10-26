package design_pattern.templete_method.templete;

public class CSVDataClass extends DataClass {
    @Override
    public void dataLoad(){
        System.out.println("CSV 데이터를 읽어옵니다.");
    }
    @Override
    public void dataProcess(){
        System.out.println("CSV 데이터를 처리합니다.");
    }

}
