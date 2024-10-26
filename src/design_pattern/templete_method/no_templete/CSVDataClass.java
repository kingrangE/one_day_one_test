package design_pattern.templete_method.no_templete;

class CSVDataClass {
    public void dataLoad(){
        System.out.println("CSV 파일을 읽어옵니다.");
    }
    public void dataProcess(){
        System.out.println("CSV 파일을 처리합니다.");
    }
    public void dataSave(){
        System.out.println("보고서를 저장합니다.");
    }
}
