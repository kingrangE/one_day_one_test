package design_pattern.templete_method.templete;

class JPGDataClass extends DataClass {
    @Override
    public void dataLoad(){
        System.out.println("JPG 데이터를 읽어옵니다.");
    }
    @Override
    public void dataProcess(){
        System.out.println("JPG 데이터를 처리합니다.");
    }
}

