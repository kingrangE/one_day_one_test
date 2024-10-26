package design_pattern.templete_method.templete;

abstract class DataClass {
    public void process(){
        dataLoad();
        dataProcess();
        dataSave();
    }
    public abstract void dataLoad();
    public abstract void dataProcess();
    public void dataSave(){
        System.out.println("보고서를 저장합니다.");
    }
}
