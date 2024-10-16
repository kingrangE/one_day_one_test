package interface_abstract_test.Interface;

public class SmartPhone implements Phone,MusicPlayer {
        //Interface는 메서드를 강제할 때 사용합니다.
        //Interface에 선언된 추상메서드는 구현이 반드시 필요합니다. -> Override하지 않으면 에러가 발생합니다.

    public void search(String question){
        System.out.println(question+" 검색 중");
    }

    @Override
    public void musicStart() {
        System.out.println("음악 재생 시작");
    }

    @Override
    public void musicStop() {
        System.out.println("음악 재생 종료");
    }

    @Override
    public void sendCall() {
        System.out.println("전화 발신 중");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화 수신 중");
    }
}
